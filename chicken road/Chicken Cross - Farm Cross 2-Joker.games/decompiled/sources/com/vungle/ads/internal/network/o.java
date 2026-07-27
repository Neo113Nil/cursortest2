package com.vungle.ads.internal.network;

import okhttp3.Response;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Response f12055a;
    public final Object b;

    public o(Response response, Object obj) {
        this.f12055a = response;
        this.b = obj;
    }

    public /* synthetic */ o(Response response, Object obj, int i) {
        this(response, obj);
    }

    public final Object a() {
        return this.b;
    }

    public final int b() {
        return this.f12055a.code();
    }

    public final boolean c() {
        return this.f12055a.isSuccessful();
    }

    public final String d() {
        return this.f12055a.message();
    }

    public final Response e() {
        return this.f12055a;
    }

    public final String toString() {
        return this.f12055a.toString();
    }
}
