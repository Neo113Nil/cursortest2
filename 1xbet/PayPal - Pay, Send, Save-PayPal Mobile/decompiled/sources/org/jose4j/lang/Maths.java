package org.jose4j.lang;

/* loaded from: classes18.dex */
public class Maths {
    public static long add(long j, long j2) {
        long j3 = j + j2;
        if (0 <= ((j ^ j3) & (j2 ^ j3))) {
            return j3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("long overflow adding: ");
        sb.append(j);
        sb.append(" + ");
        sb.append(j2);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(j3);
        throw new java.lang.ArithmeticException(sb.toString());
    }

    public static long subtract(long j, long j2) {
        long j3 = j - j2;
        if (0 <= ((j ^ j2) & (j ^ j3))) {
            return j3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("long overflow subtracting: ");
        sb.append(j);
        sb.append(" - ");
        sb.append(j2);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(j3);
        throw new java.lang.ArithmeticException(sb.toString());
    }
}
