package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbko {
    private java.lang.Object zza;

    public final com.google.android.libraries.places.internal.zzbko zza(java.lang.Object obj) {
        this.zza = com.google.common.base.Preconditions.checkNotNull(obj, "config");
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.libraries.places.internal.zzbkp zzb() {
        com.google.common.base.Preconditions.checkState(this.zza != null, "config is not set");
        return new com.google.android.libraries.places.internal.zzbkp(com.google.android.libraries.places.internal.zzbnp.zza, this.zza, null, 0 == true ? 1 : 0);
    }

    /* synthetic */ zzbko(byte[] bArr) {
    }

    private zzbko() {
        throw null;
    }
}
