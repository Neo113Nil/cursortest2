package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzgwf implements zzgze {
    private final zzgwe zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgwf(zzgwe zzgweVar) {
        zzgxt.zzc(zzgweVar, "input");
        this.zza = zzgweVar;
        zzgweVar.zzd = this;
    }

    private final void zzO(Object obj, zzgzk zzgzkVar, zzgwq zzgwqVar) {
        int i7 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgzkVar.zzh(obj, this, zzgwqVar);
            if (this.zzb != this.zzc) {
                throw new zzgxv("Failed to parse the message.");
            }
            this.zzc = i7;
        } catch (Throwable th) {
            this.zzc = i7;
            throw th;
        }
    }

    private final void zzP(Object obj, zzgzk zzgzkVar, zzgwq zzgwqVar) throws zzgxv {
        zzgwe zzgweVar = this.zza;
        int iZzm = zzgweVar.zzm();
        if (zzgweVar.zzb >= zzgweVar.zzc) {
            throw new zzgxv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZzd = this.zza.zzd(iZzm);
        this.zza.zzb++;
        zzgzkVar.zzh(obj, this, zzgwqVar);
        this.zza.zzy(0);
        zzgwe zzgweVar2 = this.zza;
        zzgweVar2.zzb--;
        zzgweVar2.zzz(iZzd);
    }

    private final void zzQ(int i7) throws zzgxv {
        if (this.zza.zzc() != i7) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i7) throws zzgxu {
        if ((this.zzb & 7) != i7) {
            throw new zzgxu("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i7) throws zzgxv {
        if ((i7 & 3) != 0) {
            throw new zzgxv("Failed to parse the message.");
        }
    }

    private static final void zzT(int i7) throws zzgxv {
        if ((i7 & 7) != 0) {
            throw new zzgxv("Failed to parse the message.");
        }
    }

    public static zzgwf zzq(zzgwe zzgweVar) {
        zzgwf zzgwfVar = zzgweVar.zzd;
        return zzgwfVar != null ? zzgwfVar : new zzgwf(zzgweVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzA(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgygVar.zzg(this.zza.zzn());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzn());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzB(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgwx) {
            zzgwx zzgwxVar = (zzgwx) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgwxVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i7 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                zzgwxVar.zzh(this.zza.zzb());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i8 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    @Deprecated
    public final void zzC(List list, zzgzk zzgzkVar, zzgwq zzgwqVar) throws zzgxu {
        int iZzl;
        int i7 = this.zzb;
        if ((i7 & 7) != 3) {
            throw new zzgxu("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzgzkVar.zze();
            zzO(objZze, zzgzkVar, zzgwqVar);
            zzgzkVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == i7);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzD(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int iZzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgxhVar.zzi(this.zza.zzg());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxhVar.zzi(this.zza.zzg());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int iZzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzE(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int iZzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgygVar.zzg(this.zza.zzo());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzo());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int iZzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzF(List list, zzgzk zzgzkVar, zzgwq zzgwqVar) throws zzgxv {
        int iZzl;
        int i7 = this.zzb;
        if ((i7 & 7) != 2) {
            throw new zzgxu("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzgzkVar.zze();
            zzP(objZze, zzgzkVar, zzgwqVar);
            zzgzkVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == i7);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzG(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgxhVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i7 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxhVar.zzi(this.zza.zzj());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i8 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzH(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgygVar.zzg(this.zza.zzs());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzs());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzs()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzI(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int iZzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgxhVar.zzi(this.zza.zzk());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxhVar.zzi(this.zza.zzk());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int iZzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzJ(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int iZzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgygVar.zzg(this.zza.zzt());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzt());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int iZzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    public final void zzK(List list, boolean z4) throws zzgxu {
        int iZzl;
        int iZzl2;
        if ((this.zzb & 7) != 2) {
            throw new zzgxu("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzgyd) && !z4) {
            zzgyd zzgydVar = (zzgyd) list;
            do {
                zzp();
                zzgydVar.zzb();
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            do {
                list.add(z4 ? zzs() : zzr());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzL(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int iZzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgxhVar.zzi(this.zza.zzm());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxhVar.zzi(this.zza.zzm());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int iZzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzM(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int iZzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgygVar.zzg(this.zza.zzu());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzu());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int iZzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final boolean zzN() throws zzgxu {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final double zza() throws zzgxu {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final float zzb() throws zzgxu {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzc() {
        int iZzl = this.zzd;
        if (iZzl != 0) {
            this.zzb = iZzl;
            this.zzd = 0;
        } else {
            iZzl = this.zza.zzl();
            this.zzb = iZzl;
        }
        return (iZzl == 0 || iZzl == this.zzc) ? f.API_PRIORITY_OTHER : iZzl >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zze() throws zzgxu {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzf() throws zzgxu {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzg() throws zzgxu {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzh() throws zzgxu {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzi() throws zzgxu {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzj() throws zzgxu {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzk() throws zzgxu {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzl() throws zzgxu {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzm() throws zzgxu {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzn() throws zzgxu {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzo() throws zzgxu {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final zzgvy zzp() throws zzgxu {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final String zzr() throws zzgxu {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final String zzs() throws zzgxu {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzt(Object obj, zzgzk zzgzkVar, zzgwq zzgwqVar) throws zzgxu {
        zzR(3);
        zzO(obj, zzgzkVar, zzgwqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzu(Object obj, zzgzk zzgzkVar, zzgwq zzgwqVar) throws zzgxv {
        zzR(2);
        zzP(obj, zzgzkVar, zzgwqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzv(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgvo) {
            zzgvo zzgvoVar = (zzgvo) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int iZzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgvoVar.zzg(this.zza.zzB());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgvoVar.zzg(this.zza.zzB());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int iZzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Boolean.valueOf(this.zza.zzB()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzw(List list) throws zzgxu {
        int iZzl;
        if ((this.zzb & 7) != 2) {
            throw new zzgxu("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzA()) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == this.zzb);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzx(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgwn) {
            zzgwn zzgwnVar = (zzgwn) list;
            int i7 = this.zzb & 7;
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgwnVar.zzh(this.zza.zza());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgwnVar.zzh(this.zza.zza());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzy(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i7 = this.zzb & 7;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int iZzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgxhVar.zzi(this.zza.zze());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxhVar.zzi(this.zza.zze());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int iZzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzz(List list) throws zzgxv {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i7 = this.zzb & 7;
            if (i7 == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgxhVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i7 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxhVar.zzi(this.zza.zzf());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i8 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }
}
