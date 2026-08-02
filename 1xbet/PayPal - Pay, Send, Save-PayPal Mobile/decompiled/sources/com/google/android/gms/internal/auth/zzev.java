package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public abstract class zzev<MessageType extends com.google.android.gms.internal.auth.zzev<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.auth.zzet<MessageType, BuilderType>> extends com.google.android.gms.internal.auth.zzdq<MessageType, BuilderType> {
    private static final java.util.Map zzb = new java.util.concurrent.ConcurrentHashMap();
    private int zzd = -1;
    protected com.google.android.gms.internal.auth.zzha zzc = com.google.android.gms.internal.auth.zzha.zza();

    static com.google.android.gms.internal.auth.zzev zzb(java.lang.Class cls) {
        java.util.Map map = zzb;
        com.google.android.gms.internal.auth.zzev zzevVar = (com.google.android.gms.internal.auth.zzev) map.get(cls);
        if (zzevVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzevVar = (com.google.android.gms.internal.auth.zzev) map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzevVar != null) {
            return zzevVar;
        }
        com.google.android.gms.internal.auth.zzev zzevVar2 = (com.google.android.gms.internal.auth.zzev) ((com.google.android.gms.internal.auth.zzev) com.google.android.gms.internal.auth.zzhj.zze(cls)).zzn(6, null, null);
        if (zzevVar2 == null) {
            throw new java.lang.IllegalStateException();
        }
        map.put(cls, zzevVar2);
        return zzevVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r2 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static com.google.android.gms.internal.auth.zzev zzd(com.google.android.gms.internal.auth.zzev zzevVar, byte[] bArr) throws com.google.android.gms.internal.auth.zzfb {
        com.google.android.gms.internal.auth.zzev zzo = zzo(zzevVar, bArr, 0, bArr.length, com.google.android.gms.internal.auth.zzel.zza);
        if (zzo != null) {
            boolean booleanValue = java.lang.Boolean.TRUE.booleanValue();
            byte byteValue = ((java.lang.Byte) zzo.zzn(1, null, null)).byteValue();
            if (byteValue != 1) {
                if (byteValue != 0) {
                    boolean zzi = com.google.android.gms.internal.auth.zzgf.zza().zzb(zzo.getClass()).zzi(zzo);
                    if (booleanValue) {
                        zzo.zzn(2, true != zzi ? null : zzo, null);
                    }
                }
                com.google.android.gms.internal.auth.zzfb zza = new com.google.android.gms.internal.auth.zzgy(zzo).zza();
                zza.zze(zzo);
                throw zza;
            }
        }
        return zzo;
    }

    protected static com.google.android.gms.internal.auth.zzez zzf() {
        return com.google.android.gms.internal.auth.zzgg.zze();
    }

    static java.lang.Object zzg(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static java.lang.Object zzh(com.google.android.gms.internal.auth.zzfx zzfxVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.auth.zzgh(zzfxVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void zzk(java.lang.Class cls, com.google.android.gms.internal.auth.zzev zzevVar) {
        zzevVar.zzj();
        zzb.put(cls, zzevVar);
    }

    private static com.google.android.gms.internal.auth.zzev zzo(com.google.android.gms.internal.auth.zzev zzevVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.auth.zzel zzelVar) throws com.google.android.gms.internal.auth.zzfb {
        com.google.android.gms.internal.auth.zzev zzc = zzevVar.zzc();
        try {
            com.google.android.gms.internal.auth.zzgi zzb2 = com.google.android.gms.internal.auth.zzgf.zza().zzb(zzc.getClass());
            zzb2.zzg(zzc, bArr, 0, i2, new com.google.android.gms.internal.auth.zzdt(zzelVar));
            zzb2.zze(zzc);
            return zzc;
        } catch (com.google.android.gms.internal.auth.zzfb e) {
            e.zze(zzc);
            throw e;
        } catch (com.google.android.gms.internal.auth.zzgy e2) {
            com.google.android.gms.internal.auth.zzfb zza = e2.zza();
            zza.zze(zzc);
            throw zza;
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.android.gms.internal.auth.zzfb) {
                throw ((com.google.android.gms.internal.auth.zzfb) e3.getCause());
            }
            com.google.android.gms.internal.auth.zzfb zzfbVar = new com.google.android.gms.internal.auth.zzfb(e3);
            zzfbVar.zze(zzc);
            throw zzfbVar;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.google.android.gms.internal.auth.zzfb zzf = com.google.android.gms.internal.auth.zzfb.zzf();
            zzf.zze(zzc);
            throw zzf;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.auth.zzgf.zza().zzb(getClass()).zzh(this, (com.google.android.gms.internal.auth.zzev) obj);
    }

    public final int hashCode() {
        if (zzm()) {
            return zza();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = zza();
        this.zza = zza;
        return zza;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.auth.zzfz.zza(this, super.toString());
    }

    final int zza() {
        return com.google.android.gms.internal.auth.zzgf.zza().zzb(getClass()).zza(this);
    }

    final com.google.android.gms.internal.auth.zzev zzc() {
        return (com.google.android.gms.internal.auth.zzev) zzn(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ com.google.android.gms.internal.auth.zzfx zze() {
        return (com.google.android.gms.internal.auth.zzev) zzn(6, null, null);
    }

    protected final void zzi() {
        com.google.android.gms.internal.auth.zzgf.zza().zzb(getClass()).zze(this);
        zzj();
    }

    protected abstract java.lang.Object zzn(int i, java.lang.Object obj, java.lang.Object obj2);

    final boolean zzm() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    final void zzl(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final void zzj() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
