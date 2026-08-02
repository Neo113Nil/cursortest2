package com.google.android.gms.internal.ads;

import F2.C0254t;
import F2.F0;
import F2.InterfaceC0265y0;
import F2.M;
import I2.J;
import J2.j;
import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.D;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzcnk extends zzazp {
    private final zzcnj zza;
    private final M zzb;
    private final zzewd zzc;
    private boolean zzd = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaU)).booleanValue();
    private final zzdqq zze;

    public zzcnk(zzcnj zzcnjVar, M m7, zzewd zzewdVar, zzdqq zzdqqVar) {
        this.zza = zzcnjVar;
        this.zzb = m7;
        this.zzc = zzewdVar;
        this.zze = zzdqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final M zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final F0 zzf() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgH)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final void zzg(boolean z4) {
        this.zzd = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final void zzh(InterfaceC0265y0 interfaceC0265y0) {
        D.d("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!interfaceC0265y0.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.c("Error in making CSI ping for reporting paid event callback", e7);
            }
            this.zzc.zzn(interfaceC0265y0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final void zzi(InterfaceC1506a interfaceC1506a, zzazx zzazxVar) {
        try {
            this.zzc.zzp(zzazxVar);
            this.zza.zzd((Activity) BinderC1507b.t0(interfaceC1506a), zzazxVar, this.zzd);
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
        }
    }
}
