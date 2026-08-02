package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class lIIllIllIl {
    public static final java.lang.reflect.Constructor IlIllIlIIl;
    public static final java.lang.reflect.Constructor IllIIIllII;
    public static final java.lang.reflect.Method llIIIlllll;
    public static final java.lang.reflect.Constructor llIIlIlIIl;

    static {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.hardware.camera2.utils.TypeReference");
            llIIIlllll = cls.getMethod("createSpecializedTypeReference", java.lang.reflect.Type.class);
            llIIlIlIIl = android.hardware.camera2.CameraCharacteristics.Key.class.getDeclaredConstructor(java.lang.String.class, cls);
            IlIllIlIIl = android.hardware.camera2.CaptureRequest.Key.class.getDeclaredConstructor(java.lang.String.class, cls);
            IllIIIllII = android.hardware.camera2.CaptureResult.Key.class.getDeclaredConstructor(java.lang.String.class, cls);
        } catch (java.lang.ClassNotFoundException e) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.lIIllIllIl.class, e, "Failed to find desired class!", new java.lang.Object[0]);
        } catch (java.lang.NoSuchMethodException e2) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.lIIllIllIl.class, e2, "Failed to find desired method!", new java.lang.Object[0]);
        }
    }

    public static java.lang.Object llIIlIlIIl(java.lang.Object[] objArr) {
        java.lang.reflect.Constructor constructor;
        if (objArr.length < 3) {
            throw new java.lang.RuntimeException("Illegal arguments to createKey");
        }
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.reflect.Type type = (java.lang.reflect.Type) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        java.lang.reflect.Method method = llIIIlllll;
        if (method == null) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.lIIllIllIl.class, "Unable to invoke method createSpecializedTypeReference", new java.lang.Object[0]);
            return null;
        }
        try {
            java.lang.Object invoke = method.invoke(null, type);
            if (intValue == 0) {
                java.lang.reflect.Constructor constructor2 = llIIlIlIIl;
                if (constructor2 != null) {
                    return constructor2.newInstance(str, invoke);
                }
                return null;
            }
            if (intValue != 1) {
                if (intValue == 2 && (constructor = IllIIIllII) != null) {
                    return constructor.newInstance(str, invoke);
                }
                return null;
            }
            java.lang.reflect.Constructor constructor3 = IlIllIlIIl;
            if (constructor3 != null) {
                return constructor3.newInstance(str, invoke);
            }
            return null;
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e) {
            com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.lIIllIllIl.class, e, "Failed to invoke reflection method!", new java.lang.Object[0]);
            return null;
        }
    }
}
