package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbas {
    private final com.google.common.util.concurrent.ListenableFuture zza;

    public zzbas(final android.content.Context context, java.util.concurrent.Executor executor) {
        this.zza = com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.zzbar
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                android.content.Context context2 = context;
                try {
                    return com.google.android.gms.internal.ads.zzfxn.zza(context2, context2.getPackageName(), java.lang.Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (java.lang.Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza;
    }
}
