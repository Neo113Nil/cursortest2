package com.sun.jna;

/* loaded from: classes5.dex */
public interface Library {
    public static final java.lang.String OPTION_ALLOW_OBJECTS = "allow-objects";
    public static final java.lang.String OPTION_CALLING_CONVENTION = "calling-convention";
    public static final java.lang.String OPTION_CLASSLOADER = "classloader";
    public static final java.lang.String OPTION_FUNCTION_MAPPER = "function-mapper";
    public static final java.lang.String OPTION_INVOCATION_MAPPER = "invocation-mapper";
    public static final java.lang.String OPTION_OPEN_FLAGS = "open-flags";
    public static final java.lang.String OPTION_STRING_ENCODING = "string-encoding";
    public static final java.lang.String OPTION_STRUCTURE_ALIGNMENT = "structure-alignment";
    public static final java.lang.String OPTION_SYMBOL_PROVIDER = "symbol-provider";
    public static final java.lang.String OPTION_TYPE_MAPPER = "type-mapper";

    public static class Handler implements java.lang.reflect.InvocationHandler {
        static final java.lang.reflect.Method Camera2StreamConfigurationMap;
        static final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
        static final java.lang.reflect.Method getHighSpeedVideoFpsRanges;
        private final java.util.Map<java.lang.reflect.Method, com.sun.jna.Library.Handler.FunctionInfo> getHighSpeedVideoFpsRangesFor = new java.util.WeakHashMap();
        private final java.lang.Class<?> getHighSpeedVideoSizes;
        private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizesFor;
        private final com.sun.jna.InvocationMapper getInputSizeshNQ4ISI;
        private final com.sun.jna.NativeLibrary getOutputMinFrameDuration;

        static {
            try {
                getHighResolutionOutputSizeshNQ4ISI = java.lang.Object.class.getMethod("toString", new java.lang.Class[0]);
                getHighSpeedVideoFpsRanges = java.lang.Object.class.getMethod("hashCode", new java.lang.Class[0]);
                Camera2StreamConfigurationMap = java.lang.Object.class.getMethod("equals", java.lang.Object.class);
            } catch (java.lang.Exception unused) {
                throw new java.lang.Error("Error retrieving Object.toString() method");
            }
        }

        static final class FunctionInfo {
            final java.util.Map<java.lang.String, ?> Camera2StreamConfigurationMap;
            final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
            final boolean getHighSpeedVideoFpsRanges;
            final java.lang.reflect.InvocationHandler getHighSpeedVideoFpsRangesFor;
            final com.sun.jna.Function getHighSpeedVideoSizes;
            final java.lang.Class<?>[] getInputSizeshNQ4ISI;

            FunctionInfo(java.lang.Object obj) {
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = false;
                this.Camera2StreamConfigurationMap = null;
                this.getInputSizeshNQ4ISI = null;
                this.getHighResolutionOutputSizeshNQ4ISI = obj;
            }

            FunctionInfo(java.lang.reflect.InvocationHandler invocationHandler, com.sun.jna.Function function, java.lang.Class<?>[] clsArr, boolean z, java.util.Map<java.lang.String, ?> map) {
                this.getHighSpeedVideoFpsRangesFor = invocationHandler;
                this.getHighSpeedVideoSizes = function;
                this.getHighSpeedVideoFpsRanges = z;
                this.Camera2StreamConfigurationMap = map;
                this.getInputSizeshNQ4ISI = clsArr;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }

        public Handler(java.lang.String str, java.lang.Class<?> cls, java.util.Map<java.lang.String, ?> map) {
            if (str != null && "".equals(str.trim())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid library name \"");
                sb.append(str);
                sb.append("\"");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (!cls.isInterface()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" does not implement an interface: ");
                sb2.append(cls.getName());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            this.getHighSpeedVideoSizes = cls;
            java.util.HashMap hashMap = new java.util.HashMap(map);
            this.getHighSpeedVideoSizesFor = hashMap;
            int i = com.sun.jna.AltCallingConvention.class.isAssignableFrom(cls) ? 63 : 0;
            if (hashMap.get(com.sun.jna.Library.OPTION_CALLING_CONVENTION) == null) {
                hashMap.put(com.sun.jna.Library.OPTION_CALLING_CONVENTION, java.lang.Integer.valueOf(i));
            }
            if (hashMap.get(com.sun.jna.Library.OPTION_CLASSLOADER) == null) {
                hashMap.put(com.sun.jna.Library.OPTION_CLASSLOADER, cls.getClassLoader());
            }
            this.getOutputMinFrameDuration = com.sun.jna.NativeLibrary.getInstance(str, hashMap);
            this.getInputSizeshNQ4ISI = (com.sun.jna.InvocationMapper) hashMap.get(com.sun.jna.Library.OPTION_INVOCATION_MAPPER);
        }

