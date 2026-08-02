package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzdyc implements zzgay {
    final /* synthetic */ zzbuo zza;
    final /* synthetic */ zzbug zzb;

    public zzdyc(zzdyg zzdygVar, zzbuo zzbuoVar, zzbug zzbugVar) {
        this.zza = zzbuoVar;
        this.zzb = zzbugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        try {
            zzbug zzbugVar = this.zzb;
            com.google.android.gms.ads.internal.client.zze zza = zzfcb.zza(th);
            zzbugVar.zze(new com.google.android.gms.ads.internal.util.zzbb(zzfty.zzd(th.getMessage()) ? zza.f10721b : th.getMessage(), zza.f10720a));
        } catch (RemoteException e7) {
            J.l("Service can't call client", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            zzbbp zzbbpVar = zzbby.zzco;
            C0254t c0254t = C0254t.f2723d;
            if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                this.zzb.zzf(parcelFileDescriptor);
                return;
            }
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzcp)).booleanValue() && (bundle = this.zza.zzm) != null) {
                String zza = zzdpy.BINDER_CALL_START.zza();
                o.f1952C.j.getClass();
                bundle.putLong(zza, System.currentTimeMillis());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e7) {
            J.l("Service can't call client", e7);
        }
    }
}
