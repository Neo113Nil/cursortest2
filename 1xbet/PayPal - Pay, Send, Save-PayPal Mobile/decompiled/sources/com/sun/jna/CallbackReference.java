package com.sun.jna;

/* loaded from: classes5.dex */
public class CallbackReference extends java.lang.ref.WeakReference<com.sun.jna.Callback> implements java.io.Closeable {
    private static final java.lang.Class<?> getOutputMinFrameDurationlomOqCM;
    private static final java.lang.reflect.Method getOutputSizes;
    private static final java.util.Map<com.sun.jna.Callback, com.sun.jna.CallbackThreadInitializer> getOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    com.sun.jna.Pointer getHighSpeedVideoSizesFor;
    com.sun.jna.internal.Cleaner.Cleanable getInputFormats;
    com.sun.jna.CallbackProxy getInputSizeshNQ4ISI;
    java.lang.reflect.Method getOutputFormats;
    com.sun.jna.Pointer getOutputMinFrameDuration;
    static final java.util.Map<com.sun.jna.Callback, com.sun.jna.CallbackReference> getHighSpeedVideoSizes = new java.util.WeakHashMap();
    static final java.util.Map<com.sun.jna.Callback, com.sun.jna.CallbackReference> Camera2StreamConfigurationMap = new java.util.WeakHashMap();
    static final java.util.Map<com.sun.jna.Pointer, java.lang.ref.Reference<com.sun.jna.Callback>[]> getHighResolutionOutputSizeshNQ4ISI = new java.util.WeakHashMap();
    static final java.util.Map<java.lang.Object, java.lang.Object> getHighSpeedVideoFpsRangesFor = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
    private static final java.util.Map<java.lang.Long, java.lang.ref.Reference<com.sun.jna.CallbackReference>> getOutputStallDuration = new java.util.concurrent.ConcurrentHashMap();

    static {
        try {
            getOutputSizes = com.sun.jna.CallbackProxy.class.getMethod(com.sun.jna.Callback.METHOD_NAME, java.lang.Object[].class);
            if (com.sun.jna.Platform.isWindows()) {
                try {
                    getOutputMinFrameDurationlomOqCM = java.lang.Class.forName("com.sun.jna.win32.DLLCallback");
                } catch (java.lang.ClassNotFoundException e) {
                    throw new java.lang.Error("Error loading DLLCallback class", e);
                }
            } else {
                getOutputMinFrameDurationlomOqCM = null;
            }
            getOutputSizeshNQ4ISI = new java.util.WeakHashMap();
        } catch (java.lang.Exception unused) {
            throw new java.lang.Error("Error looking up CallbackProxy.callback() method");
        }
    }

    static com.sun.jna.CallbackThreadInitializer getHighSpeedVideoSizes(com.sun.jna.Callback callback, com.sun.jna.CallbackThreadInitializer callbackThreadInitializer) {
        java.util.Map<com.sun.jna.Callback, com.sun.jna.CallbackThreadInitializer> map = getOutputSizeshNQ4ISI;
        synchronized (map) {
            if (callbackThreadInitializer != null) {
                return map.put(callback, callbackThreadInitializer);
            }
            return map.remove(callback);
        }
    }

    /* loaded from: classes16.dex */
    static class AttachOptions extends com.sun.jna.Structure {
        public static final java.util.List<java.lang.String> FIELDS = createFieldsOrder("daemon", "detach", "name");
        public boolean daemon;
        public boolean detach;

        /* renamed from: name, reason: collision with root package name */
        public java.lang.String f6671name;

        AttachOptions() {
            setStringEncoding("utf8");
        }

        @Override // com.sun.jna.Structure
        /* renamed from: getFieldOrder */
        protected java.util.List<java.lang.String> getHighSpeedVideoSizes() {
            return FIELDS;
        }
    }

