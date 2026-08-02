package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
final class zzaer implements zzaej {
    public final zzfwh zza;
    private final int zzb;

    private zzaer(int i7, zzfwh zzfwhVar) {
        this.zzb = i7;
        this.zza = zzfwhVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaer zzc(int i7, zzed zzedVar) {
        zzaej zzaesVar;
        String str;
        zzfwe zzfweVar = new zzfwe();
        int zze = zzedVar.zze();
        int i8 = -2;
        while (zzedVar.zzb() > 8) {
            int zzi = zzedVar.zzi();
            int zzd = zzedVar.zzd() + zzedVar.zzi();
            zzedVar.zzK(zzd);
            if (zzi != 1414744396) {
                zzaes zzaesVar2 = null;
                switch (zzi) {
                    case 1718776947:
                        if (i8 == 2) {
                            zzedVar.zzM(4);
                            int zzi2 = zzedVar.zzi();
                            int zzi3 = zzedVar.zzi();
                            zzedVar.zzM(4);
                            int zzi4 = zzedVar.zzi();
                            switch (zzi4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                AbstractC0486a1.k(zzi4, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                zzx zzxVar = new zzx();
                                zzxVar.zzai(zzi2);
                                zzxVar.zzM(zzi3);
                                zzxVar.zzad(str);
                                zzaesVar2 = new zzaes(zzxVar.zzaj());
                            }
                        } else if (i8 == 1) {
                            int zzk = zzedVar.zzk();
                            String str2 = zzk != 1 ? zzk != 85 ? zzk != 255 ? zzk != 8192 ? zzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int zzk2 = zzedVar.zzk();
                                int zzi5 = zzedVar.zzi();
                                zzedVar.zzM(6);
                                int zzn = zzen.zzn(zzedVar.zzk());
                                int zzk3 = zzedVar.zzb() > 0 ? zzedVar.zzk() : 0;
                                zzx zzxVar2 = new zzx();
                                zzxVar2.zzad(str2);
                                zzxVar2.zzB(zzk2);
                                zzxVar2.zzae(zzi5);
                                if (str2.equals("audio/raw") && zzn != 0) {
                                    zzxVar2.zzX(zzn);
                                }
                                if (str2.equals("audio/mp4a-latm") && zzk3 > 0) {
                                    byte[] bArr = new byte[zzk3];
                                    zzedVar.zzH(bArr, 0, zzk3);
                                    zzxVar2.zzP(zzfwh.zzo(bArr));
                                }
                                zzaesVar = new zzaes(zzxVar2.zzaj());
                                break;
                            } else {
                                AbstractC0486a1.k(zzk, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            }
                        } else {
                            zzdq.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzen.zzD(i8)));
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
                    i8 = ((zzaep) zzaesVar).zzb();
                }
                zzfweVar.zzf(zzaesVar);
            }
            zzedVar.zzL(zzd);
            zzedVar.zzK(zze);
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
