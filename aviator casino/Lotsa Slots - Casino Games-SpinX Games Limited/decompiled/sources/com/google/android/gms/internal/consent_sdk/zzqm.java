package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public abstract class zzqm<MessageType extends com.google.android.gms.internal.consent_sdk.zzqm<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.consent_sdk.zzqj<MessageType, BuilderType>> extends com.google.android.gms.internal.consent_sdk.zzpa<MessageType, BuilderType> {
    private static final java.util.Map zzb = new java.util.concurrent.ConcurrentHashMap();
    private int zzd = -1;
    protected com.google.android.gms.internal.consent_sdk.zzsq zzc = com.google.android.gms.internal.consent_sdk.zzsq.zzc();

    private final int zza(com.google.android.gms.internal.consent_sdk.zzsa zzsaVar) {
        return com.google.android.gms.internal.consent_sdk.zzrx.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzc(com.google.android.gms.internal.consent_sdk.zzqm zzqmVar, boolean z) {
        byte byteValue = ((java.lang.Byte) zzqmVar.zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzh = com.google.android.gms.internal.consent_sdk.zzrx.zza().zzb(zzqmVar.getClass()).zzh(zzqmVar);
        if (z) {
            zzqmVar.zzb(2, true != zzh ? null : zzqmVar, null);
        }
        return zzh;
    }

    static com.google.android.gms.internal.consent_sdk.zzqm zzq(java.lang.Class cls) {
        java.util.Map map = zzb;
        com.google.android.gms.internal.consent_sdk.zzqm zzqmVar = (com.google.android.gms.internal.consent_sdk.zzqm) map.get(cls);
        if (zzqmVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzqmVar = (com.google.android.gms.internal.consent_sdk.zzqm) map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzqmVar == null) {
            zzqmVar = (com.google.android.gms.internal.consent_sdk.zzqm) ((com.google.android.gms.internal.consent_sdk.zzqm) com.google.android.gms.internal.consent_sdk.zzsw.zze(cls)).zzb(6, null, null);
            if (zzqmVar == null) {
                throw new java.lang.IllegalStateException();
            }
            map.put(cls, zzqmVar);
        }
        return zzqmVar;
    }

    protected static com.google.android.gms.internal.consent_sdk.zzqq zzs() {
        return com.google.android.gms.internal.consent_sdk.zzqn.zzf();
    }

    protected static com.google.android.gms.internal.consent_sdk.zzqr zzt() {
        return com.google.android.gms.internal.consent_sdk.zzry.zze();
    }

    static java.lang.Object zzv(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    protected static java.lang.Object zzw(com.google.android.gms.internal.consent_sdk.zzrq zzrqVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.consent_sdk.zzrz(zzrqVar, str, objArr);
    }

    protected static void zzz(java.lang.Class cls, com.google.android.gms.internal.consent_sdk.zzqm zzqmVar) {
        zzqmVar.zzy();
        zzb.put(cls, zzqmVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.consent_sdk.zzrx.zza().zzb(getClass()).zzg(this, (com.google.android.gms.internal.consent_sdk.zzqm) obj);
    }

    public final int hashCode() {
        if (zzD()) {
            return zzm();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzm = zzm();
        this.zza = zzm;
        return zzm;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.consent_sdk.zzrs.zza(this, super.toString());
    }

    final void zzA(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final void zzB(com.google.android.gms.internal.consent_sdk.zzpv zzpvVar) throws java.io.IOException {
        com.google.android.gms.internal.consent_sdk.zzrx.zza().zzb(getClass()).zzf(this, com.google.android.gms.internal.consent_sdk.zzpw.zza(zzpvVar));
    }

    final boolean zzD() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.gms.internal.consent_sdk.zzpa
    final int zzj(com.google.android.gms.internal.consent_sdk.zzsa zzsaVar) {
        if (zzD()) {
            int zza = zzsaVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzsaVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzrq zzl() {
        return (com.google.android.gms.internal.consent_sdk.zzqm) zzb(6, null, null);
    }

    final int zzm() {
        return com.google.android.gms.internal.consent_sdk.zzrx.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        return zzc(this, true);
    }

    protected final com.google.android.gms.internal.consent_sdk.zzqj zzp() {
        return (com.google.android.gms.internal.consent_sdk.zzqj) zzb(5, null, null);
    }

    final com.google.android.gms.internal.consent_sdk.zzqm zzr() {
        return (com.google.android.gms.internal.consent_sdk.zzqm) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzrp zzu() {
        return (com.google.android.gms.internal.consent_sdk.zzqj) zzb(5, null, null);
    }

    protected final void zzx() {
        com.google.android.gms.internal.consent_sdk.zzrx.zza().zzb(getClass()).zzd(this);
        zzy();
    }

    final void zzy() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final int zzn() {
        int i;
        if (zzD()) {
            i = zza(null);
            if (i < 0) {
                throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zza(null);
                if (i < 0) {
                    throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }
}
