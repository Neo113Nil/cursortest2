package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class OCSPResp {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;
    private org.bouncycastle.asn1.ocsp.OCSPResponse getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.asn1.ocsp.OCSPResponse toASN1Structure() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public int getStatus() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getResponseStatus().getIntValue();
    }

    public java.lang.Object getResponseObject() throws org.bouncycastle.cert.ocsp.OCSPException {
        org.bouncycastle.asn1.ocsp.ResponseBytes responseBytes = this.getHighResolutionOutputSizeshNQ4ISI.getResponseBytes();
        if (responseBytes == null) {
            return null;
        }
        if (!responseBytes.getResponseType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers.id_pkix_ocsp_basic)) {
            return responseBytes.getResponse();
        }
        try {
            return new org.bouncycastle.cert.ocsp.BasicOCSPResp(org.bouncycastle.asn1.ocsp.BasicOCSPResponse.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(responseBytes.getResponse().getOctets())));
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.cert.ocsp.OCSPException("problem decoding object: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.cert.ocsp.OCSPResp) {
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(((org.bouncycastle.cert.ocsp.OCSPResp) obj).getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    public OCSPResp(byte[] bArr) throws java.io.IOException {
        this(new java.io.ByteArrayInputStream(bArr));
    }

    public OCSPResp(org.bouncycastle.asn1.ocsp.OCSPResponse oCSPResponse) {
        this.getHighResolutionOutputSizeshNQ4ISI = oCSPResponse;
    }

    private OCSPResp(org.bouncycastle.asn1.ASN1InputStream aSN1InputStream) throws java.io.IOException {
        try {
            org.bouncycastle.asn1.ocsp.OCSPResponse oCSPResponse = org.bouncycastle.asn1.ocsp.OCSPResponse.getInstance(aSN1InputStream.readObject());
            this.getHighResolutionOutputSizeshNQ4ISI = oCSPResponse;
            if (oCSPResponse == null) {
                throw new org.bouncycastle.cert.CertIOException("malformed response: no response data found");
            }
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed response: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("malformed response: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb2.toString(), e2);
        } catch (org.bouncycastle.asn1.ASN1Exception e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("malformed response: ");
            sb3.append(e3.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb3.toString(), e3);
        }
    }

    public OCSPResp(java.io.InputStream inputStream) throws java.io.IOException {
        this(new org.bouncycastle.asn1.ASN1InputStream(inputStream));
    }
}
