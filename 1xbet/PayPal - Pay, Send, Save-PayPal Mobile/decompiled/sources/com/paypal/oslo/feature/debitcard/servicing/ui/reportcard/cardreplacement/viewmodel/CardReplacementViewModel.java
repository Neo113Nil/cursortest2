package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001%B=\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00190\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0015\u0010#\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/viewmodel/CardReplacementViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ReissueCardUseCase;", "reissueCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentShipmentUseCase;", "getDebitInstrumentShipmentUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDateFormatter;", "dateFormatter", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;Landroid/content/Context;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ReissueCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentShipmentUseCase;Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDateFormatter;)V", "", "stateStoreName", "()Ljava/lang/String;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementState;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getReplacementInfo", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/mvi/CardReplacementSideEffectsMiddleware;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardReplacementViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEffect> {
    public static final int $stable = 8;
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/viewmodel/CardReplacementViewModel$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/viewmodel/CardReplacementViewModel;", "create", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/cardreplacement/viewmodel/CardReplacementViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel create(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
        return this.replacementInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public CardReplacementViewModel(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementReducer cardReplacementReducer, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase reissueCardUseCase, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentShipmentUseCase getDebitInstrumentShipmentUseCase, final com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter debitCardDateFormatter) {
        super(cardReplacementReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reissueCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitInstrumentShipmentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardDateFormatter, "");
        this.replacementInfo = cardReplacementInfo;
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel.m14477$r8$lambda$i7k9gljnmtcPXO38_tJqNZ2XPM(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase.this, getDebitInstrumentShipmentUseCase, this, debitCardDateFormatter);
            }
        });
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "CardReplacementViewModel.store";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState initialState() {
        kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> resolveInitialContent = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementFlowTypeExtensionsKt.resolveInitialContent(this.replacementInfo.getFlowType(), this.getHighSpeedVideoSizes, this.replacementInfo.getCardLastFourDigits(), this.replacementInfo.getExpectedArrivalDate());
        return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState.Initial(this.replacementInfo.getDisplayAddress(), this.replacementInfo.getDebitInstrumentId(), this.replacementInfo.getProductName(), this.replacementInfo.getCardArtUrl(), this.replacementInfo.getCardLastFourDigits(), resolveInitialContent.component1(), resolveInitialContent.component2(), resolveInitialContent.component3(), this.replacementInfo.getPrimary());
    }

    /* renamed from: $r8$lambda$i7k9-gljnmtcPXO38_tJqNZ2XPM, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware m14477$r8$lambda$i7k9gljnmtcPXO38_tJqNZ2XPM(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase reissueCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentShipmentUseCase getDebitInstrumentShipmentUseCase, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel cardReplacementViewModel, com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter debitCardDateFormatter) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware(reissueCardUseCase, getDebitInstrumentShipmentUseCase, cardReplacementViewModel.replacementInfo, cardReplacementViewModel.getHighSpeedVideoSizes, debitCardDateFormatter);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementState, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware) this.Camera2StreamConfigurationMap.getValue());
    }
}
