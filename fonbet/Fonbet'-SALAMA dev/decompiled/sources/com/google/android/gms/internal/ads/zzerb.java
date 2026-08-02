package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzerb implements zzesh {
    private final Context zza;
    private final zzgbn zzb;
    private final zzfba zzc;
    private final VersionInfoParcel zzd;

    public zzerb(Context context, zzgbn zzgbnVar, zzfba zzfbaVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgbnVar;
        this.zzc = zzfbaVar;
        this.zzd = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdj)).booleanValue() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzfpy.zzj(r0).zzh(((java.lang.Long) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdu)).longValue(), ((I2.M) E2.o.f1952C.f1961g.zzi()).k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (((java.lang.Boolean) r5.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdk)).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzfpz.zzi(r0);
        r0 = com.google.android.gms.internal.ads.zzfpv.zza(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
    
        if (r10.zzd.f10836c < ((java.lang.Integer) r5.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdq)).intValue()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ec, code lost:
    
        r2 = r4.zzh(((java.lang.Long) r5.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdv)).longValue(), ((I2.M) E2.o.f1952C.f1961g.zzi()).k());
        r3 = r0.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0110, code lost:
    
        r6 = r0.zze();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        if (((java.lang.Boolean) r5.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdm)).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdl)).booleanValue() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzerc zzc(zzerb zzerbVar) {
        try {
            Context context = zzerbVar.zza;
            boolean zza = zzerbVar.zzc.zza();
            zzfpu zzfpuVar = new zzfpu();
            zzfpu zzfpuVar2 = new zzfpu();
            boolean z4 = true;
            if (zza) {
                if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdn)).booleanValue()) {
                    return new zzerc(true);
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            zzbbp zzbbpVar = zzbby.zzdr;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                if (zzerbVar.zzd.f10836c < ((Integer) c0254t.f2726c.zzb(zzbby.zzdq)).intValue()) {
                    zzfpz.zzi(context).zzj();
                }
            }
            if (!zza) {
            }
            if (zza) {
            }
            zzfpu zzfpuVar3 = zzfpuVar2;
            boolean z7 = true;
            boolean z8 = true;
            return new zzerc(zzfpuVar, zzfpuVar3, z7, z8, zza);
        } catch (IOException e7) {
            o.f1952C.f1961g.zzw(e7, "PerAppIdSignal");
            return new zzerc(zzerbVar.zzc.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerb.zzc(zzerb.this);
            }
        });
    }
}
