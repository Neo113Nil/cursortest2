package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzzm {
    private static final Class<?> zzbts = zztq();

    private static final zzzn zzfo(String str) throws Exception {
        return (zzzn) zzbts.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    private static Class<?> zztq() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzzn zztr() {
        if (zzbts != null) {
            try {
                return zzfo("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzzn.zzbtv;
    }
}
