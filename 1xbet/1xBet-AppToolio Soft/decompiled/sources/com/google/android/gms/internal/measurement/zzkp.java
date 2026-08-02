package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkp extends zzacd<zzkp> {
    private static volatile zzkp[] zzaus;
    public Integer zzate = null;
    public zzkv zzaut = null;
    public zzkv zzauu = null;
    public Boolean zzauv = null;

    public zzkp() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkp[] zzlw() {
        if (zzaus == null) {
            synchronized (zzach.zzbzn) {
                if (zzaus == null) {
                    zzaus = new zzkp[0];
                }
            }
        }
        return zzaus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkp)) {
            return false;
        }
        zzkp zzkpVar = (zzkp) obj;
        Integer num = this.zzate;
        if (num == null) {
            if (zzkpVar.zzate != null) {
                return false;
            }
        } else if (!num.equals(zzkpVar.zzate)) {
            return false;
        }
        zzkv zzkvVar = this.zzaut;
        if (zzkvVar == null) {
            if (zzkpVar.zzaut != null) {
                return false;
            }
        } else if (!zzkvVar.equals(zzkpVar.zzaut)) {
            return false;
        }
        zzkv zzkvVar2 = this.zzauu;
        if (zzkvVar2 == null) {
            if (zzkpVar.zzauu != null) {
                return false;
            }
        } else if (!zzkvVar2.equals(zzkpVar.zzauu)) {
            return false;
        }
        Boolean bool = this.zzauv;
        if (bool == null) {
            if (zzkpVar.zzauv != null) {
                return false;
            }
        } else if (!bool.equals(zzkpVar.zzauv)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkpVar.zzbzd == null || zzkpVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkpVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzate;
        int i = 0;
        int hashCode2 = hashCode + (num == null ? 0 : num.hashCode());
        zzkv zzkvVar = this.zzaut;
        int hashCode3 = (hashCode2 * 31) + (zzkvVar == null ? 0 : zzkvVar.hashCode());
        zzkv zzkvVar2 = this.zzauu;
        int hashCode4 = ((hashCode3 * 31) + (zzkvVar2 == null ? 0 : zzkvVar2.hashCode())) * 31;
        Boolean bool = this.zzauv;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Integer num = this.zzate;
        if (num != null) {
            zza += zzacb.zzf(1, num.intValue());
        }
        zzkv zzkvVar = this.zzaut;
        if (zzkvVar != null) {
            zza += zzacb.zzb(2, zzkvVar);
        }
        zzkv zzkvVar2 = this.zzauu;
        if (zzkvVar2 != null) {
            zza += zzacb.zzb(3, zzkvVar2);
        }
        Boolean bool = this.zzauv;
        if (bool == null) {
            return zza;
        }
        bool.booleanValue();
        return zza + zzacb.zzaq(4) + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Integer num = this.zzate;
        if (num != null) {
            zzacbVar.zze(1, num.intValue());
        }
        zzkv zzkvVar = this.zzaut;
        if (zzkvVar != null) {
            zzacbVar.zza(2, zzkvVar);
        }
        zzkv zzkvVar2 = this.zzauu;
        if (zzkvVar2 != null) {
            zzacbVar.zza(3, zzkvVar2);
        }
        Boolean bool = this.zzauv;
        if (bool != null) {
            zzacbVar.zza(4, bool.booleanValue());
        }
        super.zza(zzacbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final /* synthetic */ zzacj zzb(zzaca zzacaVar) throws IOException {
        zzkv zzkvVar;
        while (true) {
            int zzvl = zzacaVar.zzvl();
            if (zzvl == 0) {
                return this;
            }
            if (zzvl != 8) {
                if (zzvl == 18) {
                    if (this.zzaut == null) {
                        this.zzaut = new zzkv();
                    }
                    zzkvVar = this.zzaut;
                } else if (zzvl == 26) {
                    if (this.zzauu == null) {
                        this.zzauu = new zzkv();
                    }
                    zzkvVar = this.zzauu;
                } else if (zzvl == 32) {
                    this.zzauv = Boolean.valueOf(zzacaVar.zzvm());
                } else if (!super.zza(zzacaVar, zzvl)) {
                    return this;
                }
                zzacaVar.zza(zzkvVar);
            } else {
                this.zzate = Integer.valueOf(zzacaVar.zzvn());
            }
        }
    }
}
