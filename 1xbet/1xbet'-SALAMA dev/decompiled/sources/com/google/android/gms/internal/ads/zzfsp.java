package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
final class zzfsp extends zzfso {
    private final char zza;

    public zzfsp(char c3) {
        this.zza = c3;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i7 = this.zza;
        for (int i8 = 0; i8 < 4; i8++) {
            cArr[5 - i8] = "0123456789ABCDEF".charAt(i7 & 15);
            i7 >>= 4;
        }
        return AbstractC0486a1.h("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.ads.zzfss
    public final boolean zzb(char c3) {
        return c3 == this.zza;
    }
}
