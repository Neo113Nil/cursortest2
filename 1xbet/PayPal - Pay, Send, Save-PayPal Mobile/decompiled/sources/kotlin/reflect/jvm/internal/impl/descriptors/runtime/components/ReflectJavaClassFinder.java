package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class ReflectJavaClassFinder implements kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder {
    private final java.lang.ClassLoader getHighResolutionOutputSizeshNQ4ISI;

    public ReflectJavaClassFinder(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        this.getHighResolutionOutputSizeshNQ4ISI = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass findClass(kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = request.getClassId();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(classId.getRelativeClassName().asString(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlin.text.Typography.dollar, false, 4, (java.lang.Object) null);
        if (!packageFqName.isRoot()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(packageFqName.asString());
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(replace$default);
            replace$default = sb.toString();
        }
        java.lang.Class<?> tryLoadClass = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt.tryLoadClass(this.getHighResolutionOutputSizeshNQ4ISI, replace$default);
        if (tryLoadClass != null) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass(tryLoadClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage findPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public final java.util.Set<java.lang.String> knownClassNamesInPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return null;
    }
}
