package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public final class DERMacData {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;

    public static final class Builder {
        private org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
        private byte[] getHighSpeedVideoFpsRanges;
        private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
        private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;
        private final org.bouncycastle.crypto.util.DERMacData.Type getOutputFormats;

        public final org.bouncycastle.crypto.util.DERMacData build() {
            int i = org.bouncycastle.crypto.util.DERMacData.AnonymousClass1.getHighSpeedVideoFpsRanges[this.getOutputFormats.ordinal()];
            byte b = 0;
            if (i == 1 || i == 2) {
                return new org.bouncycastle.crypto.util.DERMacData(org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.util.Arrays.concatenate(this.getOutputFormats.getHeader(), org.bouncycastle.crypto.util.DerUtil.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI), org.bouncycastle.crypto.util.DerUtil.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes)), org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.crypto.util.DerUtil.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor), org.bouncycastle.crypto.util.DerUtil.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRanges)), b);
            }
            if (i != 3 && i != 4) {
                throw new java.lang.IllegalStateException("Unknown type encountered in build");
            }
            return new org.bouncycastle.crypto.util.DERMacData(org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.util.Arrays.concatenate(this.getOutputFormats.getHeader(), org.bouncycastle.crypto.util.DerUtil.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes), org.bouncycastle.crypto.util.DerUtil.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI)), org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.crypto.util.DerUtil.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap), org.bouncycastle.crypto.util.DerUtil.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoFpsRanges)), b);
        }

        public final org.bouncycastle.crypto.util.DERMacData.Builder withText(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.crypto.util.DerUtil.Camera2StreamConfigurationMap(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.crypto.util.DerUtil.getHighSpeedVideoFpsRanges(bArr)));
            return this;
        }

        public Builder(org.bouncycastle.crypto.util.DERMacData.Type type, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.getOutputFormats = type;
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.util.DerUtil.getHighSpeedVideoFpsRanges(bArr);
            this.getHighSpeedVideoSizes = org.bouncycastle.crypto.util.DerUtil.getHighSpeedVideoFpsRanges(bArr2);
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.crypto.util.DerUtil.getHighSpeedVideoFpsRanges(bArr3);
            this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.util.DerUtil.getHighSpeedVideoFpsRanges(bArr4);
        }
    }

    public enum Type {
        UNILATERALU("KC_1_U"),
        UNILATERALV("KC_1_V"),
        BILATERALU("KC_2_U"),
        BILATERALV("KC_2_V");

        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public final byte[] getHeader() {
            return org.bouncycastle.util.Strings.toByteArray(this.getHighSpeedVideoFpsRangesFor);
        }

        Type(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }
    }

    public final byte[] getMacData() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: org.bouncycastle.crypto.util.DERMacData$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[org.bouncycastle.crypto.util.DERMacData.Type.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[org.bouncycastle.crypto.util.DERMacData.Type.UNILATERALU.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.crypto.util.DERMacData.Type.BILATERALU.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.crypto.util.DERMacData.Type.UNILATERALV.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.bouncycastle.crypto.util.DERMacData.Type.BILATERALV.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* synthetic */ DERMacData(byte[] bArr, byte b) {
        this(bArr);
    }

    private DERMacData(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }
}
