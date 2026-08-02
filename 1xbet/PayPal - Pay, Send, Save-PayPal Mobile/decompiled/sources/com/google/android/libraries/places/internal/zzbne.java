package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzbne extends com.google.android.libraries.places.internal.zzbiw {
    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("delegate", zze()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzd() {
        zze().zzd();
    }

    protected abstract com.google.android.libraries.places.internal.zzbiw zze();

    zzbne() {
    }
}
