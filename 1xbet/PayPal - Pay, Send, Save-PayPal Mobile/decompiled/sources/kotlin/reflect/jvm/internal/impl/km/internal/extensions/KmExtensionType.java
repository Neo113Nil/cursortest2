package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

/* loaded from: classes5.dex */
public final class KmExtensionType {
    private final kotlin.reflect.KClass<? extends kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension> Camera2StreamConfigurationMap;

    public KmExtensionType(kotlin.reflect.KClass<? extends kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        this.Camera2StreamConfigurationMap = kClass;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType) obj).Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String name2 = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) this.Camera2StreamConfigurationMap).getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return name2;
    }
}
