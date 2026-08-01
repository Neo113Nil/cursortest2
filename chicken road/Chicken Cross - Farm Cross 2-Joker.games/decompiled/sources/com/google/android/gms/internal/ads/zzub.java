package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzub implements zzsf {
    final /* synthetic */ zzuc zza;

    /* synthetic */ zzub(zzuc zzucVar, byte[] bArr) {
        Objects.requireNonNull(zzucVar);
        this.zza = zzucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    public final void zza(Exception exc) {
        zzeh.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaB().zzi(exc);
    }
}
