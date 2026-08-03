package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbui {
    static final com.google.android.gms.ads.internal.util.zzbc zza = new com.google.android.gms.internal.ads.zzbug();
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new com.google.android.gms.internal.ads.zzbuh();
    private final com.google.android.gms.internal.ads.zzbtu zzc;

    public zzbui(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzfqj zzfqjVar) {
        this.zzc = new com.google.android.gms.internal.ads.zzbtu(context, versionInfoParcel, str, zza, zzb, zzfqjVar);
    }

    public final com.google.android.gms.internal.ads.zzbty zza(java.lang.String str, com.google.android.gms.internal.ads.zzbub zzbubVar, com.google.android.gms.internal.ads.zzbua zzbuaVar) {
        return new com.google.android.gms.internal.ads.zzbum(this.zzc, str, zzbubVar, zzbuaVar);
    }

    public final com.google.android.gms.internal.ads.zzbur zzb() {
        return new com.google.android.gms.internal.ads.zzbur(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }
}
