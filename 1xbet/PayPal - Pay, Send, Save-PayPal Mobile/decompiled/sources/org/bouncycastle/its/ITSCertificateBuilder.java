package org.bouncycastle.its;

/* loaded from: classes17.dex */
public class ITSCertificateBuilder {
    protected org.bouncycastle.oer.its.HashedId cracaId;
    protected org.bouncycastle.oer.its.CrlSeries crlSeries;
    protected final org.bouncycastle.its.ITSCertificate issuer;
    protected final org.bouncycastle.oer.its.ToBeSignedCertificate.Builder tbsCertificateBuilder;
    protected org.bouncycastle.asn1.ASN1Integer version;

    public org.bouncycastle.its.ITSCertificateBuilder setVersion(int i) {
        this.version = new org.bouncycastle.asn1.ASN1Integer(i);
        return this;
    }

    public org.bouncycastle.its.ITSCertificateBuilder setValidityPeriod(org.bouncycastle.its.ITSValidityPeriod iTSValidityPeriod) {
        this.tbsCertificateBuilder.setValidityPeriod(iTSValidityPeriod.toASN1Structure());
        return this;
    }

    public org.bouncycastle.its.ITSCertificateBuilder setCrlSeries(int i) {
        org.bouncycastle.oer.its.CrlSeries crlSeries = new org.bouncycastle.oer.its.CrlSeries(i);
        this.crlSeries = crlSeries;
        this.tbsCertificateBuilder.setCrlSeries(crlSeries);
        return this;
    }

    public org.bouncycastle.its.ITSCertificateBuilder setCracaId(byte[] bArr) {
        org.bouncycastle.oer.its.HashedId.HashedId3 hashedId3 = new org.bouncycastle.oer.its.HashedId.HashedId3(bArr);
        this.cracaId = hashedId3;
        this.tbsCertificateBuilder.setCracaId(hashedId3);
        return this;
    }

    public org.bouncycastle.its.ITSCertificateBuilder setCertIssuePermissions(org.bouncycastle.oer.its.PsidGroupPermissions... psidGroupPermissionsArr) {
        this.tbsCertificateBuilder.setCertIssuePermissions(org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions.builder().addGroupPermission(psidGroupPermissionsArr).createSequenceOfPsidGroupPermissions());
        return this;
    }

    public org.bouncycastle.its.ITSCertificateBuilder setAppPermissions(org.bouncycastle.oer.its.PsidSsp... psidSspArr) {
        org.bouncycastle.oer.its.SequenceOfPsidSsp.Builder builder = org.bouncycastle.oer.its.SequenceOfPsidSsp.builder();
        for (int i = 0; i != psidSspArr.length; i++) {
            builder.setItem(psidSspArr[i]);
        }
        this.tbsCertificateBuilder.setAppPermissions(builder.createSequenceOfPsidSsp());
        return this;
    }

    public org.bouncycastle.its.ITSCertificate getIssuer() {
        return this.issuer;
    }

    public ITSCertificateBuilder(org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder) {
        this(null, builder);
    }

    public ITSCertificateBuilder(org.bouncycastle.its.ITSCertificate iTSCertificate, org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder) {
        this.version = new org.bouncycastle.asn1.ASN1Integer(3L);
        this.cracaId = new org.bouncycastle.oer.its.HashedId.HashedId3(new byte[3]);
        this.crlSeries = new org.bouncycastle.oer.its.CrlSeries(0);
        this.issuer = iTSCertificate;
        this.tbsCertificateBuilder = builder;
        builder.setCracaId(this.cracaId);
        builder.setCrlSeries(this.crlSeries);
    }
}
