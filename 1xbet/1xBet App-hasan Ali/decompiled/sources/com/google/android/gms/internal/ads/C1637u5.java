package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1637u5 extends AbstractCallableC1817y5 {

    /* renamed from: h, reason: collision with root package name */
    public final U4 f15792h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15793j;

    public C1637u5(C0965f5 c0965f5, C0919e4 c0919e4, int i, U4 u42, long j5, long j6) {
        super(c0965f5, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", c0919e4, i, 11);
        this.f15792h = u42;
        this.i = j5;
        this.f15793j = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public final void a() {
        U4 u42 = this.f15792h;
        if (u42 != null) {
            String str = (String) this.f16395e.invoke(null, (NetworkCapabilities) u42.f11722l, Long.valueOf(this.i), Long.valueOf(this.f15793j));
            T4 t42 = new T4();
            HashMap i = AbstractC1803xs.i(str);
            if (i != null) {
                t42.f11622h = (Long) i.get(0);
                t42.i = (Long) i.get(1);
                t42.f11623j = (Long) i.get(2);
            }
            synchronized (this.f16394d) {
                try {
                    C0919e4 c0919e4 = this.f16394d;
                    long longValue = t42.f11622h.longValue();
                    c0919e4.e();
                    C1367o4.D((C1367o4) c0919e4.f10141l, longValue);
                    if (((Long) t42.i).longValue() >= 0) {
                        C0919e4 c0919e42 = this.f16394d;
                        long longValue2 = ((Long) t42.i).longValue();
                        c0919e42.e();
                        C1367o4.U((C1367o4) c0919e42.f10141l, longValue2);
                    }
                    if (((Long) t42.f11623j).longValue() >= 0) {
                        C0919e4 c0919e43 = this.f16394d;
                        long longValue3 = ((Long) t42.f11623j).longValue();
                        c0919e43.e();
                        C1367o4.A0((C1367o4) c0919e43.f10141l, longValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
