package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getOrCreateModule", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "", "clearModuleByClassLoaderCache", "()V", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "Ljava/lang/ref/WeakReference;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/ConcurrentMap;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModuleByClassLoaderKt {
    private static final java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.WeakClassLoaderBox, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData>> Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap();

    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData getOrCreateModule(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        java.lang.ClassLoader safeClassLoader = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(cls);
        kotlin.reflect.jvm.internal.WeakClassLoaderBox weakClassLoaderBox = new kotlin.reflect.jvm.internal.WeakClassLoaderBox(safeClassLoader);
        java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.WeakClassLoaderBox, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData>> concurrentMap = Camera2StreamConfigurationMap;
        java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData> weakReference = concurrentMap.get(weakClassLoaderBox);
        if (weakReference != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData runtimeModuleData = weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentMap.remove(weakClassLoaderBox, weakReference);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData create = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData.Companion.create(safeClassLoader);
        while (true) {
            try {
                java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.WeakClassLoaderBox, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData>> concurrentMap2 = Camera2StreamConfigurationMap;
                java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData> putIfAbsent = concurrentMap2.putIfAbsent(weakClassLoaderBox, new java.lang.ref.WeakReference<>(create));
                if (putIfAbsent == null) {
                    return create;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData runtimeModuleData2 = putIfAbsent.get();
                if (runtimeModuleData2 != null) {
                    return runtimeModuleData2;
                }
                concurrentMap2.remove(weakClassLoaderBox, putIfAbsent);
            } finally {
                weakClassLoaderBox.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }
    }

    public static final void clearModuleByClassLoaderCache() {
        Camera2StreamConfigurationMap.clear();
    }
}
