package com.chartboost.sdk.impl;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public static final lb f4860a = new lb();
    public static volatile boolean b = true;
    public static final AtomicLong c = new AtomicLong(0);
    public static volatile long d = 5000;

    public final vg a() {
        return null;
    }

    public final String a(int i) {
        return null;
    }

    public final boolean b() {
        return b;
    }

    public final void c() {
        c.set(0L);
    }

    public static /* synthetic */ String a(lb lbVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return lbVar.a(i);
    }

    public final void a(boolean z) {
        b = z;
    }
}
