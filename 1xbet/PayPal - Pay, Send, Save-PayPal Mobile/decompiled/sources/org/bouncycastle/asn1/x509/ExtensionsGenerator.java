package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class ExtensionsGenerator {
    private static final java.util.Set getHighSpeedVideoSizes;
    private java.util.Hashtable Camera2StreamConfigurationMap = new java.util.Hashtable();
    private java.util.Vector getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();

    public void reset() {
        this.Camera2StreamConfigurationMap = new java.util.Hashtable();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();
    }

    public void replaceExtension(org.bouncycastle.asn1.x509.Extension extension) {
        if (this.Camera2StreamConfigurationMap.containsKey(extension.getExtnId())) {
            this.Camera2StreamConfigurationMap.put(extension.getExtnId(), extension);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("extension ");
        sb.append(extension.getExtnId());
        sb.append(" not present");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public void replaceExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        replaceExtension(new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, bArr));
    }

    public void replaceExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        replaceExtension(aSN1ObjectIdentifier, z, aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
    }

    public void removeExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (this.Camera2StreamConfigurationMap.containsKey(aSN1ObjectIdentifier)) {
            this.getHighResolutionOutputSizeshNQ4ISI.removeElement(aSN1ObjectIdentifier);
            this.Camera2StreamConfigurationMap.remove(aSN1ObjectIdentifier);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("extension ");
            sb.append(aSN1ObjectIdentifier);
            sb.append(" not present");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public boolean hasExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.Camera2StreamConfigurationMap.containsKey(aSN1ObjectIdentifier);
    }

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (org.bouncycastle.asn1.x509.Extension) this.Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier);
    }

    public org.bouncycastle.asn1.x509.Extensions generate() {
        org.bouncycastle.asn1.x509.Extension[] extensionArr = new org.bouncycastle.asn1.x509.Extension[this.getHighResolutionOutputSizeshNQ4ISI.size()];
        for (int i = 0; i != this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            extensionArr[i] = (org.bouncycastle.asn1.x509.Extension) this.Camera2StreamConfigurationMap.get(this.getHighResolutionOutputSizeshNQ4ISI.elementAt(i));
        }
        return new org.bouncycastle.asn1.x509.Extensions(extensionArr);
    }

    public void addExtension(org.bouncycastle.asn1.x509.Extensions extensions) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier[] extensionOIDs = extensions.getExtensionOIDs();
        for (int i = 0; i != extensionOIDs.length; i++) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = extensionOIDs[i];
            org.bouncycastle.asn1.x509.Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
            addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1ObjectIdentifier), extension.isCritical(), extension.getExtnValue().getOctets());
        }
    }

    public void addExtension(org.bouncycastle.asn1.x509.Extension extension) {
        if (!this.Camera2StreamConfigurationMap.containsKey(extension.getExtnId())) {
            this.getHighResolutionOutputSizeshNQ4ISI.addElement(extension.getExtnId());
            this.Camera2StreamConfigurationMap.put(extension.getExtnId(), extension);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("extension ");
            sb.append(extension.getExtnId());
            sb.append(" already added");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        if (!this.Camera2StreamConfigurationMap.containsKey(aSN1ObjectIdentifier)) {
            this.getHighResolutionOutputSizeshNQ4ISI.addElement(aSN1ObjectIdentifier);
            this.Camera2StreamConfigurationMap.put(aSN1ObjectIdentifier, new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, new org.bouncycastle.asn1.DEROctetString(bArr)));
            return;
        }
        if (!getHighSpeedVideoSizes.contains(aSN1ObjectIdentifier)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("extension ");
            sb.append(aSN1ObjectIdentifier);
            sb.append(" already added");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.DEROctetString.getInstance(((org.bouncycastle.asn1.x509.Extension) this.Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier)).getExtnValue()).getOctets());
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(aSN1Sequence.size() + aSN1Sequence2.size());
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            aSN1EncodableVector.add((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement());
        }
        java.util.Enumeration objects2 = aSN1Sequence2.getObjects();
        while (objects2.hasMoreElements()) {
            aSN1EncodableVector.add((org.bouncycastle.asn1.ASN1Encodable) objects2.nextElement());
        }
        try {
            this.Camera2StreamConfigurationMap.put(aSN1ObjectIdentifier, new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded()));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.asn1.ASN1ParsingException(e.getMessage(), e);
        }
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        addExtension(aSN1ObjectIdentifier, z, aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(org.bouncycastle.asn1.x509.Extension.subjectAlternativeName);
        hashSet.add(org.bouncycastle.asn1.x509.Extension.issuerAlternativeName);
        hashSet.add(org.bouncycastle.asn1.x509.Extension.subjectDirectoryAttributes);
        hashSet.add(org.bouncycastle.asn1.x509.Extension.certificateIssuer);
        getHighSpeedVideoSizes = java.util.Collections.unmodifiableSet(hashSet);
    }
}
