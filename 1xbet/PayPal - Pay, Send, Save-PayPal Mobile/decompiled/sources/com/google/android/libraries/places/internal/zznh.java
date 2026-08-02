package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zznh {
    private final android.content.Context zza;

    public zznh(android.content.Context context) {
        com.google.common.base.Preconditions.checkNotNull(context, "Context must not be null.");
        this.zza = context;
    }

    public final com.google.common.collect.ImmutableMap zza() {
        android.content.Context context = this.zza;
        java.lang.String packageName = context.getPackageName();
        java.lang.String zza = com.google.android.libraries.places.internal.zzmr.zza(context.getPackageManager(), packageName);
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        if (packageName != null) {
            builder.put("X-Android-Package", packageName);
        }
        if (zza != null) {
            builder.put("X-Android-Cert", zza);
        }
        return builder.buildOrThrow();
    }
}
