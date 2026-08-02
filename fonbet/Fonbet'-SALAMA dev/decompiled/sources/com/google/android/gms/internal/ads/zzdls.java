package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;
import H2.c;
import H2.m;
import android.os.Bundle;

/* loaded from: classes.dex */
public class zzdls implements InterfaceC0217a, zzbhp, m, zzbhr, c {
    private InterfaceC0217a zza;
    private zzbhp zzb;
    private m zzc;
    private zzbhr zzd;
    private c zze;

    @Override // F2.InterfaceC0217a
    public final synchronized void onAdClicked() {
        InterfaceC0217a interfaceC0217a = this.zza;
        if (interfaceC0217a != null) {
            interfaceC0217a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final synchronized void zza(String str, Bundle bundle) {
        zzbhp zzbhpVar = this.zzb;
        if (zzbhpVar != null) {
            zzbhpVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final synchronized void zzb(String str, String str2) {
        zzbhr zzbhrVar = this.zzd;
        if (zzbhrVar != null) {
            zzbhrVar.zzb(str, str2);
        }
    }

    @Override // H2.m
    public final synchronized void zzdE() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdE();
        }
    }

    @Override // H2.m
    public final synchronized void zzdi() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdi();
        }
    }

    @Override // H2.m
    public final synchronized void zzdo() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdo();
        }
    }

    @Override // H2.m
    public final synchronized void zzdp() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdp();
        }
    }

    @Override // H2.m
    public final synchronized void zzdr() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdr();
        }
    }

    @Override // H2.m
    public final synchronized void zzds(int i7) {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzds(i7);
        }
    }

    @Override // H2.c
    public final synchronized void zzg() {
        c cVar = this.zze;
        if (cVar != null) {
            cVar.zzg();
        }
    }

    public final synchronized void zzh(InterfaceC0217a interfaceC0217a, zzbhp zzbhpVar, m mVar, zzbhr zzbhrVar, c cVar) {
        this.zza = interfaceC0217a;
        this.zzb = zzbhpVar;
        this.zzc = mVar;
        this.zzd = zzbhrVar;
        this.zze = cVar;
    }
}
