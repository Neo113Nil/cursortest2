package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/UserState$ProfileLoaded;", "", "isUSUser", "(Lcom/paypal/oslo/core/userstore/model/UserState$ProfileLoaded;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserStoreExtensionsKt {
    public static final boolean isUSUser(com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileLoaded, "");
        java.lang.String accountCountryCode = profileLoaded.getUser().getAccountCountryCode();
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = accountCountryCode.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "US");
    }
}
