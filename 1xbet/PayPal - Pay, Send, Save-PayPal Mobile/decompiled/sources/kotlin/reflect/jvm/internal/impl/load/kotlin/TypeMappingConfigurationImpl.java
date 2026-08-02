package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class TypeMappingConfigurationImpl implements kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType> {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfigurationImpl INSTANCE = new kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfigurationImpl();

    private TypeMappingConfigurationImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType commonSupertype(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("There should be no intersection type in existing descriptors, but found: ");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(collection, null, null, null, 0, null, null, 63, null));
        throw new java.lang.AssertionError(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final void processErrorType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType preprocessType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType getPredefinedTypeForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final java.lang.String getPredefinedInternalNameForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final java.lang.String getPredefinedFullInternalNameForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        return null;
    }
}
