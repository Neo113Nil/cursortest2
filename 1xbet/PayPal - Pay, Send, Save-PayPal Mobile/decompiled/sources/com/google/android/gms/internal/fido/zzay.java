package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzay {
    private final java.lang.String zza;
    private final java.util.Set zzb;
    private final boolean zzc;

    public zzay(java.lang.String str) {
        this("com.google.android.gms.fido", com.google.android.gms.internal.fido.zzcf.zzk(), false, false, false, false, false);
    }

    public final com.google.android.gms.internal.fido.zzaq zzb(java.lang.String str, java.lang.String str2) {
        final java.lang.Class<java.lang.String> cls = java.lang.String.class;
        return new com.google.android.gms.internal.fido.zzaq(this.zza, str, str2, new com.google.android.gms.internal.fido.zzak(false, false, false, this.zzc, false, this.zzb, new com.google.android.gms.internal.fido.zzax() { // from class: com.google.android.gms.internal.fido.zzat
        }, new com.google.android.gms.internal.fido.zzax(cls) { // from class: com.google.android.gms.internal.fido.zzau
        }), true);
    }

    public final com.google.android.gms.internal.fido.zzaq zza(java.lang.String str, long j) {
        final java.lang.Class<java.lang.Long> cls = java.lang.Long.class;
        return new com.google.android.gms.internal.fido.zzaq(this.zza, str, java.lang.Long.valueOf(j), new com.google.android.gms.internal.fido.zzak(false, false, false, this.zzc, false, this.zzb, new com.google.android.gms.internal.fido.zzax() { // from class: com.google.android.gms.internal.fido.zzav
        }, new com.google.android.gms.internal.fido.zzax(cls) { // from class: com.google.android.gms.internal.fido.zzaw
        }), true);
    }

    public final com.google.android.gms.internal.fido.zzaq zzc(java.lang.String str, boolean z) {
        final java.lang.Class<java.lang.Boolean> cls = java.lang.Boolean.class;
        return new com.google.android.gms.internal.fido.zzaq(this.zza, str, java.lang.Boolean.valueOf(z), new com.google.android.gms.internal.fido.zzak(false, false, false, this.zzc, false, this.zzb, new com.google.android.gms.internal.fido.zzax() { // from class: com.google.android.gms.internal.fido.zzar
        }, new com.google.android.gms.internal.fido.zzax(cls) { // from class: com.google.android.gms.internal.fido.zzas
        }), true);
    }

    public final com.google.android.gms.internal.fido.zzay zze(java.util.Set set) {
        return new com.google.android.gms.internal.fido.zzay(this.zza, set, false, false, false, this.zzc, false);
    }

    public final com.google.android.gms.internal.fido.zzay zzd() {
        return new com.google.android.gms.internal.fido.zzay(this.zza, this.zzb, false, false, false, true, false);
    }

    private zzay(java.lang.String str, java.util.Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.zza = "com.google.android.gms.fido";
        this.zzb = set;
        this.zzc = z4;
    }
}
