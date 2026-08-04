package com.google.android.gms.internal.ads;

import F2.C0254t;
import F2.F0;
import F2.I0;
import F2.InterfaceC0244n0;
import F2.InterfaceC0250q0;
import F2.InterfaceC0265y0;
import I2.J;
import J2.j;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzdlp extends zzbhc {
    private final String zza;
    private final zzdgx zzb;
    private final zzdhc zzc;
    private final zzdqq zzd;

    public zzdlp(String str, zzdgx zzdgxVar, zzdhc zzdhcVar, zzdqq zzdqqVar) {
        this.zza = str;
        this.zzb = zzdgxVar;
        this.zzc = zzdhcVar;
        this.zzd = zzdqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzB(Bundle bundle) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmT)).booleanValue()) {
            this.zzb.zzI(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzC(Bundle bundle) {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzD() {
        this.zzb.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzE(InterfaceC0244n0 interfaceC0244n0) {
        this.zzb.zzP(interfaceC0244n0);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzF(InterfaceC0265y0 interfaceC0265y0) {
        try {
            if (!interfaceC0265y0.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.c("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzb.zzQ(interfaceC0265y0);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzG(zzbha zzbhaVar) {
        this.zzb.zzR(zzbhaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final boolean zzH() {
        return this.zzb.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final boolean zzI() {
        return (this.zzc.zzH().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final boolean zzJ(Bundle bundle) {
        return this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final double zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final Bundle zzf() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final F0 zzg() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgH)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final I0 zzh() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final zzbfc zzi() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final zzbfg zzj() {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final zzbfj zzk() {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final p105o3.a zzl() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final p105o3.a zzm() {
        return new p105o3.b(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzn() {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzo() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzp() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzq() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzr() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzs() {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final String zzt() {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final List zzu() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final List zzv() {
        return zzI() ? this.zzc.zzH() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzw() {
        this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzx() {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzy(InterfaceC0250q0 interfaceC0250q0) {
        this.zzb.zzC(interfaceC0250q0);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zzz(Bundle bundle) {
        this.zzb.zzG(bundle);
    }
}
