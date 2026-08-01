package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzsh extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzsh(int i, zzv zzvVar, boolean z) {
        super(r1.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        this.zzb = z;
        this.zza = i;
        this.zzc = zzvVar;
    }
}
