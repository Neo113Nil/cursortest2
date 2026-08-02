package com.sun.jna.win32;

/* loaded from: classes16.dex */
public interface StdCallLibrary extends com.sun.jna.Library, com.sun.jna.win32.StdCall {
    public static final com.sun.jna.FunctionMapper FUNCTION_MAPPER = new com.sun.jna.win32.StdCallFunctionMapper();
    public static final int STDCALL_CONVENTION = 63;

    public interface StdCallCallback extends com.sun.jna.Callback, com.sun.jna.win32.StdCall {
    }
}
