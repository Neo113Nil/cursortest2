package com.google.android.gms.internal.play_billing;

import android.support.v4.media.b;

/* loaded from: classes4.dex */
final class zzbw {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(b.b("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
