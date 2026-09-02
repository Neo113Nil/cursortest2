package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.LongPressGateway;
import com.goldenboot.saga.zone.VibrationSignal;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class CachedSource implements VibrationSignal {
    public final CursorReader notifyMessage = new CursorReader();
    public final VibrationSignal reduceScope;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends AnimBroadcaster {
        public int attachConfig;
        public /* synthetic */ Object notifyMessage;
        public Object reduceScope;

        public ActivityMutator(ServiceRegulator serviceRegulator) {
            super(serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            this.notifyMessage = obj;
            this.attachConfig |= Integer.MIN_VALUE;
            return CachedSource.this.drawScope(null, this);
        }
    }

    public CachedSource(VibrationSignal vibrationSignal) {
        this.reduceScope = vibrationSignal;
    }

    public final void applyTask() {
        this.notifyMessage.clipOrigin();
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway detachStream(LongPressGateway.FeedbackFlow feedbackFlow) {
        return VibrationSignal.ActivityMutator.injectMetric(this, feedbackFlow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7.injectMetric(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.goldenboot.saga.zone.VibrationSignal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object drawScope(TouchRecord touchRecord, ServiceRegulator serviceRegulator) {
        ActivityMutator activityMutator;
        int i;
        if (serviceRegulator instanceof ActivityMutator) {
            activityMutator = (ActivityMutator) serviceRegulator;
            int i2 = activityMutator.attachConfig;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activityMutator.attachConfig = i2 - Integer.MIN_VALUE;
                Object obj = activityMutator.notifyMessage;
                Object releaseHeader = RotateReceiver.releaseHeader();
                i = activityMutator.attachConfig;
                if (i != 0) {
                    ColumnForger.growPayload(obj);
                    CursorReader cursorReader = this.notifyMessage;
                    activityMutator.reduceScope = touchRecord;
                    activityMutator.attachConfig = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ColumnForger.growPayload(obj);
                        return obj;
                    }
                    touchRecord = (TouchRecord) activityMutator.reduceScope;
                    ColumnForger.growPayload(obj);
                }
                VibrationSignal vibrationSignal = this.reduceScope;
                activityMutator.reduceScope = null;
                activityMutator.attachConfig = 2;
                Object drawScope = vibrationSignal.drawScope(touchRecord, activityMutator);
                return drawScope != releaseHeader ? releaseHeader : drawScope;
            }
        }
        activityMutator = new ActivityMutator(serviceRegulator);
        Object obj2 = activityMutator.notifyMessage;
        Object releaseHeader2 = RotateReceiver.releaseHeader();
        i = activityMutator.attachConfig;
        if (i != 0) {
        }
        VibrationSignal vibrationSignal2 = this.reduceScope;
        activityMutator.reduceScope = null;
        activityMutator.attachConfig = 2;
        Object drawScope2 = vibrationSignal2.drawScope(touchRecord, activityMutator);
        if (drawScope2 != releaseHeader2) {
        }
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway.BounceHandler, com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway.BounceHandler evictLayout(LongPressGateway.FeedbackFlow feedbackFlow) {
        return VibrationSignal.ActivityMutator.growPayload(this, feedbackFlow);
    }

    public final void flushSample() {
        this.notifyMessage.detachStream();
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    public LongPressGateway growPayload(LongPressGateway longPressGateway) {
        return VibrationSignal.ActivityMutator.detachStream(this, longPressGateway);
    }

    @Override // com.goldenboot.saga.zone.LongPressGateway
    public Object injectMetric(Object obj, IconExporter iconExporter) {
        return VibrationSignal.ActivityMutator.evictLayout(this, obj, iconExporter);
    }
}
