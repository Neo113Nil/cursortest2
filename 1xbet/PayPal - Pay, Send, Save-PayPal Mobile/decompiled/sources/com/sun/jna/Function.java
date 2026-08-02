package com.sun.jna;

/* loaded from: classes5.dex */
public class Function extends com.sun.jna.Pointer {
    public static final int ALT_CONVENTION = 63;
    public static final int C_CONVENTION = 0;
    public static final int MAX_NARGS = 256;
    public static final int THROW_LAST_ERROR = 64;
    public static final int USE_VARARGS = 255;
    final java.util.Map<java.lang.String, ?> getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;
    private com.sun.jna.NativeLibrary getInputFormats;
    private final java.lang.String getOutputMinFrameDuration;
    static final java.lang.Integer getHighSpeedVideoSizes = -1;
    static final java.lang.Integer Camera2StreamConfigurationMap = 0;
    private static final com.sun.jna.VarArgsChecker getOutputFormats = com.sun.jna.VarArgsChecker.Camera2StreamConfigurationMap();

    public interface PostCallRead {
        void read();
    }

    public static com.sun.jna.Function getFunction(java.lang.String str, java.lang.String str2) {
        return com.sun.jna.NativeLibrary.getInstance(str).getFunction(str2);
    }

    public static com.sun.jna.Function getFunction(java.lang.String str, java.lang.String str2, int i) {
        return com.sun.jna.NativeLibrary.getInstance(str).getFunction(str2, i, null);
    }

    public static com.sun.jna.Function getFunction(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        return com.sun.jna.NativeLibrary.getInstance(str).getFunction(str2, i, str3);
    }

    public static com.sun.jna.Function getFunction(com.sun.jna.Pointer pointer) {
        return getFunction(pointer, 0, (java.lang.String) null);
    }

    public static com.sun.jna.Function getFunction(com.sun.jna.Pointer pointer, int i) {
        return getFunction(pointer, i, (java.lang.String) null);
    }

    public static com.sun.jna.Function getFunction(com.sun.jna.Pointer pointer, int i, java.lang.String str) {
        return new com.sun.jna.Function(pointer, i, str);
    }

    Function(com.sun.jna.NativeLibrary nativeLibrary, java.lang.String str, int i, java.lang.String str2) {
        int i2 = i & 63;
        if ((i & 63) != i2) {
            throw new java.lang.IllegalArgumentException("Unrecognized calling convention: ".concat(java.lang.String.valueOf(i2)));
        }
        if (str == null) {
            throw new java.lang.NullPointerException("Function name must not be null");
        }
        this.getInputFormats = nativeLibrary;
        this.getOutputMinFrameDuration = str;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = nativeLibrary.getOptions();
        this.getHighSpeedVideoFpsRanges = str2 == null ? com.sun.jna.Native.getDefaultStringEncoding() : str2;
        try {
            this.peer = nativeLibrary.getHighSpeedVideoFpsRangesFor(str);
        } catch (java.lang.UnsatisfiedLinkError e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error looking up function '");
            sb.append(str);
            sb.append("': ");
            sb.append(e.getMessage());
            throw new java.lang.UnsatisfiedLinkError(sb.toString());
        }
    }

    Function(com.sun.jna.Pointer pointer, int i, java.lang.String str) {
        int i2 = i & 63;
        if ((i & 63) != i2) {
            throw new java.lang.IllegalArgumentException("Unrecognized calling convention: ".concat(java.lang.String.valueOf(i2)));
        }
        if (pointer == null || pointer.peer == 0) {
            throw new java.lang.NullPointerException("Function address may not be null");
        }
        this.getOutputMinFrameDuration = pointer.toString();
        this.getHighSpeedVideoFpsRangesFor = i;
        this.peer = pointer.peer;
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.EMPTY_MAP;
        this.getHighSpeedVideoFpsRanges = str == null ? com.sun.jna.Native.getDefaultStringEncoding() : str;
    }

    public java.lang.String getName() {
        return this.getOutputMinFrameDuration;
    }

    public int getCallingConvention() {
        return this.getHighSpeedVideoFpsRangesFor & 63;
    }

