package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbgt extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbgt zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private int zzh;

    static {
        com.google.android.libraries.places.internal.zzbgt zzbgtVar = new com.google.android.libraries.places.internal.zzbgt();
        zzi = zzbgtVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbgt.class, zzbgtVar);
    }

    private zzbgt() {
    }

    public static com.google.android.libraries.places.internal.zzbgr zzc() {
        return (com.google.android.libraries.places.internal.zzbgr) zzi.zzbv();
    }

    final /* synthetic */ void zzf(com.google.android.libraries.places.internal.zzbgs zzbgsVar) {
        this.zzb = zzbgsVar.zza();
    }

    final /* synthetic */ void zzg(java.lang.String str) {
        this.zze = str;
    }

    final /* synthetic */ void zzh(java.lang.String str) {
        this.zzg = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbgt();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbgr(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzj;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbgt.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzh = 2;
    }

    public static com.google.android.libraries.places.internal.zzbgt zze() {
        return zzi;
    }
}
