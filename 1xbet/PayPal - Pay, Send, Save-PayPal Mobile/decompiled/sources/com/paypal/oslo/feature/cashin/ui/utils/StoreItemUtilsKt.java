package com.paypal.oslo.feature.cashin.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "storeName", "storeType", "generateStoreItemTestTag", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StoreItemUtilsKt {
    public static final java.lang.String generateStoreItemTestTag(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(lowerCase, " ", "_", false, 4, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append("_store_item_");
        sb.append(replace$default);
        return sb.toString();
    }
}
