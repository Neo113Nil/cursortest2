package com.google.android.gms.internal.ads;

import T2.C0435m;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC1819y7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16411a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.f16411a) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                P2.o oVar = P2.o.f4767B;
                oVar.f4776j.getClass();
                return new C1486qp(System.currentTimeMillis() - oVar.f4774g.d().t().f);
            case 2:
                P2.o oVar2 = P2.o.f4767B;
                C0435m c0435m = oVar2.f4780n;
                synchronized (c0435m.f5722a) {
                    str = c0435m.f5724c;
                }
                return new C0815bp(1, str, oVar2.f4780n.h());
            case 3:
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", P2.o.f4767B.f4774g.f8016j.get());
                return new Yo(1, bundle);
            case 4:
                return new C1845yp(1, new JSONObject());
            case 5:
                HashMap hashMap = new HashMap();
                A7 a7 = F7.f8727N;
                Q2.r rVar = Q2.r.f5053d;
                String str2 = (String) rVar.f5056c.a(a7);
                if (str2 != null && !str2.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) rVar.f5056c.a(F7.f8733O)).intValue()) {
                        for (String str3 : str2.split(",", -1)) {
                            hashMap.put(str3, T2.F.a(str3));
                        }
                    }
                }
                return new C1845yp(3, hashMap);
            default:
                return null;
        }
    }
}
