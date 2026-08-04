package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzne extends zzch {
    private final zzpf zza;

    public zzne(zzpf zzpfVar) {
        this.zza = zzpfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzne)) {
            return false;
        }
        zzpf zzpfVar = ((zzne) obj).zza;
        return this.zza.zza().zzd().equals(zzpfVar.zza().zzd()) && this.zza.zza().zzf().equals(zzpfVar.zza().zzf()) && this.zza.zza().zze().equals(zzpfVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzc());
    }

    public final String toString() {
        String str;
        String strZzf = this.zza.zza().zzf();
        int i7 = zznh.zza[this.zza.zza().zzd().ordinal()];
        if (i7 == 1) {
            str = "TINK";
        } else if (i7 == 2) {
            str = "LEGACY";
        } else if (i7 != 3) {
            str = i7 != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return L.j("(typeUrl=", strZzf, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza.zza().zzd() != zzws.RAW;
    }

    public final zzpf zzb() {
        return this.zza;
    }
}
