package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzbnd extends com.google.android.libraries.places.internal.zzbix {
    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("delegate", zzf()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public void zzc(int i) {
        zzf().zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public void zzd() {
        zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public void zze(@javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        zzf().zze(str, th);
    }

    protected abstract com.google.android.libraries.places.internal.zzbix zzf();

    zzbnd() {
    }
}
