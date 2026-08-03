package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public abstract class zzcs<MessageType extends com.google.android.gms.internal.play_billing.zzcs<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_billing.zzcn<MessageType, BuilderType>> extends com.google.android.gms.internal.play_billing.zzay<MessageType, BuilderType> {
    private static final java.util.Map zzb = new java.util.concurrent.ConcurrentHashMap();
    private int zzd = -1;
    protected com.google.android.gms.internal.play_billing.zzfg zzc = com.google.android.gms.internal.play_billing.zzfg.zzc();

    static com.google.android.gms.internal.play_billing.zzcs zzj(java.lang.Class cls) {
        java.util.Map map = zzb;
        com.google.android.gms.internal.play_billing.zzcs zzcsVar = (com.google.android.gms.internal.play_billing.zzcs) map.get(cls);
        if (zzcsVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzcsVar = (com.google.android.gms.internal.play_billing.zzcs) map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzcsVar == null) {
            zzcsVar = (com.google.android.gms.internal.play_billing.zzcs) ((com.google.android.gms.internal.play_billing.zzcs) com.google.android.gms.internal.play_billing.zzfp.zze(cls)).zzx(6, null, null);
            if (zzcsVar == null) {
                throw new java.lang.IllegalStateException();
            }
            map.put(cls, zzcsVar);
        }
        return zzcsVar;
    }

    protected static com.google.android.gms.internal.play_billing.zzcs zzm(com.google.android.gms.internal.play_billing.zzcs zzcsVar, byte[] bArr, com.google.android.gms.internal.play_billing.zzcd zzcdVar) throws com.google.android.gms.internal.play_billing.zzdc {
        com.google.android.gms.internal.play_billing.zzcs zzz = zzz(zzcsVar, bArr, 0, bArr.length, zzcdVar);
        if (zzz == null || zzz.zzk()) {
            return zzz;
        }
        com.google.android.gms.internal.play_billing.zzdc zza = new com.google.android.gms.internal.play_billing.zzfe(zzz).zza();
        zza.zzf(zzz);
        throw zza;
    }

    protected static com.google.android.gms.internal.play_billing.zzcx zzn() {
        return com.google.android.gms.internal.play_billing.zzct.zzf();
    }

    protected static com.google.android.gms.internal.play_billing.zzcz zzo() {
        return com.google.android.gms.internal.play_billing.zzem.zze();
    }

    static java.lang.Object zzp(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    protected static java.lang.Object zzq(com.google.android.gms.internal.play_billing.zzec zzecVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.play_billing.zzen(zzecVar, str, objArr);
    }

    protected static void zzt(java.lang.Class cls, com.google.android.gms.internal.play_billing.zzcs zzcsVar) {
        zzcsVar.zzs();
        zzb.put(cls, zzcsVar);
    }

    protected static final boolean zzv(com.google.android.gms.internal.play_billing.zzcs zzcsVar, boolean z) {
        byte byteValue = ((java.lang.Byte) zzcsVar.zzx(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = com.google.android.gms.internal.play_billing.zzel.zza().zzb(zzcsVar.getClass()).zzk(zzcsVar);
        if (z) {
            zzcsVar.zzx(2, true != zzk ? null : zzcsVar, null);
        }
        return zzk;
    }

    private final int zzy(com.google.android.gms.internal.play_billing.zzeo zzeoVar) {
        return com.google.android.gms.internal.play_billing.zzel.zza().zzb(getClass()).zza(this);
    }

    private static com.google.android.gms.internal.play_billing.zzcs zzz(com.google.android.gms.internal.play_billing.zzcs zzcsVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.play_billing.zzcd zzcdVar) throws com.google.android.gms.internal.play_billing.zzdc {
        if (i2 == 0) {
            return zzcsVar;
        }
        com.google.android.gms.internal.play_billing.zzcs zzl = zzcsVar.zzl();
        try {
            com.google.android.gms.internal.play_billing.zzeo zzb2 = com.google.android.gms.internal.play_billing.zzel.zza().zzb(zzl.getClass());
            zzb2.zzh(zzl, bArr, 0, i2, new com.google.android.gms.internal.play_billing.zzbc(zzcdVar));
            zzb2.zzf(zzl);
            return zzl;
        } catch (com.google.android.gms.internal.play_billing.zzdc e) {
            e.zzf(zzl);
            throw e;
        } catch (com.google.android.gms.internal.play_billing.zzfe e2) {
            com.google.android.gms.internal.play_billing.zzdc zza = e2.zza();
            zza.zzf(zzl);
            throw zza;
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.android.gms.internal.play_billing.zzdc) {
                throw ((com.google.android.gms.internal.play_billing.zzdc) e3.getCause());
            }
            com.google.android.gms.internal.play_billing.zzdc zzdcVar = new com.google.android.gms.internal.play_billing.zzdc(e3);
            zzdcVar.zzf(zzl);
            throw zzdcVar;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.google.android.gms.internal.play_billing.zzdc zzg = com.google.android.gms.internal.play_billing.zzdc.zzg();
            zzg.zzf(zzl);
            throw zzg;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.play_billing.zzel.zza().zzb(getClass()).zzj(this, (com.google.android.gms.internal.play_billing.zzcs) obj);
    }

    public final int hashCode() {
        if (zzw()) {
            return zzd();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzd = zzd();
        this.zza = zzd;
        return zzd;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.play_billing.zzee.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final /* synthetic */ com.google.android.gms.internal.play_billing.zzeb zzE() {
        return (com.google.android.gms.internal.play_billing.zzcn) zzx(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final /* synthetic */ com.google.android.gms.internal.play_billing.zzeb zzF() {
        com.google.android.gms.internal.play_billing.zzcn zzcnVar = (com.google.android.gms.internal.play_billing.zzcn) zzx(5, null, null);
        zzcnVar.zzc(this);
        return zzcnVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzay
    final int zza(com.google.android.gms.internal.play_billing.zzeo zzeoVar) {
        if (zzw()) {
            int zza = zzeoVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzeoVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    final int zzd() {
        return com.google.android.gms.internal.play_billing.zzel.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final void zze(com.google.android.gms.internal.play_billing.zzby zzbyVar) throws java.io.IOException {
        com.google.android.gms.internal.play_billing.zzel.zza().zzb(getClass()).zzi(this, com.google.android.gms.internal.play_billing.zzbz.zza(zzbyVar));
    }

    protected final com.google.android.gms.internal.play_billing.zzcn zzg() {
        return (com.google.android.gms.internal.play_billing.zzcn) zzx(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final /* synthetic */ com.google.android.gms.internal.play_billing.zzec zzh() {
        return (com.google.android.gms.internal.play_billing.zzcs) zzx(6, null, null);
    }

    public final com.google.android.gms.internal.play_billing.zzcn zzi() {
        com.google.android.gms.internal.play_billing.zzcn zzcnVar = (com.google.android.gms.internal.play_billing.zzcn) zzx(5, null, null);
        zzcnVar.zzc(this);
        return zzcnVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final boolean zzk() {
        return zzv(this, java.lang.Boolean.TRUE.booleanValue());
    }

    final com.google.android.gms.internal.play_billing.zzcs zzl() {
        return (com.google.android.gms.internal.play_billing.zzcs) zzx(4, null, null);
    }

    protected final void zzr() {
        com.google.android.gms.internal.play_billing.zzel.zza().zzb(getClass()).zzf(this);
        zzs();
    }

    final void zzs() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzu(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean zzw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final int zzf() {
        int i;
        if (zzw()) {
            i = zzy(null);
            if (i < 0) {
                throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zzy(null);
                if (i < 0) {
                    throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }
}
