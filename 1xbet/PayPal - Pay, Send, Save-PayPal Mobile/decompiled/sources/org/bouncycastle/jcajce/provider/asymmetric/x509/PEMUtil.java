package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
class PEMUtil {
    private final org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries[] getHighSpeedVideoFpsRangesFor;

    private org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries getHighSpeedVideoSizes(java.lang.String str) {
        org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries boundaries;
        int i = 0;
        while (true) {
            org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries[] boundariesArr = this.getHighSpeedVideoFpsRangesFor;
            if (i == boundariesArr.length) {
                return null;
            }
            boundaries = boundariesArr[i];
            if (str.startsWith(boundaries.getHighSpeedVideoFpsRanges) || str.startsWith(boundaries.getHighResolutionOutputSizeshNQ4ISI)) {
                break;
            }
            i++;
        }
        return boundaries;
    }

    final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(java.io.InputStream inputStream, boolean z) throws java.io.IOException {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries boundaries = null;
        while (boundaries == null) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(inputStream);
            if (highSpeedVideoFpsRanges == null) {
                break;
            }
            boundaries = getHighSpeedVideoSizes(highSpeedVideoFpsRanges);
            if (boundaries != null && !highSpeedVideoFpsRanges.startsWith(boundaries.getHighSpeedVideoFpsRanges)) {
                throw new java.io.IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (boundaries == null) {
            if (z) {
                throw new java.io.IOException("malformed PEM data: no header found");
            }
            return null;
        }
        org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries boundaries2 = null;
        while (boundaries2 == null) {
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(inputStream);
            if (highSpeedVideoFpsRanges2 == null) {
                break;
            }
            boundaries2 = getHighSpeedVideoSizes(highSpeedVideoFpsRanges2);
            if (boundaries2 == null) {
                stringBuffer.append(highSpeedVideoFpsRanges2);
            } else if (!highSpeedVideoFpsRanges2.startsWith(boundaries.getHighResolutionOutputSizeshNQ4ISI)) {
                throw new java.io.IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (boundaries2 == null) {
            throw new java.io.IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.util.encoders.Base64.decode(stringBuffer.toString()));
        } catch (java.lang.Exception unused) {
            throw new java.io.IOException("malformed PEM data encountered");
        }
    }

    class Boundaries {
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.String getHighSpeedVideoFpsRanges;

        /* synthetic */ Boundaries(org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil pEMUtil, java.lang.String str, byte b) {
            this(str);
        }

        private Boundaries(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("-----BEGIN ");
            sb.append(str);
            sb.append("-----");
            this.getHighSpeedVideoFpsRanges = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("-----END ");
            sb2.append(str);
            sb2.append("-----");
            this.getHighResolutionOutputSizeshNQ4ISI = sb2.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0.length() == 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String getHighSpeedVideoFpsRanges(java.io.InputStream inputStream) throws java.io.IOException {
        int read;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (true) {
            read = inputStream.read();
            if (read == 13 || read == 10 || read < 0) {
                break;
            }
            stringBuffer.append((char) read);
        }
        if (read < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
            return stringBuffer.toString();
        }
        if (read == 13) {
            inputStream.mark(1);
            int read2 = inputStream.read();
            if (read2 == 10) {
                inputStream.mark(1);
            }
            if (read2 > 0) {
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    PEMUtil(java.lang.String str) {
        byte b = 0;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries[]{new org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries(this, str, b), new org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries(this, "X509 ".concat(java.lang.String.valueOf(str)), b), new org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries(this, org.bouncycastle.openssl.PEMParser.TYPE_PKCS7, b)};
    }
}
