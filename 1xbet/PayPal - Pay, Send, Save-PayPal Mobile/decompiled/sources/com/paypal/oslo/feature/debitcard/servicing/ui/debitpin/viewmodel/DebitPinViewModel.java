package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B7\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00170\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010&\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010(\u001a\u00020'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/viewmodel/DebitPinViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect;", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/DebitPinMode;", "pinMode", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SetDebitPinUseCase;", "setDebitPinUseCase", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/DebitPinMode;Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SetDebitPinUseCase;)V", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;", "getFlowType", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/DebitPinMode;", "getPinMode", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/DebitPinMode;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinReducer;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SetDebitPinUseCase;", "getHighSpeedVideoSizes", "", "isOnboardingFlow", "Z", "()Z", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitPinViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType flowType;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase getHighSpeedVideoSizes;
    private final boolean isOnboardingFlow;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode pinMode;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/viewmodel/DebitPinViewModel$Factory;", "", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/DebitPinMode;", "pinMode", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/viewmodel/DebitPinViewModel;", "create", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/DebitPinMode;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/viewmodel/DebitPinViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel create(java.lang.String cardId, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType flowType, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode pinMode);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType getFlowType() {
        return this.flowType;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode getPinMode() {
        return this.pinMode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public DebitPinViewModel(@dagger.assisted.Assisted java.lang.String str, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType setDebitPinFlowType, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode debitPinMode, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer debitPinReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase setDebitPinUseCase) {
        super(debitPinReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDebitPinFlowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitPinMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitPinReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDebitPinUseCase, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.flowType = setDebitPinFlowType;
        this.pinMode = debitPinMode;
        this.getHighSpeedVideoFpsRangesFor = debitPinReducer;
        this.getHighSpeedVideoSizes = setDebitPinUseCase;
        this.isOnboardingFlow = setDebitPinFlowType == com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType.ONBOARDING;
    }

    /* renamed from: isOnboardingFlow, reason: from getter */
    public final boolean getIsOnboardingFlow() {
        return this.isOnboardingFlow;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState initialState() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input(null, null, null, null, 0, 31, null);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DebitPinViewModel";
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware[]{new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.flowType, this.pinMode), new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinValidationMiddleware()});
    }
}
