package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.M;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:12:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0047 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007f, B:18:0x0091, B:20:0x00a5, B:22:0x00ae, B:27:0x00d0, B:29:0x00ec, B:30:0x0110, B:32:0x011b, B:25:0x00c0, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0059 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007f, B:18:0x0091, B:20:0x00a5, B:22:0x00ae, B:27:0x00d0, B:29:0x00ec, B:30:0x0110, B:32:0x011b, B:25:0x00c0, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007f, B:18:0x0091, B:20:0x00a5, B:22:0x00ae, B:27:0x00d0, B:29:0x00ec, B:30:0x0110, B:32:0x011b, B:25:0x00c0, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d0 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007f, B:18:0x0091, B:20:0x00a5, B:22:0x00ae, B:27:0x00d0, B:29:0x00ec, B:30:0x0110, B:32:0x011b, B:25:0x00c0, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ec A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007f, B:18:0x0091, B:20:0x00a5, B:22:0x00ae, B:27:0x00d0, B:29:0x00ec, B:30:0x0110, B:32:0x011b, B:25:0x00c0, B:13:0x0047), top: B:36:0x0000 }] */
    public static zzerc zzc(zzerb zzerbVar) {
        zzfpu zzfpuVar;
        boolean z4;
        boolean zZze;
        zzfpz zzfpzVarZzi;
        zzfpv zzfpvVarZza;
        try {
            Context context = zzerbVar.zza;
            boolean zZza = zzerbVar.zzc.zza();
            zzfpu zzfpuVar2 = new zzfpu();
            zzfpu zzfpuVar3 = new zzfpu();
            boolean zZzd = true;
            if (zZza) {
                if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdn)).booleanValue()) {
                    return new zzerc(true);
                }
            }
            if (!zZza) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdj)).booleanValue()) {
                    zzfpuVar2 = zzfpy.zzj(context).zzh(((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzdu)).longValue(), ((M) o.f1952C.f1961g.zzi()).k());
                } else if (zZza) {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdl)).booleanValue()) {
                        zzfpuVar2 = zzfpy.zzj(context).zzh(((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzdu)).longValue(), ((M) o.f1952C.f1961g.zzi()).k());
                    }
                }
            } else if (zZza) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdl)).booleanValue()) {
                    zzfpuVar2 = zzfpy.zzj(context).zzh(((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzdu)).longValue(), ((M) o.f1952C.f1961g.zzi()).k());
                }
            }
            zzbbp zzbbpVar = zzbby.zzdr;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                if (zzerbVar.zzd.f10836c < ((Integer) c0254t.f2726c.zzb(zzbby.zzdq)).intValue()) {
                    zzfpz.zzi(context).zzj();
                }
            }
            if (zZza) {
                if (zZza) {
                    if (((Boolean) c0254t.f2726c.zzb(zzbby.zzdm)).booleanValue()) {
                        zzfpzVarZzi = zzfpz.zzi(context);
                        zzfpvVarZza = zzfpv.zza(context);
                        if (zzerbVar.zzd.f10836c >= ((Integer) c0254t.f2726c.zzb(zzbby.zzdq)).intValue()) {
                            zzfpuVar3 = zzfpzVarZzi.zzh(((Long) c0254t.f2726c.zzb(zzbby.zzdv)).longValue(), ((M) o.f1952C.f1961g.zzi()).k());
                            zZzd = zzfpvVarZza.zzd();
                        }
                        zZze = zzfpvVarZza.zze();
                        zzfpuVar = zzfpuVar3;
                        z4 = zZzd;
                    }
                }
                zzfpuVar = zzfpuVar3;
                z4 = true;
                zZze = true;
            } else {
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzdk)).booleanValue()) {
                    zzfpzVarZzi = zzfpz.zzi(context);
                    zzfpvVarZza = zzfpv.zza(context);
                    if (zzerbVar.zzd.f10836c >= ((Integer) c0254t.f2726c.zzb(zzbby.zzdq)).intValue()) {
                        zzfpuVar3 = zzfpzVarZzi.zzh(((Long) c0254t.f2726c.zzb(zzbby.zzdv)).longValue(), ((M) o.f1952C.f1961g.zzi()).k());
                        zZzd = zzfpvVarZza.zzd();
                    }
                    zZze = zzfpvVarZza.zze();
                    zzfpuVar = zzfpuVar3;
                    z4 = zZzd;
                } else {
                    if (zZza) {
                        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzdm)).booleanValue()) {
                            zzfpzVarZzi = zzfpz.zzi(context);
                            zzfpvVarZza = zzfpv.zza(context);
                            if (zzerbVar.zzd.f10836c >= ((Integer) c0254t.f2726c.zzb(zzbby.zzdq)).intValue()) {
                                zzfpuVar3 = zzfpzVarZzi.zzh(((Long) c0254t.f2726c.zzb(zzbby.zzdv)).longValue(), ((M) o.f1952C.f1961g.zzi()).k());
                                zZzd = zzfpvVarZza.zzd();
                            }
                            zZze = zzfpvVarZza.zze();
                            zzfpuVar = zzfpuVar3;
                            z4 = zZzd;
                        }
                    }
                    zzfpuVar = zzfpuVar3;
                    z4 = true;
                    zZze = true;
                }
            }
            return new zzerc(zzfpuVar2, zzfpuVar, z4, zZze, zZza);
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
                return zzerb.zzc(this.zza);
            }
        });
    }
}
