package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzakg {
    public byte[] zzN;
    public com.google.android.gms.internal.ads.zzahl zzT;
    public boolean zzV;
    public com.google.android.gms.internal.ads.zzahk zzX;
    public com.google.android.gms.internal.ads.zzv zzY;
    public int zzZ;
    public boolean zza;
    private int zzaa;
    public java.lang.String zzb;
    public java.lang.String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public com.google.android.gms.internal.ads.zzahj zzj;
    public byte[] zzk;
    public com.google.android.gms.internal.ads.zzq zzl;
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
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzU = false;
    public boolean zzW = true;
    private java.lang.String zzab = "eng";

    protected zzakg() {
    }

    private static android.util.Pair zzf(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        try {
            zzetVar.zzk(16);
            long zzA = zzetVar.zzA();
            if (zzA == 1482049860) {
                return new android.util.Pair("video/divx", null);
            }
            if (zzA == 859189832) {
                return new android.util.Pair("video/3gpp", null);
            }
            if (zzA != 826496599) {
                com.google.android.gms.internal.ads.zzeg.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new android.util.Pair("video/x-unknown", null);
            }
            int zzg = zzetVar.zzg() + 20;
            byte[] zzi = zzetVar.zzi();
            while (true) {
                int length = zzi.length;
                if (zzg >= length - 4) {
                    throw com.google.android.gms.internal.ads.zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i = zzg + 1;
                if (zzi[zzg] == 0 && zzi[i] == 0 && zzi[zzg + 2] == 1 && zzi[zzg + 3] == 15) {
                    return new android.util.Pair("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(zzi, zzg, length)));
                }
                zzg = i;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static java.util.List zzg(byte[] bArr) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i3 = 1;
            int i4 = 0;
            while (true) {
                int i5 = bArr[i3];
                i3++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i4 += 255;
            }
            int i6 = i4 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i3];
                i3++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i3] != 1) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            java.lang.System.arraycopy(bArr, i3, bArr2, 0, i6);
            int i10 = i3 + i6;
            if (bArr[i10] != 3) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            java.lang.System.arraycopy(bArr, i11, bArr3, 0, length);
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        java.util.UUID uuid;
        java.util.UUID uuid2;
        try {
            int zzu = zzetVar.zzu();
            if (zzu == 1) {
                return true;
            }
            if (zzu == 65534) {
                zzetVar.zzh(24);
                long zzD = zzetVar.zzD();
                uuid = com.google.android.gms.internal.ads.zzakh.zzf;
                if (zzD == uuid.getMostSignificantBits()) {
                    long zzD2 = zzetVar.zzD();
                    uuid2 = com.google.android.gms.internal.ads.zzakh.zzf;
                    if (zzD2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(java.lang.String str) throws com.google.android.gms.internal.ads.zzat {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        java.lang.String.valueOf(str);
        throw com.google.android.gms.internal.ads.zzat.zzb("Missing CodecPrivate for codec ".concat(java.lang.String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:137:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0489  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(int i) throws com.google.android.gms.internal.ads.zzat {
        char c;
        java.util.List zzj;
        int i2;
        int i3;
        int i4;
        int i5;
        java.util.List list;
        int i6;
        int i7;
        int i8;
        java.util.List list2;
        java.lang.String str;
        int i9;
        int i10;
        java.lang.String str2;
        byte[] bArr;
        java.lang.String str3;
        java.lang.String str4;
        int i11;
        byte[] bArr2;
        int i12;
        java.util.Map map;
        java.util.Map map2;
        int i13;
        java.util.Map map3;
        com.google.android.gms.internal.ads.zzfu zza;
        java.lang.String str5 = this.zzc;
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
        java.lang.String str6 = "audio/raw";
        switch (c) {
            case 0:
                str6 = "video/x-vnd.on2.vp8";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null || (zza = com.google.android.gms.internal.ads.zzfu.zza(new com.google.android.gms.internal.ads.zzet(this.zzN))) == null) {
                    str3 = str6;
                    str4 = str2;
                } else {
                    str4 = zza.zza;
                    str3 = "video/dolby-vision";
                }
                int i14 = i8;
                int i15 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(i7);
                } else if (com.google.android.gms.internal.ads.zzas.zzb(str3)) {
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
                    float f = (this.zzp == i11 || (i13 = this.zzq) == i11) ? -1.0f : (this.zzn * r1) / (this.zzm * i13);
                    if (i2 == i11) {
                        if (i3 != i11) {
                            i2 = -1;
                        } else if (i4 == i11 || this.zzA != i11) {
                            i2 = this.zzy;
                            i3 = this.zzz;
                            i4 = this.zzA;
                        } else {
                            i2 = this.zzy;
                            i3 = this.zzz;
                        }
                    }
                    if (i6 == i11 && (i6 = this.zzo) == i11) {
                        i6 = 8;
                    }
                    if (i5 == i11) {
                        int i18 = this.zzo;
                        i5 = i18 == i11 ? 8 : i18;
                    }
                    if (this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f) {
                        bArr2 = null;
                    } else if (this.zzM == -1.0f) {
                        bArr2 = null;
                    } else {
                        bArr2 = new byte[25];
                        java.nio.ByteBuffer order = java.nio.ByteBuffer.wrap(bArr2).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                        order.put((byte) 0);
                        order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                        order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                        order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                        order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                        order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                        order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                        order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                        order.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                        order.putShort((short) (this.zzL + 0.5f));
                        order.putShort((short) (this.zzM + 0.5f));
                        order.putShort((short) this.zzB);
                        order.putShort((short) this.zzC);
                    }
                    com.google.android.gms.internal.ads.zzh zzhVar = new com.google.android.gms.internal.ads.zzh();
                    zzhVar.zza(i2);
                    zzhVar.zzb(i4);
                    zzhVar.zzc(i3);
                    zzhVar.zzd(bArr2);
                    zzhVar.zze(i6);
                    zzhVar.zzf(i5);
                    com.google.android.gms.internal.ads.zzi zzg = zzhVar.zzg();
                    if (this.zzb != null) {
                        int i19 = com.google.android.gms.internal.ads.zzakh.zza;
                        java.lang.String str7 = this.zzb;
                        map = com.google.android.gms.internal.ads.zzakh.zzg;
                        if (map.containsKey(str7)) {
                            java.lang.String str8 = this.zzb;
                            map2 = com.google.android.gms.internal.ads.zzakh.zzg;
                            i11 = ((java.lang.Integer) map2.get(str8)).intValue();
                        }
                    }
                    if (this.zzs == 0 && java.lang.Float.compare(this.zzt, 0.0f) == 0 && java.lang.Float.compare(this.zzu, 0.0f) == 0) {
                        if (java.lang.Float.compare(this.zzv, 0.0f) == 0) {
                            i12 = 0;
                        } else if (java.lang.Float.compare(this.zzv, 90.0f) == 0) {
                            i12 = 90;
                        } else if (java.lang.Float.compare(this.zzv, -180.0f) == 0 || java.lang.Float.compare(this.zzv, 180.0f) == 0) {
                            i12 = 180;
                        } else if (java.lang.Float.compare(this.zzv, -90.0f) == 0) {
                            i12 = 270;
                        }
                        zztVar.zzv(this.zzm);
                        zztVar.zzw(this.zzn);
                        zztVar.zzB(f);
                        zztVar.zzA(i12);
                        zztVar.zzC(this.zzw);
                        zztVar.zzD(this.zzx);
                        zztVar.zzE(zzg);
                    }
                    i12 = i11;
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f);
                    zztVar.zzA(i12);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zzg);
                } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                    throw com.google.android.gms.internal.ads.zzat.zzb("Unexpected MIME type.", null);
                }
                if (this.zzb != null) {
                    int i20 = com.google.android.gms.internal.ads.zzakh.zza;
                    java.lang.String str9 = this.zzb;
                    map3 = com.google.android.gms.internal.ads.zzakh.zzg;
                    if (!map3.containsKey(str9)) {
                        zztVar.zzc(this.zzb);
                    }
                }
                zztVar.zzb(i);
                zztVar.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzo(str3);
                zztVar.zzp(i14);
                zztVar.zze(this.zzab);
                zztVar.zzf(i15);
                zztVar.zzr(list);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 1:
                byte[] bArr3 = this.zzk;
                zzj = bArr3 == null ? null : com.google.android.gms.internal.ads.zzgwm.zzj(bArr3);
                str6 = "video/x-vnd.on2.vp9";
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzN != null) {
                    break;
                }
                str3 = str6;
                str4 = str2;
                int i142 = i8;
                int i152 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2.zzb(i);
                zztVar2.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2.zzo(str3);
                zztVar2.zzp(i142);
                zztVar2.zze(this.zzab);
                zztVar2.zzf(i152);
                zztVar2.zzr(list);
                zztVar2.zzk(str4);
                zztVar2.zzs(this.zzl);
                this.zzY = zztVar2.zzO();
                return;
            case 2:
                byte[] bArr4 = this.zzk;
                str6 = "video/av01";
                if (bArr4 != null) {
                    com.google.android.gms.internal.ads.zzafc zza2 = com.google.android.gms.internal.ads.zzafc.zza(bArr4);
                    java.util.List list3 = zza2.zza;
                    i2 = zza2.zzc;
                    i3 = zza2.zze;
                    i4 = zza2.zzd;
                    i5 = zza2.zzb;
                    list = list3;
                    i6 = i5;
                    i7 = -1;
                    i8 = -1;
                    str2 = null;
                    if (this.zzN != null) {
                    }
                    str3 = str6;
                    str4 = str2;
                    int i1422 = i8;
                    int i1522 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                    com.google.android.gms.internal.ads.zzt zztVar22 = new com.google.android.gms.internal.ads.zzt();
                    if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zztVar22.zzb(i);
                    zztVar22.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                    zztVar22.zzo(str3);
                    zztVar22.zzp(i1422);
                    zztVar22.zze(this.zzab);
                    zztVar22.zzf(i1522);
                    zztVar22.zzr(list);
                    zztVar22.zzk(str4);
                    zztVar22.zzs(this.zzl);
                    this.zzY = zztVar22.zzO();
                    return;
                }
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i14222 = i8;
                int i15222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222.zzb(i);
                zztVar222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222.zzo(str3);
                zztVar222.zzp(i14222);
                zztVar222.zze(this.zzab);
                zztVar222.zzf(i15222);
                zztVar222.zzr(list);
                zztVar222.zzk(str4);
                zztVar222.zzs(this.zzl);
                this.zzY = zztVar222.zzO();
                return;
            case 3:
                str6 = "video/mpeg2";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222 = i8;
                int i152222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222.zzb(i);
                zztVar2222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222.zzo(str3);
                zztVar2222.zzp(i142222);
                zztVar2222.zze(this.zzab);
                zztVar2222.zzf(i152222);
                zztVar2222.zzr(list);
                zztVar2222.zzk(str4);
                zztVar2222.zzs(this.zzl);
                this.zzY = zztVar2222.zzO();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.zzk;
                zzj = bArr5 == null ? null : java.util.Collections.singletonList(bArr5);
                str6 = "video/mp4v-es";
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i1422222 = i8;
                int i1522222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar22222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222.zzb(i);
                zztVar22222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222.zzo(str3);
                zztVar22222.zzp(i1422222);
                zztVar22222.zze(this.zzab);
                zztVar22222.zzf(i1522222);
                zztVar22222.zzr(list);
                zztVar22222.zzk(str4);
                zztVar22222.zzs(this.zzl);
                this.zzY = zztVar22222.zzO();
                return;
            case 7:
                com.google.android.gms.internal.ads.zzafd zza3 = com.google.android.gms.internal.ads.zzafd.zza(new com.google.android.gms.internal.ads.zzet(zzi(this.zzc)));
                list2 = zza3.zza;
                this.zzZ = zza3.zzb;
                str = zza3.zzl;
                i2 = zza3.zzg;
                i3 = zza3.zzi;
                i4 = zza3.zzh;
                i9 = zza3.zze;
                i10 = zza3.zzf;
                str6 = "video/avc";
                list = list2;
                str2 = str;
                i6 = i9;
                i8 = -1;
                i5 = i10;
                i7 = -1;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i14222222 = i8;
                int i15222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222.zzb(i);
                zztVar222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222.zzo(str3);
                zztVar222222.zzp(i14222222);
                zztVar222222.zze(this.zzab);
                zztVar222222.zzf(i15222222);
                zztVar222222.zzr(list);
                zztVar222222.zzk(str4);
                zztVar222222.zzs(this.zzl);
                this.zzY = zztVar222222.zzO();
                return;
            case '\b':
                com.google.android.gms.internal.ads.zzags zza4 = com.google.android.gms.internal.ads.zzags.zza(new com.google.android.gms.internal.ads.zzet(zzi(this.zzc)));
                list2 = zza4.zza;
                this.zzZ = zza4.zzb;
                str = zza4.zzn;
                i2 = zza4.zzh;
                i3 = zza4.zzj;
                i4 = zza4.zzi;
                i9 = zza4.zzf;
                i10 = zza4.zzg;
                str6 = "video/hevc";
                list = list2;
                str2 = str;
                i6 = i9;
                i8 = -1;
                i5 = i10;
                i7 = -1;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222222 = i8;
                int i152222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222.zzb(i);
                zztVar2222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222.zzo(str3);
                zztVar2222222.zzp(i142222222);
                zztVar2222222.zze(this.zzab);
                zztVar2222222.zzf(i152222222);
                zztVar2222222.zzr(list);
                zztVar2222222.zzk(str4);
                zztVar2222222.zzs(this.zzl);
                this.zzY = zztVar2222222.zzO();
                return;
            case '\t':
                android.util.Pair zzf = zzf(new com.google.android.gms.internal.ads.zzet(zzi(this.zzc)));
                str6 = (java.lang.String) zzf.first;
                zzj = (java.util.List) zzf.second;
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i1422222222 = i8;
                int i1522222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar22222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222.zzb(i);
                zztVar22222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222.zzo(str3);
                zztVar22222222.zzp(i1422222222);
                zztVar22222222.zze(this.zzab);
                zztVar22222222.zzf(i1522222222);
                zztVar22222222.zzr(list);
                zztVar22222222.zzk(str4);
                zztVar22222222.zzs(this.zzl);
                this.zzY = zztVar22222222.zzO();
                return;
            case '\n':
                str6 = "video/x-unknown";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i14222222222 = i8;
                int i15222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222.zzb(i);
                zztVar222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222.zzo(str3);
                zztVar222222222.zzp(i14222222222);
                zztVar222222222.zze(this.zzab);
                zztVar222222222.zzf(i15222222222);
                zztVar222222222.zzr(list);
                zztVar222222222.zzk(str4);
                zztVar222222222.zzs(this.zzl);
                this.zzY = zztVar222222222.zzO();
                return;
            case 11:
                str6 = "audio/vorbis";
                list = zzg(zzi(str5));
                i7 = -1;
                i6 = -1;
                i8 = 8192;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222222222 = i8;
                int i152222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222.zzb(i);
                zztVar2222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222.zzo(str3);
                zztVar2222222222.zzp(i142222222222);
                zztVar2222222222.zze(this.zzab);
                zztVar2222222222.zzf(i152222222222);
                zztVar2222222222.zzr(list);
                zztVar2222222222.zzk(str4);
                zztVar2222222222.zzs(this.zzl);
                this.zzY = zztVar2222222222.zzO();
                return;
            case '\f':
                java.util.ArrayList arrayList = new java.util.ArrayList(3);
                arrayList.add(zzi(this.zzc));
                arrayList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                arrayList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.zzS).array());
                str6 = "audio/opus";
                list = arrayList;
                i7 = -1;
                i6 = -1;
                i8 = 5760;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i1422222222222 = i8;
                int i1522222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar22222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222.zzb(i);
                zztVar22222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222.zzo(str3);
                zztVar22222222222.zzp(i1422222222222);
                zztVar22222222222.zze(this.zzab);
                zztVar22222222222.zzf(i1522222222222);
                zztVar22222222222.zzr(list);
                zztVar22222222222.zzk(str4);
                zztVar22222222222.zzs(this.zzl);
                this.zzY = zztVar22222222222.zzO();
                return;
            case '\r':
                java.util.List singletonList = java.util.Collections.singletonList(zzi(str5));
                com.google.android.gms.internal.ads.zzaev zza5 = com.google.android.gms.internal.ads.zzaew.zza(this.zzk);
                this.zzQ = zza5.zza;
                this.zzO = zza5.zzb;
                str6 = "audio/mp4a-latm";
                list = singletonList;
                str2 = zza5.zzc;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i14222222222222 = i8;
                int i15222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222.zzb(i);
                zztVar222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222.zzo(str3);
                zztVar222222222222.zzp(i14222222222222);
                zztVar222222222222.zze(this.zzab);
                zztVar222222222222.zzf(i15222222222222);
                zztVar222222222222.zzr(list);
                zztVar222222222222.zzk(str4);
                zztVar222222222222.zzs(this.zzl);
                this.zzY = zztVar222222222222.zzO();
                return;
            case 14:
                str6 = "audio/mpeg-L2";
                i7 = -1;
                i6 = -1;
                i8 = 4096;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222222222222 = i8;
                int i152222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222.zzb(i);
                zztVar2222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222.zzo(str3);
                zztVar2222222222222.zzp(i142222222222222);
                zztVar2222222222222.zze(this.zzab);
                zztVar2222222222222.zzf(i152222222222222);
                zztVar2222222222222.zzr(list);
                zztVar2222222222222.zzk(str4);
                zztVar2222222222222.zzs(this.zzl);
                this.zzY = zztVar2222222222222.zzO();
                return;
            case 15:
                str6 = "audio/mpeg";
                i7 = -1;
                i6 = -1;
                i8 = 4096;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i1422222222222222 = i8;
                int i1522222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar22222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222.zzb(i);
                zztVar22222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222.zzo(str3);
                zztVar22222222222222.zzp(i1422222222222222);
                zztVar22222222222222.zze(this.zzab);
                zztVar22222222222222.zzf(i1522222222222222);
                zztVar22222222222222.zzr(list);
                zztVar22222222222222.zzk(str4);
                zztVar22222222222222.zzs(this.zzl);
                this.zzY = zztVar22222222222222.zzO();
                return;
            case 16:
                str6 = "audio/ac3";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i14222222222222222 = i8;
                int i15222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222.zzb(i);
                zztVar222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222.zzo(str3);
                zztVar222222222222222.zzp(i14222222222222222);
                zztVar222222222222222.zze(this.zzab);
                zztVar222222222222222.zzf(i15222222222222222);
                zztVar222222222222222.zzr(list);
                zztVar222222222222222.zzk(str4);
                zztVar222222222222222.zzs(this.zzl);
                this.zzY = zztVar222222222222222.zzO();
                return;
            case 17:
                str6 = "audio/eac3";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222222222222222 = i8;
                int i152222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222.zzb(i);
                zztVar2222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222.zzo(str3);
                zztVar2222222222222222.zzp(i142222222222222222);
                zztVar2222222222222222.zze(this.zzab);
                zztVar2222222222222222.zzf(i152222222222222222);
                zztVar2222222222222222.zzr(list);
                zztVar2222222222222222.zzk(str4);
                zztVar2222222222222222.zzs(this.zzl);
                this.zzY = zztVar2222222222222222.zzO();
                return;
            case 18:
                this.zzT = new com.google.android.gms.internal.ads.zzahl();
                str6 = "audio/true-hd";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i1422222222222222222 = i8;
                int i1522222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar22222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222.zzb(i);
                zztVar22222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222.zzo(str3);
                zztVar22222222222222222.zzp(i1422222222222222222);
                zztVar22222222222222222.zze(this.zzab);
                zztVar22222222222222222.zzf(i1522222222222222222);
                zztVar22222222222222222.zzr(list);
                zztVar22222222222222222.zzk(str4);
                zztVar22222222222222222.zzs(this.zzl);
                this.zzY = zztVar22222222222222222.zzO();
                return;
            case 19:
            case 20:
                this.zzU = true;
                str6 = "audio/vnd.dts";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i14222222222222222222 = i8;
                int i15222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222.zzb(i);
                zztVar222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222.zzo(str3);
                zztVar222222222222222222.zzp(i14222222222222222222);
                zztVar222222222222222222.zze(this.zzab);
                zztVar222222222222222222.zzf(i15222222222222222222);
                zztVar222222222222222222.zzr(list);
                zztVar222222222222222222.zzk(str4);
                zztVar222222222222222222.zzs(this.zzl);
                this.zzY = zztVar222222222222222222.zzO();
                return;
            case 21:
                str6 = "audio/vnd.dts.hd";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222222222222222222 = i8;
                int i152222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222.zzb(i);
                zztVar2222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222.zzo(str3);
                zztVar2222222222222222222.zzp(i142222222222222222222);
                zztVar2222222222222222222.zze(this.zzab);
                zztVar2222222222222222222.zzf(i152222222222222222222);
                zztVar2222222222222222222.zzr(list);
                zztVar2222222222222222222.zzk(str4);
                zztVar2222222222222222222.zzs(this.zzl);
                this.zzY = zztVar2222222222222222222.zzO();
                return;
            case 22:
                zzj = java.util.Collections.singletonList(zzi(str5));
                str6 = "audio/flac";
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i1422222222222222222222 = i8;
                int i1522222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar22222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222.zzb(i);
                zztVar22222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222.zzo(str3);
                zztVar22222222222222222222.zzp(i1422222222222222222222);
                zztVar22222222222222222222.zze(this.zzab);
                zztVar22222222222222222222.zzf(i1522222222222222222222);
                zztVar22222222222222222222.zzr(list);
                zztVar22222222222222222222.zzk(str4);
                zztVar22222222222222222222.zzs(this.zzl);
                this.zzY = zztVar22222222222222222222.zzO();
                return;
            case 23:
                if (zzh(new com.google.android.gms.internal.ads.zzet(zzi(this.zzc)))) {
                    i7 = com.google.android.gms.internal.ads.zzfl.zzB(this.zzP, java.nio.ByteOrder.LITTLE_ENDIAN);
                    if (i7 == 0) {
                        int i21 = this.zzP;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i21).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i21);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        com.google.android.gms.internal.ads.zzeg.zzc("MatroskaExtractor", sb.toString());
                    }
                    i6 = -1;
                    i8 = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    str2 = null;
                    list = null;
                    if (this.zzN != null) {
                    }
                    str3 = str6;
                    str4 = str2;
                    int i14222222222222222222222 = i8;
                    int i15222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                    com.google.android.gms.internal.ads.zzt zztVar222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                    if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zztVar222222222222222222222.zzb(i);
                    zztVar222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                    zztVar222222222222222222222.zzo(str3);
                    zztVar222222222222222222222.zzp(i14222222222222222222222);
                    zztVar222222222222222222222.zze(this.zzab);
                    zztVar222222222222222222222.zzf(i15222222222222222222222);
                    zztVar222222222222222222222.zzr(list);
                    zztVar222222222222222222222.zzk(str4);
                    zztVar222222222222222222222.zzs(this.zzl);
                    this.zzY = zztVar222222222222222222222.zzO();
                    return;
                }
                com.google.android.gms.internal.ads.zzeg.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                str6 = "audio/x-unknown";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222222222222222222222 = i8;
                int i152222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222.zzb(i);
                zztVar2222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222.zzo(str3);
                zztVar2222222222222222222222.zzp(i142222222222222222222222);
                zztVar2222222222222222222222.zze(this.zzab);
                zztVar2222222222222222222222.zzf(i152222222222222222222222);
                zztVar2222222222222222222222.zzr(list);
                zztVar2222222222222222222222.zzk(str4);
                zztVar2222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar2222222222222222222222.zzO();
                return;
            case 24:
                i7 = com.google.android.gms.internal.ads.zzfl.zzB(this.zzP, java.nio.ByteOrder.LITTLE_ENDIAN);
                if (i7 == 0) {
                    int i22 = this.zzP;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i22).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i22);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    com.google.android.gms.internal.ads.zzeg.zzc("MatroskaExtractor", sb2.toString());
                    str6 = "audio/x-unknown";
                    i7 = -1;
                }
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i1422222222222222222222222 = i8;
                int i1522222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar22222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222222.zzb(i);
                zztVar22222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222.zzo(str3);
                zztVar22222222222222222222222.zzp(i1422222222222222222222222);
                zztVar22222222222222222222222.zze(this.zzab);
                zztVar22222222222222222222222.zzf(i1522222222222222222222222);
                zztVar22222222222222222222222.zzr(list);
                zztVar22222222222222222222222.zzk(str4);
                zztVar22222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar22222222222222222222222.zzO();
                return;
            case 25:
                i7 = com.google.android.gms.internal.ads.zzfl.zzB(this.zzP, java.nio.ByteOrder.BIG_ENDIAN);
                if (i7 == 0) {
                    int i23 = this.zzP;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i23).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i23);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    com.google.android.gms.internal.ads.zzeg.zzc("MatroskaExtractor", sb3.toString());
                    str6 = "audio/x-unknown";
                    i7 = -1;
                }
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i14222222222222222222222222 = i8;
                int i15222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar222222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222.zzb(i);
                zztVar222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222.zzp(i14222222222222222222222222);
                zztVar222222222222222222222222.zze(this.zzab);
                zztVar222222222222222222222222.zzf(i15222222222222222222222222);
                zztVar222222222222222222222222.zzr(list);
                zztVar222222222222222222222222.zzk(str4);
                zztVar222222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar222222222222222222222222.zzO();
                return;
            case 26:
                i7 = com.google.android.gms.internal.ads.zzfl.zzC(this.zzP);
                if (i7 == 0) {
                    int i24 = this.zzP;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(i24).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i24);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    com.google.android.gms.internal.ads.zzeg.zzc("MatroskaExtractor", sb4.toString());
                    str6 = "audio/x-unknown";
                    i7 = -1;
                }
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222222222222222222222222 = i8;
                int i152222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222.zzo(str3);
                zztVar2222222222222222222222222.zzp(i142222222222222222222222222);
                zztVar2222222222222222222222222.zze(this.zzab);
                zztVar2222222222222222222222222.zzf(i152222222222222222222222222);
                zztVar2222222222222222222222222.zzr(list);
                zztVar2222222222222222222222222.zzk(str4);
                zztVar2222222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar2222222222222222222222222.zzO();
                return;
            case 27:
                str6 = "application/x-subrip";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i1422222222222222222222222222 = i8;
                int i1522222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar22222222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222.zzo(str3);
                zztVar22222222222222222222222222.zzp(i1422222222222222222222222222);
                zztVar22222222222222222222222222.zze(this.zzab);
                zztVar22222222222222222222222222.zzf(i1522222222222222222222222222);
                zztVar22222222222222222222222222.zzr(list);
                zztVar22222222222222222222222222.zzk(str4);
                zztVar22222222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar22222222222222222222222222.zzO();
                return;
            case 28:
            case 29:
                int i25 = com.google.android.gms.internal.ads.zzakh.zza;
                byte[] zzi = zzi(this.zzc);
                bArr = com.google.android.gms.internal.ads.zzakh.zzc;
                list = com.google.android.gms.internal.ads.zzgwm.zzk(bArr, zzi);
                str6 = "text/x-ssa";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i14222222222222222222222222222 = i8;
                int i15222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar222222222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222222.zzp(i14222222222222222222222222222);
                zztVar222222222222222222222222222.zze(this.zzab);
                zztVar222222222222222222222222222.zzf(i15222222222222222222222222222);
                zztVar222222222222222222222222222.zzr(list);
                zztVar222222222222222222222222222.zzk(str4);
                zztVar222222222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar222222222222222222222222222.zzO();
                return;
            case 30:
                str6 = "text/vtt";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222222222222222222222222222 = i8;
                int i152222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222222222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222.zzo(str3);
                zztVar2222222222222222222222222222.zzp(i142222222222222222222222222222);
                zztVar2222222222222222222222222222.zze(this.zzab);
                zztVar2222222222222222222222222222.zzf(i152222222222222222222222222222);
                zztVar2222222222222222222222222222.zzr(list);
                zztVar2222222222222222222222222222.zzk(str4);
                zztVar2222222222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar2222222222222222222222222222.zzO();
                return;
            case 31:
                list = com.google.android.gms.internal.ads.zzgwm.zzj(zzi(str5));
                str6 = "application/vobsub";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i1422222222222222222222222222222 = i8;
                int i1522222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar22222222222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar22222222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222222.zzo(str3);
                zztVar22222222222222222222222222222.zzp(i1422222222222222222222222222222);
                zztVar22222222222222222222222222222.zze(this.zzab);
                zztVar22222222222222222222222222222.zzf(i1522222222222222222222222222222);
                zztVar22222222222222222222222222222.zzr(list);
                zztVar22222222222222222222222222222.zzk(str4);
                zztVar22222222222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar22222222222222222222222222222.zzO();
                return;
            case ' ':
                str6 = "application/pgs";
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                list = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i14222222222222222222222222222222 = i8;
                int i15222222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar222222222222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar222222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222222.zzo(str3);
                zztVar222222222222222222222222222222.zzp(i14222222222222222222222222222222);
                zztVar222222222222222222222222222222.zze(this.zzab);
                zztVar222222222222222222222222222222.zzf(i15222222222222222222222222222222);
                zztVar222222222222222222222222222222.zzr(list);
                zztVar222222222222222222222222222222.zzk(str4);
                zztVar222222222222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar222222222222222222222222222222.zzO();
                return;
            case '!':
                byte[] bArr6 = new byte[4];
                java.lang.System.arraycopy(zzi(str5), 0, bArr6, 0, 4);
                zzj = com.google.android.gms.internal.ads.zzgwm.zzj(bArr6);
                str6 = "application/dvbsubs";
                list = zzj;
                i7 = -1;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str6;
                str4 = str2;
                int i142222222222222222222222222222222 = i8;
                int i152222222222222222222222222222222 = (this.zzW ? 1 : 0) | (true == this.zzV ? 0 : 2);
                com.google.android.gms.internal.ads.zzt zztVar2222222222222222222222222222222 = new com.google.android.gms.internal.ads.zzt();
                if (!com.google.android.gms.internal.ads.zzas.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zztVar2222222222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222222.zzo(str3);
                zztVar2222222222222222222222222222222.zzp(i142222222222222222222222222222222);
                zztVar2222222222222222222222222222222.zze(this.zzab);
                zztVar2222222222222222222222222222222.zzf(i152222222222222222222222222222222);
                zztVar2222222222222222222222222222222.zzr(list);
                zztVar2222222222222222222222222222222.zzk(str4);
                zztVar2222222222222222222222222222222.zzs(this.zzl);
                this.zzY = zztVar2222222222222222222222222222222.zzO();
                return;
            default:
                throw com.google.android.gms.internal.ads.zzat.zzb("Unrecognized codec identifier.", null);
        }
    }

    final /* synthetic */ void zzb() {
        this.zzX.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzaa;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzaa = i;
    }

    final /* synthetic */ void zze(java.lang.String str) {
        this.zzab = str;
    }
}
