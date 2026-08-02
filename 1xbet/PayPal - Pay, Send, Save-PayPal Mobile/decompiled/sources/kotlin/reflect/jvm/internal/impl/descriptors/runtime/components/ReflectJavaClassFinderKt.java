package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class ReflectJavaClassFinderKt {
    public static final java.lang.Class<?> tryLoadClass(java.lang.ClassLoader classLoader, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return java.lang.Class.forName(str, false, classLoader);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }
}
