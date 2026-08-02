package com.google.android.recaptcha.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdf {
    private static zzoa zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzdg zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zznr.zzc(zznr.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;

    public zzdf(int i7, String str, String str2, String str3, String str4, String str5, zzdg zzdgVar, zzbw zzbwVar, Context context, Integer num) {
        this.zzk = i7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzdgVar;
        this.zzg = context;
        this.zzh = num;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:35:0x00da
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private final void zzc(int r12, com.google.android.recaptcha.internal.zzod r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdf.zzc(int, com.google.android.recaptcha.internal.zzod):void");
    }

    public final void zza() {
        zzc(3, null);
    }

    public final void zzb(zzbj zzbjVar) {
        zzoc zzg = zzod.zzg();
        zzg.zzq(String.valueOf(zzbjVar.zzb().zza()));
        zzg.zzd(zzbjVar.zza().zza());
        zzg.zzp(zzbjVar.zzc().getErrorCode().getErrorCode());
        String zzd = zzbjVar.zzd();
        if (zzd != null) {
            zzg.zze(zzd);
        }
        zzc(4, (zzod) zzg.zzj());
    }
}
