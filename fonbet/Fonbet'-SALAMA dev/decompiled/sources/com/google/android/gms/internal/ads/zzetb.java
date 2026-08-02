package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.L;
import I2.M;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z0.C1809b;
import z0.C1810c;

/* loaded from: classes.dex */
public final class zzetb implements zzesh {
    private final L zza;
    private final Context zzb;
    private final zzgbn zzc;
    private final ScheduledExecutorService zzd;
    private final zzebp zze;
    private final zzfba zzf;
    private final VersionInfoParcel zzg;

    public zzetb(L l7, Context context, zzgbn zzgbnVar, ScheduledExecutorService scheduledExecutorService, zzebp zzebpVar, zzfba zzfbaVar, VersionInfoParcel versionInfoParcel) {
        this.zza = l7;
        this.zzb = context;
        this.zzc = zzgbnVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzebpVar;
        this.zzf = zzfbaVar;
        this.zzg = versionInfoParcel;
    }

    public static /* synthetic */ I3.b zzc(zzetb zzetbVar, final Throwable th) {
        zzetbVar.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesy
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzku)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    o.f1952C.f1961g.zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    o.f1952C.f1961g.zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgbc.zzh(th instanceof SecurityException ? new zzetd("", 2, null) : th instanceof IllegalStateException ? new zzetd("", 3, null) : th instanceof IllegalArgumentException ? new zzetd("", 4, null) : th instanceof TimeoutException ? new zzetd("", 5, null) : new zzetd("", 0, null));
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r9.zzb.getPackageName()) == false) goto L48;
     */
    @Override // com.google.android.gms.internal.ads.zzesh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I3.b zzb() {
        boolean z4;
        I3.b zzg;
        zzbbp zzbbpVar = zzbby.zzkt;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            M m7 = (M) this.zza;
            m7.l();
            synchronized (m7.f3551a) {
                try {
                    SharedPreferences sharedPreferences = m7.f3556f;
                    if (sharedPreferences != null) {
                        if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) >= System.currentTimeMillis()) {
                            z4 = m7.f3556f.getBoolean("is_topics_ad_personalization_allowed", false) && !m7.f3560k;
                        }
                    }
                    z4 = false;
                } finally {
                }
            }
            if (z4) {
                if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzkx)).booleanValue() || this.zzf.zzd.f10754P != 2) {
                    if (this.zzg.f10836c >= ((Integer) c0254t.f2726c.zzb(zzbby.zzkr)).intValue()) {
                        if (Build.VERSION.SDK_INT >= ((Integer) c0254t.f2726c.zzb(zzbby.zzks)).intValue()) {
                            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzkp)).booleanValue()) {
                                String str = (String) c0254t.f2726c.zzb(zzbby.zzkq);
                                if (!TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                zzg = zzgbc.zzo(this.zze.zza(false), ((Integer) c0254t.f2726c.zzb(zzbby.zzkv)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                            } catch (Exception e7) {
                                zzg = zzgbc.zzg(e7);
                            }
                            return zzgbc.zzo((zzgat) zzgbc.zzf((zzgat) zzgbc.zzn(zzgat.zzu(zzg), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzesz
                                /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.List] */
                                @Override // com.google.android.gms.internal.ads.zzgaj
                                public final I3.b zza(Object obj) {
                                    C1809b c1809b = (C1809b) obj;
                                    if (c1809b == null) {
                                        return zzgbc.zzh(new zzetd("", 1, null));
                                    }
                                    zzhaq zzc = zzhar.zzc();
                                    for (C1810c c1810c : c1809b.f18428a) {
                                        zzhao zzc2 = zzhap.zzc();
                                        zzc2.zzc(c1810c.f18431c);
                                        zzc2.zza(c1810c.f18430b);
                                        zzc2.zzb(c1810c.f18429a);
                                        zzc.zza((zzhap) zzc2.zzbr());
                                    }
                                    return zzgbc.zzh(new zzetd(Base64.encodeToString(((zzhar) zzc.zzbr()).zzaV(), 1), 1, null));
                                }
                            }, this.zzc), Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzeta
                                @Override // com.google.android.gms.internal.ads.zzgaj
                                public final I3.b zza(Object obj) {
                                    return zzetb.zzc(zzetb.this, (Throwable) obj);
                                }
                            }, this.zzc), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzkv)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                        }
                    }
                }
            }
        }
        return zzgbc.zzh(new zzetd("", -1, null));
    }
}
