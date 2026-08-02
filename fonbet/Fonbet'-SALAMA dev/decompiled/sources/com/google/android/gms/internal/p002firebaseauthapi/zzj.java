package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
final class zzj extends zzk {
    private final char zza;

    public zzj(char c3) {
        this.zza = c3;
    }

    public final String toString() {
        char c3 = this.zza;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c3 & 15);
            c3 = (char) (c3 >> 4);
        }
        return AbstractC0486a1.h("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzh
    public final boolean zza(char c3) {
        return c3 == this.zza;
    }
}
