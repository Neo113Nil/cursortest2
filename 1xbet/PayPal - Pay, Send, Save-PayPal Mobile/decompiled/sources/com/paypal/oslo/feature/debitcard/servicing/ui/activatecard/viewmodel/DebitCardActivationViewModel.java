package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001cB#\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00130\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001a\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/DebitCardActivationViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "activateCardInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ActivatePhysicalCardUseCase;", "activatePhysicalCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ActivatePhysicalCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationReducer;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "getActivateCardInfo", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationMiddleware;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardActivationViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo activateCardInfo;
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/DebitCardActivationViewModel$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "activateCardInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/DebitCardActivationViewModel;", "create", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/DebitCardActivationViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel create(@dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo activateCardInfo);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo getActivateCardInfo() {
        return this.activateCardInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public DebitCardActivationViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase activatePhysicalCardUseCase, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationReducer debitCardActivationReducer) {
        super(debitCardActivationReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activatePhysicalCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationReducer, "");
        this.activateCardInfo = debitCardActivationInfo;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.$r8$lambda$XSjHslqgfUp2dB8CJIj5WMLGFWE(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.this, activatePhysicalCardUseCase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState initialState() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DebitCardActivationViewModel.store";
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware $r8$lambda$XSjHslqgfUp2dB8CJIj5WMLGFWE(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase activatePhysicalCardUseCase) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware(debitCardActivationViewModel.activateCardInfo.getInstrumentId(), debitCardActivationViewModel.activateCardInfo.getCollectedPin(), activatePhysicalCardUseCase);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware) this.getHighSpeedVideoFpsRangesFor.getValue());
    }
}
