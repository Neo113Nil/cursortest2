package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzp();
    private final com.google.android.gms.fido.fido2.api.common.Algorithm zza;

    /* loaded from: classes8.dex */
    public static class UnsupportedAlgorithmIdentifierException extends java.lang.Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UnsupportedAlgorithmIdentifierException(int i) {
            super(r0.toString());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Algorithm with COSE value ");
            sb.append(i);
            sb.append(" not supported");
        }
    }

    COSEAlgorithmIdentifier(com.google.android.gms.fido.fido2.api.common.Algorithm algorithm) {
        this.zza = (com.google.android.gms.fido.fido2.api.common.Algorithm) com.google.android.gms.common.internal.Preconditions.checkNotNull(algorithm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier fromCoseValue(int i) throws com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException {
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm rSAAlgorithm;
        if (i == com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            rSAAlgorithm = com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS1;
        } else {
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] values = com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (com.google.android.gms.fido.fido2.api.common.RSAAlgorithm rSAAlgorithm2 : com.google.android.gms.fido.fido2.api.common.EC2Algorithm.values()) {
                        if (rSAAlgorithm2.getAlgoValue() == i) {
                            rSAAlgorithm = rSAAlgorithm2;
                        }
                    }
                    throw new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException(i);
                }
                com.google.android.gms.fido.fido2.api.common.RSAAlgorithm rSAAlgorithm3 = values[i2];
                if (rSAAlgorithm3.getAlgoValue() == i) {
                    rSAAlgorithm = rSAAlgorithm3;
                    break;
                }
                i2++;
            }
        }
        return new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier(rSAAlgorithm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("COSEAlgorithmIdentifier{algorithm=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
