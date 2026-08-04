package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzmb implements zzmk {
    private final zzlx zza;
    private final zznb zzb;
    private final boolean zzc;
    private final zzke zzd;

    private zzmb(zznb zznbVar, zzke zzkeVar, zzlx zzlxVar) {
        this.zzb = zznbVar;
        this.zzc = zzkeVar.zzj(zzlxVar);
        this.zzd = zzkeVar;
        this.zza = zzlxVar;
    }

    public static zzmb zzc(zznb zznbVar, zzke zzkeVar, zzlx zzlxVar) {
        return new zzmb(zznbVar, zzkeVar, zzlxVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zza(Object obj) {
        zznb zznbVar = this.zzb;
        int iZzb = zznbVar.zzb(zznbVar.zzd(obj));
        return this.zzc ? iZzb + this.zzd.zzb(obj).zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final Object zze() {
        zzlx zzlxVar = this.zza;
        return zzlxVar instanceof zzks ? ((zzks) zzlxVar).zzt() : zzlxVar.zzaa().zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzg(Object obj, Object obj2) {
        zzmm.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzmm.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzh(Object obj, zzmj zzmjVar, zzkd zzkdVar) {
        boolean zZzO;
        zznb zznbVar = this.zzb;
        Object objZzc = zznbVar.zzc(obj);
        zzke zzkeVar = this.zzd;
        zzki zzkiVarZzc = zzkeVar.zzc(obj);
        while (zzmjVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzmjVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzd = zzkeVar.zzd(zzkdVar, this.zza, iZzd >>> 3);
                        if (objZzd != null) {
                            zzkeVar.zzg(zzmjVar, objZzd, zzkdVar, zzkiVarZzc);
                        } else {
                            zZzO = zznbVar.zzr(objZzc, zzmjVar);
                        }
                    } else {
                        zZzO = zzmjVar.zzO();
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    Object objZzd2 = null;
                    int iZzj = 0;
                    zziv zzivVarZzp = null;
                    while (zzmjVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzmjVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzmjVar.zzj();
                            objZzd2 = zzkeVar.zzd(zzkdVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzd2 != null) {
                                zzkeVar.zzg(zzmjVar, objZzd2, zzkdVar, zzkiVarZzc);
                            } else {
                                zzivVarZzp = zzmjVar.zzp();
                            }
                        } else if (!zzmjVar.zzO()) {
                            break;
                        }
                    }
                    if (zzmjVar.zzd() != 12) {
                        throw zzlc.zzb();
                    }
                    if (zzivVarZzp != null) {
                        if (objZzd2 != null) {
                            zzkeVar.zzh(zzivVarZzp, objZzd2, zzkdVar, zzkiVarZzc);
                        } else {
                            zznbVar.zzk(objZzc, iZzj, zzivVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zznbVar.zzn(obj, objZzc);
                throw th;
            }
        }
        zznbVar.zzn(obj, objZzc);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088 A[EDGE_INSN: B:57:0x0088->B:33:0x0088 BREAK  A[LOOP:1: B:18:0x004b->B:60:0x004b], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzik zzikVar) throws zzlc {
        zzks zzksVar = (zzks) obj;
        zznc zzncVarZzf = zzksVar.zzc;
        if (zzncVarZzf == zznc.zzc()) {
            zzncVarZzf = zznc.zzf();
            zzksVar.zzc = zzncVarZzf;
        }
        ((zzko) obj).zzi();
        Object objZzd = null;
        while (i7 < i8) {
            int iZzi = zzil.zzi(bArr, i7, zzikVar);
            int i9 = zzikVar.zza;
            if (i9 == 11) {
                int i10 = 0;
                zziv zzivVar = null;
                while (iZzi < i8) {
                    iZzi = zzil.zzi(bArr, iZzi, zzikVar);
                    int i11 = zzikVar.zza;
                    int i12 = i11 >>> 3;
                    int i13 = i11 & 7;
                    if (i12 == 2) {
                        if (i13 != 0) {
                            if (i11 != 12) {
                                break;
                                break;
                            }
                            iZzi = zzil.zzo(i11, bArr, iZzi, i8, zzikVar);
                        } else {
                            iZzi = zzil.zzi(bArr, iZzi, zzikVar);
                            i10 = zzikVar.zza;
                            objZzd = this.zzd.zzd(zzikVar.zzd, this.zza, i10);
                        }
                    } else {
                        if (i12 == 3) {
                            if (objZzd != null) {
                                int i14 = zzmg.zza;
                                throw null;
                            }
                            if (i13 == 2) {
                                iZzi = zzil.zza(bArr, iZzi, zzikVar);
                                zzivVar = (zziv) zzikVar.zzc;
                            }
                        }
                        if (i11 != 12) {
                            break;
                        } else {
                            iZzi = zzil.zzo(i11, bArr, iZzi, i8, zzikVar);
                        }
                    }
                }
                if (zzivVar != null) {
                    zzncVarZzf.zzj((i10 << 3) | 2, zzivVar);
                }
                i7 = iZzi;
            } else if ((i9 & 7) == 2) {
                objZzd = this.zzd.zzd(zzikVar.zzd, this.zza, i9 >>> 3);
                if (objZzd != null) {
                    int i15 = zzmg.zza;
                    throw null;
                }
                i7 = zzil.zzh(i9, bArr, iZzi, i8, zzncVarZzf, zzikVar);
            } else {
                i7 = zzil.zzo(i9, bArr, iZzi, i8, zzikVar);
            }
        }
        if (i7 != i8) {
            throw zzlc.zzg();
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzj(Object obj, zzno zznoVar) {
        Iterator itZzf = this.zzd.zzb(obj).zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzkh zzkhVar = (zzkh) entry.getKey();
            if (zzkhVar.zze() != zznn.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzkhVar.zzg();
            zzkhVar.zzf();
            if (entry instanceof zzlf) {
                zznoVar.zzw(zzkhVar.zza(), ((zzlf) entry).zza().zzb());
            } else {
                zznoVar.zzw(zzkhVar.zza(), entry.getValue());
            }
        }
        zznb zznbVar = this.zzb;
        zznbVar.zzp(zznbVar.zzd(obj), zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzk(Object obj, Object obj2) {
        zznb zznbVar = this.zzb;
        if (!zznbVar.zzd(obj).equals(zznbVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }
}
