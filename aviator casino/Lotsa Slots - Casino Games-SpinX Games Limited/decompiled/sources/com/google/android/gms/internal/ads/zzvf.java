package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzvf {
    private final java.util.HashSet zza;
    private android.media.LoudnessCodecController zzb;

    public zzvf() {
        throw null;
    }

    public zzvf(com.google.android.gms.internal.ads.zzve zzveVar) {
        this.zza = new java.util.HashSet();
    }

    public final void zza(int i) {
        android.media.LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        android.media.LoudnessCodecController create = android.media.LoudnessCodecController.create(i, com.google.android.gms.internal.ads.zzhcn.zza(), new com.google.android.gms.internal.ads.zzvc(this));
        this.zzb = create;
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((android.media.MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void zzb(android.media.MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            com.google.android.gms.internal.ads.zzgtj.zzi(this.zza.add(mediaCodec));
        }
    }

    public final void zzc(android.media.MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController;
        if (!this.zza.remove(mediaCodec) || (loudnessCodecController = this.zzb) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void zzd() {
        this.zza.clear();
        android.media.LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
