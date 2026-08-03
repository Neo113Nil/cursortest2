package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzvp extends java.lang.Exception {
    public final java.lang.String zza;
    public final boolean zzb;
    public final com.google.android.gms.internal.ads.zzvm zzc;
    public final java.lang.String zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvp(com.google.android.gms.internal.ads.zzv zzvVar, java.lang.Throwable th, boolean z, int i) {
        this(r4, th, r6, false, null, r15.toString(), null);
        java.lang.String obj = zzvVar.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 25 + obj.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(obj);
        java.lang.String sb2 = sb.toString();
        java.lang.String str = zzvVar.zzp;
        int abs = java.lang.Math.abs(i);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(abs).length() + 60);
        sb3.append("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_");
        sb3.append(abs);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzvp zza(com.google.android.gms.internal.ads.zzvp zzvpVar) {
        return new com.google.android.gms.internal.ads.zzvp(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzvpVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvp(com.google.android.gms.internal.ads.zzv zzvVar, java.lang.Throwable th, boolean z, com.google.android.gms.internal.ads.zzvm zzvmVar) {
        this(r6.toString(), th, zzvVar.zzp, false, zzvmVar, th instanceof android.media.MediaCodec.CodecException ? ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        java.lang.String str = zzvmVar.zza;
        int length = str.length();
        java.lang.String obj = zzvVar.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 23 + obj.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(obj);
    }

    private zzvp(java.lang.String str, java.lang.Throwable th, java.lang.String str2, boolean z, com.google.android.gms.internal.ads.zzvm zzvmVar, java.lang.String str3, com.google.android.gms.internal.ads.zzvp zzvpVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzvmVar;
        this.zzd = str3;
    }
}
