package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f4183a;
    public static final boolean b;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("libcore.io.Memory");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f4183a = cls;
        try {
            cls2 = java.lang.Class.forName("org.robolectric.Robolectric");
        } catch (java.lang.Throwable unused2) {
        }
        b = cls2 != null;
    }

    public static boolean a() {
        return (f4183a == null || b) ? false : true;
    }
}
