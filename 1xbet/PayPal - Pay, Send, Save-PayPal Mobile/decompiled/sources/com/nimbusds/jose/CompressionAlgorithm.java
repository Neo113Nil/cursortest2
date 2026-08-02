package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class CompressionAlgorithm implements java.io.Serializable {
    public static final com.nimbusds.jose.CompressionAlgorithm DEF = new com.nimbusds.jose.CompressionAlgorithm(org.jose4j.zip.CompressionAlgorithmIdentifiers.DEFLATE);
    private static final long serialVersionUID = 1;

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f4221name;

    public CompressionAlgorithm(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The compression algorithm name must not be null");
        }
        this.f4221name = str;
    }

    public final java.lang.String getName() {
        return this.f4221name;
    }

    public final int hashCode() {
        return this.f4221name.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.nimbusds.jose.CompressionAlgorithm) && toString().equals(obj.toString());
    }

    public final java.lang.String toString() {
        return this.f4221name;
    }

    public final java.lang.String toJSONString() {
        return com.nimbusds.jose.util.JSONStringUtils.toJSONString(this.f4221name);
    }
}
