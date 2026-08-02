package com.sun.jna.win32;

/* loaded from: classes16.dex */
public class StdCallFunctionMapper implements com.sun.jna.FunctionMapper {
    protected int getArgumentNativeStackSize(java.lang.Class<?> cls) {
        if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            cls = com.sun.jna.NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls.isArray()) {
            return com.sun.jna.Native.POINTER_SIZE;
        }
        try {
            return com.sun.jna.Native.getNativeSize(cls);
        } catch (java.lang.IllegalArgumentException unused) {
            throw new java.lang.IllegalArgumentException("Unknown native stack allocation size for ".concat(java.lang.String.valueOf(cls)));
        }
    }

    @Override // com.sun.jna.FunctionMapper
    public java.lang.String getFunctionName(com.sun.jna.NativeLibrary nativeLibrary, java.lang.reflect.Method method) {
        java.lang.String name2 = method.getName();
        int i = 0;
        for (java.lang.Class<?> cls : method.getParameterTypes()) {
            i += getArgumentNativeStackSize(cls);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(name2);
        sb.append("@");
        sb.append(i);
        java.lang.String obj = sb.toString();
        try {
            try {
                return nativeLibrary.getFunction(obj, 63).getName();
            } catch (java.lang.UnsatisfiedLinkError unused) {
                return name2;
            }
        } catch (java.lang.UnsatisfiedLinkError unused2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("_");
            sb2.append(obj);
            return nativeLibrary.getFunction(sb2.toString(), 63).getName();
        }
    }
}
