package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ConsumerMaker implements CursorKeeper {

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
            return ConsumerMaker.this.collect(null, this);
        }
    }

    public abstract Object clipOrigin(TriggerModerator triggerModerator, ServiceRegulator serviceRegulator);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.goldenboot.saga.zone.CursorKeeper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(TriggerModerator triggerModerator, ServiceRegulator serviceRegulator) {
        ActivityMutator activityMutator;
        int i;
        TypographyDelegate typographyDelegate;
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
                    TypographyDelegate typographyDelegate2 = new TypographyDelegate(triggerModerator, activityMutator.getContext());
                    try {
                        activityMutator.reduceScope = typographyDelegate2;
                        activityMutator.attachConfig = 1;
                        if (clipOrigin(typographyDelegate2, activityMutator) == releaseHeader) {
                            return releaseHeader;
                        }
                        typographyDelegate = typographyDelegate2;
                    } catch (Throwable th) {
                        th = th;
                        typographyDelegate = typographyDelegate2;
                        typographyDelegate.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    typographyDelegate = (TypographyDelegate) activityMutator.reduceScope;
                    try {
                        ColumnForger.growPayload(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        typographyDelegate.releaseIntercepted();
                        throw th;
                    }
                }
                typographyDelegate.releaseIntercepted();
                return DpadBuilder.evictLayout;
            }
        }
        activityMutator = new ActivityMutator(serviceRegulator);
        Object obj2 = activityMutator.notifyMessage;
        Object releaseHeader2 = RotateReceiver.releaseHeader();
        i = activityMutator.attachConfig;
        if (i != 0) {
        }
        typographyDelegate.releaseIntercepted();
        return DpadBuilder.evictLayout;
    }
}
