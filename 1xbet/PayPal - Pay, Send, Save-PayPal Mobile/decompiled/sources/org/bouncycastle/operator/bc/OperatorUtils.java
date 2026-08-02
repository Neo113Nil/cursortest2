package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
class OperatorUtils {
    static byte[] getHighSpeedVideoSizes(org.bouncycastle.operator.GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof java.security.Key) {
            return ((java.security.Key) genericKey.getRepresentation()).getEncoded();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return (byte[]) genericKey.getRepresentation();
        }
        throw new java.lang.IllegalArgumentException("unknown generic key type");
    }

    OperatorUtils() {
    }
}
