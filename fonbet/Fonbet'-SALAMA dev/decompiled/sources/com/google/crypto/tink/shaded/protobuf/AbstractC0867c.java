package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0867c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f11759a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f11760b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f11759a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f11760b = cls2 != null;
    }

    public static boolean a() {
        return (f11759a == null || f11760b) ? false : true;
    }
}
