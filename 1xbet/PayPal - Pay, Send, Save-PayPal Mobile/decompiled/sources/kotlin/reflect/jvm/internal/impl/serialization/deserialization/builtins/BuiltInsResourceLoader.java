package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* loaded from: classes5.dex */
public final class BuiltInsResourceLoader {
    public final java.io.InputStream loadResource(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            return java.lang.ClassLoader.getSystemResourceAsStream(str);
        }
        java.net.URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        java.net.URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
