package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzalv implements zzanl {
    private final List zza;

    public zzalv(int i7, List list) {
        this.zza = list;
    }

    private final zzanc zzc(zzank zzankVar) {
        return new zzanc(zze(zzankVar), "video/mp2t");
    }

    private final zzanp zzd(zzank zzankVar) {
        return new zzanp(zze(zzankVar), "video/mp2t");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzank zzankVar) {
        String str;
        int i7;
        List list;
        zzed zzedVar = new zzed(zzankVar.zze);
        ArrayList arrayList = this.zza;
        while (zzedVar.zzb() > 0) {
            int zzm = zzedVar.zzm();
            int zzd = zzedVar.zzd() + zzedVar.zzm();
            if (zzm == 134) {
                arrayList = new ArrayList();
                int zzm2 = zzedVar.zzm() & 31;
                for (int i8 = 0; i8 < zzm2; i8++) {
                    String zzB = zzedVar.zzB(3, StandardCharsets.UTF_8);
                    int zzm3 = zzedVar.zzm();
                    boolean z4 = (zzm3 & 128) != 0;
                    if (z4) {
                        i7 = zzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte zzm4 = (byte) zzedVar.zzm();
                    zzedVar.zzM(1);
                    if (z4) {
                        int i9 = zzm4 & 64;
                        int i10 = zzda.zza;
                        list = Collections.singletonList(i9 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzx zzxVar = new zzx();
                    zzxVar.zzad(str);
                    zzxVar.zzS(zzB);
                    zzxVar.zzz(i7);
                    zzxVar.zzP(list);
                    arrayList.add(zzxVar.zzaj());
                }
            }
            zzedVar.zzL(zzd);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final zzann zzb(int i7, zzank zzankVar) {
        if (i7 != 2) {
            if (i7 == 3 || i7 == 4) {
                return new zzams(new zzamk(zzankVar.zzb, zzankVar.zza(), "video/mp2t"));
            }
            if (i7 == 21) {
                return new zzams(new zzami("video/mp2t"));
            }
            if (i7 == 27) {
                return new zzams(new zzamf(zzc(zzankVar), false, false, "video/mp2t"));
            }
            if (i7 == 36) {
                return new zzams(new zzamh(zzc(zzankVar), "video/mp2t"));
            }
            if (i7 == 45) {
                return new zzams(new zzaml("video/mp2t"));
            }
            if (i7 == 89) {
                return new zzams(new zzalx(zzankVar.zzd, "video/mp2t"));
            }
            if (i7 == 172) {
                return new zzams(new zzals(zzankVar.zzb, zzankVar.zza(), "video/mp2t"));
            }
            if (i7 == 257) {
                return new zzana(new zzamr("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i7 != 128) {
                if (i7 != 129) {
                    if (i7 != 138) {
                        if (i7 == 139) {
                            return new zzams(new zzalw(zzankVar.zzb, zzankVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i7) {
                            case 15:
                                return new zzams(new zzalu(false, zzankVar.zzb, zzankVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzams(new zzamd(zzd(zzankVar), "video/mp2t"));
                            case 17:
                                return new zzams(new zzamj(zzankVar.zzb, zzankVar.zza(), "video/mp2t"));
                            default:
                                switch (i7) {
                                    case 134:
                                        return new zzana(new zzamr("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzams(new zzalw(zzankVar.zzb, zzankVar.zza(), 4096, "video/mp2t"));
                }
                return new zzams(new zzalq(zzankVar.zzb, zzankVar.zza(), "video/mp2t"));
            }
        }
        return new zzams(new zzama(zzd(zzankVar), "video/mp2t"));
    }

    public zzalv() {
        this(0);
    }

    public zzalv(int i7) {
        this.zza = zzfwh.zzn();
    }
}
