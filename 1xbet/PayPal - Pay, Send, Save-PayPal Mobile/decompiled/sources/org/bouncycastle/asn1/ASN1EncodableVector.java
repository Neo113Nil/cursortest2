package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1EncodableVector {
    static final org.bouncycastle.asn1.ASN1Encodable[] getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Encodable[0];
    int Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Encodable[] getHighSpeedVideoFpsRanges;

    final org.bouncycastle.asn1.ASN1Encodable[] getHighSpeedVideoSizes() {
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            return getHighSpeedVideoSizes;
        }
        org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = this.getHighSpeedVideoFpsRanges;
        if (aSN1EncodableArr.length == i) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return aSN1EncodableArr;
        }
        org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr2 = new org.bouncycastle.asn1.ASN1Encodable[i];
        java.lang.System.arraycopy(aSN1EncodableArr, 0, aSN1EncodableArr2, 0, i);
        return aSN1EncodableArr2;
    }

    public int size() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Encodable get(int i) {
        if (i < this.Camera2StreamConfigurationMap) {
            return this.getHighSpeedVideoFpsRanges[i];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append(" >= ");
        sb.append(this.Camera2StreamConfigurationMap);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
    }

    public void addAll(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        if (aSN1EncodableArr == null) {
            throw new java.lang.NullPointerException("'others' cannot be null");
        }
        getHighSpeedVideoSizes(aSN1EncodableArr, "'others' elements cannot be null");
    }

    public void addAll(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector == null) {
            throw new java.lang.NullPointerException("'other' cannot be null");
        }
        getHighSpeedVideoSizes(aSN1EncodableVector.getHighSpeedVideoFpsRanges, "'other' elements cannot be null");
    }

    public void add(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new java.lang.NullPointerException("'element' cannot be null");
        }
        int length = this.getHighSpeedVideoFpsRanges.length;
        int i = this.Camera2StreamConfigurationMap + 1;
        if (this.getHighResolutionOutputSizeshNQ4ISI | (i > length)) {
            Camera2StreamConfigurationMap(i);
        }
        this.getHighSpeedVideoFpsRanges[this.Camera2StreamConfigurationMap] = aSN1Encodable;
        this.Camera2StreamConfigurationMap = i;
    }

    private void Camera2StreamConfigurationMap(int i) {
        org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = new org.bouncycastle.asn1.ASN1Encodable[java.lang.Math.max(this.getHighSpeedVideoFpsRanges.length, i + (i >> 1))];
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, aSN1EncodableArr, 0, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRanges = aSN1EncodableArr;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr, java.lang.String str) {
        int length = aSN1EncodableArr.length;
        if (length <= 0) {
            return;
        }
        int length2 = this.getHighSpeedVideoFpsRanges.length;
        int i = this.Camera2StreamConfigurationMap + length;
        int i2 = 0;
        if ((i > length2) | this.getHighResolutionOutputSizeshNQ4ISI) {
            Camera2StreamConfigurationMap(i);
        }
        do {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = aSN1EncodableArr[i2];
            if (aSN1Encodable == null) {
                throw new java.lang.NullPointerException(str);
            }
            this.getHighSpeedVideoFpsRanges[this.Camera2StreamConfigurationMap + i2] = aSN1Encodable;
            i2++;
        } while (i2 < length);
        this.Camera2StreamConfigurationMap = i;
    }

    static org.bouncycastle.asn1.ASN1Encodable[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        return aSN1EncodableArr.length <= 0 ? getHighSpeedVideoSizes : (org.bouncycastle.asn1.ASN1Encodable[]) aSN1EncodableArr.clone();
    }

    public ASN1EncodableVector(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.getHighSpeedVideoFpsRanges = i == 0 ? getHighSpeedVideoSizes : new org.bouncycastle.asn1.ASN1Encodable[i];
        this.Camera2StreamConfigurationMap = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    public ASN1EncodableVector() {
        this(10);
    }
}
