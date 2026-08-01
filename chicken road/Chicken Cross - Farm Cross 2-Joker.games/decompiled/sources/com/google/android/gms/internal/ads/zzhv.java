package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhv {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzhv() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }

    /* synthetic */ zzhv(zzhw zzhwVar, byte[] bArr) {
        this.zza = zzhwVar.zza;
        this.zzb = zzhwVar.zzd;
        this.zzc = zzhwVar.zze;
        this.zzd = zzhwVar.zzf;
        this.zze = zzhwVar.zzg;
    }

    public final zzhv zza(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzhv zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzhv zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzhv zzd(int i) {
        this.zze = 6;
        return this;
    }

    public final zzhw zze() {
        zzguk.zzk(this.zza, "The uri must be set.");
        return new zzhw(this.zza, 0L, 1, null, this.zzb, this.zzc, this.zzd, null, this.zze, null, null);
    }
}
