package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface ClassifierDescriptorWithTypeParameters extends kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable<kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters> {
    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters();

    boolean isInner();
}
