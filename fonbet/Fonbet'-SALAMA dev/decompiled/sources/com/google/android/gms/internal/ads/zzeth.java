package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import J2.d;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        E2.o.f1952C.f1961g.zzw(r7, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzfpu();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdp)).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdo)).booleanValue() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzfpy.zzj(r7.zza);
        java.util.Objects.requireNonNull(r8);
        r2 = r8.getId();
        java.util.Objects.requireNonNull(r2);
        r0 = r1.zzi(r2, r7.zza.getPackageName(), ((java.lang.Long) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdu)).longValue(), r7.zzf);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzeti zzc(zzeth zzethVar, AdvertisingIdClient.Info info) {
        zzfpu zzfpuVar = new zzfpu();
        if (!zzethVar.zze) {
        }
        if (zzethVar.zze) {
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
                return zzeth.zzc(zzeth.this, (AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzbh)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return zzeth.zzd(zzeth.this, (Throwable) obj);
            }
        }, this.zzc);
    }
}
