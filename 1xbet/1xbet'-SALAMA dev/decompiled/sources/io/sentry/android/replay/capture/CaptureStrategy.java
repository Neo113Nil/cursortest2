package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ReplayRecording;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.GeneratedVideo;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.b;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebMetaEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p113p3.f;
import t6.e;
import t6.h;
import t6.p;

/* JADX INFO: loaded from: classes2.dex */
public interface CaptureStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final long BREADCRUMB_START_OFFSET = 100;
        private static final long MAX_SEGMENT_DURATION = 300000;

        private Companion() {
        }

        private final ReplaySegment buildReplay(SentryOptions sentryOptions, File file, SentryId sentryId, Date date, int i7, int i8, int i9, int i10, int i11, long j, SentryReplayEvent.ReplayType replayType, String str, List<Breadcrumb> list, Deque<RRWebEvent> deque) {
            RRWebEvent rRWebEventConvert;
            Object obj;
            Date dateTime = DateUtils.getDateTime(date.getTime() + j);
            h.d(dateTime, "getDateTime(segmentTimestamp.time + videoDuration)");
            SentryReplayEvent sentryReplayEvent = new SentryReplayEvent();
            sentryReplayEvent.setEventId(sentryId);
            sentryReplayEvent.setReplayId(sentryId);
            sentryReplayEvent.setSegmentId(i7);
            sentryReplayEvent.setTimestamp(dateTime);
            sentryReplayEvent.setReplayStartTimestamp(date);
            sentryReplayEvent.setReplayType(replayType);
            sentryReplayEvent.setVideoFile(file);
            ArrayList arrayList = new ArrayList();
            RRWebMetaEvent rRWebMetaEvent = new RRWebMetaEvent();
            rRWebMetaEvent.setTimestamp(date.getTime());
            rRWebMetaEvent.setHeight(i8);
            rRWebMetaEvent.setWidth(i9);
            arrayList.add(rRWebMetaEvent);
            RRWebVideoEvent rRWebVideoEvent = new RRWebVideoEvent();
            rRWebVideoEvent.setTimestamp(date.getTime());
            rRWebVideoEvent.setSegmentId(i7);
            rRWebVideoEvent.setDurationMs(j);
            rRWebVideoEvent.setFrameCount(i10);
            rRWebVideoEvent.setSize(file.length());
            rRWebVideoEvent.setFrameRate(i11);
            rRWebVideoEvent.setHeight(i8);
            rRWebVideoEvent.setWidth(i9);
            rRWebVideoEvent.setLeft(0);
            rRWebVideoEvent.setTop(0);
            arrayList.add(rRWebVideoEvent);
            LinkedList linkedList = new LinkedList();
            for (Breadcrumb breadcrumb : list) {
                if (breadcrumb.getTimestamp().getTime() + BREADCRUMB_START_OFFSET >= date.getTime() && breadcrumb.getTimestamp().getTime() < dateTime.getTime() && (rRWebEventConvert = sentryOptions.getReplayController().getBreadcrumbConverter().convert(breadcrumb)) != null) {
                    arrayList.add(rRWebEventConvert);
                    Object obj2 = null;
                    RRWebBreadcrumbEvent rRWebBreadcrumbEvent = rRWebEventConvert instanceof RRWebBreadcrumbEvent ? (RRWebBreadcrumbEvent) rRWebEventConvert : null;
                    if (h.a(rRWebBreadcrumbEvent != null ? rRWebBreadcrumbEvent.getCategory() : null, "navigation")) {
                        RRWebBreadcrumbEvent rRWebBreadcrumbEvent2 = (RRWebBreadcrumbEvent) rRWebEventConvert;
                        Map<String, Object> data = rRWebBreadcrumbEvent2.getData();
                        if (data != null && (obj = data.get("to")) != null) {
                            obj2 = obj;
                        }
                        if (obj2 instanceof String) {
                            Map<String, Object> data2 = rRWebBreadcrumbEvent2.getData();
                            h.b(data2);
                            Object obj3 = data2.get("to");
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            linkedList.add((String) obj3);
                        }
                    }
                }
            }
            if (str != null && !h.a(p050g6.h.R0(linkedList), str)) {
                linkedList.addFirst(str);
            }
            rotateEvents$sentry_android_replay_release(deque, dateTime.getTime(), new CaptureStrategy$Companion$buildReplay$4(date, arrayList));
            if (i7 == 0) {
                arrayList.add(new RRWebOptionsEvent(sentryOptions));
            }
            ReplayRecording replayRecording = new ReplayRecording();
            replayRecording.setSegmentId(Integer.valueOf(i7));
            replayRecording.setPayload(p050g6.h.V0(new Comparator() { // from class: io.sentry.android.replay.capture.CaptureStrategy$Companion$buildReplay$lambda$7$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t7, T t8) {
                    return f.t(Long.valueOf(((RRWebEvent) t7).getTimestamp()), Long.valueOf(((RRWebEvent) t8).getTimestamp()));
                }
            }, arrayList));
            sentryReplayEvent.setUrls(linkedList);
            return new ReplaySegment.Created(sentryReplayEvent, replayRecording);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createSegment$lambda$0(p pVar, IScope iScope) {
            h.e(pVar, "$crumbs");
            h.e(iScope, "scope");
            pVar.f16478a = new ArrayList(iScope.getBreadcrumbs());
        }

        public static /* synthetic */ void rotateEvents$sentry_android_replay_release$default(Companion companion, Deque deque, long j, Function1 function1, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                function1 = null;
            }
            companion.rotateEvents$sentry_android_replay_release(deque, j, function1);
        }

        public final ReplaySegment createSegment(IScopes iScopes, SentryOptions sentryOptions, long j, Date date, SentryId sentryId, int i7, int i8, int i9, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, int i10, int i11, String str, List<Breadcrumb> list, Deque<RRWebEvent> deque) {
            GeneratedVideo generatedVideoCreateVideoOf$default;
            List<Breadcrumb> list2;
            h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
            h.e(date, "currentSegmentTimestamp");
            h.e(sentryId, "replayId");
            h.e(replayType, "replayType");
            h.e(deque, "events");
            if (replayCache == null || (generatedVideoCreateVideoOf$default = ReplayCache.createVideoOf$default(replayCache, Math.min(j, MAX_SEGMENT_DURATION), date.getTime(), i7, i8, i9, i10, i11, null, 128, null)) == null) {
                return ReplaySegment.Failed.INSTANCE;
            }
            File fileComponent1 = generatedVideoCreateVideoOf$default.component1();
            int iComponent2 = generatedVideoCreateVideoOf$default.component2();
            long jComponent3 = generatedVideoCreateVideoOf$default.component3();
            if (list == null) {
                p pVar = new p();
                pVar.f16478a = p050g6.p.f13308a;
                if (iScopes != null) {
                    iScopes.configureScope(new b(pVar, 1));
                }
                list2 = (List) pVar.f16478a;
            } else {
                list2 = list;
            }
            return buildReplay(sentryOptions, fileComponent1, sentryId, date, i7, i8, i9, iComponent2, i10, jComponent3, replayType, str, list2, deque);
        }

        public final void rotateEvents$sentry_android_replay_release(Deque<RRWebEvent> deque, long j, Function1 function1) {
            h.e(deque, "events");
            Iterator<RRWebEvent> it = deque.iterator();
            h.d(it, "events.iterator()");
            while (it.hasNext()) {
                RRWebEvent next = it.next();
                if (next.getTimestamp() < j) {
                    if (function1 != null) {
                        function1.invoke(next);
                    }
                    it.remove();
                }
            }
        }
    }

    public static final class DefaultImpls {
        public static void onScreenChanged(CaptureStrategy captureStrategy, String str) {
        }

        public static /* synthetic */ void onScreenshotRecorded$default(CaptureStrategy captureStrategy, Bitmap bitmap, Function2 function2, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScreenshotRecorded");
            }
            if ((i7 & 1) != 0) {
                bitmap = null;
            }
            captureStrategy.onScreenshotRecorded(bitmap, function2);
        }

        public static /* synthetic */ void start$default(CaptureStrategy captureStrategy, int i7, SentryId sentryId, SentryReplayEvent.ReplayType replayType, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i8 & 1) != 0) {
                i7 = 0;
            }
            if ((i8 & 2) != 0) {
                sentryId = new SentryId();
            }
            if ((i8 & 4) != 0) {
                replayType = null;
            }
            captureStrategy.start(i7, sentryId, replayType);
        }
    }

    @StabilityInferred(parameters = 1)
    public static abstract class ReplaySegment {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        public static final class Created extends ReplaySegment {
            public static final int $stable = 8;
            private final ReplayRecording recording;
            private final SentryReplayEvent replay;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Created(SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording) {
                super(null);
                h.e(sentryReplayEvent, "replay");
                h.e(replayRecording, "recording");
                this.replay = sentryReplayEvent;
                this.recording = replayRecording;
            }

            public static /* synthetic */ void capture$default(Created created, IScopes iScopes, Hint hint, int i7, Object obj) {
                if ((i7 & 2) != 0) {
                    hint = new Hint();
                }
                created.capture(iScopes, hint);
            }

            public static /* synthetic */ Created copy$default(Created created, SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    sentryReplayEvent = created.replay;
                }
                if ((i7 & 2) != 0) {
                    replayRecording = created.recording;
                }
                return created.copy(sentryReplayEvent, replayRecording);
            }

            public final void capture(IScopes iScopes, Hint hint) {
                h.e(hint, "hint");
                if (iScopes != null) {
                    SentryReplayEvent sentryReplayEvent = this.replay;
                    hint.setReplayRecording(this.recording);
                    iScopes.captureReplay(sentryReplayEvent, hint);
                }
            }

            public final SentryReplayEvent component1() {
                return this.replay;
            }

            public final ReplayRecording component2() {
                return this.recording;
            }

            public final Created copy(SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording) {
                h.e(sentryReplayEvent, "replay");
                h.e(replayRecording, "recording");
                return new Created(sentryReplayEvent, replayRecording);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Created)) {
                    return false;
                }
                Created created = (Created) obj;
                return h.a(this.replay, created.replay) && h.a(this.recording, created.recording);
            }

            public final ReplayRecording getRecording() {
                return this.recording;
            }

            public final SentryReplayEvent getReplay() {
                return this.replay;
            }

            public int hashCode() {
                return this.recording.hashCode() + (this.replay.hashCode() * 31);
            }

            public final void setSegmentId(int i7) {
                this.replay.setSegmentId(i7);
                List<? extends RRWebEvent> payload = this.recording.getPayload();
                if (payload != null) {
                    for (RRWebEvent rRWebEvent : payload) {
                        if (rRWebEvent instanceof RRWebVideoEvent) {
                            ((RRWebVideoEvent) rRWebEvent).setSegmentId(i7);
                        }
                    }
                }
            }

            public String toString() {
                return "Created(replay=" + this.replay + ", recording=" + this.recording + ')';
            }
        }

        @StabilityInferred(parameters = 1)
        public static final class Failed extends ReplaySegment {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }

        public /* synthetic */ ReplaySegment(e eVar) {
            this();
        }

        private ReplaySegment() {
        }
    }

    void captureReplay(boolean z4, Function1 function1);

    CaptureStrategy convert();

    SentryId getCurrentReplayId();

    int getCurrentSegment();

    File getReplayCacheDir();

    SentryReplayEvent.ReplayType getReplayType();

    Date getSegmentTimestamp();

    void onConfigurationChanged(ScreenshotRecorderConfig screenshotRecorderConfig);

    void onScreenChanged(String str);

    void onScreenshotRecorded(Bitmap bitmap, Function2 function2);

    void onTouchEvent(MotionEvent motionEvent);

    void pause();

    void resume();

    void setCurrentReplayId(SentryId sentryId);

    void setCurrentSegment(int i7);

    void setReplayType(SentryReplayEvent.ReplayType replayType);

    void setSegmentTimestamp(Date date);

    void start(int i7, SentryId sentryId, SentryReplayEvent.ReplayType replayType);

    void stop();
}
