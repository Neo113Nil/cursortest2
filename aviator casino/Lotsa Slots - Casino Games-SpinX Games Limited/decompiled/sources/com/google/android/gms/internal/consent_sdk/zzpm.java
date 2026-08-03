package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public abstract class zzpm implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.gms.internal.consent_sdk.zzpm zzb = new com.google.android.gms.internal.consent_sdk.zzpk(com.google.android.gms.internal.consent_sdk.zzqs.zzb);
    private int zza = 0;

    static {
        int i = com.google.android.gms.internal.consent_sdk.zzpc.zza;
    }

    zzpm() {
    }

    static int zzi(int i, int i2, int i3) {
        if (((i3 - 47) | 47) >= 0) {
            return 47;
        }
        throw new java.lang.IndexOutOfBoundsException("End index: 47 >= " + i3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzpm)) {
            return false;
        }
        com.google.android.gms.internal.consent_sdk.zzpm zzpmVar = (com.google.android.gms.internal.consent_sdk.zzpm) obj;
        int zzd = zzd();
        if (zzd != zzpmVar.zzd()) {
            return false;
        }
        if (zzd == 0) {
            return true;
        }
        int i = this.zza;
        int i2 = zzpmVar.zza;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzh(zzpmVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzd = zzd();
            i = zze(zzd, 0, zzd);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.consent_sdk.zzpf(this);
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? com.google.android.gms.internal.consent_sdk.zzsk.zza(this) : com.google.android.gms.internal.consent_sdk.zzsk.zza(zzf(0, 47)).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract int zze(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.consent_sdk.zzpm zzf(int i, int i2);

    abstract void zzg(com.google.android.gms.internal.consent_sdk.zzpe zzpeVar) throws java.io.IOException;

    protected abstract boolean zzh(com.google.android.gms.internal.consent_sdk.zzpm zzpmVar);
}
