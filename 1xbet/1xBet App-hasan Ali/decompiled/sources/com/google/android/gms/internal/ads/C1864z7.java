package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.z7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1864z7 implements Ei {

    /* renamed from: k, reason: collision with root package name */
    public final Context f16547k;

    public /* synthetic */ C1864z7(Context context, boolean z3) {
        this.f16547k = context;
    }

    public E3.a a(boolean z3) {
        try {
            P1.a aVar = new P1.a(z3);
            N1.b a5 = N1.b.a(this.f16547k);
            return a5 != null ? a5.b(aVar) : AbstractC1400ot.Z(new IllegalStateException());
        } catch (Exception e3) {
            return AbstractC1400ot.Z(e3);
        }
    }

    public boolean b(Intent intent) {
        m3.v.f("Intent can not be null", intent);
        return !this.f16547k.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        ((Wh) obj).j(this.f16547k);
    }

    public C1864z7(Context context) {
        m3.v.f("Context can not be null", context);
        this.f16547k = context;
    }
}
