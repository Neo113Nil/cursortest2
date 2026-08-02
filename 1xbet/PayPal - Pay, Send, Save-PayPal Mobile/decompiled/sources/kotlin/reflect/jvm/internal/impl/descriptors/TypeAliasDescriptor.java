package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface TypeAliasDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters {
    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassDescriptor();

    kotlin.reflect.jvm.internal.impl.types.SimpleType getExpandedType();

    kotlin.reflect.jvm.internal.impl.types.SimpleType getUnderlyingType();
}
