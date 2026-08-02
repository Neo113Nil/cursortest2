package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbme extends com.google.android.libraries.places.internal.zzbmc {
    private final com.google.android.libraries.places.internal.zzbmf zzb;

    /* synthetic */ zzbme(java.lang.String str, boolean z, com.google.android.libraries.places.internal.zzbmf zzbmfVar, byte[] bArr) {
        super(str, z, zzbmfVar, null);
        com.google.common.base.Preconditions.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.zzb = (com.google.android.libraries.places.internal.zzbmf) com.google.common.base.Preconditions.checkNotNull(zzbmfVar, "marshaller");
    }

    @Override // com.google.android.libraries.places.internal.zzbmc
    final byte[] zza(java.lang.Object obj) {
        return (byte[]) com.google.common.base.Preconditions.checkNotNull(this.zzb.zza(obj), "null marshaller.toAsciiString()");
    }

    @Override // com.google.android.libraries.places.internal.zzbmc
    final java.lang.Object zzb(byte[] bArr) {
        return this.zzb.zzb(bArr);
    }
}
