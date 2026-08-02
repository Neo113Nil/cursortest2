package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: com.google.android.gms.internal.ads.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188k5 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1233l5 f14223a;

    public C1188k5(C1233l5 c1233l5) {
        this.f14223a = c1233l5;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z3) {
        if (z3) {
            this.f14223a.f14318a = System.currentTimeMillis();
            this.f14223a.f14321d = true;
            return;
        }
        C1233l5 c1233l5 = this.f14223a;
        long currentTimeMillis = System.currentTimeMillis();
        if (c1233l5.f14319b > 0) {
            C1233l5 c1233l52 = this.f14223a;
            long j5 = c1233l52.f14319b;
            if (currentTimeMillis >= j5) {
                c1233l52.f14320c = currentTimeMillis - j5;
            }
        }
        this.f14223a.f14321d = false;
    }
}
