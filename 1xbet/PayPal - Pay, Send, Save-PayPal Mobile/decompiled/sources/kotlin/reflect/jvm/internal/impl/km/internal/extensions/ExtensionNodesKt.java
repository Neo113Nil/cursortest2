package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

/* loaded from: classes5.dex */
public final class ExtensionNodesKt {
    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension getExtension(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass, kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType kmExtensionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmExtensionType, "");
        return (kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension) getHighSpeedVideoSizes(kmClass.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension getExtension(kotlin.reflect.jvm.internal.impl.km.KmPackage kmPackage, kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType kmExtensionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmPackage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmExtensionType, "");
        return (kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension) getHighSpeedVideoSizes(kmPackage.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension getExtension(kotlin.reflect.jvm.internal.impl.km.KmFunction kmFunction, kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType kmExtensionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmFunction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmExtensionType, "");
        return (kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension) getHighSpeedVideoSizes(kmFunction.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension getExtension(kotlin.reflect.jvm.internal.impl.km.KmProperty kmProperty, kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType kmExtensionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmProperty, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmExtensionType, "");
        return (kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension) getHighSpeedVideoSizes(kmProperty.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension getExtension(kotlin.reflect.jvm.internal.impl.km.KmConstructor kmConstructor, kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType kmExtensionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmExtensionType, "");
        return (kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension) getHighSpeedVideoSizes(kmConstructor.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension getExtension(kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter, kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType kmExtensionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmTypeParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmExtensionType, "");
        return (kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension) getHighSpeedVideoSizes(kmTypeParameter.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension getExtension(kotlin.reflect.jvm.internal.impl.km.KmType kmType, kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType kmExtensionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmExtensionType, "");
        return (kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension) getHighSpeedVideoSizes(kmType.getExtensions$kotlin_metadata(), kmExtensionType);
    }

    private static final <N extends kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension> N getHighSpeedVideoSizes(java.util.Collection<? extends N> collection, kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType kmExtensionType) {
        N n = null;
        for (N n2 : collection) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(n2.getType(), kmExtensionType)) {
                if (n != null) {
                    throw new java.lang.IllegalStateException("Multiple extensions handle the same extension type: ".concat(java.lang.String.valueOf(kmExtensionType)));
                }
                n = n2;
            }
        }
        if (n != null) {
            return n;
        }
        throw new java.lang.IllegalStateException("No extensions handle the extension type: ".concat(java.lang.String.valueOf(kmExtensionType)));
    }
}
