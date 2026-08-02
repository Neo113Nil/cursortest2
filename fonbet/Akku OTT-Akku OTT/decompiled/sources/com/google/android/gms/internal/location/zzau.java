package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.location.InterfaceC0928g;
import com.google.android.gms.location.w;

/* loaded from: classes4.dex */
final class zzau extends w {
    private final C0838l<InterfaceC0928g> zza;

    public zzau(C0838l<InterfaceC0928g> c0838l) {
        this.zza = c0838l;
    }

    public final synchronized void zzc() {
        C0838l<InterfaceC0928g> c0838l = this.zza;
        c0838l.b = null;
        c0838l.c = null;
    }

    @Override // com.google.android.gms.location.x
    public final synchronized void zzd(Location location) {
        C0838l<InterfaceC0928g> c0838l = this.zza;
        zzat zzatVar = new zzat(this, location);
        c0838l.getClass();
        c0838l.a.execute(new T(c0838l, zzatVar));
    }
}
