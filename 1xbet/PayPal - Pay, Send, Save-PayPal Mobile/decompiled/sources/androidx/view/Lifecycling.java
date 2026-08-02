package androidx.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u00100\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R2\u0010\u0011\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u001b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "<init>", "()V", "object", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleEventObserver", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleEventObserver;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/GeneratedAdapter;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "getHighSpeedVideoSizes", "(Ljava/lang/Class;)I", "getHighSpeedVideoFpsRanges", "", "className", "getAdapterName", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Map;", "Camera2StreamConfigurationMap", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Lifecycling {
    public static final androidx.view.Lifecycling INSTANCE = new androidx.view.Lifecycling();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.Class<?>, java.lang.Integer> Camera2StreamConfigurationMap = new java.util.HashMap();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.view.GeneratedAdapter>>> getHighSpeedVideoSizes = new java.util.HashMap();

    private Lifecycling() {
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.LifecycleEventObserver lifecycleEventObserver(java.lang.Object object) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(object, "");
        boolean z = object instanceof androidx.view.LifecycleEventObserver;
        boolean z2 = object instanceof androidx.view.DefaultLifecycleObserver;
        if (z && z2) {
            return new androidx.view.DefaultLifecycleObserverAdapter((androidx.view.DefaultLifecycleObserver) object, (androidx.view.LifecycleEventObserver) object);
        }
        if (z2) {
            return new androidx.view.DefaultLifecycleObserverAdapter((androidx.view.DefaultLifecycleObserver) object, null);
        }
        if (z) {
            return (androidx.view.LifecycleEventObserver) object;
        }
        java.lang.Class<?> cls = object.getClass();
        if (INSTANCE.getHighSpeedVideoSizes(cls) == 2) {
            java.util.List<java.lang.reflect.Constructor<? extends androidx.view.GeneratedAdapter>> list = getHighSpeedVideoSizes.get(cls);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            java.util.List<java.lang.reflect.Constructor<? extends androidx.view.GeneratedAdapter>> list2 = list;
            if (list2.size() == 1) {
                return new androidx.view.SingleGeneratedAdapterObserver(getHighResolutionOutputSizeshNQ4ISI(list2.get(0), object));
            }
            int size = list2.size();
            androidx.view.GeneratedAdapter[] generatedAdapterArr = new androidx.view.GeneratedAdapter[size];
            for (int i = 0; i < size; i++) {
                generatedAdapterArr[i] = getHighResolutionOutputSizeshNQ4ISI(list2.get(i), object);
            }
            return new androidx.view.CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new androidx.view.ReflectiveGenericLifecycleObserver(object);
    }

    private static androidx.view.GeneratedAdapter getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Constructor<? extends androidx.view.GeneratedAdapter> p0, java.lang.Object p1) {
        try {
            androidx.view.GeneratedAdapter newInstance = p0.newInstance(p1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
            return newInstance;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    private static java.lang.reflect.Constructor<? extends androidx.view.GeneratedAdapter> getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<?> p0) {
        try {
            java.lang.Package r0 = p0.getPackage();
            java.lang.String canonicalName = p0.getCanonicalName();
            java.lang.String name2 = r0 != null ? r0.getName() : "";
            kotlin.jvm.internal.Intrinsics.checkNotNull(name2);
            if (name2.length() != 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(canonicalName);
                canonicalName = canonicalName.substring(name2.length() + 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalName, "");
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(canonicalName);
            java.lang.String adapterName = getAdapterName(canonicalName);
            if (name2.length() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(name2);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(adapterName);
                adapterName = sb.toString();
            }
            java.lang.Class<?> cls = java.lang.Class.forName(adapterName);
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(p0);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private final int getHighSpeedVideoSizes(java.lang.Class<?> p0) {
        java.util.Map<java.lang.Class<?>, java.lang.Integer> map = Camera2StreamConfigurationMap;
        java.lang.Integer num = map.get(p0);
        if (num != null) {
            return num.intValue();
        }
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        map.put(p0, java.lang.Integer.valueOf(highSpeedVideoFpsRanges));
        return highSpeedVideoFpsRanges;
    }

    private final int getHighSpeedVideoFpsRanges(java.lang.Class<?> p0) {
        java.util.ArrayList arrayList;
        if (p0.getCanonicalName() == null) {
            return 1;
        }
        java.lang.reflect.Constructor<? extends androidx.view.GeneratedAdapter> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(p0);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            getHighSpeedVideoSizes.put(p0, kotlin.collections.CollectionsKt.listOf(highResolutionOutputSizeshNQ4ISI));
            return 2;
        }
        if (androidx.view.ClassesInfoCache.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(p0)) {
            return 1;
        }
        java.lang.Class<? super java.lang.Object> superclass = p0.getSuperclass();
        if (superclass == null || !androidx.view.LifecycleObserver.class.isAssignableFrom(superclass)) {
            arrayList = null;
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(superclass);
            if (getHighSpeedVideoSizes(superclass) == 1) {
                return 1;
            }
            java.util.List<java.lang.reflect.Constructor<? extends androidx.view.GeneratedAdapter>> list = getHighSpeedVideoSizes.get(superclass);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            arrayList = new java.util.ArrayList(list);
        }
        java.lang.Class<?>[] interfaces = p0.getInterfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interfaces, "");
        for (java.lang.Class<?> cls : interfaces) {
            if (cls != null && androidx.view.LifecycleObserver.class.isAssignableFrom(cls)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
                if (getHighSpeedVideoSizes(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                java.util.List<java.lang.reflect.Constructor<? extends androidx.view.GeneratedAdapter>> list2 = getHighSpeedVideoSizes.get(cls);
                kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        getHighSpeedVideoSizes.put(p0, arrayList);
        return 2;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAdapterName(java.lang.String className) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.replace$default(className, ".", "_", false, 4, (java.lang.Object) null));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
}
