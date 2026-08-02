package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
class Utils {
    static org.bouncycastle.asn1.cmc.BodyPartID[] getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.cmc.BodyPartID[] bodyPartIDArr = new org.bouncycastle.asn1.cmc.BodyPartID[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            bodyPartIDArr[i] = org.bouncycastle.asn1.cmc.BodyPartID.getInstance(aSN1Sequence.getObjectAt(i));
        }
        return bodyPartIDArr;
    }

    static org.bouncycastle.asn1.x509.Extension[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.Extension[] extensionArr) {
        org.bouncycastle.asn1.x509.Extension[] extensionArr2 = new org.bouncycastle.asn1.x509.Extension[extensionArr.length];
        java.lang.System.arraycopy(extensionArr, 0, extensionArr2, 0, extensionArr.length);
        return extensionArr2;
    }

    static org.bouncycastle.asn1.cmc.BodyPartID[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.cmc.BodyPartID[] bodyPartIDArr) {
        org.bouncycastle.asn1.cmc.BodyPartID[] bodyPartIDArr2 = new org.bouncycastle.asn1.cmc.BodyPartID[bodyPartIDArr.length];
        java.lang.System.arraycopy(bodyPartIDArr, 0, bodyPartIDArr2, 0, bodyPartIDArr.length);
        return bodyPartIDArr2;
    }

    Utils() {
    }
}
