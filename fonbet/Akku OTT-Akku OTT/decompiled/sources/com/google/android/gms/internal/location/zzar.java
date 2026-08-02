package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.location.AbstractBinderC0939s;
import com.google.android.gms.location.AbstractC0927f;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes4.dex */
final class zzar extends AbstractBinderC0939s {
    private final C0838l<AbstractC0927f> zza;

    public zzar(C0838l<AbstractC0927f> c0838l) {
        this.zza = c0838l;
    }

    public final synchronized void zzc() {
        C0838l<AbstractC0927f> c0838l = this.zza;
        c0838l.b = null;
        c0838l.c = null;
    }

    @Override // com.google.android.gms.location.InterfaceC0941u
    public final void zzd(LocationResult locationResult) {
        C0838l<AbstractC0927f> c0838l = this.zza;
        zzap zzapVar = new zzap(this, locationResult);
        c0838l.getClass();
        c0838l.a.execute(new T(c0838l, zzapVar));
    }

    @Override // com.google.android.gms.location.InterfaceC0941u
    public final void zze(LocationAvailability locationAvailability) {
        C0838l<AbstractC0927f> c0838l = this.zza;
        zzaq zzaqVar = new zzaq(this, locationAvailability);
        c0838l.getClass();
        c0838l.a.execute(new T(c0838l, zzaqVar));
    }
}
