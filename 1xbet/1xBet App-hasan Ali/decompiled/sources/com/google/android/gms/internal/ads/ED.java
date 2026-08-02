package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ED implements DD, AD {

    /* renamed from: b, reason: collision with root package name */
    public static final ED f8473b = new ED(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f8474a;

    public ED(Object obj) {
        this.f8474a = obj;
    }

    public static ED a(Object obj) {
        AbstractC1400ot.l("instance cannot be null", obj);
        return new ED(obj);
    }

    public static ED b(Object obj) {
        return obj == null ? f8473b : new ED(obj);
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        return this.f8474a;
    }
}
