package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class OpenSSHPrivateKeyUtil {
    static final byte[] getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Strings.toByteArray("openssh-key-v1\u0000");

    public static byte[] encodePrivateKey(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        if (asymmetricKeyParameter == null) {
            throw new java.lang.IllegalArgumentException("param is null");
        }
        if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) && !(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.ECPrivateKeyParameters)) {
            if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.DSAPrivateKeyParameters) {
                org.bouncycastle.crypto.params.DSAPrivateKeyParameters dSAPrivateKeyParameters = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) asymmetricKeyParameter;
                org.bouncycastle.crypto.params.DSAParameters parameters = dSAPrivateKeyParameters.getParameters();
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
                aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(0L));
                aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(parameters.getP()));
                aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(parameters.getQ()));
                aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(parameters.getG()));
                aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(parameters.getG().modPow(dSAPrivateKeyParameters.getX(), parameters.getP())));
                aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(dSAPrivateKeyParameters.getX()));
                try {
                    return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded();
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode DSAPrivateKeyParameters ");
                    sb.append(e.getMessage());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
            }
            if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to convert ");
                sb2.append(asymmetricKeyParameter.getClass().getName());
                sb2.append(" to openssh private key");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = (org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) asymmetricKeyParameter;
            org.bouncycastle.crypto.params.Ed25519PublicKeyParameters generatePublicKey = ed25519PrivateKeyParameters.generatePublicKey();
            org.bouncycastle.crypto.util.SSHBuilder sSHBuilder = new org.bouncycastle.crypto.util.SSHBuilder();
            try {
                sSHBuilder.getHighSpeedVideoSizes.write(getHighSpeedVideoFpsRangesFor);
                byte[] byteArray = org.bouncycastle.util.Strings.toByteArray("none");
                sSHBuilder.getHighSpeedVideoFpsRanges(byteArray.length);
                try {
                    sSHBuilder.getHighSpeedVideoSizes.write(byteArray);
                    byte[] byteArray2 = org.bouncycastle.util.Strings.toByteArray("none");
                    sSHBuilder.getHighSpeedVideoFpsRanges(byteArray2.length);
                    try {
                        sSHBuilder.getHighSpeedVideoSizes.write(byteArray2);
                        byte[] byteArray3 = org.bouncycastle.util.Strings.toByteArray("");
                        sSHBuilder.getHighSpeedVideoFpsRanges(byteArray3.length);
                        try {
                            sSHBuilder.getHighSpeedVideoSizes.write(byteArray3);
                            sSHBuilder.getHighSpeedVideoFpsRanges(1);
                            byte[] encodePublicKey = org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.encodePublicKey(generatePublicKey);
                            sSHBuilder.getHighSpeedVideoFpsRanges(encodePublicKey.length);
                            try {
                                sSHBuilder.getHighSpeedVideoSizes.write(encodePublicKey);
                                org.bouncycastle.crypto.util.SSHBuilder sSHBuilder2 = new org.bouncycastle.crypto.util.SSHBuilder();
                                int nextInt = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom().nextInt();
                                sSHBuilder2.getHighSpeedVideoFpsRanges(nextInt);
                                sSHBuilder2.getHighSpeedVideoFpsRanges(nextInt);
                                byte[] byteArray4 = org.bouncycastle.util.Strings.toByteArray("ssh-ed25519");
                                sSHBuilder2.getHighSpeedVideoFpsRanges(byteArray4.length);
                                try {
                                    sSHBuilder2.getHighSpeedVideoSizes.write(byteArray4);
                                    byte[] encoded = generatePublicKey.getEncoded();
                                    sSHBuilder2.getHighSpeedVideoFpsRanges(encoded.length);
                                    try {
                                        sSHBuilder2.getHighSpeedVideoSizes.write(encoded);
                                        byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(ed25519PrivateKeyParameters.getEncoded(), encoded);
                                        sSHBuilder2.getHighSpeedVideoFpsRanges(concatenate.length);
                                        try {
                                            sSHBuilder2.getHighSpeedVideoSizes.write(concatenate);
                                            byte[] byteArray5 = org.bouncycastle.util.Strings.toByteArray("");
                                            sSHBuilder2.getHighSpeedVideoFpsRanges(byteArray5.length);
                                            try {
                                                sSHBuilder2.getHighSpeedVideoSizes.write(byteArray5);
                                                int size = sSHBuilder2.getHighSpeedVideoSizes.size() % 8;
                                                if (size != 0) {
                                                    for (int i = 1; i <= 8 - size; i++) {
                                                        sSHBuilder2.getHighSpeedVideoSizes.write(i);
                                                    }
                                                }
                                                byte[] byteArray6 = sSHBuilder2.getHighSpeedVideoSizes.toByteArray();
                                                sSHBuilder.getHighSpeedVideoFpsRanges(byteArray6.length);
                                                try {
                                                    sSHBuilder.getHighSpeedVideoSizes.write(byteArray6);
                                                    return sSHBuilder.getHighSpeedVideoSizes.toByteArray();
                                                } catch (java.io.IOException e2) {
                                                    throw new java.lang.IllegalStateException(e2.getMessage(), e2);
                                                }
                                            } catch (java.io.IOException e3) {
                                                throw new java.lang.IllegalStateException(e3.getMessage(), e3);
                                            }
                                        } catch (java.io.IOException e4) {
                                            throw new java.lang.IllegalStateException(e4.getMessage(), e4);
                                        }
                                    } catch (java.io.IOException e5) {
                                        throw new java.lang.IllegalStateException(e5.getMessage(), e5);
                                    }
                                } catch (java.io.IOException e6) {
                                    throw new java.lang.IllegalStateException(e6.getMessage(), e6);
                                }
                            } catch (java.io.IOException e7) {
                                throw new java.lang.IllegalStateException(e7.getMessage(), e7);
                            }
                        } catch (java.io.IOException e8) {
                            throw new java.lang.IllegalStateException(e8.getMessage(), e8);
                        }
                    } catch (java.io.IOException e9) {
                        throw new java.lang.IllegalStateException(e9.getMessage(), e9);
                    }
                } catch (java.io.IOException e10) {
                    throw new java.lang.IllegalStateException(e10.getMessage(), e10);
                }
            } catch (java.io.IOException e11) {
                throw new java.lang.IllegalStateException(e11.getMessage(), e11);
            }
        }
        return org.bouncycastle.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(asymmetricKeyParameter).parsePrivateKey().toASN1Primitive().getEncoded();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePrivateKeyBlob(byte[] bArr) {
        byte[] copyOfRange;
        int i;
        org.bouncycastle.crypto.params.AsymmetricKeyParameter eCPrivateKeyParameters;
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = null;
        if (bArr[0] == 48) {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr);
            if (aSN1Sequence.size() == 6) {
                int i2 = 0;
                while (true) {
                    if (i2 < aSN1Sequence.size()) {
                        if (!(aSN1Sequence.getObjectAt(i2) instanceof org.bouncycastle.asn1.ASN1Integer)) {
                            break;
                        }
                        i2++;
                    } else if (((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0)).getPositiveValue().equals(org.bouncycastle.util.BigIntegers.ZERO)) {
                        asymmetricKeyParameter = new org.bouncycastle.crypto.params.DSAPrivateKeyParameters(((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(5)).getPositiveValue(), new org.bouncycastle.crypto.params.DSAParameters(((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1)).getPositiveValue(), ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(2)).getPositiveValue(), ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(3)).getPositiveValue()));
                    }
                }
            } else if (aSN1Sequence.size() == 9) {
                int i3 = 0;
                while (true) {
                    if (i3 < aSN1Sequence.size()) {
                        if (!(aSN1Sequence.getObjectAt(i3) instanceof org.bouncycastle.asn1.ASN1Integer)) {
                            break;
                        }
                        i3++;
                    } else if (((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0)).getPositiveValue().equals(org.bouncycastle.util.BigIntegers.ZERO)) {
                        org.bouncycastle.asn1.pkcs.RSAPrivateKey rSAPrivateKey = org.bouncycastle.asn1.pkcs.RSAPrivateKey.getInstance(aSN1Sequence);
                        asymmetricKeyParameter = new org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient());
                    }
                }
            } else if (aSN1Sequence.size() == 4 && (aSN1Sequence.getObjectAt(3) instanceof org.bouncycastle.asn1.ASN1TaggedObject) && (aSN1Sequence.getObjectAt(2) instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
                org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(aSN1Sequence);
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(eCPrivateKey.getParametersObject());
                asymmetricKeyParameter = new org.bouncycastle.crypto.params.ECPrivateKeyParameters(eCPrivateKey.getKey(), new org.bouncycastle.crypto.params.ECNamedDomainParameters(aSN1ObjectIdentifier, org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(aSN1ObjectIdentifier)));
            }
        } else {
            org.bouncycastle.crypto.util.SSHBuffer sSHBuffer = new org.bouncycastle.crypto.util.SSHBuffer(getHighSpeedVideoFpsRangesFor, bArr);
            if (!"none".equals(org.bouncycastle.util.Strings.fromByteArray(sSHBuffer.getHighSpeedVideoSizes()))) {
                throw new java.lang.IllegalStateException("encrypted keys not supported");
            }
            sSHBuffer.getHighSpeedVideoFpsRanges();
            sSHBuffer.getHighSpeedVideoFpsRanges();
            if (sSHBuffer.Camera2StreamConfigurationMap() != 1) {
                throw new java.lang.IllegalStateException("multiple keys not supported");
            }
            org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.parsePublicKey(sSHBuffer.getHighSpeedVideoSizes());
            int Camera2StreamConfigurationMap = sSHBuffer.Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap == 0) {
                copyOfRange = new byte[0];
            } else {
                int i4 = sSHBuffer.getHighSpeedVideoFpsRanges;
                byte[] bArr2 = sSHBuffer.getHighResolutionOutputSizeshNQ4ISI;
                if (i4 > bArr2.length - Camera2StreamConfigurationMap) {
                    throw new java.lang.IllegalArgumentException("not enough data for block");
                }
                if (Camera2StreamConfigurationMap % 8 != 0) {
                    throw new java.lang.IllegalArgumentException("missing padding");
                }
                int i5 = i4 + Camera2StreamConfigurationMap;
                sSHBuffer.getHighSpeedVideoFpsRanges = i5;
                if (Camera2StreamConfigurationMap > 0 && (i = bArr2[i5 - 1] & 255) > 0 && i < 8) {
                    i5 -= i;
                    int i6 = 1;
                    int i7 = i5;
                    while (i6 <= i) {
                        if (i6 != (sSHBuffer.getHighResolutionOutputSizeshNQ4ISI[i7] & 255)) {
                            throw new java.lang.IllegalArgumentException("incorrect padding");
                        }
                        i6++;
                        i7++;
                    }
                }
                copyOfRange = org.bouncycastle.util.Arrays.copyOfRange(sSHBuffer.getHighResolutionOutputSizeshNQ4ISI, i4, i5);
            }
            if (sSHBuffer.getHighSpeedVideoFpsRanges < sSHBuffer.getHighResolutionOutputSizeshNQ4ISI.length) {
                throw new java.lang.IllegalArgumentException("decoded key has trailing data");
            }
            org.bouncycastle.crypto.util.SSHBuffer sSHBuffer2 = new org.bouncycastle.crypto.util.SSHBuffer(copyOfRange);
            if (sSHBuffer2.Camera2StreamConfigurationMap() != sSHBuffer2.Camera2StreamConfigurationMap()) {
                throw new java.lang.IllegalStateException("private key check values are not the same");
            }
            java.lang.String fromByteArray = org.bouncycastle.util.Strings.fromByteArray(sSHBuffer2.getHighSpeedVideoSizes());
            if ("ssh-ed25519".equals(fromByteArray)) {
                sSHBuffer2.getHighSpeedVideoSizes();
                byte[] highSpeedVideoSizes = sSHBuffer2.getHighSpeedVideoSizes();
                if (highSpeedVideoSizes.length != 64) {
                    throw new java.lang.IllegalStateException("private key value of wrong length");
                }
                eCPrivateKeyParameters = new org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters(highSpeedVideoSizes, 0);
            } else {
                if (fromByteArray.startsWith("ecdsa")) {
                    org.bouncycastle.asn1.ASN1ObjectIdentifier byName = org.bouncycastle.crypto.util.SSHNamedCurves.getByName(org.bouncycastle.util.Strings.fromByteArray(sSHBuffer2.getHighSpeedVideoSizes()));
                    if (byName == null) {
                        throw new java.lang.IllegalStateException("OID not found for: ".concat(java.lang.String.valueOf(fromByteArray)));
                    }
                    org.bouncycastle.asn1.x9.X9ECParameters byOID = org.bouncycastle.asn1.nist.NISTNamedCurves.getByOID(byName);
                    if (byOID == null) {
                        throw new java.lang.IllegalStateException("Curve not found for: ".concat(java.lang.String.valueOf(byName)));
                    }
                    sSHBuffer2.getHighSpeedVideoSizes();
                    eCPrivateKeyParameters = new org.bouncycastle.crypto.params.ECPrivateKeyParameters(new java.math.BigInteger(1, sSHBuffer2.getHighSpeedVideoSizes()), new org.bouncycastle.crypto.params.ECNamedDomainParameters(byName, byOID));
                }
                sSHBuffer2.getHighSpeedVideoFpsRanges();
                if (sSHBuffer2.getHighSpeedVideoFpsRanges < sSHBuffer2.getHighResolutionOutputSizeshNQ4ISI.length) {
                    throw new java.lang.IllegalArgumentException("private key block has trailing data");
                }
            }
            asymmetricKeyParameter = eCPrivateKeyParameters;
            sSHBuffer2.getHighSpeedVideoFpsRanges();
            if (sSHBuffer2.getHighSpeedVideoFpsRanges < sSHBuffer2.getHighResolutionOutputSizeshNQ4ISI.length) {
            }
        }
        if (asymmetricKeyParameter != null) {
            return asymmetricKeyParameter;
        }
        throw new java.lang.IllegalArgumentException("unable to parse key");
    }

    private OpenSSHPrivateKeyUtil() {
    }
}
