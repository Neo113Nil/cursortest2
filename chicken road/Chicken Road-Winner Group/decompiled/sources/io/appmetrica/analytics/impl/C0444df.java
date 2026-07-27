package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444df {

    /* renamed from: a, reason: collision with root package name */
    public final String f7152a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7153b;

    public C0444df(String str, String str2) {
        this.f7152a = str;
        this.f7153b = a(str2);
    }

    public final String a(String str) {
        return str != null ? B0.c.l(new StringBuilder(), this.f7152a, str) : this.f7152a;
    }
}
