package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxReflectionHelper {
    public static <T> T getConstantValue(java.lang.Class cls, java.lang.String str) {
        try {
            return (T) cls.getDeclaredField(str).get(null);
        } catch (java.lang.IllegalAccessException unused) {
            android.util.Log.e("error", str + " is not accessible");
            return null;
        } catch (java.lang.IllegalArgumentException unused2) {
            android.util.Log.e("error", "arguments error when get " + str);
            return null;
        } catch (java.lang.NoSuchFieldException unused3) {
            android.util.Log.e("error", "can not find " + str + " in " + cls.getName());
            return null;
        } catch (java.lang.Exception unused4) {
            android.util.Log.e("error", "can not get constant" + str);
            return null;
        }
    }

    public static <T> T invokeInstanceMethod(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        java.lang.Class<?> cls = obj.getClass();
        try {
            return (T) cls.getMethod(str, clsArr).invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException unused) {
            android.util.Log.e("error", str + " is not accessible");
            return null;
        } catch (java.lang.IllegalArgumentException unused2) {
            android.util.Log.e("error", "arguments are error when invoking " + str);
            return null;
        } catch (java.lang.NoSuchMethodException unused3) {
            android.util.Log.e("error", "can not find " + str + " in " + cls.getName());
            return null;
        } catch (java.lang.reflect.InvocationTargetException unused4) {
            android.util.Log.e("error", "an exception was thrown by the invoked method when invoking " + str);
            return null;
        }
    }
}
