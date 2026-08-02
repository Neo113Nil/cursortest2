package com.ingo.sdk.android.ux.feature.transaction.enter_amount;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/enter_amount/EnterAmountFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/compose/runtime/MutableState;", "", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MutableState;", "Lcom/ingo/sdk/android/ux/feature/transaction/confirm_amount/ConfirmCheckAmountViewModelImpl;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/android/ux/feature/transaction/confirm_amount/ConfirmCheckAmountViewModelImpl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EnterAmountFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    private final com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl Camera2StreamConfigurationMap = new com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl(null, 1, 0 == true ? 1 : 0);

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.EnterAmount;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment = this;
        requireActivity().getGetHighResolutionOutputSizeshNQ4ISI().addCallback(enterAmountFragment, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$onCreate$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.this.trackHardwareBackButton();
                com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.access$onNavigationBack(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.this);
            }
        });
        com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl confirmCheckAmountViewModelImpl = this.Camera2StreamConfigurationMap;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(enterAmountFragment, confirmCheckAmountViewModelImpl.getConfirmAmountResponse(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.$r8$lambda$15iewUUsV4uIKrGFdGHdD8XonMY(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.this, (com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse) obj);
            }
        });
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(enterAmountFragment, confirmCheckAmountViewModelImpl.getFailure(), new com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$onCreate$2$2(this));
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(346953093, true, new com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$onCreateView$1$1(this, composeView)));
        return composeView;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$15iewUUsV4uIKrGFdGHdD8XonMY(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse) {
        enterAmountFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(enterAmountFragment.getArguments());
        kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
        json.getSerializersModule();
        bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_CONFIRM_AMOUNT_RESPONSE, json.encodeToString(kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse.INSTANCE.serializer()), confirmAmountResponse));
        com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(enterAmountFragment), com.ingo.sdk.android.R.id.action_enterAmountFragment_to_fundsTimingFragment, bundle, null, null, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_MKbUbRRuNE1aaflrCQVjN-Spbg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10693$r8$lambda$_MKbUbRRuNE1aaflrCQVjNSpbg(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment) {
        enterAmountFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cpVX0sH2FsqjqUMw9jYx-Ak1XkE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10694$r8$lambda$cpVX0sH2FsqjqUMw9jYxAk1XkE(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment) {
        enterAmountFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$noOcrAmountFromApi(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment) {
        return enterAmountFragment.getOcrAmountFromArguments() < 0;
    }

    public static final /* synthetic */ void access$onNavigationBack(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment) {
        if (enterAmountFragment.getOcrAmountFromArguments() < 0) {
            com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(enterAmountFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.ENTER_CHECK_AMOUNT, enterAmountFragment.getTransactionReferenceNumberFromArgs(), null, 4, null);
        } else {
            androidx.view.fragment.FragmentKt.findNavController(enterAmountFragment).popBackStack();
        }
    }

    public static final /* synthetic */ void access$renderFailure(final com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        enterAmountFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
        if (failure != null && (failure instanceof com.ingo.sdk.kotlin.common.core.exception.ApiFailure)) {
            java.lang.Throwable throwable = ((com.ingo.sdk.kotlin.common.core.exception.ApiFailure) failure).getThrowable();
            if (throwable instanceof com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) {
                enterAmountFragment.exitOnUnplannedApiError(failure, com.ingo.sdk.kotlin.common.constants.IngoModules.CONFIRM_CHECK_AMOUNT, (com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) throwable, enterAmountFragment.getTransactionReferenceNumberFromArgs());
                return;
            } else {
                enterAmountFragment.handleUnplannedExceptionWithRetry(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.m10694$r8$lambda$cpVX0sH2FsqjqUMw9jYxAk1XkE(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.this);
                    }
                }, com.ingo.sdk.kotlin.common.constants.IngoModules.CONFIRM_CHECK_AMOUNT, false, enterAmountFragment.getTransactionReferenceNumberFromArgs());
                return;
            }
        }
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "UNKNOWN FAILURE WITH RETRY ".concat(java.lang.String.valueOf(failure)), null, 2, null);
        enterAmountFragment.handleUnplannedExceptionWithRetry(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.m10693$r8$lambda$_MKbUbRRuNE1aaflrCQVjNSpbg(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.this);
            }
        }, com.ingo.sdk.kotlin.common.constants.IngoModules.CONFIRM_CHECK_AMOUNT, false, enterAmountFragment.getTransactionReferenceNumberFromArgs());
    }
}
