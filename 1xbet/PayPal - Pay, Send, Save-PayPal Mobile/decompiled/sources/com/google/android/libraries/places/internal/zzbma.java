package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbma extends com.google.android.libraries.places.internal.zzbmc {
    private final com.google.android.libraries.places.internal.zzbmb zzb;

    /* synthetic */ zzbma(java.lang.String str, boolean z, com.google.android.libraries.places.internal.zzbmb zzbmbVar, byte[] bArr) {
        super(str, false, zzbmbVar, null);
        com.google.common.base.Preconditions.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.zzb = (com.google.android.libraries.places.internal.zzbmb) com.google.common.base.Preconditions.checkNotNull(zzbmbVar, "marshaller");
    }

    @Override // com.google.android.libraries.places.internal.zzbmc
    final byte[] zza(java.lang.Object obj) {
        return ((java.lang.String) com.google.common.base.Preconditions.checkNotNull(this.zzb.zzb(obj), "null marshaller.toAsciiString()")).getBytes(java.nio.charset.StandardCharsets.US_ASCII);
    }

    @Override // com.google.android.libraries.places.internal.zzbmc
    final java.lang.Object zzb(byte[] bArr) {
        return this.zzb.zza(new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII));
    }
}
