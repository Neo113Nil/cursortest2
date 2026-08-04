package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzeqb implements zzesg {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzeqb(String str, boolean z4, boolean z7, boolean z8, boolean z9) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = z7;
        this.zzd = z8;
        this.zze = z9;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zza(Object obj) {
        Bundle bundle = ((zzcts) obj).zzb;
        if (!this.zza.isEmpty()) {
            bundle.putString("inspector_extras", this.zza);
        }
        bundle.putInt("test_mode", this.zzb ? 1 : 0);
        bundle.putInt("linked_device", this.zzc ? 1 : 0);
        if (this.zzb || this.zzc) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjo)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        if (!this.zza.isEmpty()) {
            bundle.putString("inspector_extras", this.zza);
        }
        bundle.putInt("test_mode", this.zzb ? 1 : 0);
        bundle.putInt("linked_device", this.zzc ? 1 : 0);
        if (this.zzb || this.zzc) {
            zzbbp zzbbpVar = zzbby.zzjk;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjo)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
