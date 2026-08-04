package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.f;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class zzaic implements zzacv {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzz zzb;
    private long zzA;
    private zzaib zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private zzacy zzH;
    private zzaeb[] zzI;
    private zzaeb[] zzJ;
    private boolean zzK;
    private final zzajq zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzed zzg;
    private final zzed zzh;
    private final zzed zzi;
    private final byte[] zzj;
    private final zzed zzk;
    private final zzafs zzl;
    private final zzed zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfn zzp;
    private zzfwh zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private zzed zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
        zzx zzxVar = new zzx();
        zzxVar.zzad("application/x-emsg");
        zzb = zzxVar.zzaj();
    }

    @Deprecated
    public zzaic() {
        this(zzajq.zza, 32, null, null, zzfwh.zzn(), null);
    }

    private static int zzg(int i7) throws zzaz {
        if (i7 >= 0) {
            return i7;
        }
        throw zzaz.zza("Unexpected negative value: " + i7, null);
    }

    private static zzs zzh(List list) {
        int i7;
        ArrayList arrayList;
        UUID[] uuidArr;
        zzaik zzaikVar;
        int size = list.size();
        int i8 = 0;
        ArrayList arrayList2 = null;
        while (i8 < size) {
            zzer zzerVar = (zzer) list.get(i8);
            if (zzerVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArrZzN = zzerVar.zza.zzN();
                zzed zzedVar = new zzed(bArrZzN);
                if (zzedVar.zze() < 32) {
                    i7 = i8;
                    arrayList = arrayList2;
                    zzaikVar = null;
                } else {
                    zzedVar.zzL(0);
                    int iZzb = zzedVar.zzb();
                    int iZzg = zzedVar.zzg();
                    if (iZzg != iZzb) {
                        zzdq.zzf("PsshAtomUtil", "Advertised atom size (" + iZzg + ") does not match buffer size: " + iZzb);
                    } else {
                        int iZzg2 = zzedVar.zzg();
                        if (iZzg2 != 1886614376) {
                            AbstractC0486a1.k(iZzg2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int iZza = zzahw.zza(zzedVar.zzg());
                            if (iZza > 1) {
                                AbstractC0486a1.k(iZza, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid = new UUID(zzedVar.zzt(), zzedVar.zzt());
                                if (iZza == 1) {
                                    int iZzp = zzedVar.zzp();
                                    uuidArr = new UUID[iZzp];
                                    int i9 = 0;
                                    while (i9 < iZzp) {
                                        uuidArr[i9] = new UUID(zzedVar.zzt(), zzedVar.zzt());
                                        i9++;
                                        i8 = i8;
                                        arrayList2 = arrayList2;
                                    }
                                    i7 = i8;
                                    arrayList = arrayList2;
                                } else {
                                    i7 = i8;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int iZzp2 = zzedVar.zzp();
                                int iZzb2 = zzedVar.zzb();
                                if (iZzp2 != iZzb2) {
                                    zzdq.zzf("PsshAtomUtil", "Atom data size (" + iZzp2 + ") does not match the bytes left: " + iZzb2);
                                    zzaikVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzp2];
                                    zzedVar.zzH(bArr, 0, iZzp2);
                                    zzaikVar = new zzaik(uuid, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i7 = i8;
                    arrayList = arrayList2;
                    zzaikVar = null;
                }
                UUID uuid2 = zzaikVar == null ? null : zzaikVar.zza;
                if (uuid2 == null) {
                    zzdq.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    arrayList2.add(new zzr(uuid2, null, "video/mp4", bArrZzN));
                }
                i8 = i7 + 1;
            } else {
                i7 = i8;
            }
            i8 = i7 + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzs(arrayList2);
    }

    private final void zzj() {
        this.zzr = 0;
        this.zzu = 0;
    }

    private static void zzk(zzed zzedVar, int i7, zzaiq zzaiqVar) throws zzaz {
        zzedVar.zzL(i7 + 8);
        int iZzg = zzedVar.zzg();
        int i8 = zzahw.zza;
        if ((iZzg & 1) != 0) {
            throw zzaz.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (iZzg & 2) != 0;
        int iZzp = zzedVar.zzp();
        if (iZzp == 0) {
            Arrays.fill(zzaiqVar.zzl, 0, zzaiqVar.zze, false);
            return;
        }
        int i9 = zzaiqVar.zze;
        if (iZzp != i9) {
            throw zzaz.zza("Senc sample count " + iZzp + " is different from fragment sample count" + i9, null);
        }
        Arrays.fill(zzaiqVar.zzl, 0, iZzp, z4);
        zzaiqVar.zza(zzedVar.zzb());
        zzed zzedVar2 = zzaiqVar.zzn;
        zzedVar.zzH(zzedVar2.zzN(), 0, zzedVar2.zze());
        zzaiqVar.zzn.zzL(0);
        zzaiqVar.zzo = false;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x038b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0392  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:139:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:149:0x03d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:152:0x03dd A[PHI: r12
      0x03dd: PHI (r12v20 int) = (r12v18 int), (r12v21 int) binds: [B:148:0x03d4, B:151:0x03dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:158:0x040a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0414  */
    /* JADX WARN: Code duplicated, block: B:162:0x0420 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x0422 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0424  */
    /* JADX WARN: Code duplicated, block: B:165:0x0427  */
    /* JADX WARN: Code duplicated, block: B:166:0x0429  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x026b  */
    private final void zzl(long j) throws zzaz {
        zzaic zzaicVar;
        int i7;
        SparseArray sparseArray;
        int i8;
        byte[] bArr;
        int i9;
        int i10;
        zzeq zzeqVar;
        int i11;
        int i12;
        byte[] bArr2;
        byte[] bArr3;
        int i13;
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z7;
        long j3;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z8;
        int i19;
        long j7;
        boolean z9;
        long j8;
        int iZzg;
        int iZzg2;
        boolean z10;
        int iZzg3;
        int iZzg4;
        long jZzu;
        boolean z11;
        int i20;
        final zzaic zzaicVar2 = this;
        int i21 = 8;
        while (!zzaicVar2.zzn.isEmpty() && ((zzeq) zzaicVar2.zzn.peek()).zza == j) {
            zzeq zzeqVar2 = (zzeq) zzaicVar2.zzn.pop();
            int i22 = zzeqVar2.zzd;
            int i23 = 12;
            if (i22 == 1836019574) {
                zzs zzsVarZzh = zzh(zzeqVar2.zzb);
                zzeq zzeqVarZza = zzeqVar2.zza(1836475768);
                zzeqVarZza.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zzeqVarZza.zzb.size();
                long jZzu2 = -9223372036854775807L;
                int i24 = 0;
                while (i24 < size) {
                    zzer zzerVar = (zzer) zzeqVarZza.zzb.get(i24);
                    int i25 = zzerVar.zzd;
                    if (i25 == 1953654136) {
                        zzed zzedVar = zzerVar.zza;
                        zzedVar.zzL(i23);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzedVar.zzg()), new zzahx(zzedVar.zzg() - 1, zzedVar.zzg(), zzedVar.zzg(), zzedVar.zzg()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzahx) pairCreate.second);
                    } else if (i25 == 1835362404) {
                        zzed zzedVar2 = zzerVar.zza;
                        zzedVar2.zzL(i21);
                        jZzu2 = zzahw.zza(zzedVar2.zzg()) == 0 ? zzedVar2.zzu() : zzedVar2.zzw();
                    }
                    i24++;
                    i23 = 12;
                }
                List listZzf = zzahw.zzf(zzeqVar2, new zzadj(), jZzu2, zzsVarZzh, (zzaicVar2.zzd & 16) != 0, false, new zzfsw(zzaicVar2) { // from class: com.google.android.gms.internal.ads.zzahy
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        return (zzaio) obj;
                    }
                });
                int size2 = listZzf.size();
                if (zzaicVar2.zzf.size() == 0) {
                    String strZza = zzaif.zza(listZzf);
                    for (int i26 = 0; i26 < size2; i26++) {
                        zzair zzairVar = (zzair) listZzf.get(i26);
                        zzaio zzaioVar = zzairVar.zza;
                        zzaeb zzaebVarZzw = zzaicVar2.zzH.zzw(i26, zzaioVar.zzb);
                        zzaebVarZzw.zzl(zzaioVar.zze);
                        zzaicVar2.zzf.put(zzaioVar.zza, new zzaib(zzaebVarZzw, zzairVar, zzm(sparseArray2, zzaioVar.zza), strZza));
                        zzaicVar2.zzz = Math.max(zzaicVar2.zzz, zzaioVar.zze);
                    }
                    zzaicVar2.zzH.zzG();
                } else {
                    zzcv.zzf(zzaicVar2.zzf.size() == size2);
                    for (int i27 = 0; i27 < size2; i27++) {
                        zzair zzairVar2 = (zzair) listZzf.get(i27);
                        zzaio zzaioVar2 = zzairVar2.zza;
                        ((zzaib) zzaicVar2.zzf.get(zzaioVar2.zza)).zzh(zzairVar2, zzm(sparseArray2, zzaioVar2.zza));
                    }
                }
            } else {
                if (i22 == 1836019558) {
                    SparseArray sparseArray3 = zzaicVar2.zzf;
                    int i28 = zzaicVar2.zzd;
                    byte[] bArr4 = zzaicVar2.zzj;
                    int size3 = zzeqVar2.zzc.size();
                    int i29 = 0;
                    while (i29 < size3) {
                        zzeq zzeqVar3 = (zzeq) zzeqVar2.zzc.get(i29);
                        if (zzeqVar3.zzd == 1953653094) {
                            zzer zzerVarZzb = zzeqVar3.zzb(1952868452);
                            zzerVarZzb.getClass();
                            zzed zzedVar3 = zzerVarZzb.zza;
                            zzedVar3.zzL(i21);
                            int iZzg5 = zzedVar3.zzg();
                            int i30 = zzahw.zza;
                            zzaib zzaibVar = (zzaib) sparseArray3.get(zzedVar3.zzg());
                            if (zzaibVar == null) {
                                zzaibVar = null;
                            } else {
                                if ((iZzg5 & 1) != 0) {
                                    long jZzw = zzedVar3.zzw();
                                    zzaiq zzaiqVar = zzaibVar.zzb;
                                    zzaiqVar.zzb = jZzw;
                                    zzaiqVar.zzc = jZzw;
                                }
                                zzahx zzahxVar = zzaibVar.zze;
                                zzaibVar.zzb.zza = new zzahx((iZzg5 & 2) != 0 ? zzedVar3.zzg() - 1 : zzahxVar.zza, (iZzg5 & 8) != 0 ? zzedVar3.zzg() : zzahxVar.zzb, (iZzg5 & 16) != 0 ? zzedVar3.zzg() : zzahxVar.zzc, (iZzg5 & 32) != 0 ? zzedVar3.zzg() : zzahxVar.zzd);
                            }
                            if (zzaibVar == null) {
                                sparseArray = sparseArray3;
                                i8 = i28;
                                bArr = bArr4;
                                i9 = size3;
                                i10 = i29;
                                zzeqVar = zzeqVar2;
                                i11 = i21;
                            } else {
                                zzaiq zzaiqVar2 = zzaibVar.zzb;
                                long j9 = zzaiqVar2.zzp;
                                boolean z12 = zzaiqVar2.zzq;
                                zzaibVar.zzi();
                                zzaibVar.zzm = true;
                                zzer zzerVarZzb2 = zzeqVar3.zzb(1952867444);
                                if (zzerVarZzb2 == null || (i28 & 2) != 0) {
                                    zzaiqVar2.zzp = j9;
                                    zzaiqVar2.zzq = z12;
                                } else {
                                    zzed zzedVar4 = zzerVarZzb2.zza;
                                    zzedVar4.zzL(i21);
                                    zzaiqVar2.zzp = zzahw.zza(zzedVar4.zzg()) == 1 ? zzedVar4.zzw() : zzedVar4.zzu();
                                    zzaiqVar2.zzq = true;
                                }
                                List list = zzeqVar3.zzb;
                                int size4 = list.size();
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    i12 = 1953658222;
                                    if (i31 >= size4) {
                                        break;
                                    }
                                    SparseArray sparseArray4 = sparseArray3;
                                    zzer zzerVar2 = (zzer) list.get(i31);
                                    int i34 = size3;
                                    if (zzerVar2.zzd == 1953658222) {
                                        zzed zzedVar5 = zzerVar2.zza;
                                        zzedVar5.zzL(12);
                                        int iZzp = zzedVar5.zzp();
                                        if (iZzp > 0) {
                                            i33 += iZzp;
                                            i20 = 1;
                                            i32++;
                                        } else {
                                            i20 = 1;
                                        }
                                    } else {
                                        i20 = 1;
                                    }
                                    i31 += i20;
                                    size3 = i34;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i9 = size3;
                                zzaibVar.zzh = 0;
                                zzaibVar.zzg = 0;
                                zzaibVar.zzf = 0;
                                zzaiq zzaiqVar3 = zzaibVar.zzb;
                                zzaiqVar3.zzd = i32;
                                zzaiqVar3.zze = i33;
                                if (zzaiqVar3.zzg.length < i32) {
                                    zzaiqVar3.zzf = new long[i32];
                                    zzaiqVar3.zzg = new int[i32];
                                }
                                if (zzaiqVar3.zzh.length < i33) {
                                    int i35 = (i33 * 125) / 100;
                                    zzaiqVar3.zzh = new int[i35];
                                    zzaiqVar3.zzi = new long[i35];
                                    zzaiqVar3.zzj = new boolean[i35];
                                    zzaiqVar3.zzl = new boolean[i35];
                                }
                                int i36 = 0;
                                int i37 = 0;
                                int i38 = 0;
                                while (i36 < size4) {
                                    zzer zzerVar3 = (zzer) list.get(i36);
                                    if (zzerVar3.zzd == i12) {
                                        int i39 = i37 + 1;
                                        zzed zzedVar6 = zzerVar3.zza;
                                        zzedVar6.zzL(8);
                                        int iZzg6 = zzedVar6.zzg();
                                        zzaio zzaioVar3 = zzaibVar.zzd.zza;
                                        zzaiq zzaiqVar4 = zzaibVar.zzb;
                                        zzahx zzahxVar2 = zzaiqVar4.zza;
                                        int i40 = zzen.zza;
                                        zzaiqVar4.zzg[i37] = zzedVar6.zzp();
                                        long[] jArr2 = zzaiqVar4.zzf;
                                        long j10 = zzaiqVar4.zzb;
                                        jArr2[i37] = j10;
                                        if ((iZzg6 & 1) != 0) {
                                            jArr2[i37] = j10 + ((long) zzedVar6.zzg());
                                        }
                                        boolean z13 = (iZzg6 & 4) != 0;
                                        int iZzg7 = zzahxVar2.zzd;
                                        if (z13) {
                                            iZzg7 = zzedVar6.zzg();
                                        }
                                        int i41 = iZzg6 & 256;
                                        int i42 = iZzg6 & 512;
                                        int i43 = iZzg6 & 1024;
                                        int i44 = iZzg6 & 2048;
                                        long[] jArr3 = zzaioVar3.zzi;
                                        if (jArr3 != null) {
                                            i16 = iZzg7;
                                            i14 = i36;
                                            if (jArr3.length != 1 || zzaioVar3.zzj == null) {
                                                z7 = z13;
                                                i17 = i43;
                                                i18 = i44;
                                            } else {
                                                long j11 = jArr3[0];
                                                if (j11 == 0) {
                                                    z7 = z13;
                                                    i17 = i43;
                                                    i18 = i44;
                                                } else {
                                                    z7 = z13;
                                                    long j12 = zzaioVar3.zzd;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    long jZzu3 = zzen.zzu(j11, 1000000L, j12, roundingMode);
                                                    i17 = i43;
                                                    i18 = i44;
                                                    if (jZzu3 + zzen.zzu(zzaioVar3.zzj[0], 1000000L, zzaioVar3.zzc, roundingMode) < zzaioVar3.zze) {
                                                    }
                                                    iArr = zzaiqVar4.zzh;
                                                    jArr = zzaiqVar4.zzi;
                                                    zArr = zzaiqVar4.zzj;
                                                    if (zzaioVar3.zzb == 2 || (i28 & 1) == 0) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                    i19 = zzaiqVar4.zzg[i37] + i38;
                                                    j7 = zzaioVar3.zzc;
                                                    z9 = z8;
                                                    i15 = i28;
                                                    j8 = zzaiqVar4.zzp;
                                                    while (i38 < i19) {
                                                        if (i41 != 0) {
                                                            iZzg = zzedVar6.zzg();
                                                        } else {
                                                            iZzg = zzahxVar2.zzb;
                                                        }
                                                        zzg(iZzg);
                                                        if (i42 != 0) {
                                                            iZzg2 = zzedVar6.zzg();
                                                        } else {
                                                            iZzg2 = zzahxVar2.zzc;
                                                        }
                                                        zzg(iZzg2);
                                                        if (i17 != 0) {
                                                            z10 = z7;
                                                            iZzg3 = zzedVar6.zzg();
                                                        } else {
                                                            z10 = z7;
                                                            if (i38 != 0) {
                                                                iZzg3 = zzahxVar2.zzd;
                                                            } else if (z7) {
                                                                iZzg3 = i16;
                                                                i38 = 0;
                                                            } else {
                                                                i38 = 0;
                                                                iZzg3 = zzahxVar2.zzd;
                                                            }
                                                        }
                                                        if (i18 != 0) {
                                                            iZzg4 = zzedVar6.zzg();
                                                        } else {
                                                            iZzg4 = 0;
                                                        }
                                                        jZzu = zzen.zzu((((long) iZzg4) + j8) - j3, 1000000L, j7, RoundingMode.DOWN);
                                                        jArr[i38] = jZzu;
                                                        if (!zzaiqVar4.zzq) {
                                                            jArr[i38] = jZzu + zzaibVar.zzd.zzh;
                                                        }
                                                        iArr[i38] = iZzg2;
                                                        if (((iZzg3 >> 16) & 1) != 0) {
                                                            z11 = false;
                                                        } else if (!z9) {
                                                            z11 = true;
                                                        } else if (i38 == 0) {
                                                            z11 = true;
                                                            i38 = 0;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        zArr[i38] = z11;
                                                        j8 += (long) iZzg;
                                                        i38++;
                                                        j7 = j7;
                                                        i19 = i19;
                                                        i41 = i41;
                                                        z7 = z10;
                                                        i42 = i42;
                                                        zzedVar6 = zzedVar6;
                                                        i17 = i17;
                                                    }
                                                    int i45 = i19;
                                                    zzaiqVar4.zzp = j8;
                                                    i37 = i39;
                                                    i38 = i45;
                                                }
                                                j3 = zzaioVar3.zzj[0];
                                                iArr = zzaiqVar4.zzh;
                                                jArr = zzaiqVar4.zzi;
                                                zArr = zzaiqVar4.zzj;
                                                if (zzaioVar3.zzb == 2) {
                                                    z8 = false;
                                                } else {
                                                    z8 = false;
                                                }
                                                i19 = zzaiqVar4.zzg[i37] + i38;
                                                j7 = zzaioVar3.zzc;
                                                z9 = z8;
                                                i15 = i28;
                                                j8 = zzaiqVar4.zzp;
                                                while (i38 < i19) {
                                                    if (i41 != 0) {
                                                        iZzg = zzedVar6.zzg();
                                                    } else {
                                                        iZzg = zzahxVar2.zzb;
                                                    }
                                                    zzg(iZzg);
                                                    if (i42 != 0) {
                                                        iZzg2 = zzedVar6.zzg();
                                                    } else {
                                                        iZzg2 = zzahxVar2.zzc;
                                                    }
                                                    zzg(iZzg2);
                                                    if (i17 != 0) {
                                                        z10 = z7;
                                                        iZzg3 = zzedVar6.zzg();
                                                    } else {
                                                        z10 = z7;
                                                        if (i38 != 0) {
                                                            iZzg3 = zzahxVar2.zzd;
                                                        } else if (z7) {
                                                            iZzg3 = i16;
                                                            i38 = 0;
                                                        } else {
                                                            i38 = 0;
                                                            iZzg3 = zzahxVar2.zzd;
                                                        }
                                                    }
                                                    if (i18 != 0) {
                                                        iZzg4 = zzedVar6.zzg();
                                                    } else {
                                                        iZzg4 = 0;
                                                    }
                                                    jZzu = zzen.zzu((((long) iZzg4) + j8) - j3, 1000000L, j7, RoundingMode.DOWN);
                                                    jArr[i38] = jZzu;
                                                    if (!zzaiqVar4.zzq) {
                                                        jArr[i38] = jZzu + zzaibVar.zzd.zzh;
                                                    }
                                                    iArr[i38] = iZzg2;
                                                    if (((iZzg3 >> 16) & 1) != 0) {
                                                        z11 = false;
                                                    } else if (!z9) {
                                                        z11 = true;
                                                    } else if (i38 == 0) {
                                                        z11 = true;
                                                        i38 = 0;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    zArr[i38] = z11;
                                                    j8 += (long) iZzg;
                                                    i38++;
                                                    j7 = j7;
                                                    i19 = i19;
                                                    i41 = i41;
                                                    z7 = z10;
                                                    i42 = i42;
                                                    zzedVar6 = zzedVar6;
                                                    i17 = i17;
                                                }
                                                int i46 = i19;
                                                zzaiqVar4.zzp = j8;
                                                i37 = i39;
                                                i38 = i46;
                                            }
                                        } else {
                                            i14 = i36;
                                            i16 = iZzg7;
                                            i17 = i43;
                                            i18 = i44;
                                            z7 = z13;
                                        }
                                        j3 = 0;
                                        iArr = zzaiqVar4.zzh;
                                        jArr = zzaiqVar4.zzi;
                                        zArr = zzaiqVar4.zzj;
                                        if (zzaioVar3.zzb == 2) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        i19 = zzaiqVar4.zzg[i37] + i38;
                                        j7 = zzaioVar3.zzc;
                                        z9 = z8;
                                        i15 = i28;
                                        j8 = zzaiqVar4.zzp;
                                        while (i38 < i19) {
                                            if (i41 != 0) {
                                                iZzg = zzedVar6.zzg();
                                            } else {
                                                iZzg = zzahxVar2.zzb;
                                            }
                                            zzg(iZzg);
                                            if (i42 != 0) {
                                                iZzg2 = zzedVar6.zzg();
                                            } else {
                                                iZzg2 = zzahxVar2.zzc;
                                            }
                                            zzg(iZzg2);
                                            if (i17 != 0) {
                                                z10 = z7;
                                                iZzg3 = zzedVar6.zzg();
                                            } else {
                                                z10 = z7;
                                                if (i38 != 0) {
                                                    iZzg3 = zzahxVar2.zzd;
                                                } else if (z7) {
                                                    iZzg3 = i16;
                                                    i38 = 0;
                                                } else {
                                                    i38 = 0;
                                                    iZzg3 = zzahxVar2.zzd;
                                                }
                                            }
                                            if (i18 != 0) {
                                                iZzg4 = zzedVar6.zzg();
                                            } else {
                                                iZzg4 = 0;
                                            }
                                            jZzu = zzen.zzu((((long) iZzg4) + j8) - j3, 1000000L, j7, RoundingMode.DOWN);
                                            jArr[i38] = jZzu;
                                            if (!zzaiqVar4.zzq) {
                                                jArr[i38] = jZzu + zzaibVar.zzd.zzh;
                                            }
                                            iArr[i38] = iZzg2;
                                            if (((iZzg3 >> 16) & 1) != 0) {
                                                z11 = false;
                                            } else if (!z9) {
                                                z11 = true;
                                            } else if (i38 == 0) {
                                                z11 = true;
                                                i38 = 0;
                                            } else {
                                                z11 = false;
                                            }
                                            zArr[i38] = z11;
                                            j8 += (long) iZzg;
                                            i38++;
                                            j7 = j7;
                                            i19 = i19;
                                            i41 = i41;
                                            z7 = z10;
                                            i42 = i42;
                                            zzedVar6 = zzedVar6;
                                            i17 = i17;
                                        }
                                        int i47 = i19;
                                        zzaiqVar4.zzp = j8;
                                        i37 = i39;
                                        i38 = i47;
                                    } else {
                                        i14 = i36;
                                        i15 = i28;
                                        bArr4 = bArr4;
                                        zzeqVar3 = zzeqVar3;
                                        zzaiqVar2 = zzaiqVar2;
                                    }
                                    i36 = i14 + 1;
                                    list = list;
                                    size4 = size4;
                                    zzeqVar2 = zzeqVar2;
                                    i29 = i29;
                                    bArr4 = bArr4;
                                    zzeqVar3 = zzeqVar3;
                                    zzaiqVar2 = zzaiqVar2;
                                    i28 = i15;
                                    i12 = 1953658222;
                                }
                                i8 = i28;
                                byte[] bArr5 = bArr4;
                                i10 = i29;
                                zzeqVar = zzeqVar2;
                                zzeq zzeqVar4 = zzeqVar3;
                                zzaiq zzaiqVar5 = zzaiqVar2;
                                zzaio zzaioVar4 = zzaibVar.zzd.zza;
                                zzahx zzahxVar3 = zzaiqVar5.zza;
                                zzahxVar3.getClass();
                                zzaip zzaipVarZzb = zzaioVar4.zzb(zzahxVar3.zza);
                                zzer zzerVarZzb3 = zzeqVar4.zzb(1935763834);
                                if (zzerVarZzb3 != null) {
                                    zzaipVarZzb.getClass();
                                    int i48 = zzaipVarZzb.zzd;
                                    zzed zzedVar7 = zzerVarZzb3.zza;
                                    zzedVar7.zzL(8);
                                    if ((zzedVar7.zzg() & 1) == 1) {
                                        zzedVar7.zzM(8);
                                    }
                                    int iZzm = zzedVar7.zzm();
                                    int iZzp2 = zzedVar7.zzp();
                                    int i49 = zzaiqVar5.zze;
                                    if (iZzp2 > i49) {
                                        throw zzaz.zza("Saiz sample count " + iZzp2 + " is greater than fragment sample count" + i49, null);
                                    }
                                    if (iZzm == 0) {
                                        boolean[] zArr2 = zzaiqVar5.zzl;
                                        i13 = 0;
                                        for (int i50 = 0; i50 < iZzp2; i50++) {
                                            int iZzm2 = zzedVar7.zzm();
                                            i13 += iZzm2;
                                            zArr2[i50] = iZzm2 > i48;
                                        }
                                        z4 = false;
                                    } else {
                                        boolean z14 = iZzm > i48;
                                        i13 = iZzm * iZzp2;
                                        z4 = false;
                                        Arrays.fill(zzaiqVar5.zzl, 0, iZzp2, z14);
                                    }
                                    Arrays.fill(zzaiqVar5.zzl, iZzp2, zzaiqVar5.zze, z4);
                                    if (i13 > 0) {
                                        zzaiqVar5.zza(i13);
                                    }
                                }
                                zzer zzerVarZzb4 = zzeqVar4.zzb(1935763823);
                                if (zzerVarZzb4 != null) {
                                    zzed zzedVar8 = zzerVarZzb4.zza;
                                    zzedVar8.zzL(8);
                                    int iZzg8 = zzedVar8.zzg();
                                    if ((iZzg8 & 1) == 1) {
                                        zzedVar8.zzM(8);
                                    }
                                    int iZzp3 = zzedVar8.zzp();
                                    if (iZzp3 != 1) {
                                        throw zzaz.zza("Unexpected saio entry count: " + iZzp3, null);
                                    }
                                    zzaiqVar5.zzc += zzahw.zza(iZzg8) == 0 ? zzedVar8.zzu() : zzedVar8.zzw();
                                }
                                zzer zzerVarZzb5 = zzeqVar4.zzb(1936027235);
                                if (zzerVarZzb5 != null) {
                                    zzk(zzerVarZzb5.zza, 0, zzaiqVar5);
                                }
                                String str = zzaipVarZzb != null ? zzaipVarZzb.zzb : null;
                                zzed zzedVar9 = null;
                                zzed zzedVar10 = null;
                                for (int i51 = 0; i51 < zzeqVar4.zzb.size(); i51++) {
                                    zzer zzerVar4 = (zzer) zzeqVar4.zzb.get(i51);
                                    zzed zzedVar11 = zzerVar4.zza;
                                    int i52 = zzerVar4.zzd;
                                    if (i52 == 1935828848) {
                                        zzedVar11.zzL(12);
                                        if (zzedVar11.zzg() == 1936025959) {
                                            zzedVar9 = zzedVar11;
                                        }
                                    } else if (i52 == 1936158820) {
                                        zzedVar11.zzL(12);
                                        if (zzedVar11.zzg() == 1936025959) {
                                            zzedVar10 = zzedVar11;
                                        }
                                    }
                                }
                                if (zzedVar9 != null && zzedVar10 != null) {
                                    zzedVar9.zzL(8);
                                    int iZza = zzahw.zza(zzedVar9.zzg());
                                    zzedVar9.zzM(4);
                                    if (iZza == 1) {
                                        zzedVar9.zzM(4);
                                    }
                                    if (zzedVar9.zzg() != 1) {
                                        throw zzaz.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzedVar10.zzL(8);
                                    int iZza2 = zzahw.zza(zzedVar10.zzg());
                                    zzedVar10.zzM(4);
                                    if (iZza2 == 1) {
                                        if (zzedVar10.zzu() == 0) {
                                            throw zzaz.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZza2 >= 2) {
                                        zzedVar10.zzM(4);
                                    }
                                    if (zzedVar10.zzu() != 1) {
                                        throw zzaz.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzedVar10.zzM(1);
                                    int iZzm3 = zzedVar10.zzm();
                                    int i53 = (iZzm3 & 240) >> 4;
                                    int i54 = iZzm3 & 15;
                                    if (zzedVar10.zzm() == 1) {
                                        int iZzm4 = zzedVar10.zzm();
                                        byte[] bArr6 = new byte[16];
                                        zzedVar10.zzH(bArr6, 0, 16);
                                        if (iZzm4 == 0) {
                                            int iZzm5 = zzedVar10.zzm();
                                            byte[] bArr7 = new byte[iZzm5];
                                            zzedVar10.zzH(bArr7, 0, iZzm5);
                                            bArr3 = bArr7;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzaiqVar5.zzk = true;
                                        zzaiqVar5.zzm = new zzaip(true, str, iZzm4, bArr6, i53, i54, bArr3);
                                    }
                                }
                                int size5 = zzeqVar4.zzb.size();
                                int i55 = 0;
                                while (i55 < size5) {
                                    zzer zzerVar5 = (zzer) zzeqVar4.zzb.get(i55);
                                    if (zzerVar5.zzd == 1970628964) {
                                        zzed zzedVar12 = zzerVar5.zza;
                                        zzedVar12.zzL(8);
                                        bArr2 = bArr5;
                                        zzedVar12.zzH(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzk(zzedVar12, 16, zzaiqVar5);
                                        }
                                    } else {
                                        bArr2 = bArr5;
                                    }
                                    i55++;
                                    bArr5 = bArr2;
                                }
                                bArr = bArr5;
                                i11 = 8;
                            }
                        } else {
                            sparseArray = sparseArray3;
                            i8 = i28;
                            bArr = bArr4;
                            i9 = size3;
                            i10 = i29;
                            zzeqVar = zzeqVar2;
                            i11 = i21;
                        }
                        i29 = i10 + 1;
                        i21 = i11;
                        bArr4 = bArr;
                        size3 = i9;
                        sparseArray3 = sparseArray;
                        zzeqVar2 = zzeqVar;
                        i28 = i8;
                    }
                    i7 = i21;
                    zzs zzsVarZzh2 = zzh(zzeqVar2.zzb);
                    zzaicVar = this;
                    if (zzsVarZzh2 != null) {
                        int size6 = zzaicVar.zzf.size();
                        for (int i56 = 0; i56 < size6; i56++) {
                            ((zzaib) zzaicVar.zzf.valueAt(i56)).zzj(zzsVarZzh2);
                        }
                    }
                    if (zzaicVar.zzy != -9223372036854775807L) {
                        int size7 = zzaicVar.zzf.size();
                        for (int i57 = 0; i57 < size7; i57++) {
                            zzaib zzaibVar2 = (zzaib) zzaicVar.zzf.valueAt(i57);
                            long j13 = zzaicVar.zzy;
                            int i58 = zzaibVar2.zzf;
                            while (true) {
                                zzaiq zzaiqVar6 = zzaibVar2.zzb;
                                if (i58 >= zzaiqVar6.zze || zzaiqVar6.zzi[i58] > j13) {
                                    break;
                                }
                                if (zzaiqVar6.zzj[i58]) {
                                    zzaibVar2.zzi = i58;
                                }
                                i58++;
                            }
                        }
                        zzaicVar.zzy = -9223372036854775807L;
                    }
                } else {
                    zzaicVar = zzaicVar2;
                    i7 = i21;
                    if (!zzaicVar.zzn.isEmpty()) {
                        ((zzeq) zzaicVar.zzn.peek()).zzc(zzeqVar2);
                    }
                }
                zzaicVar2 = zzaicVar;
                i21 = i7;
            }
        }
        zzj();
    }

    private static final zzahx zzm(SparseArray sparseArray, int i7) {
        if (sparseArray.size() == 1) {
            return (zzahx) sparseArray.valueAt(0);
        }
        zzahx zzahxVar = (zzahx) sparseArray.get(i7);
        zzahxVar.getClass();
        return zzahxVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0206  */
    /* JADX WARN: Code duplicated, block: B:108:0x0216  */
    /* JADX WARN: Code duplicated, block: B:117:0x0236  */
    /* JADX WARN: Code duplicated, block: B:119:0x023b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:123:0x027c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0282  */
    /* JADX WARN: Code duplicated, block: B:126:0x028a  */
    /* JADX WARN: Code duplicated, block: B:129:0x029e  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02be  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:144:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:147:0x0301  */
    /* JADX WARN: Code duplicated, block: B:150:0x031d  */
    /* JADX WARN: Code duplicated, block: B:431:0x02b6 A[EDGE_INSN: B:431:0x02b6->B:132:0x02b6 BREAK  A[LOOP:7: B:66:0x0151->B:68:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0151 A[LOOP:7: B:66:0x0151->B:68:0x0157, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:68:0x0157 A[LOOP:7: B:66:0x0151->B:68:0x0157, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x017a  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x018a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ae  */
    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) throws zzaz {
        int i7;
        zzaib zzaibVar;
        zzaio zzaioVar;
        zzaeb zzaebVar;
        long jZze;
        int i8;
        byte[] bArrZzN;
        int i9;
        int i10;
        char c3;
        int iZzf;
        int i11;
        int i12;
        int iZzb;
        int iZzg;
        int iZza;
        zzaip zzaipVarZzf;
        zzaea zzaeaVar;
        int i13;
        zzaia zzaiaVar;
        long j;
        int i14;
        int i15;
        int i16;
        int iZzc;
        long jZzu;
        long jZzu2;
        String str;
        String str2;
        long jZzu3;
        long j3;
        long jZzw;
        long jZzw2;
        while (true) {
            int i17 = this.zzr;
            i7 = 0;
            if (i17 == 0) {
                if (this.zzu == 0) {
                    if (!zzacwVar.zzn(this.zzm.zzN(), 0, 8, true)) {
                        this.zzp.zzd();
                        return -1;
                    }
                    this.zzu = 8;
                    this.zzm.zzL(0);
                    this.zzt = this.zzm.zzu();
                    this.zzs = this.zzm.zzg();
                }
                long j7 = this.zzt;
                if (j7 == 1) {
                    zzacwVar.zzi(this.zzm.zzN(), 8, 8);
                    this.zzu += 8;
                    this.zzt = this.zzm.zzw();
                } else if (j7 == 0) {
                    long jZzd = zzacwVar.zzd();
                    if (jZzd == -1) {
                        jZzd = !this.zzn.isEmpty() ? ((zzeq) this.zzn.peek()).zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzt = (jZzd - zzacwVar.zzf()) + ((long) this.zzu);
                    }
                }
                long j8 = this.zzt;
                long j9 = this.zzu;
                if (j8 < j9) {
                    throw zzaz.zzc("Atom size less than header length (unsupported).");
                }
                long jZzf = zzacwVar.zzf() - j9;
                int i18 = this.zzs;
                if ((i18 == 1836019558 || i18 == 1835295092) && !this.zzK) {
                    this.zzH.zzP(new zzadt(this.zzz, jZzf));
                    this.zzK = true;
                }
                if (this.zzs == 1836019558) {
                    int size = this.zzf.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        zzaiq zzaiqVar = ((zzaib) this.zzf.valueAt(i19)).zzb;
                        zzaiqVar.zzc = jZzf;
                        zzaiqVar.zzb = jZzf;
                    }
                }
                int i20 = this.zzs;
                if (i20 == 1835295092) {
                    this.zzB = null;
                    this.zzw = jZzf + this.zzt;
                    this.zzr = 2;
                } else if (i20 == 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1836019558 || i20 == 1953653094 || i20 == 1836475768 || i20 == 1701082227) {
                    long jZzf2 = (zzacwVar.zzf() + this.zzt) - 8;
                    this.zzn.push(new zzeq(i20, jZzf2));
                    if (this.zzt == this.zzu) {
                        zzl(jZzf2);
                    } else {
                        zzj();
                    }
                } else if (i20 == 1751411826 || i20 == 1835296868 || i20 == 1836476516 || i20 == 1936286840 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1668576371 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1937011571 || i20 == 1952867444 || i20 == 1952868452 || i20 == 1953196132 || i20 == 1953654136 || i20 == 1953658222 || i20 == 1886614376 || i20 == 1935763834 || i20 == 1935763823 || i20 == 1936027235 || i20 == 1970628964 || i20 == 1935828848 || i20 == 1936158820 || i20 == 1701606260 || i20 == 1835362404 || i20 == 1701671783) {
                    if (this.zzu != 8) {
                        throw zzaz.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.zzt > 2147483647L) {
                        throw zzaz.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzed zzedVar = new zzed((int) this.zzt);
                    System.arraycopy(this.zzm.zzN(), 0, zzedVar.zzN(), 0, 8);
                    this.zzv = zzedVar;
                    this.zzr = 1;
                } else {
                    if (this.zzt > 2147483647L) {
                        throw zzaz.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzv = null;
                    this.zzr = 1;
                }
            } else if (i17 != 1) {
                long j10 = Long.MAX_VALUE;
                if (i17 != 2) {
                    zzaibVar = this.zzB;
                    if (zzaibVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zzf;
                    int size2 = sparseArray.size();
                    long j11 = Long.MAX_VALUE;
                    zzaib zzaibVar2 = null;
                    for (int i21 = 0; i21 < size2; i21++) {
                        zzaib zzaibVar3 = (zzaib) sparseArray.valueAt(i21);
                        if ((zzaibVar3.zzm || zzaibVar3.zzf != zzaibVar3.zzd.zzb) && (!zzaibVar3.zzm || zzaibVar3.zzh != zzaibVar3.zzb.zzd)) {
                            long jZzd2 = zzaibVar3.zzd();
                            if (jZzd2 < j11) {
                                zzaibVar2 = zzaibVar3;
                                j11 = jZzd2;
                            }
                        }
                    }
                    if (zzaibVar2 != null) {
                        int iZzd = (int) (zzaibVar2.zzd() - zzacwVar.zzf());
                        if (iZzd < 0) {
                            zzdq.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZzd = 0;
                        }
                        zzacwVar.zzk(iZzd);
                        this.zzB = zzaibVar2;
                        zzaibVar = zzaibVar2;
                        break;
                    }
                    int iZzf2 = (int) (this.zzw - zzacwVar.zzf());
                    if (iZzf2 < 0) {
                        throw zzaz.zza("Offset to end of mdat was negative.", null);
                    }
                    zzacwVar.zzk(iZzf2);
                    zzj();
                } else {
                    int size3 = this.zzf.size();
                    zzaib zzaibVar4 = null;
                    for (int i22 = 0; i22 < size3; i22++) {
                        zzaiq zzaiqVar2 = ((zzaib) this.zzf.valueAt(i22)).zzb;
                        if (zzaiqVar2.zzo) {
                            long j12 = zzaiqVar2.zzc;
                            if (j12 < j10) {
                                zzaibVar4 = (zzaib) this.zzf.valueAt(i22);
                                j10 = j12;
                            }
                        }
                    }
                    if (zzaibVar4 == null) {
                        this.zzr = 3;
                    } else {
                        int iZzf3 = (int) (j10 - zzacwVar.zzf());
                        if (iZzf3 < 0) {
                            throw zzaz.zza("Offset to encryption data was negative.", null);
                        }
                        zzacwVar.zzk(iZzf3);
                        zzaiq zzaiqVar3 = zzaibVar4.zzb;
                        zzed zzedVar2 = zzaiqVar3.zzn;
                        zzacwVar.zzi(zzedVar2.zzN(), 0, zzedVar2.zze());
                        zzaiqVar3.zzn.zzL(0);
                        zzaiqVar3.zzo = false;
                    }
                }
            } else {
                long j13 = this.zzt - ((long) this.zzu);
                zzed zzedVar3 = this.zzv;
                int i23 = (int) j13;
                if (zzedVar3 != null) {
                    zzacwVar.zzi(zzedVar3.zzN(), 8, i23);
                    zzer zzerVar = new zzer(this.zzs, zzedVar3);
                    long jZzf3 = zzacwVar.zzf();
                    if (this.zzn.isEmpty()) {
                        int i24 = zzerVar.zzd;
                        if (i24 == 1936286840) {
                            zzed zzedVar4 = zzerVar.zza;
                            zzedVar4.zzL(8);
                            int iZza2 = zzahw.zza(zzedVar4.zzg());
                            zzedVar4.zzM(4);
                            long jZzu4 = zzedVar4.zzu();
                            if (iZza2 == 0) {
                                jZzw = zzedVar4.zzu();
                                jZzw2 = zzedVar4.zzu();
                            } else {
                                jZzw = zzedVar4.zzw();
                                jZzw2 = zzedVar4.zzw();
                            }
                            long j14 = jZzw2 + jZzf3;
                            long jZzu5 = zzen.zzu(jZzw, 1000000L, jZzu4, RoundingMode.DOWN);
                            zzedVar4.zzM(2);
                            int iZzq = zzedVar4.zzq();
                            int[] iArr = new int[iZzq];
                            long[] jArr = new long[iZzq];
                            long[] jArr2 = new long[iZzq];
                            long[] jArr3 = new long[iZzq];
                            long j15 = jZzu5;
                            int i25 = 0;
                            while (i25 < iZzq) {
                                int iZzg2 = zzedVar4.zzg();
                                if ((iZzg2 & Integer.MIN_VALUE) != 0) {
                                    throw zzaz.zza("Unhandled indirect reference", null);
                                }
                                long jZzu6 = zzedVar4.zzu();
                                iArr[i25] = iZzg2 & f.API_PRIORITY_OTHER;
                                jArr[i25] = j14;
                                jArr3[i25] = j15;
                                long j16 = jZzw + jZzu6;
                                int i26 = i25;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                int[] iArr2 = iArr;
                                long jZzu7 = zzen.zzu(j16, 1000000L, jZzu4, RoundingMode.DOWN);
                                jArr4[i26] = jZzu7 - jArr5[i26];
                                zzedVar4.zzM(4);
                                j14 += (long) iArr2[i26];
                                jArr2 = jArr4;
                                iZzq = iZzq;
                                jArr = jArr;
                                j15 = jZzu7;
                                i25 = i26 + 1;
                                iArr = iArr2;
                                jArr3 = jArr5;
                                jZzw = j16;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jZzu5), new zzaci(iArr, jArr, jArr2, jArr3));
                            this.zzA = ((Long) pairCreate.first).longValue();
                            this.zzH.zzP((zzadu) pairCreate.second);
                            this.zzK = true;
                        } else if (i24 == 1701671783) {
                            zzed zzedVar5 = zzerVar.zza;
                            if (this.zzI.length != 0) {
                                zzedVar5.zzL(8);
                                int iZza3 = zzahw.zza(zzedVar5.zzg());
                                if (iZza3 == 0) {
                                    String strZzy = zzedVar5.zzy((char) 0);
                                    strZzy.getClass();
                                    String strZzy2 = zzedVar5.zzy((char) 0);
                                    strZzy2.getClass();
                                    long jZzu8 = zzedVar5.zzu();
                                    long jZzu9 = zzedVar5.zzu();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    jZzu = zzen.zzu(jZzu9, 1000000L, jZzu8, roundingMode);
                                    long j17 = this.zzA;
                                    long j18 = j17 != -9223372036854775807L ? j17 + jZzu : -9223372036854775807L;
                                    jZzu2 = zzen.zzu(zzedVar5.zzu(), 1000L, jZzu8, roundingMode);
                                    str = strZzy;
                                    str2 = strZzy2;
                                    jZzu3 = zzedVar5.zzu();
                                    j3 = j18;
                                } else if (iZza3 != 1) {
                                    AbstractC0486a1.k(iZza3, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                                } else {
                                    long jZzu10 = zzedVar5.zzu();
                                    long jZzw3 = zzedVar5.zzw();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    long jZzu11 = zzen.zzu(jZzw3, 1000000L, jZzu10, roundingMode2);
                                    long jZzu12 = zzen.zzu(zzedVar5.zzu(), 1000L, jZzu10, roundingMode2);
                                    long jZzu13 = zzedVar5.zzu();
                                    String strZzy3 = zzedVar5.zzy((char) 0);
                                    strZzy3.getClass();
                                    String strZzy4 = zzedVar5.zzy((char) 0);
                                    strZzy4.getClass();
                                    jZzu2 = jZzu12;
                                    jZzu3 = jZzu13;
                                    str = strZzy3;
                                    str2 = strZzy4;
                                    j3 = jZzu11;
                                    jZzu = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzedVar5.zzb()];
                                zzedVar5.zzH(bArr, 0, zzedVar5.zzb());
                                zzed zzedVar6 = new zzed(this.zzl.zza(new zzafr(str, str2, jZzu2, jZzu3, bArr)));
                                int iZzb2 = zzedVar6.zzb();
                                for (zzaeb zzaebVar2 : this.zzI) {
                                    zzedVar6.zzL(0);
                                    zzaebVar2.zzr(zzedVar6, iZzb2);
                                }
                                if (j3 == -9223372036854775807L) {
                                    this.zzo.addLast(new zzaia(jZzu, true, iZzb2));
                                    this.zzx += iZzb2;
                                } else if (this.zzo.isEmpty()) {
                                    for (zzaeb zzaebVar3 : this.zzI) {
                                        zzaebVar3.zzt(j3, 1, iZzb2, 0, null);
                                    }
                                } else {
                                    this.zzo.addLast(new zzaia(j3, false, iZzb2));
                                    this.zzx += iZzb2;
                                }
                            }
                        }
                    } else {
                        ((zzeq) this.zzn.peek()).zzd(zzerVar);
                    }
                } else {
                    zzacwVar.zzk(i23);
                }
                zzl(zzacwVar.zzf());
            }
        }
        char c4 = 6;
        if (this.zzr == 3) {
            this.zzC = zzaibVar.zzb();
            zzz zzzVar = zzaibVar.zzd.zza.zzg;
            if (!Objects.equals(zzzVar.zzo, "video/avc")) {
                Objects.equals(zzzVar.zzo, "video/hevc");
            }
            this.zzF = true;
            if (zzaibVar.zzf < zzaibVar.zzi) {
                zzacwVar.zzk(this.zzC);
                zzaip zzaipVarZzf2 = zzaibVar.zzf();
                if (zzaipVarZzf2 != null) {
                    zzed zzedVar7 = zzaibVar.zzb.zzn;
                    int i27 = zzaipVarZzf2.zzd;
                    if (i27 != 0) {
                        zzedVar7.zzM(i27);
                    }
                    if (zzaibVar.zzb.zzb(zzaibVar.zzf)) {
                        zzedVar7.zzM(zzedVar7.zzq() * 6);
                    }
                }
                if (!zzaibVar.zzl()) {
                    this.zzB = null;
                }
                i13 = 3;
            } else {
                if (zzaibVar.zzd.zza.zzh == 1) {
                    this.zzC -= 8;
                    zzacwVar.zzk(8);
                }
                if ("audio/ac4".equals(zzaibVar.zzd.zza.zzg.zzo)) {
                    this.zzD = zzaibVar.zzc(this.zzC, 7);
                    zzaby.zzc(this.zzC, this.zzk);
                    zzaibVar.zza.zzr(this.zzk, 7);
                    iZzc = this.zzD + 7;
                    this.zzD = iZzc;
                } else {
                    iZzc = zzaibVar.zzc(this.zzC, 0);
                    this.zzD = iZzc;
                }
                this.zzC += iZzc;
                this.zzr = 4;
                this.zzE = 0;
                zzaioVar = zzaibVar.zzd.zza;
                zzaebVar = zzaibVar.zza;
                jZze = zzaibVar.zze();
                i8 = zzaioVar.zzk;
                if (i8 == 0) {
                    while (true) {
                        i15 = this.zzD;
                        i16 = this.zzC;
                        if (i15 < i16) {
                            break;
                        }
                        this.zzD += zzaebVar.zzf(zzacwVar, i16 - i15, false);
                    }
                } else {
                    bArrZzN = this.zzh.zzN();
                    bArrZzN[0] = 0;
                    bArrZzN[1] = 0;
                    bArrZzN[2] = 0;
                    i9 = 4 - i8;
                    while (this.zzD < this.zzC) {
                        i10 = this.zzE;
                        if (i10 == 0) {
                            if (this.zzJ.length <= 0 || !this.zzF) {
                                zzz zzzVar2 = zzaioVar.zzg;
                                i12 = zzaioVar.zzk;
                                iZzb = zzfj.zzb(zzzVar2);
                                if (i12 + iZzb > this.zzC - this.zzD) {
                                    iZzb = i7;
                                }
                            } else {
                                iZzb = i7;
                            }
                            zzacwVar.zzi(bArrZzN, i9, zzaioVar.zzk + iZzb);
                            this.zzh.zzL(i7);
                            iZzg = this.zzh.zzg();
                            if (iZzg >= 0) {
                                throw zzaz.zza("Invalid NAL length", null);
                            }
                            this.zzE = iZzg - iZzb;
                            this.zzg.zzL(i7);
                            zzaebVar.zzr(this.zzg, 4);
                            this.zzD += 4;
                            this.zzC += i9;
                            if (this.zzJ.length > 0 || iZzb <= 0) {
                                c3 = 6;
                            } else {
                                zzz zzzVar3 = zzaioVar.zzg;
                                byte b7 = bArrZzN[4];
                                if (Objects.equals(zzzVar3.zzo, "video/avc") || zzay.zzg(zzzVar3.zzk, "video/avc")) {
                                    c3 = 6;
                                    if ((b7 & 31) != 6) {
                                    }
                                    this.zzG = z;
                                    zzaebVar.zzr(this.zzh, iZzb);
                                    this.zzD += iZzb;
                                    if (iZzb <= 0 && !this.zzF && zzfj.zzj(bArrZzN, 4, iZzb, zzaioVar.zzg)) {
                                        this.zzF = true;
                                        c4 = c3;
                                    }
                                    i7 = 0;
                                } else {
                                    c3 = 6;
                                }
                                boolean z4 = (Objects.equals(zzzVar3.zzo, "video/hevc") || zzay.zzg(zzzVar3.zzk, "video/hevc")) && ((b7 & 126) >> 1) == 39;
                                this.zzG = z4;
                                zzaebVar.zzr(this.zzh, iZzb);
                                this.zzD += iZzb;
                                if (iZzb <= 0) {
                                }
                                i7 = 0;
                            }
                            this.zzG = z4;
                            zzaebVar.zzr(this.zzh, iZzb);
                            this.zzD += iZzb;
                            if (iZzb <= 0) {
                            }
                            i7 = 0;
                        } else {
                            c3 = c4;
                            if (this.zzG) {
                                this.zzi.zzI(i10);
                                zzacwVar.zzi(this.zzi.zzN(), 0, this.zzE);
                                zzaebVar.zzr(this.zzi, this.zzE);
                                iZzf = this.zzE;
                                zzed zzedVar8 = this.zzi;
                                int iZzc2 = zzfj.zzc(zzedVar8.zzN(), zzedVar8.zze());
                                this.zzi.zzL(0);
                                this.zzi.zzK(iZzc2);
                                i11 = zzaioVar.zzg.zzq;
                                if (i11 == -1) {
                                    if (this.zzp.zza() != 0) {
                                        this.zzp.zze(0);
                                    }
                                } else if (this.zzp.zza() != i11) {
                                    this.zzp.zze(i11);
                                }
                                this.zzp.zzb(jZze, this.zzi);
                                if ((zzaibVar.zza() & 4) != 0) {
                                    this.zzp.zzd();
                                }
                            } else {
                                iZzf = zzaebVar.zzf(zzacwVar, i10, false);
                            }
                            this.zzD += iZzf;
                            this.zzE -= iZzf;
                        }
                        c4 = c3;
                        i7 = 0;
                    }
                }
                iZza = zzaibVar.zza();
                if (!this.zzF) {
                    iZza |= 67108864;
                }
                int i28 = iZza;
                zzaipVarZzf = zzaibVar.zzf();
                if (zzaipVarZzf != null) {
                    zzaeaVar = zzaipVarZzf.zzc;
                } else {
                    zzaeaVar = null;
                }
                zzaebVar.zzt(jZze, i28, this.zzC, 0, zzaeaVar);
                while (!this.zzo.isEmpty()) {
                    zzaiaVar = (zzaia) this.zzo.removeFirst();
                    this.zzx -= zzaiaVar.zzc;
                    j = zzaiaVar.zza;
                    if (zzaiaVar.zzb) {
                        j += jZze;
                    }
                    for (zzaeb zzaebVar4 : this.zzI) {
                        zzaebVar4.zzt(j, 1, zzaiaVar.zzc, this.zzx, null);
                    }
                }
                if (!zzaibVar.zzl()) {
                    this.zzB = null;
                }
                i13 = 3;
            }
        } else {
            zzaioVar = zzaibVar.zzd.zza;
            zzaebVar = zzaibVar.zza;
            jZze = zzaibVar.zze();
            i8 = zzaioVar.zzk;
            if (i8 == 0) {
                while (true) {
                    i15 = this.zzD;
                    i16 = this.zzC;
                    if (i15 < i16) {
                        break;
                        break;
                    }
                    this.zzD += zzaebVar.zzf(zzacwVar, i16 - i15, false);
                }
            } else {
                bArrZzN = this.zzh.zzN();
                bArrZzN[0] = 0;
                bArrZzN[1] = 0;
                bArrZzN[2] = 0;
                i9 = 4 - i8;
                while (this.zzD < this.zzC) {
                    i10 = this.zzE;
                    if (i10 == 0) {
                        if (this.zzJ.length <= 0) {
                            zzz zzzVar4 = zzaioVar.zzg;
                            i12 = zzaioVar.zzk;
                            iZzb = zzfj.zzb(zzzVar4);
                            if (i12 + iZzb > this.zzC - this.zzD) {
                                iZzb = i7;
                            }
                        } else {
                            zzz zzzVar5 = zzaioVar.zzg;
                            i12 = zzaioVar.zzk;
                            iZzb = zzfj.zzb(zzzVar5);
                            if (i12 + iZzb > this.zzC - this.zzD) {
                                iZzb = i7;
                            }
                        }
                        zzacwVar.zzi(bArrZzN, i9, zzaioVar.zzk + iZzb);
                        this.zzh.zzL(i7);
                        iZzg = this.zzh.zzg();
                        if (iZzg >= 0) {
                            throw zzaz.zza("Invalid NAL length", null);
                        }
                        this.zzE = iZzg - iZzb;
                        this.zzg.zzL(i7);
                        zzaebVar.zzr(this.zzg, 4);
                        this.zzD += 4;
                        this.zzC += i9;
                        if (this.zzJ.length > 0) {
                            c3 = 6;
                        } else {
                            c3 = 6;
                        }
                        this.zzG = z4;
                        zzaebVar.zzr(this.zzh, iZzb);
                        this.zzD += iZzb;
                        if (iZzb <= 0) {
                        }
                        i7 = 0;
                    } else {
                        c3 = c4;
                        if (this.zzG) {
                            this.zzi.zzI(i10);
                            zzacwVar.zzi(this.zzi.zzN(), 0, this.zzE);
                            zzaebVar.zzr(this.zzi, this.zzE);
                            iZzf = this.zzE;
                            zzed zzedVar9 = this.zzi;
                            int iZzc3 = zzfj.zzc(zzedVar9.zzN(), zzedVar9.zze());
                            this.zzi.zzL(0);
                            this.zzi.zzK(iZzc3);
                            i11 = zzaioVar.zzg.zzq;
                            if (i11 == -1) {
                                if (this.zzp.zza() != 0) {
                                    this.zzp.zze(0);
                                }
                            } else if (this.zzp.zza() != i11) {
                                this.zzp.zze(i11);
                            }
                            this.zzp.zzb(jZze, this.zzi);
                            if ((zzaibVar.zza() & 4) != 0) {
                                this.zzp.zzd();
                            }
                        } else {
                            iZzf = zzaebVar.zzf(zzacwVar, i10, false);
                        }
                        this.zzD += iZzf;
                        this.zzE -= iZzf;
                    }
                    c4 = c3;
                    i7 = 0;
                }
            }
            iZza = zzaibVar.zza();
            if (!this.zzF) {
                iZza |= 67108864;
            }
            int i29 = iZza;
            zzaipVarZzf = zzaibVar.zzf();
            if (zzaipVarZzf != null) {
                zzaeaVar = zzaipVarZzf.zzc;
            } else {
                zzaeaVar = null;
            }
            zzaebVar.zzt(jZze, i29, this.zzC, 0, zzaeaVar);
            while (!this.zzo.isEmpty()) {
                zzaiaVar = (zzaia) this.zzo.removeFirst();
                this.zzx -= zzaiaVar.zzc;
                j = zzaiaVar.zza;
                if (zzaiaVar.zzb) {
                    j += jZze;
                }
                while (i14 < r6) {
                    zzaebVar4.zzt(j, 1, zzaiaVar.zzc, this.zzx, null);
                }
            }
            if (!zzaibVar.zzl()) {
                this.zzB = null;
            }
            i13 = 3;
        }
        this.zzr = i13;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        int i7;
        if ((this.zzd & 32) == 0) {
            zzacyVar = new zzajt(zzacyVar, this.zzc);
        }
        this.zzH = zzacyVar;
        zzj();
        zzaeb[] zzaebVarArr = new zzaeb[2];
        this.zzI = zzaebVarArr;
        int i8 = 100;
        int i9 = 0;
        if ((this.zzd & 4) != 0) {
            zzaebVarArr[0] = this.zzH.zzw(100, 5);
            i7 = 1;
            i8 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
        } else {
            i7 = 0;
        }
        zzaeb[] zzaebVarArr2 = (zzaeb[]) zzen.zzP(this.zzI, i7);
        this.zzI = zzaebVarArr2;
        for (zzaeb zzaebVar : zzaebVarArr2) {
            zzaebVar.zzm(zzb);
        }
        this.zzJ = new zzaeb[this.zze.size()];
        while (i9 < this.zzJ.length) {
            zzaeb zzaebVarZzw = this.zzH.zzw(i8, 3);
            zzaebVarZzw.zzm((zzz) this.zze.get(i9));
            this.zzJ[i9] = zzaebVarZzw;
            i9++;
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        int size = this.zzf.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((zzaib) this.zzf.valueAt(i7)).zzi();
        }
        this.zzo.clear();
        this.zzx = 0;
        this.zzp.zzc();
        this.zzy = j3;
        this.zzn.clear();
        zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        zzady zzadyVarZza = zzain.zza(zzacwVar);
        this.zzq = zzadyVarZza != null ? zzfwh.zzo(zzadyVarZza) : zzfwh.zzn();
        return zzadyVarZza == null;
    }

    public zzaic(zzajq zzajqVar, int i7, zzek zzekVar, zzaio zzaioVar, List list, zzaeb zzaebVar) {
        this.zzc = zzajqVar;
        this.zzd = i7;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafs();
        this.zzm = new zzed(16);
        this.zzg = new zzed(zzfj.zza);
        this.zzh = new zzed(6);
        this.zzi = new zzed();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzed(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzq = zzfwh.zzn();
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = zzacy.zza;
        this.zzI = new zzaeb[0];
        this.zzJ = new zzaeb[0];
        this.zzp = new zzfn(new zzfm() { // from class: com.google.android.gms.internal.ads.zzahz
            @Override // com.google.android.gms.internal.ads.zzfm
            public final void zza(long j, zzed zzedVar) {
                zzach.zza(j, zzedVar, this.zza.zzJ);
            }
        });
    }
}
