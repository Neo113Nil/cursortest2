package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzbr implements com.google.android.gms.internal.fido.zzbp {
    private static final com.google.android.gms.internal.fido.zzbp zza = new com.google.android.gms.internal.fido.zzbp() { // from class: com.google.android.gms.internal.fido.zzbq
        @Override // com.google.android.gms.internal.fido.zzbp
        public final java.lang.Object zza() {
            throw null;
        }
    };
    private volatile com.google.android.gms.internal.fido.zzbp zzb;

    public final java.lang.String toString() {
        java.lang.Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned null>";
        }
        return "Suppliers.memoize(" + java.lang.String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final java.lang.Object zza() {
        throw null;
    }

    zzbr(com.google.android.gms.internal.fido.zzbp zzbpVar) {
        this.zzb = zzbpVar;
    }
}
