package com.google.android.gms.internal.ads;

import a.AbstractC0444a;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q3.AbstractC2310c;

/* loaded from: classes.dex */
public final class Mo implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10721a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10722b;

    public /* synthetic */ Mo(int i, Object obj) {
        this.f10721a = i;
        this.f10722b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        switch (this.f10721a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            default:
                return 49;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        int i = 2;
        Object obj = this.f10722b;
        switch (this.f10721a) {
            case 0:
                return AbstractC1400ot.c0(new No(0, AbstractC0444a.m((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return AbstractC1400ot.c0(new Xo(0, arrayList));
            case 2:
                return AbstractC1400ot.c0(new No(1, ((Wq) obj).f12108p));
            case 3:
                String str = null;
                C1217kq c1217kq = (C1217kq) obj;
                if (c1217kq == null) {
                    return AbstractC1400ot.c0(new To(str, i));
                }
                int i5 = AbstractC2310c.f18893a;
                String str2 = c1217kq.f14291a;
                return (str2 == null || str2.trim().isEmpty()) ? AbstractC1400ot.c0(new To(str, i)) : AbstractC1400ot.c0(new To(str2, i));
            case 4:
                return AbstractC1400ot.c0(new C1845yp(0, (Kq) obj));
            case 5:
                return AbstractC1400ot.c0(new Yo(2, (Bundle) obj));
            default:
                return AbstractC1400ot.h0(AbstractC1400ot.l0(AbstractC1400ot.c0(new Bundle()), ((Long) Q2.r.f5053d.f5056c.a(F7.f8806b4)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), new C1364o1(13), AbstractC0613Id.f9539a);
        }
    }
}
