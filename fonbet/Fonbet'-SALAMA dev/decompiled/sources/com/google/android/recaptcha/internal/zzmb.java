package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
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
        int zzb = zznbVar.zzb(zznbVar.zzd(obj));
        return this.zzc ? zzb + this.zzd.zzb(obj).zzb() : zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : hashCode;
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
        boolean zzO;
        zznb zznbVar = this.zzb;
        Object zzc = zznbVar.zzc(obj);
        zzke zzkeVar = this.zzd;
        zzki zzc2 = zzkeVar.zzc(obj);
        while (zzmjVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzmjVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzd2 = zzkeVar.zzd(zzkdVar, this.zza, zzd >>> 3);
                        if (zzd2 != null) {
                            zzkeVar.zzg(zzmjVar, zzd2, zzkdVar, zzc2);
                        } else {
                            zzO = zznbVar.zzr(zzc, zzmjVar);
                        }
                    } else {
                        zzO = zzmjVar.zzO();
                    }
                    if (!zzO) {
                        break;
                    }
                } else {
                    Object obj2 = null;
                    int i7 = 0;
                    zziv zzivVar = null;
                    while (zzmjVar.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzmjVar.zzd();
                        if (zzd3 == 16) {
                            i7 = zzmjVar.zzj();
                            obj2 = zzkeVar.zzd(zzkdVar, this.zza, i7);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzkeVar.zzg(zzmjVar, obj2, zzkdVar, zzc2);
                            } else {
                                zzivVar = zzmjVar.zzp();
                            }
                        } else if (!zzmjVar.zzO()) {
                            break;
                        }
                    }
                    if (zzmjVar.zzd() != 12) {
                        throw zzlc.zzb();
                    }
                    if (zzivVar != null) {
                        if (obj2 != null) {
                            zzkeVar.zzh(zzivVar, obj2, zzkdVar, zzc2);
                        } else {
                            zznbVar.zzk(zzc, i7, zzivVar);
                        }
                    }
                }
            } finally {
                zznbVar.zzn(obj, zzc);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[EDGE_INSN: B:24:0x0088->B:25:0x0088 BREAK  A[LOOP:1: B:10:0x004b->B:18:0x004b], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzik zzikVar) {
        zzks zzksVar = (zzks) obj;
        zznc zzncVar = zzksVar.zzc;
        if (zzncVar == zznc.zzc()) {
            zzncVar = zznc.zzf();
            zzksVar.zzc = zzncVar;
        }
        ((zzko) obj).zzi();
        Object obj2 = null;
        while (i7 < i8) {
            int zzi = zzil.zzi(bArr, i7, zzikVar);
            int i9 = zzikVar.zza;
            if (i9 == 11) {
                int i10 = 0;
                zziv zzivVar = null;
                while (zzi < i8) {
                    zzi = zzil.zzi(bArr, zzi, zzikVar);
                    int i11 = zzikVar.zza;
                    int i12 = i11 >>> 3;
                    int i13 = i11 & 7;
                    if (i12 != 2) {
                        if (i12 == 3) {
                            if (obj2 != null) {
                                int i14 = zzmg.zza;
                                throw null;
                            }
                            if (i13 == 2) {
                                zzi = zzil.zza(bArr, zzi, zzikVar);
                                zzivVar = (zziv) zzikVar.zzc;
                            }
                        }
                        if (i11 != 12) {
                            break;
                        } else {
                            zzi = zzil.zzo(i11, bArr, zzi, i8, zzikVar);
                        }
                    } else if (i13 == 0) {
                        zzi = zzil.zzi(bArr, zzi, zzikVar);
                        i10 = zzikVar.zza;
                        obj2 = this.zzd.zzd(zzikVar.zzd, this.zza, i10);
                    } else if (i11 != 12) {
                    }
                }
                if (zzivVar != null) {
                    zzncVar.zzj((i10 << 3) | 2, zzivVar);
                }
                i7 = zzi;
            } else if ((i9 & 7) == 2) {
                obj2 = this.zzd.zzd(zzikVar.zzd, this.zza, i9 >>> 3);
                if (obj2 != null) {
                    int i15 = zzmg.zza;
                    throw null;
                }
                i7 = zzil.zzh(i9, bArr, zzi, i8, zzncVar, zzikVar);
            } else {
                i7 = zzil.zzo(i9, bArr, zzi, i8, zzikVar);
            }
        }
        if (i7 != i8) {
            throw zzlc.zzg();
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzj(Object obj, zzno zznoVar) {
        Iterator zzf = this.zzd.zzb(obj).zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
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
