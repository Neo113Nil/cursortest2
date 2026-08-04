package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbod extends zzcfw {
    private final p152v3.a zza;

    public zzbod(p152v3.a aVar) {
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final int zzb(String str) {
        return this.zza.f17172a.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final long zzc() {
        return this.zza.f17172a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final Bundle zzd(Bundle bundle) {
        return this.zza.f17172a.zzc(bundle, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zze() {
        return this.zza.f17172a.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zzf() {
        return this.zza.f17172a.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zzg() {
        return this.zza.f17172a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zzh() {
        return this.zza.f17172a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zzi() {
        return this.zza.f17172a.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final List zzj(String str, String str2) {
        return this.zza.f17172a.zzp(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final Map zzk(String str, String str2, boolean z4) {
        return this.zza.f17172a.zzq(str, str2, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzl(String str) {
        this.zza.f17172a.zzu(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzm(String str, String str2, Bundle bundle) {
        this.zza.f17172a.zzv(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzn(String str) {
        this.zza.f17172a.zzw(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzo(String str, String str2, Bundle bundle) {
        this.zza.f17172a.zzy(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzp(Bundle bundle) {
        this.zza.f17172a.zzc(bundle, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzq(Bundle bundle) {
        this.zza.f17172a.zzD(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzr(Bundle bundle) {
        this.zza.f17172a.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzs(p105o3.a aVar, String str, String str2) {
        this.zza.f17172a.zzG(aVar != null ? (Activity) p105o3.b.t0(aVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzt(String str, String str2, p105o3.a aVar) {
        this.zza.f17172a.zzN(str, str2, aVar != null ? p105o3.b.t0(aVar) : null, true);
    }
}
