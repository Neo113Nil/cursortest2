package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzask {
    private final com.google.android.libraries.places.internal.zzbmg zza;
    private final com.google.android.libraries.places.internal.zzbis zzb;
    private final java.lang.String zzc;

    public static com.google.android.libraries.places.internal.zzask zza(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, java.lang.String str) {
        return new com.google.android.libraries.places.internal.zzask(2, (com.google.android.libraries.places.internal.zzbml) com.google.common.base.Preconditions.checkNotNull(zzbmlVar), null, (com.google.android.libraries.places.internal.zzbis) com.google.common.base.Preconditions.checkNotNull(zzbisVar), (com.google.android.libraries.places.internal.zzbmg) com.google.common.base.Preconditions.checkNotNull(zzbmgVar), (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str));
    }

    public final java.lang.String zzd() {
        return this.zzc;
    }

    public final com.google.android.libraries.places.internal.zzbis zzc() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzbmg zzb() {
        return this.zza;
    }

    private zzask(int i, com.google.android.libraries.places.internal.zzbml zzbmlVar, java.lang.String str, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, java.lang.String str2) {
        this.zzb = zzbisVar;
        this.zza = zzbmgVar;
        this.zzc = str2;
    }
}
