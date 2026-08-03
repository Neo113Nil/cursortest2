package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzafr implements com.google.android.gms.internal.ads.zzafs {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzafr zza = new com.google.android.gms.internal.ads.zzafr();

    private /* synthetic */ zzafr() {
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final /* synthetic */ java.lang.reflect.Constructor zza() {
        int i = com.google.android.gms.internal.ads.zzafu.zza;
        if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]))) {
            return java.lang.Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(com.google.android.gms.internal.ads.zzafy.class).getConstructor(java.lang.Integer.TYPE);
        }
        return null;
    }
}
