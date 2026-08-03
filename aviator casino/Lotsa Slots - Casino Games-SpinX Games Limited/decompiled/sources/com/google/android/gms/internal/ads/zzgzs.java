package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgzs extends com.google.android.gms.internal.ads.zzgzj {
    private final java.io.File zza;

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 20);
        sb.append("Files.asByteSource(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public final /* bridge */ /* synthetic */ java.io.InputStream zza() throws java.io.IOException {
        return new java.io.FileInputStream(this.zza);
    }
}
