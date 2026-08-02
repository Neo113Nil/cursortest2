package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class KTSParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.security.spec.AlgorithmParameterSpec getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public java.security.spec.AlgorithmParameterSpec getParameterSpec() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static final class Builder {
        private java.security.spec.AlgorithmParameterSpec Camera2StreamConfigurationMap;
        private byte[] getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
        private final java.lang.String getHighSpeedVideoSizes;

        public final org.bouncycastle.jcajce.spec.KTSParameterSpec.Builder withParameterSpec(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
            this.Camera2StreamConfigurationMap = algorithmParameterSpec;
            return this;
        }

        public final org.bouncycastle.jcajce.spec.KTSParameterSpec.Builder withKdfAlgorithm(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
            this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
            return this;
        }

        public final org.bouncycastle.jcajce.spec.KTSParameterSpec build() {
            return new org.bouncycastle.jcajce.spec.KTSParameterSpec(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
        }

        public Builder(java.lang.String str, int i, byte[] bArr) {
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_kdf_kdf3, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256));
            this.getHighResolutionOutputSizeshNQ4ISI = bArr == null ? new byte[0] : org.bouncycastle.util.Arrays.clone(bArr);
        }

        public Builder(java.lang.String str, int i) {
            this(str, i, null);
        }
    }

    public byte[] getOtherInfo() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int getKeySize() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getKeyAlgorithmName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKdfAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    /* synthetic */ KTSParameterSpec(java.lang.String str, int i, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte b) {
        this(str, i, algorithmParameterSpec, algorithmIdentifier, bArr);
    }

    private KTSParameterSpec(java.lang.String str, int i, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = algorithmParameterSpec;
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }
}
