package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import J2.d;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzeth implements zzesh {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbyh zzg;

    public zzeth(zzbyh zzbyhVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i7, boolean z4, boolean z7) {
        this.zzg = zzbyhVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i7;
        this.zze = z4;
        this.zzf = z7;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public static zzeti zzc(zzeth zzethVar, AdvertisingIdClient.Info info) {
        zzfpu zzfpuVar = new zzfpu();
        if (!zzethVar.zze) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdo)).booleanValue()) {
                zzfpy zzfpyVarZzj = zzfpy.zzj(zzethVar.zza);
                Objects.requireNonNull(info);
                String id = info.getId();
                Objects.requireNonNull(id);
                zzfpuVar = zzfpyVarZzj.zzi(id, zzethVar.zza.getPackageName(), ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzdu)).longValue(), zzethVar.zzf);
            } else if (zzethVar.zze) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdp)).booleanValue()) {
                    try {
                        zzfpy zzfpyVarZzj2 = zzfpy.zzj(zzethVar.zza);
                        Objects.requireNonNull(info);
                        String id2 = info.getId();
                        Objects.requireNonNull(id2);
                        zzfpuVar = zzfpyVarZzj2.zzi(id2, zzethVar.zza.getPackageName(), ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzdu)).longValue(), zzethVar.zzf);
                    } catch (IOException | IllegalArgumentException e7) {
                        o.f1952C.f1961g.zzw(e7, "AdIdInfoSignalSource.getPaidV1");
                        zzfpuVar = new zzfpu();
                    }
                }
            }
        } else if (zzethVar.zze) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdp)).booleanValue()) {
                zzfpy zzfpyVarZzj3 = zzfpy.zzj(zzethVar.zza);
                Objects.requireNonNull(info);
                String id3 = info.getId();
                Objects.requireNonNull(id3);
                zzfpuVar = zzfpyVarZzj3.zzi(id3, zzethVar.zza.getPackageName(), ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzdu)).longValue(), zzethVar.zzf);
            }
        }
        return new zzeti(info, null, zzfpuVar);
    }

    public static zzeti zzd(zzeth zzethVar, Throwable th) {
        d dVar = C0252s.f2717f.f2718a;
        ContentResolver contentResolver = zzethVar.zza.getContentResolver();
        return new zzeti(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfpu());
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return (zzgat) zzgbc.zze((zzgat) zzgbc.zzo((zzgat) zzgbc.zzm(zzgat.zzu(this.zzg.zza(this.zza, this.zzd)), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzetf
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return zzeth.zzc(this.zza, (AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzbh)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return zzeth.zzd(this.zza, (Throwable) obj);
            }
        }, this.zzc);
    }
}
