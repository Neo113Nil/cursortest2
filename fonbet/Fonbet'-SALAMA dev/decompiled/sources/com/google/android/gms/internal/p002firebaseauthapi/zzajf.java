package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzajf implements zzals {
    private final zzajb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzajf(zzajb zzajbVar) {
        zzajb zzajbVar2 = (zzajb) zzakb.zza(zzajbVar, "input");
        this.zza = zzajbVar2;
        zzajbVar2.zzd = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzc() {
        int i7 = this.zzd;
        if (i7 != 0) {
            this.zzb = i7;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i8 = this.zzb;
        return (i8 == 0 || i8 == this.zzc) ? f.API_PRIORITY_OTHER : i8 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final zzaip zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final boolean zzs() {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final boolean zzt() {
        int i7;
        if (this.zza.zzt() || (i7 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzd(i7);
    }

    private final <T> void zzd(T t7, zzalv<T> zzalvVar, zzajk zzajkVar) {
        int zzj = this.zza.zzj();
        zzajb zzajbVar = this.zza;
        if (zzajbVar.zza >= zzajbVar.zzb) {
            throw zzakf.zzh();
        }
        int zza = zzajbVar.zza(zzj);
        this.zza.zza++;
        zzalvVar.zza(t7, this, zzajkVar);
        this.zza.zzb(0);
        r5.zza--;
        this.zza.zzc(zza);
    }

    public static zzajf zza(zzajb zzajbVar) {
        zzajf zzajfVar = zzajbVar.zzd;
        return zzajfVar != null ? zzajfVar : new zzajf(zzajbVar);
    }

    private final <T> T zzb(zzalv<T> zzalvVar, zzajk zzajkVar) {
        T zza = zzalvVar.zza();
        zzd(zza, zzalvVar, zzajkVar);
        zzalvVar.zzd(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzajzVar.zzc(this.zza.zze());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i7 == 5) {
                do {
                    zzajzVar.zzc(this.zza.zze());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Integer.valueOf(this.zza.zze()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i8 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 1) {
                do {
                    zzakrVar.zza(this.zza.zzk());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzakrVar.zza(this.zza.zzk());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajx) {
            zzajx zzajxVar = (zzajx) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzajxVar.zza(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i7 == 5) {
                do {
                    zzajxVar.zza(this.zza.zzb());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Float.valueOf(this.zza.zzb()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i8 == 5) {
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzajzVar.zzc(this.zza.zzf());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajzVar.zzc(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzakrVar.zza(this.zza.zzl());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakrVar.zza(this.zza.zzl());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzl()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzajzVar.zzc(this.zza.zzg());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i7 == 5) {
                do {
                    zzajzVar.zzc(this.zza.zzg());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i8 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 1) {
                do {
                    zzakrVar.zza(this.zza.zzn());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzakrVar.zza(this.zza.zzn());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzajzVar.zzc(this.zza.zzh());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajzVar.zzc(this.zza.zzh());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzakrVar.zza(this.zza.zzo());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakrVar.zza(this.zza.zzo());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzn(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzo(List<String> list) {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzajzVar.zzc(this.zza.zzj());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajzVar.zzc(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzakrVar.zza(this.zza.zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakrVar.zza(this.zza.zzp());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakf.zza();
    }

    private final Object zza(zzamw zzamwVar, Class<?> cls, zzajk zzajkVar) {
        switch (zzaje.zza[zzamwVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzalr.zza().zza((Class) cls), zzajkVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t7, zzalv<T> zzalvVar, zzajk zzajkVar) {
        int i7 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzalvVar.zza(t7, this, zzajkVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzakf.zzg();
            }
        } finally {
            this.zzc = i7;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <T> void zzb(T t7, zzalv<T> zzalvVar, zzajk zzajkVar) {
        zzb(2);
        zzd(t7, zzalvVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzb(List<zzaip> list) {
        int zzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzajzVar.zzc(this.zza.zzd());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajzVar.zzc(this.zza.zzd());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakf.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <T> void zzb(List<T> list, zzalv<T> zzalvVar, zzajk zzajkVar) {
        int zzi;
        int i7 = this.zzb;
        if ((i7 & 7) == 2) {
            do {
                list.add(zzb(zzalvVar, zzajkVar));
                if (this.zza.zzt() || this.zzd != 0) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == i7);
            this.zzd = zzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaji) {
            zzaji zzajiVar = (zzaji) list;
            int i7 = this.zzb & 7;
            if (i7 == 1) {
                do {
                    zzajiVar.zza(this.zza.zza());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzajiVar.zza(this.zza.zza());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzakf.zza();
    }

    private final void zzb(int i7) {
        if ((this.zzb & 7) != i7) {
            throw zzakf.zza();
        }
    }

    private final <T> T zza(zzalv<T> zzalvVar, zzajk zzajkVar) {
        T zza = zzalvVar.zza();
        zzc(zza, zzalvVar, zzajkVar);
        zzalvVar.zzd(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <T> void zza(T t7, zzalv<T> zzalvVar, zzajk zzajkVar) {
        zzb(3);
        zzc(t7, zzalvVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzain) {
            zzain zzainVar = (zzain) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzainVar.zza(this.zza.zzu());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i7 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzainVar.zza(this.zza.zzu());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i8 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakf.zza();
    }

    private static void zzd(int i7) {
        if ((i7 & 7) != 0) {
            throw zzakf.zzg();
        }
    }

    private static void zzc(int i7) {
        if ((i7 & 3) != 0) {
            throw zzakf.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    @Deprecated
    public final <T> void zza(List<T> list, zzalv<T> zzalvVar, zzajk zzajkVar) {
        int zzi;
        int i7 = this.zzb;
        if ((i7 & 7) == 3) {
            do {
                list.add(zza(zzalvVar, zzajkVar));
                if (this.zza.zzt() || this.zzd != 0) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == i7);
            this.zzd = zzi;
            return;
        }
        throw zzakf.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        r7.zza.zzc(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void zza(Map<K, V> map, zzakx<K, V> zzakxVar, zzajk zzajkVar) {
        zzb(2);
        int zza = this.zza.zza(this.zza.zzj());
        Object obj = zzakxVar.zzb;
        Object obj2 = zzakxVar.zzd;
        while (true) {
            try {
                int zzc = zzc();
                if (zzc == Integer.MAX_VALUE || this.zza.zzt()) {
                    break;
                }
                if (zzc == 1) {
                    obj = zza(zzakxVar.zza, (Class<?>) null, (zzajk) null);
                } else if (zzc != 2) {
                    try {
                        if (!zzt()) {
                            throw new zzakf("Unable to parse map entry.");
                        }
                    } catch (zzake unused) {
                        if (!zzt()) {
                            throw new zzakf("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = zza(zzakxVar.zzc, zzakxVar.zzd.getClass(), zzajkVar);
                }
            } catch (Throwable th) {
                this.zza.zzc(zza);
                throw th;
            }
        }
    }

    private final void zza(List<String> list, boolean z4) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzakn) && !z4) {
                zzakn zzaknVar = (zzakn) list;
                do {
                    zzaknVar.zza(zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            do {
                list.add(z4 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakf.zza();
    }

    private final void zza(int i7) {
        if (this.zza.zzc() != i7) {
            throw zzakf.zzj();
        }
    }
}
