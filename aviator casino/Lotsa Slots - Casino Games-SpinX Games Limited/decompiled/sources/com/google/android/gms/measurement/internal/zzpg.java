package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzpg {
    final android.content.Context zza;

    public zzpg(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
    }
}
