package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzsw implements zztj {
    final /* synthetic */ zztd zza;

    /* synthetic */ zzsw(zztd zztdVar, byte[] bArr) {
        Objects.requireNonNull(zztdVar);
        this.zza = zztdVar;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zza(long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        zzeh.zzc("AudioTrackAudioOutput", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzb(final long j) {
        zztd zztdVar = this.zza;
        if (zztdVar.zzu().zzb()) {
            zzeg zzu = zztdVar.zzu();
            zzu.zze(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzsv
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj) {
                    ((zzqx) obj).zza(j);
                }
            });
            zzu.zzf();
        }
    }
}
