package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes17.dex */
public final class FieldOverridabilityCondition implements kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result isOverridable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor2, "");
        if (!(callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) || !(callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor)) {
            return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableDescriptor2;
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableDescriptor;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(propertyDescriptor.getName(), propertyDescriptor2.getName())) {
            return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        if (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(propertyDescriptor) && kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(propertyDescriptor2)) {
            return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE;
        }
        if (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(propertyDescriptor) || kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(propertyDescriptor2)) {
            return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract getContract() {
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.BOTH;
    }
}
