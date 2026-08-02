package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
final class HkdfHpkeKdf implements com.google.crypto.tink.hybrid.internal.HpkeKdf {
    private final java.lang.String macAlgorithm;

    HkdfHpkeKdf(java.lang.String str) {
        this.macAlgorithm = str;
    }

    private byte[] extract(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        javax.crypto.Mac engineFactory = com.google.crypto.tink.subtle.EngineFactory.MAC.getInstance(this.macAlgorithm);
        if (bArr2 == null || bArr2.length == 0) {
            engineFactory.init(new javax.crypto.spec.SecretKeySpec(new byte[engineFactory.getMacLength()], this.macAlgorithm));
        } else {
            engineFactory.init(new javax.crypto.spec.SecretKeySpec(bArr2, this.macAlgorithm));
        }
        return engineFactory.doFinal(bArr);
    }

    private byte[] expand(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
        javax.crypto.Mac engineFactory = com.google.crypto.tink.subtle.EngineFactory.MAC.getInstance(this.macAlgorithm);
        if (i > engineFactory.getMacLength() * 255) {
            throw new java.security.GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        engineFactory.init(new javax.crypto.spec.SecretKeySpec(bArr, this.macAlgorithm));
        byte[] bArr4 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            engineFactory.update(bArr4);
            engineFactory.update(bArr2);
            engineFactory.update((byte) i2);
            bArr4 = engineFactory.doFinal();
            if (bArr4.length + i3 < i) {
                java.lang.System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
                i3 += bArr4.length;
                i2++;
            } else {
                java.lang.System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                return bArr3;
            }
        }
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public final byte[] labeledExtract(byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3) throws java.security.GeneralSecurityException {
        return extract(com.google.crypto.tink.hybrid.internal.HpkeUtil.labelIkm(str, bArr2, bArr3), bArr);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public final byte[] labeledExpand(byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3, int i) throws java.security.GeneralSecurityException {
        return expand(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.labelInfo(str, bArr2, bArr3, i), i);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public final byte[] extractAndExpand(byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3, java.lang.String str2, byte[] bArr4, int i) throws java.security.GeneralSecurityException {
        return expand(extract(com.google.crypto.tink.hybrid.internal.HpkeUtil.labelIkm(str, bArr2, bArr4), bArr), com.google.crypto.tink.hybrid.internal.HpkeUtil.labelInfo(str2, bArr3, bArr4, i), i);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public final byte[] getKdfId() throws java.security.GeneralSecurityException {
        char c;
        java.lang.String str = this.macAlgorithm;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == 984523022) {
            if (str.equals("HmacSha256")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 984524074) {
            if (hashCode == 984525777 && str.equals("HmacSha512")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("HmacSha384")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA256_KDF_ID;
        }
        if (c == 1) {
            return com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA384_KDF_ID;
        }
        if (c == 2) {
            return com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA512_KDF_ID;
        }
        throw new java.security.GeneralSecurityException("Could not determine HPKE KDF ID");
    }

    final int getMacLength() throws java.security.GeneralSecurityException {
        return javax.crypto.Mac.getInstance(this.macAlgorithm).getMacLength();
    }
}
