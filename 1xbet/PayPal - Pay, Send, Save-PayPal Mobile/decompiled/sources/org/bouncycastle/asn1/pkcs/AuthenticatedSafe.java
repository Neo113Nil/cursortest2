package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class AuthenticatedSafe extends org.bouncycastle.asn1.ASN1Object {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.pkcs.ContentInfo[] getHighSpeedVideoFpsRanges;

    public AuthenticatedSafe(org.bouncycastle.asn1.pkcs.ContentInfo[] contentInfoArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        int length = contentInfoArr.length;
        org.bouncycastle.asn1.pkcs.ContentInfo[] contentInfoArr2 = new org.bouncycastle.asn1.pkcs.ContentInfo[length];
        java.lang.System.arraycopy(contentInfoArr, 0, contentInfoArr2, 0, length);
        this.getHighSpeedVideoFpsRanges = contentInfoArr2;
    }

    public org.bouncycastle.asn1.pkcs.ContentInfo[] getContentInfo() {
        org.bouncycastle.asn1.pkcs.ContentInfo[] contentInfoArr = this.getHighSpeedVideoFpsRanges;
        int length = contentInfoArr.length;
        org.bouncycastle.asn1.pkcs.ContentInfo[] contentInfoArr2 = new org.bouncycastle.asn1.pkcs.ContentInfo[length];
        java.lang.System.arraycopy(contentInfoArr, 0, contentInfoArr2, 0, length);
        return contentInfoArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI ? new org.bouncycastle.asn1.BERSequence(this.getHighSpeedVideoFpsRanges) : new org.bouncycastle.asn1.DLSequence(this.getHighSpeedVideoFpsRanges);
    }

    public static org.bouncycastle.asn1.pkcs.AuthenticatedSafe getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.AuthenticatedSafe) {
            return (org.bouncycastle.asn1.pkcs.AuthenticatedSafe) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.AuthenticatedSafe(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private AuthenticatedSafe(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.pkcs.ContentInfo[aSN1Sequence.size()];
        int i = 0;
        while (true) {
            org.bouncycastle.asn1.pkcs.ContentInfo[] contentInfoArr = this.getHighSpeedVideoFpsRanges;
            if (i == contentInfoArr.length) {
                this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence instanceof org.bouncycastle.asn1.BERSequence;
                return;
            } else {
                contentInfoArr[i] = org.bouncycastle.asn1.pkcs.ContentInfo.getInstance(aSN1Sequence.getObjectAt(i));
                i++;
            }
        }
    }
}
