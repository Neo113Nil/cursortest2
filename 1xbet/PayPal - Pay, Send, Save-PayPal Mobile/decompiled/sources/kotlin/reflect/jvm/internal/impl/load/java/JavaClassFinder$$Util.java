package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes3.dex */
public /* synthetic */ class JavaClassFinder$$Util {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage findPackage$default(kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder javaClassFinder, kotlin.reflect.jvm.internal.impl.name.FqName fqName, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return javaClassFinder.findPackage(fqName, z);
    }
}
