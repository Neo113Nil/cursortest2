package com.ingo.sdk.kotlin.common.analytics;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "transactionId", "", "defaultProperties", "(Ljava/lang/String;)Ljava/util/Map;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IngoAnalyticsKt {
    public static /* synthetic */ java.util.Map defaultProperties$default(java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return defaultProperties(str);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> defaultProperties(java.lang.String str) {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
        if (obj != null) {
            com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration = (com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj;
            java.util.Map<java.lang.String, java.lang.String> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("SessionId", ingoSdkConfiguration.getSdkAuthorizationToken()), kotlin.TuplesKt.to("CustomerId", ingoSdkConfiguration.getCustomerId()), kotlin.TuplesKt.to(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.SystemTime, java.lang.String.valueOf(com.ingo.sdk.kotlin.common.analytics.SystemTimeKt.systemTime())));
            java.lang.String str2 = str;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                mutableMapOf.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.TransactionId, str);
            }
            return mutableMapOf;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration");
    }
}
