package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
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
    public final double zza() throws zzake {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final float zzb() throws zzake {
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
    public final int zze() throws zzake {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzf() throws zzake {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzg() throws zzake {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzh() throws zzake {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzi() throws zzake {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzj() throws zzake {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzk() throws zzake {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzl() throws zzake {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzm() throws zzake {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzn() throws zzake {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzo() throws zzake {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final zzaip zzp() throws zzake {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final String zzq() throws zzake {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final String zzr() throws zzake {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final boolean zzs() throws zzake {
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

    private final <T> void zzd(T t7, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzakf {
        int iZzj = this.zza.zzj();
        zzajb zzajbVar = this.zza;
        if (zzajbVar.zza >= zzajbVar.zzb) {
            throw zzakf.zzh();
        }
        int iZza = zzajbVar.zza(iZzj);
        this.zza.zza++;
        zzalvVar.zza(t7, this, zzajkVar);
        this.zza.zzb(0);
        zzajb zzajbVar2 = this.zza;
        zzajbVar2.zza--;
        zzajbVar2.zzc(iZza);
    }

    public static zzajf zza(zzajb zzajbVar) {
        zzajf zzajfVar = zzajbVar.zzd;
        return zzajfVar != null ? zzajfVar : new zzajf(zzajbVar);
    }

    private final <T> T zzb(zzalv<T> zzalvVar, zzajk zzajkVar) throws zzakf {
        T tZza = zzalvVar.zza();
        zzd(tZza, zzalvVar, zzajkVar);
        zzalvVar.zzd(tZza);
        return tZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zze(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzajzVar.zzc(this.zza.zze());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i7 == 5) {
                do {
                    zzajzVar.zzc(this.zza.zze());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(this.zza.zze()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i8 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzf(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 1) {
                do {
                    zzakrVar.zza(this.zza.zzk());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzakrVar.zza(this.zza.zzk());
                } while (this.zza.zzc() < iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzg(List<Float> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzajx) {
            zzajx zzajxVar = (zzajx) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzajxVar.zza(this.zza.zzb());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i7 == 5) {
                do {
                    zzajxVar.zza(this.zza.zzb());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Float.valueOf(this.zza.zzb()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i8 == 5) {
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzh(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzajzVar.zzc(this.zza.zzf());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajzVar.zzc(this.zza.zzf());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzi(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzakrVar.zza(this.zza.zzl());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakrVar.zza(this.zza.zzl());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzj(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzajzVar.zzc(this.zza.zzg());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i7 == 5) {
                do {
                    zzajzVar.zzc(this.zza.zzg());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzakf.zza();
        }
        int i8 = this.zzb & 7;
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i8 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzk(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 1) {
                do {
                    zzakrVar.zza(this.zza.zzn());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzakrVar.zza(this.zza.zzn());
                } while (this.zza.zzc() < iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzl(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzajzVar.zzc(this.zza.zzh());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajzVar.zzc(this.zza.zzh());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzm(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzakrVar.zza(this.zza.zzo());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakrVar.zza(this.zza.zzo());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzn(List<String> list) throws zzake {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzo(List<String> list) throws zzake {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzp(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzajzVar.zzc(this.zza.zzj());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajzVar.zzc(this.zza.zzj());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzq(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzakrVar.zza(this.zza.zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakrVar.zza(this.zza.zzp());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    private final Object zza(zzamw zzamwVar, Class<?> cls, zzajk zzajkVar) throws zzake {
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
                this.zzc = i7;
                return;
            }
            throw zzakf.zzg();
        } catch (Throwable th) {
            this.zzc = i7;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <T> void zzb(T t7, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzakf {
        zzb(2);
        zzd(t7, zzalvVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzb(List<zzaip> list) throws zzake {
        int iZzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzd(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzajzVar.zzc(this.zza.zzd());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajzVar.zzc(this.zza.zzd());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <T> void zzb(List<T> list, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzake {
        int iZzi;
        int i7 = this.zzb;
        if ((i7 & 7) == 2) {
            do {
                list.add(zzb(zzalvVar, zzajkVar));
                if (this.zza.zzt() || this.zzd != 0) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == i7);
            this.zzd = iZzi;
            return;
        }
        throw zzakf.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzc(List<Double> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzaji) {
            zzaji zzajiVar = (zzaji) list;
            int i7 = this.zzb & 7;
            if (i7 == 1) {
                do {
                    zzajiVar.zza(this.zza.zza());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzajiVar.zza(this.zza.zza());
                } while (this.zza.zzc() < iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    private final void zzb(int i7) throws zzake {
        if ((this.zzb & 7) != i7) {
            throw zzakf.zza();
        }
    }

    private final <T> T zza(zzalv<T> zzalvVar, zzajk zzajkVar) {
        T tZza = zzalvVar.zza();
        zzc(tZza, zzalvVar, zzajkVar);
        zzalvVar.zzd(tZza);
        return tZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <T> void zza(T t7, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzake {
        zzb(3);
        zzc(t7, zzalvVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zza(List<Boolean> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (list instanceof zzain) {
            zzain zzainVar = (zzain) list;
            int i7 = this.zzb & 7;
            if (i7 == 0) {
                do {
                    zzainVar.zza(this.zza.zzu());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i7 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzainVar.zza(this.zza.zzu());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
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
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i8 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzakf.zza();
    }

    private static void zzd(int i7) throws zzakf {
        if ((i7 & 7) != 0) {
            throw zzakf.zzg();
        }
    }

    private static void zzc(int i7) throws zzakf {
        if ((i7 & 3) != 0) {
            throw zzakf.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    @Deprecated
    public final <T> void zza(List<T> list, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzake {
        int iZzi;
        int i7 = this.zzb;
        if ((i7 & 7) == 3) {
            do {
                list.add(zza(zzalvVar, zzajkVar));
                if (this.zza.zzt() || this.zzd != 0) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == i7);
            this.zzd = iZzi;
            return;
        }
        throw zzakf.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <K, V> void zza(Map<K, V> map, zzakx<K, V> zzakxVar, zzajk zzajkVar) throws zzake {
        zzb(2);
        int iZza = this.zza.zza(this.zza.zzj());
        Object objZza = zzakxVar.zzb;
        Object objZza2 = zzakxVar.zzd;
        while (true) {
            try {
                int iZzc = zzc();
                if (iZzc == Integer.MAX_VALUE || this.zza.zzt()) {
                    break;
                }
                if (iZzc == 1) {
                    objZza = zza(zzakxVar.zza, (Class<?>) null, (zzajk) null);
                } else if (iZzc != 2) {
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
                    objZza2 = zza(zzakxVar.zzc, zzakxVar.zzd.getClass(), zzajkVar);
                }
            } catch (Throwable th) {
                this.zza.zzc(iZza);
                throw th;
            }
        }
        map.put(objZza, objZza2);
        this.zza.zzc(iZza);
    }

    private final void zza(List<String> list, boolean z4) throws zzake {
        int iZzi;
        int iZzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzakn) && !z4) {
                zzakn zzaknVar = (zzakn) list;
                do {
                    zzaknVar.zza(zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            do {
                list.add(z4 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzakf.zza();
    }

    private final void zza(int i7) throws zzakf {
        if (this.zza.zzc() != i7) {
            throw zzakf.zzj();
        }
    }
}
