package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzmx {
    abstract com.google.android.libraries.places.internal.zzmx zzb(int i);

    public abstract com.google.android.libraries.places.internal.zzmx zzc(com.google.android.libraries.places.internal.zzmy zzmyVar);

    abstract com.google.android.libraries.places.internal.zzmz zzd();

    public final com.google.android.libraries.places.internal.zzmz zze() {
        com.google.android.libraries.places.internal.zzmz zzd = zzd();
        com.google.common.base.Preconditions.checkArgument(!zzd.zza().isEmpty(), "Package name must not be empty.");
        return zzd;
    }
}
