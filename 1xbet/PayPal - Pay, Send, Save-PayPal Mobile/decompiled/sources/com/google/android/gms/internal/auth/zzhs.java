package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzhs extends com.google.android.gms.internal.auth.zzev implements com.google.android.gms.internal.auth.zzfy {
    private static final com.google.android.gms.internal.auth.zzhs zzb;
    private com.google.android.gms.internal.auth.zzez zzd = com.google.android.gms.internal.auth.zzev.zzf();

    static {
        com.google.android.gms.internal.auth.zzhs zzhsVar = new com.google.android.gms.internal.auth.zzhs();
        zzb = zzhsVar;
        com.google.android.gms.internal.auth.zzev.zzk(com.google.android.gms.internal.auth.zzhs.class, zzhsVar);
    }

    private zzhs() {
    }

    public static com.google.android.gms.internal.auth.zzhs zzp(byte[] bArr) throws com.google.android.gms.internal.auth.zzfb {
        return (com.google.android.gms.internal.auth.zzhs) com.google.android.gms.internal.auth.zzev.zzd(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.auth.zzev
    protected final java.lang.Object zzn(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzh(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.auth.zzhs();
        }
        com.google.android.gms.internal.auth.zzhq zzhqVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.auth.zzhr(zzhqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final java.util.List zzq() {
        return this.zzd;
    }
}
