package com.sun.jna.win32;

/* loaded from: classes16.dex */
public class W32APIFunctionMapper implements com.sun.jna.FunctionMapper {
    private final java.lang.String getHighSpeedVideoFpsRanges;
    public static final com.sun.jna.FunctionMapper UNICODE = new com.sun.jna.win32.W32APIFunctionMapper(true);
    public static final com.sun.jna.FunctionMapper ASCII = new com.sun.jna.win32.W32APIFunctionMapper(false);

    protected W32APIFunctionMapper(boolean z) {
        this.getHighSpeedVideoFpsRanges = z ? "W" : "A";
    }

    @Override // com.sun.jna.FunctionMapper
    public java.lang.String getFunctionName(com.sun.jna.NativeLibrary nativeLibrary, java.lang.reflect.Method method) {
        java.lang.String name2 = method.getName();
        if (!name2.endsWith("W") && !name2.endsWith("A")) {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(name2);
                sb.append(this.getHighSpeedVideoFpsRanges);
                return nativeLibrary.getFunction(sb.toString(), 63).getName();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
        return name2;
    }
}
