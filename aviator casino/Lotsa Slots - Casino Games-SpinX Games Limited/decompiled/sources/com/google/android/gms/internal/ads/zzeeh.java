package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzeeh implements com.google.android.gms.internal.ads.zzhbe {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzeeh zza = new com.google.android.gms.internal.ads.zzeeh();

    private /* synthetic */ zzeeh() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
        java.util.concurrent.ExecutionException executionException = (java.util.concurrent.ExecutionException) obj;
        java.lang.Throwable cause = executionException.getCause();
        java.lang.Throwable th = executionException;
        if (cause != null) {
            th = executionException.getCause();
        }
        return com.google.android.gms.internal.ads.zzhbw.zzc(th);
    }
}
