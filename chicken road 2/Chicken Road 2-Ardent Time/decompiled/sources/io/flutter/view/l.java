package io.flutter.view;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f7910a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f7911b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f7912c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f7913d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Field f7914e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f7915f;

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Field field;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        java.lang.reflect.Method method6 = null;
        try {
            method = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = android.view.accessibility.AccessibilityRecord.class.getMethod("getSourceNodeId", null);
        } catch (java.lang.NoSuchMethodException unused2) {
            android.util.Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        if (android.os.Build.VERSION.SDK_INT > 26) {
            try {
                java.lang.reflect.Field declaredField = android.view.accessibility.AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method4 = java.lang.Class.forName("android.util.LongArray").getMethod("get", java.lang.Integer.TYPE);
                field = declaredField;
                method3 = null;
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.NullPointerException unused3) {
                android.util.Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method3 = null;
                field = null;
            }
            this.f7910a = method;
            this.f7911b = method6;
            this.f7912c = method2;
            this.f7913d = method3;
            this.f7914e = field;
            this.f7915f = method4;
        }
        try {
            method5 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getParentNodeId", null);
        } catch (java.lang.NoSuchMethodException unused4) {
            android.util.Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
            method5 = null;
        }
        try {
            method3 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getChildId", java.lang.Integer.TYPE);
            field = null;
        } catch (java.lang.NoSuchMethodException unused5) {
            android.util.Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
            method3 = null;
            field = null;
        }
        method6 = method5;
        method4 = field;
        this.f7910a = method;
        this.f7911b = method6;
        this.f7912c = method2;
        this.f7913d = method3;
        this.f7914e = field;
        this.f7915f = method4;
    }

    public static java.lang.Long a(io.flutter.view.l lVar, android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        java.lang.reflect.Method method = lVar.f7912c;
        if (method == null) {
            return null;
        }
        try {
            return (java.lang.Long) method.invoke(accessibilityRecord, null);
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e2);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e3) {
            android.util.Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e3);
            return null;
        }
    }

    public static boolean b(int i2, long j2) {
        return (j2 & (1 << i2)) != 0;
    }
}
