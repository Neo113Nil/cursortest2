package com.paypal.oslo.feature.consumerprivacy.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/util/SearchPolicyErrorHandler;", "", "<init>", "()V", "", "errorMessage", "", "isSearchPolicyNullError", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchPolicyErrorHandler {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.util.SearchPolicyErrorHandler INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.util.SearchPolicyErrorHandler();

    private SearchPolicyErrorHandler() {
    }

    public final boolean isSearchPolicyNullError(java.lang.String errorMessage) {
        if (errorMessage != null) {
            java.lang.String str = errorMessage;
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "'/privacySetting/searchPrivacy/searchPolicy'", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wrongly returned a null value", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "non-nullable type is 'SearchPolicyType' within parent type 'SearchPrivacySettings'", false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }
}
