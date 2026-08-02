package com.datadog.android.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u0007"}, d2 = {"Ljava/math/BigInteger;", "", "toHexString", "(Ljava/math/BigInteger;)Ljava/lang/String;", "", "(I)Ljava/lang/String;", "", "(J)Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NumberExtKt {
    public static final java.lang.String toHexString(int i) {
        java.lang.String num = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
        return num;
    }

    public static final java.lang.String toHexString(long j) {
        java.lang.String l = java.lang.Long.toString(j, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "");
        return l;
    }

    public static final java.lang.String toHexString(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "");
        return toHexString(bigInteger.longValue());
    }
}
