package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzjw {
    private static final java.lang.Class<?> zzok = zzce();

    private static java.lang.Class<?> zzce() {
        try {
            return java.lang.Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static com.google.android.gms.internal.drive.zzjx zzcf() {
        if (zzok != null) {
            try {
                return zzn("getEmptyRegistry");
            } catch (java.lang.Exception unused) {
            }
        }
        return com.google.android.gms.internal.drive.zzjx.zzoo;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.gms.internal.drive.zzjx zzcg() {
        com.google.android.gms.internal.drive.zzjx zzn;
        if (zzok != null) {
            try {
                zzn = zzn("loadGeneratedRegistry");
            } catch (java.lang.Exception unused) {
            }
            if (zzn == null) {
                zzn = com.google.android.gms.internal.drive.zzjx.zzcg();
            }
            return zzn != null ? zzcf() : zzn;
        }
        zzn = null;
        if (zzn == null) {
        }
        if (zzn != null) {
        }
    }

    private static final com.google.android.gms.internal.drive.zzjx zzn(java.lang.String str) throws java.lang.Exception {
        return (com.google.android.gms.internal.drive.zzjx) zzok.getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
    }
}
