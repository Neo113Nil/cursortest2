package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxLuaJavaBridge {
    public static native int callLuaFunctionWithString(int i, java.lang.String str);

    public static native int callLuaGlobalFunctionWithString(java.lang.String str, java.lang.String str2);

    public static native int releaseLuaFunction(int i);

    public static native int retainLuaFunction(int i);
}
