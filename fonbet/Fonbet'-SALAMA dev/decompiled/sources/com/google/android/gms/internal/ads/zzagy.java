package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbbd;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzagy implements zzacv {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;
    private boolean zzB;
    private zzagw zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzdr zzK;
    private zzdr zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzacy zzaj;
    private final zzagt zzak;
    private final zzaha zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzajq zzk;
    private final zzed zzl;
    private final zzed zzm;
    private final zzed zzn;
    private final zzed zzo;
    private final zzed zzp;
    private final zzed zzq;
    private final zzed zzr;
    private final zzed zzs;
    private final zzed zzt;
    private final zzed zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i7 = zzen.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        AbstractC1663a.k(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC1663a.k(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzf = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzagy() {
        this(new zzagt(), 2, zzajq.zza);
    }

    private final int zzp(zzacw zzacwVar, zzagw zzagwVar, int i7, boolean z4) {
        int i8;
        if ("S_TEXT/UTF8".equals(zzagwVar.zzc)) {
            zzx(zzacwVar, zza, i7);
            int i9 = this.zzab;
            zzw();
            return i9;
        }
        if ("S_TEXT/ASS".equals(zzagwVar.zzc)) {
            zzx(zzacwVar, zzc, i7);
            int i10 = this.zzab;
            zzw();
            return i10;
        }
        if ("S_TEXT/WEBVTT".equals(zzagwVar.zzc)) {
            zzx(zzacwVar, zzd, i7);
            int i11 = this.zzab;
            zzw();
            return i11;
        }
        zzaeb zzaebVar = zzagwVar.zzX;
        if (!this.zzad) {
            if (zzagwVar.zzh) {
                this.zzW &= -1073741825;
                if (!this.zzae) {
                    zzacwVar.zzi(this.zzn.zzN(), 0, 1);
                    this.zzaa++;
                    if ((this.zzn.zzN()[0] & 128) == 128) {
                        throw zzaz.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzah = this.zzn.zzN()[0];
                    this.zzae = true;
                }
                byte b7 = this.zzah;
                if ((b7 & 1) == 1) {
                    int i12 = b7 & 2;
                    this.zzW |= 1073741824;
                    if (!this.zzai) {
                        zzacwVar.zzi(this.zzs.zzN(), 0, 8);
                        this.zzaa += 8;
                        this.zzai = true;
                        this.zzn.zzN()[0] = (byte) ((i12 != 2 ? 0 : 128) | 8);
                        this.zzn.zzL(0);
                        zzaebVar.zzs(this.zzn, 1, 1);
                        this.zzab++;
                        this.zzs.zzL(0);
                        zzaebVar.zzs(this.zzs, 8, 1);
                        this.zzab += 8;
                    }
                    if (i12 == 2) {
                        if (!this.zzaf) {
                            zzacwVar.zzi(this.zzn.zzN(), 0, 1);
                            this.zzaa++;
                            this.zzn.zzL(0);
                            this.zzag = this.zzn.zzm();
                            this.zzaf = true;
                        }
                        int i13 = this.zzag * 4;
                        this.zzn.zzI(i13);
                        zzacwVar.zzi(this.zzn.zzN(), 0, i13);
                        this.zzaa += i13;
                        int i14 = (this.zzag >> 1) + 1;
                        int i15 = (i14 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.zzv = ByteBuffer.allocate(i15);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i14);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i8 = this.zzag;
                            if (i16 >= i8) {
                                break;
                            }
                            int zzp = this.zzn.zzp();
                            int i18 = zzp - i17;
                            if (i16 % 2 == 0) {
                                this.zzv.putShort((short) i18);
                            } else {
                                this.zzv.putInt(i18);
                            }
                            i16++;
                            i17 = zzp;
                        }
                        int i19 = (i7 - this.zzaa) - i17;
                        if ((i8 & 1) == 1) {
                            this.zzv.putInt(i19);
                        } else {
                            this.zzv.putShort((short) i19);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzJ(this.zzv.array(), i15);
                        zzaebVar.zzs(this.zzt, i15, 1);
                        this.zzab += i15;
                    }
                }
            } else {
                byte[] bArr = zzagwVar.zzi;
                if (bArr != null) {
                    this.zzq.zzJ(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzagwVar.zzc) ? zzagwVar.zzg > 0 : z4) {
                this.zzW |= 268435456;
                this.zzu.zzI(0);
                int zze2 = (this.zzq.zze() + i7) - this.zzaa;
                this.zzn.zzI(4);
                this.zzn.zzN()[0] = (byte) ((zze2 >> 24) & 255);
                this.zzn.zzN()[1] = (byte) ((zze2 >> 16) & 255);
                this.zzn.zzN()[2] = (byte) ((zze2 >> 8) & 255);
                this.zzn.zzN()[3] = (byte) (zze2 & 255);
                zzaebVar.zzs(this.zzn, 4, 2);
                this.zzab += 4;
            }
            this.zzad = true;
        }
        int zze3 = this.zzq.zze() + i7;
        if (!"V_MPEG4/ISO/AVC".equals(zzagwVar.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzagwVar.zzc)) {
            if (zzagwVar.zzU != null) {
                zzcv.zzf(this.zzq.zze() == 0);
                zzagwVar.zzU.zzd(zzacwVar);
            }
            while (true) {
                int i20 = this.zzaa;
                if (i20 >= zze3) {
                    break;
                }
                int zzq = zzq(zzacwVar, zzaebVar, zze3 - i20);
                this.zzaa += zzq;
                this.zzab += zzq;
            }
        } else {
            byte[] zzN = this.zzm.zzN();
            zzN[0] = 0;
            zzN[1] = 0;
            zzN[2] = 0;
            int i21 = zzagwVar.zzY;
            int i22 = 4 - i21;
            while (this.zzaa < zze3) {
                int i23 = this.zzac;
                if (i23 == 0) {
                    int min = Math.min(i21, this.zzq.zzb());
                    zzacwVar.zzi(zzN, i22 + min, i21 - min);
                    if (min > 0) {
                        this.zzq.zzH(zzN, i22, min);
                    }
                    this.zzaa += i21;
                    this.zzm.zzL(0);
                    this.zzac = this.zzm.zzp();
                    this.zzl.zzL(0);
                    zzaebVar.zzr(this.zzl, 4);
                    this.zzab += 4;
                } else {
                    int zzq2 = zzq(zzacwVar, zzaebVar, i23);
                    this.zzaa += zzq2;
                    this.zzab += zzq2;
                    this.zzac -= zzq2;
                }
            }
        }
        if ("A_VORBIS".equals(zzagwVar.zzc)) {
            this.zzo.zzL(0);
            zzaebVar.zzr(this.zzo, 4);
            this.zzab += 4;
        }
        int i24 = this.zzab;
        zzw();
        return i24;
    }

    private final int zzq(zzacw zzacwVar, zzaeb zzaebVar, int i7) {
        int zzb2 = this.zzq.zzb();
        if (zzb2 <= 0) {
            return zzaebVar.zzf(zzacwVar, i7, false);
        }
        int min = Math.min(i7, zzb2);
        zzaebVar.zzr(this.zzq, min);
        return min;
    }

    private final long zzr(long j) {
        long j3 = this.zzy;
        if (j3 != -9223372036854775807L) {
            return zzen.zzu(j, j3, 1000L, RoundingMode.DOWN);
        }
        throw zzaz.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzs(int i7) {
        if (this.zzK == null || this.zzL == null) {
            throw zzaz.zza("Element " + i7 + " must be in a Cues", null);
        }
    }

    private final void zzt(int i7) {
        if (this.zzC != null) {
            return;
        }
        throw zzaz.zza("Element " + i7 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[EDGE_INSN: B:50:0x00e0->B:49:0x00e0 BREAK  A[LOOP:0: B:42:0x00c5->B:46:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzu(zzagw zzagwVar, long j, int i7, int i8, int i9) {
        char c3;
        byte[] zzy;
        int i10;
        int zzd2;
        int zze2;
        zzaec zzaecVar = zzagwVar.zzU;
        if (zzaecVar != null) {
            zzaecVar.zzc(zzagwVar.zzX, j, i7, i8, i9, zzagwVar.zzj);
        } else {
            if ("S_TEXT/UTF8".equals(zzagwVar.zzc) || "S_TEXT/ASS".equals(zzagwVar.zzc) || "S_TEXT/WEBVTT".equals(zzagwVar.zzc)) {
                if (this.zzS > 1) {
                    zzdq.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.zzQ;
                    if (j3 == -9223372036854775807L) {
                        zzdq.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzagwVar.zzc;
                        byte[] zzN = this.zzr.zzN();
                        int hashCode = str.hashCode();
                        if (hashCode == 738597099) {
                            if (str.equals("S_TEXT/ASS")) {
                                c3 = 1;
                                if (c3 != 0) {
                                }
                                System.arraycopy(zzy, 0, zzN, i10, zzy.length);
                                zzd2 = this.zzr.zzd();
                                while (true) {
                                    if (zzd2 >= this.zzr.zze()) {
                                    }
                                    zzd2++;
                                }
                                zzaeb zzaebVar = zzagwVar.zzX;
                                zzed zzedVar = this.zzr;
                                zzaebVar.zzr(zzedVar, zzedVar.zze());
                                zze2 = this.zzr.zze() + i8;
                                if ((i7 & 268435456) != 0) {
                                }
                                zzagwVar.zzX.zzt(j, i7, zze2, i9, zzagwVar.zzj);
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                            System.arraycopy(zzy, 0, zzN, i10, zzy.length);
                            zzd2 = this.zzr.zzd();
                            while (true) {
                                if (zzd2 >= this.zzr.zze()) {
                                }
                                zzd2++;
                            }
                            zzaeb zzaebVar2 = zzagwVar.zzX;
                            zzed zzedVar2 = this.zzr;
                            zzaebVar2.zzr(zzedVar2, zzedVar2.zze());
                            zze2 = this.zzr.zze() + i8;
                            if ((i7 & 268435456) != 0) {
                            }
                            zzagwVar.zzX.zzt(j, i7, zze2, i9, zzagwVar.zzj);
                        } else if (hashCode != 1045209816) {
                            if (hashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                c3 = 0;
                                if (c3 != 0) {
                                    zzy = zzy(j3, "%02d:%02d:%02d,%03d", 1000L);
                                    i10 = 19;
                                } else if (c3 == 1) {
                                    zzy = zzy(j3, "%01d:%02d:%02d:%02d", 10000L);
                                    i10 = 21;
                                } else {
                                    if (c3 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    zzy = zzy(j3, "%02d:%02d:%02d.%03d", 1000L);
                                    i10 = 25;
                                }
                                System.arraycopy(zzy, 0, zzN, i10, zzy.length);
                                zzd2 = this.zzr.zzd();
                                while (true) {
                                    if (zzd2 >= this.zzr.zze()) {
                                        break;
                                    }
                                    if (this.zzr.zzN()[zzd2] == 0) {
                                        this.zzr.zzK(zzd2);
                                        break;
                                    }
                                    zzd2++;
                                }
                                zzaeb zzaebVar22 = zzagwVar.zzX;
                                zzed zzedVar22 = this.zzr;
                                zzaebVar22.zzr(zzedVar22, zzedVar22.zze());
                                zze2 = this.zzr.zze() + i8;
                                if ((i7 & 268435456) != 0) {
                                    if (this.zzS > 1) {
                                        this.zzu.zzI(0);
                                    } else {
                                        int zze3 = this.zzu.zze();
                                        zzagwVar.zzX.zzs(this.zzu, zze3, 2);
                                        zze2 += zze3;
                                    }
                                }
                                zzagwVar.zzX.zzt(j, i7, zze2, i9, zzagwVar.zzj);
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                            System.arraycopy(zzy, 0, zzN, i10, zzy.length);
                            zzd2 = this.zzr.zzd();
                            while (true) {
                                if (zzd2 >= this.zzr.zze()) {
                                }
                                zzd2++;
                            }
                            zzaeb zzaebVar222 = zzagwVar.zzX;
                            zzed zzedVar222 = this.zzr;
                            zzaebVar222.zzr(zzedVar222, zzedVar222.zze());
                            zze2 = this.zzr.zze() + i8;
                            if ((i7 & 268435456) != 0) {
                            }
                            zzagwVar.zzX.zzt(j, i7, zze2, i9, zzagwVar.zzj);
                        } else {
                            if (str.equals("S_TEXT/WEBVTT")) {
                                c3 = 2;
                                if (c3 != 0) {
                                }
                                System.arraycopy(zzy, 0, zzN, i10, zzy.length);
                                zzd2 = this.zzr.zzd();
                                while (true) {
                                    if (zzd2 >= this.zzr.zze()) {
                                    }
                                    zzd2++;
                                }
                                zzaeb zzaebVar2222 = zzagwVar.zzX;
                                zzed zzedVar2222 = this.zzr;
                                zzaebVar2222.zzr(zzedVar2222, zzedVar2222.zze());
                                zze2 = this.zzr.zze() + i8;
                                if ((i7 & 268435456) != 0) {
                                }
                                zzagwVar.zzX.zzt(j, i7, zze2, i9, zzagwVar.zzj);
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                            System.arraycopy(zzy, 0, zzN, i10, zzy.length);
                            zzd2 = this.zzr.zzd();
                            while (true) {
                                if (zzd2 >= this.zzr.zze()) {
                                }
                                zzd2++;
                            }
                            zzaeb zzaebVar22222 = zzagwVar.zzX;
                            zzed zzedVar22222 = this.zzr;
                            zzaebVar22222.zzr(zzedVar22222, zzedVar22222.zze());
                            zze2 = this.zzr.zze() + i8;
                            if ((i7 & 268435456) != 0) {
                            }
                            zzagwVar.zzX.zzt(j, i7, zze2, i9, zzagwVar.zzj);
                        }
                    }
                }
            }
            zze2 = i8;
            if ((i7 & 268435456) != 0) {
            }
            zzagwVar.zzX.zzt(j, i7, zze2, i9, zzagwVar.zzj);
        }
        this.zzN = true;
    }

    private final void zzv(zzacw zzacwVar, int i7) {
        if (this.zzn.zze() >= i7) {
            return;
        }
        if (this.zzn.zzc() < i7) {
            zzed zzedVar = this.zzn;
            int zzc2 = zzedVar.zzc();
            zzedVar.zzF(Math.max(zzc2 + zzc2, i7));
        }
        zzed zzedVar2 = this.zzn;
        zzacwVar.zzi(zzedVar2.zzN(), zzedVar2.zze(), i7 - zzedVar2.zze());
        this.zzn.zzK(i7);
    }

    private final void zzw() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzacw zzacwVar, byte[] bArr, int i7) {
        int length = bArr.length;
        int i8 = length + i7;
        if (this.zzr.zzc() < i8) {
            zzed zzedVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i8 + i7);
            zzedVar.zzJ(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzN(), 0, length);
        }
        zzacwVar.zzi(this.zzr.zzN(), length, i7);
        this.zzr.zzL(0);
        this.zzr.zzK(i8);
    }

    private static byte[] zzy(long j, String str, long j3) {
        zzcv.zzd(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i7 = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i7);
        long j7 = j - (i7 * 3600000000L);
        int i8 = (int) (j7 / 60000000);
        Integer valueOf2 = Integer.valueOf(i8);
        long j8 = j7 - (i8 * 60000000);
        int i9 = (int) (j8 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i9), Integer.valueOf((int) ((j8 - (i9 * 1000000)) / j3)));
        int i10 = zzen.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(int[] iArr, int i7) {
        if (iArr == null) {
            return new int[i7];
        }
        int length = iArr.length;
        return length >= i7 ? iArr : new int[Math.max(length + length, i7)];
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        this.zzN = false;
        while (!this.zzN) {
            if (!this.zzak.zzc(zzacwVar)) {
                for (int i7 = 0; i7 < this.zzh.size(); i7++) {
                    zzagw zzagwVar = (zzagw) this.zzh.valueAt(i7);
                    zzagwVar.zzX.getClass();
                    zzaec zzaecVar = zzagwVar.zzU;
                    if (zzaecVar != null) {
                        zzaecVar.zza(zzagwVar.zzX, zzagwVar.zzj);
                    }
                }
                return -1;
            }
            long zzf2 = zzacwVar.zzf();
            if (this.zzG) {
                this.zzI = zzf2;
                zzadrVar.zza = this.zzH;
                this.zzG = false;
                return 1;
            }
            if (this.zzD) {
                long j = this.zzI;
                if (j != -1) {
                    zzadrVar.zza = j;
                    this.zzI = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return zzfwh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        if (this.zzj) {
            zzacyVar = new zzajt(zzacyVar, this.zzk);
        }
        this.zzaj = zzacyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzJ = -9223372036854775807L;
        this.zzO = 0;
        this.zzak.zzb();
        this.zzg.zze();
        zzw();
        for (int i7 = 0; i7 < this.zzh.size(); i7++) {
            zzaec zzaecVar = ((zzagw) this.zzh.valueAt(i7)).zzU;
            if (zzaecVar != null) {
                zzaecVar.zzb();
            }
        }
    }

    public final void zzh(int i7, int i8, zzacw zzacwVar) {
        int i9;
        long j;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i7;
        Throwable th = null;
        int i18 = 1;
        if (i17 != 161 && i17 != 163) {
            if (i17 == 165) {
                if (this.zzO != 2) {
                    return;
                }
                zzagw zzagwVar = (zzagw) this.zzh.get(this.zzU);
                if (this.zzX != 4 || !"V_VP9".equals(zzagwVar.zzc)) {
                    zzacwVar.zzk(i8);
                    return;
                } else {
                    this.zzu.zzI(i8);
                    zzacwVar.zzi(this.zzu.zzN(), 0, i8);
                    return;
                }
            }
            if (i17 == 16877) {
                zzt(i7);
                zzagw zzagwVar2 = this.zzC;
                i15 = zzagwVar2.zzZ;
                if (i15 != 1685485123) {
                    i16 = zzagwVar2.zzZ;
                    if (i16 != 1685480259) {
                        zzacwVar.zzk(i8);
                        return;
                    }
                }
                byte[] bArr = new byte[i8];
                zzagwVar2.zzO = bArr;
                zzacwVar.zzi(bArr, 0, i8);
                return;
            }
            if (i17 == 16981) {
                zzt(i7);
                byte[] bArr2 = new byte[i8];
                this.zzC.zzi = bArr2;
                zzacwVar.zzi(bArr2, 0, i8);
                return;
            }
            if (i17 == 18402) {
                byte[] bArr3 = new byte[i8];
                zzacwVar.zzi(bArr3, 0, i8);
                zzt(i7);
                this.zzC.zzj = new zzaea(1, bArr3, 0, 0);
                return;
            }
            if (i17 == 21419) {
                Arrays.fill(this.zzp.zzN(), (byte) 0);
                zzacwVar.zzi(this.zzp.zzN(), 4 - i8, i8);
                this.zzp.zzL(0);
                this.zzE = (int) this.zzp.zzu();
                return;
            }
            if (i17 == 25506) {
                zzt(i7);
                byte[] bArr4 = new byte[i8];
                this.zzC.zzk = bArr4;
                zzacwVar.zzi(bArr4, 0, i8);
                return;
            }
            if (i17 != 30322) {
                throw zzaz.zza("Unexpected id: " + i17, null);
            }
            zzt(i7);
            byte[] bArr5 = new byte[i8];
            this.zzC.zzw = bArr5;
            zzacwVar.zzi(bArr5, 0, i8);
            return;
        }
        if (this.zzO == 0) {
            this.zzU = (int) this.zzg.zzd(zzacwVar, false, true, 8);
            this.zzV = this.zzg.zza();
            this.zzQ = -9223372036854775807L;
            this.zzO = 1;
            this.zzn.zzI(0);
        }
        zzagw zzagwVar3 = (zzagw) this.zzh.get(this.zzU);
        if (zzagwVar3 == null) {
            zzacwVar.zzk(i8 - this.zzV);
            this.zzO = 0;
            return;
        }
        zzagwVar3.zzX.getClass();
        if (this.zzO == 1) {
            zzv(zzacwVar, 3);
            int i19 = (this.zzn.zzN()[2] & 6) >> 1;
            byte b7 = 255;
            if (i19 == 0) {
                this.zzS = 1;
                int[] zzz = zzz(this.zzT, 1);
                this.zzT = zzz;
                zzz[0] = (i8 - this.zzV) - 3;
            } else {
                zzv(zzacwVar, 4);
                int i20 = (this.zzn.zzN()[3] & 255) + 1;
                this.zzS = i20;
                int[] zzz2 = zzz(this.zzT, i20);
                this.zzT = zzz2;
                if (i19 == 2) {
                    int i21 = (i8 - this.zzV) - 4;
                    int i22 = this.zzS;
                    Arrays.fill(zzz2, 0, i22, i21 / i22);
                } else {
                    if (i19 != 1) {
                        if (i19 != 3) {
                            throw zzaz.zza("Unexpected lacing value: 2", null);
                        }
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = 4;
                        while (true) {
                            int i26 = this.zzS - 1;
                            if (i23 >= i26) {
                                this.zzT[i26] = ((i8 - this.zzV) - i25) - i24;
                                break;
                            }
                            this.zzT[i23] = 0;
                            int i27 = i25 + 1;
                            zzv(zzacwVar, i27);
                            if (this.zzn.zzN()[i25] == 0) {
                                throw zzaz.zza("No valid varint length mask found", th);
                            }
                            int i28 = 0;
                            while (true) {
                                if (i28 >= 8) {
                                    j = 0;
                                    i10 = i27;
                                    break;
                                }
                                int i29 = i18 << (7 - i28);
                                if ((this.zzn.zzN()[i25] & i29) != 0) {
                                    int i30 = i27 + i28;
                                    zzv(zzacwVar, i30);
                                    j = this.zzn.zzN()[i25] & b7 & (~i29);
                                    int i31 = i25 + 1;
                                    while (i31 < i30) {
                                        j = (j << 8) | (this.zzn.zzN()[i31] & b7);
                                        i31++;
                                        i30 = i30;
                                        b7 = 255;
                                    }
                                    i10 = i30;
                                    if (i23 > 0) {
                                        j -= (1 << ((i28 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i28++;
                                    i18 = 1;
                                    b7 = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzT;
                            int i32 = (int) j;
                            if (i23 != 0) {
                                i32 += iArr[i23 - 1];
                            }
                            iArr[i23] = i32;
                            i24 += i32;
                            i23++;
                            i25 = i10;
                            th = null;
                            i18 = 1;
                            b7 = 255;
                        }
                        throw zzaz.zza("EBML lacing sample size out of range.", null);
                    }
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 4;
                    while (true) {
                        i11 = this.zzS - 1;
                        if (i33 >= i11) {
                            break;
                        }
                        this.zzT[i33] = 0;
                        while (true) {
                            i12 = i35 + 1;
                            zzv(zzacwVar, i12);
                            int i36 = this.zzn.zzN()[i35] & 255;
                            int[] iArr2 = this.zzT;
                            i13 = iArr2[i33] + i36;
                            iArr2[i33] = i13;
                            if (i36 != 255) {
                                break;
                            } else {
                                i35 = i12;
                            }
                        }
                        i34 += i13;
                        i33++;
                        i35 = i12;
                    }
                    this.zzT[i11] = ((i8 - this.zzV) - i35) - i34;
                }
            }
            this.zzP = this.zzJ + zzr((this.zzn.zzN()[0] << 8) | (this.zzn.zzN()[1] & 255));
            if (zzagwVar3.zze != 2) {
                if (i17 != 163) {
                    i14 = 0;
                } else if ((this.zzn.zzN()[2] & 128) == 128) {
                    i17 = 163;
                } else {
                    i14 = 0;
                    i17 = 163;
                }
                this.zzW = i14;
                this.zzO = 2;
                this.zzR = 0;
                i9 = 163;
            }
            i14 = 1;
            this.zzW = i14;
            this.zzO = 2;
            this.zzR = 0;
            i9 = 163;
        } else {
            i9 = 163;
        }
        if (i17 == i9) {
            while (true) {
                int i37 = this.zzR;
                if (i37 >= this.zzS) {
                    this.zzO = 0;
                    return;
                }
                zzu(zzagwVar3, ((this.zzR * zzagwVar3.zzf) / zzbbd.zzq.zzf) + this.zzP, this.zzW, zzp(zzacwVar, zzagwVar3, this.zzT[i37], false), 0);
                this.zzR++;
            }
        } else {
            while (true) {
                int i38 = this.zzR;
                if (i38 >= this.zzS) {
                    return;
                }
                int[] iArr3 = this.zzT;
                iArr3[i38] = zzp(zzacwVar, zzagwVar3, iArr3[i38], true);
                this.zzR++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        return new zzagz().zza(zzacwVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0250, code lost:
    
        if (r1.equals("V_AV1") != false) goto L192;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(int i7) {
        int i8;
        zzadu zzadtVar;
        int i9;
        zzcv.zzb(this.zzaj);
        char c3 = 2;
        int i10 = 0;
        if (i7 == 160) {
            if (this.zzO == 2) {
                zzagw zzagwVar = (zzagw) this.zzh.get(this.zzU);
                zzagwVar.zzX.getClass();
                if (this.zzZ > 0 && "A_OPUS".equals(zzagwVar.zzc)) {
                    zzed zzedVar = this.zzu;
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzZ).array();
                    zzedVar.zzJ(array, array.length);
                }
                int i11 = 0;
                for (int i12 = 0; i12 < this.zzS; i12++) {
                    i11 += this.zzT[i12];
                }
                int i13 = 0;
                while (i13 < this.zzS) {
                    long j = this.zzP + ((zzagwVar.zzf * i13) / zzbbd.zzq.zzf);
                    int i14 = this.zzW;
                    if (i13 == 0) {
                        if (!this.zzY) {
                            i14 |= 1;
                        }
                        i8 = 0;
                    } else {
                        i8 = i13;
                    }
                    int i15 = this.zzT[i8];
                    int i16 = i11 - i15;
                    zzu(zzagwVar, j, i14, i15, i16);
                    i13 = i8 + 1;
                    i11 = i16;
                }
                this.zzO = 0;
                return;
            }
            return;
        }
        if (i7 != 174) {
            if (i7 == 19899) {
                int i17 = this.zzE;
                if (i17 != -1) {
                    long j3 = this.zzF;
                    if (j3 != -1) {
                        if (i17 == 475249515) {
                            this.zzH = j3;
                            return;
                        }
                        return;
                    }
                }
                throw zzaz.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i7 == 25152) {
                zzt(i7);
                zzagw zzagwVar2 = this.zzC;
                if (zzagwVar2.zzh) {
                    if (zzagwVar2.zzj == null) {
                        throw zzaz.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzagwVar2.zzl = new zzs(null, new zzr(zzh.zza, null, "video/webm", this.zzC.zzj.zzb));
                    return;
                }
                return;
            }
            if (i7 == 28032) {
                zzt(i7);
                zzagw zzagwVar3 = this.zzC;
                if (zzagwVar3.zzh && zzagwVar3.zzi != null) {
                    throw zzaz.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i7 == 357149030) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = 1000000L;
                }
                long j7 = this.zzz;
                if (j7 != -9223372036854775807L) {
                    this.zzA = zzr(j7);
                    return;
                }
                return;
            }
            if (i7 == 374648427) {
                if (this.zzh.size() == 0) {
                    throw zzaz.zza("No valid tracks were found", null);
                }
                this.zzaj.zzG();
                return;
            }
            if (i7 != 475249515) {
                return;
            }
            if (!this.zzD) {
                zzacy zzacyVar = this.zzaj;
                zzdr zzdrVar = this.zzK;
                zzdr zzdrVar2 = this.zzL;
                if (this.zzx == -1 || this.zzA == -9223372036854775807L || zzdrVar == null || zzdrVar.zza() == 0 || zzdrVar2 == null || zzdrVar2.zza() != zzdrVar.zza()) {
                    zzadtVar = new zzadt(this.zzA, 0L);
                } else {
                    int zza2 = zzdrVar.zza();
                    int[] iArr = new int[zza2];
                    long[] jArr = new long[zza2];
                    long[] jArr2 = new long[zza2];
                    long[] jArr3 = new long[zza2];
                    for (int i18 = 0; i18 < zza2; i18++) {
                        jArr3[i18] = zzdrVar.zzb(i18);
                        jArr[i18] = zzdrVar2.zzb(i18) + this.zzx;
                    }
                    while (true) {
                        i9 = zza2 - 1;
                        if (i10 >= i9) {
                            break;
                        }
                        int i19 = i10 + 1;
                        iArr[i10] = (int) (jArr[i19] - jArr[i10]);
                        jArr2[i10] = jArr3[i19] - jArr3[i10];
                        i10 = i19;
                    }
                    int i20 = i9;
                    while (i20 > 0 && jArr3[i20] > this.zzA) {
                        i20--;
                    }
                    iArr[i20] = (int) ((this.zzx + this.zzw) - jArr[i20]);
                    jArr2[i20] = this.zzA - jArr3[i20];
                    if (i20 < i9) {
                        zzdq.zzf("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                        int i21 = i20 + 1;
                        iArr = Arrays.copyOf(iArr, i21);
                        jArr = Arrays.copyOf(jArr, i21);
                        jArr2 = Arrays.copyOf(jArr2, i21);
                        jArr3 = Arrays.copyOf(jArr3, i21);
                    }
                    zzadtVar = new zzaci(iArr, jArr, jArr2, jArr3);
                }
                zzacyVar.zzP(zzadtVar);
                this.zzD = true;
            }
            this.zzK = null;
            this.zzL = null;
            return;
        }
        zzagw zzagwVar4 = this.zzC;
        zzcv.zzb(zzagwVar4);
        String str = zzagwVar4.zzc;
        if (str == null) {
            throw zzaz.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c3 = 23;
                    break;
                }
                c3 = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c3 = ' ';
                    break;
                }
                c3 = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c3 = 30;
                    break;
                }
                c3 = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 82318131:
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c3 = 31;
                    break;
                }
                c3 = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c3 = 26;
                    break;
                }
                c3 = 65535;
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c3 = 25;
                    break;
                }
                c3 = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c3 = 24;
                    break;
                }
                c3 = 65535;
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c3 = 28;
                    break;
                }
                c3 = 65535;
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c3 = 29;
                    break;
                }
                c3 = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c3 = 27;
                    break;
                }
                c3 = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c3 = 22;
                    break;
                }
                c3 = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
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
            case zzbbd.zzt.zzm /* 21 */:
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
                zzagwVar4.zze(this.zzaj, zzagwVar4.zzd);
                this.zzh.put(zzagwVar4.zzd, zzagwVar4);
                break;
        }
        this.zzC = null;
    }

    public final void zzk(int i7, double d7) {
        if (i7 == 181) {
            zzt(i7);
            this.zzC.zzR = (int) d7;
            return;
        }
        if (i7 == 17545) {
            this.zzz = (long) d7;
            return;
        }
        switch (i7) {
            case 21969:
                zzt(i7);
                this.zzC.zzE = (float) d7;
                break;
            case 21970:
                zzt(i7);
                this.zzC.zzF = (float) d7;
                break;
            case 21971:
                zzt(i7);
                this.zzC.zzG = (float) d7;
                break;
            case 21972:
                zzt(i7);
                this.zzC.zzH = (float) d7;
                break;
            case 21973:
                zzt(i7);
                this.zzC.zzI = (float) d7;
                break;
            case 21974:
                zzt(i7);
                this.zzC.zzJ = (float) d7;
                break;
            case 21975:
                zzt(i7);
                this.zzC.zzK = (float) d7;
                break;
            case 21976:
                zzt(i7);
                this.zzC.zzL = (float) d7;
                break;
            case 21977:
                zzt(i7);
                this.zzC.zzM = (float) d7;
                break;
            case 21978:
                zzt(i7);
                this.zzC.zzN = (float) d7;
                break;
            default:
                switch (i7) {
                    case 30323:
                        zzt(i7);
                        this.zzC.zzt = (float) d7;
                        break;
                    case 30324:
                        zzt(i7);
                        this.zzC.zzu = (float) d7;
                        break;
                    case 30325:
                        zzt(i7);
                        this.zzC.zzv = (float) d7;
                        break;
                }
        }
    }

    public final void zzl(int i7, long j) {
        boolean z4;
        if (i7 == 20529) {
            if (j == 0) {
                return;
            }
            throw zzaz.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i7 == 20530) {
            if (j == 1) {
                return;
            }
            throw zzaz.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i7) {
            case 131:
                zzt(i7);
                this.zzC.zze = (int) j;
                return;
            case 136:
                z4 = j == 1;
                zzt(i7);
                this.zzC.zzW = z4;
                return;
            case 155:
                this.zzQ = zzr(j);
                return;
            case 159:
                zzt(i7);
                this.zzC.zzP = (int) j;
                return;
            case 176:
                zzt(i7);
                this.zzC.zzm = (int) j;
                return;
            case 179:
                zzs(i7);
                this.zzK.zzc(zzr(j));
                return;
            case 186:
                zzt(i7);
                this.zzC.zzn = (int) j;
                return;
            case 215:
                zzt(i7);
                this.zzC.zzd = (int) j;
                return;
            case 231:
                this.zzJ = zzr(j);
                return;
            case 238:
                this.zzX = (int) j;
                return;
            case 241:
                if (this.zzM) {
                    return;
                }
                zzs(i7);
                this.zzL.zzc(j);
                this.zzM = true;
                return;
            case 251:
                this.zzY = true;
                return;
            case 16871:
                zzt(i7);
                this.zzC.zzZ = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzaz.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzaz.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzaz.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzaz.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzaz.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzF = j + this.zzx;
                return;
            case 21432:
                int i8 = (int) j;
                zzt(i7);
                if (i8 == 0) {
                    this.zzC.zzx = 0;
                    return;
                }
                if (i8 == 1) {
                    this.zzC.zzx = 2;
                    return;
                } else if (i8 == 3) {
                    this.zzC.zzx = 1;
                    return;
                } else {
                    if (i8 != 15) {
                        return;
                    }
                    this.zzC.zzx = 3;
                    return;
                }
            case 21680:
                zzt(i7);
                this.zzC.zzp = (int) j;
                return;
            case 21682:
                zzt(i7);
                this.zzC.zzr = (int) j;
                return;
            case 21690:
                zzt(i7);
                this.zzC.zzq = (int) j;
                return;
            case 21930:
                z4 = j == 1;
                zzt(i7);
                this.zzC.zzV = z4;
                return;
            case 21938:
                zzt(i7);
                zzagw zzagwVar = this.zzC;
                zzagwVar.zzy = true;
                zzagwVar.zzo = (int) j;
                return;
            case 21998:
                zzt(i7);
                this.zzC.zzg = (int) j;
                return;
            case 22186:
                zzt(i7);
                this.zzC.zzS = j;
                return;
            case 22203:
                zzt(i7);
                this.zzC.zzT = j;
                return;
            case 25188:
                zzt(i7);
                this.zzC.zzQ = (int) j;
                return;
            case 30114:
                this.zzZ = j;
                return;
            case 30321:
                int i9 = (int) j;
                zzt(i7);
                if (i9 == 0) {
                    this.zzC.zzs = 0;
                    return;
                }
                if (i9 == 1) {
                    this.zzC.zzs = 1;
                    return;
                } else if (i9 == 2) {
                    this.zzC.zzs = 2;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.zzC.zzs = 3;
                    return;
                }
            case 2352003:
                zzt(i7);
                this.zzC.zzf = (int) j;
                return;
            case 2807729:
                this.zzy = j;
                return;
            default:
                switch (i7) {
                    case 21945:
                        int i10 = (int) j;
                        zzt(i7);
                        if (i10 == 1) {
                            this.zzC.zzB = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            this.zzC.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzt(i7);
                        int zzb2 = zzk.zzb((int) j);
                        if (zzb2 != -1) {
                            this.zzC.zzA = zzb2;
                            return;
                        }
                        return;
                    case 21947:
                        zzt(i7);
                        this.zzC.zzy = true;
                        int zza2 = zzk.zza((int) j);
                        if (zza2 != -1) {
                            this.zzC.zzz = zza2;
                            return;
                        }
                        return;
                    case 21948:
                        zzt(i7);
                        this.zzC.zzC = (int) j;
                        return;
                    case 21949:
                        zzt(i7);
                        this.zzC.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void zzm(int i7, long j, long j3) {
        zzcv.zzb(this.zzaj);
        if (i7 == 160) {
            this.zzY = false;
            this.zzZ = 0L;
            return;
        }
        if (i7 == 174) {
            zzagw zzagwVar = new zzagw();
            this.zzC = zzagwVar;
            zzagwVar.zza = this.zzB;
            return;
        }
        if (i7 == 187) {
            this.zzM = false;
            return;
        }
        if (i7 == 19899) {
            this.zzE = -1;
            this.zzF = -1L;
            return;
        }
        if (i7 == 20533) {
            zzt(i7);
            this.zzC.zzh = true;
            return;
        }
        if (i7 == 21968) {
            zzt(i7);
            this.zzC.zzy = true;
            return;
        }
        if (i7 == 408125543) {
            long j7 = this.zzx;
            if (j7 != -1 && j7 != j) {
                throw zzaz.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j3;
            return;
        }
        if (i7 == 475249515) {
            this.zzK = new zzdr(32);
            this.zzL = new zzdr(32);
        } else if (i7 == 524531317 && !this.zzD) {
            if (this.zzi && this.zzH != -1) {
                this.zzG = true;
            } else {
                this.zzaj.zzP(new zzadt(this.zzA, 0L));
                this.zzD = true;
            }
        }
    }

    public final void zzn(int i7, String str) {
        if (i7 == 134) {
            zzt(i7);
            this.zzC.zzc = str;
            return;
        }
        if (i7 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                this.zzB = Objects.equals(str, "webm");
                return;
            }
            throw zzaz.zza("DocType " + str + " not supported", null);
        }
        if (i7 == 21358) {
            zzt(i7);
            this.zzC.zzb = str;
        } else {
            if (i7 != 2274716) {
                return;
            }
            zzt(i7);
            this.zzC.zzaa = str;
        }
    }

    public zzagy(zzagt zzagtVar, int i7, zzajq zzajqVar) {
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = -9223372036854775807L;
        this.zzak = zzagtVar;
        zzagtVar.zza(new zzagv(this, null));
        this.zzk = zzajqVar;
        this.zzi = 1 == ((i7 & 1) ^ 1);
        this.zzj = (i7 & 2) == 0;
        this.zzg = new zzaha();
        this.zzh = new SparseArray();
        this.zzn = new zzed(4);
        this.zzo = new zzed(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzed(4);
        this.zzl = new zzed(zzfj.zza);
        this.zzm = new zzed(4);
        this.zzq = new zzed();
        this.zzr = new zzed();
        this.zzs = new zzed(8);
        this.zzt = new zzed();
        this.zzu = new zzed();
        this.zzT = new int[1];
    }

    public zzagy(zzajq zzajqVar, int i7) {
        this(new zzagt(), 0, zzajqVar);
    }
}
