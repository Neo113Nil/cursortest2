package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public interface ExternalOverridabilityCondition {

    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum Result {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract getContract();

    kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result isOverridable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);
}
