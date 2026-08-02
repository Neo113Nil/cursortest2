package com.google.android.gms.internal.ads;

import io.sentry.TransactionOptions;

/* loaded from: classes.dex */
public final class zzbel {
    public static final zzbdi zza;

    static {
        zzbdi.zzb("gads:ad_loader:timeout_ms", 60000L);
        zza = zzbdi.zzb("gads:rendering:timeout_ms", 60000L);
        zzbdi.zzb("gads:resolve_future:default_timeout_ms", TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION);
    }
}
