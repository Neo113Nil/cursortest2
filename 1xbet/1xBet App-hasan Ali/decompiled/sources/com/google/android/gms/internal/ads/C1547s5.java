package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547s5 extends AbstractCallableC1817y5 {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f15422h;
    public final View i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f15423j;

    public C1547s5(C0965f5 c0965f5, C0919e4 c0919e4, int i, HashMap hashMap, View view, Context context) {
        super(c0965f5, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", c0919e4, i, 85);
        this.f15422h = hashMap;
        this.i = view;
        this.f15423j = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public final void a() {
        HashMap hashMap = this.f15422h;
        long longValue = hashMap.containsKey(1) ? ((Long) hashMap.get(1)).longValue() : Long.MIN_VALUE;
        HashMap hashMap2 = this.f15422h;
        long[] jArr = {longValue, hashMap2.containsKey(2) ? ((Long) hashMap2.get(2)).longValue() : Long.MIN_VALUE};
        Context context = this.f15423j;
        if (context == null) {
            context = this.f16391a.f13438a;
        }
        long[] jArr2 = (long[]) this.f16395e.invoke(null, jArr, context, this.i);
        long j5 = jArr2[0];
        this.f15422h.put(1, Long.valueOf(jArr2[1]));
        long j6 = jArr2[2];
        this.f15422h.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f16394d) {
            C0919e4 c0919e4 = this.f16394d;
            c0919e4.e();
            C1367o4.z((C1367o4) c0919e4.f10141l, j5);
            C0919e4 c0919e42 = this.f16394d;
            c0919e42.e();
            C1367o4.y((C1367o4) c0919e42.f10141l, j6);
        }
    }
}
