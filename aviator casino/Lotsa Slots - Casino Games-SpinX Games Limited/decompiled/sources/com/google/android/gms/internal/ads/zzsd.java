package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzsd extends java.lang.Exception {
    public final int zza;
    public final boolean zzb;
    public final com.google.android.gms.internal.ads.zzv zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzsd(int i, com.google.android.gms.internal.ads.zzv zzvVar, boolean z) {
        super(r1.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 25);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        this.zzb = z;
        this.zza = i;
        this.zzc = zzvVar;
    }
}
