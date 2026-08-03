package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaqo extends com.google.android.gms.internal.ads.zzafk {
    public zzaqo(com.google.android.gms.internal.ads.zzfi zzfiVar, long j, long j2) {
        super(new com.google.android.gms.internal.ads.zzaff(), new com.google.android.gms.internal.ads.zzaqn(zzfiVar, null), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    static /* synthetic */ int zzh(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
