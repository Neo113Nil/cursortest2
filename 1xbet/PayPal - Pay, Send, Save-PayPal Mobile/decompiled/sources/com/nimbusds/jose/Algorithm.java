package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public class Algorithm implements java.io.Serializable {
    public static final com.nimbusds.jose.Algorithm NONE = new com.nimbusds.jose.Algorithm("none", com.nimbusds.jose.Requirement.REQUIRED);
    private static final long serialVersionUID = 1;

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f4220name;
    private final com.nimbusds.jose.Requirement requirement;

    public Algorithm(java.lang.String str, com.nimbusds.jose.Requirement requirement) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The algorithm name must not be null");
        }
        this.f4220name = str;
        this.requirement = requirement;
    }

    public Algorithm(java.lang.String str) {
        this(str, null);
    }

    public final java.lang.String getName() {
        return this.f4220name;
    }

    public final com.nimbusds.jose.Requirement getRequirement() {
        return this.requirement;
    }

    public final int hashCode() {
        return this.f4220name.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.nimbusds.jose.Algorithm) && toString().equals(obj.toString());
    }

    public final java.lang.String toString() {
        return this.f4220name;
    }

    public final java.lang.String toJSONString() {
        return com.nimbusds.jose.util.JSONStringUtils.toJSONString(this.f4220name);
    }

    public static com.nimbusds.jose.Algorithm parse(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.nimbusds.jose.Algorithm(str);
    }
}
