package com.google.android.gms.internal.fido;

import android.support.v4.media.b;

/* loaded from: classes4.dex */
final class zzbv {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(b.b("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
