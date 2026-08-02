package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* loaded from: classes5.dex */
public final class JavaForKotlinOverridePropertyDescriptor extends kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor {
    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        super(classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), simpleFunctionDescriptor.getModality(), simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor2 != null, propertyDescriptor.getName(), simpleFunctionDescriptor.getSource(), null, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, false, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        this.Camera2StreamConfigurationMap = simpleFunctionDescriptor;
        this.getHighResolutionOutputSizeshNQ4ISI = simpleFunctionDescriptor2;
        this.getHighSpeedVideoFpsRanges = propertyDescriptor;
    }
}
