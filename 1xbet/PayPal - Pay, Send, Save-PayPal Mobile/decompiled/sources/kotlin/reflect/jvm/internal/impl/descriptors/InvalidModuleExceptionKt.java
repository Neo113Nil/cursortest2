package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class InvalidModuleExceptionKt {
    private static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleNotifier> getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<>("InvalidModuleNotifier");

    public static final void moduleInvalidated(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleNotifier invalidModuleNotifier = (kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleNotifier) moduleDescriptor.getCapability(getHighSpeedVideoSizes);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.notifyModuleInvalidated(moduleDescriptor);
            return;
        }
        throw new kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException("Accessing invalid module descriptor ".concat(java.lang.String.valueOf(moduleDescriptor)));
    }
}
