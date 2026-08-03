package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaun extends com.google.android.gms.internal.ads.zzimf implements java.io.Closeable {
    static {
        com.google.android.gms.internal.ads.zzimm.zzb(com.google.android.gms.internal.ads.zzaun.class);
    }

    public zzaun(com.google.android.gms.internal.ads.zzimg zzimgVar, com.google.android.gms.internal.ads.zzaum zzaumVar) throws java.io.IOException {
        zzd(zzimgVar, zzimgVar.zzb(), zzaumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzimf
    public final java.lang.String toString() {
        java.lang.String obj = this.zzc.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
