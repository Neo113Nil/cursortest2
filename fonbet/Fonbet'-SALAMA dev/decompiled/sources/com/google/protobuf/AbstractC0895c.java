package com.google.protobuf;

/* renamed from: com.google.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0895c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f12177a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f12178b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f12177a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f12178b = cls2 != null;
    }

    public static boolean a() {
        return (f12177a == null || f12178b) ? false : true;
    }
}
