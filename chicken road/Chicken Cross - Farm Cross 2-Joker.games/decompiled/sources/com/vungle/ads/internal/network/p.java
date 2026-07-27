package com.vungle.ads.internal.network;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f12056a;
    public g b;
    public Map c;
    public String d;
    public Boolean e;
    public int f;
    public boolean g;
    public int h;
    public String i;
    public com.vungle.ads.internal.util.s j;

    public p(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f12056a = url;
        this.b = g.GET;
        this.f = 3;
        this.g = true;
        this.h = 5;
    }

    public final p a(g method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.b = method;
        return this;
    }

    public final void b() {
        this.b = g.GET;
    }

    public final void c() {
        this.b = g.POST;
    }

    public final p d() {
        this.e = Boolean.TRUE;
        return this;
    }

    public final p a(Map map) {
        this.c = map;
        return this;
    }

    public final p b(String str) {
        this.i = str;
        return this;
    }

    public final p a(String str) {
        this.d = str;
        return this;
    }

    public final p a(boolean z) {
        this.g = z;
        return this;
    }

    public final p a(com.vungle.ads.internal.util.s sVar) {
        this.j = sVar;
        return this;
    }

    public final q a() {
        return new q(this.f12056a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
