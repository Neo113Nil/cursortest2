package org.apache.commons.codec;

/* loaded from: classes17.dex */
public class Resources {
    public static java.io.InputStream getInputStream(java.lang.String str) {
        java.io.InputStream resourceAsStream = org.apache.commons.codec.Resources.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        throw new java.lang.IllegalArgumentException("Unable to resolve required resource: ".concat(java.lang.String.valueOf(str)));
    }

    @java.lang.Deprecated
    public Resources() {
    }
}
