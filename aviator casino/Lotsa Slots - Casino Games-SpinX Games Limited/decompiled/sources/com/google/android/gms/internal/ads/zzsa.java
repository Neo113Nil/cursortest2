package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzsa extends java.lang.Exception {
    public final boolean zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzsa(int i, int i2, int i3, int i4, int i5, com.google.android.gms.internal.ads.zzv zzvVar, boolean z, java.lang.Exception exc) {
        super(r3.toString(), exc);
        java.lang.String valueOf = java.lang.String.valueOf(zzvVar);
        int length = java.lang.String.valueOf(i2).length();
        int length2 = java.lang.String.valueOf(i3).length();
        int length3 = java.lang.String.valueOf(i4).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 34 + length2 + 2 + length3 + 2 + java.lang.String.valueOf(i5).length() + 2 + java.lang.String.valueOf(valueOf).length());
        sb.append("AudioTrack init failed 0 Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(") ");
        sb.append(valueOf);
        sb.append("");
        this.zza = false;
    }
}
