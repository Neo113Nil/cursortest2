package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.pl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1437pl implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15035k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1390oj f15036l;

    public /* synthetic */ RunnableC1437pl(C1390oj c1390oj, int i) {
        this.f15035k = i;
        this.f15036l = c1390oj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15035k) {
            case 0:
                C1390oj c1390oj = this.f15036l;
                ((C1482ql) c1390oj.f14828m).f15165a.b((ConcurrentHashMap) c1390oj.f14827l, false);
                break;
            case 1:
                C1390oj c1390oj2 = this.f15036l;
                ((C1482ql) c1390oj2.f14828m).f15165a.b((ConcurrentHashMap) c1390oj2.f14827l, true);
                break;
            default:
                C1390oj c1390oj3 = this.f15036l;
                C1616tl c1616tl = ((C1482ql) c1390oj3.f14828m).f15165a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1390oj3.f14827l;
                c1616tl.getClass();
                if (!concurrentHashMap.isEmpty()) {
                    c1616tl.a(concurrentHashMap);
                    String a5 = c1616tl.f.a(concurrentHashMap);
                    T2.G.m(a5);
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Ic)).booleanValue() || c1616tl.f15718e) {
                        c1616tl.f15716c.execute(new RunnableC1661ul(c1616tl, a5, 1));
                        break;
                    }
                } else {
                    U2.j.d("Empty paramMap.");
                    break;
                }
                break;
        }
    }
}
