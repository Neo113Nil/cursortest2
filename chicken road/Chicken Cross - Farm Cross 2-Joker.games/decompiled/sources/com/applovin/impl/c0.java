package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public abstract class c0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f4150a;
    protected final String b;
    protected final com.applovin.impl.sdk.p c;
    protected final AtomicBoolean e = new AtomicBoolean();
    private final Context d = com.applovin.impl.sdk.l.p();

    public c0(String str, com.applovin.impl.sdk.l lVar) {
        this.b = str;
        this.f4150a = lVar;
        this.c = lVar.Q();
    }

    public Context a() {
        return this.d;
    }

    public void a(boolean z) {
        this.e.set(z);
    }
}
