package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzimh extends com.google.android.gms.internal.ads.zzimm {
    final java.lang.String zza;

    public zzimh(java.lang.String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzimm
    public final void zza(java.lang.String str) {
        java.lang.String str2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        android.util.Log.d("isoparser", sb.toString());
    }
}
