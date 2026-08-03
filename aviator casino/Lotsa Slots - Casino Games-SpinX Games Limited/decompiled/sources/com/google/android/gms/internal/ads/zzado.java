package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzado implements com.google.android.gms.internal.ads.zzbs {
    private final com.google.android.gms.internal.ads.zzbq zza = new com.google.android.gms.internal.ads.zzadn(false);

    public zzado(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbs
    public final com.google.android.gms.internal.ads.zzbu zza(android.content.Context context, com.google.android.gms.internal.ads.zzi zziVar, com.google.android.gms.internal.ads.zzl zzlVar, com.google.android.gms.internal.ads.zzbt zzbtVar, java.util.concurrent.Executor executor, long j, boolean z) {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(com.google.android.gms.internal.ads.zzbq.class);
            java.lang.Object[] objArr = new java.lang.Object[1];
            try {
                objArr[0] = this.zza;
                return ((com.google.android.gms.internal.ads.zzbs) constructor.newInstance(objArr)).zza(context, zziVar, zzlVar, zzbtVar, executor, 0L, false);
            } catch (java.lang.Exception e) {
                e = e;
                throw new java.lang.IllegalStateException(e);
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }
}
