package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbbc extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbbc zzf;
    private static volatile com.google.android.libraries.places.internal.zzbff zzg;
    private com.google.android.libraries.places.internal.zzbea zzb = zzbG();
    private java.lang.String zze = "";

    static {
        com.google.android.libraries.places.internal.zzbbc zzbbcVar = new com.google.android.libraries.places.internal.zzbbc();
        zzf = zzbbcVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbbc.class, zzbbcVar);
    }

    private zzbbc() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new java.lang.Object[]{"zzb", com.google.android.libraries.places.internal.zzbbb.class, "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbbc();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbaz(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzg;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbbc.class) {
            zzbffVar = zzg;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzf);
                zzg = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.lang.String zzc() {
        return this.zze;
    }

    public final java.util.List zza() {
        return this.zzb;
    }
}
