package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B[\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010\u0018\u001a\u00020\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b+\u0010,R\u0015\u0010-\u001a\u00020$8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b-\u0010."}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitCardWidgetUseCase;", "getDebitCardWidgetUseCase", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionProvider;", "debitInstrumentProductDefinitionProvider", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/dynamicconfig/DynamicConfigManager;", "dynamicConfigManager", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityProvider;", "bankingBundleEligibilityProvider", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/IsInContextTapToPayEligibleUseCase;", "isInContextTapToPayEligible", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "debitCardWebViewUrlBuilder", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitCardWidgetUseCase;Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionProvider;Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetReducer;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/dynamicconfig/DynamicConfigManager;Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityProvider;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/IsInContextTapToPayEligibleUseCase;Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;)V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "", "stateStoreName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetSideEffectsMiddleware;", "middlewares", "()Ljava/util/List;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "getDebitCardWebViewUrlBuilder", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWidgetViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect> {
    public static final int $stable = 8;
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRangesFor;

    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder getDebitCardWebViewUrlBuilder() {
        return this.debitCardWebViewUrlBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public DebitCardWidgetViewModel(@dagger.hilt.android.qualifiers.ApplicationContext final android.content.Context context, com.paypal.oslo.core.userstore.UserStore userStore, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase getDebitCardWidgetUseCase, final com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider debitInstrumentProductDefinitionProvider, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer debitCardWidgetReducer, final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager, final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager dynamicConfigManager, final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider bankingBundleEligibilityProvider, final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase isInContextTapToPayEligibleUseCase, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder) {
        super(debitCardWidgetReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitCardWidgetUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductDefinitionProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidgetReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleEligibilityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isInContextTapToPayEligibleUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWebViewUrlBuilder, "");
        this.getHighSpeedVideoFpsRangesFor = userStore;
        this.debitCardWebViewUrlBuilder = debitCardWebViewUrlBuilder;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel.$r8$lambda$ObinLQOYuvlVJ9Nny2gGth3oEuk(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel.this, context, getDebitCardWidgetUseCase, featureGateManager, dynamicConfigManager, debitInstrumentProductDefinitionProvider, bankingBundleEligibilityProvider, isInContextTapToPayEligibleUseCase);
            }
        });
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModelKt.resolveProductName(this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState initialState() {
        return com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Idle.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.OPERATION_NAME;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware $r8$lambda$ObinLQOYuvlVJ9Nny2gGth3oEuk(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel, android.content.Context context, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase getDebitCardWidgetUseCase, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager dynamicConfigManager, com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider debitInstrumentProductDefinitionProvider, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider bankingBundleEligibilityProvider, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase isInContextTapToPayEligibleUseCase) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware(debitCardWidgetViewModel.getHighSpeedVideoFpsRangesFor, context, getDebitCardWidgetUseCase, featureGateManager, dynamicConfigManager, debitInstrumentProductDefinitionProvider, bankingBundleEligibilityProvider, isInContextTapToPayEligibleUseCase);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.util.List<com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent>> middlewares() {
        return kotlin.collections.CollectionsKt.listOf((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware) this.Camera2StreamConfigurationMap.getValue());
    }
}
