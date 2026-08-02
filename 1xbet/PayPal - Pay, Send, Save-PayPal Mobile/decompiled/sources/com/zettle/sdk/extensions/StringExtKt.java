package com.zettle.sdk.extensions;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getSafe", "(Ljava/lang/String;)Ljava/lang/String;", "safe"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StringExtKt {
    public static final java.lang.String getSafe(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (!kotlin.text.StringsKt.isBlank(str)) {
            java.lang.String take = kotlin.text.StringsKt.take(str, 2);
            java.lang.String takeLast = kotlin.text.StringsKt.takeLast(str, 2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(take);
            sb.append("..");
            sb.append(takeLast);
            return sb.toString();
        }
        return "null";
    }
}
