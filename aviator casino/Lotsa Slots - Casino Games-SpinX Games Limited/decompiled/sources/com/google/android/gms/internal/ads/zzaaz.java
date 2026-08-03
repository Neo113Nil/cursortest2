package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaaz {
    public final com.google.android.gms.internal.ads.zzbg zza;
    public final int[] zzb;

    public zzaaz(com.google.android.gms.internal.ads.zzbg zzbgVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            com.google.android.gms.internal.ads.zzeg.zzf("ETSDefinition", "Empty tracks are not allowed", new java.lang.IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
