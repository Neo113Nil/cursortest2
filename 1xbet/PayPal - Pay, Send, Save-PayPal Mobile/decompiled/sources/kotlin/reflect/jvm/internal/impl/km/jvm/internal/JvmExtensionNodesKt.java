package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* loaded from: classes5.dex */
public final class JvmExtensionNodesKt {
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmClassExtension getJvm(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension extension = kotlin.reflect.jvm.internal.impl.km.internal.extensions.ExtensionNodesKt.getExtension(kmClass, kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmClassExtension.Companion.getTYPE());
        kotlin.jvm.internal.Intrinsics.checkNotNull(extension, "");
        return (kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmClassExtension) extension;
    }

    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPackageExtension getJvm(kotlin.reflect.jvm.internal.impl.km.KmPackage kmPackage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmPackage, "");
        kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension extension = kotlin.reflect.jvm.internal.impl.km.internal.extensions.ExtensionNodesKt.getExtension(kmPackage, kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPackageExtension.TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(extension, "");
        return (kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPackageExtension) extension;
    }

    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmFunctionExtension getJvm(kotlin.reflect.jvm.internal.impl.km.KmFunction kmFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmFunction, "");
        kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension extension = kotlin.reflect.jvm.internal.impl.km.internal.extensions.ExtensionNodesKt.getExtension(kmFunction, kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmFunctionExtension.TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(extension, "");
        return (kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmFunctionExtension) extension;
    }

    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPropertyExtension getJvm(kotlin.reflect.jvm.internal.impl.km.KmProperty kmProperty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmProperty, "");
        kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension extension = kotlin.reflect.jvm.internal.impl.km.internal.extensions.ExtensionNodesKt.getExtension(kmProperty, kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPropertyExtension.TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(extension, "");
        return (kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPropertyExtension) extension;
    }

    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmConstructorExtension getJvm(kotlin.reflect.jvm.internal.impl.km.KmConstructor kmConstructor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmConstructor, "");
        kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension extension = kotlin.reflect.jvm.internal.impl.km.internal.extensions.ExtensionNodesKt.getExtension(kmConstructor, kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmConstructorExtension.TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(extension, "");
        return (kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmConstructorExtension) extension;
    }

    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeParameterExtension getJvm(kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmTypeParameter, "");
        kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension extension = kotlin.reflect.jvm.internal.impl.km.internal.extensions.ExtensionNodesKt.getExtension(kmTypeParameter, kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeParameterExtension.TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(extension, "");
        return (kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeParameterExtension) extension;
    }

    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension getJvm(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension extension = kotlin.reflect.jvm.internal.impl.km.internal.extensions.ExtensionNodesKt.getExtension(kmType, kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension.TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(extension, "");
        return (kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension) extension;
    }
}
