package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzapp extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzapp zze;
    private static volatile com.google.android.libraries.places.internal.zzbff zzf;
    private com.google.android.libraries.places.internal.zzbea zzb = com.google.android.libraries.places.internal.zzbdq.zzbG();

    static {
        com.google.android.libraries.places.internal.zzapp zzappVar = new com.google.android.libraries.places.internal.zzapp();
        zze = zzappVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzapp.class, zzappVar);
    }

    private zzapp() {
    }

    public static com.google.android.libraries.places.internal.zzapo zza() {
        return (com.google.android.libraries.places.internal.zzapo) zze.zzbv();
    }

    final /* synthetic */ void zzc(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzb;
        if (!zzbeaVar.zza()) {
            this.zzb = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzapp();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzapo(bArr);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzf;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzapp.class) {
            zzbffVar = zzf;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zze);
                zzf = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
