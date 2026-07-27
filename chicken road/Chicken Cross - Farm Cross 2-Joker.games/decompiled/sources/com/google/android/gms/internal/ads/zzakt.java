package com.google.android.gms.internal.ads;

import android.util.LongSparseArray;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzakt implements zzagh {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private boolean zzE;
    private zzakn zzF;
    private zzaks zzG;
    private boolean zzH;
    private int zzI;
    private long zzJ;
    private final SparseArray zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private boolean zzR;
    private long zzS;
    private long zzT;
    private long zzU;
    private boolean zzV;
    private int zzW;
    private long zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int[] zzab;
    private int zzac;
    private int zzad;
    private int zzae;
    private int zzaf;
    private boolean zzag;
    private long zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private boolean zzal;
    private boolean zzam;
    private boolean zzan;
    private int zzao;
    private byte zzap;
    private boolean zzaq;
    private zzagk zzar;
    private final zzakl zzas;
    private final zzakv zzh;
    private final SparseArray zzi;
    private final LongSparseArray zzj;
    private final boolean zzk;
    private final boolean zzl;
    private final zzanx zzm;
    private final zzeu zzn;
    private final zzeu zzo;
    private final zzeu zzp;
    private final zzeu zzq;
    private final zzeu zzr;
    private final zzeu zzs;
    private final zzeu zzt;
    private final zzeu zzu;
    private final zzeu zzv;
    private final zzeu zzw;
    private ByteBuffer zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzakp.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzfm.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzakt() {
        this(new zzakl(), 2, zzanx.zza);
    }

    private final long zzA(long j) throws zzat {
        long j2 = this.zzA;
        if (j2 != -9223372036854775807L) {
            return zzfm.zzw(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzB(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final void zzC() {
        if (!this.zzE) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                zzagk zzagkVar = this.zzar;
                zzagkVar.getClass();
                zzagkVar.zzv();
                this.zzE = false;
                return;
            }
            if (((zzaks) sparseArray.valueAt(i)).zzW) {
                return;
            } else {
                i++;
            }
        }
    }

    @EnsuresNonNull({"currentChapter"})
    private final void zzq(int i) throws zzat {
        if (this.zzF != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in an EditionEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzr(int i) throws zzat {
        if (this.zzG != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    private final void zzs(int i) throws zzat {
        if (this.zzL) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzt(zzaks zzaksVar, long j, int i, int i2, int i3) {
        char c;
        byte[] zzy;
        int i4;
        int zze2;
        zzahu zzahuVar = zzaksVar.zzV;
        if (zzahuVar != null) {
            zzahuVar.zzc(zzaksVar.zzZ, j, i, i2, i3, zzaksVar.zzk);
        } else {
            String str = zzaksVar.zzc;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.zzaa > 1) {
                    zzeh.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzY;
                    if (j2 == -9223372036854775807L) {
                        zzeh.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        zzeu zzeuVar = this.zzt;
                        byte[] zzi = zzeuVar.zzi();
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
                            zzy = zzy(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else if (c == 1 || c == 2) {
                            zzy = zzy(j2, "%01d:%02d:%02d:%02d", 10000L);
                            i4 = 21;
                        } else {
                            if (c != 3) {
                                throw new IllegalArgumentException();
                            }
                            zzy = zzy(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i4 = 25;
                        }
                        System.arraycopy(zzy, 0, zzi, i4, zzy.length);
                        int zzg2 = zzeuVar.zzg();
                        while (true) {
                            if (zzg2 < zzeuVar.zze()) {
                                if (zzeuVar.zzi()[zzg2] == 0) {
                                    zzeuVar.zzf(zzg2);
                                } else {
                                    zzg2++;
                                }
                            }
                        }
                        zzaksVar.zzZ.zzc(zzeuVar, zzeuVar.zze());
                        zze2 = i2 + zzeuVar.zze();
                        if ((i & 268435456) != 0) {
                            if (this.zzaa > 1) {
                                this.zzw.zza(0);
                            } else {
                                zzeu zzeuVar2 = this.zzw;
                                int zze3 = zzeuVar2.zze();
                                zzaksVar.zzZ.zzd(zzeuVar2, zze3, 2);
                                zze2 += zze3;
                            }
                        }
                        zzaksVar.zzZ.zze(j, i, zze2, i3, zzaksVar.zzk);
                    }
                }
            }
            zze2 = i2;
            if ((i & 268435456) != 0) {
            }
            zzaksVar.zzZ.zze(j, i, zze2, i3, zzaksVar.zzk);
        }
        this.zzV = true;
    }

    private final void zzu(zzagi zzagiVar, int i) throws IOException {
        zzeu zzeuVar = this.zzp;
        if (zzeuVar.zze() >= i) {
            return;
        }
        if (zzeuVar.zzj() < i) {
            int zzj = zzeuVar.zzj();
            zzeuVar.zzc(Math.max(zzj + zzj, i));
        }
        zzagiVar.zzc(zzeuVar.zzi(), zzeuVar.zze(), i - zzeuVar.zze());
        zzeuVar.zzf(i);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzv(zzagi zzagiVar, zzaks zzaksVar, int i, boolean z) throws IOException {
        int i2;
        String str = zzaksVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzx(zzagiVar, zzb, i);
            int i3 = this.zzaj;
            zzw();
            return i3;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzx(zzagiVar, zzd, i);
            int i4 = this.zzaj;
            zzw();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzx(zzagiVar, zze, i);
            int i5 = this.zzaj;
            zzw();
            return i5;
        }
        if (zzaksVar.zzW) {
            zzv zzvVar = zzaksVar.zzaa;
            zzvVar.getClass();
            zzaksVar.zzaa = zzagg.zzi(zzagiVar, i, zzvVar);
            zzaksVar.zzZ.zzA(zzaksVar.zzaa);
            zzaksVar.zzW = false;
            zzC();
        }
        zzaht zzahtVar = zzaksVar.zzZ;
        if (!this.zzal) {
            if (zzaksVar.zzi) {
                this.zzae &= -1073741825;
                if (!this.zzam) {
                    zzeu zzeuVar = this.zzp;
                    zzagiVar.zzc(zzeuVar.zzi(), 0, 1);
                    this.zzai++;
                    if ((zzeuVar.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzap = zzeuVar.zzi()[0];
                    this.zzam = true;
                }
                byte b = this.zzap;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzae |= 1073741824;
                    if (!this.zzaq) {
                        zzeu zzeuVar2 = this.zzu;
                        zzagiVar.zzc(zzeuVar2.zzi(), 0, 8);
                        this.zzai += 8;
                        this.zzaq = true;
                        zzeu zzeuVar3 = this.zzp;
                        zzeuVar3.zzi()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        zzeuVar3.zzh(0);
                        zzahtVar.zzd(zzeuVar3, 1, 1);
                        this.zzaj++;
                        zzeuVar2.zzh(0);
                        zzahtVar.zzd(zzeuVar2, 8, 1);
                        this.zzaj += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzan) {
                            zzeu zzeuVar4 = this.zzp;
                            zzagiVar.zzc(zzeuVar4.zzi(), 0, 1);
                            this.zzai++;
                            zzeuVar4.zzh(0);
                            this.zzao = zzeuVar4.zzs();
                            this.zzan = true;
                        }
                        int i7 = this.zzao * 4;
                        zzeu zzeuVar5 = this.zzp;
                        zzeuVar5.zza(i7);
                        zzagiVar.zzc(zzeuVar5.zzi(), 0, i7);
                        this.zzai += i7;
                        int i8 = (this.zzao >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzx;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzx = ByteBuffer.allocate(i9);
                        }
                        this.zzx.position(0);
                        this.zzx.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzao;
                            if (i10 >= i2) {
                                break;
                            }
                            int zzH = zzeuVar5.zzH();
                            int i12 = zzH - i11;
                            if (i10 % 2 == 0) {
                                this.zzx.putShort((short) i12);
                            } else {
                                this.zzx.putInt(i12);
                            }
                            i10++;
                            i11 = zzH;
                        }
                        int i13 = (i - this.zzai) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzx.putInt(i13);
                        } else {
                            this.zzx.putShort((short) i13);
                            this.zzx.putInt(0);
                        }
                        zzeu zzeuVar6 = this.zzv;
                        zzeuVar6.zzb(this.zzx.array(), i9);
                        zzahtVar.zzd(zzeuVar6, i9, 1);
                        this.zzaj += i9;
                    }
                }
            } else {
                byte[] bArr = zzaksVar.zzj;
                if (bArr != null) {
                    this.zzs.zzb(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzaksVar.zzc) ? zzaksVar.zzh > 0 : z) {
                this.zzae |= 268435456;
                this.zzw.zza(0);
                int zze2 = (this.zzs.zze() + i) - this.zzai;
                zzeu zzeuVar7 = this.zzp;
                zzeuVar7.zza(4);
                zzeuVar7.zzi()[0] = (byte) ((zze2 >> 24) & 255);
                zzeuVar7.zzi()[1] = (byte) ((zze2 >> 16) & 255);
                zzeuVar7.zzi()[2] = (byte) ((zze2 >> 8) & 255);
                zzeuVar7.zzi()[3] = (byte) (zze2 & 255);
                zzahtVar.zzd(zzeuVar7, 4, 2);
                this.zzaj += 4;
            }
            this.zzal = true;
        }
        zzeu zzeuVar8 = this.zzs;
        int zze3 = i + zzeuVar8.zze();
        String str2 = zzaksVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzaksVar.zzV != null) {
                zzguk.zzi(zzeuVar8.zze() == 0);
                zzaksVar.zzV.zzb(zzagiVar);
            }
            while (true) {
                int i14 = this.zzai;
                if (i14 >= zze3) {
                    break;
                }
                int zzz = zzz(zzagiVar, zzahtVar, zze3 - i14);
                this.zzai += zzz;
                this.zzaj += zzz;
            }
        } else {
            zzeu zzeuVar9 = this.zzo;
            byte[] zzi = zzeuVar9.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i15 = zzaksVar.zzab;
            int i16 = 4 - i15;
            while (this.zzai < zze3) {
                int i17 = this.zzak;
                if (i17 == 0) {
                    int min = Math.min(i15, zzeuVar8.zzd());
                    zzagiVar.zzc(zzi, i16 + min, i15 - min);
                    if (min > 0) {
                        zzeuVar8.zzm(zzi, i16, min);
                    }
                    this.zzai += i15;
                    zzeuVar9.zzh(0);
                    this.zzak = zzeuVar9.zzH();
                    zzeu zzeuVar10 = this.zzn;
                    zzeuVar10.zzh(0);
                    zzahtVar.zzc(zzeuVar10, 4);
                    this.zzaj += 4;
                } else {
                    int zzz2 = zzz(zzagiVar, zzahtVar, i17);
                    this.zzai += zzz2;
                    this.zzaj += zzz2;
                    this.zzak -= zzz2;
                }
            }
        }
        if ("A_VORBIS".equals(zzaksVar.zzc)) {
            zzeu zzeuVar11 = this.zzq;
            zzeuVar11.zzh(0);
            zzahtVar.zzc(zzeuVar11, 4);
            this.zzaj += 4;
        }
        int i18 = this.zzaj;
        zzw();
        return i18;
    }

    private final void zzw() {
        this.zzai = 0;
        this.zzaj = 0;
        this.zzak = 0;
        this.zzal = false;
        this.zzam = false;
        this.zzan = false;
        this.zzao = 0;
        this.zzap = (byte) 0;
        this.zzaq = false;
        this.zzs.zza(0);
    }

    private final void zzx(zzagi zzagiVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        zzeu zzeuVar = this.zzt;
        if (zzeuVar.zzj() < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzeuVar.zzb(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzeuVar.zzi(), 0, length);
        }
        zzagiVar.zzc(zzeuVar.zzi(), length, i);
        zzeuVar.zzh(0);
        zzeuVar.zzf(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        zzguk.zza(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = zzfm.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzz(zzagi zzagiVar, zzaht zzahtVar, int i) throws IOException {
        zzeu zzeuVar = this.zzs;
        int zzd2 = zzeuVar.zzd();
        if (zzd2 <= 0) {
            return zzahtVar.zza(zzagiVar, i, false);
        }
        int min = Math.min(i, zzd2);
        zzahtVar.zzc(zzeuVar, min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        return new zzaku().zza(zzagiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        if (this.zzl) {
            zzagkVar = new zzaoa(zzagkVar, this.zzm);
        }
        this.zzar = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        int i = 0;
        this.zzV = false;
        while (!this.zzV) {
            boolean zzc2 = this.zzas.zzc(zzagiVar);
            if (zzc2) {
                long zzn = zzagiVar.zzn();
                if (this.zzR) {
                    this.zzT = zzn;
                    zzahhVar.zza = this.zzS;
                    this.zzR = false;
                    return 1;
                }
                if (this.zzH) {
                    long j = this.zzT;
                    if (j != -1) {
                        zzahhVar.zza = j;
                        this.zzT = -1L;
                        return 1;
                    }
                }
            }
            if (!zzc2) {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzaks zzaksVar = (zzaks) sparseArray.valueAt(i);
                    zzaksVar.zzb();
                    zzahu zzahuVar = zzaksVar.zzV;
                    if (zzahuVar != null) {
                        zzahuVar.zzd(zzaksVar.zzZ, zzaksVar.zzk);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        this.zzU = -9223372036854775807L;
        int i = 0;
        this.zzW = 0;
        this.zzas.zzb();
        this.zzh.zza();
        zzw();
        this.zzL = false;
        this.zzM = -9223372036854775807L;
        this.zzN = -1;
        this.zzO = -1L;
        this.zzP = -1L;
        if (!this.zzH) {
            this.zzK.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                return;
            }
            zzahu zzahuVar = ((zzaks) sparseArray.valueAt(i)).zzV;
            if (zzahuVar != null) {
                zzahuVar.zza();
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    protected final void zzh(int i, long j, long j2) throws zzat {
        zzagk zzagkVar = this.zzar;
        zzagkVar.getClass();
        if (i == 128) {
            zzq(i);
            this.zzF.zzh = null;
            zzq(i);
            this.zzF.zzi = null;
            return;
        }
        if (i == 160) {
            this.zzag = false;
            this.zzah = 0L;
            return;
        }
        if (i == 174) {
            zzaks zzaksVar = new zzaks();
            this.zzG = zzaksVar;
            zzaksVar.zza = this.zzD;
            return;
        }
        if (i == 187) {
            if (this.zzH) {
                return;
            }
            zzs(i);
            this.zzM = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            this.zzI = -1;
            this.zzJ = -1L;
            return;
        }
        if (i == 20533) {
            zzr(i);
            this.zzG.zzi = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzz;
            if (j3 != -1 && j3 != j) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzz = j;
            this.zzy = j2;
            return;
        }
        if (i == 475249515) {
            if (this.zzH) {
                return;
            }
            this.zzL = true;
            return;
        }
        if (i == 524531317) {
            if (this.zzH) {
                return;
            }
            if (this.zzk && this.zzS != -1) {
                this.zzR = true;
                return;
            } else {
                zzagkVar.zzw(new zzahj(this.zzC, 0L));
                this.zzH = true;
                return;
            }
        }
        if (i == 182) {
            this.zzF = new zzakn();
            return;
        }
        if (i == 183 && !this.zzH) {
            zzs(i);
            this.zzN = -1;
            this.zzO = -1L;
            this.zzP = -1L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0462, code lost:
    
        if (r4.equals("V_MPEGH/ISO/HEVC") != false) goto L321;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzi(int i) throws zzat {
        String str;
        int i2;
        SparseArray sparseArray;
        List list;
        SparseArray sparseArray2;
        zzaks zzaksVar;
        long zza2;
        long j;
        long zzb2;
        long zza3;
        zzaks zzaksVar2;
        int i3;
        this.zzar.getClass();
        if (i == 128) {
            zzakn zzaknVar = this.zzF;
            zzaknVar.getClass();
            if (zzaknVar.zzf != null || (str = zzaknVar.zzh) == null) {
                return;
            }
            zzaknVar.zzf = str;
            String str2 = zzaknVar.zzi;
            if (str2 != null) {
                zzaknVar.zzg = str2;
                return;
            }
            return;
        }
        char c = '\b';
        int i4 = 2;
        if (i == 160) {
            if (this.zzW == 2) {
                zzaks zzaksVar3 = (zzaks) this.zzi.get(this.zzac);
                zzaksVar3.zzb();
                if (this.zzah > 0 && "A_OPUS".equals(zzaksVar3.zzc)) {
                    zzeu zzeuVar = this.zzw;
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzah).array();
                    zzeuVar.zzb(array, array.length);
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzaa; i6++) {
                    i5 += this.zzab[i6];
                }
                int i7 = 0;
                while (i7 < this.zzaa) {
                    long j2 = this.zzX + ((zzaksVar3.zzg * i7) / 1000);
                    int i8 = this.zzae;
                    if (i7 == 0) {
                        if (!this.zzag) {
                            i8 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i7;
                    }
                    int i9 = this.zzab[i2];
                    int i10 = i5 - i9;
                    zzt(zzaksVar3, j2, i8, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzW = 0;
                return;
            }
            return;
        }
        int i11 = -1;
        if (i == 174) {
            zzaks zzaksVar4 = this.zzG;
            zzaksVar4.getClass();
            String str3 = zzaksVar4.zzc;
            if (str3 == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str3.hashCode()) {
                case -2095576542:
                    if (str3.equals("V_MPEG4/ISO/AP")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -2095575984:
                    if (str3.equals("V_MPEG4/ISO/SP")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1985379776:
                    if (str3.equals("A_MS/ACM")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784763192:
                    if (str3.equals("A_TRUEHD")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1730367663:
                    if (str3.equals("A_VORBIS")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641358:
                    if (str3.equals("A_MPEG/L2")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641357:
                    if (str3.equals("A_MPEG/L3")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -1373388978:
                    if (str3.equals("V_MS/VFW/FOURCC")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -933872740:
                    if (str3.equals("S_DVBSUB")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363189:
                    if (str3.equals("V_MPEG4/ISO/ASP")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -538363109:
                    if (str3.equals("V_MPEG4/ISO/AVC")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -425012669:
                    if (str3.equals("S_VOBSUB")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case -356037306:
                    if (str3.equals("A_DTS/LOSSLESS")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 62923557:
                    if (str3.equals("A_AAC")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923603:
                    if (str3.equals("A_AC3")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 62927045:
                    if (str3.equals("A_DTS")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 82318131:
                    if (str3.equals("V_AV1")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338133:
                    if (str3.equals("V_VP8")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338134:
                    if (str3.equals("V_VP9")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 99146302:
                    if (str3.equals("S_HDMV/PGS")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 444813526:
                    if (str3.equals("V_THEORA")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 542569478:
                    if (str3.equals("A_DTS/EXPRESS")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 635596514:
                    if (str3.equals("A_PCM/FLOAT/IEEE")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 725948237:
                    if (str3.equals("A_PCM/INT/BIG")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 725957860:
                    if (str3.equals("A_PCM/INT/LIT")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 738597099:
                    if (str3.equals("S_TEXT/ASS")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 738614379:
                    if (str3.equals("S_TEXT/SSA")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    break;
                case 1045209816:
                    if (str3.equals("S_TEXT/WEBVTT")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422270023:
                    if (str3.equals("S_TEXT/UTF8")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809237540:
                    if (str3.equals("V_MPEG2")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950749482:
                    if (str3.equals("A_EAC3")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950789798:
                    if (str3.equals("A_FLAC")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951062397:
                    if (str3.equals("A_OPUS")) {
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
                    zzaksVar4.zza(zzaksVar4.zzd);
                    zzaksVar4.zzZ = this.zzar.zzs(zzaksVar4.zzd, zzaksVar4.zzf);
                    this.zzi.put(zzaksVar4.zzd, zzaksVar4);
                    break;
            }
            this.zzG = null;
            return;
        }
        if (i == 17849) {
            int i12 = 0;
            while (true) {
                SparseArray sparseArray3 = this.zzi;
                if (i12 >= sparseArray3.size()) {
                    return;
                }
                zzaks zzaksVar5 = (zzaks) sparseArray3.valueAt(i12);
                LongSparseArray longSparseArray = this.zzj;
                ArrayList arrayList = new ArrayList(longSparseArray.size());
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    zzakn zzaknVar2 = (zzakn) longSparseArray.valueAt(i13);
                    long j3 = zzaknVar2.zze;
                    if (j3 == 0 || j3 == zzaksVar5.zze) {
                        zzajf zzajfVar = new zzajf();
                        zzajfVar.zza(zzfm.zzr(zzaknVar2.zzb));
                        zzajfVar.zzb(zzfm.zzr(zzaknVar2.zzc));
                        zzajfVar.zzc(zzaknVar2.zzd);
                        if (zzaknVar2.zzf != null) {
                            zzajfVar.zzd(new zzx(zzaknVar2.zzg, zzaknVar2.zzf));
                        }
                        arrayList.add(zzajfVar.zze());
                    }
                }
                if (!arrayList.isEmpty()) {
                    zzv zzvVar = zzaksVar5.zzaa;
                    zzvVar.getClass();
                    zzt zza4 = zzvVar.zza();
                    zzap zzapVar = zzvVar.zzl;
                    zza4.zzl(zzapVar != null ? zzapVar.zzg((zzao[]) arrayList.toArray(new zzajg[0])) : new zzap(arrayList));
                    zzaksVar5.zzaa = zza4.zzQ();
                }
                i12++;
            }
        } else {
            if (i == 19899) {
                int i14 = this.zzI;
                if (i14 != -1) {
                    long j4 = this.zzJ;
                    if (j4 != -1) {
                        if (i14 == 475249515) {
                            this.zzS = j4;
                            return;
                        }
                        return;
                    }
                }
                throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzr(i);
                zzaks zzaksVar6 = this.zzG;
                if (zzaksVar6.zzi) {
                    if (zzaksVar6.zzk == null) {
                        throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzaksVar6.zzm = new zzq(null, new zzp(zzg.zza, null, "video/webm", this.zzG.zzk.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzr(i);
                zzaks zzaksVar7 = this.zzG;
                if (zzaksVar7.zzi && zzaksVar7.zzj != null) {
                    throw zzat.zzb("Combining encryption and compression is not supported", null);
                }
                return;
            }
            long j5 = -9223372036854775807L;
            if (i == 357149030) {
                if (this.zzA == -9223372036854775807L) {
                    this.zzA = 1000000L;
                }
                long j6 = this.zzB;
                if (j6 != -9223372036854775807L) {
                    this.zzC = zzA(j6);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                SparseArray sparseArray4 = this.zzi;
                if (sparseArray4.size() == 0) {
                    throw zzat.zzb("No valid tracks were found", null);
                }
                boolean z = !this.zzk || this.zzS == -1;
                int i15 = -1;
                int i16 = -1;
                int i17 = -1;
                int i18 = -1;
                for (int i19 = 0; i19 < sparseArray4.size(); i19++) {
                    zzaks zzaksVar8 = (zzaks) sparseArray4.valueAt(i19);
                    int i20 = zzaksVar8.zzf;
                    if (i20 == 2) {
                        if (zzaksVar8.zzY) {
                            i15 = zzaksVar8.zzd;
                        }
                        if (i16 == -1) {
                            i16 = zzaksVar8.zzd;
                        }
                    } else if (i20 == 1) {
                        if (zzaksVar8.zzY) {
                            i17 = zzaksVar8.zzd;
                        }
                        if (i18 == -1) {
                            i18 = zzaksVar8.zzd;
                        }
                    }
                    if (z) {
                        zzaksVar8.zzb();
                        if (!zzaksVar8.zzW) {
                            zzaht zzahtVar = zzaksVar8.zzZ;
                            zzv zzvVar2 = zzaksVar8.zzaa;
                            zzvVar2.getClass();
                            zzahtVar.zzA(zzvVar2);
                        }
                    }
                }
                if (i15 != -1) {
                    this.zzQ = i15;
                } else if (i16 != -1) {
                    this.zzQ = i16;
                } else if (i17 != -1) {
                    this.zzQ = i17;
                } else if (i18 != -1) {
                    this.zzQ = i18;
                } else {
                    this.zzQ = sparseArray4.size() > 0 ? ((zzaks) sparseArray4.valueAt(0)).zzd : -1;
                }
                if (z) {
                    zzC();
                    return;
                }
                return;
            }
            if (i != 475249515) {
                if (i == 182) {
                    zzakn zzaknVar3 = this.zzF;
                    zzaknVar3.getClass();
                    long j7 = zzaknVar3.zza;
                    if (j7 != 0) {
                        this.zzj.put(j7, zzaknVar3);
                    }
                    this.zzF = null;
                    return;
                }
                if (i == 183 && !this.zzH) {
                    zzs(i);
                    if (this.zzM == -9223372036854775807L || (i3 = this.zzN) == -1 || this.zzO == -1) {
                        return;
                    }
                    SparseArray sparseArray5 = this.zzK;
                    List list2 = (List) sparseArray5.get(i3);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        sparseArray5.put(this.zzN, list2);
                    }
                    list2.add(new zzakq(this.zzM, this.zzz + this.zzO, this.zzP, null));
                    return;
                }
                return;
            }
            if (this.zzH) {
                return;
            }
            int i21 = 0;
            while (true) {
                sparseArray = this.zzK;
                if (i21 >= sparseArray.size()) {
                    break;
                }
                if (((List) sparseArray.valueAt(i21)).isEmpty()) {
                    i21++;
                    j5 = -9223372036854775807L;
                } else if (this.zzC != j5) {
                    for (int i22 = 0; i22 < sparseArray.size(); i22++) {
                        Collections.sort((List) sparseArray.valueAt(i22));
                    }
                    this.zzar.zzw(new zzakr(sparseArray, this.zzC, this.zzQ, this.zzz, this.zzy));
                }
            }
            this.zzar.zzw(new zzahj(this.zzC, 0L));
            this.zzH = true;
            this.zzL = false;
            int i23 = 0;
            while (true) {
                SparseArray sparseArray6 = this.zzi;
                if (i23 >= sparseArray6.size()) {
                    zzC();
                    return;
                }
                zzaks zzaksVar9 = (zzaks) sparseArray6.valueAt(i23);
                long j8 = this.zzC;
                long j9 = this.zzz;
                long j10 = this.zzy;
                if (zzaksVar9.zzf != i4 || (list = (List) sparseArray.get(zzaksVar9.zzd)) == null || list.isEmpty()) {
                    sparseArray2 = sparseArray;
                    zzaksVar2 = zzaksVar9;
                } else {
                    if (list.isEmpty()) {
                        sparseArray2 = sparseArray;
                        zzaksVar = zzaksVar9;
                    } else {
                        int min = Math.min(list.size(), 20);
                        double d = 0.0d;
                        int i24 = i11;
                        int i25 = 0;
                        while (i25 < min) {
                            zzakq zzakqVar = (zzakq) list.get(i25);
                            if (zzakqVar.zza() > 10000000) {
                                break;
                            }
                            int i26 = i25 + 1;
                            SparseArray sparseArray7 = sparseArray;
                            if (i25 < list.size() - 1) {
                                zzakq zzakqVar2 = (zzakq) list.get(i26);
                                j = zzakqVar2.zzb() + zzakqVar2.zzc();
                                zzb2 = zzakqVar.zzb() + zzakqVar.zzc();
                                zza3 = zzakqVar2.zza() - zzakqVar.zza();
                            } else {
                                j = j9 + j10;
                                zzb2 = zzakqVar.zzb() + zzakqVar.zzc();
                                zza3 = j8 - zzakqVar.zza();
                            }
                            long j11 = j - zzb2;
                            long j12 = j9;
                            zzaks zzaksVar10 = zzaksVar9;
                            long j13 = zza3;
                            if (j13 > 0) {
                                double d2 = j11 / j13;
                                if (d2 > d) {
                                    d = d2;
                                    i24 = i25;
                                }
                            }
                            i25 = i26;
                            zzaksVar9 = zzaksVar10;
                            sparseArray = sparseArray7;
                            j9 = j12;
                            i11 = -1;
                        }
                        sparseArray2 = sparseArray;
                        zzaksVar = zzaksVar9;
                        if (i24 != i11) {
                            zza2 = ((zzakq) list.get(i24)).zza();
                            zzaksVar2 = zzaksVar;
                            if (zza2 != -9223372036854775807L) {
                                zzv zzvVar3 = zzaksVar2.zzaa;
                                zzvVar3.getClass();
                                zzap zzapVar2 = zzvVar3.zzl;
                                zzajk zzajkVar = new zzajk(zza2);
                                zzap zzapVar3 = zzapVar2 == null ? new zzap(-9223372036854775807L, zzajkVar) : zzapVar2.zzg(zzajkVar);
                                zzt zza5 = zzaksVar2.zzaa.zza();
                                zza5.zzl(zzapVar3);
                                zzaksVar2.zzaa = zza5.zzQ();
                            }
                        }
                    }
                    zza2 = -9223372036854775807L;
                    zzaksVar2 = zzaksVar;
                    if (zza2 != -9223372036854775807L) {
                    }
                }
                if (!zzaksVar2.zzW) {
                    zzaksVar2.zzb();
                    zzaht zzahtVar2 = zzaksVar2.zzZ;
                    zzv zzvVar4 = zzaksVar2.zzaa;
                    zzvVar4.getClass();
                    zzahtVar2.zzA(zzvVar4);
                }
                i23++;
                sparseArray = sparseArray2;
                i4 = 2;
                i11 = -1;
            }
        }
    }

    protected final void zzj(int i, long j) throws zzat {
        boolean z;
        if (i == 136) {
            z = j == 1;
            zzr(i);
            this.zzG.zzY = z;
            return;
        }
        if (i == 137) {
            zzq(i);
            this.zzF.zze = j;
            return;
        }
        if (i == 145) {
            zzq(i);
            this.zzF.zzb = j;
            return;
        }
        if (i == 146) {
            zzq(i);
            this.zzF.zzc = j;
            return;
        }
        if (i == 240) {
            if (this.zzH) {
                return;
            }
            zzs(i);
            if (this.zzP == -1) {
                this.zzP = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.zzH) {
                return;
            }
            zzs(i);
            if (this.zzO == -1) {
                this.zzO = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i == 29636) {
            zzq(i);
            this.zzF.zza = j;
            return;
        }
        if (i == 29637) {
            zzr(i);
            this.zzG.zze = j;
            return;
        }
        switch (i) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i2 = (int) j;
                if (i2 == 1) {
                    zzr(i);
                    this.zzG.zzf = 2;
                    return;
                }
                if (i2 == 2) {
                    zzr(i);
                    this.zzG.zzf = 1;
                    return;
                } else if (i2 == 17) {
                    zzr(i);
                    this.zzG.zzf = 3;
                    return;
                } else if (i2 != 33) {
                    zzr(i);
                    this.zzG.zzf = -1;
                    return;
                } else {
                    zzr(i);
                    this.zzG.zzf = 5;
                    return;
                }
            case 152:
                z = j == 1;
                zzq(i);
                this.zzF.zzd = z;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.zzY = zzA(j);
                return;
            case 159:
                zzr(i);
                this.zzG.zzP = (int) j;
                return;
            case 176:
                zzr(i);
                this.zzG.zzn = (int) j;
                return;
            case 179:
                if (this.zzH) {
                    return;
                }
                zzs(i);
                this.zzM = zzA(j);
                return;
            case 186:
                zzr(i);
                this.zzG.zzo = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzr(i);
                this.zzG.zzd = (int) j;
                return;
            case 231:
                this.zzU = zzA(j);
                return;
            case 238:
                this.zzaf = (int) j;
                return;
            case 247:
                if (this.zzH) {
                    return;
                }
                zzs(i);
                this.zzN = (int) j;
                return;
            case 251:
                this.zzag = true;
                return;
            case 16871:
                zzr(i);
                this.zzG.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzat.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw zzat.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw zzat.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 21420:
                this.zzJ = j + this.zzz;
                return;
            case 21432:
                int i3 = (int) j;
                zzr(i);
                if (i3 == 0) {
                    this.zzG.zzy = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzG.zzy = 2;
                    return;
                } else if (i3 == 3) {
                    this.zzG.zzy = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.zzG.zzy = 3;
                    return;
                }
            case 21680:
                zzr(i);
                this.zzG.zzq = (int) j;
                return;
            case 21682:
                zzr(i);
                this.zzG.zzs = (int) j;
                return;
            case 21690:
                zzr(i);
                this.zzG.zzr = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzr(i);
                this.zzG.zzX = z;
                return;
            case 21938:
                zzr(i);
                this.zzG.zzp = (int) j;
                return;
            case 21998:
                zzr(i);
                this.zzG.zzh = (int) j;
                return;
            case 22186:
                zzr(i);
                this.zzG.zzT = j;
                return;
            case 22203:
                zzr(i);
                this.zzG.zzU = j;
                return;
            case 25188:
                zzr(i);
                this.zzG.zzQ = (int) j;
                return;
            case 30114:
                this.zzah = j;
                return;
            case 30321:
                int i4 = (int) j;
                zzr(i);
                if (i4 == 0) {
                    this.zzG.zzt = 0;
                    return;
                }
                if (i4 == 1) {
                    this.zzG.zzt = 1;
                    return;
                } else if (i4 == 2) {
                    this.zzG.zzt = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.zzG.zzt = 3;
                    return;
                }
            case 2352003:
                zzr(i);
                this.zzG.zzg = (int) j;
                return;
            case 2807729:
                this.zzA = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i5 = (int) j;
                        zzr(i);
                        if (i5 == 1) {
                            this.zzG.zzB = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.zzG.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzr(i);
                        int zzc2 = zzi.zzc((int) j);
                        if (zzc2 != -1) {
                            this.zzG.zzA = zzc2;
                            return;
                        }
                        return;
                    case 21947:
                        zzr(i);
                        int zzb2 = zzi.zzb((int) j);
                        if (zzb2 != -1) {
                            this.zzG.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21948:
                        zzr(i);
                        this.zzG.zzC = (int) j;
                        return;
                    case 21949:
                        zzr(i);
                        this.zzG.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    zzakt(zzakl zzaklVar, int i, zzanx zzanxVar) {
        this.zzz = -1L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzC = -9223372036854775807L;
        this.zzM = -9223372036854775807L;
        this.zzN = -1;
        this.zzO = -1L;
        this.zzP = -1L;
        this.zzQ = -1;
        this.zzS = -1L;
        this.zzT = -1L;
        this.zzU = -9223372036854775807L;
        this.zzas = zzaklVar;
        zzaklVar.zza(new zzako(this, null));
        this.zzm = zzanxVar;
        this.zzK = new SparseArray();
        this.zzk = 1 == ((i & 1) ^ 1);
        this.zzl = (i & 2) == 0;
        this.zzh = new zzakv();
        this.zzj = new LongSparseArray();
        this.zzi = new SparseArray();
        this.zzp = new zzeu(4);
        this.zzq = new zzeu(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzr = new zzeu(4);
        this.zzn = new zzeu(zzgr.zza);
        this.zzo = new zzeu(4);
        this.zzs = new zzeu();
        this.zzt = new zzeu();
        this.zzu = new zzeu(8);
        this.zzv = new zzeu();
        this.zzw = new zzeu();
        this.zzab = new int[1];
        this.zzE = true;
    }

    protected final void zzm(int i, int i2, zzagi zzagiVar) throws IOException {
        zzaks zzaksVar;
        int i3;
        zzaks zzaksVar2;
        zzaks zzaksVar3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = 1;
        int i11 = 0;
        if (i9 != 161 && i9 != 163) {
            if (i9 == 165) {
                if (this.zzW != 2) {
                    return;
                }
                zzaks zzaksVar4 = (zzaks) this.zzi.get(this.zzac);
                if (this.zzaf != 4 || !"V_VP9".equals(zzaksVar4.zzc)) {
                    zzagiVar.zzf(i2);
                    return;
                }
                zzeu zzeuVar = this.zzw;
                zzeuVar.zza(i2);
                zzagiVar.zzc(zzeuVar.zzi(), 0, i2);
                return;
            }
            if (i9 == 16877) {
                zzr(i);
                zzaks zzaksVar5 = this.zzG;
                if (zzaksVar5.zzc() != 1685485123 && zzaksVar5.zzc() != 1685480259) {
                    zzagiVar.zzf(i2);
                    return;
                } else {
                    zzaksVar5.zzO = new byte[i2];
                    zzagiVar.zzc(zzaksVar5.zzO, 0, i2);
                    return;
                }
            }
            if (i9 == 16981) {
                zzr(i);
                zzaks zzaksVar6 = this.zzG;
                zzaksVar6.zzj = new byte[i2];
                zzagiVar.zzc(zzaksVar6.zzj, 0, i2);
                return;
            }
            if (i9 == 18402) {
                byte[] bArr = new byte[i2];
                zzagiVar.zzc(bArr, 0, i2);
                zzr(i);
                this.zzG.zzk = new zzahs(1, bArr, 0, 0);
                return;
            }
            if (i9 == 21419) {
                zzeu zzeuVar2 = this.zzr;
                Arrays.fill(zzeuVar2.zzi(), (byte) 0);
                zzagiVar.zzc(zzeuVar2.zzi(), 4 - i2, i2);
                zzeuVar2.zzh(0);
                this.zzI = (int) zzeuVar2.zzz();
                return;
            }
            if (i9 == 25506) {
                zzr(i);
                zzaks zzaksVar7 = this.zzG;
                zzaksVar7.zzl = new byte[i2];
                zzagiVar.zzc(zzaksVar7.zzl, 0, i2);
                return;
            }
            if (i9 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i9);
                throw zzat.zzb(sb.toString(), null);
            }
            zzr(i);
            zzaks zzaksVar8 = this.zzG;
            zzaksVar8.zzx = new byte[i2];
            zzagiVar.zzc(zzaksVar8.zzx, 0, i2);
            return;
        }
        int i12 = 8;
        if (this.zzW == 0) {
            zzakv zzakvVar = this.zzh;
            this.zzac = (int) zzakvVar.zzb(zzagiVar, false, true, 8);
            this.zzad = zzakvVar.zzc();
            this.zzY = -9223372036854775807L;
            this.zzW = 1;
            this.zzp.zza(0);
        }
        zzaks zzaksVar9 = (zzaks) this.zzi.get(this.zzac);
        if (zzaksVar9 == null) {
            zzagiVar.zzf(i2 - this.zzad);
            this.zzW = 0;
            return;
        }
        zzaksVar9.zzb();
        if (this.zzW == 1) {
            zzu(zzagiVar, 3);
            zzeu zzeuVar3 = this.zzp;
            int i13 = (zzeuVar3.zzi()[2] & 6) >> 1;
            if (i13 == 0) {
                this.zzaa = 1;
                int[] zzB = zzB(this.zzab, 1);
                this.zzab = zzB;
                zzB[0] = (i2 - this.zzad) - 3;
            } else {
                zzu(zzagiVar, 4);
                int i14 = (zzeuVar3.zzi()[3] & 255) + 1;
                this.zzaa = i14;
                int[] zzB2 = zzB(this.zzab, i14);
                this.zzab = zzB2;
                if (i13 == 2) {
                    int i15 = (i2 - this.zzad) - 4;
                    int i16 = this.zzaa;
                    Arrays.fill(zzB2, 0, i16, i15 / i16);
                } else {
                    if (i13 != 1) {
                        if (i13 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i17 = 0;
                        int i18 = 0;
                        int i19 = 4;
                        while (true) {
                            int i20 = this.zzaa - 1;
                            if (i17 >= i20) {
                                zzaksVar2 = zzaksVar9;
                                this.zzab[i20] = ((i2 - this.zzad) - i19) - i18;
                                break;
                            }
                            this.zzab[i17] = i11;
                            int i21 = i19 + 1;
                            zzu(zzagiVar, i21);
                            if (zzeuVar3.zzi()[i19] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i22 = i11;
                            while (true) {
                                if (i22 >= i12) {
                                    zzaksVar3 = zzaksVar9;
                                    j = 0;
                                    break;
                                }
                                int i23 = i10 << (7 - i22);
                                if ((zzeuVar3.zzi()[i19] & i23) != 0) {
                                    i21 += i22;
                                    zzu(zzagiVar, i21);
                                    j = zzeuVar3.zzi()[i19] & 255 & (~i23);
                                    int i24 = i19 + 1;
                                    while (i24 < i21) {
                                        j = (j << i12) | (zzeuVar3.zzi()[i24] & 255);
                                        i24++;
                                        zzaksVar9 = zzaksVar9;
                                        i12 = 8;
                                    }
                                    zzaksVar3 = zzaksVar9;
                                    if (i17 > 0) {
                                        j -= (1 << ((i22 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i22++;
                                    i10 = 1;
                                    i12 = 8;
                                }
                            }
                            i19 = i21;
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzab;
                            int i25 = (int) j;
                            if (i17 != 0) {
                                i25 += iArr[i17 - 1];
                            }
                            iArr[i17] = i25;
                            i18 += i25;
                            i17++;
                            zzaksVar9 = zzaksVar3;
                            i10 = 1;
                            i11 = 0;
                            i12 = 8;
                        }
                        throw zzat.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 4;
                    while (true) {
                        i4 = this.zzaa - 1;
                        if (i26 >= i4) {
                            break;
                        }
                        this.zzab[i26] = 0;
                        while (true) {
                            i5 = i28 + 1;
                            zzu(zzagiVar, i5);
                            int i29 = zzeuVar3.zzi()[i28] & 255;
                            int[] iArr2 = this.zzab;
                            i6 = iArr2[i26] + i29;
                            iArr2[i26] = i6;
                            if (i29 != 255) {
                                break;
                            } else {
                                i28 = i5;
                            }
                        }
                        i27 += i6;
                        i26++;
                        i28 = i5;
                    }
                    this.zzab[i4] = ((i2 - this.zzad) - i28) - i27;
                }
            }
            zzaksVar2 = zzaksVar9;
            this.zzX = this.zzU + zzA((zzeuVar3.zzi()[0] << 8) | (zzeuVar3.zzi()[1] & 255));
            zzaksVar = zzaksVar2;
            if (zzaksVar.zzf != 1) {
                if (i9 == 163) {
                    i7 = 2;
                    if ((zzeuVar3.zzi()[2] & 128) == 128) {
                        i9 = 163;
                    } else {
                        i9 = 163;
                    }
                } else {
                    i7 = 2;
                }
                i8 = 0;
                this.zzae = i8;
                this.zzW = i7;
                this.zzZ = 0;
                i3 = 163;
            } else {
                i7 = 2;
            }
            i8 = 1;
            this.zzae = i8;
            this.zzW = i7;
            this.zzZ = 0;
            i3 = 163;
        } else {
            zzaksVar = zzaksVar9;
            i3 = 163;
        }
        if (i9 == i3) {
            while (true) {
                int i30 = this.zzZ;
                if (i30 >= this.zzaa) {
                    this.zzW = 0;
                    return;
                }
                zzt(zzaksVar, ((this.zzZ * zzaksVar.zzg) / 1000) + this.zzX, this.zzae, zzv(zzagiVar, zzaksVar, this.zzab[i30], false), 0);
                this.zzZ++;
            }
        } else {
            while (true) {
                int i31 = this.zzZ;
                if (i31 >= this.zzaa) {
                    return;
                }
                int[] iArr3 = this.zzab;
                iArr3[i31] = zzv(zzagiVar, zzaksVar, iArr3[i31], true);
                this.zzZ++;
            }
        }
    }

    protected final void zzl(int i, String str) throws zzat {
        if (i == 133) {
            zzq(i);
            this.zzF.zzh = str;
            return;
        }
        if (i == 134) {
            zzr(i);
            this.zzG.zzc = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                this.zzD = Objects.equals(str, "webm");
                return;
            }
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i == 17276) {
            zzq(i);
            this.zzF.zzi = str;
        } else if (i == 21358) {
            zzr(i);
            this.zzG.zzb = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzr(i);
            this.zzG.zze(str);
        }
    }

    public zzakt(zzanx zzanxVar, int i) {
        this(new zzakl(), 0, zzanxVar);
    }

    protected final void zzk(int i, double d) throws zzat {
        if (i == 181) {
            zzr(i);
            this.zzG.zzS = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzB = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzr(i);
                this.zzG.zzE = (float) d;
                break;
            case 21970:
                zzr(i);
                this.zzG.zzF = (float) d;
                break;
            case 21971:
                zzr(i);
                this.zzG.zzG = (float) d;
                break;
            case 21972:
                zzr(i);
                this.zzG.zzH = (float) d;
                break;
            case 21973:
                zzr(i);
                this.zzG.zzI = (float) d;
                break;
            case 21974:
                zzr(i);
                this.zzG.zzJ = (float) d;
                break;
            case 21975:
                zzr(i);
                this.zzG.zzK = (float) d;
                break;
            case 21976:
                zzr(i);
                this.zzG.zzL = (float) d;
                break;
            case 21977:
                zzr(i);
                this.zzG.zzM = (float) d;
                break;
            case 21978:
                zzr(i);
                this.zzG.zzN = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzr(i);
                        this.zzG.zzu = (float) d;
                        break;
                    case 30324:
                        zzr(i);
                        this.zzG.zzv = (float) d;
                        break;
                    case 30325:
                        zzr(i);
                        this.zzG.zzw = (float) d;
                        break;
                }
        }
    }
}
