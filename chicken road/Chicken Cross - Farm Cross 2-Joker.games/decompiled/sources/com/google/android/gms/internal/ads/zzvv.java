package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzvv extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzvs zzc;
    public final String zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvv(zzv zzvVar, Throwable th, boolean z, int i) {
        this(r4, th, r6, false, null, r15.toString(), null);
        String obj = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + obj.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(obj);
        String sb2 = sb.toString();
        String str = zzvVar.zzp;
        int abs = Math.abs(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(abs).length() + 60);
        sb3.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb3.append(abs);
    }

    final /* synthetic */ zzvv zza(zzvv zzvvVar) {
        return new zzvv(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzvvVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvv(zzv zzvVar, Throwable th, boolean z, zzvs zzvsVar) {
        this(r6.toString(), th, zzvVar.zzp, false, zzvsVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        String str = zzvsVar.zza;
        int length = str.length();
        String obj = zzvVar.toString();
        StringBuilder sb = new StringBuilder(length + 23 + obj.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(obj);
    }

    private zzvv(String str, Throwable th, String str2, boolean z, zzvs zzvsVar, String str3, zzvv zzvvVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzvsVar;
        this.zzd = str3;
    }
}
