package com.google.android.libraries.places.internal;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class zzbhn extends com.google.android.libraries.places.internal.zzbdn implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbhn zzf;
    private static volatile com.google.android.libraries.places.internal.zzbff zzg;
    private byte zze = 2;

    static {
        com.google.android.libraries.places.internal.zzbhn zzbhnVar = new com.google.android.libraries.places.internal.zzbhn();
        zzf = zzbhnVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbhn.class, zzbhnVar);
    }

    private zzbhn() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.zze);
        }
        byte[] bArr = null;
        if (i2 == 2) {
            return zzbA(zzf, "\u0003\u0000", null);
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbhn();
        }
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbhm(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            this.zze = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzg;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbhn.class) {
            zzbffVar = zzg;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzf);
                zzg = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public static com.google.android.libraries.places.internal.zzbhn zzc() {
        return zzf;
    }
}
