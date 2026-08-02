package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzkm {
    private android.graphics.Bitmap zza;

    public final com.google.android.libraries.places.internal.zzkn zza() {
        com.google.common.base.Preconditions.checkState(this.zza != null, "Photo must be set to non-null value.");
        return new com.google.android.libraries.places.internal.zzkn(this.zza, null);
    }

    public final com.google.android.libraries.places.internal.zzkm zzb(android.graphics.Bitmap bitmap) {
        this.zza = bitmap;
        return this;
    }
}
