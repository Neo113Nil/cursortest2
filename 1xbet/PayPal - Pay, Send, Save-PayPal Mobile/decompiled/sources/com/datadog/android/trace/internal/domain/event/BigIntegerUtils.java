package com.datadog.android.trace.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/BigIntegerUtils;", "", "<init>", "()V", "Ljava/math/BigInteger;", "traceId", "", "leastSignificant64BitsAsDecimal", "(Ljava/math/BigInteger;)Ljava/lang/String;", "leastSignificant64BitsAsHex", "mostSignificant64BitsAsHex", "getHighSpeedVideoFpsRangesFor", "Ljava/math/BigInteger;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BigIntegerUtils {
    public static final com.datadog.android.trace.internal.domain.event.BigIntegerUtils INSTANCE = new com.datadog.android.trace.internal.domain.event.BigIntegerUtils();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.math.BigInteger getHighSpeedVideoSizes = new java.math.BigInteger("ffffffffffffffff", 16);

    private BigIntegerUtils() {
    }

    public final java.lang.String leastSignificant64BitsAsHex(java.math.BigInteger traceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceId, "");
        try {
            java.lang.String bigInteger = traceId.and(getHighSpeedVideoSizes).toString(16);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigInteger, "");
            return kotlin.text.StringsKt.padStart(bigInteger, 16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        } catch (java.lang.ArithmeticException | java.lang.NumberFormatException | java.lang.IllegalArgumentException unused) {
            return "";
        }
    }

    public final java.lang.String leastSignificant64BitsAsDecimal(java.math.BigInteger traceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceId, "");
        try {
            java.lang.String obj = traceId.and(getHighSpeedVideoSizes).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        } catch (java.lang.ArithmeticException | java.lang.NumberFormatException unused) {
            return "";
        }
    }

    public final java.lang.String mostSignificant64BitsAsHex(java.math.BigInteger traceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceId, "");
        try {
            java.lang.String bigInteger = traceId.shiftRight(64).toString(16);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigInteger, "");
            return kotlin.text.StringsKt.padStart(bigInteger, 16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        } catch (java.lang.ArithmeticException | java.lang.NumberFormatException | java.lang.IllegalArgumentException unused) {
            return "";
        }
    }
}
