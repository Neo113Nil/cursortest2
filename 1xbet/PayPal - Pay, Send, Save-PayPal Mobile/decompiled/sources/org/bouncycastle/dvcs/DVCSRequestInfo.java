package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class DVCSRequestInfo {
    private org.bouncycastle.asn1.dvcs.DVCSRequestInformation getHighResolutionOutputSizeshNQ4ISI;

    public static boolean validate(org.bouncycastle.dvcs.DVCSRequestInfo dVCSRequestInfo, org.bouncycastle.dvcs.DVCSRequestInfo dVCSRequestInfo2) {
        org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation = dVCSRequestInfo.getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation2 = dVCSRequestInfo2.getHighResolutionOutputSizeshNQ4ISI;
        if (dVCSRequestInformation.getVersion() != dVCSRequestInformation2.getVersion()) {
            return false;
        }
        org.bouncycastle.asn1.dvcs.ServiceType service = dVCSRequestInformation.getService();
        org.bouncycastle.asn1.dvcs.ServiceType service2 = dVCSRequestInformation2.getService();
        if ((service == null && service2 == null) || (service != null && service.equals(service2))) {
            org.bouncycastle.asn1.dvcs.DVCSTime requestTime = dVCSRequestInformation.getRequestTime();
            org.bouncycastle.asn1.dvcs.DVCSTime requestTime2 = dVCSRequestInformation2.getRequestTime();
            if ((requestTime == null && requestTime2 == null) || (requestTime != null && requestTime.equals(requestTime2))) {
                org.bouncycastle.asn1.x509.PolicyInformation requestPolicy = dVCSRequestInformation.getRequestPolicy();
                org.bouncycastle.asn1.x509.PolicyInformation requestPolicy2 = dVCSRequestInformation2.getRequestPolicy();
                if ((requestPolicy == null && requestPolicy2 == null) || (requestPolicy != null && requestPolicy.equals(requestPolicy2))) {
                    org.bouncycastle.asn1.x509.Extensions extensions = dVCSRequestInformation.getExtensions();
                    org.bouncycastle.asn1.x509.Extensions extensions2 = dVCSRequestInformation2.getExtensions();
                    if ((extensions == null && extensions2 == null) || (extensions != null && extensions.equals(extensions2))) {
                        if (dVCSRequestInformation.getNonce() == null) {
                            return true;
                        }
                        if (dVCSRequestInformation2.getNonce() == null) {
                            return false;
                        }
                        byte[] byteArray = dVCSRequestInformation.getNonce().toByteArray();
                        byte[] byteArray2 = dVCSRequestInformation2.getNonce().toByteArray();
                        return byteArray2.length >= byteArray.length && org.bouncycastle.util.Arrays.areEqual(byteArray, org.bouncycastle.util.Arrays.copyOfRange(byteArray2, 0, byteArray.length));
                    }
                }
            }
        }
        return false;
    }

    public org.bouncycastle.asn1.dvcs.DVCSRequestInformation toASN1Structure() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getVersion() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getVersion();
    }

    public int getServiceType() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getService().getValue().intValue();
    }

    public org.bouncycastle.asn1.x509.GeneralNames getRequester() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getRequester();
    }

    public java.util.Date getRequestTime() throws org.bouncycastle.dvcs.DVCSParsingException {
        org.bouncycastle.asn1.dvcs.DVCSTime requestTime = this.getHighResolutionOutputSizeshNQ4ISI.getRequestTime();
        if (requestTime == null) {
            return null;
        }
        try {
            return requestTime.getGenTime() != null ? requestTime.getGenTime().getDate() : new org.bouncycastle.tsp.TimeStampToken(requestTime.getTimeStampToken()).getTimeStampInfo().getGenTime();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to extract time: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.dvcs.DVCSParsingException(sb.toString(), e);
        }
    }

    public org.bouncycastle.asn1.x509.PolicyInformation getRequestPolicy() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getRequestPolicy() != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getRequestPolicy();
        }
        return null;
    }

    public java.math.BigInteger getNonce() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getNonce();
    }

    public org.bouncycastle.asn1.x509.GeneralNames getDataLocations() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDataLocations();
    }

    public org.bouncycastle.asn1.x509.GeneralNames getDVCSNames() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDVCS();
    }

    public DVCSRequestInfo(byte[] bArr) {
        this(org.bouncycastle.asn1.dvcs.DVCSRequestInformation.getInstance(bArr));
    }

    public DVCSRequestInfo(org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation) {
        this.getHighResolutionOutputSizeshNQ4ISI = dVCSRequestInformation;
    }
}
