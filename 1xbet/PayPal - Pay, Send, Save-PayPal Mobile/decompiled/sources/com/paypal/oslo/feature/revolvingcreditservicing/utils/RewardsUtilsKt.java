package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"", "enteredAmount", "", "percent", "roundingStrategy", "", "scale", "", "calculatePoints", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;)J", "Ljava/math/BigDecimal;", "getHighSpeedVideoSizes", "Ljava/math/BigDecimal;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RewardsUtilsKt {
    private static final java.math.BigDecimal getHighSpeedVideoSizes = new java.math.BigDecimal(100);

    public static /* synthetic */ long calculatePoints$default(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        return calculatePoints(str, f, str2, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long calculatePoints(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Integer num) {
        java.math.RoundingMode roundingMode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(java.lang.String.valueOf(f != null ? f.floatValue() : 0.0f));
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(str);
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = java.math.BigDecimal.ZERO;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
        java.math.BigDecimal multiply = bigDecimalOrNull.multiply(bigDecimal);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multiply, "");
        java.math.BigDecimal multiply2 = multiply.multiply(getHighSpeedVideoSizes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multiply2, "");
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != 2715) {
                if (hashCode != 1150502190) {
                    if (hashCode == 1409017383 && str2.equals("HALF_UP")) {
                        roundingMode = java.math.RoundingMode.HALF_UP;
                    }
                } else if (str2.equals("HALF_DOWN")) {
                    roundingMode = java.math.RoundingMode.HALF_DOWN;
                }
            } else if (str2.equals("UP")) {
                roundingMode = java.math.RoundingMode.UP;
            }
            return multiply2.setScale(num == null ? num.intValue() : 0, roundingMode).longValue();
        }
        roundingMode = java.math.RoundingMode.DOWN;
        return multiply2.setScale(num == null ? num.intValue() : 0, roundingMode).longValue();
    }
}
