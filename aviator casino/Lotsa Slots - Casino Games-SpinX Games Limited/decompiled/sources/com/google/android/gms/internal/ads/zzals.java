package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzals implements com.google.android.gms.internal.ads.zzahf {
    public static final com.google.android.gms.internal.ads.zzals zza = new com.google.android.gms.internal.ads.zzals(true);
    public static final com.google.android.gms.internal.ads.zzals zzb = new com.google.android.gms.internal.ads.zzals(false);
    public final boolean zzc;

    private zzals(boolean z) {
        this.zzc = z;
    }

    public final java.lang.String toString() {
        boolean z = !this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(z).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
