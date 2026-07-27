package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class Nc {

    /* renamed from: c, reason: collision with root package name */
    public static final SparseArray f6321c;

    /* renamed from: a, reason: collision with root package name */
    public final String f6322a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6323b;

    static {
        SparseArray sparseArray = new SparseArray();
        f6321c = sparseArray;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Nc("jvm", "binder"));
        sparseArray.put(5890, new Nc("jvm", "file"));
        sparseArray.put(5889, new Nc("jvm", "file"));
        sparseArray.put(5897, new Nc("jni_native", "file"));
        sparseArray.put(5898, new Nc("jni_native", "file"));
    }

    public Nc(String str, String str2) {
        this.f6322a = str;
        this.f6323b = str2;
    }
}
