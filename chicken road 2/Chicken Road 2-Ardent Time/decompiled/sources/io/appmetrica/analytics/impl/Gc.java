package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gc {

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseArray f4325c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4326a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4327b;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        f4325c = sparseArray;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new io.appmetrica.analytics.impl.Gc("jvm", "binder"));
        sparseArray.put(5890, new io.appmetrica.analytics.impl.Gc("jvm", "file"));
        sparseArray.put(5889, new io.appmetrica.analytics.impl.Gc("jvm", "file"));
        sparseArray.put(5897, new io.appmetrica.analytics.impl.Gc("jni_native", "file"));
        sparseArray.put(5898, new io.appmetrica.analytics.impl.Gc("jni_native", "file"));
    }

    public Gc(java.lang.String str, java.lang.String str2) {
        this.f4326a = str;
        this.f4327b = str2;
    }
}
