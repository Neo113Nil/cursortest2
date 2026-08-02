package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class CD implements ID, AD {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7978c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile ID f7979a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f7980b = f7978c;

    public CD(ID id) {
        this.f7979a = id;
    }

    public static AD a(ID id) {
        return id instanceof AD ? (AD) id : new CD(id);
    }

    public static CD b(ID id) {
        return id instanceof CD ? (CD) id : new CD(id);
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        Object obj = this.f7980b;
        Object obj2 = f7978c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f7980b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object d5 = this.f7979a.d();
                Object obj4 = this.f7980b;
                if (obj4 != obj2 && obj4 != d5) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + d5 + ". This is likely due to a circular dependency.");
                }
                this.f7980b = d5;
                this.f7979a = null;
                return d5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
