package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "evictLayout", "(Lcom/goldenboot/saga/zone/TouchRecord;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListGovernor {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @SubscriberBroadcaster(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator extends PanelRevision implements TouchRecord {
        final /* synthetic */ TouchRecord notifyMessage;
        int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(TouchRecord touchRecord, ServiceRegulator serviceRegulator) {
            super(1, serviceRegulator);
            this.notifyMessage = touchRecord;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(ServiceRegulator serviceRegulator) {
            return new ActivityMutator(this.notifyMessage, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ServiceRegulator serviceRegulator) {
            return ((ActivityMutator) create(serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.reduceScope;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ColumnForger.growPayload(obj);
                return obj;
            }
            ColumnForger.growPayload(obj);
            TouchRecord touchRecord = this.notifyMessage;
            this.reduceScope = 1;
            Object growPayload = BundleMeter.growPayload(touchRecord, this);
            return growPayload == releaseHeader ? releaseHeader : growPayload;
        }
    }

    public static final <R> Object evictLayout(TouchRecord touchRecord, ServiceRegulator serviceRegulator) {
        PanelTimer panelTimer = (PanelTimer) serviceRegulator.getContext().evictLayout(PanelTimer.INSTANCE);
        return panelTimer == null ? BundleMeter.growPayload(touchRecord, serviceRegulator) : panelTimer.drawField(new ActivityMutator(touchRecord, null), serviceRegulator);
    }
}
