package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzcdw {
    private final com.google.android.libraries.places.internal.zzbit zza;
    private final com.google.android.libraries.places.internal.zzbis zzb;

    protected zzcdw(com.google.android.libraries.places.internal.zzbit zzbitVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbit) com.google.common.base.Preconditions.checkNotNull(zzbitVar, "channel");
        this.zzb = (com.google.android.libraries.places.internal.zzbis) com.google.common.base.Preconditions.checkNotNull(zzbisVar, "callOptions");
    }

    protected abstract com.google.android.libraries.places.internal.zzcdw zza(com.google.android.libraries.places.internal.zzbit zzbitVar, com.google.android.libraries.places.internal.zzbis zzbisVar);

    public final com.google.android.libraries.places.internal.zzcdw zze(com.google.android.libraries.places.internal.zzbiy... zzbiyVarArr) {
        return zza(com.google.android.libraries.places.internal.zzbja.zza(this.zza, java.util.Arrays.asList(zzbiyVarArr)), this.zzb);
    }

    public final com.google.android.libraries.places.internal.zzbis zzd() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzbit zzc() {
        return this.zza;
    }
}
