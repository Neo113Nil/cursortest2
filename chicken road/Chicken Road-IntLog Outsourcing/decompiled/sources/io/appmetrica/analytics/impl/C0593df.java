package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;

/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593df {

    /* renamed from: a, reason: collision with root package name */
    public final String f8042a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8043b;

    public C0593df(String str, String str2) {
        this.f8042a = str;
        this.f8043b = a(str2);
    }

    public final String a(String str) {
        return str != null ? AbstractC0279e.h(new StringBuilder(), this.f8042a, str) : this.f8042a;
    }
}
