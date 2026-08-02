package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public class zzdk {
    private final java.lang.String zza;
    private final java.lang.Class zzb;
    private final boolean zzc;

    protected zzdk(java.lang.String str, java.lang.Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static com.google.android.gms.internal.fido.zzdk zza(java.lang.String str, java.lang.Class cls) {
        return new com.google.android.gms.internal.fido.zzdk(str, cls, false, false);
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.zzb;
        return getClass().getName() + androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR + this.zza + "[" + cls.getName() + "]";
    }

    private zzdk(java.lang.String str, java.lang.Class cls, boolean z, boolean z2) {
        com.google.android.gms.internal.fido.zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        java.lang.System.identityHashCode(this);
        for (int i = 0; i < 5; i++) {
        }
    }

    public final boolean zzb() {
        return this.zzc;
    }
}
