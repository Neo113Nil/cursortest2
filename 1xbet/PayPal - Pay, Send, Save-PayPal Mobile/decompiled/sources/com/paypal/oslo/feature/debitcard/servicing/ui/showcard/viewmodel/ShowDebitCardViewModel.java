package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001eB+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00140\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/viewmodel/ShowDebitCardViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ShowDebitCardUseCase;", "showDebitCardUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/util/ClipboardManager;", "clipboardManager", "", "cardId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ShowDebitCardUseCase;Lcom/paypal/oslo/feature/debitcard/shared/util/ClipboardManager;Ljava/lang/String;)V", "stateStoreName", "()Ljava/lang/String;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardState;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ShowDebitCardUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/shared/util/ClipboardManager;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShowDebitCardViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/viewmodel/ShowDebitCardViewModel$Factory;", "", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/viewmodel/ShowDebitCardViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/viewmodel/ShowDebitCardViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel create(java.lang.String cardId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public ShowDebitCardViewModel(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer showDebitCardReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase showDebitCardUseCase, com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager clipboardManager, @dagger.assisted.Assisted java.lang.String str) {
        super(showDebitCardReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showDebitCardReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showDebitCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clipboardManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = showDebitCardUseCase;
        this.getHighSpeedVideoFpsRanges = clipboardManager;
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "ShowDebitCardViewModel.store";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState initialState() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Initial.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardSideEffectsMiddleware(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges));
    }
}
