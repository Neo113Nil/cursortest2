package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class DeprecationCausedByFunctionNInfo extends kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo {
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor Camera2StreamConfigurationMap;

    public DeprecationCausedByFunctionNInfo(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        this.Camera2StreamConfigurationMap = declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    public final kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue getDeprecationLevel() {
        return kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue.ERROR;
    }
}
