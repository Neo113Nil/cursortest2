package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import p097n3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzcgs implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzcgs(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return c.a(((zzcgi) this.zza).zza()).t(0, ((ApplicationInfo) this.zzb.zzb()).packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
