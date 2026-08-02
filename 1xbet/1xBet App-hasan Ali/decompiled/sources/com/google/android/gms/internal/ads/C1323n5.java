package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1323n5 extends AbstractCallableC1817y5 {
    public static final Mt i = new Mt(6);

    /* renamed from: h, reason: collision with root package name */
    public final Context f14577h;

    public C1323n5(C0965f5 c0965f5, C0919e4 c0919e4, int i5, Context context) {
        super(c0965f5, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", c0919e4, i5, 29);
        this.f14577h = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public final void a() {
        C0919e4 c0919e4 = this.f16394d;
        c0919e4.e();
        C1367o4.I0((C1367o4) c0919e4.f10141l, "E");
        AtomicReference d5 = i.d(this.f14577h.getPackageName());
        if (d5.get() == null) {
            synchronized (d5) {
                try {
                    if (d5.get() == null) {
                        d5.set((String) this.f16395e.invoke(null, this.f14577h));
                    }
                } finally {
                }
            }
        }
        String str = (String) d5.get();
        synchronized (this.f16394d) {
            C0919e4 c0919e42 = this.f16394d;
            String encodeToString = Base64.encodeToString(str.getBytes(), 11);
            c0919e42.e();
            C1367o4.I0((C1367o4) c0919e42.f10141l, encodeToString);
        }
    }
}
