package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
enum zzfh {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    static /* synthetic */ com.google.android.gms.internal.fido.zzfh zza(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return STRING;
        }
        if (obj instanceof java.lang.Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof java.lang.Long) {
            return LONG;
        }
        if (obj instanceof java.lang.Double) {
            return DOUBLE;
        }
        throw new java.lang.AssertionError("invalid tag type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))));
    }
}
