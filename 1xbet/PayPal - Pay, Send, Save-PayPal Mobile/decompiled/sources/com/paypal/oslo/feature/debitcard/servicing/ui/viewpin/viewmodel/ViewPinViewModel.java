package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001eB#\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00130\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/viewmodel/ViewPinViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEffect;", "", "debitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitPinUseCase;", "getDebitPinUseCase", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitPinUseCase;)V", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Ljava/lang/String;", "getDebitInstrumentId", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinReducer;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitPinUseCase;", "getHighSpeedVideoFpsRangesFor", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewPinViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect> {
    public static final int $stable = 8;
    private final java.lang.String debitInstrumentId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase getHighSpeedVideoFpsRangesFor;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/viewmodel/ViewPinViewModel$Factory;", "", "", "debitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/viewmodel/ViewPinViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/viewmodel/ViewPinViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel create(java.lang.String debitInstrumentId);
    }

    public final java.lang.String getDebitInstrumentId() {
        return this.debitInstrumentId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public ViewPinViewModel(@dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer viewPinReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase getDebitPinUseCase) {
        super(viewPinReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPinReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitPinUseCase, "");
        this.debitInstrumentId = str;
        this.Camera2StreamConfigurationMap = viewPinReducer;
        this.getHighSpeedVideoFpsRangesFor = getDebitPinUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState initialState() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input(null, null, null, null, 0, 31, null);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "ViewPinViewModel";
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware[]{new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware(this.getHighSpeedVideoFpsRangesFor, this.debitInstrumentId), new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinValidationMiddleware()});
    }
}
