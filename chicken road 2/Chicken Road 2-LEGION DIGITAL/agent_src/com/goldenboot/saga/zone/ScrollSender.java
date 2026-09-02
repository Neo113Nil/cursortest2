package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ScrollSender {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends PanelRevision implements IconExporter {
        public final /* synthetic */ IconExporter connectPatch;
        public /* synthetic */ Object notifyMessage;
        public int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(IconExporter iconExporter, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.connectPatch = iconExporter;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            ActivityMutator activityMutator = new ActivityMutator(this.connectPatch, serviceRegulator);
            activityMutator.notifyMessage = obj;
            return activityMutator;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
        public final Object invoke(WrapperQueue wrapperQueue, ServiceRegulator serviceRegulator) {
            return ((ActivityMutator) create(wrapperQueue, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AttrSignal attrSignal = (AttrSignal) this.notifyMessage;
                ColumnForger.growPayload(obj);
                return attrSignal;
            }
            ColumnForger.growPayload(obj);
            AttrSignal injectMetric = ((WrapperQueue) this.notifyMessage).injectMetric();
            IconExporter iconExporter = this.connectPatch;
            this.notifyMessage = injectMetric;
            this.reduceScope = 1;
            return iconExporter.invoke(injectMetric, this) == releaseHeader ? releaseHeader : injectMetric;
        }
    }

    public static final Object evictLayout(LongPressDispatcher longPressDispatcher, IconExporter iconExporter, ServiceRegulator serviceRegulator) {
        return longPressDispatcher.evictLayout(new ActivityMutator(iconExporter, null), serviceRegulator);
    }
}
