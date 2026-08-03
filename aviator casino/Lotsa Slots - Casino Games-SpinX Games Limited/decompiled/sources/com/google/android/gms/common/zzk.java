package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zzk extends com.google.android.gms.common.zzj {
    private final byte[] zza;

    zzk(byte[] bArr) {
        super(java.util.Arrays.copyOfRange(bArr, 0, 25));
        this.zza = bArr;
    }

    @Override // com.google.android.gms.common.zzj
    final byte[] zzc() {
        return this.zza;
    }
}
