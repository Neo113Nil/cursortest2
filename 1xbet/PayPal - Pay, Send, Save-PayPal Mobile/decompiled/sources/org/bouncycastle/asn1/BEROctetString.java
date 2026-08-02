package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BEROctetString extends org.bouncycastle.asn1.ASN1OctetString {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1OctetString[] getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges == null && this.getHighSpeedVideoFpsRangesFor.length <= this.getHighResolutionOutputSizeshNQ4ISI) {
            org.bouncycastle.asn1.DEROctetString.getHighSpeedVideoFpsRangesFor(aSN1OutputStream, z, this.getHighSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoFpsRangesFor.length);
            return;
        }
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(36);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(128);
        org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr = this.getHighSpeedVideoFpsRanges;
        if (aSN1OctetStringArr != null) {
            aSN1OutputStream.getHighSpeedVideoSizes(aSN1OctetStringArr);
        } else {
            int i = 0;
            while (i < this.getHighSpeedVideoFpsRangesFor.length) {
                int min = java.lang.Math.min(this.getHighSpeedVideoFpsRangesFor.length - i, this.getHighResolutionOutputSizeshNQ4ISI);
                org.bouncycastle.asn1.DEROctetString.getHighSpeedVideoFpsRangesFor(aSN1OutputStream, true, this.getHighSpeedVideoFpsRangesFor, i, min);
                i += min;
            }
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(0);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges == null && this.getHighSpeedVideoFpsRangesFor.length <= this.getHighResolutionOutputSizeshNQ4ISI) {
            return org.bouncycastle.asn1.DEROctetString.getHighResolutionOutputSizeshNQ4ISI(z, this.getHighSpeedVideoFpsRangesFor.length);
        }
        int i = z ? 4 : 3;
        if (this.getHighSpeedVideoFpsRanges == null) {
            int length = this.getHighSpeedVideoFpsRangesFor.length;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = length / i2;
            int highResolutionOutputSizeshNQ4ISI = i + (org.bouncycastle.asn1.DEROctetString.getHighResolutionOutputSizeshNQ4ISI(true, i2) * i3);
            int length2 = this.getHighSpeedVideoFpsRangesFor.length - (i3 * this.getHighResolutionOutputSizeshNQ4ISI);
            return length2 > 0 ? highResolutionOutputSizeshNQ4ISI + org.bouncycastle.asn1.DEROctetString.getHighResolutionOutputSizeshNQ4ISI(true, length2) : highResolutionOutputSizeshNQ4ISI;
        }
        int i4 = 0;
        while (true) {
            org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr = this.getHighSpeedVideoFpsRanges;
            if (i4 >= aSN1OctetStringArr.length) {
                return i;
            }
            i += aSN1OctetStringArr[i4].getHighSpeedVideoSizes(true);
            i4++;
        }
    }

    public java.util.Enumeration getObjects() {
        return this.getHighSpeedVideoFpsRanges == null ? new java.util.Enumeration() { // from class: org.bouncycastle.asn1.BEROctetString.1
            int getHighSpeedVideoSizes = 0;

            @Override // java.util.Enumeration
            public java.lang.Object nextElement() {
                if (this.getHighSpeedVideoSizes >= org.bouncycastle.asn1.BEROctetString.this.getHighSpeedVideoFpsRangesFor.length) {
                    throw new java.util.NoSuchElementException();
                }
                int min = java.lang.Math.min(org.bouncycastle.asn1.BEROctetString.this.getHighSpeedVideoFpsRangesFor.length - this.getHighSpeedVideoSizes, org.bouncycastle.asn1.BEROctetString.this.getHighResolutionOutputSizeshNQ4ISI);
                byte[] bArr = new byte[min];
                java.lang.System.arraycopy(org.bouncycastle.asn1.BEROctetString.this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, bArr, 0, min);
                this.getHighSpeedVideoSizes += min;
                return new org.bouncycastle.asn1.DEROctetString(bArr);
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.getHighSpeedVideoSizes < org.bouncycastle.asn1.BEROctetString.this.getHighSpeedVideoFpsRangesFor.length;
            }
        } : new java.util.Enumeration() { // from class: org.bouncycastle.asn1.BEROctetString.2
            int getHighResolutionOutputSizeshNQ4ISI = 0;

            @Override // java.util.Enumeration
            public java.lang.Object nextElement() {
                if (this.getHighResolutionOutputSizeshNQ4ISI >= org.bouncycastle.asn1.BEROctetString.this.getHighSpeedVideoFpsRanges.length) {
                    throw new java.util.NoSuchElementException();
                }
                org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr = org.bouncycastle.asn1.BEROctetString.this.getHighSpeedVideoFpsRanges;
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
                return aSN1OctetStringArr[i];
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.getHighResolutionOutputSizeshNQ4ISI < org.bouncycastle.asn1.BEROctetString.this.getHighSpeedVideoFpsRanges.length;
            }
        };
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges != null || this.getHighSpeedVideoFpsRangesFor.length > this.getHighResolutionOutputSizeshNQ4ISI;
    }

    static byte[] getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr) {
        int length = aSN1OctetStringArr.length;
        if (length == 0) {
            return getHighSpeedVideoSizes;
        }
        if (length == 1) {
            return aSN1OctetStringArr[0].getHighSpeedVideoFpsRangesFor;
        }
        int i = 0;
        for (org.bouncycastle.asn1.ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
            i += aSN1OctetString.getHighSpeedVideoFpsRangesFor.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (org.bouncycastle.asn1.ASN1OctetString aSN1OctetString2 : aSN1OctetStringArr) {
            byte[] bArr2 = aSN1OctetString2.getHighSpeedVideoFpsRangesFor;
            java.lang.System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    public BEROctetString(org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr, int i) {
        this(getHighSpeedVideoSizes(aSN1OctetStringArr), aSN1OctetStringArr, i);
    }

    public BEROctetString(org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr) {
        this(aSN1OctetStringArr, 1000);
    }

    private BEROctetString(byte[] bArr, org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr, int i) {
        super(bArr);
        this.getHighSpeedVideoFpsRanges = aSN1OctetStringArr;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public BEROctetString(byte[] bArr, int i) {
        this(bArr, null, i);
    }

    public BEROctetString(byte[] bArr) {
        this(bArr, 1000);
    }
}
