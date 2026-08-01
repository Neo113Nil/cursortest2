package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaks {
    public byte[] zzO;
    public zzahu zzV;
    public boolean zzX;
    public zzaht zzZ;
    public boolean zza;
    public zzv zzaa;
    public int zzab;
    private int zzac;
    public String zzb;
    public String zzc;
    public int zzd;
    public long zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public boolean zzi;
    public byte[] zzj;
    public zzahs zzk;
    public byte[] zzl;
    public zzq zzm;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = -1;
    public int zzs = 0;
    public int zzt = -1;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public float zzw = 0.0f;
    public byte[] zzx = null;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
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
    public int zzR = -1;
    public int zzS = 8000;
    public long zzT = 0;
    public long zzU = 0;
    public boolean zzW = false;
    public boolean zzY = true;
    private String zzad = "eng";

    protected zzaks() {
    }

    private static Pair zzf(zzeu zzeuVar) throws zzat {
        try {
            zzeuVar.zzk(16);
            long zzA = zzeuVar.zzA();
            if (zzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzA != 826496599) {
                zzeh.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzg = zzeuVar.zzg() + 20;
            byte[] zzi = zzeuVar.zzi();
            while (true) {
                int length = zzi.length;
                if (zzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i = zzg + 1;
                if (zzi[zzg] == 0 && zzi[i] == 0 && zzi[zzg + 2] == 1 && zzi[zzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzi, zzg, length)));
                }
                zzg = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private final boolean zzh(zzeu zzeuVar) throws zzat {
        UUID uuid;
        UUID uuid2;
        try {
            int zzu = zzeuVar.zzu();
            if (zzu == 1) {
                return true;
            }
            if (zzu == 65534) {
                zzeuVar.zzh(20);
                int zzI = zzeuVar.zzI();
                if (zzft.zza(zzI, this.zzP)) {
                    this.zzR = zzft.zzb(zzI);
                }
                long zzD = zzeuVar.zzD();
                uuid = zzakt.zzf;
                if (zzD == uuid.getMostSignificantBits()) {
                    long zzD2 = zzeuVar.zzD();
                    uuid2 = zzakt.zzf;
                    if (zzD2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzl;
        if (bArr != null) {
            return bArr;
        }
        String.valueOf(str);
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x049a  */
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(int i) throws zzat {
        char c;
        List zzj;
        int i2;
        int i3;
        int i4;
        int i5;
        List list;
        String str;
        int i6;
        int i7;
        int i8;
        List list2;
        String str2;
        int i9;
        int i10;
        List zzg;
        int i11;
        byte[] bArr;
        String str3;
        String str4;
        int i12;
        int i13;
        byte[] bArr2;
        int i14;
        Map map;
        Map map2;
        int i15;
        Map map3;
        zzfw zza;
        String str5 = this.zzc;
        switch (str5.hashCode()) {
            case -2095576542:
                if (str5.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str5.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str5.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str5.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str5.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str5.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str5.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str5.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str5.equals("S_DVBSUB")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str5.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str5.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str5.equals("S_VOBSUB")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str5.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str5.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str5.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str5.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str5.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str5.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str5.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str5.equals("S_HDMV/PGS")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str5.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str5.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str5.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str5.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str5.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str5.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 738614379:
                if (str5.equals("S_TEXT/SSA")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str5.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str5.equals("S_TEXT/WEBVTT")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str5.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str5.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str5.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str5.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str5.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str6 = "audio/raw";
        switch (c) {
            case 0:
                str6 = "video/x-vnd.on2.vp8";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null || (zza = zzfw.zza(new zzeu(this.zzO))) == null) {
                    str3 = str6;
                    str4 = str;
                } else {
                    str4 = zza.zza;
                    str3 = "video/dolby-vision";
                }
                int i16 = i8;
                int i17 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar = new zzt();
                if (!zzas.zza(str3)) {
                    zztVar.zzH(this.zzP);
                    zztVar.zzI(this.zzR);
                    zztVar.zzJ(this.zzS);
                    zztVar.zzK(i7);
                } else if (zzas.zzb(str3)) {
                    if (this.zzs == 0) {
                        int i18 = this.zzq;
                        i12 = -1;
                        if (i18 == -1) {
                            i18 = this.zzn;
                        }
                        this.zzq = i18;
                        int i19 = this.zzr;
                        if (i19 == -1) {
                            i19 = this.zzo;
                        }
                        this.zzr = i19;
                    } else {
                        i12 = -1;
                    }
                    float f = (this.zzq == i12 || (i15 = this.zzr) == i12) ? -1.0f : (this.zzo * r1) / (this.zzn * i15);
                    if (i5 == i12) {
                        if (i4 != i12) {
                            i5 = i12;
                        } else if (i3 == i12 || this.zzB != i12) {
                            i5 = this.zzz;
                            i4 = this.zzA;
                            i3 = this.zzB;
                        } else {
                            i5 = this.zzz;
                            i4 = this.zzA;
                        }
                    }
                    if (i6 == i12 && (i6 = this.zzp) == i12) {
                        i6 = 8;
                    }
                    if (i2 == i12) {
                        int i20 = this.zzp;
                        i2 = i20 == i12 ? 8 : i20;
                    }
                    if (this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f) {
                        i13 = 0;
                        bArr2 = null;
                    } else if (this.zzN == -1.0f) {
                        bArr2 = null;
                        i13 = 0;
                    } else {
                        bArr2 = new byte[25];
                        ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                        i13 = 0;
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
                    zzh zzhVar = new zzh();
                    zzhVar.zza(i5);
                    zzhVar.zzb(i3);
                    zzhVar.zzc(i4);
                    zzhVar.zzd(bArr2);
                    zzhVar.zze(i6);
                    zzhVar.zzf(i2);
                    zzi zzg2 = zzhVar.zzg();
                    if (this.zzb != null) {
                        int i21 = zzakt.zza;
                        String str7 = this.zzb;
                        map = zzakt.zzg;
                        if (map.containsKey(str7)) {
                            String str8 = this.zzb;
                            map2 = zzakt.zzg;
                            i12 = ((Integer) map2.get(str8)).intValue();
                        }
                    }
                    if (this.zzt == 0 && Float.compare(this.zzu, 0.0f) == 0 && Float.compare(this.zzv, 0.0f) == 0) {
                        if (Float.compare(this.zzw, 0.0f) == 0) {
                            i14 = i13;
                        } else if (Float.compare(this.zzw, 90.0f) == 0) {
                            i14 = 90;
                        } else if (Float.compare(this.zzw, -180.0f) == 0 || Float.compare(this.zzw, 180.0f) == 0) {
                            i14 = 180;
                        } else if (Float.compare(this.zzw, -90.0f) == 0) {
                            i14 = 270;
                        }
                        zztVar.zzv(this.zzn);
                        zztVar.zzw(this.zzo);
                        zztVar.zzC(f);
                        zztVar.zzA(i14);
                        zztVar.zzD(this.zzx);
                        zztVar.zzE(this.zzy);
                        zztVar.zzF(zzg2);
                    }
                    i14 = i12;
                    zztVar.zzv(this.zzn);
                    zztVar.zzw(this.zzo);
                    zztVar.zzC(f);
                    zztVar.zzA(i14);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(this.zzy);
                    zztVar.zzF(zzg2);
                } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i22 = zzakt.zza;
                    String str9 = this.zzb;
                    map3 = zzakt.zzg;
                    if (!map3.containsKey(str9)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                zztVar.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzo(str3);
                zztVar.zzp(i16);
                zztVar.zze(this.zzad);
                zztVar.zzf(i17);
                zztVar.zzr(list);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzm);
                this.zzaa = zztVar.zzQ();
                return;
            case 1:
                byte[] bArr3 = this.zzl;
                zzj = bArr3 == null ? null : zzgxm.zzj(bArr3);
                str6 = "video/x-vnd.on2.vp9";
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                    break;
                }
                str3 = str6;
                str4 = str;
                int i162 = i8;
                int i172 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2.zzb(i);
                zztVar2.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2.zzo(str3);
                zztVar2.zzp(i162);
                zztVar2.zze(this.zzad);
                zztVar2.zzf(i172);
                zztVar2.zzr(list);
                zztVar2.zzk(str4);
                zztVar2.zzs(this.zzm);
                this.zzaa = zztVar2.zzQ();
                return;
            case 2:
                byte[] bArr4 = this.zzl;
                str6 = "video/av01";
                if (bArr4 != null) {
                    zzj = zzgxm.zzj(bArr4);
                    zzafl zza2 = zzafl.zza(this.zzl);
                    if (zza2 != null) {
                        String str10 = zza2.zze;
                        i2 = zza2.zza;
                        i3 = zza2.zzc;
                        i4 = zza2.zzd;
                        i5 = zza2.zzb;
                        list = zzj;
                        str = str10;
                        i6 = i2;
                        i7 = -1;
                        i8 = -1;
                        if (this.zzO != null) {
                        }
                        str3 = str6;
                        str4 = str;
                        int i1622 = i8;
                        int i1722 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                        zzt zztVar22 = new zzt();
                        if (!zzas.zza(str3)) {
                        }
                        if (this.zzb != null) {
                        }
                        zztVar22.zzb(i);
                        zztVar22.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                        zztVar22.zzo(str3);
                        zztVar22.zzp(i1622);
                        zztVar22.zze(this.zzad);
                        zztVar22.zzf(i1722);
                        zztVar22.zzr(list);
                        zztVar22.zzk(str4);
                        zztVar22.zzs(this.zzm);
                        this.zzaa = zztVar22.zzQ();
                        return;
                    }
                    list = zzj;
                    i7 = -1;
                    i6 = -1;
                    i8 = -1;
                    i5 = -1;
                    i4 = -1;
                    i3 = -1;
                    i2 = -1;
                    str = null;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    str4 = str;
                    int i16222 = i8;
                    int i17222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                    zzt zztVar222 = new zzt();
                    if (!zzas.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zztVar222.zzb(i);
                    zztVar222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                    zztVar222.zzo(str3);
                    zztVar222.zzp(i16222);
                    zztVar222.zze(this.zzad);
                    zztVar222.zzf(i17222);
                    zztVar222.zzr(list);
                    zztVar222.zzk(str4);
                    zztVar222.zzs(this.zzm);
                    this.zzaa = zztVar222.zzQ();
                    return;
                }
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222 = i8;
                int i172222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222.zzb(i);
                zztVar2222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222.zzo(str3);
                zztVar2222.zzp(i162222);
                zztVar2222.zze(this.zzad);
                zztVar2222.zzf(i172222);
                zztVar2222.zzr(list);
                zztVar2222.zzk(str4);
                zztVar2222.zzs(this.zzm);
                this.zzaa = zztVar2222.zzQ();
                return;
            case 3:
                str6 = "video/mpeg2";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i1622222 = i8;
                int i1722222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222.zzb(i);
                zztVar22222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222.zzo(str3);
                zztVar22222.zzp(i1622222);
                zztVar22222.zze(this.zzad);
                zztVar22222.zzf(i1722222);
                zztVar22222.zzr(list);
                zztVar22222.zzk(str4);
                zztVar22222.zzs(this.zzm);
                this.zzaa = zztVar22222.zzQ();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.zzl;
                zzj = bArr5 == null ? null : Collections.singletonList(bArr5);
                str6 = "video/mp4v-es";
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222 = i8;
                int i17222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222.zzb(i);
                zztVar222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222.zzo(str3);
                zztVar222222.zzp(i16222222);
                zztVar222222.zze(this.zzad);
                zztVar222222.zzf(i17222222);
                zztVar222222.zzr(list);
                zztVar222222.zzk(str4);
                zztVar222222.zzs(this.zzm);
                this.zzaa = zztVar222222.zzQ();
                return;
            case 7:
                zzafm zza3 = zzafm.zza(new zzeu(zzi(this.zzc)));
                list2 = zza3.zza;
                this.zzab = zza3.zzb;
                str2 = zza3.zzl;
                i5 = zza3.zzg;
                i4 = zza3.zzi;
                i3 = zza3.zzh;
                i9 = zza3.zze;
                i10 = zza3.zzf;
                str6 = "video/avc";
                list = list2;
                str = str2;
                i6 = i9;
                i8 = -1;
                i2 = i10;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222222 = i8;
                int i172222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222.zzb(i);
                zztVar2222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222.zzo(str3);
                zztVar2222222.zzp(i162222222);
                zztVar2222222.zze(this.zzad);
                zztVar2222222.zzf(i172222222);
                zztVar2222222.zzr(list);
                zztVar2222222.zzk(str4);
                zztVar2222222.zzs(this.zzm);
                this.zzaa = zztVar2222222.zzQ();
                return;
            case '\b':
                zzahb zza4 = zzahb.zza(new zzeu(zzi(this.zzc)));
                list2 = zza4.zza;
                this.zzab = zza4.zzb;
                str2 = zza4.zzn;
                i5 = zza4.zzh;
                i4 = zza4.zzj;
                i3 = zza4.zzi;
                i9 = zza4.zzf;
                i10 = zza4.zzg;
                str6 = "video/hevc";
                list = list2;
                str = str2;
                i6 = i9;
                i8 = -1;
                i2 = i10;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i1622222222 = i8;
                int i1722222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222.zzb(i);
                zztVar22222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222.zzo(str3);
                zztVar22222222.zzp(i1622222222);
                zztVar22222222.zze(this.zzad);
                zztVar22222222.zzf(i1722222222);
                zztVar22222222.zzr(list);
                zztVar22222222.zzk(str4);
                zztVar22222222.zzs(this.zzm);
                this.zzaa = zztVar22222222.zzQ();
                return;
            case '\t':
                Pair zzf = zzf(new zzeu(zzi(this.zzc)));
                str6 = (String) zzf.first;
                zzj = (List) zzf.second;
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222222 = i8;
                int i17222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222.zzb(i);
                zztVar222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222.zzo(str3);
                zztVar222222222.zzp(i16222222222);
                zztVar222222222.zze(this.zzad);
                zztVar222222222.zzf(i17222222222);
                zztVar222222222.zzr(list);
                zztVar222222222.zzk(str4);
                zztVar222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222.zzQ();
                return;
            case '\n':
                str6 = "video/x-unknown";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222222222 = i8;
                int i172222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222.zzb(i);
                zztVar2222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222.zzo(str3);
                zztVar2222222222.zzp(i162222222222);
                zztVar2222222222.zze(this.zzad);
                zztVar2222222222.zzf(i172222222222);
                zztVar2222222222.zzr(list);
                zztVar2222222222.zzk(str4);
                zztVar2222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222.zzQ();
                return;
            case 11:
                zzg = zzg(zzi(str5));
                i11 = 8192;
                str6 = "audio/vorbis";
                list = zzg;
                i8 = i11;
                i7 = -1;
                i6 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i1622222222222 = i8;
                int i1722222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222.zzb(i);
                zztVar22222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222.zzo(str3);
                zztVar22222222222.zzp(i1622222222222);
                zztVar22222222222.zze(this.zzad);
                zztVar22222222222.zzf(i1722222222222);
                zztVar22222222222.zzr(list);
                zztVar22222222222.zzk(str4);
                zztVar22222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222.zzQ();
                return;
            case '\f':
                zzg = new ArrayList(3);
                zzg.add(zzi(this.zzc));
                zzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzT).array());
                zzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzU).array());
                i11 = 5760;
                str6 = "audio/opus";
                list = zzg;
                i8 = i11;
                i7 = -1;
                i6 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222222222 = i8;
                int i17222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222.zzb(i);
                zztVar222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222.zzo(str3);
                zztVar222222222222.zzp(i16222222222222);
                zztVar222222222222.zze(this.zzad);
                zztVar222222222222.zzf(i17222222222222);
                zztVar222222222222.zzr(list);
                zztVar222222222222.zzk(str4);
                zztVar222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222.zzQ();
                return;
            case '\r':
                List singletonList = Collections.singletonList(zzi(str5));
                zzafe zza5 = zzaff.zza(this.zzl);
                this.zzS = zza5.zza;
                this.zzP = zza5.zzb;
                str6 = "audio/mp4a-latm";
                list = singletonList;
                str = zza5.zzc;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222222222222 = i8;
                int i172222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222.zzb(i);
                zztVar2222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222.zzo(str3);
                zztVar2222222222222.zzp(i162222222222222);
                zztVar2222222222222.zze(this.zzad);
                zztVar2222222222222.zzf(i172222222222222);
                zztVar2222222222222.zzr(list);
                zztVar2222222222222.zzk(str4);
                zztVar2222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222.zzQ();
                return;
            case 14:
                str6 = "audio/mpeg-L2";
                i8 = 4096;
                i7 = -1;
                i6 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i1622222222222222 = i8;
                int i1722222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222.zzb(i);
                zztVar22222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222.zzo(str3);
                zztVar22222222222222.zzp(i1622222222222222);
                zztVar22222222222222.zze(this.zzad);
                zztVar22222222222222.zzf(i1722222222222222);
                zztVar22222222222222.zzr(list);
                zztVar22222222222222.zzk(str4);
                zztVar22222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222.zzQ();
                return;
            case 15:
                str6 = "audio/mpeg";
                i8 = 4096;
                i7 = -1;
                i6 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222222222222 = i8;
                int i17222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222.zzb(i);
                zztVar222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222.zzo(str3);
                zztVar222222222222222.zzp(i16222222222222222);
                zztVar222222222222222.zze(this.zzad);
                zztVar222222222222222.zzf(i17222222222222222);
                zztVar222222222222222.zzr(list);
                zztVar222222222222222.zzk(str4);
                zztVar222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222.zzQ();
                return;
            case 16:
                str6 = "audio/ac3";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222222222222222 = i8;
                int i172222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222.zzb(i);
                zztVar2222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222.zzo(str3);
                zztVar2222222222222222.zzp(i162222222222222222);
                zztVar2222222222222222.zze(this.zzad);
                zztVar2222222222222222.zzf(i172222222222222222);
                zztVar2222222222222222.zzr(list);
                zztVar2222222222222222.zzk(str4);
                zztVar2222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222.zzQ();
                return;
            case 17:
                str6 = "audio/eac3";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i1622222222222222222 = i8;
                int i1722222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222.zzb(i);
                zztVar22222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222.zzo(str3);
                zztVar22222222222222222.zzp(i1622222222222222222);
                zztVar22222222222222222.zze(this.zzad);
                zztVar22222222222222222.zzf(i1722222222222222222);
                zztVar22222222222222222.zzr(list);
                zztVar22222222222222222.zzk(str4);
                zztVar22222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222.zzQ();
                return;
            case 18:
                this.zzV = new zzahu();
                str6 = "audio/true-hd";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222222222222222 = i8;
                int i17222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222.zzb(i);
                zztVar222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222.zzo(str3);
                zztVar222222222222222222.zzp(i16222222222222222222);
                zztVar222222222222222222.zze(this.zzad);
                zztVar222222222222222222.zzf(i17222222222222222222);
                zztVar222222222222222222.zzr(list);
                zztVar222222222222222222.zzk(str4);
                zztVar222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222.zzQ();
                return;
            case 19:
                this.zzW = true;
                str6 = "audio/vnd.dts";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222222222222222222 = i8;
                int i172222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222.zzb(i);
                zztVar2222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222.zzo(str3);
                zztVar2222222222222222222.zzp(i162222222222222222222);
                zztVar2222222222222222222.zze(this.zzad);
                zztVar2222222222222222222.zzf(i172222222222222222222);
                zztVar2222222222222222222.zzr(list);
                zztVar2222222222222222222.zzk(str4);
                zztVar2222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222.zzQ();
                return;
            case 20:
                str6 = "audio/vnd.dts.hd;profile=lbr";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i1622222222222222222222 = i8;
                int i1722222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222.zzb(i);
                zztVar22222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222.zzo(str3);
                zztVar22222222222222222222.zzp(i1622222222222222222222);
                zztVar22222222222222222222.zze(this.zzad);
                zztVar22222222222222222222.zzf(i1722222222222222222222);
                zztVar22222222222222222222.zzr(list);
                zztVar22222222222222222222.zzk(str4);
                zztVar22222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222222.zzQ();
                return;
            case 21:
                str6 = "audio/vnd.dts.hd";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222222222222222222 = i8;
                int i17222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222.zzb(i);
                zztVar222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222.zzo(str3);
                zztVar222222222222222222222.zzp(i16222222222222222222222);
                zztVar222222222222222222222.zze(this.zzad);
                zztVar222222222222222222222.zzf(i17222222222222222222222);
                zztVar222222222222222222222.zzr(list);
                zztVar222222222222222222222.zzk(str4);
                zztVar222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222222.zzQ();
                return;
            case 22:
                zzj = Collections.singletonList(zzi(str5));
                str6 = "audio/flac";
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222222222222222222222 = i8;
                int i172222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222.zzb(i);
                zztVar2222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222.zzo(str3);
                zztVar2222222222222222222222.zzp(i162222222222222222222222);
                zztVar2222222222222222222222.zze(this.zzad);
                zztVar2222222222222222222222.zzf(i172222222222222222222222);
                zztVar2222222222222222222222.zzr(list);
                zztVar2222222222222222222222.zzk(str4);
                zztVar2222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222222.zzQ();
                return;
            case 23:
                if (zzh(new zzeu(zzi(this.zzc)))) {
                    i7 = zzfm.zzC(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (i7 == 0) {
                        int i23 = this.zzQ;
                        StringBuilder sb = new StringBuilder(String.valueOf(i23).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i23);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzeh.zzc("MatroskaExtractor", sb.toString());
                    }
                    i6 = -1;
                    i8 = -1;
                    i5 = -1;
                    i4 = -1;
                    i3 = -1;
                    i2 = -1;
                    str = null;
                    list = null;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    str4 = str;
                    int i1622222222222222222222222 = i8;
                    int i1722222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                    zzt zztVar22222222222222222222222 = new zzt();
                    if (!zzas.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zztVar22222222222222222222222.zzb(i);
                    zztVar22222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                    zztVar22222222222222222222222.zzo(str3);
                    zztVar22222222222222222222222.zzp(i1622222222222222222222222);
                    zztVar22222222222222222222222.zze(this.zzad);
                    zztVar22222222222222222222222.zzf(i1722222222222222222222222);
                    zztVar22222222222222222222222.zzr(list);
                    zztVar22222222222222222222222.zzk(str4);
                    zztVar22222222222222222222222.zzs(this.zzm);
                    this.zzaa = zztVar22222222222222222222222.zzQ();
                    return;
                }
                zzeh.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                str6 = "audio/x-unknown";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222222222222222222222 = i8;
                int i17222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222.zzb(i);
                zztVar222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222.zzp(i16222222222222222222222222);
                zztVar222222222222222222222222.zze(this.zzad);
                zztVar222222222222222222222222.zzf(i17222222222222222222222222);
                zztVar222222222222222222222222.zzr(list);
                zztVar222222222222222222222222.zzk(str4);
                zztVar222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222222222.zzQ();
                return;
            case 24:
                i7 = zzfm.zzC(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (i7 == 0) {
                    int i24 = this.zzQ;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i24).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i24);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzeh.zzc("MatroskaExtractor", sb2.toString());
                    str6 = "audio/x-unknown";
                    i7 = -1;
                }
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222222222222222222222222 = i8;
                int i172222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222.zzo(str3);
                zztVar2222222222222222222222222.zzp(i162222222222222222222222222);
                zztVar2222222222222222222222222.zze(this.zzad);
                zztVar2222222222222222222222222.zzf(i172222222222222222222222222);
                zztVar2222222222222222222222222.zzr(list);
                zztVar2222222222222222222222222.zzk(str4);
                zztVar2222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222222222.zzQ();
                return;
            case 25:
                i7 = zzfm.zzC(this.zzQ, ByteOrder.BIG_ENDIAN);
                if (i7 == 0) {
                    int i25 = this.zzQ;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i25).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i25);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    zzeh.zzc("MatroskaExtractor", sb3.toString());
                    str6 = "audio/x-unknown";
                    i7 = -1;
                }
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i1622222222222222222222222222 = i8;
                int i1722222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222.zzo(str3);
                zztVar22222222222222222222222222.zzp(i1622222222222222222222222222);
                zztVar22222222222222222222222222.zze(this.zzad);
                zztVar22222222222222222222222222.zzf(i1722222222222222222222222222);
                zztVar22222222222222222222222222.zzr(list);
                zztVar22222222222222222222222222.zzk(str4);
                zztVar22222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222222222222.zzQ();
                return;
            case 26:
                i7 = zzfm.zzD(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (i7 == 0) {
                    int i26 = this.zzQ;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i26).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i26);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzeh.zzc("MatroskaExtractor", sb4.toString());
                    str6 = "audio/x-unknown";
                    i7 = -1;
                }
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222222222222222222222222 = i8;
                int i17222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222222.zzp(i16222222222222222222222222222);
                zztVar222222222222222222222222222.zze(this.zzad);
                zztVar222222222222222222222222222.zzf(i17222222222222222222222222222);
                zztVar222222222222222222222222222.zzr(list);
                zztVar222222222222222222222222222.zzk(str4);
                zztVar222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222222222222.zzQ();
                return;
            case 27:
                str6 = "application/x-subrip";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222222222222222222222222222 = i8;
                int i172222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222.zzo(str3);
                zztVar2222222222222222222222222222.zzp(i162222222222222222222222222222);
                zztVar2222222222222222222222222222.zze(this.zzad);
                zztVar2222222222222222222222222222.zzf(i172222222222222222222222222222);
                zztVar2222222222222222222222222222.zzr(list);
                zztVar2222222222222222222222222222.zzk(str4);
                zztVar2222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222222222222.zzQ();
                return;
            case 28:
            case 29:
                int i27 = zzakt.zza;
                byte[] zzi = zzi(this.zzc);
                bArr = zzakt.zzc;
                list = zzgxm.zzk(bArr, zzi);
                str6 = "text/x-ssa";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i1622222222222222222222222222222 = i8;
                int i1722222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222222.zzo(str3);
                zztVar22222222222222222222222222222.zzp(i1622222222222222222222222222222);
                zztVar22222222222222222222222222222.zze(this.zzad);
                zztVar22222222222222222222222222222.zzf(i1722222222222222222222222222222);
                zztVar22222222222222222222222222222.zzr(list);
                zztVar22222222222222222222222222222.zzk(str4);
                zztVar22222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222222222222222.zzQ();
                return;
            case 30:
                str6 = "text/vtt";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222222222222222222222222222 = i8;
                int i17222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222222222.zzp(i16222222222222222222222222222222);
                zztVar222222222222222222222222222222.zze(this.zzad);
                zztVar222222222222222222222222222222.zzf(i17222222222222222222222222222222);
                zztVar222222222222222222222222222222.zzr(list);
                zztVar222222222222222222222222222222.zzk(str4);
                zztVar222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222222222222222.zzQ();
                return;
            case 31:
                list = zzgxm.zzj(zzi(str5));
                str6 = "application/vobsub";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i162222222222222222222222222222222 = i8;
                int i172222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222222.zzo(str3);
                zztVar2222222222222222222222222222222.zzp(i162222222222222222222222222222222);
                zztVar2222222222222222222222222222222.zze(this.zzad);
                zztVar2222222222222222222222222222222.zzf(i172222222222222222222222222222222);
                zztVar2222222222222222222222222222222.zzr(list);
                zztVar2222222222222222222222222222222.zzk(str4);
                zztVar2222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222222222222222.zzQ();
                return;
            case ' ':
                str6 = "application/pgs";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                list = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i1622222222222222222222222222222222 = i8;
                int i1722222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222222222.zzo(str3);
                zztVar22222222222222222222222222222222.zzp(i1622222222222222222222222222222222);
                zztVar22222222222222222222222222222222.zze(this.zzad);
                zztVar22222222222222222222222222222222.zzf(i1722222222222222222222222222222222);
                zztVar22222222222222222222222222222222.zzr(list);
                zztVar22222222222222222222222222222222.zzk(str4);
                zztVar22222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222222222222222222.zzQ();
                return;
            case '!':
                byte[] bArr6 = new byte[4];
                System.arraycopy(zzi(str5), 0, bArr6, 0, 4);
                zzj = zzgxm.zzj(bArr6);
                str6 = "application/dvbsubs";
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i5 = -1;
                i4 = -1;
                i3 = -1;
                i2 = -1;
                str = null;
                if (this.zzO != null) {
                }
                str3 = str6;
                str4 = str;
                int i16222222222222222222222222222222222 = i8;
                int i17222222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222222222222.zzp(i16222222222222222222222222222222222);
                zztVar222222222222222222222222222222222.zze(this.zzad);
                zztVar222222222222222222222222222222222.zzf(i17222222222222222222222222222222222);
                zztVar222222222222222222222222222222222.zzr(list);
                zztVar222222222222222222222222222222222.zzk(str4);
                zztVar222222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222222222222222222.zzQ();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }

    final /* synthetic */ void zzb() {
        this.zzZ.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzac;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzac = i;
    }

    final /* synthetic */ void zze(String str) {
        this.zzad = str;
    }
}
