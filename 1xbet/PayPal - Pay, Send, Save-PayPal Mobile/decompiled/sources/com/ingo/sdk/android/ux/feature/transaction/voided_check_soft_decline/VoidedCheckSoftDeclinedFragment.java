package com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/voided_check_soft_decline/VoidedCheckSoftDeclinedFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VoidedCheckSoftDeclinedFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionRequiresVoid;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment$onCreate$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                java.lang.String transactionReferenceNumberFromArgs;
                com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment.this.trackHardwareBackButton();
                com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment voidedCheckSoftDeclinedFragment = com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment.this;
                transactionReferenceNumberFromArgs = voidedCheckSoftDeclinedFragment.getTransactionReferenceNumberFromArgs();
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(voidedCheckSoftDeclinedFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.VOID_IMAGE_SOFT_DECLINED, transactionReferenceNumberFromArgs, null, 4, null);
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_SOFT_DECLINED_RESPONSE)) == null) {
            str = "";
        }
        json.getSerializersModule();
        com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse voidImageSoftDeclinedResponse = (com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse) json.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse.INSTANCE.serializer(), str);
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-193096880, true, new com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment$onCreateView$1$1(voidImageSoftDeclinedResponse, composeView, this)));
        return composeView;
    }
}
