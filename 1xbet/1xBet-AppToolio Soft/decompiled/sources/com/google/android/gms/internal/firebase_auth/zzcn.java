package com.google.android.gms.internal.firebase_auth;

/* loaded from: classes.dex */
final class zzcn {
    private static final Class<?> zzns = zzdg();

    private static final zzco zzao(String str) throws Exception {
        return (zzco) zzns.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    private static Class<?> zzdg() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzco zzdh() {
        if (zzns != null) {
            try {
                return zzao("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzco.zznw;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzco zzdi() {
        zzco zzao;
        if (zzns != null) {
            try {
                zzao = zzao("loadGeneratedRegistry");
            } catch (Exception unused) {
            }
            if (zzao == null) {
                zzao = zzco.zzdi();
            }
            return zzao != null ? zzdh() : zzao;
        }
        zzao = null;
        if (zzao == null) {
        }
        if (zzao != null) {
        }
    }
}
