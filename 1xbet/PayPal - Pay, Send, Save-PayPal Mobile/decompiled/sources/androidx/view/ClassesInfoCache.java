package androidx.view;

@java.lang.Deprecated
/* loaded from: classes3.dex */
final class ClassesInfoCache {
    static androidx.view.ClassesInfoCache Camera2StreamConfigurationMap = new androidx.view.ClassesInfoCache();
    private final java.util.Map<java.lang.Class<?>, androidx.lifecycle.ClassesInfoCache.CallbackInfo> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    private final java.util.Map<java.lang.Class<?>, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();

    ClassesInfoCache() {
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<?> cls) {
        java.lang.Boolean bool = this.getHighResolutionOutputSizeshNQ4ISI.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.reflect.Method[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(cls);
        for (java.lang.reflect.Method method : Camera2StreamConfigurationMap2) {
            if (((androidx.view.OnLifecycleEvent) method.getAnnotation(androidx.view.OnLifecycleEvent.class)) != null) {
                getHighSpeedVideoFpsRangesFor(cls, Camera2StreamConfigurationMap2);
                return true;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI.put(cls, java.lang.Boolean.FALSE);
        return false;
    }

    private static java.lang.reflect.Method[] Camera2StreamConfigurationMap(java.lang.Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (java.lang.NoClassDefFoundError e) {
            throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    final androidx.lifecycle.ClassesInfoCache.CallbackInfo getHighSpeedVideoFpsRanges(java.lang.Class<?> cls) {
        androidx.lifecycle.ClassesInfoCache.CallbackInfo callbackInfo = this.getHighSpeedVideoFpsRangesFor.get(cls);
        return callbackInfo != null ? callbackInfo : getHighSpeedVideoFpsRangesFor(cls, null);
    }

    private static void getHighSpeedVideoFpsRanges(java.util.Map<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> map, androidx.lifecycle.ClassesInfoCache.MethodReference methodReference, androidx.lifecycle.Lifecycle.Event event, java.lang.Class<?> cls) {
        androidx.lifecycle.Lifecycle.Event event2 = map.get(methodReference);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(methodReference, event);
                return;
            }
            return;
        }
        java.lang.reflect.Method method = methodReference.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Method ");
        sb.append(method.getName());
        sb.append(" in ");
        sb.append(cls.getName());
        sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
        sb.append(event2);
        sb.append(", new value ");
        sb.append(event);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private androidx.lifecycle.ClassesInfoCache.CallbackInfo getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls, java.lang.reflect.Method[] methodArr) {
        int i;
        androidx.lifecycle.ClassesInfoCache.CallbackInfo highSpeedVideoFpsRanges;
        java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (superclass != null && (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(superclass)) != null) {
            hashMap.putAll(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges);
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            for (java.util.Map.Entry<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> entry : getHighSpeedVideoFpsRanges(cls2).getHighSpeedVideoFpsRanges.entrySet()) {
                getHighSpeedVideoFpsRanges(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = Camera2StreamConfigurationMap(cls);
        }
        boolean z = false;
        for (java.lang.reflect.Method method : methodArr) {
            androidx.view.OnLifecycleEvent onLifecycleEvent = (androidx.view.OnLifecycleEvent) method.getAnnotation(androidx.view.OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!androidx.view.LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                androidx.lifecycle.Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!androidx.lifecycle.Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != androidx.lifecycle.Lifecycle.Event.ON_ANY) {
                        throw new java.lang.IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new java.lang.IllegalArgumentException("cannot have more than 2 params");
                }
                getHighSpeedVideoFpsRanges(hashMap, new androidx.lifecycle.ClassesInfoCache.MethodReference(i, method), value, cls);
                z = true;
            }
        }
        androidx.lifecycle.ClassesInfoCache.CallbackInfo callbackInfo = new androidx.lifecycle.ClassesInfoCache.CallbackInfo(hashMap);
        this.getHighSpeedVideoFpsRangesFor.put(cls, callbackInfo);
        this.getHighResolutionOutputSizeshNQ4ISI.put(cls, java.lang.Boolean.valueOf(z));
        return callbackInfo;
    }

    @java.lang.Deprecated
    static class CallbackInfo {
        final java.util.Map<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> getHighSpeedVideoFpsRanges;
        final java.util.Map<androidx.lifecycle.Lifecycle.Event, java.util.List<androidx.lifecycle.ClassesInfoCache.MethodReference>> getHighSpeedVideoSizes = new java.util.HashMap();

        CallbackInfo(java.util.Map<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> map) {
            this.getHighSpeedVideoFpsRanges = map;
            for (java.util.Map.Entry<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> entry : map.entrySet()) {
                androidx.lifecycle.Lifecycle.Event value = entry.getValue();
                java.util.List<androidx.lifecycle.ClassesInfoCache.MethodReference> list = this.getHighSpeedVideoSizes.get(value);
                if (list == null) {
                    list = new java.util.ArrayList<>();
                    this.getHighSpeedVideoSizes.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event, java.lang.Object obj) {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.get(event), lifecycleOwner, event, obj);
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.get(androidx.lifecycle.Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.lifecycle.ClassesInfoCache.MethodReference> list, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event, java.lang.Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).getHighResolutionOutputSizeshNQ4ISI(lifecycleOwner, event, obj);
                }
            }
        }
    }

    @java.lang.Deprecated
    static final class MethodReference {
        final int getHighSpeedVideoFpsRanges;
        final java.lang.reflect.Method getHighSpeedVideoSizes;

        MethodReference(int i, java.lang.reflect.Method method) {
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoSizes = method;
            method.setAccessible(true);
        }

        final void getHighResolutionOutputSizeshNQ4ISI(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event, java.lang.Object obj) {
            try {
                int i = this.getHighSpeedVideoFpsRanges;
                if (i == 0) {
                    this.getHighSpeedVideoSizes.invoke(obj, new java.lang.Object[0]);
                } else if (i == 1) {
                    this.getHighSpeedVideoSizes.invoke(obj, lifecycleOwner);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.getHighSpeedVideoSizes.invoke(obj, lifecycleOwner, event);
                }
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException(e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.lifecycle.ClassesInfoCache.MethodReference)) {
                return false;
            }
            androidx.lifecycle.ClassesInfoCache.MethodReference methodReference = (androidx.lifecycle.ClassesInfoCache.MethodReference) obj;
            return this.getHighSpeedVideoFpsRanges == methodReference.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes.getName().equals(methodReference.getHighSpeedVideoSizes.getName());
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoFpsRanges * 31) + this.getHighSpeedVideoSizes.getName().hashCode();
        }
    }
}
