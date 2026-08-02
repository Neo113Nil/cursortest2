package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import v3.C1666a;

/* loaded from: classes.dex */
public final class zzbod extends zzcfw {
    private final C1666a zza;

    public zzbod(C1666a c1666a) {
        this.zza = c1666a;
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final int zzb(String str) {
        return this.zza.f17166a.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final long zzc() {
        return this.zza.f17166a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final Bundle zzd(Bundle bundle) {
        return this.zza.f17166a.zzc(bundle, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zze() {
        return this.zza.f17166a.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zzf() {
        return this.zza.f17166a.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zzg() {
        return this.zza.f17166a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zzh() {
        return this.zza.f17166a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final String zzi() {
        return this.zza.f17166a.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final List zzj(String str, String str2) {
        return this.zza.f17166a.zzp(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final Map zzk(String str, String str2, boolean z4) {
        return this.zza.f17166a.zzq(str, str2, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzl(String str) {
        this.zza.f17166a.zzu(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzm(String str, String str2, Bundle bundle) {
        this.zza.f17166a.zzv(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzn(String str) {
        this.zza.f17166a.zzw(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzo(String str, String str2, Bundle bundle) {
        this.zza.f17166a.zzy(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzp(Bundle bundle) {
        this.zza.f17166a.zzc(bundle, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzq(Bundle bundle) {
        this.zza.f17166a.zzD(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzr(Bundle bundle) {
        this.zza.f17166a.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzs(InterfaceC1506a interfaceC1506a, String str, String str2) {
        this.zza.f17166a.zzG(interfaceC1506a != null ? (Activity) BinderC1507b.t0(interfaceC1506a) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfx
    public final void zzt(String str, String str2, InterfaceC1506a interfaceC1506a) {
        this.zza.f17166a.zzN(str, str2, interfaceC1506a != null ? BinderC1507b.t0(interfaceC1506a) : null, true);
    }
}