    private static java.lang.ThreadGroup initializeThread(com.sun.jna.Callback callback, com.sun.jna.CallbackReference.AttachOptions attachOptions) {
        com.sun.jna.CallbackThreadInitializer callbackThreadInitializer;
        if (callback instanceof com.sun.jna.CallbackReference.DefaultCallbackProxy) {
            callback = com.sun.jna.CallbackReference.this.get();
        }
        java.util.Map<com.sun.jna.Callback, com.sun.jna.CallbackThreadInitializer> map = getOutputSizeshNQ4ISI;
        synchronized (map) {
            callbackThreadInitializer = map.get(callback);
        }
        if (callbackThreadInitializer == null) {
            return null;
        }
        java.lang.ThreadGroup threadGroup = callbackThreadInitializer.getThreadGroup(callback);
        attachOptions.f6671name = callbackThreadInitializer.getName(callback);
        attachOptions.daemon = callbackThreadInitializer.isDaemon(callback);
        attachOptions.detach = callbackThreadInitializer.detach(callback);
        attachOptions.write();
        return threadGroup;
    }

    public static com.sun.jna.Callback getCallback(java.lang.Class<?> cls, com.sun.jna.Pointer pointer) {
        return getCallback(cls, pointer, false);
    }

    private static com.sun.jna.Callback getCallback(java.lang.Class<?> cls, com.sun.jna.Pointer pointer, boolean z) {
        com.sun.jna.Callback callback = null;
        if (pointer == null) {
            return null;
        }
        if (!cls.isInterface()) {
            throw new java.lang.IllegalArgumentException("Callback type must be an interface");
        }
        java.util.Map<com.sun.jna.Callback, com.sun.jna.CallbackReference> map = z ? Camera2StreamConfigurationMap : getHighSpeedVideoSizes;
        java.util.Map<com.sun.jna.Pointer, java.lang.ref.Reference<com.sun.jna.Callback>[]> map2 = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (map2) {
            java.lang.ref.Reference<com.sun.jna.Callback>[] referenceArr = map2.get(pointer);
            if (referenceArr != null) {
                int i = 0;
                while (true) {
                    if (i < referenceArr.length) {
                        com.sun.jna.Callback callback2 = referenceArr[i].get();
                        if (callback2 != null && cls.isAssignableFrom(callback2.getClass())) {
                            callback = callback2;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            if (callback != null) {
                return callback;
            }
            int i2 = com.sun.jna.AltCallingConvention.class.isAssignableFrom(cls) ? 63 : 0;
            java.util.HashMap hashMap = new java.util.HashMap(com.sun.jna.Native.getLibraryOptions(cls));
            hashMap.put("invoking-method", getHighResolutionOutputSizeshNQ4ISI(cls));
            com.sun.jna.Callback callback3 = (com.sun.jna.Callback) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new com.sun.jna.CallbackReference.NativeFunctionHandler(pointer, i2, hashMap));
            map2.put(pointer, getHighSpeedVideoSizes(callback3, referenceArr));
            map.remove(callback3);
            return callback3;
        }
    }

    private static java.lang.ref.Reference<com.sun.jna.Callback>[] getHighSpeedVideoSizes(com.sun.jna.Callback callback, java.lang.ref.Reference<com.sun.jna.Callback>[] referenceArr) {
        int i = 0;
        int i2 = 1;
        if (referenceArr != null) {
            for (int i3 = 0; i3 < referenceArr.length; i3++) {
                if (referenceArr[i3].get() == null) {
                    referenceArr[i3] = null;
                } else {
                    i2++;
                }
            }
        }
        java.lang.ref.Reference<com.sun.jna.Callback>[] referenceArr2 = new java.lang.ref.Reference[i2];
        if (referenceArr != null) {
            int i4 = 0;
            while (i < referenceArr.length) {
                java.lang.ref.Reference<com.sun.jna.Callback> reference = referenceArr[i];
                if (reference != null) {
                    referenceArr2[i4] = reference;
                    i4++;
                }
                i++;
            }
            i = i4;
        }
        referenceArr2[i] = new java.lang.ref.WeakReference(callback);
        return referenceArr2;
    }

    private CallbackReference(com.sun.jna.Callback callback, int i, boolean z) {
        super(callback);
        long createNativeCallback;
        com.sun.jna.TypeMapper typeMapper = com.sun.jna.Native.getTypeMapper(callback.getClass());
        this.getHighSpeedVideoFpsRanges = i;
        boolean isPPC = com.sun.jna.Platform.isPPC();
        int i2 = 0;
        if (z) {
            java.lang.reflect.Method highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges(callback.getClass()));
            java.lang.Class<?>[] parameterTypes = highResolutionOutputSizeshNQ4ISI.getParameterTypes();
            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                if ((isPPC && (parameterTypes[i3] == java.lang.Float.TYPE || parameterTypes[i3] == java.lang.Double.TYPE)) || (typeMapper != null && typeMapper.getFromNativeConverter(parameterTypes[i3]) != null)) {
                    z = false;
                    break;
                }
            }
            if (typeMapper != null && typeMapper.getToNativeConverter(highResolutionOutputSizeshNQ4ISI.getReturnType()) != null) {
                z = false;
            }
        }
        java.lang.String stringEncoding = com.sun.jna.Native.getStringEncoding(callback.getClass());
        if (!z) {
            if (callback instanceof com.sun.jna.CallbackProxy) {
                this.getInputSizeshNQ4ISI = (com.sun.jna.CallbackProxy) callback;
            } else {
                this.getInputSizeshNQ4ISI = new com.sun.jna.CallbackReference.DefaultCallbackProxy(getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges(callback.getClass())), typeMapper, stringEncoding);
            }
            java.lang.Class<?>[] parameterTypes2 = this.getInputSizeshNQ4ISI.getParameterTypes();
            java.lang.Class<?> returnType = this.getInputSizeshNQ4ISI.getReturnType();
            if (typeMapper != null) {
                for (int i4 = 0; i4 < parameterTypes2.length; i4++) {
                    com.sun.jna.FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(parameterTypes2[i4]);
                    if (fromNativeConverter != null) {
                        parameterTypes2[i4] = fromNativeConverter.nativeType();
                    }
                }
                com.sun.jna.ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(returnType);
                if (toNativeConverter != null) {
                    returnType = toNativeConverter.nativeType();
                }
            }
            for (int i5 = 0; i5 < parameterTypes2.length; i5++) {
                java.lang.Class<?> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(parameterTypes2[i5]);
                parameterTypes2[i5] = highSpeedVideoFpsRangesFor;
                if (!getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Callback argument ");
                    sb.append(parameterTypes2[i5]);
                    sb.append(" requires custom type conversion");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
            java.lang.Class<?> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(returnType);
            if (!getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor2)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Callback return type ");
                sb2.append(highSpeedVideoFpsRangesFor2);
                sb2.append(" requires custom type conversion");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            java.lang.Class<?> cls = getOutputMinFrameDurationlomOqCM;
            if (cls != null && cls.isInstance(callback)) {
                i2 = 2;
            }
            createNativeCallback = com.sun.jna.Native.createNativeCallback(this.getInputSizeshNQ4ISI, getOutputSizes, parameterTypes2, highSpeedVideoFpsRangesFor2, i, i2, stringEncoding);
        } else {
            java.lang.reflect.Method highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges(callback.getClass()));
            this.getOutputFormats = highResolutionOutputSizeshNQ4ISI2;
            java.lang.Class<?>[] parameterTypes3 = highResolutionOutputSizeshNQ4ISI2.getParameterTypes();
            java.lang.Class<?> returnType2 = this.getOutputFormats.getReturnType();
            java.lang.Class<?> cls2 = getOutputMinFrameDurationlomOqCM;
            createNativeCallback = com.sun.jna.Native.createNativeCallback(callback, this.getOutputFormats, parameterTypes3, returnType2, i, (cls2 == null || !cls2.isInstance(callback)) ? 1 : 3, stringEncoding);
        }
        this.getHighSpeedVideoSizesFor = createNativeCallback != 0 ? new com.sun.jna.Pointer(createNativeCallback) : null;
        if (createNativeCallback != 0) {
            getOutputStallDuration.put(java.lang.Long.valueOf(createNativeCallback), new java.lang.ref.WeakReference(this));
            this.getInputFormats = com.sun.jna.internal.Cleaner.getCleaner().register(this, new com.sun.jna.CallbackReference.CallbackReferenceDisposer(this.getHighSpeedVideoSizesFor));
        }
    }

    private static java.lang.Class<?> getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls) {
        if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
            com.sun.jna.Structure.getHighSpeedVideoFpsRanges((java.lang.Class<? extends com.sun.jna.Structure>) cls);
            if (!com.sun.jna.Structure.ByValue.class.isAssignableFrom(cls)) {
                return com.sun.jna.Pointer.class;
            }
        } else {
            if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
                return com.sun.jna.NativeMappedConverter.getInstance(cls).nativeType();
            }
            if (cls == java.lang.String.class || cls == com.sun.jna.WString.class || cls == java.lang.String[].class || cls == com.sun.jna.WString[].class || com.sun.jna.Callback.class.isAssignableFrom(cls)) {
                return com.sun.jna.Pointer.class;
            }
        }
        return cls;
    }

    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor(java.lang.reflect.Method method) {
        if (method.getParameterTypes().length <= 256) {
            return method;
        }
        throw new java.lang.UnsupportedOperationException("Method signature exceeds the maximum parameter count: ".concat(java.lang.String.valueOf(method)));
    }

    static java.lang.Class<?> getHighSpeedVideoFpsRanges(java.lang.Class<?> cls) {
        if (!com.sun.jna.Callback.class.isAssignableFrom(cls)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls.getName());
            sb.append(" is not derived from com.sun.jna.Callback");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (!cls.isInterface()) {
            java.lang.Class<?>[] interfaces = cls.getInterfaces();
            int i = 0;
            while (true) {
                if (i >= interfaces.length) {
                    break;
                }
                if (com.sun.jna.Callback.class.isAssignableFrom(interfaces[i])) {
                    try {
                        getHighResolutionOutputSizeshNQ4ISI(interfaces[i]);
                        return interfaces[i];
                    } catch (java.lang.IllegalArgumentException unused) {
                        return com.sun.jna.Callback.class.isAssignableFrom(cls.getSuperclass()) ? getHighSpeedVideoFpsRanges(cls.getSuperclass()) : cls;
                    }
                }
                i++;
            }
        } else {
            return cls;
        }
    }

    private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<?> cls) {
        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
        java.lang.reflect.Method[] methods = cls.getMethods();
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(declaredMethods));
        hashSet.retainAll(java.util.Arrays.asList(methods));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (com.sun.jna.Callback.FORBIDDEN_NAMES.contains(((java.lang.reflect.Method) it.next()).getName())) {
                it.remove();
            }
        }
        java.lang.reflect.Method[] methodArr = (java.lang.reflect.Method[]) hashSet.toArray(new java.lang.reflect.Method[0]);
        if (methodArr.length == 1) {
            return getHighSpeedVideoFpsRangesFor(methodArr[0]);
        }
        for (java.lang.reflect.Method method : methodArr) {
            if (com.sun.jna.Callback.METHOD_NAME.equals(method.getName())) {
                return getHighSpeedVideoFpsRangesFor(method);
            }
        }
        throw new java.lang.IllegalArgumentException("Callback must implement a single public method, or one public method named 'callback'");
    }

    public com.sun.jna.Pointer getTrampoline() {
        if (this.getOutputMinFrameDuration == null) {
            this.getOutputMinFrameDuration = this.getHighSpeedVideoSizesFor.getPointer(0L);
        }
        return this.getOutputMinFrameDuration;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.sun.jna.internal.Cleaner.Cleanable cleanable = this.getInputFormats;
        if (cleanable != null) {
            cleanable.clean();
        }
        this.getHighSpeedVideoSizesFor = null;
    }

    @java.lang.Deprecated
    protected void dispose() {
        close();
    }

    static void getHighSpeedVideoFpsRanges() {
        java.util.Iterator it = new java.util.LinkedList(getOutputStallDuration.values()).iterator();
        while (it.hasNext()) {
            com.sun.jna.CallbackReference callbackReference = (com.sun.jna.CallbackReference) ((java.lang.ref.Reference) it.next()).get();
            if (callbackReference != null) {
                callbackReference.close();
            }
        }
    }

    public static com.sun.jna.Pointer getFunctionPointer(com.sun.jna.Callback callback) {
        return getFunctionPointer(callback, false);
    }

    class DefaultCallbackProxy implements com.sun.jna.CallbackProxy {
        private com.sun.jna.ToNativeConverter Camera2StreamConfigurationMap;
        private final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
        private final com.sun.jna.FromNativeConverter[] getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public DefaultCallbackProxy(java.lang.reflect.Method method, com.sun.jna.TypeMapper typeMapper, java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = method;
            this.getHighSpeedVideoFpsRangesFor = str;
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            java.lang.Class<?> returnType = method.getReturnType();
            this.getHighSpeedVideoFpsRanges = new com.sun.jna.FromNativeConverter[parameterTypes.length];
            if (com.sun.jna.NativeMapped.class.isAssignableFrom(returnType)) {
                this.Camera2StreamConfigurationMap = com.sun.jna.NativeMappedConverter.getInstance(returnType);
            } else if (typeMapper != null) {
                this.Camera2StreamConfigurationMap = typeMapper.getToNativeConverter(returnType);
            }
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges.length; i++) {
                if (com.sun.jna.NativeMapped.class.isAssignableFrom(parameterTypes[i])) {
                    this.getHighSpeedVideoFpsRanges[i] = new com.sun.jna.NativeMappedConverter(parameterTypes[i]);
                } else if (typeMapper != null) {
                    this.getHighSpeedVideoFpsRanges[i] = typeMapper.getFromNativeConverter(parameterTypes[i]);
                }
            }
            if (method.isAccessible()) {
                return;
            }
            try {
                method.setAccessible(true);
            } catch (java.lang.SecurityException unused) {
                throw new java.lang.IllegalArgumentException("Callback method is inaccessible, make sure the interface is public: ".concat(java.lang.String.valueOf(method)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v15, types: [com.sun.jna.Structure] */
        /* JADX WARN: Type inference failed for: r7v16, types: [com.sun.jna.Structure] */
        /* JADX WARN: Type inference failed for: r7v17, types: [com.sun.jna.Callback] */
        /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r7v21, types: [com.sun.jna.WString] */
        /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v24 */
        /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object] */
        private java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.Object[] objArr) {
            boolean z;
            com.sun.jna.StringArray stringArray;
            ?? r7;
            java.lang.Class<?>[] parameterTypes = this.getHighResolutionOutputSizeshNQ4ISI.getParameterTypes();
            int length = objArr.length;
            ?? r4 = new java.lang.Object[length];
            int i = 0;
            while (true) {
                if (i >= objArr.length) {
                    break;
                }
                java.lang.Class<?> cls = parameterTypes[i];
                java.lang.Object obj = objArr[i];
                if (this.getHighSpeedVideoFpsRanges[i] != null) {
                    r7 = this.getHighSpeedVideoFpsRanges[i].fromNative(obj, new com.sun.jna.CallbackParameterContext(cls, this.getHighResolutionOutputSizeshNQ4ISI, objArr, i));
                } else {
                    if (obj instanceof com.sun.jna.Pointer) {
                        if (cls == java.lang.String.class) {
                            r7 = ((com.sun.jna.Pointer) obj).getString(0L, this.getHighSpeedVideoFpsRangesFor);
                        } else if (cls == com.sun.jna.WString.class) {
                            r7 = new com.sun.jna.WString(((com.sun.jna.Pointer) obj).getWideString(0L));
                        } else if (cls == java.lang.String[].class) {
                            r7 = ((com.sun.jna.Pointer) obj).getStringArray(0L, this.getHighSpeedVideoFpsRangesFor);
                        } else if (cls == com.sun.jna.WString[].class) {
                            r7 = ((com.sun.jna.Pointer) obj).getWideStringArray(0L);
                        } else if (com.sun.jna.Callback.class.isAssignableFrom(cls)) {
                            r7 = com.sun.jna.CallbackReference.getCallback(cls, (com.sun.jna.Pointer) obj);
                        } else if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
                            if (com.sun.jna.Structure.ByValue.class.isAssignableFrom(cls)) {
                                r7 = com.sun.jna.Structure.newInstance(cls);
                                int size = r7.size();
                                byte[] bArr = new byte[size];
                                ((com.sun.jna.Pointer) obj).read(0L, bArr, 0, size);
                                r7.getPointer().write(0L, bArr, 0, size);
                                r7.read();
                            } else {
                                r7 = com.sun.jna.Structure.newInstance(cls, (com.sun.jna.Pointer) obj);
                                if (!r7.readCalled) {
                                    r7.autoRead();
                                }
                            }
                        }
                    } else if ((java.lang.Boolean.TYPE == cls || java.lang.Boolean.class == cls) && (obj instanceof java.lang.Number)) {
                        obj = com.sun.jna.Function.getHighSpeedVideoFpsRanges(((java.lang.Number) obj).intValue() != 0);
                    }
                    r7 = obj;
                }
                r4[i] = r7;
                i++;
            }
            com.sun.jna.Callback highResolutionOutputSizeshNQ4ISI = com.sun.jna.CallbackReference.getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.CallbackReference.this);
            java.lang.Object obj2 = null;
            if (highResolutionOutputSizeshNQ4ISI != null) {
                try {
                    java.lang.Object invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(highResolutionOutputSizeshNQ4ISI, r4);
                    com.sun.jna.ToNativeConverter toNativeConverter = this.Camera2StreamConfigurationMap;
                    if (toNativeConverter != null) {
                        invoke = toNativeConverter.toNative(invoke, new com.sun.jna.CallbackResultContext(this.getHighResolutionOutputSizeshNQ4ISI));
                    }
                    if (invoke != null) {
                        java.lang.Class<?> cls2 = invoke.getClass();
                        if (com.sun.jna.Structure.class.isAssignableFrom(cls2)) {
                            if (!com.sun.jna.Structure.ByValue.class.isAssignableFrom(cls2)) {
                                invoke = ((com.sun.jna.Structure) invoke).getPointer();
                            }
                        } else if (cls2 == java.lang.Boolean.TYPE || cls2 == java.lang.Boolean.class) {
                            invoke = java.lang.Boolean.TRUE.equals(invoke) ? com.sun.jna.Function.getHighSpeedVideoSizes : com.sun.jna.Function.Camera2StreamConfigurationMap;
                        } else if (cls2 == java.lang.String.class || cls2 == com.sun.jna.WString.class) {
                            if (cls2 != com.sun.jna.WString.class) {
                                z = false;
                            }
                            invoke = com.sun.jna.CallbackReference.getNativeString(invoke, z);
                        } else if (cls2 == java.lang.String[].class || cls2 == com.sun.jna.WString[].class) {
                            if (cls2 == java.lang.String[].class) {
                                stringArray = new com.sun.jna.StringArray((java.lang.String[]) invoke, this.getHighSpeedVideoFpsRangesFor);
                            } else {
                                stringArray = new com.sun.jna.StringArray((com.sun.jna.WString[]) invoke);
                            }
                            com.sun.jna.CallbackReference.getHighSpeedVideoFpsRangesFor.put(invoke, stringArray);
                            obj2 = stringArray;
                        } else if (com.sun.jna.Callback.class.isAssignableFrom(cls2)) {
                            invoke = com.sun.jna.CallbackReference.getFunctionPointer((com.sun.jna.Callback) invoke);
                        }
                        obj2 = invoke;
                    }
                } catch (java.lang.IllegalAccessException e) {
                    e = e;
                    com.sun.jna.Native.getCallbackExceptionHandler().uncaughtException(highResolutionOutputSizeshNQ4ISI, e);
                } catch (java.lang.IllegalArgumentException e2) {
                    e = e2;
                    com.sun.jna.Native.getCallbackExceptionHandler().uncaughtException(highResolutionOutputSizeshNQ4ISI, e);
                } catch (java.lang.reflect.InvocationTargetException e3) {
                    com.sun.jna.Native.getCallbackExceptionHandler().uncaughtException(highResolutionOutputSizeshNQ4ISI, e3.getTargetException());
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                ?? r0 = r4[i2];
                if ((r0 instanceof com.sun.jna.Structure) && !(r0 instanceof com.sun.jna.Structure.ByValue)) {
                    ((com.sun.jna.Structure) r0).autoWrite();
                }
            }
            return obj2;
        }

        @Override // com.sun.jna.CallbackProxy
        public java.lang.Object callback(java.lang.Object[] objArr) {
            try {
                return getHighSpeedVideoFpsRangesFor(objArr);
            } catch (java.lang.Throwable th) {
                com.sun.jna.Native.getCallbackExceptionHandler().uncaughtException(com.sun.jna.CallbackReference.getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.CallbackReference.this), th);
                return null;
            }
        }

        @Override // com.sun.jna.CallbackProxy
        public java.lang.Class<?>[] getParameterTypes() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getParameterTypes();
        }

        @Override // com.sun.jna.CallbackProxy
        public java.lang.Class<?> getReturnType() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getReturnType();
        }
    }

    static class NativeFunctionHandler implements java.lang.reflect.InvocationHandler {
        final com.sun.jna.Function Camera2StreamConfigurationMap;
        private final java.util.Map<java.lang.String, ?> getHighSpeedVideoFpsRangesFor;

        public NativeFunctionHandler(com.sun.jna.Pointer pointer, int i, java.util.Map<java.lang.String, ?> map) {
            this.getHighSpeedVideoFpsRangesFor = map;
            this.Camera2StreamConfigurationMap = new com.sun.jna.Function(pointer, i, (java.lang.String) map.get(com.sun.jna.Library.OPTION_STRING_ENCODING));
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
            if (com.sun.jna.Library.Handler.getHighResolutionOutputSizeshNQ4ISI.equals(method)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Proxy interface to ");
                sb.append(this.Camera2StreamConfigurationMap);
                java.lang.String obj2 = sb.toString();
                java.lang.Class<?> highSpeedVideoFpsRanges = com.sun.jna.CallbackReference.getHighSpeedVideoFpsRanges(((java.lang.reflect.Method) this.getHighSpeedVideoFpsRangesFor.get("invoking-method")).getDeclaringClass());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj2);
                sb2.append(" (");
                sb2.append(highSpeedVideoFpsRanges.getName());
                sb2.append(")");
                return sb2.toString();
            }
            if (com.sun.jna.Library.Handler.getHighSpeedVideoFpsRanges.equals(method)) {
                return java.lang.Integer.valueOf(hashCode());
            }
            if (com.sun.jna.Library.Handler.Camera2StreamConfigurationMap.equals(method)) {
                java.lang.Object obj3 = objArr[0];
                if (obj3 == null || !java.lang.reflect.Proxy.isProxyClass(obj3.getClass())) {
                    return java.lang.Boolean.FALSE;
                }
                return com.sun.jna.Function.getHighSpeedVideoFpsRanges(java.lang.reflect.Proxy.getInvocationHandler(obj3) == this);
            }
            if (com.sun.jna.Function.Camera2StreamConfigurationMap(method)) {
                objArr = com.sun.jna.Function.Camera2StreamConfigurationMap(objArr);
            }
            return this.Camera2StreamConfigurationMap.invoke(method.getReturnType(), objArr, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    private static boolean getHighSpeedVideoSizes(java.lang.Class<?> cls) {
        if (cls == java.lang.Void.TYPE || cls == java.lang.Void.class || cls == java.lang.Boolean.TYPE || cls == java.lang.Boolean.class || cls == java.lang.Byte.TYPE || cls == java.lang.Byte.class || cls == java.lang.Short.TYPE || cls == java.lang.Short.class || cls == java.lang.Character.TYPE || cls == java.lang.Character.class || cls == java.lang.Integer.TYPE || cls == java.lang.Integer.class || cls == java.lang.Long.TYPE || cls == java.lang.Long.class || cls == java.lang.Float.TYPE || cls == java.lang.Float.class || cls == java.lang.Double.TYPE || cls == java.lang.Double.class) {
            return true;
        }
        return (com.sun.jna.Structure.ByValue.class.isAssignableFrom(cls) && com.sun.jna.Structure.class.isAssignableFrom(cls)) || com.sun.jna.Pointer.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.sun.jna.Pointer getNativeString(java.lang.Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        com.sun.jna.NativeString nativeString = new com.sun.jna.NativeString(obj.toString(), z);
        getHighSpeedVideoFpsRangesFor.put(obj, nativeString);
        return nativeString.getHighSpeedVideoFpsRangesFor;
    }

    static final class CallbackReferenceDisposer implements java.lang.Runnable {
        private com.sun.jna.Pointer getHighSpeedVideoFpsRangesFor;

        public CallbackReferenceDisposer(com.sun.jna.Pointer pointer) {
            this.getHighSpeedVideoFpsRangesFor = pointer;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                com.sun.jna.Pointer pointer = this.getHighSpeedVideoFpsRangesFor;
                if (pointer != null) {
                    try {
                        com.sun.jna.Native.freeNativeCallback(pointer.peer);
                        com.sun.jna.CallbackReference.getOutputStallDuration.remove(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.peer));
                        this.getHighSpeedVideoFpsRangesFor.peer = 0L;
                        this.getHighSpeedVideoFpsRangesFor = null;
                    } catch (java.lang.Throwable th) {
                        com.sun.jna.CallbackReference.getOutputStallDuration.remove(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.peer));
                        this.getHighSpeedVideoFpsRangesFor.peer = 0L;
                        this.getHighSpeedVideoFpsRangesFor = null;
                        throw th;
                    }
                }
            }
        }
    }

    static /* synthetic */ com.sun.jna.Callback getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.CallbackReference callbackReference) {
        return callbackReference.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.sun.jna.Pointer getFunctionPointer(com.sun.jna.Callback callback, boolean z) {
        com.sun.jna.Function function;
        int intValue;
        com.sun.jna.Pointer trampoline;
        if (callback == null) {
            return null;
        }
        if (java.lang.reflect.Proxy.isProxyClass(callback.getClass())) {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(callback);
            if (invocationHandler instanceof com.sun.jna.CallbackReference.NativeFunctionHandler) {
                function = ((com.sun.jna.CallbackReference.NativeFunctionHandler) invocationHandler).Camera2StreamConfigurationMap;
                if (function == null) {
                    return function;
                }
                java.util.Map<java.lang.String, java.lang.Object> libraryOptions = com.sun.jna.Native.getLibraryOptions(callback.getClass());
                if (callback instanceof com.sun.jna.AltCallingConvention) {
                    intValue = 63;
                } else {
                    intValue = (libraryOptions == null || !libraryOptions.containsKey(com.sun.jna.Library.OPTION_CALLING_CONVENTION)) ? 0 : ((java.lang.Integer) libraryOptions.get(com.sun.jna.Library.OPTION_CALLING_CONVENTION)).intValue();
                }
                java.util.Map<com.sun.jna.Callback, com.sun.jna.CallbackReference> map = z ? Camera2StreamConfigurationMap : getHighSpeedVideoSizes;
                java.util.Map<com.sun.jna.Pointer, java.lang.ref.Reference<com.sun.jna.Callback>[]> map2 = getHighResolutionOutputSizeshNQ4ISI;
                synchronized (map2) {
                    com.sun.jna.CallbackReference callbackReference = map.get(callback);
                    if (callbackReference == null || callbackReference.getHighSpeedVideoSizesFor == null) {
                        callbackReference = new com.sun.jna.CallbackReference(callback, intValue, z);
                        map.put(callback, callbackReference);
                        map2.put(callbackReference.getTrampoline(), getHighSpeedVideoSizes(callback, (java.lang.ref.Reference<com.sun.jna.Callback>[]) null));
                        if (getOutputSizeshNQ4ISI.containsKey(callback)) {
                            callbackReference.getHighSpeedVideoSizesFor.setInt(com.sun.jna.Native.POINTER_SIZE, 1);
                        }
                    }
                    trampoline = callbackReference.getTrampoline();
                }
                return trampoline;
            }
        }
        function = null;
        if (function == null) {
        }
    }
}
