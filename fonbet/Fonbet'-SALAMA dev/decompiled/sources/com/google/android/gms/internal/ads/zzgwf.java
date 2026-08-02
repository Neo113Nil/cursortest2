package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.List;

/* loaded from: classes.dex */
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
            if (this.zzb == this.zzc) {
            } else {
                throw new zzgxv("Failed to parse the message.");
            }
        } finally {
            this.zzc = i7;
        }
    }

    private final void zzP(Object obj, zzgzk zzgzkVar, zzgwq zzgwqVar) {
        zzgwe zzgweVar = this.zza;
        int zzm = zzgweVar.zzm();
        if (zzgweVar.zzb >= zzgweVar.zzc) {
            throw new zzgxv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int zzd = this.zza.zzd(zzm);
        this.zza.zzb++;
        zzgzkVar.zzh(obj, this, zzgwqVar);
        this.zza.zzy(0);
        r4.zzb--;
        this.zza.zzz(zzd);
    }

    private final void zzQ(int i7) {
        if (this.zza.zzc() != i7) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i7) {
        if ((this.zzb & 7) != i7) {
            throw new zzgxu("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i7) {
        if ((i7 & 3) != 0) {
            throw new zzgxv("Failed to parse the message.");
        }
    }

    private static final void zzT(int i7) {
        if ((i7 & 7) != 0) {
            throw new zzgxv("Failed to parse the message.");
        }
    }

    public static zzgwf zzq(zzgwe zzgweVar) {
        zzgwf zzgwfVar = zzgweVar.zzd;
        return zzgwfVar != null ? zzgwfVar : new zzgwf(zzgweVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzA(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc = zzm + this.zza.zzc();
                do {
                    zzgygVar.zzg(this.zza.zzn());
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzn());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc2 = zzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzB(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgwx) {
            zzgwx zzgwxVar = (zzgwx) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgwxVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i8 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                zzgwxVar.zzh(this.zza.zzb());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            if (i9 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    @Deprecated
    public final void zzC(List list, zzgzk zzgzkVar, zzgwq zzgwqVar) {
        int zzl;
        int i7 = this.zzb;
        if ((i7 & 7) != 3) {
            throw new zzgxu("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzgzkVar.zze();
            zzO(zze, zzgzkVar, zzgwqVar);
            zzgzkVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                zzl = this.zza.zzl();
            }
        } while (zzl == i7);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzD(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int zzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgxhVar.zzi(this.zza.zzg());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgxhVar.zzi(this.zza.zzg());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int zzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzE(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int zzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgygVar.zzg(this.zza.zzo());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzo());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int zzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzF(List list, zzgzk zzgzkVar, zzgwq zzgwqVar) {
        int zzl;
        int i7 = this.zzb;
        if ((i7 & 7) != 2) {
            throw new zzgxu("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzgzkVar.zze();
            zzP(zze, zzgzkVar, zzgwqVar);
            zzgzkVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                zzl = this.zza.zzl();
            }
        } while (zzl == i7);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzG(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxhVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i8 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxhVar.zzi(this.zza.zzj());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            if (i9 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzH(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc = zzm + this.zza.zzc();
                do {
                    zzgygVar.zzg(this.zza.zzs());
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzs());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc2 = zzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzs()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzI(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int zzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgxhVar.zzi(this.zza.zzk());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgxhVar.zzi(this.zza.zzk());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int zzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzJ(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int zzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgygVar.zzg(this.zza.zzt());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzt());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int zzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    public final void zzK(List list, boolean z4) {
        int zzl;
        int i7;
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
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            do {
                list.add(z4 ? zzs() : zzr());
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzL(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int zzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgxhVar.zzi(this.zza.zzm());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgxhVar.zzi(this.zza.zzm());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int zzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzM(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int zzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgygVar.zzg(this.zza.zzu());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgygVar.zzg(this.zza.zzu());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int zzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final boolean zzN() {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final double zza() {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final float zzb() {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzc() {
        int i7 = this.zzd;
        if (i7 != 0) {
            this.zzb = i7;
            this.zzd = 0;
        } else {
            i7 = this.zza.zzl();
            this.zzb = i7;
        }
        return (i7 == 0 || i7 == this.zzc) ? f.API_PRIORITY_OTHER : i7 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zze() {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzf() {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzg() {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzh() {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzi() {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final int zzj() {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzk() {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzl() {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzm() {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzn() {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final long zzo() {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final zzgvy zzp() {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final String zzr() {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final String zzs() {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzt(Object obj, zzgzk zzgzkVar, zzgwq zzgwqVar) {
        zzR(3);
        zzO(obj, zzgzkVar, zzgwqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzu(Object obj, zzgzk zzgzkVar, zzgwq zzgwqVar) {
        zzR(2);
        zzP(obj, zzgzkVar, zzgwqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzv(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgvo) {
            zzgvo zzgvoVar = (zzgvo) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int zzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgvoVar.zzg(this.zza.zzB());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgvoVar.zzg(this.zza.zzB());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int zzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Boolean.valueOf(this.zza.zzB()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzw(List list) {
        int zzl;
        if ((this.zzb & 7) != 2) {
            throw new zzgxu("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzA()) {
                return;
            } else {
                zzl = this.zza.zzl();
            }
        } while (zzl == this.zzb);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzx(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgwn) {
            zzgwn zzgwnVar = (zzgwn) list;
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc = zzm + this.zza.zzc();
                do {
                    zzgwnVar.zzh(this.zza.zza());
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                zzgwnVar.zzh(this.zza.zza());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc2 = zzm2 + this.zza.zzc();
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzy(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar = this.zza;
                int zzc = zzgweVar.zzc() + zzgweVar.zzm();
                do {
                    zzgxhVar.zzi(this.zza.zze());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgxhVar.zzi(this.zza.zze());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgxu("Protocol message tag had invalid wire type.");
                }
                zzgwe zzgweVar2 = this.zza;
                int zzc2 = zzgweVar2.zzc() + zzgweVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgze
    public final void zzz(List list) {
        int zzl;
        int i7;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxhVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i8 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxhVar.zzi(this.zza.zzf());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i7 = this.zza.zzl();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            if (i9 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i7 = zzl;
        }
        this.zzd = i7;
    }
}
