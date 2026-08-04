package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzagw {
    public byte[] zzO;
    public zzaec zzU;
    public boolean zzV;
    public zzaeb zzX;
    public int zzY;
    private int zzZ;
    public boolean zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzaea zzj;
    public byte[] zzk;
    public zzs zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = zzbbd.zzq.zzf;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzW = true;
    private String zzaa = "eng";

    private static Pair zzf(zzed zzedVar) throws zzaz {
        try {
            zzedVar.zzM(16);
            long jZzs = zzedVar.zzs();
            if (jZzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzs != 826496599) {
                zzdq.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzd = zzedVar.zzd() + 20;
            byte[] bArrZzN = zzedVar.zzN();
            while (true) {
                int length = bArrZzN.length;
                if (iZzd >= length - 4) {
                    throw zzaz.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i7 = iZzd + 1;
                if (bArrZzN[iZzd] == 0 && bArrZzN[i7] == 0 && bArrZzN[iZzd + 2] == 1 && bArrZzN[iZzd + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzN, iZzd, length)));
                }
                iZzd = i7;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzaz {
        int i7;
        int i8;
        try {
            if (bArr[0] != 2) {
                throw zzaz.zza("Error parsing vorbis codec private", null);
            }
            int i9 = 0;
            int i10 = 1;
            while (true) {
                int i11 = bArr[i10];
                i10++;
                i7 = i11 & 255;
                if (i7 != 255) {
                    break;
                }
                i9 += 255;
            }
            int i12 = i9 + i7;
            int i13 = 0;
            while (true) {
                int i14 = bArr[i10];
                i10++;
                i8 = i14 & 255;
                if (i8 != 255) {
                    break;
                }
                i13 += 255;
            }
            int i15 = i13 + i8;
            if (bArr[i10] != 1) {
                throw zzaz.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            int i16 = i10 + i12;
            if (bArr[i16] != 3) {
                throw zzaz.zza("Error parsing vorbis codec private", null);
            }
            int i17 = i16 + i15;
            if (bArr[i17] != 5) {
                throw zzaz.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i17;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i17, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzed zzedVar) throws zzaz {
        try {
            int iZzk = zzedVar.zzk();
            if (iZzk == 1) {
                return true;
            }
            if (iZzk == 65534) {
                zzedVar.zzL(24);
                if (zzedVar.zzt() == zzagy.zze.getMostSignificantBits() && zzedVar.zzt() == zzagy.zze.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzaz {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzaz.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x018f  */
    /* JADX WARN: Code duplicated, block: B:121:0x01eb A[PHI: r8
      0x01eb: PHI (r8v7 int) = (r8v1 int), (r8v2 int), (r8v3 int), (r8v4 int), (r8v5 int), (r8v6 int), (r8v0 int) binds: [B:140:0x0269, B:135:0x0239, B:132:0x021b, B:130:0x0216, B:128:0x0211, B:126:0x020d, B:120:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:180:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:185:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:186:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:189:0x03de  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:192:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:194:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:196:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:199:0x0405  */
    /* JADX WARN: Code duplicated, block: B:201:0x040a  */
    /* JADX WARN: Code duplicated, block: B:204:0x0411  */
    /* JADX WARN: Code duplicated, block: B:207:0x041f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0424  */
    /* JADX WARN: Code duplicated, block: B:212:0x042a  */
    /* JADX WARN: Code duplicated, block: B:235:0x0504  */
    /* JADX WARN: Code duplicated, block: B:240:0x0525  */
    /* JADX WARN: Code duplicated, block: B:258:0x0570  */
    /* JADX WARN: Code duplicated, block: B:260:0x0590  */
    /* JADX WARN: Code duplicated, block: B:262:0x0598  */
    /* JADX WARN: Code duplicated, block: B:277:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:282:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:283:0x05e5  */
    public final void zze(zzacy zzacyVar, int i7) throws zzaz {
        byte b7;
        List list;
        String str;
        String str2;
        List listZzo;
        int i8;
        List listZzg;
        int i9;
        List list2;
        List list3;
        String str3;
        int i10;
        zzx zzxVar;
        int i11;
        int iIntValue;
        int i12;
        float f7;
        int i13;
        int i14;
        int i15;
        String str4;
        zzacr zzacrVarZza;
        List listZzo2;
        String str5 = this.zzc;
        int iZzn = 4;
        int i16 = 0;
        switch (str5) {
            case "V_MPEG4/ISO/AP":
                b7 = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b7 = 4;
                break;
            case "A_MS/ACM":
                b7 = 23;
                break;
            case "A_TRUEHD":
                b7 = 18;
                break;
            case "A_VORBIS":
                b7 = 11;
                break;
            case "A_MPEG/L2":
                b7 = 14;
                break;
            case "A_MPEG/L3":
                b7 = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b7 = 9;
                break;
            case "S_DVBSUB":
                b7 = 32;
                break;
            case "V_MPEG4/ISO/ASP":
                b7 = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b7 = 7;
                break;
            case "S_VOBSUB":
                b7 = 30;
                break;
            case "A_DTS/LOSSLESS":
                b7 = 21;
                break;
            case "A_AAC":
                b7 = 13;
                break;
            case "A_AC3":
                b7 = 16;
                break;
            case "A_DTS":
                b7 = 19;
                break;
            case "V_AV1":
                b7 = 2;
                break;
            case "V_VP8":
                b7 = 0;
                break;
            case "V_VP9":
                b7 = 1;
                break;
            case "S_HDMV/PGS":
                b7 = 31;
                break;
            case "V_THEORA":
                b7 = 10;
                break;
            case "A_DTS/EXPRESS":
                b7 = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b7 = 26;
                break;
            case "A_PCM/INT/BIG":
                b7 = 25;
                break;
            case "A_PCM/INT/LIT":
                b7 = 24;
                break;
            case "S_TEXT/ASS":
                b7 = 28;
                break;
            case "V_MPEGH/ISO/HEVC":
                b7 = 8;
                break;
            case "S_TEXT/WEBVTT":
                b7 = 29;
                break;
            case "S_TEXT/UTF8":
                b7 = 27;
                break;
            case "V_MPEG2":
                b7 = 3;
                break;
            case "A_EAC3":
                b7 = 17;
                break;
            case "A_FLAC":
                b7 = 22;
                break;
            case "A_OPUS":
                b7 = 12;
                break;
            default:
                b7 = -1;
                break;
        }
        String str6 = "audio/raw";
        zzk zzkVarZzg = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        switch (b7) {
            case 0:
                str6 = "video/x-vnd.on2.vp8";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null && (zzacrVarZza = zzacr.zza(new zzed(this.zzO))) != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z4 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i17 = (z4 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                } else if (zzay.zzj(str3)) {
                    if (this.zzr == 0) {
                        i14 = this.zzp;
                        iIntValue = -1;
                        if (i14 == -1) {
                            i14 = this.zzm;
                        }
                        this.zzp = i14;
                        i15 = this.zzq;
                        if (i15 == -1) {
                            i15 = this.zzn;
                        }
                        this.zzq = i15;
                    } else {
                        iIntValue = -1;
                    }
                    i12 = this.zzp;
                    if (i12 != iIntValue || (i13 = this.zzq) == iIntValue) {
                        f7 = -1.0f;
                    } else {
                        f7 = (this.zzn * i12) / (this.zzm * i13);
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f && this.zzM != -1.0f && this.zzN != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder.putShort((short) this.zzC);
                            byteBufferOrder.putShort((short) this.zzD);
                        }
                        zzi zziVar = new zzi();
                        zziVar.zzc(this.zzz);
                        zziVar.zzb(this.zzB);
                        zziVar.zzd(this.zzA);
                        zziVar.zze(bArr);
                        zziVar.zzf(this.zzo);
                        zziVar.zza(this.zzo);
                        zzkVarZzg = zziVar.zzg();
                    }
                    if (this.zzb != null && zzagy.zzf.containsKey(this.zzb)) {
                        iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0 || Float.compare(this.zzt, 0.0f) != 0 || Float.compare(this.zzu, 0.0f) != 0) {
                        i16 = iIntValue;
                    } else if (Float.compare(this.zzv, 0.0f) != 0) {
                        if (Float.compare(this.zzv, 90.0f) == 0) {
                            i16 = 90;
                        } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                            i16 = 180;
                        } else if (Float.compare(this.zzv, -90.0f) == 0) {
                            i16 = 270;
                        } else {
                            i16 = iIntValue;
                        }
                    }
                    zzxVar.zzai(this.zzm);
                    zzxVar.zzM(this.zzn);
                    zzxVar.zzZ(f7);
                    zzxVar.zzac(i16);
                    zzxVar.zzaa(this.zzw);
                    zzxVar.zzag(this.zzx);
                    zzxVar.zzD(zzkVarZzg);
                    i11 = 2;
                } else {
                    if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzaz.zza("Unexpected MIME type.", null);
                    }
                    i11 = 3;
                }
                if (this.zzb != null && !zzagy.zzf.containsKey(this.zzb)) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i17);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj = zzxVar.zzaj();
                zzaeb zzaebVarZzw = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw;
                zzaebVarZzw.zzm(zzzVarZzaj);
                return;
            case 1:
                byte[] bArr2 = this.zzk;
                str6 = "video/x-vnd.on2.vp9";
                listZzo2 = bArr2 == null ? null : zzfwh.zzo(bArr2);
                str2 = null;
                listZzo = listZzo2;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z7 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i18 = (z7 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder2.put((byte) 0);
                                byteBufferOrder2.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder2.putShort((short) this.zzC);
                                byteBufferOrder2.putShort((short) this.zzD);
                            }
                            zzi zziVar2 = new zzi();
                            zziVar2.zzc(this.zzz);
                            zziVar2.zzb(this.zzB);
                            zziVar2.zzd(this.zzA);
                            zziVar2.zze(bArr);
                            zziVar2.zzf(this.zzo);
                            zziVar2.zza(this.zzo);
                            zzkVarZzg = zziVar2.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i18);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj2 = zzxVar.zzaj();
                zzaeb zzaebVarZzw2 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw2;
                zzaebVarZzw2.zzm(zzzVarZzaj2);
                return;
            case 2:
                byte[] bArr3 = this.zzk;
                str6 = "video/av01";
                listZzo2 = bArr3 == null ? null : zzfwh.zzo(bArr3);
                str2 = null;
                listZzo = listZzo2;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z8 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i19 = (z8 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder3.put((byte) 0);
                                byteBufferOrder3.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder3.putShort((short) this.zzC);
                                byteBufferOrder3.putShort((short) this.zzD);
                            }
                            zzi zziVar3 = new zzi();
                            zziVar3.zzc(this.zzz);
                            zziVar3.zzb(this.zzB);
                            zziVar3.zzd(this.zzA);
                            zziVar3.zze(bArr);
                            zziVar3.zzf(this.zzo);
                            zziVar3.zza(this.zzo);
                            zzkVarZzg = zziVar3.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i19);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj3 = zzxVar.zzaj();
                zzaeb zzaebVarZzw3 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw3;
                zzaebVarZzw3.zzm(zzzVarZzaj3);
                return;
            case 3:
                str6 = "video/mpeg2";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z9 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i110 = (z9 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder4.put((byte) 0);
                                byteBufferOrder4.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder4.putShort((short) this.zzC);
                                byteBufferOrder4.putShort((short) this.zzD);
                            }
                            zzi zziVar4 = new zzi();
                            zziVar4.zzc(this.zzz);
                            zziVar4.zzb(this.zzB);
                            zziVar4.zzd(this.zzA);
                            zziVar4.zze(bArr);
                            zziVar4.zzf(this.zzo);
                            zziVar4.zza(this.zzo);
                            zzkVarZzg = zziVar4.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i110);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj4 = zzxVar.zzaj();
                zzaeb zzaebVarZzw4 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw4;
                zzaebVarZzw4.zzm(zzzVarZzaj4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.zzk;
                str6 = "video/mp4v-es";
                listZzo2 = bArr4 == null ? null : Collections.singletonList(bArr4);
                str2 = null;
                listZzo = listZzo2;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z10 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i111 = (z10 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder5.putShort((short) this.zzC);
                                byteBufferOrder5.putShort((short) this.zzD);
                            }
                            zzi zziVar5 = new zzi();
                            zziVar5.zzc(this.zzz);
                            zziVar5.zzb(this.zzB);
                            zziVar5.zzd(this.zzA);
                            zziVar5.zze(bArr);
                            zziVar5.zzf(this.zzo);
                            zziVar5.zza(this.zzo);
                            zzkVarZzg = zziVar5.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i111);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj5 = zzxVar.zzaj();
                zzaeb zzaebVarZzw5 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw5;
                zzaebVarZzw5.zzm(zzzVarZzaj5);
                return;
            case 7:
                zzabz zzabzVarZza = zzabz.zza(new zzed(zzi(this.zzc)));
                list = zzabzVarZza.zza;
                this.zzY = zzabzVarZza.zzb;
                str = zzabzVarZza.zzl;
                str6 = "video/avc";
                str2 = str;
                listZzo = list;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z11 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i112 = (z11 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder6.put((byte) 0);
                                byteBufferOrder6.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder6.putShort((short) this.zzC);
                                byteBufferOrder6.putShort((short) this.zzD);
                            }
                            zzi zziVar6 = new zzi();
                            zziVar6.zzc(this.zzz);
                            zziVar6.zzb(this.zzB);
                            zziVar6.zzd(this.zzA);
                            zziVar6.zze(bArr);
                            zziVar6.zzf(this.zzo);
                            zziVar6.zza(this.zzo);
                            zzkVarZzg = zziVar6.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i112);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj6 = zzxVar.zzaj();
                zzaeb zzaebVarZzw6 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw6;
                zzaebVarZzw6.zzm(zzzVarZzaj6);
                return;
            case 8:
                zzadk zzadkVarZza = zzadk.zza(new zzed(zzi(this.zzc)));
                list = zzadkVarZza.zza;
                this.zzY = zzadkVarZza.zzb;
                str = zzadkVarZza.zzl;
                str6 = "video/hevc";
                str2 = str;
                listZzo = list;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z12 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i113 = (z12 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder7.putShort((short) this.zzC);
                                byteBufferOrder7.putShort((short) this.zzD);
                            }
                            zzi zziVar7 = new zzi();
                            zziVar7.zzc(this.zzz);
                            zziVar7.zzb(this.zzB);
                            zziVar7.zzd(this.zzA);
                            zziVar7.zze(bArr);
                            zziVar7.zzf(this.zzo);
                            zziVar7.zza(this.zzo);
                            zzkVarZzg = zziVar7.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i113);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj7 = zzxVar.zzaj();
                zzaeb zzaebVarZzw7 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw7;
                zzaebVarZzw7.zzm(zzzVarZzaj7);
                return;
            case 9:
                Pair pairZzf = zzf(new zzed(zzi(this.zzc)));
                str6 = (String) pairZzf.first;
                listZzo2 = (List) pairZzf.second;
                str2 = null;
                listZzo = listZzo2;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z13 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i114 = (z13 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder8.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder8.putShort((short) this.zzC);
                                byteBufferOrder8.putShort((short) this.zzD);
                            }
                            zzi zziVar8 = new zzi();
                            zziVar8.zzc(this.zzz);
                            zziVar8.zzb(this.zzB);
                            zziVar8.zzd(this.zzA);
                            zziVar8.zze(bArr);
                            zziVar8.zzf(this.zzo);
                            zziVar8.zza(this.zzo);
                            zzkVarZzg = zziVar8.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i114);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj8 = zzxVar.zzaj();
                zzaeb zzaebVarZzw8 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw8;
                zzaebVarZzw8.zzm(zzzVarZzaj8);
                return;
            case 10:
                str6 = "video/x-unknown";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z14 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i115 = (z14 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder9.put((byte) 0);
                                byteBufferOrder9.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder9.putShort((short) this.zzC);
                                byteBufferOrder9.putShort((short) this.zzD);
                            }
                            zzi zziVar9 = new zzi();
                            zziVar9.zzc(this.zzz);
                            zziVar9.zzb(this.zzB);
                            zziVar9.zzd(this.zzA);
                            zziVar9.zze(bArr);
                            zziVar9.zzf(this.zzo);
                            zziVar9.zza(this.zzo);
                            zzkVarZzg = zziVar9.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i115);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj9 = zzxVar.zzaj();
                zzaeb zzaebVarZzw9 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw9;
                zzaebVarZzw9.zzm(zzzVarZzaj9);
                return;
            case 11:
                i8 = 8192;
                str6 = "audio/vorbis";
                listZzg = zzg(zzi(str5));
                str2 = null;
                list2 = listZzg;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z15 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i116 = (z15 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder10.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder10.putShort((short) this.zzC);
                                byteBufferOrder10.putShort((short) this.zzD);
                            }
                            zzi zziVar10 = new zzi();
                            zziVar10.zzc(this.zzz);
                            zziVar10.zzb(this.zzB);
                            zziVar10.zzd(this.zzA);
                            zziVar10.zze(bArr);
                            zziVar10.zzf(this.zzo);
                            zziVar10.zza(this.zzo);
                            zzkVarZzg = zziVar10.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i116);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj10 = zzxVar.zzaj();
                zzaeb zzaebVarZzw10 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw10;
                zzaebVarZzw10.zzm(zzzVarZzaj10);
                return;
            case 12:
                ArrayList arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzc));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(byteBufferAllocate.order(byteOrder).putLong(this.zzS).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzT).array());
                i8 = 5760;
                str6 = "audio/opus";
                listZzg = arrayList;
                str2 = null;
                list2 = listZzg;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z16 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i117 = (z16 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder11.putShort((short) this.zzC);
                                byteBufferOrder11.putShort((short) this.zzD);
                            }
                            zzi zziVar11 = new zzi();
                            zziVar11.zzc(this.zzz);
                            zziVar11.zzb(this.zzB);
                            zziVar11.zzd(this.zzA);
                            zziVar11.zze(bArr);
                            zziVar11.zzf(this.zzo);
                            zziVar11.zza(this.zzo);
                            zzkVarZzg = zziVar11.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i117);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj11 = zzxVar.zzaj();
                zzaeb zzaebVarZzw11 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw11;
                zzaebVarZzw11.zzm(zzzVarZzaj11);
                return;
            case 13:
                List listSingletonList = Collections.singletonList(zzi(str5));
                zzabp zzabpVarZza = zzabr.zza(this.zzk);
                this.zzR = zzabpVarZza.zza;
                this.zzP = zzabpVarZza.zzb;
                str6 = "audio/mp4a-latm";
                str2 = zzabpVarZza.zzc;
                listZzo = listSingletonList;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z17 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i118 = (z17 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder12.putShort((short) this.zzC);
                                byteBufferOrder12.putShort((short) this.zzD);
                            }
                            zzi zziVar12 = new zzi();
                            zziVar12.zzc(this.zzz);
                            zziVar12.zzb(this.zzB);
                            zziVar12.zzd(this.zzA);
                            zziVar12.zze(bArr);
                            zziVar12.zzf(this.zzo);
                            zziVar12.zza(this.zzo);
                            zzkVarZzg = zziVar12.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i118);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj12 = zzxVar.zzaj();
                zzaeb zzaebVarZzw12 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw12;
                zzaebVarZzw12.zzm(zzzVarZzaj12);
                return;
            case 14:
                i9 = 4096;
                str6 = "audio/mpeg-L2";
                i8 = i9;
                list2 = null;
                str2 = null;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z18 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i119 = (z18 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder13.putShort((short) this.zzC);
                                byteBufferOrder13.putShort((short) this.zzD);
                            }
                            zzi zziVar13 = new zzi();
                            zziVar13.zzc(this.zzz);
                            zziVar13.zzb(this.zzB);
                            zziVar13.zzd(this.zzA);
                            zziVar13.zze(bArr);
                            zziVar13.zzf(this.zzo);
                            zziVar13.zza(this.zzo);
                            zzkVarZzg = zziVar13.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i119);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj13 = zzxVar.zzaj();
                zzaeb zzaebVarZzw13 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw13;
                zzaebVarZzw13.zzm(zzzVarZzaj13);
                return;
            case 15:
                i9 = 4096;
                str6 = "audio/mpeg";
                i8 = i9;
                list2 = null;
                str2 = null;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z19 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i1110 = (z19 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder14.putShort((short) this.zzC);
                                byteBufferOrder14.putShort((short) this.zzD);
                            }
                            zzi zziVar14 = new zzi();
                            zziVar14.zzc(this.zzz);
                            zziVar14.zzb(this.zzB);
                            zziVar14.zzd(this.zzA);
                            zziVar14.zze(bArr);
                            zziVar14.zzf(this.zzo);
                            zziVar14.zza(this.zzo);
                            zzkVarZzg = zziVar14.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1110);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj14 = zzxVar.zzaj();
                zzaeb zzaebVarZzw14 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw14;
                zzaebVarZzw14.zzm(zzzVarZzaj14);
                return;
            case 16:
                str6 = "audio/ac3";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z110 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i1111 = (z110 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder15.putShort((short) this.zzC);
                                byteBufferOrder15.putShort((short) this.zzD);
                            }
                            zzi zziVar15 = new zzi();
                            zziVar15.zzc(this.zzz);
                            zziVar15.zzb(this.zzB);
                            zziVar15.zzd(this.zzA);
                            zziVar15.zze(bArr);
                            zziVar15.zzf(this.zzo);
                            zziVar15.zza(this.zzo);
                            zzkVarZzg = zziVar15.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1111);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj15 = zzxVar.zzaj();
                zzaeb zzaebVarZzw15 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw15;
                zzaebVarZzw15.zzm(zzzVarZzaj15);
                return;
            case 17:
                str6 = "audio/eac3";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z111 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i1112 = (z111 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder16.putShort((short) this.zzC);
                                byteBufferOrder16.putShort((short) this.zzD);
                            }
                            zzi zziVar16 = new zzi();
                            zziVar16.zzc(this.zzz);
                            zziVar16.zzb(this.zzB);
                            zziVar16.zzd(this.zzA);
                            zziVar16.zze(bArr);
                            zziVar16.zzf(this.zzo);
                            zziVar16.zza(this.zzo);
                            zzkVarZzg = zziVar16.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1112);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj16 = zzxVar.zzaj();
                zzaeb zzaebVarZzw16 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw16;
                zzaebVarZzw16.zzm(zzzVarZzaj16);
                return;
            case 18:
                this.zzU = new zzaec();
                str6 = "audio/true-hd";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z112 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i1113 = (z112 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder17.putShort((short) this.zzC);
                                byteBufferOrder17.putShort((short) this.zzD);
                            }
                            zzi zziVar17 = new zzi();
                            zziVar17.zzc(this.zzz);
                            zziVar17.zzb(this.zzB);
                            zziVar17.zzd(this.zzA);
                            zziVar17.zze(bArr);
                            zziVar17.zzf(this.zzo);
                            zziVar17.zza(this.zzo);
                            zzkVarZzg = zziVar17.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1113);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj17 = zzxVar.zzaj();
                zzaeb zzaebVarZzw17 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw17;
                zzaebVarZzw17.zzm(zzzVarZzaj17);
                return;
            case 19:
            case 20:
                str6 = "audio/vnd.dts";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z113 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i1114 = (z113 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder18.putShort((short) this.zzC);
                                byteBufferOrder18.putShort((short) this.zzD);
                            }
                            zzi zziVar18 = new zzi();
                            zziVar18.zzc(this.zzz);
                            zziVar18.zzb(this.zzB);
                            zziVar18.zzd(this.zzA);
                            zziVar18.zze(bArr);
                            zziVar18.zzf(this.zzo);
                            zziVar18.zza(this.zzo);
                            zzkVarZzg = zziVar18.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1114);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj18 = zzxVar.zzaj();
                zzaeb zzaebVarZzw18 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw18;
                zzaebVarZzw18.zzm(zzzVarZzaj18);
                return;
            case zzbbd.zzt.zzm /* 21 */:
                str6 = "audio/vnd.dts.hd";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z114 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i1115 = (z114 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder19.putShort((short) this.zzC);
                                byteBufferOrder19.putShort((short) this.zzD);
                            }
                            zzi zziVar19 = new zzi();
                            zziVar19.zzc(this.zzz);
                            zziVar19.zzb(this.zzB);
                            zziVar19.zzd(this.zzA);
                            zziVar19.zze(bArr);
                            zziVar19.zzf(this.zzo);
                            zziVar19.zza(this.zzo);
                            zzkVarZzg = zziVar19.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1115);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj19 = zzxVar.zzaj();
                zzaeb zzaebVarZzw19 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw19;
                zzaebVarZzw19.zzm(zzzVarZzaj19);
                return;
            case 22:
                str6 = "audio/flac";
                listZzo2 = Collections.singletonList(zzi(str5));
                str2 = null;
                listZzo = listZzo2;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z115 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i1116 = (z115 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder110.putShort((short) this.zzC);
                                byteBufferOrder110.putShort((short) this.zzD);
                            }
                            zzi zziVar110 = new zzi();
                            zziVar110.zzc(this.zzz);
                            zziVar110.zzb(this.zzB);
                            zziVar110.zzd(this.zzA);
                            zziVar110.zze(bArr);
                            zziVar110.zzf(this.zzo);
                            zziVar110.zza(this.zzo);
                            zzkVarZzg = zziVar110.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1116);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj110 = zzxVar.zzaj();
                zzaeb zzaebVarZzw110 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw110;
                zzaebVarZzw110.zzm(zzzVarZzaj110);
                return;
            case 23:
                if (zzh(new zzed(zzi(this.zzc)))) {
                    iZzn = zzen.zzn(this.zzQ);
                    if (iZzn == 0) {
                        zzdq.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzQ + ". Setting mimeType to audio/x-unknown");
                    } else {
                        list3 = null;
                        str2 = null;
                        i8 = -1;
                    }
                    if (this.zzO != null) {
                        str2 = zzacrVarZza.zza;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z116 = this.zzW;
                    if (true != this.zzV) {
                        i10 = 0;
                    } else {
                        i10 = 2;
                    }
                    int i1117 = (z116 ? 1 : 0) | i10;
                    zzxVar = new zzx();
                    if (!zzay.zzh(str3)) {
                        if (zzay.zzj(str3)) {
                            if (this.zzr == 0) {
                                i14 = this.zzp;
                                iIntValue = -1;
                                if (i14 == -1) {
                                    i14 = this.zzm;
                                }
                                this.zzp = i14;
                                i15 = this.zzq;
                                if (i15 == -1) {
                                    i15 = this.zzn;
                                }
                                this.zzq = i15;
                            } else {
                                iIntValue = -1;
                            }
                            i12 = this.zzp;
                            if (i12 != iIntValue) {
                                f7 = -1.0f;
                            } else {
                                f7 = -1.0f;
                            }
                            if (this.zzy) {
                                if (this.zzE != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder111.put((byte) 0);
                                    byteBufferOrder111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.zzM + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.zzN + 0.5f));
                                    byteBufferOrder111.putShort((short) this.zzC);
                                    byteBufferOrder111.putShort((short) this.zzD);
                                }
                                zzi zziVar111 = new zzi();
                                zziVar111.zzc(this.zzz);
                                zziVar111.zzb(this.zzB);
                                zziVar111.zzd(this.zzA);
                                zziVar111.zze(bArr);
                                zziVar111.zzf(this.zzo);
                                zziVar111.zza(this.zzo);
                                zzkVarZzg = zziVar111.zzg();
                            }
                            if (this.zzb != null) {
                                iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                            }
                            if (this.zzs == 0) {
                                i16 = iIntValue;
                            } else {
                                i16 = iIntValue;
                            }
                            zzxVar.zzai(this.zzm);
                            zzxVar.zzM(this.zzn);
                            zzxVar.zzZ(f7);
                            zzxVar.zzac(i16);
                            zzxVar.zzaa(this.zzw);
                            zzxVar.zzag(this.zzx);
                            zzxVar.zzD(zzkVarZzg);
                            i11 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i11 = 3;
                        }
                        break;
                    } else {
                        zzxVar.zzB(this.zzP);
                        zzxVar.zzae(this.zzR);
                        zzxVar.zzX(iZzn);
                        i11 = 1;
                    }
                    if (this.zzb != null) {
                        zzxVar.zzQ(this.zzb);
                    }
                    zzxVar.zzN(i7);
                    if (true != this.zza) {
                        str4 = "video/x-matroska";
                    } else {
                        str4 = "video/webm";
                    }
                    zzxVar.zzE(str4);
                    zzxVar.zzad(str3);
                    zzxVar.zzT(i8);
                    zzxVar.zzS(this.zzaa);
                    zzxVar.zzaf(i1117);
                    zzxVar.zzP(list3);
                    zzxVar.zzC(str2);
                    zzxVar.zzH(this.zzl);
                    zzz zzzVarZzaj111 = zzxVar.zzaj();
                    zzaeb zzaebVarZzw111 = zzacyVar.zzw(this.zzd, i11);
                    this.zzX = zzaebVarZzw111;
                    zzaebVarZzw111.zzm(zzzVarZzaj111);
                    return;
                }
                zzdq.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                listZzo = null;
                str2 = null;
                str6 = "audio/x-unknown";
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z117 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i1118 = (z117 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder112.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder112.putShort((short) this.zzC);
                                byteBufferOrder112.putShort((short) this.zzD);
                            }
                            zzi zziVar112 = new zzi();
                            zziVar112.zzc(this.zzz);
                            zziVar112.zzb(this.zzB);
                            zziVar112.zzd(this.zzA);
                            zziVar112.zze(bArr);
                            zziVar112.zzf(this.zzo);
                            zziVar112.zza(this.zzo);
                            zzkVarZzg = zziVar112.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1118);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj112 = zzxVar.zzaj();
                zzaeb zzaebVarZzw112 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw112;
                zzaebVarZzw112.zzm(zzzVarZzaj112);
                return;
            case 24:
                iZzn = zzen.zzn(this.zzQ);
                if (iZzn == 0) {
                    zzdq.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzQ + ". Setting mimeType to audio/x-unknown");
                    listZzo = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i8 = -1;
                    list2 = listZzo;
                    iZzn = -1;
                    list3 = list2;
                } else {
                    list3 = null;
                    str2 = null;
                    i8 = -1;
                }
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z118 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i1119 = (z118 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder113.putShort((short) this.zzC);
                                byteBufferOrder113.putShort((short) this.zzD);
                            }
                            zzi zziVar113 = new zzi();
                            zziVar113.zzc(this.zzz);
                            zziVar113.zzb(this.zzB);
                            zziVar113.zzd(this.zzA);
                            zziVar113.zze(bArr);
                            zziVar113.zzf(this.zzo);
                            zziVar113.zza(this.zzo);
                            zzkVarZzg = zziVar113.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1119);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj113 = zzxVar.zzaj();
                zzaeb zzaebVarZzw113 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw113;
                zzaebVarZzw113.zzm(zzzVarZzaj113);
                return;
            case 25:
                int i20 = this.zzQ;
                if (i20 == 8) {
                    iZzn = 3;
                } else if (i20 == 16) {
                    iZzn = 268435456;
                } else if (i20 == 24) {
                    iZzn = 1342177280;
                } else {
                    if (i20 != 32) {
                        zzdq.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i20 + ". Setting mimeType to audio/x-unknown");
                        listZzo = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i8 = -1;
                        list2 = listZzo;
                        iZzn = -1;
                        list3 = list2;
                        if (this.zzO != null) {
                            str2 = zzacrVarZza.zza;
                            str6 = "video/dolby-vision";
                        }
                        str3 = str6;
                        boolean z119 = this.zzW;
                        if (true != this.zzV) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        int i11110 = (z119 ? 1 : 0) | i10;
                        zzxVar = new zzx();
                        if (!zzay.zzh(str3)) {
                            if (zzay.zzj(str3)) {
                                if (this.zzr == 0) {
                                    i14 = this.zzp;
                                    iIntValue = -1;
                                    if (i14 == -1) {
                                        i14 = this.zzm;
                                    }
                                    this.zzp = i14;
                                    i15 = this.zzq;
                                    if (i15 == -1) {
                                        i15 = this.zzn;
                                    }
                                    this.zzq = i15;
                                } else {
                                    iIntValue = -1;
                                }
                                i12 = this.zzp;
                                if (i12 != iIntValue) {
                                    f7 = -1.0f;
                                } else {
                                    f7 = -1.0f;
                                }
                                if (this.zzy) {
                                    if (this.zzE != -1.0f) {
                                        bArr = new byte[25];
                                        ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder114.put((byte) 0);
                                        byteBufferOrder114.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.zzM + 0.5f));
                                        byteBufferOrder114.putShort((short) (this.zzN + 0.5f));
                                        byteBufferOrder114.putShort((short) this.zzC);
                                        byteBufferOrder114.putShort((short) this.zzD);
                                    }
                                    zzi zziVar114 = new zzi();
                                    zziVar114.zzc(this.zzz);
                                    zziVar114.zzb(this.zzB);
                                    zziVar114.zzd(this.zzA);
                                    zziVar114.zze(bArr);
                                    zziVar114.zzf(this.zzo);
                                    zziVar114.zza(this.zzo);
                                    zzkVarZzg = zziVar114.zzg();
                                }
                                if (this.zzb != null) {
                                    iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                                }
                                if (this.zzs == 0) {
                                    i16 = iIntValue;
                                } else {
                                    i16 = iIntValue;
                                }
                                zzxVar.zzai(this.zzm);
                                zzxVar.zzM(this.zzn);
                                zzxVar.zzZ(f7);
                                zzxVar.zzac(i16);
                                zzxVar.zzaa(this.zzw);
                                zzxVar.zzag(this.zzx);
                                zzxVar.zzD(zzkVarZzg);
                                i11 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i11 = 3;
                            }
                            break;
                        } else {
                            zzxVar.zzB(this.zzP);
                            zzxVar.zzae(this.zzR);
                            zzxVar.zzX(iZzn);
                            i11 = 1;
                        }
                        if (this.zzb != null) {
                            zzxVar.zzQ(this.zzb);
                        }
                        zzxVar.zzN(i7);
                        if (true != this.zza) {
                            str4 = "video/x-matroska";
                        } else {
                            str4 = "video/webm";
                        }
                        zzxVar.zzE(str4);
                        zzxVar.zzad(str3);
                        zzxVar.zzT(i8);
                        zzxVar.zzS(this.zzaa);
                        zzxVar.zzaf(i11110);
                        zzxVar.zzP(list3);
                        zzxVar.zzC(str2);
                        zzxVar.zzH(this.zzl);
                        zzz zzzVarZzaj114 = zzxVar.zzaj();
                        zzaeb zzaebVarZzw114 = zzacyVar.zzw(this.zzd, i11);
                        this.zzX = zzaebVarZzw114;
                        zzaebVarZzw114.zzm(zzzVarZzaj114);
                        return;
                    }
                    iZzn = 1610612736;
                }
                list3 = null;
                str2 = null;
                i8 = -1;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z1110 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i11111 = (z1110 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder115.putShort((short) this.zzC);
                                byteBufferOrder115.putShort((short) this.zzD);
                            }
                            zzi zziVar115 = new zzi();
                            zziVar115.zzc(this.zzz);
                            zziVar115.zzb(this.zzB);
                            zziVar115.zzd(this.zzA);
                            zziVar115.zze(bArr);
                            zziVar115.zzf(this.zzo);
                            zziVar115.zza(this.zzo);
                            zzkVarZzg = zziVar115.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i11111);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj115 = zzxVar.zzaj();
                zzaeb zzaebVarZzw115 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw115;
                zzaebVarZzw115.zzm(zzzVarZzaj115);
                return;
            case 26:
                int i21 = this.zzQ;
                if (i21 == 32) {
                    list3 = null;
                    str2 = null;
                    i8 = -1;
                } else {
                    zzdq.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i21 + ". Setting mimeType to audio/x-unknown");
                    listZzo = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i8 = -1;
                    list2 = listZzo;
                    iZzn = -1;
                    list3 = list2;
                }
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z1111 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i11112 = (z1111 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder116.putShort((short) this.zzC);
                                byteBufferOrder116.putShort((short) this.zzD);
                            }
                            zzi zziVar116 = new zzi();
                            zziVar116.zzc(this.zzz);
                            zziVar116.zzb(this.zzB);
                            zziVar116.zzd(this.zzA);
                            zziVar116.zze(bArr);
                            zziVar116.zzf(this.zzo);
                            zziVar116.zza(this.zzo);
                            zzkVarZzg = zziVar116.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i11112);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj116 = zzxVar.zzaj();
                zzaeb zzaebVarZzw116 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw116;
                zzaebVarZzw116.zzm(zzzVarZzaj116);
                return;
            case 27:
                str6 = "application/x-subrip";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z1112 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i11113 = (z1112 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder117.putShort((short) this.zzC);
                                byteBufferOrder117.putShort((short) this.zzD);
                            }
                            zzi zziVar117 = new zzi();
                            zziVar117.zzc(this.zzz);
                            zziVar117.zzb(this.zzB);
                            zziVar117.zzd(this.zzA);
                            zziVar117.zze(bArr);
                            zziVar117.zzf(this.zzo);
                            zziVar117.zza(this.zzo);
                            zzkVarZzg = zziVar117.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i11113);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj117 = zzxVar.zzaj();
                zzaeb zzaebVarZzw117 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw117;
                zzaebVarZzw117.zzm(zzzVarZzaj117);
                return;
            case 28:
                str6 = "text/x-ssa";
                listZzo2 = zzfwh.zzp(zzagy.zzb, zzi(this.zzc));
                str2 = null;
                listZzo = listZzo2;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z1113 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i11114 = (z1113 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder118.putShort((short) this.zzC);
                                byteBufferOrder118.putShort((short) this.zzD);
                            }
                            zzi zziVar118 = new zzi();
                            zziVar118.zzc(this.zzz);
                            zziVar118.zzb(this.zzB);
                            zziVar118.zzd(this.zzA);
                            zziVar118.zze(bArr);
                            zziVar118.zzf(this.zzo);
                            zziVar118.zza(this.zzo);
                            zzkVarZzg = zziVar118.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i11114);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj118 = zzxVar.zzaj();
                zzaeb zzaebVarZzw118 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw118;
                zzaebVarZzw118.zzm(zzzVarZzaj118);
                return;
            case 29:
                str6 = "text/vtt";
                listZzo = null;
                str2 = null;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z1114 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i11115 = (z1114 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder119.putShort((short) this.zzC);
                                byteBufferOrder119.putShort((short) this.zzD);
                            }
                            zzi zziVar119 = new zzi();
                            zziVar119.zzc(this.zzz);
                            zziVar119.zzb(this.zzB);
                            zziVar119.zzd(this.zzA);
                            zziVar119.zze(bArr);
                            zziVar119.zzf(this.zzo);
                            zziVar119.zza(this.zzo);
                            zzkVarZzg = zziVar119.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i11115);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj119 = zzxVar.zzaj();
                zzaeb zzaebVarZzw119 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw119;
                zzaebVarZzw119.zzm(zzzVarZzaj119);
                return;
            case 30:
                str2 = null;
                str6 = "application/vobsub";
                listZzo = zzfwh.zzo(zzi(str5));
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z1115 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i11116 = (z1115 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder1110.putShort((short) this.zzC);
                                byteBufferOrder1110.putShort((short) this.zzD);
                            }
                            zzi zziVar1110 = new zzi();
                            zziVar1110.zzc(this.zzz);
                            zziVar1110.zzb(this.zzB);
                            zziVar1110.zzd(this.zzA);
                            zziVar1110.zze(bArr);
                            zziVar1110.zzf(this.zzo);
                            zziVar1110.zza(this.zzo);
                            zzkVarZzg = zziVar1110.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i11116);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj1110 = zzxVar.zzaj();
                zzaeb zzaebVarZzw1110 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw1110;
                zzaebVarZzw1110.zzm(zzzVarZzaj1110);
                return;
            case 31:
                listZzo = null;
                str2 = null;
                str6 = "application/pgs";
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z1116 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i11117 = (z1116 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder1111.putShort((short) this.zzC);
                                byteBufferOrder1111.putShort((short) this.zzD);
                            }
                            zzi zziVar1111 = new zzi();
                            zziVar1111.zzc(this.zzz);
                            zziVar1111.zzb(this.zzB);
                            zziVar1111.zzd(this.zzA);
                            zziVar1111.zze(bArr);
                            zziVar1111.zzf(this.zzo);
                            zziVar1111.zza(this.zzo);
                            zzkVarZzg = zziVar1111.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i11117);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj1111 = zzxVar.zzaj();
                zzaeb zzaebVarZzw1111 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw1111;
                zzaebVarZzw1111.zzm(zzzVarZzaj1111);
                return;
            case 32:
                byte[] bArr5 = new byte[4];
                System.arraycopy(zzi(str5), 0, bArr5, 0, 4);
                str6 = "application/dvbsubs";
                listZzo2 = zzfwh.zzo(bArr5);
                str2 = null;
                listZzo = listZzo2;
                i8 = -1;
                list2 = listZzo;
                iZzn = -1;
                list3 = list2;
                if (this.zzO != null) {
                    str2 = zzacrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                boolean z1117 = this.zzW;
                if (true != this.zzV) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                int i11118 = (z1117 ? 1 : 0) | i10;
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    if (zzay.zzj(str3)) {
                        if (this.zzr == 0) {
                            i14 = this.zzp;
                            iIntValue = -1;
                            if (i14 == -1) {
                                i14 = this.zzm;
                            }
                            this.zzp = i14;
                            i15 = this.zzq;
                            if (i15 == -1) {
                                i15 = this.zzn;
                            }
                            this.zzq = i15;
                        } else {
                            iIntValue = -1;
                        }
                        i12 = this.zzp;
                        if (i12 != iIntValue) {
                            f7 = -1.0f;
                        } else {
                            f7 = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1112.put((byte) 0);
                                byteBufferOrder1112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.zzN + 0.5f));
                                byteBufferOrder1112.putShort((short) this.zzC);
                                byteBufferOrder1112.putShort((short) this.zzD);
                            }
                            zzi zziVar1112 = new zzi();
                            zziVar1112.zzc(this.zzz);
                            zziVar1112.zzb(this.zzB);
                            zziVar1112.zzd(this.zzA);
                            zziVar1112.zze(bArr);
                            zziVar1112.zzf(this.zzo);
                            zziVar1112.zza(this.zzo);
                            zzkVarZzg = zziVar1112.zzg();
                        }
                        if (this.zzb != null) {
                            iIntValue = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i16 = iIntValue;
                        } else {
                            i16 = iIntValue;
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i16);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVarZzg);
                        i11 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i11 = 3;
                    }
                    break;
                } else {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(iZzn);
                    i11 = 1;
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                if (true != this.zza) {
                    str4 = "video/x-matroska";
                } else {
                    str4 = "video/webm";
                }
                zzxVar.zzE(str4);
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i11118);
                zzxVar.zzP(list3);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzzVarZzaj1112 = zzxVar.zzaj();
                zzaeb zzaebVarZzw1112 = zzacyVar.zzw(this.zzd, i11);
                this.zzX = zzaebVarZzw1112;
                zzaebVarZzw1112.zzm(zzzVarZzaj1112);
                return;
            default:
                throw zzaz.zza("Unrecognized codec identifier.", null);
        }
    }
}
