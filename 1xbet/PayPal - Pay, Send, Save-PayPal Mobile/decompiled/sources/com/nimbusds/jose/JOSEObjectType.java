package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class JOSEObjectType implements java.io.Serializable {
    public static final com.nimbusds.jose.JOSEObjectType JOSE = new com.nimbusds.jose.JOSEObjectType("JOSE");
    public static final com.nimbusds.jose.JOSEObjectType JOSE_JSON = new com.nimbusds.jose.JOSEObjectType("JOSE+JSON");
    public static final com.nimbusds.jose.JOSEObjectType JWT = new com.nimbusds.jose.JOSEObjectType("JWT");
    private static final long serialVersionUID = 1;
    private final java.lang.String type;

    public JOSEObjectType(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The object type must not be null");
        }
        this.type = str;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.type.toLowerCase().hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.nimbusds.jose.JOSEObjectType) && this.type.equalsIgnoreCase(((com.nimbusds.jose.JOSEObjectType) obj).type);
    }

    public final java.lang.String toString() {
        return this.type;
    }

    public final java.lang.String toJSONString() {
        return com.nimbusds.jose.util.JSONStringUtils.toJSONString(this.type);
    }
}
