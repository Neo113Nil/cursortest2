package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.ir, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129ir {

    /* renamed from: b, reason: collision with root package name */
    public final int f14010b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14011c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f14009a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final C1802xr f14012d = new C1802xr();

    public C1129ir(int i, int i5) {
        this.f14010b = i;
        this.f14011c = i5;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f14009a;
            if (linkedList.isEmpty()) {
                return;
            }
            C1398or c1398or = (C1398or) linkedList.getFirst();
            P2.o.f4767B.f4776j.getClass();
            if (System.currentTimeMillis() - c1398or.f14867d < this.f14011c) {
                return;
            }
            C1802xr c1802xr = this.f14012d;
            c1802xr.f++;
            c1802xr.f16339b.f16175l++;
            linkedList.remove();
        }
    }
}
