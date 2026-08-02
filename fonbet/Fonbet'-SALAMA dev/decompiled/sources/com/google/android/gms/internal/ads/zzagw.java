package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbbd;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
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

    private static Pair zzf(zzed zzedVar) {
        try {
            zzedVar.zzM(16);
            long zzs = zzedVar.zzs();
            if (zzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzs != 826496599) {
                zzdq.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzd = zzedVar.zzd() + 20;
            byte[] zzN = zzedVar.zzN();
            while (true) {
                int length = zzN.length;
                if (zzd >= length - 4) {
                    throw zzaz.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i7 = zzd + 1;
                if (zzN[zzd] == 0 && zzN[i7] == 0 && zzN[zzd + 2] == 1 && zzN[zzd + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzN, zzd, length)));
                }
                zzd = i7;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) {
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

    private static boolean zzh(zzed zzedVar) {
        try {
            int zzk = zzedVar.zzk();
            if (zzk == 1) {
                return true;
            }
            if (zzk == 65534) {
                zzedVar.zzL(24);
                if (zzedVar.zzt() == zzagy.zze.getMostSignificantBits()) {
                    if (zzedVar.zzt() == zzagy.zze.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzaz.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03ee  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v101, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzacy zzacyVar, int i7) {
        char c3;
        ?? r22;
        String str;
        String str2;
        zzfwh zzfwhVar;
        int i8;
        zzfwh zzfwhVar2;
        int i9;
        zzfwh zzfwhVar3;
        zzfwh zzfwhVar4;
        String str3;
        zzx zzxVar;
        int i10;
        int i11;
        int i12;
        zzacr zza;
        zzfwh zzfwhVar5;
        String str4 = this.zzc;
        int i13 = 4;
        int i14 = 0;
        switch (str4.hashCode()) {
            case -2095576542:
                if (str4.equals("V_MPEG4/ISO/AP")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -2095575984:
                if (str4.equals("V_MPEG4/ISO/SP")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -1985379776:
                if (str4.equals("A_MS/ACM")) {
                    c3 = 23;
                    break;
                }
                c3 = 65535;
                break;
            case -1784763192:
                if (str4.equals("A_TRUEHD")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case -1730367663:
                if (str4.equals("A_VORBIS")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case -1482641358:
                if (str4.equals("A_MPEG/L2")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case -1482641357:
                if (str4.equals("A_MPEG/L3")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case -1373388978:
                if (str4.equals("V_MS/VFW/FOURCC")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case -933872740:
                if (str4.equals("S_DVBSUB")) {
                    c3 = ' ';
                    break;
                }
                c3 = 65535;
                break;
            case -538363189:
                if (str4.equals("V_MPEG4/ISO/ASP")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -538363109:
                if (str4.equals("V_MPEG4/ISO/AVC")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case -425012669:
                if (str4.equals("S_VOBSUB")) {
                    c3 = 30;
                    break;
                }
                c3 = 65535;
                break;
            case -356037306:
                if (str4.equals("A_DTS/LOSSLESS")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            case 62923557:
                if (str4.equals("A_AAC")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 62923603:
                if (str4.equals("A_AC3")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 62927045:
                if (str4.equals("A_DTS")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 82318131:
                if (str4.equals("V_AV1")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 82338133:
                if (str4.equals("V_VP8")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 82338134:
                if (str4.equals("V_VP9")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 99146302:
                if (str4.equals("S_HDMV/PGS")) {
                    c3 = 31;
                    break;
                }
                c3 = 65535;
                break;
            case 444813526:
                if (str4.equals("V_THEORA")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 542569478:
                if (str4.equals("A_DTS/EXPRESS")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 635596514:
                if (str4.equals("A_PCM/FLOAT/IEEE")) {
                    c3 = 26;
                    break;
                }
                c3 = 65535;
                break;
            case 725948237:
                if (str4.equals("A_PCM/INT/BIG")) {
                    c3 = 25;
                    break;
                }
                c3 = 65535;
                break;
            case 725957860:
                if (str4.equals("A_PCM/INT/LIT")) {
                    c3 = 24;
                    break;
                }
                c3 = 65535;
                break;
            case 738597099:
                if (str4.equals("S_TEXT/ASS")) {
                    c3 = 28;
                    break;
                }
                c3 = 65535;
                break;
            case 855502857:
                if (str4.equals("V_MPEGH/ISO/HEVC")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 1045209816:
                if (str4.equals("S_TEXT/WEBVTT")) {
                    c3 = 29;
                    break;
                }
                c3 = 65535;
                break;
            case 1422270023:
                if (str4.equals("S_TEXT/UTF8")) {
                    c3 = 27;
                    break;
                }
                c3 = 65535;
                break;
            case 1809237540:
                if (str4.equals("V_MPEG2")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1950749482:
                if (str4.equals("A_EAC3")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 1950789798:
                if (str4.equals("A_FLAC")) {
                    c3 = 22;
                    break;
                }
                c3 = 65535;
                break;
            case 1951062397:
                if (str4.equals("A_OPUS")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        String str5 = "audio/raw";
        zzk zzkVar = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        byte[] bArr = null;
        switch (c3) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null && (zza = zzacr.zza(new zzed(this.zzO))) != null) {
                    str2 = zza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                int i15 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                    zzxVar.zzB(this.zzP);
                    zzxVar.zzae(this.zzR);
                    zzxVar.zzX(i13);
                    i10 = 1;
                } else if (zzay.zzj(str3)) {
                    if (this.zzr == 0) {
                        int i16 = this.zzp;
                        i11 = -1;
                        if (i16 == -1) {
                            i16 = this.zzm;
                        }
                        this.zzp = i16;
                        int i17 = this.zzq;
                        if (i17 == -1) {
                            i17 = this.zzn;
                        }
                        this.zzq = i17;
                    } else {
                        i11 = -1;
                    }
                    float f7 = (this.zzp == i11 || (i12 = this.zzq) == i11) ? -1.0f : (this.zzn * r7) / (this.zzm * i12);
                    if (this.zzy) {
                        if (this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f && this.zzM != -1.0f && this.zzN != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            order.putShort((short) (this.zzM + 0.5f));
                            order.putShort((short) (this.zzN + 0.5f));
                            order.putShort((short) this.zzC);
                            order.putShort((short) this.zzD);
                        }
                        zzi zziVar = new zzi();
                        zziVar.zzc(this.zzz);
                        zziVar.zzb(this.zzB);
                        zziVar.zzd(this.zzA);
                        zziVar.zze(bArr);
                        zziVar.zzf(this.zzo);
                        zziVar.zza(this.zzo);
                        zzkVar = zziVar.zzg();
                    }
                    if (this.zzb != null && zzagy.zzf.containsKey(this.zzb)) {
                        i11 = ((Integer) zzagy.zzf.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0 && Float.compare(this.zzt, 0.0f) == 0 && Float.compare(this.zzu, 0.0f) == 0) {
                        if (Float.compare(this.zzv, 0.0f) != 0) {
                            if (Float.compare(this.zzv, 90.0f) == 0) {
                                i14 = 90;
                            } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                                i14 = 180;
                            } else if (Float.compare(this.zzv, -90.0f) == 0) {
                                i14 = 270;
                            }
                        }
                        zzxVar.zzai(this.zzm);
                        zzxVar.zzM(this.zzn);
                        zzxVar.zzZ(f7);
                        zzxVar.zzac(i14);
                        zzxVar.zzaa(this.zzw);
                        zzxVar.zzag(this.zzx);
                        zzxVar.zzD(zzkVar);
                        i10 = 2;
                    }
                    i14 = i11;
                    zzxVar.zzai(this.zzm);
                    zzxVar.zzM(this.zzn);
                    zzxVar.zzZ(f7);
                    zzxVar.zzac(i14);
                    zzxVar.zzaa(this.zzw);
                    zzxVar.zzag(this.zzx);
                    zzxVar.zzD(zzkVar);
                    i10 = 2;
                } else {
                    if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzaz.zza("Unexpected MIME type.", null);
                    }
                    i10 = 3;
                }
                if (this.zzb != null && !zzagy.zzf.containsKey(this.zzb)) {
                    zzxVar.zzQ(this.zzb);
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj = zzxVar.zzaj();
                zzaeb zzw = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw;
                zzw.zzm(zzaj);
                return;
            case 1:
                byte[] bArr2 = this.zzk;
                str5 = "video/x-vnd.on2.vp9";
                zzfwhVar5 = bArr2 == null ? null : zzfwh.zzo(bArr2);
                str2 = null;
                zzfwhVar = zzfwhVar5;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                    str2 = zza.zza;
                    str5 = "video/dolby-vision";
                    break;
                }
                str3 = str5;
                int i152 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                    zzxVar.zzQ(this.zzb);
                    break;
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2 = zzxVar.zzaj();
                zzaeb zzw2 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2;
                zzw2.zzm(zzaj2);
                return;
            case 2:
                byte[] bArr3 = this.zzk;
                str5 = "video/av01";
                zzfwhVar5 = bArr3 == null ? null : zzfwh.zzo(bArr3);
                str2 = null;
                zzfwhVar = zzfwhVar5;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i1522 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1522);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj22 = zzxVar.zzaj();
                zzaeb zzw22 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw22;
                zzw22.zzm(zzaj22);
                return;
            case 3:
                str5 = "video/mpeg2";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222 = zzxVar.zzaj();
                zzaeb zzw222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222;
                zzw222.zzm(zzaj222);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.zzk;
                str5 = "video/mp4v-es";
                zzfwhVar5 = bArr4 == null ? null : Collections.singletonList(bArr4);
                str2 = null;
                zzfwhVar = zzfwhVar5;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i152222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2222 = zzxVar.zzaj();
                zzaeb zzw2222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2222;
                zzw2222.zzm(zzaj2222);
                return;
            case 7:
                zzabz zza2 = zzabz.zza(new zzed(zzi(this.zzc)));
                r22 = zza2.zza;
                this.zzY = zza2.zzb;
                str = zza2.zzl;
                str5 = "video/avc";
                str2 = str;
                zzfwhVar = r22;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i1522222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1522222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj22222 = zzxVar.zzaj();
                zzaeb zzw22222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw22222;
                zzw22222.zzm(zzaj22222);
                return;
            case '\b':
                zzadk zza3 = zzadk.zza(new zzed(zzi(this.zzc)));
                r22 = zza3.zza;
                this.zzY = zza3.zzb;
                str = zza3.zzl;
                str5 = "video/hevc";
                str2 = str;
                zzfwhVar = r22;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222222 = zzxVar.zzaj();
                zzaeb zzw222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222222;
                zzw222222.zzm(zzaj222222);
                return;
            case '\t':
                Pair zzf = zzf(new zzed(zzi(this.zzc)));
                str5 = (String) zzf.first;
                zzfwhVar5 = (List) zzf.second;
                str2 = null;
                zzfwhVar = zzfwhVar5;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i152222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2222222 = zzxVar.zzaj();
                zzaeb zzw2222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2222222;
                zzw2222222.zzm(zzaj2222222);
                return;
            case '\n':
                str5 = "video/x-unknown";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i1522222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1522222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj22222222 = zzxVar.zzaj();
                zzaeb zzw22222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw22222222;
                zzw22222222.zzm(zzaj22222222);
                return;
            case 11:
                i8 = 8192;
                str5 = "audio/vorbis";
                zzfwhVar2 = zzg(zzi(str4));
                str2 = null;
                zzfwhVar3 = zzfwhVar2;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222222222 = zzxVar.zzaj();
                zzaeb zzw222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222222222;
                zzw222222222.zzm(zzaj222222222);
                return;
            case '\f':
                ?? arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzc));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(allocate.order(byteOrder).putLong(this.zzS).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzT).array());
                i8 = 5760;
                str5 = "audio/opus";
                zzfwhVar2 = arrayList;
                str2 = null;
                zzfwhVar3 = zzfwhVar2;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i152222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2222222222 = zzxVar.zzaj();
                zzaeb zzw2222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2222222222;
                zzw2222222222.zzm(zzaj2222222222);
                return;
            case '\r':
                ?? singletonList = Collections.singletonList(zzi(str4));
                zzabp zza4 = zzabr.zza(this.zzk);
                this.zzR = zza4.zza;
                this.zzP = zza4.zzb;
                str5 = "audio/mp4a-latm";
                str2 = zza4.zzc;
                zzfwhVar = singletonList;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i1522222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1522222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj22222222222 = zzxVar.zzaj();
                zzaeb zzw22222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw22222222222;
                zzw22222222222.zzm(zzaj22222222222);
                return;
            case 14:
                i9 = 4096;
                str5 = "audio/mpeg-L2";
                i8 = i9;
                zzfwhVar3 = null;
                str2 = null;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222222222222 = zzxVar.zzaj();
                zzaeb zzw222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222222222222;
                zzw222222222222.zzm(zzaj222222222222);
                return;
            case 15:
                i9 = 4096;
                str5 = "audio/mpeg";
                i8 = i9;
                zzfwhVar3 = null;
                str2 = null;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i152222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2222222222222 = zzxVar.zzaj();
                zzaeb zzw2222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2222222222222;
                zzw2222222222222.zzm(zzaj2222222222222);
                return;
            case 16:
                str5 = "audio/ac3";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i1522222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1522222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj22222222222222 = zzxVar.zzaj();
                zzaeb zzw22222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw22222222222222;
                zzw22222222222222.zzm(zzaj22222222222222);
                return;
            case 17:
                str5 = "audio/eac3";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222222222222222 = zzxVar.zzaj();
                zzaeb zzw222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222222222222222;
                zzw222222222222222.zzm(zzaj222222222222222);
                return;
            case 18:
                this.zzU = new zzaec();
                str5 = "audio/true-hd";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i152222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2222222222222222 = zzxVar.zzaj();
                zzaeb zzw2222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2222222222222222;
                zzw2222222222222222.zzm(zzaj2222222222222222);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i1522222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1522222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj22222222222222222 = zzxVar.zzaj();
                zzaeb zzw22222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw22222222222222222;
                zzw22222222222222222.zzm(zzaj22222222222222222);
                return;
            case zzbbd.zzt.zzm /* 21 */:
                str5 = "audio/vnd.dts.hd";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222222222222222222 = zzxVar.zzaj();
                zzaeb zzw222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222222222222222222;
                zzw222222222222222222.zzm(zzaj222222222222222222);
                return;
            case 22:
                str5 = "audio/flac";
                zzfwhVar5 = Collections.singletonList(zzi(str4));
                str2 = null;
                zzfwhVar = zzfwhVar5;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i152222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2222222222222222222 = zzxVar.zzaj();
                zzaeb zzw2222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2222222222222222222;
                zzw2222222222222222222.zzm(zzaj2222222222222222222);
                return;
            case 23:
                if (zzh(new zzed(zzi(this.zzc)))) {
                    i13 = zzen.zzn(this.zzQ);
                    if (i13 == 0) {
                        zzdq.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzQ + ". Setting mimeType to audio/x-unknown");
                    }
                    zzfwhVar4 = null;
                    str2 = null;
                    i8 = -1;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i1522222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                    zzxVar = new zzx();
                    if (!zzay.zzh(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zzxVar.zzN(i7);
                    zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                    zzxVar.zzad(str3);
                    zzxVar.zzT(i8);
                    zzxVar.zzS(this.zzaa);
                    zzxVar.zzaf(i1522222222222222222222);
                    zzxVar.zzP(zzfwhVar4);
                    zzxVar.zzC(str2);
                    zzxVar.zzH(this.zzl);
                    zzz zzaj22222222222222222222 = zzxVar.zzaj();
                    zzaeb zzw22222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                    this.zzX = zzw22222222222222222222;
                    zzw22222222222222222222.zzm(zzaj22222222222222222222);
                    return;
                }
                zzdq.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                zzfwhVar = null;
                str2 = null;
                str5 = "audio/x-unknown";
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222222222222222222222;
                zzw222222222222222222222.zzm(zzaj222222222222222222222);
                return;
            case 24:
                i13 = zzen.zzn(this.zzQ);
                if (i13 == 0) {
                    zzdq.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzQ + ". Setting mimeType to audio/x-unknown");
                    zzfwhVar = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i8 = -1;
                    zzfwhVar3 = zzfwhVar;
                    i13 = -1;
                    zzfwhVar4 = zzfwhVar3;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i152222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                    zzxVar = new zzx();
                    if (!zzay.zzh(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zzxVar.zzN(i7);
                    zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                    zzxVar.zzad(str3);
                    zzxVar.zzT(i8);
                    zzxVar.zzS(this.zzaa);
                    zzxVar.zzaf(i152222222222222222222222);
                    zzxVar.zzP(zzfwhVar4);
                    zzxVar.zzC(str2);
                    zzxVar.zzH(this.zzl);
                    zzz zzaj2222222222222222222222 = zzxVar.zzaj();
                    zzaeb zzw2222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                    this.zzX = zzw2222222222222222222222;
                    zzw2222222222222222222222.zzm(zzaj2222222222222222222222);
                    return;
                }
                zzfwhVar4 = null;
                str2 = null;
                i8 = -1;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i1522222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1522222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj22222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw22222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw22222222222222222222222;
                zzw22222222222222222222222.zzm(zzaj22222222222222222222222);
                return;
            case 25:
                int i18 = this.zzQ;
                if (i18 == 8) {
                    i13 = 3;
                } else if (i18 == 16) {
                    i13 = 268435456;
                } else if (i18 == 24) {
                    i13 = 1342177280;
                } else {
                    if (i18 != 32) {
                        zzdq.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i18 + ". Setting mimeType to audio/x-unknown");
                        zzfwhVar = null;
                        str2 = null;
                        str5 = "audio/x-unknown";
                        i8 = -1;
                        zzfwhVar3 = zzfwhVar;
                        i13 = -1;
                        zzfwhVar4 = zzfwhVar3;
                        if (this.zzO != null) {
                        }
                        str3 = str5;
                        int i15222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                        zzxVar = new zzx();
                        if (!zzay.zzh(str3)) {
                        }
                        if (this.zzb != null) {
                        }
                        zzxVar.zzN(i7);
                        zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                        zzxVar.zzad(str3);
                        zzxVar.zzT(i8);
                        zzxVar.zzS(this.zzaa);
                        zzxVar.zzaf(i15222222222222222222222222);
                        zzxVar.zzP(zzfwhVar4);
                        zzxVar.zzC(str2);
                        zzxVar.zzH(this.zzl);
                        zzz zzaj222222222222222222222222 = zzxVar.zzaj();
                        zzaeb zzw222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                        this.zzX = zzw222222222222222222222222;
                        zzw222222222222222222222222.zzm(zzaj222222222222222222222222);
                        return;
                    }
                    i13 = 1610612736;
                }
                zzfwhVar4 = null;
                str2 = null;
                i8 = -1;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i152222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152222222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2222222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw2222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2222222222222222222222222;
                zzw2222222222222222222222222.zzm(zzaj2222222222222222222222222);
                return;
            case 26:
                int i19 = this.zzQ;
                if (i19 != 32) {
                    zzdq.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i19 + ". Setting mimeType to audio/x-unknown");
                    zzfwhVar = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i8 = -1;
                    zzfwhVar3 = zzfwhVar;
                    i13 = -1;
                    zzfwhVar4 = zzfwhVar3;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i1522222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                    zzxVar = new zzx();
                    if (!zzay.zzh(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zzxVar.zzN(i7);
                    zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                    zzxVar.zzad(str3);
                    zzxVar.zzT(i8);
                    zzxVar.zzS(this.zzaa);
                    zzxVar.zzaf(i1522222222222222222222222222);
                    zzxVar.zzP(zzfwhVar4);
                    zzxVar.zzC(str2);
                    zzxVar.zzH(this.zzl);
                    zzz zzaj22222222222222222222222222 = zzxVar.zzaj();
                    zzaeb zzw22222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                    this.zzX = zzw22222222222222222222222222;
                    zzw22222222222222222222222222.zzm(zzaj22222222222222222222222222);
                    return;
                }
                zzfwhVar4 = null;
                str2 = null;
                i8 = -1;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222222222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222222222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw222222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222222222222222222222222222;
                zzw222222222222222222222222222.zzm(zzaj222222222222222222222222222);
                return;
            case 27:
                str5 = "application/x-subrip";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i152222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152222222222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2222222222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw2222222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2222222222222222222222222222;
                zzw2222222222222222222222222222.zzm(zzaj2222222222222222222222222222);
                return;
            case 28:
                str5 = "text/x-ssa";
                zzfwhVar5 = zzfwh.zzp(zzagy.zzb, zzi(this.zzc));
                str2 = null;
                zzfwhVar = zzfwhVar5;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i1522222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1522222222222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj22222222222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw22222222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw22222222222222222222222222222;
                zzw22222222222222222222222222222.zzm(zzaj22222222222222222222222222222);
                return;
            case 29:
                str5 = "text/vtt";
                zzfwhVar = null;
                str2 = null;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222222222222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222222222222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw222222222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222222222222222222222222222222;
                zzw222222222222222222222222222222.zzm(zzaj222222222222222222222222222222);
                return;
            case 30:
                str2 = null;
                str5 = "application/vobsub";
                zzfwhVar = zzfwh.zzo(zzi(str4));
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i152222222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i152222222222222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj2222222222222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw2222222222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw2222222222222222222222222222222;
                zzw2222222222222222222222222222222.zzm(zzaj2222222222222222222222222222222);
                return;
            case 31:
                zzfwhVar = null;
                str2 = null;
                str5 = "application/pgs";
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i1522222222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i1522222222222222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj22222222222222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw22222222222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw22222222222222222222222222222222;
                zzw22222222222222222222222222222222.zzm(zzaj22222222222222222222222222222222);
                return;
            case ' ':
                byte[] bArr5 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr5, 0, 4);
                str5 = "application/dvbsubs";
                zzfwhVar5 = zzfwh.zzo(bArr5);
                str2 = null;
                zzfwhVar = zzfwhVar5;
                i8 = -1;
                zzfwhVar3 = zzfwhVar;
                i13 = -1;
                zzfwhVar4 = zzfwhVar3;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i15222222222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                zzxVar = new zzx();
                if (!zzay.zzh(str3)) {
                }
                if (this.zzb != null) {
                }
                zzxVar.zzN(i7);
                zzxVar.zzE(true == this.zza ? "video/x-matroska" : "video/webm");
                zzxVar.zzad(str3);
                zzxVar.zzT(i8);
                zzxVar.zzS(this.zzaa);
                zzxVar.zzaf(i15222222222222222222222222222222222);
                zzxVar.zzP(zzfwhVar4);
                zzxVar.zzC(str2);
                zzxVar.zzH(this.zzl);
                zzz zzaj222222222222222222222222222222222 = zzxVar.zzaj();
                zzaeb zzw222222222222222222222222222222222 = zzacyVar.zzw(this.zzd, i10);
                this.zzX = zzw222222222222222222222222222222222;
                zzw222222222222222222222222222222222.zzm(zzaj222222222222222222222222222222222);
                return;
            default:
                throw zzaz.zza("Unrecognized codec identifier.", null);
        }
    }
}
