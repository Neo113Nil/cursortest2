package com.google.android.gms.internal.ads;

import F2.C0254t;
import F2.S;
import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final class zzfja {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private zzboo zze;
    private final p090m3.a zzf;

    public zzfja(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, p090m3.a aVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = aVar;
    }

    private static zzfig zzc() {
        zzbbp zzbbpVar = zzbby.zzy;
        C0254t c0254t = C0254t.f2723d;
        return new zzfig(((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue(), 2.0d, ((Long) c0254t.f2726c.zzb(zzbby.zzz)).longValue(), 0.2d);
    }

    public final zzfiz zza(com.google.android.gms.ads.internal.client.zzfq zzfqVar, S s7) {
        EnumC1058b enumC1058bA = EnumC1058b.a(zzfqVar.f10730b);
        if (enumC1058bA == null) {
            return null;
        }
        int iOrdinal = enumC1058bA.ordinal();
        if (iOrdinal == 1) {
            return new zzfii(this.zzd, this.zza, this.zzb.f10836c, this.zze, zzfqVar, s7, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal == 2) {
            return new zzfjd(this.zzd, this.zza, this.zzb.f10836c, this.zze, zzfqVar, s7, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzfif(this.zzd, this.zza, this.zzb.f10836c, this.zze, zzfqVar, s7, this.zzc, zzc(), this.zzf);
    }

    public final void zzb(zzboo zzbooVar) {
        this.zze = zzbooVar;
    }
}
