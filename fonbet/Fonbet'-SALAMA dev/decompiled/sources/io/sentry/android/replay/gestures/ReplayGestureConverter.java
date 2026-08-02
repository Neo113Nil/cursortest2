package io.sentry.android.replay.gestures;

import Y4.D;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import g6.AbstractC1161j;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import io.sentry.transport.ICurrentDateProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t6.e;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ReplayGestureConverter {
    private static final int CAPTURE_MOVE_EVENT_THRESHOLD = 500;
    private static final int TOUCH_MOVE_DEBOUNCE_THRESHOLD = 50;
    private final LinkedHashMap<Integer, ArrayList<RRWebInteractionMoveEvent.Position>> currentPositions;
    private final ICurrentDateProvider dateProvider;
    private long lastCapturedMoveEvent;
    private long touchMoveBaseline;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public ReplayGestureConverter(ICurrentDateProvider iCurrentDateProvider) {
        h.e(iCurrentDateProvider, "dateProvider");
        this.dateProvider = iCurrentDateProvider;
        this.currentPositions = new LinkedHashMap<>(10);
    }

    public final List<RRWebIncrementalSnapshotEvent> convert(MotionEvent motionEvent, ScreenshotRecorderConfig screenshotRecorderConfig) {
        h.e(motionEvent, "event");
        h.e(screenshotRecorderConfig, "recorderConfig");
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
                    long j = this.lastCapturedMoveEvent;
                    if (j != 0 && j + TOUCH_MOVE_DEBOUNCE_THRESHOLD > currentTimeMillis) {
                        return null;
                    }
                    this.lastCapturedMoveEvent = currentTimeMillis;
                    Set<Integer> keySet = this.currentPositions.keySet();
                    h.d(keySet, "currentPositions.keys");
                    for (Integer num : keySet) {
                        h.d(num, "pId");
                        int findPointerIndex = motionEvent.findPointerIndex(num.intValue());
                        if (findPointerIndex != -1) {
                            if (this.touchMoveBaseline == 0) {
                                this.touchMoveBaseline = currentTimeMillis;
                            }
                            ArrayList<RRWebInteractionMoveEvent.Position> arrayList2 = this.currentPositions.get(num);
                            h.b(arrayList2);
                            RRWebInteractionMoveEvent.Position position = new RRWebInteractionMoveEvent.Position();
                            position.setX(screenshotRecorderConfig.getScaleFactorX() * motionEvent.getX(findPointerIndex));
                            position.setY(screenshotRecorderConfig.getScaleFactorY() * motionEvent.getY(findPointerIndex));
                            position.setId(0);
                            position.setTimeOffset(currentTimeMillis - this.touchMoveBaseline);
                            arrayList2.add(position);
                        }
                    }
                    long j3 = currentTimeMillis - this.touchMoveBaseline;
                    if (j3 > 500) {
                        arrayList = new ArrayList(this.currentPositions.size());
                        for (Map.Entry<Integer, ArrayList<RRWebInteractionMoveEvent.Position>> entry : this.currentPositions.entrySet()) {
                            int intValue = entry.getKey().intValue();
                            ArrayList<RRWebInteractionMoveEvent.Position> value = entry.getValue();
                            if (!value.isEmpty()) {
                                RRWebInteractionMoveEvent rRWebInteractionMoveEvent = new RRWebInteractionMoveEvent();
                                rRWebInteractionMoveEvent.setTimestamp(currentTimeMillis);
                                ArrayList arrayList3 = new ArrayList(AbstractC1161j.N0(value));
                                for (RRWebInteractionMoveEvent.Position position2 : value) {
                                    position2.setTimeOffset(position2.getTimeOffset() - j3);
                                    arrayList3.add(position2);
                                }
                                rRWebInteractionMoveEvent.setPositions(arrayList3);
                                rRWebInteractionMoveEvent.setPointerId(intValue);
                                arrayList.add(rRWebInteractionMoveEvent);
                                ArrayList<RRWebInteractionMoveEvent.Position> arrayList4 = this.currentPositions.get(Integer.valueOf(intValue));
                                h.b(arrayList4);
                                arrayList4.clear();
                            }
                        }
                        this.touchMoveBaseline = 0L;
                    }
                    return arrayList;
                }
                if (actionMasked == 3) {
                    this.currentPositions.clear();
                    RRWebInteractionEvent rRWebInteractionEvent = new RRWebInteractionEvent();
                    rRWebInteractionEvent.setTimestamp(this.dateProvider.getCurrentTimeMillis());
                    rRWebInteractionEvent.setX(screenshotRecorderConfig.getScaleFactorX() * motionEvent.getX());
                    rRWebInteractionEvent.setY(screenshotRecorderConfig.getScaleFactorY() * motionEvent.getY());
                    rRWebInteractionEvent.setId(0);
                    rRWebInteractionEvent.setPointerId(0);
                    rRWebInteractionEvent.setInteractionType(RRWebInteractionEvent.InteractionType.TouchCancel);
                    return D.D(rRWebInteractionEvent);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 == -1) {
                return null;
            }
            this.currentPositions.remove(Integer.valueOf(pointerId));
            RRWebInteractionEvent rRWebInteractionEvent2 = new RRWebInteractionEvent();
            rRWebInteractionEvent2.setTimestamp(this.dateProvider.getCurrentTimeMillis());
            rRWebInteractionEvent2.setX(screenshotRecorderConfig.getScaleFactorX() * motionEvent.getX(findPointerIndex2));
            rRWebInteractionEvent2.setY(screenshotRecorderConfig.getScaleFactorY() * motionEvent.getY(findPointerIndex2));
            rRWebInteractionEvent2.setId(0);
            rRWebInteractionEvent2.setPointerId(pointerId);
            rRWebInteractionEvent2.setInteractionType(RRWebInteractionEvent.InteractionType.TouchEnd);
            return D.D(rRWebInteractionEvent2);
        }
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        int findPointerIndex3 = motionEvent.findPointerIndex(pointerId2);
        if (findPointerIndex3 == -1) {
            return null;
        }
        this.currentPositions.put(Integer.valueOf(pointerId2), new ArrayList<>(10));
        RRWebInteractionEvent rRWebInteractionEvent3 = new RRWebInteractionEvent();
        rRWebInteractionEvent3.setTimestamp(this.dateProvider.getCurrentTimeMillis());
        rRWebInteractionEvent3.setX(screenshotRecorderConfig.getScaleFactorX() * motionEvent.getX(findPointerIndex3));
        rRWebInteractionEvent3.setY(screenshotRecorderConfig.getScaleFactorY() * motionEvent.getY(findPointerIndex3));
        rRWebInteractionEvent3.setId(0);
        rRWebInteractionEvent3.setPointerId(pointerId2);
        rRWebInteractionEvent3.setInteractionType(RRWebInteractionEvent.InteractionType.TouchStart);
        return D.D(rRWebInteractionEvent3);
    }
}
