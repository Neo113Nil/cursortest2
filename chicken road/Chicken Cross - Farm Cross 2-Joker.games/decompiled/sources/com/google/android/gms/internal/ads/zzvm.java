package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzvm {
    public final zzvs zza;
    public final MediaFormat zzb;
    public final zzv zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzvl zzf;

    private zzvm(zzvs zzvsVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto, zzvl zzvlVar) {
        this.zza = zzvsVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzvlVar;
    }

    public static zzvm zza(zzvs zzvsVar, MediaFormat mediaFormat, zzv zzvVar, MediaCrypto mediaCrypto, zzvl zzvlVar) {
        return new zzvm(zzvsVar, mediaFormat, zzvVar, null, null, zzvlVar);
    }

    public static zzvm zzb(zzvs zzvsVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzvm(zzvsVar, mediaFormat, zzvVar, surface, null, null);
    }
}
