package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public class zztv {
    private final java.lang.String zza;
    private final java.lang.Class zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final long zze;

    protected zztv(java.lang.String str, java.lang.Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static com.google.android.libraries.places.internal.zztv zzc(java.lang.String str, java.lang.Class cls) {
        return new com.google.android.libraries.places.internal.zztv(str, cls, false, false);
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.zzb;
        java.lang.String name2 = getClass().getName();
        java.lang.String name3 = cls.getName();
        int length = java.lang.String.valueOf(name2).length();
        int length2 = java.lang.String.valueOf(name3).length();
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 1 + str.length() + 1 + length2 + 1);
        sb.append(name2);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(str);
        sb.append("[");
        sb.append(name3);
        sb.append("]");
        return sb.toString();
    }

    protected void zza(java.util.Iterator it, com.google.android.libraries.places.internal.zztu zztuVar) {
        while (it.hasNext()) {
            zzb(it.next(), zztuVar);
        }
    }

    protected void zzb(java.lang.Object obj, com.google.android.libraries.places.internal.zztu zztuVar) {
        zztuVar.zza(this.zza, obj);
    }

    public final java.lang.Object zze(java.lang.Object obj) {
        return this.zzb.cast(obj);
    }

    public final void zzg(java.lang.Object obj, com.google.android.libraries.places.internal.zztu zztuVar) {
        if (!this.zzd || com.google.android.libraries.places.internal.zzvn.zza() <= 20) {
            zzb(obj, zztuVar);
        } else {
            zztuVar.zza(this.zza, obj);
        }
    }

    public final void zzh(java.util.Iterator it, com.google.android.libraries.places.internal.zztu zztuVar) {
        com.google.android.libraries.places.internal.zzxb.zzc(this.zzc, "non repeating key");
        if (!this.zzd || com.google.android.libraries.places.internal.zzvn.zza() <= 20) {
            zza(it, zztuVar);
        } else {
            while (it.hasNext()) {
                zztuVar.zza(this.zza, it.next());
            }
        }
    }

    private zztv(java.lang.String str, java.lang.Class cls, boolean z, boolean z2) {
        com.google.android.libraries.places.internal.zzxb.zzd(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        this.zzd = z2;
        int identityHashCode = java.lang.System.identityHashCode(this);
        long j = 0;
        for (int i = 0; i < 5; i++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.zze = j;
    }

    public final long zzi() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final java.lang.String zzd() {
        return this.zza;
    }
}
