package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import java.util.List;

/* loaded from: classes.dex */
final class zzjc implements zzmj {
    private final zzjb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzjc(zzjb zzjbVar) {
        byte[] bArr = zzla.zzb;
        this.zza = zzjbVar;
        zzjbVar.zzc = this;
    }

    private final void zzP(Object obj, zzmk zzmkVar, zzkd zzkdVar) {
        int i7 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzmkVar.zzh(obj, this, zzkdVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzlc.zzg();
            }
        } finally {
            this.zzc = i7;
        }
    }

    private final void zzQ(Object obj, zzmk zzmkVar, zzkd zzkdVar) {
        zzjb zzjbVar = this.zza;
        int zzn = zzjbVar.zzn();
        if (zzjbVar.zza >= zzjbVar.zzb) {
            throw new zzlc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zze = this.zza.zze(zzn);
        this.zza.zza++;
        zzmkVar.zzh(obj, this, zzkdVar);
        this.zza.zzz(0);
        r4.zza--;
        this.zza.zzA(zze);
    }

    private final void zzR(int i7) {
        if (this.zza.zzd() != i7) {
            throw zzlc.zzi();
        }
    }

    private final void zzS(int i7) {
        if ((this.zzb & 7) != i7) {
            throw zzlc.zza();
        }
    }

    private static final void zzT(int i7) {
        if ((i7 & 3) != 0) {
            throw zzlc.zzg();
        }
    }

    private static final void zzU(int i7) {
        if ((i7 & 7) != 0) {
            throw zzlc.zzg();
        }
    }

    public static zzjc zzq(zzjb zzjbVar) {
        zzjc zzjcVar = zzjbVar.zzc;
        return zzjcVar != null ? zzjcVar : new zzjc(zzjbVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzA(List list) {
        int zzm;
        int i7;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzlmVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzB(List list) {
        int zzm;
        int i7;
        if (list instanceof zzkk) {
            zzkk zzkkVar = (zzkk) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzkkVar.zzf(this.zza.zzc());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i8 != 5) {
                throw zzlc.zza();
            }
            do {
                zzkkVar.zzf(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i9 != 5) {
                throw zzlc.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    @Deprecated
    public final void zzC(List list, zzmk zzmkVar, zzkd zzkdVar) {
        int zzm;
        int i7 = this.zzb;
        if ((i7 & 7) != 3) {
            throw zzlc.zza();
        }
        do {
            Object zze = zzmkVar.zze();
            zzP(zze, zzmkVar, zzkdVar);
            zzmkVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i7);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzD(List list) {
        int zzm;
        int i7;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzE(List list) {
        int zzm;
        int i7;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzlmVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzF(List list, zzmk zzmkVar, zzkd zzkdVar) {
        int zzm;
        int i7 = this.zzb;
        if ((i7 & 7) != 2) {
            throw zzlc.zza();
        }
        do {
            Object zze = zzmkVar.zze();
            zzQ(zze, zzmkVar, zzkdVar);
            zzmkVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i7);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzG(List list) {
        int zzm;
        int i7;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzktVar.zzh(this.zza.zzk());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i8 != 5) {
                throw zzlc.zza();
            }
            do {
                zzktVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i9 != 5) {
                throw zzlc.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzH(List list) {
        int zzm;
        int i7;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzlmVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzI(List list) {
        int zzm;
        int i7;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzJ(List list) {
        int zzm;
        int i7;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzlmVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    public final void zzK(List list, boolean z4) {
        int zzm;
        int i7;
        if ((this.zzb & 7) != 2) {
            throw zzlc.zza();
        }
        if ((list instanceof zzlj) && !z4) {
            zzlj zzljVar = (zzlj) list;
            do {
                zzp();
                zzljVar.zzb();
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            do {
                list.add(z4 ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzL(List list) {
        int zzm;
        int i7;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzM(List list) {
        int zzm;
        int i7;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzlmVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final boolean zzO() {
        int i7;
        if (this.zza.zzC() || (i7 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i7);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzc() {
        int i7 = this.zzd;
        if (i7 != 0) {
            this.zzb = i7;
            this.zzd = 0;
        } else {
            i7 = this.zza.zzm();
            this.zzb = i7;
        }
        return (i7 == 0 || i7 == this.zzc) ? f.API_PRIORITY_OTHER : i7 >>> 3;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzj() {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final zziv zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzt(Object obj, zzmk zzmkVar, zzkd zzkdVar) {
        zzS(3);
        zzP(obj, zzmkVar, zzkdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzu(Object obj, zzmk zzmkVar, zzkd zzkdVar) {
        zzS(2);
        zzQ(obj, zzmkVar, zzkdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzv(List list) {
        int zzm;
        int i7;
        if (list instanceof zzim) {
            zzim zzimVar = (zzim) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzimVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzimVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzw(List list) {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzlc.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzx(List list) {
        int zzm;
        int i7;
        if (list instanceof zzjx) {
            zzjx zzjxVar = (zzjx) list;
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzjxVar.zzf(this.zza.zzb());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzjxVar.zzf(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzy(List list) {
        int zzm;
        int i7;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzz(List list) {
        int zzm;
        int i7;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzktVar.zzh(this.zza.zzg());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i8 != 5) {
                throw zzlc.zza();
            }
            do {
                zzktVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i9 != 5) {
                throw zzlc.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }
}
