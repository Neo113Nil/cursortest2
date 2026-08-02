package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1610tf implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15695a;

    /* renamed from: b, reason: collision with root package name */
    public final C1386of f15696b;

    public /* synthetic */ C1610tf(C1386of c1386of, int i) {
        this.f15695a = i;
        this.f15696b = c1386of;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15695a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.f15696b.f14812d;
                AbstractC1400ot.D(weakReference);
                return weakReference;
            case 1:
                return new C1685v8((Context) this.f15696b.f14810b, 0);
            case 2:
                C1386of c1386of = this.f15696b;
                return new P2.g((Context) c1386of.f14810b, (U2.a) c1386of.f14809a);
            case 3:
                C1386of c1386of2 = this.f15696b;
                String x5 = P2.o.f4767B.f4771c.x((Context) c1386of2.f14810b, ((U2.a) c1386of2.f14809a).f5852k);
                AbstractC1400ot.D(x5);
                return x5;
            default:
                return Long.valueOf(this.f15696b.f14811c);
        }
    }
}