        public com.sun.jna.NativeLibrary getNativeLibrary() {
            return this.getOutputMinFrameDuration;
        }

        public java.lang.String getLibraryName() {
            return this.getOutputMinFrameDuration.getName();
        }

        public java.lang.Class<?> getInterfaceClass() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
            com.sun.jna.Library.Handler.FunctionInfo functionInfo;
            com.sun.jna.Function function;
            java.lang.Class<?>[] clsArr;
            java.util.HashMap hashMap;
            if (getHighResolutionOutputSizeshNQ4ISI.equals(method)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Proxy interface to ");
                sb.append(this.getOutputMinFrameDuration);
                return sb.toString();
            }
            if (getHighSpeedVideoFpsRanges.equals(method)) {
                return java.lang.Integer.valueOf(hashCode());
            }
            if (Camera2StreamConfigurationMap.equals(method)) {
                java.lang.Object obj2 = objArr[0];
                if (obj2 == null || !java.lang.reflect.Proxy.isProxyClass(obj2.getClass())) {
                    return java.lang.Boolean.FALSE;
                }
                return com.sun.jna.Function.getHighSpeedVideoFpsRanges(java.lang.reflect.Proxy.getInvocationHandler(obj2) == this);
            }
            com.sun.jna.Library.Handler.FunctionInfo functionInfo2 = this.getHighSpeedVideoFpsRangesFor.get(method);
            if (functionInfo2 == null) {
                synchronized (this.getHighSpeedVideoFpsRangesFor) {
                    functionInfo = this.getHighSpeedVideoFpsRangesFor.get(method);
                    if (functionInfo == null) {
                        if (!com.sun.jna.internal.ReflectionUtils.isDefault(method)) {
                            boolean Camera2StreamConfigurationMap2 = com.sun.jna.Function.Camera2StreamConfigurationMap(method);
                            com.sun.jna.InvocationMapper invocationMapper = this.getInputSizeshNQ4ISI;
                            java.lang.reflect.InvocationHandler invocationHandler = invocationMapper != null ? invocationMapper.getInvocationHandler(this.getOutputMinFrameDuration, method) : null;
                            if (invocationHandler == null) {
                                com.sun.jna.Function highSpeedVideoFpsRanges = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(method.getName(), method);
                                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                                java.util.HashMap hashMap2 = new java.util.HashMap(this.getHighSpeedVideoSizesFor);
                                hashMap2.put("invoking-method", method);
                                clsArr = parameterTypes;
                                hashMap = hashMap2;
                                function = highSpeedVideoFpsRanges;
                            } else {
                                function = null;
                                clsArr = null;
                                hashMap = null;
                            }
                            functionInfo = new com.sun.jna.Library.Handler.FunctionInfo(invocationHandler, function, clsArr, Camera2StreamConfigurationMap2, hashMap);
                        } else {
                            functionInfo = new com.sun.jna.Library.Handler.FunctionInfo(com.sun.jna.internal.ReflectionUtils.getMethodHandle(method));
                        }
                        this.getHighSpeedVideoFpsRangesFor.put(method, functionInfo);
                    }
                }
                functionInfo2 = functionInfo;
            }
            if (functionInfo2.getHighResolutionOutputSizeshNQ4ISI != null) {
                return com.sun.jna.internal.ReflectionUtils.invokeDefaultMethod(obj, functionInfo2.getHighResolutionOutputSizeshNQ4ISI, objArr);
            }
            if (functionInfo2.getHighSpeedVideoFpsRanges) {
                objArr = com.sun.jna.Function.Camera2StreamConfigurationMap(objArr);
            }
            java.lang.Object[] objArr2 = objArr;
            if (functionInfo2.getHighSpeedVideoFpsRangesFor != null) {
                return functionInfo2.getHighSpeedVideoFpsRangesFor.invoke(obj, method, objArr2);
            }
            return functionInfo2.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(method, functionInfo2.getInputSizeshNQ4ISI, method.getReturnType(), objArr2, functionInfo2.Camera2StreamConfigurationMap);
        }
    }
}
