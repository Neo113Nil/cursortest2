package com.applovin.impl;

import android.content.Context;

/* loaded from: classes5.dex */
public class u4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4520a;
    private final String b;
    private final boolean c;

    u4(String str, String str2, Context context) {
        this.f4520a = str.replace("android.permission.", "");
        this.b = str2;
        this.c = p0.a(str, context);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f4520a;
    }

    public boolean c() {
        return this.c;
    }
}
