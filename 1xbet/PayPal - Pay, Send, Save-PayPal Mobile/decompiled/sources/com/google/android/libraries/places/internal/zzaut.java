package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaut extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaut zzu;
    private static volatile com.google.android.libraries.places.internal.zzbff zzv;
    private int zzb;
    private int zze;
    private com.google.android.libraries.places.internal.zzaud zzf;
    private com.google.android.libraries.places.internal.zzaud zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private com.google.android.libraries.places.internal.zzaud zzn;
    private com.google.android.libraries.places.internal.zzauf zzo;
    private com.google.android.libraries.places.internal.zzauj zzp;
    private int zzq;
    private int zzr;
    private com.google.android.libraries.places.internal.zzauh zzs;
    private byte zzt = 2;
    private com.google.android.libraries.places.internal.zzbea zzh = zzbG();

    static {
        com.google.android.libraries.places.internal.zzaut zzautVar = new com.google.android.libraries.places.internal.zzaut();
        zzu = zzautVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaut.class, zzautVar);
    }

    private zzaut() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.zzt);
        }
        if (i2 == 2) {
            return zzbA(zzu, "\u0001\u000f\u0000\u0001\u0002\u0010\u000f\u0000\u0001\u0001\u0002ᔄ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006င\u0003\u0007င\u0004\bင\u0005\tင\u0006\nင\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eင\u000b\u000fင\f\u0010ဉ\r", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", com.google.android.libraries.places.internal.zzaur.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaut();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaus(bArr);
        }
        if (i2 == 5) {
            return zzu;
        }
        if (i2 != 6) {
            this.zzt = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzv;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaut.class) {
            zzbffVar = zzv;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzu);
                zzv = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
