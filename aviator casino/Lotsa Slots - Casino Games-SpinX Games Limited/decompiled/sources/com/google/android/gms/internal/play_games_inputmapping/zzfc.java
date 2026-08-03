package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzfc<MessageType extends com.google.android.gms.internal.play_games_inputmapping.zzfc<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_games_inputmapping.zzez<MessageType, BuilderType>> extends com.google.android.gms.internal.play_games_inputmapping.zzdy<MessageType, BuilderType> {
    private static final java.util.Map zzb = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.play_games_inputmapping.zzhe zzc = com.google.android.gms.internal.play_games_inputmapping.zzhe.zza();
    protected int zzd = -1;

    static com.google.android.gms.internal.play_games_inputmapping.zzfc zzn(java.lang.Class cls) {
        java.util.Map map = zzb;
        com.google.android.gms.internal.play_games_inputmapping.zzfc zzfcVar = (com.google.android.gms.internal.play_games_inputmapping.zzfc) map.get(cls);
        if (zzfcVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfcVar = (com.google.android.gms.internal.play_games_inputmapping.zzfc) map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfcVar == null) {
            zzfcVar = (com.google.android.gms.internal.play_games_inputmapping.zzfc) ((com.google.android.gms.internal.play_games_inputmapping.zzfc) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzc(cls)).zzf(6, null, null);
            if (zzfcVar == null) {
                throw new java.lang.IllegalStateException();
            }
            map.put(cls, zzfcVar);
        }
        return zzfcVar;
    }

    protected static void zzo(java.lang.Class cls, com.google.android.gms.internal.play_games_inputmapping.zzfc zzfcVar) {
        zzb.put(cls, zzfcVar);
    }

    protected static java.lang.Object zzp(com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzgo(zzgeVar, str, objArr);
    }

    static java.lang.Object zzq(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    protected static com.google.android.gms.internal.play_games_inputmapping.zzff zzr() {
        return com.google.android.gms.internal.play_games_inputmapping.zzfd.zzd();
    }

    protected static com.google.android.gms.internal.play_games_inputmapping.zzff zzs(com.google.android.gms.internal.play_games_inputmapping.zzff zzffVar) {
        int size = zzffVar.size();
        return zzffVar.zzh(size == 0 ? 10 : size + size);
    }

    protected static com.google.android.gms.internal.play_games_inputmapping.zzfh zzt() {
        return com.google.android.gms.internal.play_games_inputmapping.zzgn.zzd();
    }

    protected static com.google.android.gms.internal.play_games_inputmapping.zzfh zzu(com.google.android.gms.internal.play_games_inputmapping.zzfh zzfhVar) {
        int size = zzfhVar.size();
        return zzfhVar.zzh(size == 0 ? 10 : size + size);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return com.google.android.gms.internal.play_games_inputmapping.zzgm.zza().zzb(getClass()).zza(this, (com.google.android.gms.internal.play_games_inputmapping.zzfc) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = com.google.android.gms.internal.play_games_inputmapping.zzgm.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.play_games_inputmapping.zzgg.zza(this, super.toString());
    }

    protected abstract java.lang.Object zzf(int i, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdy
    final int zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdy
    final void zzi(int i) {
        this.zzd = i;
    }

    protected final com.google.android.gms.internal.play_games_inputmapping.zzez zzj() {
        return (com.google.android.gms.internal.play_games_inputmapping.zzez) zzf(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzge
    public final void zzk(com.google.android.gms.internal.play_games_inputmapping.zzep zzepVar) throws java.io.IOException {
        com.google.android.gms.internal.play_games_inputmapping.zzgm.zza().zzb(getClass()).zze(this, com.google.android.gms.internal.play_games_inputmapping.zzeq.zza(zzepVar));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzge
    public final int zzl() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zzd = com.google.android.gms.internal.play_games_inputmapping.zzgm.zza().zzb(getClass()).zzd(this);
        this.zzd = zzd;
        return zzd;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgf
    public final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzge zzm() {
        return (com.google.android.gms.internal.play_games_inputmapping.zzfc) zzf(6, null, null);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzge
    public final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzgd zzv() {
        com.google.android.gms.internal.play_games_inputmapping.zzez zzezVar = (com.google.android.gms.internal.play_games_inputmapping.zzez) zzf(5, null, null);
        zzezVar.zzk(this);
        return zzezVar;
    }
}
