package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
class CMSUtils {
    static org.bouncycastle.crypto.CipherParameters getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.operator.GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof org.bouncycastle.crypto.CipherParameters) {
            return (org.bouncycastle.crypto.CipherParameters) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new org.bouncycastle.crypto.params.KeyParameter((byte[]) genericKey.getRepresentation());
        }
        throw new java.lang.IllegalArgumentException("unknown generic key type");
    }

    CMSUtils() {
    }
}
