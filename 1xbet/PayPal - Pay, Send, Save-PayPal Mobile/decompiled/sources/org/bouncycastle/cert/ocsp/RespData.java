package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class RespData {
    private org.bouncycastle.asn1.ocsp.ResponseData getHighSpeedVideoFpsRangesFor;

    public int getVersion() {
        return this.getHighSpeedVideoFpsRangesFor.getVersion().intValueExact() + 1;
    }

    public org.bouncycastle.cert.ocsp.SingleResp[] getResponses() {
        org.bouncycastle.asn1.ASN1Sequence responses = this.getHighSpeedVideoFpsRangesFor.getResponses();
        int size = responses.size();
        org.bouncycastle.cert.ocsp.SingleResp[] singleRespArr = new org.bouncycastle.cert.ocsp.SingleResp[size];
        for (int i = 0; i != size; i++) {
            singleRespArr[i] = new org.bouncycastle.cert.ocsp.SingleResp(org.bouncycastle.asn1.ocsp.SingleResponse.getInstance(responses.getObjectAt(i)));
        }
        return singleRespArr;
    }

    public org.bouncycastle.asn1.x509.Extensions getResponseExtensions() {
        return this.getHighSpeedVideoFpsRangesFor.getResponseExtensions();
    }

    public org.bouncycastle.cert.ocsp.RespID getResponderId() {
        return new org.bouncycastle.cert.ocsp.RespID(this.getHighSpeedVideoFpsRangesFor.getResponderID());
    }

    public java.util.Date getProducedAt() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.getProducedAt());
    }

    public RespData(org.bouncycastle.asn1.ocsp.ResponseData responseData) {
        this.getHighSpeedVideoFpsRangesFor = responseData;
    }
}
