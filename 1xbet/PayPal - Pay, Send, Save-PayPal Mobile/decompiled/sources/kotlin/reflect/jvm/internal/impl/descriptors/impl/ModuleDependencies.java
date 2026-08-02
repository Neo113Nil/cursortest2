package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public interface ModuleDependencies {
    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getAllDependencies();

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getDirectExpectedByDependencies();

    java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible();
}
