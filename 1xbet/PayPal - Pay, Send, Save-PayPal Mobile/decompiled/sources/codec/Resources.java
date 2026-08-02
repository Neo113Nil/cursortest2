package codec;

/* loaded from: classes7.dex */
public class Resources {
    public static java.io.InputStream getInputStream(java.lang.String str) {
        java.io.InputStream resourceAsStream = codec.Resources.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        throw new java.lang.IllegalArgumentException("Unable to resolve required resource: ".concat(java.lang.String.valueOf(str)));
    }
}
