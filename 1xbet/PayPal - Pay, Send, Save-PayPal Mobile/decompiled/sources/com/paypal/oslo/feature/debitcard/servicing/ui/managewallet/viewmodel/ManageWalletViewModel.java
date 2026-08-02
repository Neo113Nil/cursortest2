package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&BE\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001a0\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0018R\u0015\u0010%\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "displayProductName", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetWalletInstrumentsUseCase;", "getWalletInstrumentsUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;", "lockCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;", "unlockCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;", "cancelCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetWalletInstrumentsUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletReducer;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "Ljava/lang/String;", "getDisplayProductName", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletMiddleware;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageWalletViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final java.lang.String displayProductName;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "displayProductName", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;", "create", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String displayProductName);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final java.lang.String getDisplayProductName() {
        return this.displayProductName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public ManageWalletViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, @dagger.assisted.Assisted java.lang.String str, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase getWalletInstrumentsUseCase, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase cancelCardUseCase, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletReducer manageWalletReducer) {
        super(manageWalletReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWalletInstrumentsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlockCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageWalletReducer, "");
        this.productName = debitCardProductName;
        this.displayProductName = str;
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.m14464$r8$lambda$ZHPlpwzlv1gISn60Ch6_KQ7HuE(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase.this, lockCardUseCase, unlockCardUseCase, cancelCardUseCase);
            }
        });
        processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState initialState() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Initial.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "ManageWalletViewModel.store";
    }

    /* renamed from: $r8$lambda$ZHPlpwzlv1gISn60Ch6_KQ7-HuE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware m14464$r8$lambda$ZHPlpwzlv1gISn60Ch6_KQ7HuE(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase getWalletInstrumentsUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase cancelCardUseCase) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware(getWalletInstrumentsUseCase, lockCardUseCase, unlockCardUseCase, cancelCardUseCase);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletMiddleware) this.getHighSpeedVideoFpsRanges.getValue());
    }
}
