package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class VPKCRequestData extends org.bouncycastle.dvcs.DVCSRequestData {
    private java.util.List getHighSpeedVideoFpsRanges;

    public java.util.List getCerts() {
        return java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
    }

    VPKCRequestData(org.bouncycastle.asn1.dvcs.Data data) throws org.bouncycastle.dvcs.DVCSConstructionException {
        super(data);
        org.bouncycastle.asn1.dvcs.TargetEtcChain[] certs = data.getCerts();
        if (certs == null) {
            throw new org.bouncycastle.dvcs.DVCSConstructionException("DVCSRequest.data.certs should be specified for VPKC service");
        }
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(certs.length);
        for (int i = 0; i != certs.length; i++) {
            this.getHighSpeedVideoFpsRanges.add(new org.bouncycastle.dvcs.TargetChain(certs[i]));
        }
    }
}
