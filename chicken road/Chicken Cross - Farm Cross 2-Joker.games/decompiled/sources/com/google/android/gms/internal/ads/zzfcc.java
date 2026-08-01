package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfcc implements zzfdi {
    private final Context zza;
    private final zzhdi zzb;
    private final zzflw zzc;
    private final VersionInfoParcel zzd;

    zzfcc(Context context, zzhdi zzhdiVar, zzflw zzflwVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzhdiVar;
        this.zzc = zzflwVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfcc.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzed)).booleanValue() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzgdn.zzh(r0).zzi(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzeo)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzee)).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgdo.zzh(r0);
        r0 = com.google.android.gms.internal.ads.zzgdk.zza(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ed, code lost:
    
        if (r9.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzek)).intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        r2 = r4.zzi(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzep)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
        r3 = r0.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0113, code lost:
    
        r6 = r0.zze();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzeg)).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzef)).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzfcd zzc() {
        try {
            Context context = this.zza;
            boolean zza = this.zzc.zza();
            zzgdj zzgdjVar = new zzgdj();
            zzgdj zzgdjVar2 = new zzgdj();
            boolean z = true;
            if (zza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeh)).booleanValue()) {
                    return new zzfcd(true);
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzel)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzek)).intValue()) {
                    zzgdo.zzh(context).zzj();
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            zzgdj zzgdjVar3 = zzgdjVar2;
            boolean z2 = true;
            boolean z3 = true;
            return new zzfcd(zzgdjVar, zzgdjVar3, z2, z3, zza);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "PerAppIdSignal");
            return new zzfcd(this.zzc.zza());
        }
    }
}
