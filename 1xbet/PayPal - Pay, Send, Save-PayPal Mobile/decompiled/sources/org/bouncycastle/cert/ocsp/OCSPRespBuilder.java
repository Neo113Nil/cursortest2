package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class OCSPRespBuilder {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;

    public org.bouncycastle.cert.ocsp.OCSPResp build(int i, java.lang.Object obj) throws org.bouncycastle.cert.ocsp.OCSPException {
        if (obj == null) {
            return new org.bouncycastle.cert.ocsp.OCSPResp(new org.bouncycastle.asn1.ocsp.OCSPResponse(new org.bouncycastle.asn1.ocsp.OCSPResponseStatus(i), null));
        }
        if (!(obj instanceof org.bouncycastle.cert.ocsp.BasicOCSPResp)) {
            throw new org.bouncycastle.cert.ocsp.OCSPException("unknown response object");
        }
        try {
            return new org.bouncycastle.cert.ocsp.OCSPResp(new org.bouncycastle.asn1.ocsp.OCSPResponse(new org.bouncycastle.asn1.ocsp.OCSPResponseStatus(i), new org.bouncycastle.asn1.ocsp.ResponseBytes(org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers.id_pkix_ocsp_basic, new org.bouncycastle.asn1.DEROctetString(((org.bouncycastle.cert.ocsp.BasicOCSPResp) obj).getEncoded()))));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cert.ocsp.OCSPException("can't encode object.", e);
        }
    }
}
