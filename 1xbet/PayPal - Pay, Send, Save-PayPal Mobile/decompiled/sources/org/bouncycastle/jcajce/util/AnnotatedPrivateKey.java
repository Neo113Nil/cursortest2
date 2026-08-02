package org.bouncycastle.jcajce.util;

/* loaded from: classes17.dex */
public class AnnotatedPrivateKey implements java.security.PrivateKey {
    public static final java.lang.String LABEL = "label";
    private final java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    private final java.security.PrivateKey getHighSpeedVideoSizes;

    public java.lang.String toString() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.containsKey("label") ? this.getHighResolutionOutputSizeshNQ4ISI.get("label") : this.getHighSpeedVideoSizes).toString();
    }

    public org.bouncycastle.jcajce.util.AnnotatedPrivateKey removeAnnotation(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap(this.getHighResolutionOutputSizeshNQ4ISI);
        hashMap.remove(str);
        return new org.bouncycastle.jcajce.util.AnnotatedPrivateKey(this.getHighSpeedVideoSizes, (java.util.Map<java.lang.String, java.lang.Object>) java.util.Collections.unmodifiableMap(hashMap));
    }

    public int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public java.security.PrivateKey getKey() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return this.getHighSpeedVideoSizes.getFormat();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.getHighSpeedVideoSizes.getEncoded();
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.Object getAnnotation(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str);
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return this.getHighSpeedVideoSizes.getAlgorithm();
    }

    public boolean equals(java.lang.Object obj) {
        java.security.PrivateKey privateKey;
        if (obj instanceof org.bouncycastle.jcajce.util.AnnotatedPrivateKey) {
            privateKey = this.getHighSpeedVideoSizes;
            obj = ((org.bouncycastle.jcajce.util.AnnotatedPrivateKey) obj).getHighSpeedVideoSizes;
        } else {
            privateKey = this.getHighSpeedVideoSizes;
        }
        return privateKey.equals(obj);
    }

    public org.bouncycastle.jcajce.util.AnnotatedPrivateKey addAnnotation(java.lang.String str, java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap(this.getHighResolutionOutputSizeshNQ4ISI);
        hashMap.put(str, obj);
        return new org.bouncycastle.jcajce.util.AnnotatedPrivateKey(this.getHighSpeedVideoSizes, (java.util.Map<java.lang.String, java.lang.Object>) java.util.Collections.unmodifiableMap(hashMap));
    }

    AnnotatedPrivateKey(java.security.PrivateKey privateKey, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.getHighSpeedVideoSizes = privateKey;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    AnnotatedPrivateKey(java.security.PrivateKey privateKey, java.lang.String str) {
        this.getHighSpeedVideoSizes = privateKey;
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.singletonMap("label", str);
    }
}
