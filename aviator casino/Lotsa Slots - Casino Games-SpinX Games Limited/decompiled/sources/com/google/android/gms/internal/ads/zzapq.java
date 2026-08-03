package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapq implements com.google.android.gms.internal.ads.zzarg {
    private final java.util.List zza;

    public zzapq() {
        this(0);
    }

    public zzapq(int i, java.util.List list) {
        this.zza = list;
    }

    private final com.google.android.gms.internal.ads.zzaqw zzc(com.google.android.gms.internal.ads.zzarf zzarfVar) {
        return new com.google.android.gms.internal.ads.zzaqw(zze(zzarfVar), "video/mp2t");
    }

    private final com.google.android.gms.internal.ads.zzarl zzd(com.google.android.gms.internal.ads.zzarf zzarfVar) {
        return new com.google.android.gms.internal.ads.zzarl(zze(zzarfVar), "video/mp2t");
    }

    private final java.util.List zze(com.google.android.gms.internal.ads.zzarf zzarfVar) {
        java.lang.String str;
        int i;
        java.util.List list;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(zzarfVar.zze);
        java.util.List list2 = this.zza;
        while (zzetVar.zzd() > 0) {
            int zzs = zzetVar.zzs();
            int zzg = zzetVar.zzg() + zzetVar.zzs();
            if (zzs == 134) {
                list2 = new java.util.ArrayList();
                int zzs2 = zzetVar.zzs() & 31;
                for (int i2 = 0; i2 < zzs2; i2++) {
                    java.lang.String zzK = zzetVar.zzK(3, java.nio.charset.StandardCharsets.UTF_8);
                    int zzs3 = zzetVar.zzs();
                    boolean z = (zzs3 & 128) != 0;
                    if (z) {
                        i = zzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzs4 = (byte) zzetVar.zzs();
                    zzetVar.zzk(1);
                    if (z) {
                        int i3 = zzs4 & com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO;
                        int i4 = com.google.android.gms.internal.ads.zzdq.zza;
                        list = java.util.Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                    zztVar.zzo(str);
                    zztVar.zze(zzK);
                    zztVar.zzL(i);
                    zztVar.zzr(list);
                    list2.add(zztVar.zzO());
                }
            }
            zzetVar.zzh(zzg);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final android.util.SparseArray zza() {
        return new android.util.SparseArray();
    }

    public zzapq(int i) {
        this.zza = com.google.android.gms.internal.ads.zzgwm.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public final com.google.android.gms.internal.ads.zzari zzb(int i, com.google.android.gms.internal.ads.zzarf zzarfVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzaqf(zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
            }
            if (i == 21) {
                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzaqd("video/mp2t"));
            }
            if (i == 27) {
                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzaqa(zzc(zzarfVar), false, false, "video/mp2t"));
            }
            if (i == 36) {
                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzaqc(zzc(zzarfVar), "video/mp2t"));
            }
            if (i == 45) {
                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzaqg("video/mp2t"));
            }
            if (i == 89) {
                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzaps(zzarfVar.zzd, "video/mp2t"));
            }
            if (i == 172) {
                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzapm(zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
            }
            if (i == 257) {
                return new com.google.android.gms.internal.ads.zzaqu(new com.google.android.gms.internal.ads.zzaql("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzapr(zzarfVar.zzb, zzarfVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i) {
                            case 15:
                                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzapp(false, zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
                            case 16:
                                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzapy(zzd(zzarfVar), "video/mp2t"));
                            case 17:
                                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzaqe(zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
                            default:
                                switch (i) {
                                    case 134:
                                        return new com.google.android.gms.internal.ads.zzaqu(new com.google.android.gms.internal.ads.zzaql("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzapr(zzarfVar.zzb, zzarfVar.zza(), 4096, "video/mp2t"));
                }
                return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzapj(zzarfVar.zzb, zzarfVar.zza(), "video/mp2t"));
            }
        }
        return new com.google.android.gms.internal.ads.zzaqm(new com.google.android.gms.internal.ads.zzapv(zzd(zzarfVar), "video/mp2t"));
    }
}
