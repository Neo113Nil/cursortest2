package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzelo {
    private androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zza;
    private final android.content.Context zzb;

    zzelo(android.content.Context context) {
        this.zzb = context;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
        try {
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures from = androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.from(this.zzb);
            this.zza = from;
            return from == null ? com.google.android.gms.internal.ads.zzhbw.zzc(new java.lang.IllegalStateException("MeasurementManagerFutures is null")) : from.getMeasurementApiStatusAsync();
        } catch (java.lang.Exception e) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(e);
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(android.net.Uri uri, android.view.InputEvent inputEvent) {
        try {
            return ((androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures) java.util.Objects.requireNonNull(this.zza)).registerSourceAsync(uri, inputEvent);
        } catch (java.lang.Exception e) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(e);
        }
    }
}
