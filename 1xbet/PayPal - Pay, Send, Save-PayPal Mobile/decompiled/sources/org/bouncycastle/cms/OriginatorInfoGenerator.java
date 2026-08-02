package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class OriginatorInfoGenerator {
    private final java.util.List getHighSpeedVideoFpsRangesFor;
    private final java.util.List getHighSpeedVideoSizes;

    public org.bouncycastle.cms.OriginatorInformation generate() {
        return this.getHighSpeedVideoSizes != null ? new org.bouncycastle.cms.OriginatorInformation(new org.bouncycastle.asn1.cms.OriginatorInfo(org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor), org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes))) : new org.bouncycastle.cms.OriginatorInformation(new org.bouncycastle.asn1.cms.OriginatorInfo(org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor), null));
    }

    public OriginatorInfoGenerator(org.bouncycastle.util.Store store, org.bouncycastle.util.Store store2) throws org.bouncycastle.cms.CMSException {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRanges(store);
        this.getHighSpeedVideoSizes = store2 != null ? org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(store2) : null;
    }

    public OriginatorInfoGenerator(org.bouncycastle.util.Store store) throws org.bouncycastle.cms.CMSException {
        this(store, null);
    }

    public OriginatorInfoGenerator(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        this.getHighSpeedVideoFpsRangesFor = arrayList;
        this.getHighSpeedVideoSizes = null;
        arrayList.add(x509CertificateHolder.toASN1Structure());
    }
}
