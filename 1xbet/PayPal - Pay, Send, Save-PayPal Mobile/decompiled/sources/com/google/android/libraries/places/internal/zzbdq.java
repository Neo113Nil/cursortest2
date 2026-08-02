package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbdq<MessageType extends com.google.android.libraries.places.internal.zzbdq<MessageType, BuilderType>, BuilderType extends com.google.android.libraries.places.internal.zzbdk<MessageType, BuilderType>> extends com.google.android.libraries.places.internal.zzbby<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final java.util.Map zze = new java.util.concurrent.ConcurrentHashMap();
    private int zzb = -1;
    protected com.google.android.libraries.places.internal.zzbfz zzc = com.google.android.libraries.places.internal.zzbfz.zza();

    protected static java.lang.Object zzbA(com.google.android.libraries.places.internal.zzbex zzbexVar, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.android.libraries.places.internal.zzbfj(zzbexVar, str, objArr);
    }

    public static com.google.android.libraries.places.internal.zzbdp zzbB(com.google.android.libraries.places.internal.zzbex zzbexVar, java.lang.Object obj, com.google.android.libraries.places.internal.zzbex zzbexVar2, com.google.android.libraries.places.internal.zzbdv zzbdvVar, int i, com.google.android.libraries.places.internal.zzbgj zzbgjVar, java.lang.Class cls) {
        return new com.google.android.libraries.places.internal.zzbdp(zzbexVar, obj, zzbexVar2, new com.google.android.libraries.places.internal.zzbdo(null, 525004180, zzbgjVar, false, false), cls);
    }

    static java.lang.Object zzbC(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    protected static com.google.android.libraries.places.internal.zzbdy zzbD() {
        return com.google.android.libraries.places.internal.zzbdr.zzd();
    }

    protected static com.google.android.libraries.places.internal.zzbdy zzbE(com.google.android.libraries.places.internal.zzbdy zzbdyVar) {
        int size = zzbdyVar.size();
        return zzbdyVar.zzg(size + size);
    }

    protected static com.google.android.libraries.places.internal.zzbdz zzbF() {
        return com.google.android.libraries.places.internal.zzbem.zzd();
    }

    protected static com.google.android.libraries.places.internal.zzbea zzbG() {
        return com.google.android.libraries.places.internal.zzbfi.zzd();
    }

    protected static com.google.android.libraries.places.internal.zzbea zzbH(com.google.android.libraries.places.internal.zzbea zzbeaVar) {
        int size = zzbeaVar.size();
        return zzbeaVar.zzg(size + size);
    }

    static com.google.android.libraries.places.internal.zzbdq zzby(java.lang.Class cls) {
        java.util.Map map = zze;
        com.google.android.libraries.places.internal.zzbdq zzbdqVar = (com.google.android.libraries.places.internal.zzbdq) map.get(cls);
        if (zzbdqVar == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                zzbdqVar = (com.google.android.libraries.places.internal.zzbdq) map.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzbdqVar != null) {
            return zzbdqVar;
        }
        com.google.android.libraries.places.internal.zzbdq zzbdqVar2 = (com.google.android.libraries.places.internal.zzbdq) ((com.google.android.libraries.places.internal.zzbdq) com.google.android.libraries.places.internal.zzbgf.zzc(cls)).zzb(6, null, null);
        if (zzbdqVar2 == null) {
            throw new java.lang.IllegalStateException();
        }
        map.put(cls, zzbdqVar2);
        return zzbdqVar2;
    }

    protected static void zzbz(java.lang.Class cls, com.google.android.libraries.places.internal.zzbdq zzbdqVar) {
        zzbdqVar.zzbq();
        zze.put(cls, zzbdqVar);
    }

    private final int zzc(com.google.android.libraries.places.internal.zzbfl zzbflVar) {
        return com.google.android.libraries.places.internal.zzbfh.zza().zzb(getClass()).zze(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zze(com.google.android.libraries.places.internal.zzbdq zzbdqVar, boolean z) {
        byte byteValue = ((java.lang.Byte) zzbdqVar.zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzi = com.google.android.libraries.places.internal.zzbfh.zza().zzb(zzbdqVar.getClass()).zzi(zzbdqVar);
        if (z) {
            zzbdqVar.zzb(2, true != zzi ? null : zzbdqVar, null);
        }
        return zzi;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.libraries.places.internal.zzbfh.zza().zzb(getClass()).zzb(this, (com.google.android.libraries.places.internal.zzbdq) obj);
    }

    public final int hashCode() {
        if (zzbp()) {
            return zzbt();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzbt = zzbt();
        this.zza = zzbt;
        return zzbt;
    }

    public final java.lang.String toString() {
        return com.google.android.libraries.places.internal.zzbez.zza(this, super.toString());
    }

    protected abstract java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2);

    @Override // com.google.android.libraries.places.internal.zzbex
    public final /* synthetic */ com.google.android.libraries.places.internal.zzbew zzbJ() {
        com.google.android.libraries.places.internal.zzbdk zzbdkVar = (com.google.android.libraries.places.internal.zzbdk) zzb(5, null, null);
        zzbdkVar.zzE(this);
        return zzbdkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbex
    public final /* synthetic */ com.google.android.libraries.places.internal.zzbew zzbK() {
        return (com.google.android.libraries.places.internal.zzbdk) zzb(5, null, null);
    }

    @Override // com.google.android.libraries.places.internal.zzbex
    public final void zzbL(com.google.android.libraries.places.internal.zzbcu zzbcuVar) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzbfh.zza().zzb(getClass()).zzf(this, com.google.android.libraries.places.internal.zzbcv.zza(zzbcuVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbey
    public final boolean zzbM() {
        return zze(this, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbey
    public final /* synthetic */ com.google.android.libraries.places.internal.zzbex zzbN() {
        return (com.google.android.libraries.places.internal.zzbdq) zzb(6, null, null);
    }

    @Override // com.google.android.libraries.places.internal.zzbby
    final int zzbn(com.google.android.libraries.places.internal.zzbfl zzbflVar) {
        if (zzbp()) {
            int zze2 = zzbflVar.zze(this);
            if (zze2 >= 0) {
                return zze2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zze2).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(zze2);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zze3 = zzbflVar.zze(this);
        if (zze3 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | zze3;
            return zze3;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zze3).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(zze3);
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzbex
    public final com.google.android.libraries.places.internal.zzbff zzbr() {
        return (com.google.android.libraries.places.internal.zzbff) zzb(7, null, null);
    }

    final com.google.android.libraries.places.internal.zzbdq zzbs() {
        return (com.google.android.libraries.places.internal.zzbdq) zzb(4, null, null);
    }

    final int zzbt() {
        return com.google.android.libraries.places.internal.zzbfh.zza().zzb(getClass()).zzc(this);
    }

    protected final void zzbu() {
        com.google.android.libraries.places.internal.zzbfh.zza().zzb(getClass()).zzh(this);
        zzbq();
    }

    protected final com.google.android.libraries.places.internal.zzbdk zzbv() {
        return (com.google.android.libraries.places.internal.zzbdk) zzb(5, null, null);
    }

    @Override // com.google.android.libraries.places.internal.zzbex
    public final int zzbx() {
        if (zzbp()) {
            int zzc = zzc(null);
            if (zzc >= 0) {
                return zzc;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(zzc);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zzc2 = zzc(null);
        if (zzc2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | zzc2;
            return zzc2;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzc2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(zzc2);
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    final void zzbw(int i) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final void zzbq() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final boolean zzbp() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }
}