    public java.lang.Object invoke(java.lang.Class<?> cls, java.lang.Object[] objArr) {
        return invoke(cls, objArr, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.lang.Object invoke(java.lang.Class<?> cls, java.lang.Object[] objArr, java.util.Map<java.lang.String, ?> map) {
        java.lang.reflect.Method method = (java.lang.reflect.Method) map.get("invoking-method");
        return Camera2StreamConfigurationMap(method, method != null ? method.getParameterTypes() : null, cls, objArr, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
    
        if (com.sun.jna.Structure.ByValue.class.isAssignableFrom(r6) != false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v16, types: [com.sun.jna.Pointer] */
    /* JADX WARN: Type inference failed for: r15v18, types: [com.sun.jna.Pointer] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20, types: [com.sun.jna.Pointer] */
    /* JADX WARN: Type inference failed for: r15v21, types: [com.sun.jna.Structure, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v22, types: [com.sun.jna.Pointer] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.sun.jna.Pointer] */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.sun.jna.Pointer] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.sun.jna.Function] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v49, types: [com.sun.jna.ToNativeConverter] */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    java.lang.Object Camera2StreamConfigurationMap(java.lang.reflect.Method method, java.lang.Class<?>[] clsArr, java.lang.Class<?> cls, java.lang.Object[] objArr, java.util.Map<java.lang.String, ?> map) {
        com.sun.jna.FromNativeConverter fromNativeConverter;
        java.lang.Class<?> cls2;
        com.sun.jna.FromNativeConverter fromNativeConverter2;
        com.sun.jna.FromNativeContext functionResultContext;
        java.lang.Class<?> cls3;
        boolean z;
        int i;
        com.sun.jna.Memory nativeMappedArray;
        ?? r6;
        com.sun.jna.ToNativeContext functionParameterContext;
        java.lang.Class<?>[] clsArr2 = clsArr;
        int i2 = 0;
        ?? r7 = new java.lang.Object[0];
        if (objArr != null) {
            if (objArr.length > 256) {
                throw new java.lang.UnsupportedOperationException("Maximum argument count is 256");
            }
            int length = objArr.length;
            java.lang.Object[] objArr2 = new java.lang.Object[length];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
            r7 = objArr2;
        }
        com.sun.jna.TypeMapper typeMapper = (com.sun.jna.TypeMapper) map.get(com.sun.jna.Library.OPTION_TYPE_MAPPER);
        boolean equals = java.lang.Boolean.TRUE.equals(map.get(com.sun.jna.Library.OPTION_ALLOW_OBJECTS));
        boolean Camera2StreamConfigurationMap2 = (r7.length <= 0 || method == null) ? false : getOutputFormats.Camera2StreamConfigurationMap(method);
        int highSpeedVideoSizes = (r7.length <= 0 || method == null) ? 0 : getOutputFormats.getHighSpeedVideoSizes(method);
        int i3 = 0;
        while (i3 < r7.length) {
            if (method == null) {
                cls3 = null;
            } else if (Camera2StreamConfigurationMap2 && i3 >= clsArr2.length - 1) {
                cls3 = clsArr2[clsArr2.length - 1].getComponentType();
            } else {
                cls3 = clsArr2[i3];
            }
            ?? r15 = r7[i3];
            if (r15 != 0) {
                java.lang.Class<?> cls4 = r15.getClass();
                if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls4)) {
                    r6 = com.sun.jna.NativeMappedConverter.getInstance(cls4);
                } else {
                    r6 = typeMapper != null ? typeMapper.getToNativeConverter(cls4) : 0;
                }
                if (r6 != 0) {
                    if (method != null) {
                        functionParameterContext = new com.sun.jna.MethodParameterContext(this, r7, i3, method);
                    } else {
                        functionParameterContext = new com.sun.jna.FunctionParameterContext(this, r7, i3);
                    }
                    r15 = r6.toNative(r15, functionParameterContext);
                }
            }
            if (r15 != 0) {
                java.lang.Class<?> cls5 = r15.getClass();
                if (!cls5.isArray() || !cls5.getComponentType().isPrimitive()) {
                    java.lang.Class<?> cls6 = r15.getClass();
                    if (r15 instanceof com.sun.jna.Structure) {
                        r15 = (com.sun.jna.Structure) r15;
                        r15.autoWrite();
                        if (r15 instanceof com.sun.jna.Structure.ByValue) {
                            java.lang.Class<?> cls7 = r15.getClass();
                            if (method != null) {
                                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                                if (getOutputFormats.Camera2StreamConfigurationMap(method) && i3 >= parameterTypes.length - 1) {
                                    java.lang.Class<?> componentType = parameterTypes[parameterTypes.length - 1].getComponentType();
                                    if (componentType != java.lang.Object.class) {
                                        cls7 = componentType;
                                    }
                                } else {
                                    cls7 = parameterTypes[i3];
                                }
                            }
                        }
                        r15 = r15.getPointer();
                    } else if (r15 instanceof com.sun.jna.Callback) {
                        r15 = com.sun.jna.CallbackReference.getFunctionPointer((com.sun.jna.Callback) r15);
                    } else if (!(r15 instanceof java.lang.String)) {
                        if (!(r15 instanceof com.sun.jna.WString)) {
                            if (r15 instanceof java.lang.Boolean) {
                                r15 = java.lang.Boolean.TRUE.equals(r15) ? getHighSpeedVideoSizes : Camera2StreamConfigurationMap;
                            } else {
                                if (java.lang.String[].class == cls6) {
                                    nativeMappedArray = new com.sun.jna.StringArray((java.lang.String[]) r15, this.getHighSpeedVideoFpsRanges);
                                } else if (com.sun.jna.WString[].class == cls6) {
                                    nativeMappedArray = new com.sun.jna.StringArray((com.sun.jna.WString[]) r15);
                                } else if (com.sun.jna.Pointer[].class == cls6) {
                                    nativeMappedArray = new com.sun.jna.Function.PointerArray((com.sun.jna.Pointer[]) r15);
                                } else if (com.sun.jna.NativeMapped[].class.isAssignableFrom(cls6)) {
                                    nativeMappedArray = new com.sun.jna.Function.NativeMappedArray((com.sun.jna.NativeMapped[]) r15);
                                } else {
                                    if (com.sun.jna.Structure[].class.isAssignableFrom(cls6)) {
                                        com.sun.jna.Structure[] structureArr = (com.sun.jna.Structure[]) r15;
                                        java.lang.Class<?> componentType2 = cls6.getComponentType();
                                        boolean isAssignableFrom = com.sun.jna.Structure.ByReference.class.isAssignableFrom(componentType2);
                                        if (cls3 == null || com.sun.jna.Structure.ByReference[].class.isAssignableFrom(cls3)) {
                                            z = Camera2StreamConfigurationMap2;
                                        } else {
                                            if (isAssignableFrom) {
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Function ");
                                                sb.append(getName());
                                                sb.append(" declared Structure[] at parameter ");
                                                sb.append(i3);
                                                sb.append(" but array of ");
                                                sb.append(componentType2);
                                                sb.append(" was passed");
                                                throw new java.lang.IllegalArgumentException(sb.toString());
                                            }
                                            z = Camera2StreamConfigurationMap2;
                                            for (int i4 = 0; i4 < structureArr.length; i4++) {
                                                if (structureArr[i4] instanceof com.sun.jna.Structure.ByReference) {
                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Function ");
                                                    sb2.append(getName());
                                                    sb2.append(" declared Structure[] at parameter ");
                                                    sb2.append(i3);
                                                    sb2.append(" but element ");
                                                    sb2.append(i4);
                                                    sb2.append(" is of Structure.ByReference type");
                                                    throw new java.lang.IllegalArgumentException(sb2.toString());
                                                }
                                            }
                                        }
                                        if (isAssignableFrom) {
                                            com.sun.jna.Structure.autoWrite(structureArr);
                                            com.sun.jna.Pointer[] pointerArr = new com.sun.jna.Pointer[structureArr.length + 1];
                                            for (int i5 = 0; i5 < structureArr.length; i5++) {
                                                com.sun.jna.Structure structure = structureArr[i5];
                                                pointerArr[i5] = structure != null ? structure.getPointer() : null;
                                            }
                                            r15 = new com.sun.jna.Function.PointerArray(pointerArr);
                                            i = 0;
                                        } else {
                                            if (structureArr.length == 0) {
                                                throw new java.lang.IllegalArgumentException("Structure array must have non-zero length");
                                            }
                                            i = 0;
                                            if (structureArr[0] == null) {
                                                com.sun.jna.Structure.newInstance(componentType2).toArray(structureArr);
                                                r15 = structureArr[0].getPointer();
                                            } else {
                                                com.sun.jna.Structure.autoWrite(structureArr);
                                                r15 = structureArr[0].getPointer();
                                            }
                                        }
                                    } else {
                                        z = Camera2StreamConfigurationMap2;
                                        i = 0;
                                        if (cls6.isArray()) {
                                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unsupported array argument type: ");
                                            sb3.append(cls6.getComponentType());
                                            throw new java.lang.IllegalArgumentException(sb3.toString());
                                        }
                                        if (!equals && !com.sun.jna.Native.isSupportedNativeType(r15.getClass())) {
                                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Unsupported argument type ");
                                            sb4.append(r15.getClass().getName());
                                            sb4.append(" at parameter ");
                                            sb4.append(i3);
                                            sb4.append(" of function ");
                                            sb4.append(getName());
                                            throw new java.lang.IllegalArgumentException(sb4.toString());
                                        }
                                    }
                                    r7[i3] = r15;
                                    i3++;
                                    i2 = i;
                                    Camera2StreamConfigurationMap2 = z;
                                    clsArr2 = clsArr;
                                }
                                r15 = nativeMappedArray;
                            }
                        } else {
                            r15 = new com.sun.jna.NativeString(r15.toString(), true).getHighSpeedVideoFpsRangesFor;
                        }
                    } else {
                        r15 = new com.sun.jna.NativeString((java.lang.String) r15, this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor;
                    }
                }
            }
            z = Camera2StreamConfigurationMap2;
            r15 = r15;
            i = 0;
            r7[i3] = r15;
            i3++;
            i2 = i;
            Camera2StreamConfigurationMap2 = z;
            clsArr2 = clsArr;
        }
        int i6 = i2;
        if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            com.sun.jna.NativeMappedConverter nativeMappedConverter = com.sun.jna.NativeMappedConverter.getInstance(cls);
            cls2 = nativeMappedConverter.nativeType();
            fromNativeConverter2 = nativeMappedConverter;
        } else {
            if (typeMapper != null) {
                fromNativeConverter = typeMapper.getFromNativeConverter(cls);
                if (fromNativeConverter != null) {
                    cls2 = fromNativeConverter.nativeType();
                    fromNativeConverter2 = fromNativeConverter;
                }
            } else {
                fromNativeConverter = null;
            }
            cls2 = cls;
            fromNativeConverter2 = fromNativeConverter;
        }
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(r7, cls2, equals, highSpeedVideoSizes);
        if (fromNativeConverter2 != null) {
            if (method != null) {
                functionResultContext = new com.sun.jna.MethodResultContext(cls, this, objArr, method);
            } else {
                functionResultContext = new com.sun.jna.FunctionResultContext(cls, this, objArr);
            }
            highResolutionOutputSizeshNQ4ISI = fromNativeConverter2.fromNative(highResolutionOutputSizeshNQ4ISI, functionResultContext);
        }
        if (objArr != null) {
            for (int i7 = i6; i7 < objArr.length; i7++) {
                java.lang.Object obj = objArr[i7];
                if (obj != null) {
                    if (obj instanceof com.sun.jna.Structure) {
                        if (!(obj instanceof com.sun.jna.Structure.ByValue)) {
                            ((com.sun.jna.Structure) obj).autoRead();
                        }
                    } else {
                        ?? r62 = r7[i7];
                        if (r62 instanceof com.sun.jna.Function.PostCallRead) {
                            ((com.sun.jna.Function.PostCallRead) r62).read();
                            ?? r63 = r7[i7];
                            if (r63 instanceof com.sun.jna.Function.PointerArray) {
                                com.sun.jna.Function.PointerArray pointerArray = (com.sun.jna.Function.PointerArray) r63;
                                if (com.sun.jna.Structure.ByReference[].class.isAssignableFrom(obj.getClass())) {
                                    java.lang.Class<?> componentType3 = obj.getClass().getComponentType();
                                    com.sun.jna.Structure[] structureArr2 = (com.sun.jna.Structure[]) obj;
                                    for (int i8 = i6; i8 < structureArr2.length; i8++) {
                                        structureArr2[i8] = com.sun.jna.Structure.getHighSpeedVideoFpsRanges((java.lang.Class<com.sun.jna.Structure>) componentType3, structureArr2[i8], pointerArray.getPointer(com.sun.jna.Native.POINTER_SIZE * i8));
                                    }
                                }
                            }
                        } else if (com.sun.jna.Structure[].class.isAssignableFrom(obj.getClass())) {
                            com.sun.jna.Structure.autoRead((com.sun.jna.Structure[]) obj);
                        }
                    }
                }
            }
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.sun.jna.Pointer] */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.sun.jna.Structure] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] objArr, java.lang.Class<?> cls, boolean z, int i) {
        int i2 = this.getHighSpeedVideoFpsRangesFor | ((i & 255) << 7);
        if (cls == null || cls == java.lang.Void.TYPE || cls == java.lang.Void.class) {
            com.sun.jna.Native.invokeVoid(this, this.peer, i2, objArr);
            return null;
        }
        if (cls == java.lang.Boolean.TYPE || cls == java.lang.Boolean.class) {
            return com.sun.jna.Native.invokeInt(this, this.peer, i2, objArr) != 0 ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        if (cls == java.lang.Byte.TYPE || cls == java.lang.Byte.class) {
            return java.lang.Byte.valueOf((byte) com.sun.jna.Native.invokeInt(this, this.peer, i2, objArr));
        }
        if (cls == java.lang.Short.TYPE || cls == java.lang.Short.class) {
            return java.lang.Short.valueOf((short) com.sun.jna.Native.invokeInt(this, this.peer, i2, objArr));
        }
        if (cls == java.lang.Character.TYPE || cls == java.lang.Character.class) {
            return java.lang.Character.valueOf((char) com.sun.jna.Native.invokeInt(this, this.peer, i2, objArr));
        }
        if (cls == java.lang.Integer.TYPE || cls == java.lang.Integer.class) {
            return java.lang.Integer.valueOf(com.sun.jna.Native.invokeInt(this, this.peer, i2, objArr));
        }
        if (cls == java.lang.Long.TYPE || cls == java.lang.Long.class) {
            return java.lang.Long.valueOf(com.sun.jna.Native.invokeLong(this, this.peer, i2, objArr));
        }
        if (cls == java.lang.Float.TYPE || cls == java.lang.Float.class) {
            return java.lang.Float.valueOf(com.sun.jna.Native.invokeFloat(this, this.peer, i2, objArr));
        }
        if (cls == java.lang.Double.TYPE || cls == java.lang.Double.class) {
            return java.lang.Double.valueOf(com.sun.jna.Native.invokeDouble(this, this.peer, i2, objArr));
        }
        if (cls == java.lang.String.class) {
            return getHighResolutionOutputSizeshNQ4ISI(i2, objArr, false);
        }
        if (cls == com.sun.jna.WString.class) {
            java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2, objArr, true);
            if (highResolutionOutputSizeshNQ4ISI != null) {
                return new com.sun.jna.WString(highResolutionOutputSizeshNQ4ISI);
            }
        } else if (!com.sun.jna.Pointer.class.isAssignableFrom(cls)) {
            if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
                if (com.sun.jna.Structure.ByValue.class.isAssignableFrom(cls)) {
                    com.sun.jna.Structure Camera2StreamConfigurationMap2 = com.sun.jna.Native.Camera2StreamConfigurationMap(this, this.peer, i2, objArr, com.sun.jna.Structure.newInstance(cls));
                    Camera2StreamConfigurationMap2.autoRead();
                    return Camera2StreamConfigurationMap2;
                }
                long invokePointer = com.sun.jna.Native.invokePointer(this, this.peer, i2, objArr);
                java.lang.Object pointer = invokePointer != 0 ? new com.sun.jna.Pointer(invokePointer) : 0;
                if (pointer != 0) {
                    pointer = com.sun.jna.Structure.newInstance(cls, (com.sun.jna.Pointer) pointer);
                    if (!pointer.readCalled) {
                        pointer.autoRead();
                    }
                }
                return pointer;
            }
            if (!com.sun.jna.Callback.class.isAssignableFrom(cls)) {
                if (cls != java.lang.String[].class) {
                    if (cls != com.sun.jna.WString[].class) {
                        if (cls != com.sun.jna.Pointer[].class) {
                            if (z) {
                                java.lang.Object invokeObject = com.sun.jna.Native.invokeObject(this, this.peer, i2, objArr);
                                if (invokeObject == null || cls.isAssignableFrom(invokeObject.getClass())) {
                                    return invokeObject;
                                }
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Return type ");
                                sb.append(cls);
                                sb.append(" does not match result ");
                                sb.append(invokeObject.getClass());
                                throw new java.lang.ClassCastException(sb.toString());
                            }
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported return type ");
                            sb2.append(cls);
                            sb2.append(" in function ");
                            sb2.append(getName());
                            throw new java.lang.IllegalArgumentException(sb2.toString());
                        }
                        long invokePointer2 = com.sun.jna.Native.invokePointer(this, this.peer, i2, objArr);
                        com.sun.jna.Pointer pointer2 = invokePointer2 == 0 ? null : new com.sun.jna.Pointer(invokePointer2);
                        if (pointer2 != null) {
                            return pointer2.getPointerArray(0L);
                        }
                    } else {
                        long invokePointer3 = com.sun.jna.Native.invokePointer(this, this.peer, i2, objArr);
                        com.sun.jna.Pointer pointer3 = invokePointer3 == 0 ? null : new com.sun.jna.Pointer(invokePointer3);
                        if (pointer3 != null) {
                            java.lang.String[] wideStringArray = pointer3.getWideStringArray(0L);
                            com.sun.jna.WString[] wStringArr = new com.sun.jna.WString[wideStringArray.length];
                            for (int i3 = 0; i3 < wideStringArray.length; i3++) {
                                wStringArr[i3] = new com.sun.jna.WString(wideStringArray[i3]);
                            }
                            return wStringArr;
                        }
                    }
                } else {
                    long invokePointer4 = com.sun.jna.Native.invokePointer(this, this.peer, i2, objArr);
                    com.sun.jna.Pointer pointer4 = invokePointer4 == 0 ? null : new com.sun.jna.Pointer(invokePointer4);
                    if (pointer4 != null) {
                        return pointer4.getStringArray(0L, this.getHighSpeedVideoFpsRanges);
                    }
                }
            } else {
                long invokePointer5 = com.sun.jna.Native.invokePointer(this, this.peer, i2, objArr);
                com.sun.jna.Pointer pointer5 = invokePointer5 != 0 ? new com.sun.jna.Pointer(invokePointer5) : null;
                return pointer5 != null ? com.sun.jna.CallbackReference.getCallback(cls, pointer5) : pointer5;
            }
        } else {
            long invokePointer6 = com.sun.jna.Native.invokePointer(this, this.peer, i2, objArr);
            if (invokePointer6 == 0) {
                return null;
            }
            return new com.sun.jna.Pointer(invokePointer6);
        }
        return null;
    }

    public void invoke(java.lang.Object[] objArr) {
        invoke(java.lang.Void.class, objArr);
    }

    @Override // com.sun.jna.Pointer
    public java.lang.String toString() {
        if (this.getInputFormats != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("native function ");
            sb.append(this.getOutputMinFrameDuration);
            sb.append("(");
            sb.append(this.getInputFormats.getName());
            sb.append(")@0x");
            sb.append(java.lang.Long.toHexString(this.peer));
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("native function@0x");
        sb2.append(java.lang.Long.toHexString(this.peer));
        return sb2.toString();
    }

    public java.lang.Object invokeObject(java.lang.Object[] objArr) {
        return invoke(java.lang.Object.class, objArr);
    }

    public com.sun.jna.Pointer invokePointer(java.lang.Object[] objArr) {
        return (com.sun.jna.Pointer) invoke(com.sun.jna.Pointer.class, objArr);
    }

    public java.lang.String invokeString(java.lang.Object[] objArr, boolean z) {
        java.lang.Object invoke = invoke(z ? com.sun.jna.WString.class : java.lang.String.class, objArr);
        if (invoke != null) {
            return invoke.toString();
        }
        return null;
    }

    public int invokeInt(java.lang.Object[] objArr) {
        return ((java.lang.Integer) invoke(java.lang.Integer.class, objArr)).intValue();
    }

    public long invokeLong(java.lang.Object[] objArr) {
        return ((java.lang.Long) invoke(java.lang.Long.class, objArr)).longValue();
    }

    public float invokeFloat(java.lang.Object[] objArr) {
        return ((java.lang.Float) invoke(java.lang.Float.class, objArr)).floatValue();
    }

    public double invokeDouble(java.lang.Object[] objArr) {
        return ((java.lang.Double) invoke(java.lang.Double.class, objArr)).doubleValue();
    }

    public void invokeVoid(java.lang.Object[] objArr) {
        invoke(java.lang.Void.class, objArr);
    }

    @Override // com.sun.jna.Pointer
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            com.sun.jna.Function function = (com.sun.jna.Function) obj;
            if (function.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRangesFor && function.getHighResolutionOutputSizeshNQ4ISI.equals(this.getHighResolutionOutputSizeshNQ4ISI) && function.peer == this.peer) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sun.jna.Pointer
    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor + this.getHighResolutionOutputSizeshNQ4ISI.hashCode() + super.hashCode();
    }

    static java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            java.lang.Object obj = objArr[objArr.length - 1];
            java.lang.Class<?> cls = obj != null ? obj.getClass() : null;
            if (cls != null && cls.isArray()) {
                java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
                for (int i = 0; i < objArr2.length; i++) {
                    if (objArr2[i] instanceof java.lang.Float) {
                        objArr2[i] = java.lang.Double.valueOf(((java.lang.Float) r4).floatValue());
                    }
                }
                int length = objArr.length + objArr2.length;
                java.lang.Object[] objArr3 = new java.lang.Object[length];
                java.lang.System.arraycopy(objArr, 0, objArr3, 0, objArr.length - 1);
                java.lang.System.arraycopy(objArr2, 0, objArr3, objArr.length - 1, objArr2.length);
                objArr3[length - 1] = null;
                return objArr3;
            }
        }
        return objArr;
    }

    static boolean Camera2StreamConfigurationMap(java.lang.reflect.Method method) {
        return getOutputFormats.Camera2StreamConfigurationMap(method);
    }

    static class NativeMappedArray extends com.sun.jna.Memory implements com.sun.jna.Function.PostCallRead {
        private final com.sun.jna.NativeMapped[] getHighResolutionOutputSizeshNQ4ISI;

        public NativeMappedArray(com.sun.jna.NativeMapped[] nativeMappedArr) {
            super(com.sun.jna.Native.getNativeSize(nativeMappedArr.getClass(), nativeMappedArr));
            this.getHighResolutionOutputSizeshNQ4ISI = nativeMappedArr;
            getHighSpeedVideoSizes(0L, nativeMappedArr, nativeMappedArr.getClass());
        }

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            getHighResolutionOutputSizeshNQ4ISI(0L, this.getHighResolutionOutputSizeshNQ4ISI.getClass(), this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    static class PointerArray extends com.sun.jna.Memory implements com.sun.jna.Function.PostCallRead {
        private final com.sun.jna.Pointer[] getHighSpeedVideoFpsRanges;

        public PointerArray(com.sun.jna.Pointer[] pointerArr) {
            super(com.sun.jna.Native.POINTER_SIZE * (pointerArr.length + 1));
            this.getHighSpeedVideoFpsRanges = pointerArr;
            for (int i = 0; i < pointerArr.length; i++) {
                setPointer(com.sun.jna.Native.POINTER_SIZE * i, pointerArr[i]);
            }
            setPointer(com.sun.jna.Native.POINTER_SIZE * pointerArr.length, null);
        }

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            com.sun.jna.Pointer[] pointerArr = this.getHighSpeedVideoFpsRanges;
            read(0L, pointerArr, 0, pointerArr.length);
        }
    }

    static java.lang.Boolean getHighSpeedVideoFpsRanges(boolean z) {
        return z ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.Object[] objArr, boolean z) {
        long invokePointer = com.sun.jna.Native.invokePointer(this, this.peer, i, objArr);
        com.sun.jna.Pointer pointer = invokePointer == 0 ? null : new com.sun.jna.Pointer(invokePointer);
        if (pointer == null) {
            return null;
        }
        if (z) {
            return pointer.getWideString(0L);
        }
        return pointer.getString(0L, this.getHighSpeedVideoFpsRanges);
    }
}
