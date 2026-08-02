package org.bouncycastle.jcajce.util;

/* loaded from: classes17.dex */
public class PrivateKeyAnnotator {
    public static org.bouncycastle.jcajce.util.AnnotatedPrivateKey annotate(java.security.PrivateKey privateKey, java.util.Map<java.lang.String, java.lang.Object> map) {
        return new org.bouncycastle.jcajce.util.AnnotatedPrivateKey(privateKey, (java.util.Map<java.lang.String, java.lang.Object>) java.util.Collections.unmodifiableMap(new java.util.HashMap(map)));
    }

    public static org.bouncycastle.jcajce.util.AnnotatedPrivateKey annotate(java.security.PrivateKey privateKey, java.lang.String str) {
        return new org.bouncycastle.jcajce.util.AnnotatedPrivateKey(privateKey, str);
    }
}
