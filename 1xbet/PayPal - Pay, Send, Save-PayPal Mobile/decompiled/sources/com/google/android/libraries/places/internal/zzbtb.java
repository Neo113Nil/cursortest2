package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtb implements com.google.android.libraries.places.internal.zzbkv {
    @Override // com.google.android.libraries.places.internal.zzbmf
    public final /* synthetic */ byte[] zza(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzbmf
    public final /* synthetic */ java.lang.Object zzb(byte[] bArr) {
        if (bArr.length >= 3) {
            return java.lang.Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        throw new java.lang.NumberFormatException("Malformed status code ".concat(new java.lang.String(bArr, com.google.android.libraries.places.internal.zzbkw.zza)));
    }

    zzbtb() {
    }
}
