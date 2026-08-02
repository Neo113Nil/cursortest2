package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.tr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1622tr {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15734a = new HashMap();

    public final C1577sr a(EnumC1308mr enumC1308mr, Context context, C1085hr c1085hr, Dp dp) {
        C1353nr c1353nr;
        HashMap hashMap = this.f15734a;
        C1577sr c1577sr = (C1577sr) hashMap.get(enumC1308mr);
        if (c1577sr != null) {
            return c1577sr;
        }
        if (enumC1308mr == EnumC1308mr.f14540k) {
            A7 a7 = F7.W5;
            Q2.r rVar = Q2.r.f5053d;
            int intValue = ((Integer) rVar.f5056c.a(a7)).intValue();
            A7 a72 = F7.c6;
            D7 d7 = rVar.f5056c;
            c1353nr = new C1353nr(context, enumC1308mr, intValue, ((Integer) d7.a(a72)).intValue(), ((Integer) d7.a(F7.e6)).intValue(), (String) d7.a(F7.g6), (String) d7.a(F7.Y5), (String) d7.a(F7.a6));
        } else if (enumC1308mr == EnumC1308mr.f14541l) {
            A7 a73 = F7.X5;
            Q2.r rVar2 = Q2.r.f5053d;
            int intValue2 = ((Integer) rVar2.f5056c.a(a73)).intValue();
            A7 a74 = F7.d6;
            D7 d72 = rVar2.f5056c;
            c1353nr = new C1353nr(context, enumC1308mr, intValue2, ((Integer) d72.a(a74)).intValue(), ((Integer) d72.a(F7.f6)).intValue(), (String) d72.a(F7.h6), (String) d72.a(F7.Z5), (String) d72.a(F7.b6));
        } else if (enumC1308mr == EnumC1308mr.f14542m) {
            A7 a75 = F7.k6;
            Q2.r rVar3 = Q2.r.f5053d;
            int intValue3 = ((Integer) rVar3.f5056c.a(a75)).intValue();
            A7 a76 = F7.m6;
            D7 d73 = rVar3.f5056c;
            c1353nr = new C1353nr(context, enumC1308mr, intValue3, ((Integer) d73.a(a76)).intValue(), ((Integer) d73.a(F7.n6)).intValue(), (String) d73.a(F7.i6), (String) d73.a(F7.j6), (String) d73.a(F7.l6));
        } else {
            c1353nr = null;
        }
        C0905dr c0905dr = new C0905dr(c1353nr);
        C1577sr c1577sr2 = new C1577sr(c0905dr, new C1245lH(c0905dr, c1085hr, dp));
        hashMap.put(enumC1308mr, c1577sr2);
        return c1577sr2;
    }
}
