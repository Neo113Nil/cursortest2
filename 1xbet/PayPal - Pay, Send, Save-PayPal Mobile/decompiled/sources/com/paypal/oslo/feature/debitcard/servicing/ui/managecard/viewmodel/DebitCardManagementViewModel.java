package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001MB\u0097\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.0-H\u0014¢\u0006\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u00103R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010C\u001a\u0004\bD\u0010ER(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010F\u001a\u0004\u0018\u00010\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010IR\u0015\u0010K\u001a\u00020J8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bK\u0010L"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/viewmodel/DebitCardManagementViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "flowIntent", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", "debitCardActivationResultType", "Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardAcquisitionOnArrivalAction;", "acquisitionOnArrivalAction", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "postEnrollmentAction", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "debitCardWebViewUrlBuilder", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;", "debitCardI18nFormatter", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentsUseCase;", "getDebitInstrumentsUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;", "lockCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;", "unlockCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/CardConnectHandler;", "cardConnectHandler", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardAcquisitionOnArrivalAction;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentsUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/CardConnectHandler;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;)V", "", "consumeOnArrivalAction", "()V", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "middlewares", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", "getFlow", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "getFlowIntent", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", "getDebitCardActivationResultType", "()Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "getPostEnrollmentAction", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "getDebitCardWebViewUrlBuilder", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;", "getDebitCardI18nFormatter", "()Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;", "p0", "Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardAcquisitionOnArrivalAction;", "getAcquisitionOnArrivalAction", "()Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardAcquisitionOnArrivalAction;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementSideEffectsMiddleware;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardManagementViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect> {
    public static final int $stable = 8;
    private com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction acquisitionOnArrivalAction;
    private final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType;
    private final com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter;
    private final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow flow;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent flowIntent;
    private final kotlin.Lazy getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction postEnrollmentAction;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow getFlow() {
        return this.flow;
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent getFlowIntent() {
        return this.flowIntent;
    }

    public final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType getDebitCardActivationResultType() {
        return this.debitCardActivationResultType;
    }

    public /* synthetic */ DebitCardManagementViewModel(android.content.Context context, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent, com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction debitCardAcquisitionOnArrivalAction, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder, com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getDebitInstrumentsUseCase, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer debitCardManagementReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler cardConnectHandler, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, debitCardProductName, (i & 4) != 0 ? null : debitCardFlow, (i & 8) != 0 ? null : debitCardFlowIntent, (i & 16) != 0 ? null : debitCardActivationResultType, (i & 32) != 0 ? null : debitCardAcquisitionOnArrivalAction, (i & 64) != 0 ? com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.NONE : debitCardPostEnrollmentAction, debitCardWebViewUrlBuilder, debitCardI18nFormatter, getDebitInstrumentsUseCase, debitCardManagementReducer, lockCardUseCase, unlockCardUseCase, cardConnectHandler, featureGateManager);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction getPostEnrollmentAction() {
        return this.postEnrollmentAction;
    }

    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder getDebitCardWebViewUrlBuilder() {
        return this.debitCardWebViewUrlBuilder;
    }

    public final com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter getDebitCardI18nFormatter() {
        return this.debitCardI18nFormatter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public DebitCardManagementViewModel(@dagger.hilt.android.qualifiers.ApplicationContext final android.content.Context context, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction debitCardAcquisitionOnArrivalAction, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder, com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getDebitInstrumentsUseCase, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer debitCardManagementReducer, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase, final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler cardConnectHandler, final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        super(debitCardManagementReducer);
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardDetails showCardDetails;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardPostEnrollmentAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWebViewUrlBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardI18nFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitInstrumentsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlockCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.productName = debitCardProductName;
        this.flow = debitCardFlow;
        this.flowIntent = debitCardFlowIntent;
        this.debitCardActivationResultType = debitCardActivationResultType;
        this.postEnrollmentAction = debitCardPostEnrollmentAction;
        this.debitCardWebViewUrlBuilder = debitCardWebViewUrlBuilder;
        this.debitCardI18nFormatter = debitCardI18nFormatter;
        this.acquisitionOnArrivalAction = debitCardAcquisitionOnArrivalAction;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.$r8$lambda$dXm3COyz5IpYLWGveJk9vu34sDA(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.this, getDebitInstrumentsUseCase, lockCardUseCase, unlockCardUseCase, context, cardConnectHandler, featureGateManager);
            }
        });
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.WhenMappings.$EnumSwitchMapping$0[debitCardPostEnrollmentAction.ordinal()];
        if (i == 1) {
            showCardDetails = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardDetails.INSTANCE;
        } else if (i == 2) {
            showCardDetails = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowFundingSourceSelectorBottomSheet.INSTANCE;
        } else if (i == 3) {
            showCardDetails = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowPushProvisioningBottomSheet.INSTANCE;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            showCardDetails = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None.INSTANCE;
        }
        processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards(showCardDetails)));
    }

    public final com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction getAcquisitionOnArrivalAction() {
        return this.acquisitionOnArrivalAction;
    }

    public final void consumeOnArrivalAction() {
        this.acquisitionOnArrivalAction = null;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JQ\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/viewmodel/DebitCardManagementViewModel$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "flowIntent", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", "debitCardActivationResultType", "Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardAcquisitionOnArrivalAction;", "acquisitionOnArrivalAction", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "postEnrollmentAction", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/viewmodel/DebitCardManagementViewModel;", "create", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardAcquisitionOnArrivalAction;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/viewmodel/DebitCardManagementViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @dagger.assisted.AssistedFactory
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow flow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent flowIntent, com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction acquisitionOnArrivalAction, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction postEnrollmentAction);

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel create$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.Factory factory, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent, com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction debitCardAcquisitionOnArrivalAction, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction, int i, java.lang.Object obj) {
            if (obj == null) {
                return factory.create(debitCardProductName, (i & 2) != 0 ? null : debitCardFlow, (i & 4) != 0 ? null : debitCardFlowIntent, (i & 8) != 0 ? null : debitCardActivationResultType, (i & 16) == 0 ? debitCardAcquisitionOnArrivalAction : null, (i & 32) != 0 ? com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.NONE : debitCardPostEnrollmentAction);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState initialState() {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial(this.productName);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DebitCardManagementViewModel.store";
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware $r8$lambda$dXm3COyz5IpYLWGveJk9vu34sDA(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel debitCardManagementViewModel, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getDebitInstrumentsUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase, android.content.Context context, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler cardConnectHandler, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware(debitCardManagementViewModel.productName, getDebitInstrumentsUseCase, lockCardUseCase, unlockCardUseCase, debitCardManagementViewModel.debitCardI18nFormatter, context, debitCardManagementViewModel.flow, debitCardManagementViewModel.flowIntent, cardConnectHandler, featureGateManager);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware) this.getHighSpeedVideoSizes.getValue());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.SHOW_CARD_DETAILS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.LINK_ACCOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.SEE_DIGITAL_WALLET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
