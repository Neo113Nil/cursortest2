package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzahx implements com.google.android.gms.internal.ads.zzahq {
    public final com.google.android.gms.internal.ads.zzgwm zza;
    private final int zzb;

    private zzahx(int i, com.google.android.gms.internal.ads.zzgwm zzgwmVar) {
        this.zzb = i;
        this.zza = zzgwmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.google.android.gms.internal.ads.zzahx zzb(int i, com.google.android.gms.internal.ads.zzet zzetVar) {
        com.google.android.gms.internal.ads.zzahq zzahyVar;
        java.lang.String str;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        int zze = zzetVar.zze();
        int i2 = -2;
        while (zzetVar.zzd() > 8) {
            int zzC = zzetVar.zzC();
            int zzg = zzetVar.zzg() + zzetVar.zzC();
            zzetVar.zzf(zzg);
            if (zzC != 1414744396) {
                com.google.android.gms.internal.ads.zzahy zzahyVar2 = null;
                switch (zzC) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzetVar.zzk(4);
                            int zzC2 = zzetVar.zzC();
                            int zzC3 = zzetVar.zzC();
                            zzetVar.zzk(4);
                            int zzC4 = zzetVar.zzC();
                            switch (zzC4) {
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
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzC4).length() + 44);
                                sb.append("Ignoring track with unsupported compression ");
                                sb.append(zzC4);
                                com.google.android.gms.internal.ads.zzeg.zzc("StreamFormatChunk", sb.toString());
                            } else {
                                com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                                zztVar.zzv(zzC2);
                                zztVar.zzw(zzC3);
                                zztVar.zzo(str);
                                zzahyVar2 = new com.google.android.gms.internal.ads.zzahy(zztVar.zzO());
                            }
                        } else if (i2 == 1) {
                            int zzu = zzetVar.zzu();
                            java.lang.String str2 = zzu != 1 ? zzu != 85 ? zzu != 255 ? zzu != 8192 ? zzu != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int zzu2 = zzetVar.zzu();
                                int zzC5 = zzetVar.zzC();
                                zzetVar.zzk(6);
                                int zzB = com.google.android.gms.internal.ads.zzfl.zzB(zzetVar.zzu(), java.nio.ByteOrder.LITTLE_ENDIAN);
                                int zzu3 = zzetVar.zzd() > 0 ? zzetVar.zzu() : 0;
                                com.google.android.gms.internal.ads.zzt zztVar2 = new com.google.android.gms.internal.ads.zzt();
                                zztVar2.zzo(str2);
                                zztVar2.zzG(zzu2);
                                zztVar2.zzH(zzC5);
                                if (str2.equals("audio/raw") && zzB != 0) {
                                    zztVar2.zzI(zzB);
                                }
                                if (str2.equals("audio/mp4a-latm") && zzu3 > 0) {
                                    byte[] bArr = new byte[zzu3];
                                    zzetVar.zzm(bArr, 0, zzu3);
                                    zztVar2.zzr(com.google.android.gms.internal.ads.zzgwm.zzj(bArr));
                                }
                                zzahyVar = new com.google.android.gms.internal.ads.zzahy(zztVar2.zzO());
                                break;
                            } else {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzu).length() + 43);
                                sb2.append("Ignoring track with unsupported format tag ");
                                sb2.append(zzu);
                                com.google.android.gms.internal.ads.zzeg.zzc("StreamFormatChunk", sb2.toString());
                            }
                        } else {
                            com.google.android.gms.internal.ads.zzeg.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(com.google.android.gms.internal.ads.zzfl.zzS(i2)));
                        }
                        zzahyVar = zzahyVar2;
                        break;
                    case 1751742049:
                        zzahyVar = com.google.android.gms.internal.ads.zzahu.zzb(zzetVar);
                        break;
                    case 1752331379:
                        zzahyVar = com.google.android.gms.internal.ads.zzahv.zzb(zzetVar);
                        break;
                    case 1852994675:
                        zzahyVar = com.google.android.gms.internal.ads.zzahz.zzb(zzetVar);
                        break;
                    default:
                        zzahyVar = zzahyVar2;
                        break;
                }
            } else {
                zzahyVar = zzb(zzetVar.zzC(), zzetVar);
            }
            if (zzahyVar != null) {
                if (zzahyVar.zza() == 1752331379) {
                    i2 = ((com.google.android.gms.internal.ads.zzahv) zzahyVar).zzc();
                }
                zzgwjVar.zzf(zzahyVar);
            }
            zzetVar.zzh(zzg);
            zzetVar.zzf(zze);
        }
        return new com.google.android.gms.internal.ads.zzahx(i, zzgwjVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzahq
    public final int zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzahq zzc(java.lang.Class cls) {
        com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
        int size = zzgwmVar.size();
        int i = 0;
        while (i < size) {
            com.google.android.gms.internal.ads.zzahq zzahqVar = (com.google.android.gms.internal.ads.zzahq) zzgwmVar.get(i);
            i++;
            if (zzahqVar.getClass() == cls) {
                return zzahqVar;
            }
        }
        return null;
    }
}
