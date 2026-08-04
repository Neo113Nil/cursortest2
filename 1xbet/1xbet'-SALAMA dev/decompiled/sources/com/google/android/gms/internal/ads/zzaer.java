package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
final class zzaer implements zzaej {
    public final zzfwh zza;
    private final int zzb;

    private zzaer(int i7, zzfwh zzfwhVar) {
        this.zzb = i7;
        this.zza = zzfwhVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaer zzc(int i7, zzed zzedVar) {
        String str;
        zzaej zzaesVar;
        String str2;
        zzfwe zzfweVar = new zzfwe();
        int iZze = zzedVar.zze();
        int iZzb = -2;
        while (zzedVar.zzb() > 8) {
            int iZzi = zzedVar.zzi();
            int iZzd = zzedVar.zzd() + zzedVar.zzi();
            zzedVar.zzK(iZzd);
            if (iZzi != 1414744396) {
                zzaes zzaesVar2 = null;
                switch (iZzi) {
                    case 1718776947:
                        if (iZzb != 2) {
                            if (iZzb == 1) {
                                int iZzk = zzedVar.zzk();
                                if (iZzk == 1) {
                                    str = "audio/raw";
                                } else if (iZzk == 85) {
                                    str = "audio/mpeg";
                                } else if (iZzk == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iZzk != 8192) {
                                    str = iZzk != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iZzk2 = zzedVar.zzk();
                                    int iZzi2 = zzedVar.zzi();
                                    zzedVar.zzM(6);
                                    int iZzn = zzen.zzn(zzedVar.zzk());
                                    int iZzk3 = zzedVar.zzb() > 0 ? zzedVar.zzk() : 0;
                                    zzx zzxVar = new zzx();
                                    zzxVar.zzad(str);
                                    zzxVar.zzB(iZzk2);
                                    zzxVar.zzae(iZzi2);
                                    if (str.equals("audio/raw") && iZzn != 0) {
                                        zzxVar.zzX(iZzn);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iZzk3 > 0) {
                                        byte[] bArr = new byte[iZzk3];
                                        zzedVar.zzH(bArr, 0, iZzk3);
                                        zzxVar.zzP(zzfwh.zzo(bArr));
                                    }
                                    zzaesVar = new zzaes(zzxVar.zzaj());
                                } else {
                                    AbstractC0486a1.k(iZzk, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                zzdq.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzen.zzD(iZzb)));
                            }
                            break;
                        } else {
                            zzedVar.zzM(4);
                            int iZzi3 = zzedVar.zzi();
                            int iZzi4 = zzedVar.zzi();
                            zzedVar.zzM(4);
                            int iZzi5 = zzedVar.zzi();
                            switch (iZzi5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                AbstractC0486a1.k(iZzi5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                zzx zzxVar2 = new zzx();
                                zzxVar2.zzai(iZzi3);
                                zzxVar2.zzM(iZzi4);
                                zzxVar2.zzad(str2);
                                zzaesVar2 = new zzaes(zzxVar2.zzaj());
                            }
                        }
                        zzaesVar = zzaesVar2;
                        break;
                    case 1751742049:
                        zzaesVar = zzaeo.zzb(zzedVar);
                        break;
                    case 1752331379:
                        zzaesVar = zzaep.zzd(zzedVar);
                        break;
                    case 1852994675:
                        zzaesVar = zzaet.zzb(zzedVar);
                        break;
                    default:
                        zzaesVar = zzaesVar2;
                        break;
                }
            } else {
                zzaesVar = zzc(zzedVar.zzi(), zzedVar);
            }
            if (zzaesVar != null) {
                if (zzaesVar.zza() == 1752331379) {
                    iZzb = ((zzaep) zzaesVar).zzb();
                }
                zzfweVar.zzf(zzaesVar);
            }
            zzedVar.zzL(iZzd);
            zzedVar.zzK(iZze);
        }
        return new zzaer(i7, zzfweVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int zza() {
        return this.zzb;
    }

    public final zzaej zzb(Class cls) {
        zzfwh zzfwhVar = this.zza;
        int size = zzfwhVar.size();
        int i7 = 0;
        while (i7 < size) {
            zzaej zzaejVar = (zzaej) zzfwhVar.get(i7);
            i7++;
            if (zzaejVar.getClass() == cls) {
                return zzaejVar;
            }
        }
        return null;
    }
}
