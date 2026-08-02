package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public class zzam<E> {
    public static int zza(int i7, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i8 <= i7) {
            return i7;
        }
        int i9 = i7 + (i7 >> 1) + 1;
        if (i9 < i8) {
            i9 = Integer.highestOneBit(i8 - 1) << 1;
        }
        return i9 < 0 ? f.API_PRIORITY_OTHER : i9;
    }
}
