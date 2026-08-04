package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class zzsl {
    public final zzsr zza;
    public final MediaFormat zzb;
    public final zzz zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzsk zzf;

    private zzsl(zzsr zzsrVar, MediaFormat mediaFormat, zzz zzzVar, Surface surface, MediaCrypto mediaCrypto, zzsk zzskVar) {
        this.zza = zzsrVar;
        this.zzb = mediaFormat;
        this.zzc = zzzVar;
        this.zzd = surface;
        this.zzf = zzskVar;
    }

    public static zzsl zza(zzsr zzsrVar, MediaFormat mediaFormat, zzz zzzVar, MediaCrypto mediaCrypto, zzsk zzskVar) {
        return new zzsl(zzsrVar, mediaFormat, zzzVar, null, null, zzskVar);
    }

    public static zzsl zzb(zzsr zzsrVar, MediaFormat mediaFormat, zzz zzzVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzsl(zzsrVar, mediaFormat, zzzVar, surface, null, null);
    }
}
