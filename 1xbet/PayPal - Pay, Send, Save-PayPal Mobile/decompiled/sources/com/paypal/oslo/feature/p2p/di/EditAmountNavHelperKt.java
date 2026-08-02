package com.paypal.oslo.feature.p2p.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "reviewReceiveCurrencyCode", "Lcom/paypal/oslo/feature/p2p/ui/review/state/EditAmountUiState;", "editAmountState", "amount", "intent", "Landroidx/navigation3/runtime/NavKey;", "buildEditAmountNavDestination", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/review/state/EditAmountUiState;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation3/runtime/NavKey;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditAmountNavHelperKt {
    public static final androidx.navigation3.runtime.NavKey buildEditAmountNavDestination(java.lang.String str, com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState editAmountUiState, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.String str5 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editAmountUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        if (str == null) {
            com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount = editAmountUiState.getUiAmount();
            if (uiAmount == null || (str4 = uiAmount.getCurrencyCode()) == null || kotlin.jvm.internal.Intrinsics.areEqual(str4, "USD")) {
                str4 = null;
            }
        } else {
            str4 = str;
        }
        java.lang.String str6 = str4;
        java.lang.String receiveCurrencyId = editAmountUiState.getReceiveCurrencyId();
        if (!kotlin.text.StringsKt.isBlank(receiveCurrencyId)) {
            str5 = receiveCurrencyId;
        } else if (str6 != null) {
            str5 = str6;
        }
        java.lang.String str7 = str5;
        java.lang.String str8 = str6;
        if (str8 != null && str8.length() != 0) {
            return new com.paypal.oslo.feature.p2p.api.navigation.CrossBorderDestination(editAmountUiState.getTransferAttemptId(), editAmountUiState.getCrossBorderSendAmount(), "USD", str6, str7, kotlin.collections.CollectionsKt.listOf(str3), true, str3, str2, false, 512, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new com.paypal.oslo.feature.p2p.api.navigation.EditAmountDestination(str2, str3);
    }
}
