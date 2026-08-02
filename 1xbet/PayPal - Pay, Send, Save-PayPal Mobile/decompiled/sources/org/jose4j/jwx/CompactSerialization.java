package org.jose4j.jwx;

/* loaded from: classes18.dex */
public class CompactSerialization {
    public static java.lang.String[] deserialize(java.lang.String str) {
        return org.jose4j.jwx.CompactSerializer.deserialize(str);
    }

    public static java.lang.String serialize(java.lang.String... strArr) throws org.jose4j.lang.JoseException {
        return org.jose4j.jwx.CompactSerializer.serialize(strArr);
    }
}
