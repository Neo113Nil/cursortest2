package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzij {
    final Context zza;
    zzcz zzb;
    zzftz zzc;
    zzftz zzd;
    zzftz zze;
    zzftz zzf;
    zzftz zzg;
    zzfsw zzh;
    Looper zzi;
    int zzj;
    zze zzk;
    int zzl;
    boolean zzm;
    zzls zzn;
    long zzo;
    long zzp;
    boolean zzq;
    boolean zzr;
    String zzs;
    zzht zzt;

    public zzij(final Context context, zzcdh zzcdhVar) {
        zzic zzicVar = new zzic(zzcdhVar);
        zzid zzidVar = new zzid(context);
        zzftz zzftzVar = new zzftz() { // from class: com.google.android.gms.internal.ads.zzie
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                return new zzyf(context);
            }
        };
        zzftz zzftzVar2 = new zzftz() { // from class: com.google.android.gms.internal.ads.zzif
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                return new zzhw();
            }
        };
        zzig zzigVar = new zzig(context);
        zzfsw zzfswVar = new zzfsw() { // from class: com.google.android.gms.internal.ads.zzih
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return new zzod((zzcz) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzicVar;
        this.zzd = zzidVar;
        this.zze = zzftzVar;
        this.zzf = zzftzVar2;
        this.zzg = zzigVar;
        this.zzh = zzfswVar;
        this.zzi = zzen.zzz();
        this.zzk = zze.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzls.zzb;
        float f7 = 0.97f;
        float f8 = 1.03f;
        this.zzt = new zzht(f7, f8, 1000L, 1.0E-7f, zzen.zzs(20L), zzen.zzs(500L), 0.999f, null);
        this.zzb = zzcz.zza;
        this.zzo = 500L;
        this.zzp = 2000L;
        this.zzq = true;
        this.zzs = "";
        this.zzj = -1000;
        if (zzen.zza >= 35) {
            int i7 = zzhz.zza;
        }
    }

    public static /* synthetic */ zzup zza(Context context) {
        return new zzud(context, new zzacp());
    }
}
