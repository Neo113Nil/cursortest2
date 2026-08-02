package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class OpenSSHPublicKeyUtil {
    public static byte[] encodePublicKey(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        if (asymmetricKeyParameter == null) {
            throw new java.lang.IllegalArgumentException("cipherParameters was null.");
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.RSAKeyParameters) {
            if (asymmetricKeyParameter.isPrivate()) {
                throw new java.lang.IllegalArgumentException("RSAKeyParamaters was for encryption");
            }
            org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters = (org.bouncycastle.crypto.params.RSAKeyParameters) asymmetricKeyParameter;
            org.bouncycastle.crypto.util.SSHBuilder sSHBuilder = new org.bouncycastle.crypto.util.SSHBuilder();
            byte[] byteArray = org.bouncycastle.util.Strings.toByteArray("ssh-rsa");
            sSHBuilder.getHighSpeedVideoFpsRanges(byteArray.length);
            try {
                sSHBuilder.getHighSpeedVideoSizes.write(byteArray);
                byte[] byteArray2 = rSAKeyParameters.getExponent().toByteArray();
                sSHBuilder.getHighSpeedVideoFpsRanges(byteArray2.length);
                try {
                    sSHBuilder.getHighSpeedVideoSizes.write(byteArray2);
                    byte[] byteArray3 = rSAKeyParameters.getModulus().toByteArray();
                    sSHBuilder.getHighSpeedVideoFpsRanges(byteArray3.length);
                    try {
                        sSHBuilder.getHighSpeedVideoSizes.write(byteArray3);
                        return sSHBuilder.getHighSpeedVideoSizes.toByteArray();
                    } catch (java.io.IOException e) {
                        throw new java.lang.IllegalStateException(e.getMessage(), e);
                    }
                } catch (java.io.IOException e2) {
                    throw new java.lang.IllegalStateException(e2.getMessage(), e2);
                }
            } catch (java.io.IOException e3) {
                throw new java.lang.IllegalStateException(e3.getMessage(), e3);
            }
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters) {
            org.bouncycastle.crypto.util.SSHBuilder sSHBuilder2 = new org.bouncycastle.crypto.util.SSHBuilder();
            org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) asymmetricKeyParameter;
            java.lang.String nameForParameters = org.bouncycastle.crypto.util.SSHNamedCurves.getNameForParameters(eCPublicKeyParameters.getParameters());
            if (nameForParameters == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to derive ssh curve name for ");
                sb.append(eCPublicKeyParameters.getParameters().getCurve().getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            byte[] byteArray4 = org.bouncycastle.util.Strings.toByteArray("ecdsa-sha2-".concat(java.lang.String.valueOf(nameForParameters)));
            sSHBuilder2.getHighSpeedVideoFpsRanges(byteArray4.length);
            try {
                sSHBuilder2.getHighSpeedVideoSizes.write(byteArray4);
                byte[] byteArray5 = org.bouncycastle.util.Strings.toByteArray(nameForParameters);
                sSHBuilder2.getHighSpeedVideoFpsRanges(byteArray5.length);
                try {
                    sSHBuilder2.getHighSpeedVideoSizes.write(byteArray5);
                    byte[] encoded = eCPublicKeyParameters.getQ().getEncoded(false);
                    sSHBuilder2.getHighSpeedVideoFpsRanges(encoded.length);
                    try {
                        sSHBuilder2.getHighSpeedVideoSizes.write(encoded);
                        return sSHBuilder2.getHighSpeedVideoSizes.toByteArray();
                    } catch (java.io.IOException e4) {
                        throw new java.lang.IllegalStateException(e4.getMessage(), e4);
                    }
                } catch (java.io.IOException e5) {
                    throw new java.lang.IllegalStateException(e5.getMessage(), e5);
                }
            } catch (java.io.IOException e6) {
                throw new java.lang.IllegalStateException(e6.getMessage(), e6);
            }
        }
        if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.DSAPublicKeyParameters)) {
            if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed25519PublicKeyParameters)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to convert ");
                sb2.append(asymmetricKeyParameter.getClass().getName());
                sb2.append(" to private key");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            org.bouncycastle.crypto.util.SSHBuilder sSHBuilder3 = new org.bouncycastle.crypto.util.SSHBuilder();
            byte[] byteArray6 = org.bouncycastle.util.Strings.toByteArray("ssh-ed25519");
            sSHBuilder3.getHighSpeedVideoFpsRanges(byteArray6.length);
            try {
                sSHBuilder3.getHighSpeedVideoSizes.write(byteArray6);
                byte[] encoded2 = ((org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
                sSHBuilder3.getHighSpeedVideoFpsRanges(encoded2.length);
                try {
                    sSHBuilder3.getHighSpeedVideoSizes.write(encoded2);
                    return sSHBuilder3.getHighSpeedVideoSizes.toByteArray();
                } catch (java.io.IOException e7) {
                    throw new java.lang.IllegalStateException(e7.getMessage(), e7);
                }
            } catch (java.io.IOException e8) {
                throw new java.lang.IllegalStateException(e8.getMessage(), e8);
            }
        }
        org.bouncycastle.crypto.params.DSAPublicKeyParameters dSAPublicKeyParameters = (org.bouncycastle.crypto.params.DSAPublicKeyParameters) asymmetricKeyParameter;
        org.bouncycastle.crypto.params.DSAParameters parameters = dSAPublicKeyParameters.getParameters();
        org.bouncycastle.crypto.util.SSHBuilder sSHBuilder4 = new org.bouncycastle.crypto.util.SSHBuilder();
        byte[] byteArray7 = org.bouncycastle.util.Strings.toByteArray("ssh-dss");
        sSHBuilder4.getHighSpeedVideoFpsRanges(byteArray7.length);
        try {
            sSHBuilder4.getHighSpeedVideoSizes.write(byteArray7);
            byte[] byteArray8 = parameters.getP().toByteArray();
            sSHBuilder4.getHighSpeedVideoFpsRanges(byteArray8.length);
            try {
                sSHBuilder4.getHighSpeedVideoSizes.write(byteArray8);
                byte[] byteArray9 = parameters.getQ().toByteArray();
                sSHBuilder4.getHighSpeedVideoFpsRanges(byteArray9.length);
                try {
                    sSHBuilder4.getHighSpeedVideoSizes.write(byteArray9);
                    byte[] byteArray10 = parameters.getG().toByteArray();
                    sSHBuilder4.getHighSpeedVideoFpsRanges(byteArray10.length);
                    try {
                        sSHBuilder4.getHighSpeedVideoSizes.write(byteArray10);
                        byte[] byteArray11 = dSAPublicKeyParameters.getY().toByteArray();
                        sSHBuilder4.getHighSpeedVideoFpsRanges(byteArray11.length);
                        try {
                            sSHBuilder4.getHighSpeedVideoSizes.write(byteArray11);
                            return sSHBuilder4.getHighSpeedVideoSizes.toByteArray();
                        } catch (java.io.IOException e9) {
                            throw new java.lang.IllegalStateException(e9.getMessage(), e9);
                        }
                    } catch (java.io.IOException e10) {
                        throw new java.lang.IllegalStateException(e10.getMessage(), e10);
                    }
                } catch (java.io.IOException e11) {
                    throw new java.lang.IllegalStateException(e11.getMessage(), e11);
                }
            } catch (java.io.IOException e12) {
                throw new java.lang.IllegalStateException(e12.getMessage(), e12);
            }
        } catch (java.io.IOException e13) {
            throw new java.lang.IllegalStateException(e13.getMessage(), e13);
        }
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePublicKey(org.bouncycastle.crypto.util.SSHBuffer sSHBuffer) {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter;
        java.lang.String fromByteArray = org.bouncycastle.util.Strings.fromByteArray(sSHBuffer.getHighSpeedVideoSizes());
        if ("ssh-rsa".equals(fromByteArray)) {
            asymmetricKeyParameter = new org.bouncycastle.crypto.params.RSAKeyParameters(false, sSHBuffer.getHighResolutionOutputSizeshNQ4ISI(), sSHBuffer.getHighResolutionOutputSizeshNQ4ISI());
        } else if ("ssh-dss".equals(fromByteArray)) {
            asymmetricKeyParameter = new org.bouncycastle.crypto.params.DSAPublicKeyParameters(sSHBuffer.getHighResolutionOutputSizeshNQ4ISI(), new org.bouncycastle.crypto.params.DSAParameters(sSHBuffer.getHighResolutionOutputSizeshNQ4ISI(), sSHBuffer.getHighResolutionOutputSizeshNQ4ISI(), sSHBuffer.getHighResolutionOutputSizeshNQ4ISI()));
        } else if (fromByteArray.startsWith("ecdsa")) {
            java.lang.String fromByteArray2 = org.bouncycastle.util.Strings.fromByteArray(sSHBuffer.getHighSpeedVideoSizes());
            org.bouncycastle.asn1.ASN1ObjectIdentifier byName = org.bouncycastle.crypto.util.SSHNamedCurves.getByName(fromByteArray2);
            org.bouncycastle.asn1.x9.X9ECParameters parameters = org.bouncycastle.crypto.util.SSHNamedCurves.getParameters(byName);
            if (parameters == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to find curve for ");
                sb.append(fromByteArray);
                sb.append(" using curve name ");
                sb.append(fromByteArray2);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            asymmetricKeyParameter = new org.bouncycastle.crypto.params.ECPublicKeyParameters(parameters.getCurve().decodePoint(sSHBuffer.getHighSpeedVideoSizes()), new org.bouncycastle.crypto.params.ECNamedDomainParameters(byName, parameters));
        } else if ("ssh-ed25519".equals(fromByteArray)) {
            byte[] highSpeedVideoSizes = sSHBuffer.getHighSpeedVideoSizes();
            if (highSpeedVideoSizes.length != 32) {
                throw new java.lang.IllegalStateException("public key value of wrong length");
            }
            asymmetricKeyParameter = new org.bouncycastle.crypto.params.Ed25519PublicKeyParameters(highSpeedVideoSizes, 0);
        } else {
            asymmetricKeyParameter = null;
        }
        if (asymmetricKeyParameter == null) {
            throw new java.lang.IllegalArgumentException("unable to parse key");
        }
        if (sSHBuffer.getHighSpeedVideoFpsRanges >= sSHBuffer.getHighResolutionOutputSizeshNQ4ISI.length) {
            return asymmetricKeyParameter;
        }
        throw new java.lang.IllegalArgumentException("decoded key has trailing data");
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePublicKey(byte[] bArr) {
        return parsePublicKey(new org.bouncycastle.crypto.util.SSHBuffer(bArr));
    }

    private OpenSSHPublicKeyUtil() {
    }
}
