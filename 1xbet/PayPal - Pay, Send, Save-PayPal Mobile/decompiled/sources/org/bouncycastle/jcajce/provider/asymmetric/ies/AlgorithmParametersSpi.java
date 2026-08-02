package org.bouncycastle.jcajce.provider.asymmetric.ies;

/* loaded from: classes17.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    org.bouncycastle.jce.spec.IESParameterSpec getHighResolutionOutputSizeshNQ4ISI;

    protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
        if (cls == org.bouncycastle.jce.spec.IESParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }

    protected boolean isASN1FormatString(java.lang.String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.lang.String engineToString() {
        return "IES Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
        if (!isASN1FormatString(str) && !str.equalsIgnoreCase("X.509")) {
            throw new java.io.IOException("Unknown parameter format ".concat(java.lang.String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws java.io.IOException {
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr);
            if (aSN1Sequence.size() > 5) {
                throw new java.io.IOException("sequence too big");
            }
            java.util.Enumeration objects = aSN1Sequence.getObjects();
            java.math.BigInteger bigInteger = null;
            boolean z = false;
            java.math.BigInteger bigInteger2 = null;
            byte[] bArr2 = null;
            byte[] bArr3 = null;
            byte[] bArr4 = null;
            while (objects.hasMoreElements()) {
                java.lang.Object nextElement = objects.nextElement();
                if (nextElement instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                    org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(nextElement);
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        bArr2 = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false).getOctets();
                    } else if (aSN1TaggedObject.getTagNo() == 1) {
                        bArr3 = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false).getOctets();
                    }
                } else if (nextElement instanceof org.bouncycastle.asn1.ASN1Integer) {
                    bigInteger2 = org.bouncycastle.asn1.ASN1Integer.getInstance(nextElement).getValue();
                } else if (nextElement instanceof org.bouncycastle.asn1.ASN1Sequence) {
                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(nextElement);
                    java.math.BigInteger value = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).getValue();
                    bArr4 = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(1)).getOctets();
                    bigInteger = value;
                } else if (nextElement instanceof org.bouncycastle.asn1.ASN1Boolean) {
                    z = org.bouncycastle.asn1.ASN1Boolean.getInstance(nextElement).isTrue();
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = bigInteger != null ? new org.bouncycastle.jce.spec.IESParameterSpec(bArr2, bArr3, bigInteger2.intValue(), bigInteger.intValue(), bArr4, z) : new org.bouncycastle.jce.spec.IESParameterSpec(bArr2, bArr3, bigInteger2.intValue(), -1, null, z);
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.io.IOException("Not a valid IES Parameter encoding.");
        } catch (java.lang.ClassCastException unused2) {
            throw new java.io.IOException("Not a valid IES Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof org.bouncycastle.jce.spec.IESParameterSpec)) {
            throw new java.security.spec.InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.jce.spec.IESParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.security.spec.AlgorithmParameterSpec engineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new java.lang.NullPointerException("argument to getParameterSpec must not be null");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(java.lang.String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            if (this.getHighResolutionOutputSizeshNQ4ISI.getDerivationV() != null) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI.getDerivationV())));
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.getEncodingV() != null) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI.getEncodingV())));
            }
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI.getMacKeySize()));
            if (this.getHighResolutionOutputSizeshNQ4ISI.getNonce() != null) {
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
                aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI.getCipherKeySize()));
                aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI.getNonce()));
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
            }
            aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI.getPointCompression() ? org.bouncycastle.asn1.ASN1Boolean.TRUE : org.bouncycastle.asn1.ASN1Boolean.FALSE);
            return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException("Error encoding IESParameters");
        }
    }
}
