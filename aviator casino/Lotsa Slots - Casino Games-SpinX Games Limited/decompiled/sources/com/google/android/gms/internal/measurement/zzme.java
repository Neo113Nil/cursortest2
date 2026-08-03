package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzme<MessageType extends com.google.android.gms.internal.measurement.zzme<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzma<MessageType, BuilderType>> extends com.google.android.gms.internal.measurement.zzkr<MessageType, BuilderType> {
    private static final java.util.Map zzd = new java.util.concurrent.ConcurrentHashMap();
    private int zzb = -1;
    protected com.google.android.gms.internal.measurement.zzoi zzc = com.google.android.gms.internal.measurement.zzoi.zza();

    private final int zzc(com.google.android.gms.internal.measurement.zznw zznwVar) {
        return com.google.android.gms.internal.measurement.zznt.zza().zzb(getClass()).zze(this);
    }

    static com.google.android.gms.internal.measurement.zzme zzco(java.lang.Class cls) {
        java.util.Map map = zzd;
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) map.get(cls);
        if (zzmeVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzmeVar = (com.google.android.gms.internal.measurement.zzme) map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzmeVar == null) {
            zzmeVar = (com.google.android.gms.internal.measurement.zzme) ((com.google.android.gms.internal.measurement.zzme) com.google.android.gms.internal.measurement.zzoo.zzc(cls)).zzl(6, null, null);
            if (zzmeVar == null) {
                throw new java.lang.IllegalStateException();
            }
            map.put(cls, zzmeVar);
        }
        return zzmeVar;
    }

    protected static void zzcp(java.lang.Class cls, com.google.android.gms.internal.measurement.zzme zzmeVar) {
        zzmeVar.zzcg();
        zzd.put(cls, zzmeVar);
    }

    protected static java.lang.Object zzcq(com.google.android.gms.internal.measurement.zznl zznlVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.measurement.zznv(zznlVar, str, objArr);
    }

    static java.lang.Object zzcr(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    protected static com.google.android.gms.internal.measurement.zzml zzcs() {
        return com.google.android.gms.internal.measurement.zzmf.zzd();
    }

    protected static com.google.android.gms.internal.measurement.zzmm zzct() {
        return com.google.android.gms.internal.measurement.zzmz.zze();
    }

    protected static com.google.android.gms.internal.measurement.zzmm zzcu(com.google.android.gms.internal.measurement.zzmm zzmmVar) {
        int size = zzmmVar.size();
        return zzmmVar.zzg(size + size);
    }

    protected static com.google.android.gms.internal.measurement.zzmn zzcv() {
        return com.google.android.gms.internal.measurement.zznu.zzd();
    }

    protected static com.google.android.gms.internal.measurement.zzmn zzcw(com.google.android.gms.internal.measurement.zzmn zzmnVar) {
        int size = zzmnVar.size();
        return zzmnVar.zzg(size + size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(com.google.android.gms.internal.measurement.zzme zzmeVar, boolean z) {
        byte byteValue = ((java.lang.Byte) zzmeVar.zzl(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = com.google.android.gms.internal.measurement.zznt.zza().zzb(zzmeVar.getClass()).zzk(zzmeVar);
        if (z) {
            zzmeVar.zzl(2, true != zzk ? null : zzmeVar, null);
        }
        return zzk;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.measurement.zznt.zza().zzb(getClass()).zzb(this, (com.google.android.gms.internal.measurement.zzme) obj);
    }

    public final int hashCode() {
        if (zzcf()) {
            return zzci();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzci = zzci();
        this.zza = zzci;
        return zzci;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.measurement.zznn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzcB(com.google.android.gms.internal.measurement.zzll zzllVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zznt.zza().zzb(getClass()).zzf(this, com.google.android.gms.internal.measurement.zzlm.zza(zzllVar));
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final /* synthetic */ com.google.android.gms.internal.measurement.zznk zzcC() {
        return (com.google.android.gms.internal.measurement.zzma) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final boolean zzcD() {
        return zzd(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final /* synthetic */ com.google.android.gms.internal.measurement.zznl zzcE() {
        return (com.google.android.gms.internal.measurement.zzme) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    final int zzcd(com.google.android.gms.internal.measurement.zznw zznwVar) {
        if (zzcf()) {
            int zze = zznwVar.zze(this);
            if (zze >= 0) {
                return zze;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zze).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(zze);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zze2 = zznwVar.zze(this);
        if (zze2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | zze2;
            return zze2;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zze2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(zze2);
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    final boolean zzcf() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void zzcg() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final com.google.android.gms.internal.measurement.zzme zzch() {
        return (com.google.android.gms.internal.measurement.zzme) zzl(4, null, null);
    }

    final int zzci() {
        return com.google.android.gms.internal.measurement.zznt.zza().zzb(getClass()).zzc(this);
    }

    protected final void zzcj() {
        com.google.android.gms.internal.measurement.zznt.zza().zzb(getClass()).zzj(this);
        zzcg();
    }

    protected final com.google.android.gms.internal.measurement.zzma zzck() {
        return (com.google.android.gms.internal.measurement.zzma) zzl(5, null, null);
    }

    public final com.google.android.gms.internal.measurement.zzma zzcl() {
        com.google.android.gms.internal.measurement.zzma zzmaVar = (com.google.android.gms.internal.measurement.zzma) zzl(5, null, null);
        zzmaVar.zzbd(this);
        return zzmaVar;
    }

    final void zzcm(int i) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    protected abstract java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.gms.internal.measurement.zznl
    public final int zzcn() {
        int i;
        if (zzcf()) {
            i = zzc(null);
            if (i < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 42);
                sb.append("serialized size must be non-negative, was ");
                sb.append(i);
                throw new java.lang.IllegalStateException(sb.toString());
            }
        } else {
            i = this.zzb & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zzc(null);
                if (i < 0) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 42);
                    sb2.append("serialized size must be non-negative, was ");
                    sb2.append(i);
                    throw new java.lang.IllegalStateException(sb2.toString());
                }
                this.zzb = (this.zzb & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }
}
