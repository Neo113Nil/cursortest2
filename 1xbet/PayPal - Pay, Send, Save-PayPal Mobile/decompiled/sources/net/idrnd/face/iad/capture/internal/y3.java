package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public abstract class y3 {
    public static boolean a(java.lang.Object[] objArr) {
        try {
            if (net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.f6952a) {
                java.lang.Object call = net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.call(new java.lang.Object[]{3, objArr});
                if (call instanceof java.lang.Integer) {
                    if (((java.lang.Integer) call).intValue() > 0) {
                        return true;
                    }
                }
            }
        } catch (java.lang.UnsatisfiedLinkError unused) {
        }
        return false;
    }

    public static int a(java.lang.String str) {
        try {
            if (!net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.f6952a) {
                return -1;
            }
            java.lang.Object call = net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.call(new java.lang.Object[]{5, str});
            if (call instanceof java.lang.Integer) {
                return ((java.lang.Integer) call).intValue();
            }
            return -1;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            return -1;
        }
    }

    public static void a() {
        try {
            if (net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.f6952a) {
                net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.call(new java.lang.Object[]{1, java.lang.Boolean.FALSE});
            }
        } catch (java.lang.UnsatisfiedLinkError unused) {
        }
    }
}
