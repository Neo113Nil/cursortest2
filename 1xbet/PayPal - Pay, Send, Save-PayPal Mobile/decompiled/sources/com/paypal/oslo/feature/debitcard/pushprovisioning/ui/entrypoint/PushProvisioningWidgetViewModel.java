package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00110\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0019\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/PushProvisioningWidgetViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetState;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEffect;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetPushProvisioningStatusUseCase;", "getPushProvisioningStatusUseCase", "<init>", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetReducer;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetPushProvisioningStatusUseCase;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetPushProvisioningStatusUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetSideEffectsMiddleware;", "Lkotlin/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisioningWidgetViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public PushProvisioningWidgetViewModel(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetReducer pushProvisioningWidgetReducer, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getPushProvisioningStatusUseCase) {
        super(pushProvisioningWidgetReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPushProvisioningStatusUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = getPushProvisioningStatusUseCase;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel.m14266$r8$lambda$0rF3VMgrg58duNgj9rJ9IhrCA(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState initialState() {
        return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Initial.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DebitPushProvisionWidgetViewModel.store";
    }

    /* renamed from: $r8$lambda$-0rF3VMgrg58duNgj9rJ9-IhrCA, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware m14266$r8$lambda$0rF3VMgrg58duNgj9rJ9IhrCA(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel pushProvisioningWidgetViewModel) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware(pushProvisioningWidgetViewModel.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware) this.getHighSpeedVideoSizes.getValue());
    }
}
