package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzakh implements com.google.android.gms.internal.ads.zzafy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final java.util.UUID zzf;
    private static final java.util.Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private com.google.android.gms.internal.ads.zzakg zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final android.util.SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private com.google.android.gms.internal.ads.zzagb zzap;
    private final com.google.android.gms.internal.ads.zzaka zzaq;
    private final com.google.android.gms.internal.ads.zzakj zzh;
    private final android.util.SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final com.google.android.gms.internal.ads.zzanj zzl;
    private final com.google.android.gms.internal.ads.zzet zzm;
    private final com.google.android.gms.internal.ads.zzet zzn;
    private final com.google.android.gms.internal.ads.zzet zzo;
    private final com.google.android.gms.internal.ads.zzet zzp;
    private final com.google.android.gms.internal.ads.zzet zzq;
    private final com.google.android.gms.internal.ads.zzet zzr;
    private final com.google.android.gms.internal.ads.zzet zzs;
    private final com.google.android.gms.internal.ads.zzet zzt;
    private final com.google.android.gms.internal.ads.zzet zzu;
    private final com.google.android.gms.internal.ads.zzet zzv;
    private java.nio.ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = com.google.android.gms.internal.ads.zzakd.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new java.util.UUID(72057594037932032L, -9223371306706625679L);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = java.util.Collections.unmodifiableMap(hashMap);
    }

    @java.lang.Deprecated
    public zzakh() {
        this(new com.google.android.gms.internal.ads.zzaka(), 2, com.google.android.gms.internal.ads.zzanj.zza);
    }

    private static int[] zzA(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[java.lang.Math.max(length + length, i)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzap;
                zzagbVar.getClass();
                zzagbVar.zzv();
                this.zzD = false;
                return;
            }
            if (((com.google.android.gms.internal.ads.zzakg) sparseArray.valueAt(i)).zzU) {
                return;
            } else {
                i++;
            }
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"currentTrack"})
    private final void zzq(int i) throws com.google.android.gms.internal.ads.zzat {
        if (this.zzE != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
    }

    private final void zzr(int i) throws com.google.android.gms.internal.ads.zzat {
        if (this.zzJ) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzs(com.google.android.gms.internal.ads.zzakg zzakgVar, long j, int i, int i2, int i3) {
        char c;
        byte[] zzx;
        int i4;
        int zze2;
        com.google.android.gms.internal.ads.zzahl zzahlVar = zzakgVar.zzT;
        if (zzahlVar != null) {
            zzahlVar.zzc(zzakgVar.zzX, j, i, i2, i3, zzakgVar.zzj);
        } else {
            java.lang.String str = zzakgVar.zzc;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.zzY > 1) {
                    com.google.android.gms.internal.ads.zzeg.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzW;
                    if (j2 == -9223372036854775807L) {
                        com.google.android.gms.internal.ads.zzeg.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        com.google.android.gms.internal.ads.zzet zzetVar = this.zzs;
                        byte[] zzi = zzetVar.zzi();
                        switch (str.hashCode()) {
                            case 738597099:
                                if (str.equals("S_TEXT/ASS")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 738614379:
                                if (str.equals("S_TEXT/SSA")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            zzx = zzx(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else if (c == 1 || c == 2) {
                            zzx = zzx(j2, "%01d:%02d:%02d:%02d", 10000L);
                            i4 = 21;
                        } else {
                            if (c != 3) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            zzx = zzx(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i4 = 25;
                        }
                        java.lang.System.arraycopy(zzx, 0, zzi, i4, zzx.length);
                        int zzg2 = zzetVar.zzg();
                        while (true) {
                            if (zzg2 < zzetVar.zze()) {
                                if (zzetVar.zzi()[zzg2] == 0) {
                                    zzetVar.zzf(zzg2);
                                } else {
                                    zzg2++;
                                }
                            }
                        }
                        zzakgVar.zzX.zzc(zzetVar, zzetVar.zze());
                        zze2 = i2 + zzetVar.zze();
                        if ((i & 268435456) != 0) {
                            if (this.zzY > 1) {
                                this.zzv.zza(0);
                            } else {
                                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzv;
                                int zze3 = zzetVar2.zze();
                                zzakgVar.zzX.zzd(zzetVar2, zze3, 2);
                                zze2 += zze3;
                            }
                        }
                        zzakgVar.zzX.zze(j, i, zze2, i3, zzakgVar.zzj);
                    }
                }
            }
            zze2 = i2;
            if ((i & 268435456) != 0) {
            }
            zzakgVar.zzX.zze(j, i, zze2, i3, zzakgVar.zzj);
        }
        this.zzT = true;
    }

    private final void zzt(com.google.android.gms.internal.ads.zzafz zzafzVar, int i) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzo;
        if (zzetVar.zze() >= i) {
            return;
        }
        if (zzetVar.zzj() < i) {
            int zzj = zzetVar.zzj();
            zzetVar.zzc(java.lang.Math.max(zzj + zzj, i));
        }
        zzafzVar.zzc(zzetVar.zzi(), zzetVar.zze(), i - zzetVar.zze());
        zzetVar.zzf(i);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.output"})
    private final int zzu(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzakg zzakgVar, int i, boolean z) throws java.io.IOException {
        int i2;
        java.lang.String str = zzakgVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzafzVar, zzb, i);
            int i3 = this.zzah;
            zzv();
            return i3;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzafzVar, zzd, i);
            int i4 = this.zzah;
            zzv();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzafzVar, zze, i);
            int i5 = this.zzah;
            zzv();
            return i5;
        }
        if (zzakgVar.zzU) {
            zzakgVar.zzY.getClass();
            int i6 = com.google.android.gms.internal.ads.zzafx.zza;
            com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(i);
            if (zzafzVar.zzh(zzetVar.zzi(), 0, i, true)) {
                zzafzVar.zzl();
                if (com.google.android.gms.internal.ads.zzafx.zza(zzetVar.zzr()) == 1 && zzetVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzetVar.zzm(bArr, 0, 10);
                    zzetVar.zzh(0);
                    int zzc2 = com.google.android.gms.internal.ads.zzafx.zzc(bArr);
                    if (zzetVar.zzd() >= zzc2 + 4) {
                        zzetVar.zzk(zzc2);
                        if (com.google.android.gms.internal.ads.zzafx.zza(zzetVar.zzB()) == 2) {
                            com.google.android.gms.internal.ads.zzt zza2 = zzakgVar.zzY.zza();
                            zza2.zzo("audio/vnd.dts.hd");
                            zzakgVar.zzY = zza2.zzO();
                        }
                    }
                }
            }
            zzakgVar.zzX.zzA(zzakgVar.zzY);
            zzakgVar.zzU = false;
            zzB();
        }
        com.google.android.gms.internal.ads.zzahk zzahkVar = zzakgVar.zzX;
        if (!this.zzaj) {
            if (zzakgVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzo;
                    zzafzVar.zzc(zzetVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzetVar2.zzi()[0] & 128) == 128) {
                        throw com.google.android.gms.internal.ads.zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzetVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b = this.zzan;
                if ((b & 1) == 1) {
                    int i7 = b & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzt;
                        zzafzVar.zzc(zzetVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        com.google.android.gms.internal.ads.zzet zzetVar4 = this.zzo;
                        zzetVar4.zzi()[0] = (byte) ((i7 != 2 ? 0 : 128) | 8);
                        zzetVar4.zzh(0);
                        zzahkVar.zzd(zzetVar4, 1, 1);
                        this.zzah++;
                        zzetVar3.zzh(0);
                        zzahkVar.zzd(zzetVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i7 == 2) {
                        if (!this.zzal) {
                            com.google.android.gms.internal.ads.zzet zzetVar5 = this.zzo;
                            zzafzVar.zzc(zzetVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzetVar5.zzh(0);
                            this.zzam = zzetVar5.zzs();
                            this.zzal = true;
                        }
                        int i8 = this.zzam * 4;
                        com.google.android.gms.internal.ads.zzet zzetVar6 = this.zzo;
                        zzetVar6.zza(i8);
                        zzafzVar.zzc(zzetVar6.zzi(), 0, i8);
                        this.zzag += i8;
                        int i9 = (this.zzam >> 1) + 1;
                        int i10 = (i9 * 6) + 2;
                        java.nio.ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.zzw = java.nio.ByteBuffer.allocate(i10);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i9);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i2 = this.zzam;
                            if (i11 >= i2) {
                                break;
                            }
                            int zzH = zzetVar6.zzH();
                            int i13 = zzH - i12;
                            if (i11 % 2 == 0) {
                                this.zzw.putShort((short) i13);
                            } else {
                                this.zzw.putInt(i13);
                            }
                            i11++;
                            i12 = zzH;
                        }
                        int i14 = (i - this.zzag) - i12;
                        if ((i2 & 1) == 1) {
                            this.zzw.putInt(i14);
                        } else {
                            this.zzw.putShort((short) i14);
                            this.zzw.putInt(0);
                        }
                        com.google.android.gms.internal.ads.zzet zzetVar7 = this.zzu;
                        zzetVar7.zzb(this.zzw.array(), i10);
                        zzahkVar.zzd(zzetVar7, i10, 1);
                        this.zzah += i10;
                    }
                }
            } else {
                byte[] bArr2 = zzakgVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzakgVar.zzc) ? zzakgVar.zzg > 0 : z) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int zze2 = (this.zzr.zze() + i) - this.zzag;
                com.google.android.gms.internal.ads.zzet zzetVar8 = this.zzo;
                zzetVar8.zza(4);
                zzetVar8.zzi()[0] = (byte) ((zze2 >> 24) & 255);
                zzetVar8.zzi()[1] = (byte) ((zze2 >> 16) & 255);
                zzetVar8.zzi()[2] = (byte) ((zze2 >> 8) & 255);
                zzetVar8.zzi()[3] = (byte) (zze2 & 255);
                zzahkVar.zzd(zzetVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        com.google.android.gms.internal.ads.zzet zzetVar9 = this.zzr;
        int zze3 = i + zzetVar9.zze();
        java.lang.String str2 = zzakgVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzakgVar.zzT != null) {
                com.google.android.gms.internal.ads.zzgtj.zzi(zzetVar9.zze() == 0);
                zzakgVar.zzT.zzb(zzafzVar);
            }
            while (true) {
                int i15 = this.zzag;
                if (i15 >= zze3) {
                    break;
                }
                int zzy = zzy(zzafzVar, zzahkVar, zze3 - i15);
                this.zzag += zzy;
                this.zzah += zzy;
            }
        } else {
            com.google.android.gms.internal.ads.zzet zzetVar10 = this.zzn;
            byte[] zzi = zzetVar10.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i16 = zzakgVar.zzZ;
            int i17 = 4 - i16;
            while (this.zzag < zze3) {
                int i18 = this.zzai;
                if (i18 == 0) {
                    int min = java.lang.Math.min(i16, zzetVar9.zzd());
                    zzafzVar.zzc(zzi, i17 + min, i16 - min);
                    if (min > 0) {
                        zzetVar9.zzm(zzi, i17, min);
                    }
                    this.zzag += i16;
                    zzetVar10.zzh(0);
                    this.zzai = zzetVar10.zzH();
                    com.google.android.gms.internal.ads.zzet zzetVar11 = this.zzm;
                    zzetVar11.zzh(0);
                    zzahkVar.zzc(zzetVar11, 4);
                    this.zzah += 4;
                } else {
                    int zzy2 = zzy(zzafzVar, zzahkVar, i18);
                    this.zzag += zzy2;
                    this.zzah += zzy2;
                    this.zzai -= zzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzakgVar.zzc)) {
            com.google.android.gms.internal.ads.zzet zzetVar12 = this.zzp;
            zzetVar12.zzh(0);
            zzahkVar.zzc(zzetVar12, 4);
            this.zzah += 4;
        }
        int i19 = this.zzah;
        zzv();
        return i19;
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(com.google.android.gms.internal.ads.zzafz zzafzVar, byte[] bArr, int i) throws java.io.IOException {
        int length = bArr.length;
        int i2 = length + i;
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzs;
        if (zzetVar.zzj() < i2) {
            byte[] copyOf = java.util.Arrays.copyOf(bArr, i2 + i);
            zzetVar.zzb(copyOf, copyOf.length);
        } else {
            java.lang.System.arraycopy(bArr, 0, zzetVar.zzi(), 0, length);
        }
        zzafzVar.zzc(zzetVar.zzi(), length, i);
        zzetVar.zzh(0);
        zzetVar.zzf(i2);
    }

    private static byte[] zzx(long j, java.lang.String str, long j2) {
        com.google.android.gms.internal.ads.zzgtj.zza(j != -9223372036854775807L);
        java.util.Locale locale = java.util.Locale.US;
        int i = (int) (j / 3600000000L);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        java.lang.String format = java.lang.String.format(locale, str, valueOf, valueOf2, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        return format.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    private final int zzy(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzahk zzahkVar, int i) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzr;
        int zzd2 = zzetVar.zzd();
        if (zzd2 <= 0) {
            return zzahkVar.zza(zzafzVar, i, false);
        }
        int min = java.lang.Math.min(i, zzd2);
        zzahkVar.zzc(zzetVar, min);
        return min;
    }

    private final long zzz(long j) throws com.google.android.gms.internal.ads.zzat {
        long j2 = this.zzz;
        if (j2 != -9223372036854775807L) {
            return com.google.android.gms.internal.ads.zzfl.zzv(j, j2, 1000L, java.math.RoundingMode.DOWN);
        }
        throw com.google.android.gms.internal.ads.zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        return new com.google.android.gms.internal.ads.zzaki().zza(zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        if (this.zzk) {
            zzagbVar = new com.google.android.gms.internal.ads.zzanm(zzagbVar, this.zzl);
        }
        this.zzap = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        int i = 0;
        this.zzT = false;
        while (!this.zzT) {
            boolean zzc2 = this.zzaq.zzc(zzafzVar);
            if (zzc2) {
                long zzn = zzafzVar.zzn();
                if (this.zzP) {
                    this.zzR = zzn;
                    zzagyVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j = this.zzR;
                    if (j != -1) {
                        zzagyVar.zza = j;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            }
            if (!zzc2) {
                while (true) {
                    android.util.SparseArray sparseArray = this.zzi;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    com.google.android.gms.internal.ads.zzakg zzakgVar = (com.google.android.gms.internal.ads.zzakg) sparseArray.valueAt(i);
                    zzakgVar.zzb();
                    com.google.android.gms.internal.ads.zzahl zzahlVar = zzakgVar.zzT;
                    if (zzahlVar != null) {
                        zzahlVar.zzd(zzakgVar.zzX, zzakgVar.zzj);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        this.zzS = -9223372036854775807L;
        int i = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            android.util.SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                return;
            }
            com.google.android.gms.internal.ads.zzahl zzahlVar = ((com.google.android.gms.internal.ads.zzakg) sparseArray.valueAt(i)).zzT;
            if (zzahlVar != null) {
                zzahlVar.zza();
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    protected final void zzh(int i, long j, long j2) throws com.google.android.gms.internal.ads.zzat {
        com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzap;
        zzagbVar.getClass();
        if (i == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i == 174) {
            com.google.android.gms.internal.ads.zzakg zzakgVar = new com.google.android.gms.internal.ads.zzakg();
            this.zzE = zzakgVar;
            zzakgVar.zza = this.zzC;
            return;
        }
        if (i == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            this.zzK = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i == 20533) {
            zzq(i);
            this.zzE.zzh = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
            return;
        }
        if (i == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzagbVar.zzw(new com.google.android.gms.internal.ads.zzaha(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    protected final void zzj(int i, long j) throws com.google.android.gms.internal.ads.zzat {
        boolean z;
        if (i == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzN == -1) {
                this.zzN = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzM == -1) {
                this.zzM = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw com.google.android.gms.internal.ads.zzat.zzb(sb2.toString(), null);
        }
        switch (i) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i2 = (int) j;
                if (i2 == 1) {
                    zzq(i);
                    this.zzE.zze = 2;
                    return;
                }
                if (i2 == 2) {
                    zzq(i);
                    this.zzE.zze = 1;
                    return;
                } else if (i2 == 17) {
                    zzq(i);
                    this.zzE.zze = 3;
                    return;
                } else if (i2 != 33) {
                    zzq(i);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i);
                    this.zzE.zze = 5;
                    return;
                }
            case 136:
                z = j == 1;
                zzq(i);
                this.zzE.zzW = z;
                return;
            case 155:
                this.zzW = zzz(j);
                return;
            case 159:
                zzq(i);
                this.zzE.zzO = (int) j;
                return;
            case 176:
                zzq(i);
                this.zzE.zzm = (int) j;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i);
                this.zzK = zzz(j);
                return;
            case 186:
                zzq(i);
                this.zzE.zzn = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzq(i);
                this.zzE.zzd = (int) j;
                return;
            case 231:
                this.zzS = zzz(j);
                return;
            case 238:
                this.zzad = (int) j;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i);
                this.zzL = (int) j;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i);
                this.zzE.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw com.google.android.gms.internal.ads.zzat.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw com.google.android.gms.internal.ads.zzat.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw com.google.android.gms.internal.ads.zzat.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw com.google.android.gms.internal.ads.zzat.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw com.google.android.gms.internal.ads.zzat.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j + this.zzy;
                return;
            case 21432:
                int i3 = (int) j;
                zzq(i);
                if (i3 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i3 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i);
                this.zzE.zzp = (int) j;
                return;
            case 21682:
                zzq(i);
                this.zzE.zzr = (int) j;
                return;
            case 21690:
                zzq(i);
                this.zzE.zzq = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzq(i);
                this.zzE.zzV = z;
                return;
            case 21938:
                zzq(i);
                this.zzE.zzo = (int) j;
                return;
            case 21998:
                zzq(i);
                this.zzE.zzg = (int) j;
                return;
            case 22186:
                zzq(i);
                this.zzE.zzR = j;
                return;
            case 22203:
                zzq(i);
                this.zzE.zzS = j;
                return;
            case 25188:
                zzq(i);
                this.zzE.zzP = (int) j;
                return;
            case 30114:
                this.zzaf = j;
                return;
            case 30321:
                int i4 = (int) j;
                zzq(i);
                if (i4 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i4 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i4 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i);
                this.zzE.zzf = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i5 = (int) j;
                        zzq(i);
                        if (i5 == 1) {
                            this.zzE.zzA = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.zzE.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzq(i);
                        int zzc2 = com.google.android.gms.internal.ads.zzi.zzc((int) j);
                        if (zzc2 != -1) {
                            this.zzE.zzz = zzc2;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i);
                        int zzb2 = com.google.android.gms.internal.ads.zzi.zzb((int) j);
                        if (zzb2 != -1) {
                            this.zzE.zzy = zzb2;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i);
                        this.zzE.zzB = (int) j;
                        return;
                    case 21949:
                        zzq(i);
                        this.zzE.zzC = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    zzakh(com.google.android.gms.internal.ads.zzaka zzakaVar, int i, com.google.android.gms.internal.ads.zzanj zzanjVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = -9223372036854775807L;
        this.zzaq = zzakaVar;
        zzakaVar.zza(new com.google.android.gms.internal.ads.zzakc(this, null));
        this.zzl = zzanjVar;
        this.zzI = new android.util.SparseArray();
        this.zzj = 1 == ((i & 1) ^ 1);
        this.zzk = (i & 2) == 0;
        this.zzh = new com.google.android.gms.internal.ads.zzakj();
        this.zzi = new android.util.SparseArray();
        this.zzo = new com.google.android.gms.internal.ads.zzet(4);
        this.zzp = new com.google.android.gms.internal.ads.zzet(java.nio.ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new com.google.android.gms.internal.ads.zzet(4);
        this.zzm = new com.google.android.gms.internal.ads.zzet(com.google.android.gms.internal.ads.zzgp.zza);
        this.zzn = new com.google.android.gms.internal.ads.zzet(4);
        this.zzr = new com.google.android.gms.internal.ads.zzet();
        this.zzs = new com.google.android.gms.internal.ads.zzet();
        this.zzt = new com.google.android.gms.internal.ads.zzet(8);
        this.zzu = new com.google.android.gms.internal.ads.zzet();
        this.zzv = new com.google.android.gms.internal.ads.zzet();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    protected final void zzl(int i, java.lang.String str) throws com.google.android.gms.internal.ads.zzat {
        if (i == 134) {
            zzq(i);
            this.zzE.zzc = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                zzq(i);
                this.zzE.zzb = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                zzq(i);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = java.util.Objects.equals(str, "webm");
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
    }

    protected final void zzm(int i, int i2, com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzakg zzakgVar;
        com.google.android.gms.internal.ads.zzakg zzakgVar2;
        com.google.android.gms.internal.ads.zzakg zzakgVar3;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = 1;
        int i10 = 0;
        if (i8 != 161 && i8 != 163) {
            if (i8 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                com.google.android.gms.internal.ads.zzakg zzakgVar4 = (com.google.android.gms.internal.ads.zzakg) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzakgVar4.zzc)) {
                    zzafzVar.zzf(i2);
                    return;
                }
                com.google.android.gms.internal.ads.zzet zzetVar = this.zzv;
                zzetVar.zza(i2);
                zzafzVar.zzc(zzetVar.zzi(), 0, i2);
                return;
            }
            if (i8 == 16877) {
                zzq(i);
                com.google.android.gms.internal.ads.zzakg zzakgVar5 = this.zzE;
                if (zzakgVar5.zzc() != 1685485123 && zzakgVar5.zzc() != 1685480259) {
                    zzafzVar.zzf(i2);
                    return;
                } else {
                    zzakgVar5.zzN = new byte[i2];
                    zzafzVar.zzc(zzakgVar5.zzN, 0, i2);
                    return;
                }
            }
            if (i8 == 16981) {
                zzq(i);
                com.google.android.gms.internal.ads.zzakg zzakgVar6 = this.zzE;
                zzakgVar6.zzi = new byte[i2];
                zzafzVar.zzc(zzakgVar6.zzi, 0, i2);
                return;
            }
            if (i8 == 18402) {
                byte[] bArr = new byte[i2];
                zzafzVar.zzc(bArr, 0, i2);
                zzq(i);
                this.zzE.zzj = new com.google.android.gms.internal.ads.zzahj(1, bArr, 0, 0);
                return;
            }
            if (i8 == 21419) {
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzq;
                java.util.Arrays.fill(zzetVar2.zzi(), (byte) 0);
                zzafzVar.zzc(zzetVar2.zzi(), 4 - i2, i2);
                zzetVar2.zzh(0);
                this.zzG = (int) zzetVar2.zzz();
                return;
            }
            if (i8 == 25506) {
                zzq(i);
                com.google.android.gms.internal.ads.zzakg zzakgVar7 = this.zzE;
                zzakgVar7.zzk = new byte[i2];
                zzafzVar.zzc(zzakgVar7.zzk, 0, i2);
                return;
            }
            if (i8 != 30322) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i8);
                throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
            }
            zzq(i);
            com.google.android.gms.internal.ads.zzakg zzakgVar8 = this.zzE;
            zzakgVar8.zzw = new byte[i2];
            zzafzVar.zzc(zzakgVar8.zzw, 0, i2);
            return;
        }
        int i11 = 8;
        if (this.zzU == 0) {
            com.google.android.gms.internal.ads.zzakj zzakjVar = this.zzh;
            this.zzaa = (int) zzakjVar.zzb(zzafzVar, false, true, 8);
            this.zzab = zzakjVar.zzc();
            this.zzW = -9223372036854775807L;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        com.google.android.gms.internal.ads.zzakg zzakgVar9 = (com.google.android.gms.internal.ads.zzakg) this.zzi.get(this.zzaa);
        if (zzakgVar9 == null) {
            zzafzVar.zzf(i2 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzakgVar9.zzb();
        if (this.zzU == 1) {
            zzt(zzafzVar, 3);
            com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzo;
            int i12 = (zzetVar3.zzi()[2] & 6) >> 1;
            if (i12 == 0) {
                this.zzY = 1;
                int[] zzA = zzA(this.zzZ, 1);
                this.zzZ = zzA;
                zzA[0] = (i2 - this.zzab) - 3;
            } else {
                zzt(zzafzVar, 4);
                int i13 = (zzetVar3.zzi()[3] & 255) + 1;
                this.zzY = i13;
                int[] zzA2 = zzA(this.zzZ, i13);
                this.zzZ = zzA2;
                if (i12 == 2) {
                    int i14 = (i2 - this.zzab) - 4;
                    int i15 = this.zzY;
                    java.util.Arrays.fill(zzA2, 0, i15, i14 / i15);
                } else {
                    if (i12 != 1) {
                        if (i12 != 3) {
                            throw com.google.android.gms.internal.ads.zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i16 = 0;
                        int i17 = 4;
                        int i18 = 0;
                        while (true) {
                            int i19 = this.zzY - 1;
                            if (i16 >= i19) {
                                zzakgVar2 = zzakgVar9;
                                this.zzZ[i19] = ((i2 - this.zzab) - i17) - i18;
                                break;
                            }
                            this.zzZ[i16] = i10;
                            int i20 = i17 + 1;
                            zzt(zzafzVar, i20);
                            if (zzetVar3.zzi()[i17] == 0) {
                                throw com.google.android.gms.internal.ads.zzat.zzb("No valid varint length mask found", null);
                            }
                            int i21 = 0;
                            while (true) {
                                if (i21 >= i11) {
                                    zzakgVar3 = zzakgVar9;
                                    j = 0;
                                    break;
                                }
                                int i22 = i9 << (7 - i21);
                                if ((zzetVar3.zzi()[i17] & i22) != 0) {
                                    i20 += i21;
                                    zzt(zzafzVar, i20);
                                    j = zzetVar3.zzi()[i17] & 255 & (~i22);
                                    int i23 = i17 + 1;
                                    while (i23 < i20) {
                                        j = (j << i11) | (zzetVar3.zzi()[i23] & 255);
                                        i23++;
                                        zzakgVar9 = zzakgVar9;
                                        i11 = 8;
                                    }
                                    zzakgVar3 = zzakgVar9;
                                    if (i16 > 0) {
                                        j -= (1 << ((i21 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i21++;
                                    i9 = 1;
                                    i11 = 8;
                                }
                            }
                            i17 = i20;
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzZ;
                            int i24 = (int) j;
                            if (i16 != 0) {
                                i24 += iArr[i16 - 1];
                            }
                            iArr[i16] = i24;
                            i18 += i24;
                            i16++;
                            zzakgVar9 = zzakgVar3;
                            i9 = 1;
                            i10 = 0;
                            i11 = 8;
                        }
                        throw com.google.android.gms.internal.ads.zzat.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 4;
                    while (true) {
                        i3 = this.zzY - 1;
                        if (i25 >= i3) {
                            break;
                        }
                        this.zzZ[i25] = 0;
                        while (true) {
                            i4 = i27 + 1;
                            zzt(zzafzVar, i4);
                            int i28 = zzetVar3.zzi()[i27] & 255;
                            int[] iArr2 = this.zzZ;
                            i5 = iArr2[i25] + i28;
                            iArr2[i25] = i5;
                            if (i28 != 255) {
                                break;
                            } else {
                                i27 = i4;
                            }
                        }
                        i26 += i5;
                        i25++;
                        i27 = i4;
                    }
                    this.zzZ[i3] = ((i2 - this.zzab) - i27) - i26;
                }
            }
            zzakgVar2 = zzakgVar9;
            this.zzV = this.zzS + zzz((zzetVar3.zzi()[0] << 8) | (zzetVar3.zzi()[1] & 255));
            zzakgVar = zzakgVar2;
            if (zzakgVar.zze != 1) {
                if (i8 == 163) {
                    i6 = 2;
                    if ((zzetVar3.zzi()[2] & 128) == 128) {
                        i8 = 163;
                    } else {
                        i8 = 163;
                    }
                } else {
                    i6 = 2;
                }
                i7 = 0;
                this.zzac = i7;
                this.zzU = i6;
                this.zzX = 0;
            } else {
                i6 = 2;
            }
            i7 = 1;
            this.zzac = i7;
            this.zzU = i6;
            this.zzX = 0;
        } else {
            zzakgVar = zzakgVar9;
        }
        if (i8 == 163) {
            while (true) {
                int i29 = this.zzX;
                if (i29 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                zzs(zzakgVar, ((this.zzX * zzakgVar.zzf) / 1000) + this.zzV, this.zzac, zzu(zzafzVar, zzakgVar, this.zzZ[i29], false), 0);
                this.zzX++;
            }
        } else {
            while (true) {
                int i30 = this.zzX;
                if (i30 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i30] = zzu(zzafzVar, zzakgVar, iArr3[i30], true);
                this.zzX++;
            }
        }
    }

    public zzakh(com.google.android.gms.internal.ads.zzanj zzanjVar, int i) {
        this(new com.google.android.gms.internal.ads.zzaka(), 0, zzanjVar);
    }

    protected final void zzk(int i, double d) throws com.google.android.gms.internal.ads.zzat {
        if (i == 181) {
            zzq(i);
            this.zzE.zzQ = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzA = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzq(i);
                this.zzE.zzD = (float) d;
                break;
            case 21970:
                zzq(i);
                this.zzE.zzE = (float) d;
                break;
            case 21971:
                zzq(i);
                this.zzE.zzF = (float) d;
                break;
            case 21972:
                zzq(i);
                this.zzE.zzG = (float) d;
                break;
            case 21973:
                zzq(i);
                this.zzE.zzH = (float) d;
                break;
            case 21974:
                zzq(i);
                this.zzE.zzI = (float) d;
                break;
            case 21975:
                zzq(i);
                this.zzE.zzJ = (float) d;
                break;
            case 21976:
                zzq(i);
                this.zzE.zzK = (float) d;
                break;
            case 21977:
                zzq(i);
                this.zzE.zzL = (float) d;
                break;
            case 21978:
                zzq(i);
                this.zzE.zzM = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzq(i);
                        this.zzE.zzt = (float) d;
                        break;
                    case 30324:
                        zzq(i);
                        this.zzE.zzu = (float) d;
                        break;
                    case 30325:
                        zzq(i);
                        this.zzE.zzv = (float) d;
                        break;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03a9, code lost:
    
        if (r4.equals("V_MPEGH/ISO/HEVC") != false) goto L287;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzi(int i) throws com.google.android.gms.internal.ads.zzat {
        int i2;
        int i3;
        android.util.SparseArray sparseArray;
        java.util.List list;
        android.util.SparseArray sparseArray2;
        com.google.android.gms.internal.ads.zzakg zzakgVar;
        long zza2;
        long j;
        long zzb2;
        long zza3;
        com.google.android.gms.internal.ads.zzakg zzakgVar2;
        this.zzap.getClass();
        char c = '\b';
        int i4 = 2;
        if (i == 160) {
            if (this.zzU == 2) {
                com.google.android.gms.internal.ads.zzakg zzakgVar3 = (com.google.android.gms.internal.ads.zzakg) this.zzi.get(this.zzaa);
                zzakgVar3.zzb();
                if (this.zzaf > 0 && "A_OPUS".equals(zzakgVar3.zzc)) {
                    com.google.android.gms.internal.ads.zzet zzetVar = this.zzv;
                    byte[] array = java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.zzaf).array();
                    zzetVar.zzb(array, array.length);
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzY; i6++) {
                    i5 += this.zzZ[i6];
                }
                int i7 = 0;
                while (i7 < this.zzY) {
                    long j2 = this.zzV + ((zzakgVar3.zzf * i7) / 1000);
                    int i8 = this.zzac;
                    if (i7 == 0) {
                        if (!this.zzae) {
                            i8 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i7;
                    }
                    int i9 = this.zzZ[i2];
                    int i10 = i5 - i9;
                    zzs(zzakgVar3, j2, i8, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzU = 0;
                return;
            }
            return;
        }
        if (i == 174) {
            com.google.android.gms.internal.ads.zzakg zzakgVar4 = this.zzE;
            zzakgVar4.getClass();
            java.lang.String str = zzakgVar4.zzc;
            if (str == null) {
                throw com.google.android.gms.internal.ads.zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str.hashCode()) {
                case -2095576542:
                    if (str.equals("V_MPEG4/ISO/AP")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -2095575984:
                    if (str.equals("V_MPEG4/ISO/SP")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1985379776:
                    if (str.equals("A_MS/ACM")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784763192:
                    if (str.equals("A_TRUEHD")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1730367663:
                    if (str.equals("A_VORBIS")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641358:
                    if (str.equals("A_MPEG/L2")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641357:
                    if (str.equals("A_MPEG/L3")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -1373388978:
                    if (str.equals("V_MS/VFW/FOURCC")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -933872740:
                    if (str.equals("S_DVBSUB")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363189:
                    if (str.equals("V_MPEG4/ISO/ASP")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -538363109:
                    if (str.equals("V_MPEG4/ISO/AVC")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -425012669:
                    if (str.equals("S_VOBSUB")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case -356037306:
                    if (str.equals("A_DTS/LOSSLESS")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 62923557:
                    if (str.equals("A_AAC")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923603:
                    if (str.equals("A_AC3")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 62927045:
                    if (str.equals("A_DTS")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 82318131:
                    if (str.equals("V_AV1")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338133:
                    if (str.equals("V_VP8")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338134:
                    if (str.equals("V_VP9")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 99146302:
                    if (str.equals("S_HDMV/PGS")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 444813526:
                    if (str.equals("V_THEORA")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 542569478:
                    if (str.equals("A_DTS/EXPRESS")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 635596514:
                    if (str.equals("A_PCM/FLOAT/IEEE")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 725948237:
                    if (str.equals("A_PCM/INT/BIG")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 725957860:
                    if (str.equals("A_PCM/INT/LIT")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 738597099:
                    if (str.equals("S_TEXT/ASS")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 738614379:
                    if (str.equals("S_TEXT/SSA")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    break;
                case 1045209816:
                    if (str.equals("S_TEXT/WEBVTT")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422270023:
                    if (str.equals("S_TEXT/UTF8")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809237540:
                    if (str.equals("V_MPEG2")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950749482:
                    if (str.equals("A_EAC3")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950789798:
                    if (str.equals("A_FLAC")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951062397:
                    if (str.equals("A_OPUS")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case ' ':
                case '!':
                    zzakgVar4.zza(zzakgVar4.zzd);
                    zzakgVar4.zzX = this.zzap.zzu(zzakgVar4.zzd, zzakgVar4.zze);
                    this.zzi.put(zzakgVar4.zzd, zzakgVar4);
                    break;
            }
            this.zzE = null;
            return;
        }
        long j3 = -9223372036854775807L;
        if (i == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i);
            if (this.zzK == -9223372036854775807L || (i3 = this.zzL) == -1 || this.zzM == -1) {
                return;
            }
            android.util.SparseArray sparseArray3 = this.zzI;
            java.util.List list2 = (java.util.List) sparseArray3.get(i3);
            if (list2 == null) {
                list2 = new java.util.ArrayList();
                sparseArray3.put(this.zzL, list2);
            }
            list2.add(new com.google.android.gms.internal.ads.zzake(this.zzK, this.zzy + this.zzM, this.zzN, null));
            return;
        }
        if (i == 19899) {
            int i11 = this.zzG;
            if (i11 != -1) {
                long j4 = this.zzH;
                if (j4 != -1) {
                    if (i11 == 475249515) {
                        this.zzQ = j4;
                        return;
                    }
                    return;
                }
            }
            throw com.google.android.gms.internal.ads.zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            zzq(i);
            com.google.android.gms.internal.ads.zzakg zzakgVar5 = this.zzE;
            if (zzakgVar5.zzh) {
                if (zzakgVar5.zzj == null) {
                    throw com.google.android.gms.internal.ads.zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                zzakgVar5.zzl = new com.google.android.gms.internal.ads.zzq(null, new com.google.android.gms.internal.ads.zzp(com.google.android.gms.internal.ads.zzg.zza, null, "video/webm", this.zzE.zzj.zzb));
                return;
            }
            return;
        }
        if (i == 28032) {
            zzq(i);
            com.google.android.gms.internal.ads.zzakg zzakgVar6 = this.zzE;
            if (zzakgVar6.zzh && zzakgVar6.zzi != null) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.zzz == -9223372036854775807L) {
                this.zzz = 1000000L;
            }
            long j5 = this.zzA;
            if (j5 != -9223372036854775807L) {
                this.zzB = zzz(j5);
                return;
            }
            return;
        }
        if (i == 374648427) {
            android.util.SparseArray sparseArray4 = this.zzi;
            if (sparseArray4.size() == 0) {
                throw com.google.android.gms.internal.ads.zzat.zzb("No valid tracks were found", null);
            }
            boolean z = !this.zzj || this.zzQ == -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < sparseArray4.size(); i16++) {
                com.google.android.gms.internal.ads.zzakg zzakgVar7 = (com.google.android.gms.internal.ads.zzakg) sparseArray4.valueAt(i16);
                int i17 = zzakgVar7.zze;
                if (i17 == 2) {
                    if (zzakgVar7.zzW) {
                        i12 = zzakgVar7.zzd;
                    }
                    if (i13 == -1) {
                        i13 = zzakgVar7.zzd;
                    }
                } else if (i17 == 1) {
                    if (zzakgVar7.zzW) {
                        i14 = zzakgVar7.zzd;
                    }
                    if (i15 == -1) {
                        i15 = zzakgVar7.zzd;
                    }
                }
                if (z) {
                    zzakgVar7.zzb();
                    if (!zzakgVar7.zzU) {
                        com.google.android.gms.internal.ads.zzahk zzahkVar = zzakgVar7.zzX;
                        com.google.android.gms.internal.ads.zzv zzvVar = zzakgVar7.zzY;
                        zzvVar.getClass();
                        zzahkVar.zzA(zzvVar);
                    }
                }
            }
            if (i12 != -1) {
                this.zzO = i12;
            } else if (i13 != -1) {
                this.zzO = i13;
            } else if (i14 != -1) {
                this.zzO = i14;
            } else if (i15 != -1) {
                this.zzO = i15;
            } else {
                this.zzO = sparseArray4.size() > 0 ? ((com.google.android.gms.internal.ads.zzakg) sparseArray4.valueAt(0)).zzd : -1;
            }
            if (z) {
                zzB();
                return;
            }
            return;
        }
        if (i != 475249515 || this.zzF) {
            return;
        }
        int i18 = 0;
        while (true) {
            sparseArray = this.zzI;
            if (i18 >= sparseArray.size()) {
                break;
            }
            if (((java.util.List) sparseArray.valueAt(i18)).isEmpty()) {
                i18++;
                j3 = -9223372036854775807L;
            } else if (this.zzB != j3) {
                for (int i19 = 0; i19 < sparseArray.size(); i19++) {
                    java.util.Collections.sort((java.util.List) sparseArray.valueAt(i19));
                }
                this.zzap.zzw(new com.google.android.gms.internal.ads.zzakf(sparseArray, this.zzB, this.zzO, this.zzy, this.zzx));
            }
        }
        this.zzap.zzw(new com.google.android.gms.internal.ads.zzaha(this.zzB, 0L));
        this.zzF = true;
        this.zzJ = false;
        int i20 = 0;
        while (true) {
            android.util.SparseArray sparseArray5 = this.zzi;
            if (i20 >= sparseArray5.size()) {
                zzB();
                return;
            }
            com.google.android.gms.internal.ads.zzakg zzakgVar8 = (com.google.android.gms.internal.ads.zzakg) sparseArray5.valueAt(i20);
            long j6 = this.zzB;
            long j7 = this.zzy;
            long j8 = this.zzx;
            if (zzakgVar8.zze != i4 || (list = (java.util.List) sparseArray.get(zzakgVar8.zzd)) == null || list.isEmpty()) {
                sparseArray2 = sparseArray;
                zzakgVar2 = zzakgVar8;
            } else {
                if (list.isEmpty()) {
                    sparseArray2 = sparseArray;
                    zzakgVar = zzakgVar8;
                } else {
                    int min = java.lang.Math.min(list.size(), 20);
                    double d = 0.0d;
                    int i21 = -1;
                    int i22 = 0;
                    while (i22 < min) {
                        com.google.android.gms.internal.ads.zzake zzakeVar = (com.google.android.gms.internal.ads.zzake) list.get(i22);
                        if (zzakeVar.zza() > 10000000) {
                            break;
                        }
                        int i23 = i22 + 1;
                        android.util.SparseArray sparseArray6 = sparseArray;
                        if (i22 < list.size() - 1) {
                            com.google.android.gms.internal.ads.zzake zzakeVar2 = (com.google.android.gms.internal.ads.zzake) list.get(i23);
                            j = zzakeVar2.zzb() + zzakeVar2.zzc();
                            zzb2 = zzakeVar.zzb() + zzakeVar.zzc();
                            zza3 = zzakeVar2.zza() - zzakeVar.zza();
                        } else {
                            j = j7 + j8;
                            zzb2 = zzakeVar.zzb() + zzakeVar.zzc();
                            zza3 = j6 - zzakeVar.zza();
                        }
                        long j9 = j - zzb2;
                        com.google.android.gms.internal.ads.zzakg zzakgVar9 = zzakgVar8;
                        long j10 = j7;
                        long j11 = zza3;
                        if (j11 > 0) {
                            double d2 = j9 / j11;
                            if (d2 > d) {
                                d = d2;
                                i21 = i22;
                            }
                        }
                        zzakgVar8 = zzakgVar9;
                        i22 = i23;
                        sparseArray = sparseArray6;
                        j7 = j10;
                    }
                    sparseArray2 = sparseArray;
                    zzakgVar = zzakgVar8;
                    if (i21 != -1) {
                        zza2 = ((com.google.android.gms.internal.ads.zzake) list.get(i21)).zza();
                        zzakgVar2 = zzakgVar;
                        if (zza2 != -9223372036854775807L) {
                            com.google.android.gms.internal.ads.zzv zzvVar2 = zzakgVar2.zzY;
                            zzvVar2.getClass();
                            com.google.android.gms.internal.ads.zzap zzapVar = zzvVar2.zzl;
                            com.google.android.gms.internal.ads.zzaiz zzaizVar = new com.google.android.gms.internal.ads.zzaiz(zza2);
                            com.google.android.gms.internal.ads.zzap zzapVar2 = zzapVar == null ? new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, zzaizVar) : zzapVar.zzg(zzaizVar);
                            com.google.android.gms.internal.ads.zzt zza4 = zzakgVar2.zzY.zza();
                            zza4.zzl(zzapVar2);
                            zzakgVar2.zzY = zza4.zzO();
                        }
                    }
                }
                zza2 = -9223372036854775807L;
                zzakgVar2 = zzakgVar;
                if (zza2 != -9223372036854775807L) {
                }
            }
            if (!zzakgVar2.zzU) {
                zzakgVar2.zzb();
                com.google.android.gms.internal.ads.zzahk zzahkVar2 = zzakgVar2.zzX;
                com.google.android.gms.internal.ads.zzv zzvVar3 = zzakgVar2.zzY;
                zzvVar3.getClass();
                zzahkVar2.zzA(zzvVar3);
            }
            i20++;
            sparseArray = sparseArray2;
            i4 = 2;
        }
    }
}
