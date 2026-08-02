package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzko extends zzacd<zzko> {
    private static volatile zzko[] zzaur;
    public String zzny = null;
    public String value = null;

    public zzko() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzko[] zzlv() {
        if (zzaur == null) {
            synchronized (zzach.zzbzn) {
                if (zzaur == null) {
                    zzaur = new zzko[0];
                }
            }
        }
        return zzaur;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzko)) {
            return false;
        }
        zzko zzkoVar = (zzko) obj;
        String str = this.zzny;
        if (str == null) {
            if (zzkoVar.zzny != null) {
                return false;
            }
        } else if (!str.equals(zzkoVar.zzny)) {
            return false;
        }
        String str2 = this.value;
        if (str2 == null) {
            if (zzkoVar.value != null) {
                return false;
            }
        } else if (!str2.equals(zzkoVar.value)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkoVar.zzbzd == null || zzkoVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkoVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.zzny;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        String str = this.zzny;
        if (str != null) {
            zza += zzacb.zzc(1, str);
        }
        String str2 = this.value;
        return str2 != null ? zza + zzacb.zzc(2, str2) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        String str = this.zzny;
        if (str != null) {
            zzacbVar.zzb(1, str);
        }
        String str2 = this.value;
        if (str2 != null) {
            zzacbVar.zzb(2, str2);
        }
        super.zza(zzacbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final /* synthetic */ zzacj zzb(zzaca zzacaVar) throws IOException {
        while (true) {
            int zzvl = zzacaVar.zzvl();
            if (zzvl == 0) {
                return this;
            }
            if (zzvl == 10) {
                this.zzny = zzacaVar.readString();
            } else if (zzvl == 18) {
                this.value = zzacaVar.readString();
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
