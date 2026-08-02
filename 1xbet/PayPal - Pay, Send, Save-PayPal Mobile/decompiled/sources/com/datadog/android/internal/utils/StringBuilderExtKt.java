package com.datadog.android.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "", "char", "appendIfNotEmpty", "(Ljava/lang/StringBuilder;C)Ljava/lang/StringBuilder;", "", "str", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StringBuilderExtKt {
    public static final java.lang.StringBuilder appendIfNotEmpty(java.lang.StringBuilder sb, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (sb.length() > 0) {
            sb.append(str);
        }
        return sb;
    }

    public static final java.lang.StringBuilder appendIfNotEmpty(java.lang.StringBuilder sb, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        if (sb.length() > 0) {
            sb.append(c);
        }
        return sb;
    }
}
