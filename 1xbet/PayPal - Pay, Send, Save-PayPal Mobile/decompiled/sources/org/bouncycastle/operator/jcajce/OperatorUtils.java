package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
class OperatorUtils {
    static java.security.Key getHighSpeedVideoSizes(org.bouncycastle.operator.GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof java.security.Key) {
            return (java.security.Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new javax.crypto.spec.SecretKeySpec((byte[]) genericKey.getRepresentation(), "ENC");
        }
        throw new java.lang.IllegalArgumentException("unknown generic key type");
    }

    OperatorUtils() {
    }
}
