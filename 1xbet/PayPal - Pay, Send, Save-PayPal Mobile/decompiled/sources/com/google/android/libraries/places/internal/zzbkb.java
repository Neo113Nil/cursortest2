package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbkb extends com.google.android.libraries.places.internal.zzbly {
    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("delegate", zza()).toString();
    }

    protected abstract com.google.android.libraries.places.internal.zzbly zza();

    public final com.google.android.libraries.places.internal.zzbly zzb(com.google.android.libraries.places.internal.zzbiy... zzbiyVarArr) {
        ((com.google.android.libraries.places.internal.zzbvw) zza()).zza(java.util.Arrays.asList(zzbiyVarArr));
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbly zzc(java.lang.String str) {
        ((com.google.android.libraries.places.internal.zzbvw) zza()).zzb(str);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbly
    public final com.google.android.libraries.places.internal.zzblw zzd() {
        return zza().zzd();
    }

    protected zzbkb() {
    }
}
