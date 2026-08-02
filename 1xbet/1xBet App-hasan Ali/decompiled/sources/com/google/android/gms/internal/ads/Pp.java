package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class Pp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final int f11124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11125b;

    public Pp(int i, int i5) {
        this.f11124a = i;
        this.f11125b = i5;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        int i;
        Bundle bundle = ((C0572Ch) obj).f8049a;
        int i5 = this.f11124a;
        if (i5 == -1 || (i = this.f11125b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i5);
        bundle.putInt("crashes_without_flags", i);
        C0379q c0379q = C0379q.f;
        if (Q2.r.f5053d.f5056c.f8174j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
