package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzauz extends java.lang.Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzauz(com.google.android.gms.internal.ads.zzauy zzauyVar, com.google.android.gms.internal.ads.zzauw zzauwVar, long j) {
        super(java.lang.String.format(r4, com.google.android.gms.internal.ads.zzavo.zza("bk3t6gFTc30="), r2));
        int[] iArr = {2143124030, 85005376, 430547086, 878451808, 1894615585, -1294155075, 737454769, 1747844822, 1617876982};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        iArr[0] = 1434433518;
        iArr[1] = 1229726181;
        iArr[2] = 671269892;
        iArr[3] = 1096561121;
        iArr[4] = 546312716;
        iArr[5] = 1929952353;
        iArr[6] = 157272379;
        iArr[7] = 1830539036;
        iArr[8] = 1290127955;
        int i9 = (i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)) ^ (i8 % 1617876982);
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[i9];
        objArr[0] = java.lang.Long.valueOf(zzauyVar.zza());
        objArr[1] = java.lang.Long.valueOf(zzauwVar.zza());
        int i10 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        java.lang.Long valueOf = java.lang.Long.valueOf(j);
        objArr[i10] = valueOf;
        java.util.Optional.of(zzauwVar);
        java.util.Optional.of(valueOf);
    }

    public zzauz(com.google.android.gms.internal.ads.zzauy zzauyVar, java.lang.Throwable th) {
        super(java.lang.String.format(java.util.Locale.US, com.google.android.gms.internal.ads.zzavo.zza("bk0="), java.lang.Long.valueOf(zzauyVar.zza())), th);
        java.util.Optional.empty();
        java.util.Optional.empty();
    }
}
