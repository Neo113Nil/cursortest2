package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1482ql {

    /* renamed from: a, reason: collision with root package name */
    public final C1616tl f15165a;

    /* renamed from: b, reason: collision with root package name */
    public final Qw f15166b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15167c;

    public C1482ql(C1616tl c1616tl, Qw qw) {
        this.f15165a = c1616tl;
        c1616tl.getClass();
        this.f15167c = new HashMap(c1616tl.f15714a);
        this.f15166b = qw;
    }

    public final C1390oj a() {
        C1390oj c1390oj = new C1390oj(this);
        ((ConcurrentHashMap) c1390oj.f14827l).putAll(this.f15167c);
        return c1390oj;
    }

    public final void b() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.hb)).booleanValue()) {
            C1390oj a5 = a();
            a5.k("action", "pecr");
            a5.q();
        }
    }
}
