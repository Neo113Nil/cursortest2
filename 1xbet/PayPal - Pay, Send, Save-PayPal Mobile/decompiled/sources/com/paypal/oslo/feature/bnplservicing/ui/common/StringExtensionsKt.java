package com.paypal.oslo.feature.bnplservicing.ui.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "wordsCount", "getLastNWords", "(Ljava/lang/String;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StringExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String getLastNWords(java.lang.String str, int i) {
        java.lang.String str2;
        java.util.List takeLast;
        if (str != null) {
            java.util.List<java.lang.String> split = new kotlin.text.Regex("\\s+").split(str, 0);
            if (split != null && (takeLast = kotlin.collections.CollectionsKt.takeLast(split, i)) != null) {
                str2 = kotlin.collections.CollectionsKt.joinToString$default(takeLast, " ", null, null, 0, null, null, 62, null);
                return str2 != null ? "" : str2;
            }
        }
        str2 = null;
        if (str2 != null) {
        }
    }
}
