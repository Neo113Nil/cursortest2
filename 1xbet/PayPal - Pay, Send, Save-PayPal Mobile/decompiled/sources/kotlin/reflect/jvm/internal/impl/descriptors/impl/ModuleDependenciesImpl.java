package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public final class ModuleDependenciesImpl implements kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getHighSpeedVideoFpsRanges;
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getHighSpeedVideoSizes;

    public ModuleDependenciesImpl(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> list, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> set, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> list2, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> set2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set2, "");
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRanges = set;
        this.getHighResolutionOutputSizeshNQ4ISI = list2;
        this.getHighSpeedVideoSizes = set2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getAllDependencies() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getDirectExpectedByDependencies() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
