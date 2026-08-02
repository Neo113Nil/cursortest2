package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public final class ResolutionAnchorProviderKt {
    private static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProvider> getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<>("ResolutionAnchorProvider");

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getResolutionAnchorIfAny(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProvider resolutionAnchorProvider = (kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProvider) moduleDescriptor.getCapability(getHighSpeedVideoFpsRangesFor);
        if (resolutionAnchorProvider != null) {
            return resolutionAnchorProvider.getResolutionAnchor(moduleDescriptor);
        }
        return null;
    }
}
