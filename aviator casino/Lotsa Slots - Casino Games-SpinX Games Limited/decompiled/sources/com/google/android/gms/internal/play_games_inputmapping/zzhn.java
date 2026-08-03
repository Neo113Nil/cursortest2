package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzhn {
    static final long zza;
    static final boolean zzb;
    private static final sun.misc.Unsafe zzc;
    private static final java.lang.Class zzd;
    private static final boolean zze;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzhm zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    static {
        boolean z;
        com.google.android.gms.internal.play_games_inputmapping.zzhm zzhmVar;
        boolean z2;
        java.lang.reflect.Field zzB;
        com.google.android.gms.internal.play_games_inputmapping.zzhm zzhmVar2;
        sun.misc.Unsafe zzq = zzq();
        zzc = zzq;
        zzd = com.google.android.gms.internal.play_games_inputmapping.zzea.zza();
        boolean zzr = zzr(java.lang.Long.TYPE);
        zze = zzr;
        boolean zzr2 = zzr(java.lang.Integer.TYPE);
        com.google.android.gms.internal.play_games_inputmapping.zzhm zzhmVar3 = null;
        if (zzq != null) {
            if (zzr) {
                zzhmVar3 = new com.google.android.gms.internal.play_games_inputmapping.zzhl(zzq);
            } else if (zzr2) {
                zzhmVar3 = new com.google.android.gms.internal.play_games_inputmapping.zzhk(zzq);
            }
        }
        zzf = zzhmVar3;
        if (zzhmVar3 != null) {
            try {
                java.lang.Class<?> cls = zzhmVar3.zza.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            } catch (java.lang.Throwable th) {
                zzy(th);
            }
            if (zzB() != null) {
                z = true;
                zzg = z;
                zzhmVar = zzf;
                if (zzhmVar != null) {
                    try {
                        java.lang.Class<?> cls2 = zzhmVar.zza.getClass();
                        cls2.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                        cls2.getMethod("arrayBaseOffset", java.lang.Class.class);
                        cls2.getMethod("arrayIndexScale", java.lang.Class.class);
                        cls2.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
                        cls2.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        cls2.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                        cls2.getMethod("putLong", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
                        cls2.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
                        cls2.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
                        z2 = true;
                    } catch (java.lang.Throwable th2) {
                        zzy(th2);
                    }
                    zzh = z2;
                    zza = zzz(byte[].class);
                    zzz(boolean[].class);
                    zzA(boolean[].class);
                    zzz(int[].class);
                    zzA(int[].class);
                    zzz(long[].class);
                    zzA(long[].class);
                    zzz(float[].class);
                    zzA(float[].class);
                    zzz(double[].class);
                    zzA(double[].class);
                    zzz(java.lang.Object[].class);
                    zzA(java.lang.Object[].class);
                    zzB = zzB();
                    if (zzB != null && (zzhmVar2 = zzf) != null) {
                        zzhmVar2.zzh(zzB);
                    }
                    zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                zzh = z2;
                zza = zzz(byte[].class);
                zzz(boolean[].class);
                zzA(boolean[].class);
                zzz(int[].class);
                zzA(int[].class);
                zzz(long[].class);
                zzA(long[].class);
                zzz(float[].class);
                zzA(float[].class);
                zzz(double[].class);
                zzA(double[].class);
                zzz(java.lang.Object[].class);
                zzA(java.lang.Object[].class);
                zzB = zzB();
                if (zzB != null) {
                    zzhmVar2.zzh(zzB);
                }
                zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        zzg = z;
        zzhmVar = zzf;
        if (zzhmVar != null) {
        }
        z2 = false;
        zzh = z2;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(java.lang.Object[].class);
        zzA(java.lang.Object[].class);
        zzB = zzB();
        if (zzB != null) {
        }
        zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private zzhn() {
    }

    private static int zzA(java.lang.Class cls) {
        if (zzh) {
            return zzf.zzj(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field zzB() {
        int i = com.google.android.gms.internal.play_games_inputmapping.zzea.zza;
        java.lang.reflect.Field zzC = zzC(java.nio.Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        java.lang.reflect.Field zzC2 = zzC(java.nio.Buffer.class, com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (zzC2 == null || zzC2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static java.lang.reflect.Field zzC(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        com.google.android.gms.internal.play_games_inputmapping.zzhm zzhmVar = zzf;
        int zzk = zzhmVar.zzk(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzhmVar.zzl(obj, j2, ((255 & b) << i) | (zzk & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(java.lang.Object obj, long j, byte b) {
        long j2 = (-4) & j;
        com.google.android.gms.internal.play_games_inputmapping.zzhm zzhmVar = zzf;
        int i = (((int) j) & 3) << 3;
        zzhmVar.zzl(obj, j2, ((255 & b) << i) | (zzhmVar.zzk(obj, j2) & (~(255 << i))));
    }

    static boolean zza() {
        return zzh;
    }

    static boolean zzb() {
        return zzg;
    }

    static java.lang.Object zzc(java.lang.Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static int zzd(java.lang.Object obj, long j) {
        return zzf.zzk(obj, j);
    }

    static void zze(java.lang.Object obj, long j, int i) {
        zzf.zzl(obj, j, i);
    }

    static long zzf(java.lang.Object obj, long j) {
        return zzf.zzm(obj, j);
    }

    static void zzg(java.lang.Object obj, long j, long j2) {
        zzf.zzn(obj, j, j2);
    }

    static boolean zzh(java.lang.Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static void zzi(java.lang.Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static float zzj(java.lang.Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    static void zzk(java.lang.Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    static double zzl(java.lang.Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    static void zzm(java.lang.Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    static java.lang.Object zzn(java.lang.Object obj, long j) {
        return zzf.zzo(obj, j);
    }

    static void zzo(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzf.zzp(obj, j, obj2);
    }

    static void zzp(byte[] bArr, long j, byte b) {
        zzf.zza(bArr, zza + j, b);
    }

    static sun.misc.Unsafe zzq() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.play_games_inputmapping.zzhj());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzr(java.lang.Class cls) {
        int i = com.google.android.gms.internal.play_games_inputmapping.zzea.zza;
        try {
            java.lang.Class cls2 = zzd;
            cls2.getMethod("peekLong", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("peekInt", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ boolean zzu(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zzk(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzv(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zzk(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void zzy(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_games_inputmapping.zzhn.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzz(java.lang.Class cls) {
        if (zzh) {
            return zzf.zzi(cls);
        }
        return -1;
    }
}
