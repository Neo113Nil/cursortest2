package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public interface TypeMappingConfiguration<T> {
    kotlin.reflect.jvm.internal.impl.types.KotlinType commonSupertype(java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection);

    java.lang.String getPredefinedFullInternalNameForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    java.lang.String getPredefinedInternalNameForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    T getPredefinedTypeForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    kotlin.reflect.jvm.internal.impl.types.KotlinType preprocessType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType);

    void processErrorType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);
}
