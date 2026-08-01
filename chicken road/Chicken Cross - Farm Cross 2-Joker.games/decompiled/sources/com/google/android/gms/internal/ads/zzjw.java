package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzjw {
    public static final /* synthetic */ int zzB = 0;
    zzjg zzA;
    final Context zza;
    zzdp zzb;
    zzgvc zzc;
    zzgvc zzd;
    zzgvc zze;
    zzgvc zzf;
    zzgvc zzg;
    zzgub zzh;
    Looper zzi;
    int zzj;
    zzd zzk;
    int zzl;
    boolean zzm;
    zznm zzn;
    zznl zzo;
    long zzp;
    long zzq;
    int zzr;
    int zzs;
    int zzt;
    int zzu;
    boolean zzv;
    boolean zzw;
    String zzx;
    boolean zzy;
    boolean zzz;

    static {
        String str = zzfm.zza;
        String zza = zzgts.zza(Build.DEVICE);
        if (zza.contains("emulator") || zza.contains("emu64a") || zza.contains("emu64x")) {
            return;
        }
        zza.contains("generic");
    }

    public zzjw(final Context context, final zznj zznjVar) {
        zzgvc zzgvcVar = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzjv
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                int i = zzjw.zzB;
                return zznj.this;
            }
        };
        zzgvc zzgvcVar2 = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzjq
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                int i = zzjw.zzB;
                return new zzxb(context, new zzagd());
            }
        };
        zzgvc zzgvcVar3 = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzjr
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                int i = zzjw.zzB;
                return new zzabc(context);
            }
        };
        zzjp zzjpVar = zzjp.zza;
        zzgvc zzgvcVar4 = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                int i = zzjw.zzB;
                return zzaby.zzh(context);
            }
        };
        zzjo zzjoVar = zzjo.zza;
        context.getClass();
        this.zza = context;
        this.zzc = zzgvcVar;
        this.zzd = zzgvcVar2;
        this.zze = zzgvcVar3;
        this.zzf = zzjpVar;
        this.zzg = zzgvcVar4;
        this.zzh = zzjoVar;
        this.zzi = zzfm.zzf();
        this.zzk = zzd.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zznm.zzc;
        this.zzo = zznl.zza;
        this.zzA = new zzjg(0.97f, 1.03f, 1000L, 1.0E-7f, zzfm.zzt(20L), zzfm.zzt(500L), 0.999f, null);
        this.zzb = zzdp.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = 600000;
        this.zzv = true;
        this.zzx = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = zzjm.zza;
        }
        this.zzy = true;
        this.zzz = true;
    }
}
