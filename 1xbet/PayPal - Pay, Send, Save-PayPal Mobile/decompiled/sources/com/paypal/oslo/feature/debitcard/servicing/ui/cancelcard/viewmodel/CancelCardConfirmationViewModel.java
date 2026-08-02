package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B-\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00140\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/viewmodel/CancelCardConfirmationViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationEffect;", "", "reason", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "cancelCardInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;", "cancelCardUseCase", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;)V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationState;", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "getCancelCardInfo", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardConfirmationReducer;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/CancelCardUseCase;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardReason;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardReason;", "getReason", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardReason;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardConfirmationViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEffect> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationReducer getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason reason;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/viewmodel/CancelCardConfirmationViewModel$Factory;", "", "", "reason", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "cancelCardInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/viewmodel/CancelCardConfirmationViewModel;", "create", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/viewmodel/CancelCardConfirmationViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel create(@dagger.assisted.Assisted("reason") java.lang.String reason, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo getCancelCardInfo() {
        return this.cancelCardInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public CancelCardConfirmationViewModel(@dagger.assisted.Assisted("reason") java.lang.String str, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationReducer cancelCardConfirmationReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase cancelCardUseCase) {
        super(cancelCardConfirmationReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardConfirmationReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardUseCase, "");
        this.cancelCardInfo = cancelCardInfo;
        this.getHighSpeedVideoFpsRangesFor = cancelCardConfirmationReducer;
        this.getHighSpeedVideoSizes = cancelCardUseCase;
        this.reason = com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.valueOf(str);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason getReason() {
        return this.reason;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState initialState() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState.Initial.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "CancelCardConfirmationViewModel";
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationState, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationSideEffectsMiddleware(this.getHighSpeedVideoSizes, this.cancelCardInfo.getCardId()));
    }
}
