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
import java.util.UUID;

/* loaded from: classes.dex */
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

    private static int zzg(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        throw zzaz.zza("Unexpected negative value: " + i7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzs zzh(List list) {
        int i7;
        ArrayList arrayList;
        UUID[] uuidArr;
        zzaik zzaikVar;
        UUID uuid;
        int size = list.size();
        int i8 = 0;
        ArrayList arrayList2 = null;
        while (i8 < size) {
            zzer zzerVar = (zzer) list.get(i8);
            if (zzerVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] zzN = zzerVar.zza.zzN();
                zzed zzedVar = new zzed(zzN);
                if (zzedVar.zze() >= 32) {
                    zzedVar.zzL(0);
                    int zzb2 = zzedVar.zzb();
                    int zzg = zzedVar.zzg();
                    if (zzg != zzb2) {
                        zzdq.zzf("PsshAtomUtil", "Advertised atom size (" + zzg + ") does not match buffer size: " + zzb2);
                    } else {
                        int zzg2 = zzedVar.zzg();
                        if (zzg2 != 1886614376) {
                            AbstractC0486a1.k(zzg2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int zza2 = zzahw.zza(zzedVar.zzg());
                            if (zza2 > 1) {
                                AbstractC0486a1.k(zza2, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid2 = new UUID(zzedVar.zzt(), zzedVar.zzt());
                                if (zza2 == 1) {
                                    int zzp = zzedVar.zzp();
                                    uuidArr = new UUID[zzp];
                                    int i9 = 0;
                                    while (i9 < zzp) {
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
                                int zzp2 = zzedVar.zzp();
                                int zzb3 = zzedVar.zzb();
                                if (zzp2 != zzb3) {
                                    zzdq.zzf("PsshAtomUtil", "Atom data size (" + zzp2 + ") does not match the bytes left: " + zzb3);
                                    zzaikVar = null;
                                    uuid = zzaikVar == null ? null : zzaikVar.zza;
                                    if (uuid == null) {
                                        zzdq.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = arrayList;
                                        arrayList2.add(new zzr(uuid, null, "video/mp4", zzN));
                                        i8 = i7 + 1;
                                    }
                                } else {
                                    byte[] bArr = new byte[zzp2];
                                    zzedVar.zzH(bArr, 0, zzp2);
                                    zzaikVar = new zzaik(uuid2, zza2, bArr, uuidArr);
                                    if (zzaikVar == null) {
                                    }
                                    if (uuid == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i7 = i8;
                arrayList = arrayList2;
                zzaikVar = null;
                if (zzaikVar == null) {
                }
                if (uuid == null) {
                }
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

    private static void zzk(zzed zzedVar, int i7, zzaiq zzaiqVar) {
        zzedVar.zzL(i7 + 8);
        int zzg = zzedVar.zzg();
        int i8 = zzahw.zza;
        if ((zzg & 1) != 0) {
            throw zzaz.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (zzg & 2) != 0;
        int zzp = zzedVar.zzp();
        if (zzp == 0) {
            Arrays.fill(zzaiqVar.zzl, 0, zzaiqVar.zze, false);
            return;
        }
        int i9 = zzaiqVar.zze;
        if (zzp != i9) {
            throw zzaz.zza("Senc sample count " + zzp + " is different from fragment sample count" + i9, null);
        }
        Arrays.fill(zzaiqVar.zzl, 0, zzp, z4);
        zzaiqVar.zza(zzedVar.zzb());
        zzed zzedVar2 = zzaiqVar.zzn;
        zzedVar.zzH(zzedVar2.zzN(), 0, zzedVar2.zze());
        zzaiqVar.zzn.zzL(0);
        zzaiqVar.zzo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x036a, code lost:
    
        if ((r0 + com.google.android.gms.internal.ads.zzen.zzu(r2.zzj[0], 1000000, r2.zzc, r44)) < r2.zze) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzl(long j) {
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
        byte[] bArr4;
        int i16;
        zzeq zzeqVar2;
        zzeq zzeqVar3;
        zzaiq zzaiqVar;
        List list;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z7;
        long j3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z8;
        int i26;
        int i27;
        zzed zzedVar;
        int i28;
        int i29;
        long j7;
        boolean z9;
        int i30;
        final zzaic zzaicVar2 = this;
        int i31 = 8;
        while (!zzaicVar2.zzn.isEmpty() && ((zzeq) zzaicVar2.zzn.peek()).zza == j) {
            zzeq zzeqVar4 = (zzeq) zzaicVar2.zzn.pop();
            int i32 = zzeqVar4.zzd;
            int i33 = 12;
            if (i32 == 1836019574) {
                zzs zzh = zzh(zzeqVar4.zzb);
                zzeq zza2 = zzeqVar4.zza(1836475768);
                zza2.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j8 = -9223372036854775807L;
                int i34 = 0;
                while (i34 < size) {
                    zzer zzerVar = (zzer) zza2.zzb.get(i34);
                    int i35 = zzerVar.zzd;
                    if (i35 == 1953654136) {
                        zzed zzedVar2 = zzerVar.zza;
                        zzedVar2.zzL(i33);
                        Pair create = Pair.create(Integer.valueOf(zzedVar2.zzg()), new zzahx(zzedVar2.zzg() - 1, zzedVar2.zzg(), zzedVar2.zzg(), zzedVar2.zzg()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzahx) create.second);
                    } else if (i35 == 1835362404) {
                        zzed zzedVar3 = zzerVar.zza;
                        zzedVar3.zzL(i31);
                        j8 = zzahw.zza(zzedVar3.zzg()) == 0 ? zzedVar3.zzu() : zzedVar3.zzw();
                    }
                    i34++;
                    i33 = 12;
                }
                List zzf = zzahw.zzf(zzeqVar4, new zzadj(), j8, zzh, (zzaicVar2.zzd & 16) != 0, false, new zzfsw(zzaicVar2) { // from class: com.google.android.gms.internal.ads.zzahy
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        return (zzaio) obj;
                    }
                });
                int size2 = zzf.size();
                if (zzaicVar2.zzf.size() == 0) {
                    String zza3 = zzaif.zza(zzf);
                    for (int i36 = 0; i36 < size2; i36++) {
                        zzair zzairVar = (zzair) zzf.get(i36);
                        zzaio zzaioVar = zzairVar.zza;
                        zzaeb zzw = zzaicVar2.zzH.zzw(i36, zzaioVar.zzb);
                        zzw.zzl(zzaioVar.zze);
                        zzaicVar2.zzf.put(zzaioVar.zza, new zzaib(zzw, zzairVar, zzm(sparseArray2, zzaioVar.zza), zza3));
                        zzaicVar2.zzz = Math.max(zzaicVar2.zzz, zzaioVar.zze);
                    }
                    zzaicVar2.zzH.zzG();
                } else {
                    zzcv.zzf(zzaicVar2.zzf.size() == size2);
                    for (int i37 = 0; i37 < size2; i37++) {
                        zzair zzairVar2 = (zzair) zzf.get(i37);
                        zzaio zzaioVar2 = zzairVar2.zza;
                        ((zzaib) zzaicVar2.zzf.get(zzaioVar2.zza)).zzh(zzairVar2, zzm(sparseArray2, zzaioVar2.zza));
                    }
                }
            } else {
                if (i32 == 1836019558) {
                    SparseArray sparseArray3 = zzaicVar2.zzf;
                    int i38 = zzaicVar2.zzd;
                    byte[] bArr5 = zzaicVar2.zzj;
                    int size3 = zzeqVar4.zzc.size();
                    int i39 = 0;
                    while (i39 < size3) {
                        zzeq zzeqVar5 = (zzeq) zzeqVar4.zzc.get(i39);
                        if (zzeqVar5.zzd == 1953653094) {
                            zzer zzb2 = zzeqVar5.zzb(1952868452);
                            zzb2.getClass();
                            zzed zzedVar4 = zzb2.zza;
                            zzedVar4.zzL(i31);
                            int zzg = zzedVar4.zzg();
                            int i40 = zzahw.zza;
                            zzaib zzaibVar = (zzaib) sparseArray3.get(zzedVar4.zzg());
                            if (zzaibVar == null) {
                                zzaibVar = null;
                            } else {
                                if ((zzg & 1) != 0) {
                                    long zzw2 = zzedVar4.zzw();
                                    zzaiq zzaiqVar2 = zzaibVar.zzb;
                                    zzaiqVar2.zzb = zzw2;
                                    zzaiqVar2.zzc = zzw2;
                                }
                                zzahx zzahxVar = zzaibVar.zze;
                                zzaibVar.zzb.zza = new zzahx((zzg & 2) != 0 ? zzedVar4.zzg() - 1 : zzahxVar.zza, (zzg & 8) != 0 ? zzedVar4.zzg() : zzahxVar.zzb, (zzg & 16) != 0 ? zzedVar4.zzg() : zzahxVar.zzc, (zzg & 32) != 0 ? zzedVar4.zzg() : zzahxVar.zzd);
                            }
                            if (zzaibVar != null) {
                                zzaiq zzaiqVar3 = zzaibVar.zzb;
                                long j9 = zzaiqVar3.zzp;
                                boolean z10 = zzaiqVar3.zzq;
                                zzaibVar.zzi();
                                zzaibVar.zzm = true;
                                zzer zzb3 = zzeqVar5.zzb(1952867444);
                                if (zzb3 == null || (i38 & 2) != 0) {
                                    zzaiqVar3.zzp = j9;
                                    zzaiqVar3.zzq = z10;
                                } else {
                                    zzed zzedVar5 = zzb3.zza;
                                    zzedVar5.zzL(i31);
                                    zzaiqVar3.zzp = zzahw.zza(zzedVar5.zzg()) == 1 ? zzedVar5.zzw() : zzedVar5.zzu();
                                    zzaiqVar3.zzq = true;
                                }
                                List list2 = zzeqVar5.zzb;
                                int size4 = list2.size();
                                int i41 = 0;
                                int i42 = 0;
                                int i43 = 0;
                                while (true) {
                                    i12 = 1953658222;
                                    if (i41 >= size4) {
                                        break;
                                    }
                                    SparseArray sparseArray4 = sparseArray3;
                                    zzer zzerVar2 = (zzer) list2.get(i41);
                                    int i44 = size3;
                                    if (zzerVar2.zzd == 1953658222) {
                                        zzed zzedVar6 = zzerVar2.zza;
                                        zzedVar6.zzL(12);
                                        int zzp = zzedVar6.zzp();
                                        if (zzp > 0) {
                                            i43 += zzp;
                                            i30 = 1;
                                            i42++;
                                            i41 += i30;
                                            size3 = i44;
                                            sparseArray3 = sparseArray4;
                                        }
                                    }
                                    i30 = 1;
                                    i41 += i30;
                                    size3 = i44;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i9 = size3;
                                zzaibVar.zzh = 0;
                                zzaibVar.zzg = 0;
                                zzaibVar.zzf = 0;
                                zzaiq zzaiqVar4 = zzaibVar.zzb;
                                zzaiqVar4.zzd = i42;
                                zzaiqVar4.zze = i43;
                                if (zzaiqVar4.zzg.length < i42) {
                                    zzaiqVar4.zzf = new long[i42];
                                    zzaiqVar4.zzg = new int[i42];
                                }
                                if (zzaiqVar4.zzh.length < i43) {
                                    int i45 = (i43 * 125) / 100;
                                    zzaiqVar4.zzh = new int[i45];
                                    zzaiqVar4.zzi = new long[i45];
                                    zzaiqVar4.zzj = new boolean[i45];
                                    zzaiqVar4.zzl = new boolean[i45];
                                }
                                int i46 = 0;
                                int i47 = 0;
                                int i48 = 0;
                                while (i46 < size4) {
                                    zzer zzerVar3 = (zzer) list2.get(i46);
                                    if (zzerVar3.zzd == i12) {
                                        int i49 = i47 + 1;
                                        zzed zzedVar7 = zzerVar3.zza;
                                        zzedVar7.zzL(8);
                                        int zzg2 = zzedVar7.zzg();
                                        zzaio zzaioVar3 = zzaibVar.zzd.zza;
                                        list = list2;
                                        zzaiq zzaiqVar5 = zzaibVar.zzb;
                                        i17 = size4;
                                        zzahx zzahxVar2 = zzaiqVar5.zza;
                                        int i50 = zzen.zza;
                                        zzaiqVar5.zzg[i47] = zzedVar7.zzp();
                                        long[] jArr = zzaiqVar5.zzf;
                                        i16 = i39;
                                        zzeqVar2 = zzeqVar4;
                                        long j10 = zzaiqVar5.zzb;
                                        jArr[i47] = j10;
                                        if ((zzg2 & 1) != 0) {
                                            bArr4 = bArr5;
                                            zzeqVar3 = zzeqVar5;
                                            zzaiqVar = zzaiqVar3;
                                            jArr[i47] = j10 + zzedVar7.zzg();
                                        } else {
                                            bArr4 = bArr5;
                                            zzeqVar3 = zzeqVar5;
                                            zzaiqVar = zzaiqVar3;
                                        }
                                        boolean z11 = (zzg2 & 4) != 0;
                                        int i51 = zzahxVar2.zzd;
                                        if (z11) {
                                            i51 = zzedVar7.zzg();
                                        }
                                        int i52 = zzg2 & 256;
                                        int i53 = zzg2 & 512;
                                        int i54 = zzg2 & 1024;
                                        int i55 = zzg2 & 2048;
                                        long[] jArr2 = zzaioVar3.zzi;
                                        if (jArr2 != null) {
                                            i18 = i51;
                                            i14 = i46;
                                            if (jArr2.length != 1 || zzaioVar3.zzj == null) {
                                                z7 = z11;
                                                i19 = i54;
                                                i20 = i55;
                                            } else {
                                                long j11 = jArr2[0];
                                                if (j11 == 0) {
                                                    z7 = z11;
                                                    i19 = i54;
                                                    i20 = i55;
                                                } else {
                                                    z7 = z11;
                                                    long j12 = zzaioVar3.zzd;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    long zzu = zzen.zzu(j11, 1000000L, j12, roundingMode);
                                                    i19 = i54;
                                                    i20 = i55;
                                                }
                                                j3 = zzaioVar3.zzj[0];
                                                int[] iArr = zzaiqVar5.zzh;
                                                long[] jArr3 = zzaiqVar5.zzi;
                                                boolean[] zArr = zzaiqVar5.zzj;
                                                boolean z12 = (zzaioVar3.zzb == 2 || (i38 & 1) == 0) ? false : true;
                                                i21 = zzaiqVar5.zzg[i47] + i48;
                                                long j13 = zzaioVar3.zzc;
                                                boolean z13 = z12;
                                                i15 = i38;
                                                long j14 = zzaiqVar5.zzp;
                                                while (i48 < i21) {
                                                    if (i52 != 0) {
                                                        i22 = i21;
                                                        i23 = zzedVar7.zzg();
                                                    } else {
                                                        i22 = i21;
                                                        i23 = zzahxVar2.zzb;
                                                    }
                                                    zzg(i23);
                                                    if (i53 != 0) {
                                                        i24 = i52;
                                                        i25 = zzedVar7.zzg();
                                                    } else {
                                                        i24 = i52;
                                                        i25 = zzahxVar2.zzc;
                                                    }
                                                    zzg(i25);
                                                    if (i19 != 0) {
                                                        z8 = z7;
                                                        i26 = zzedVar7.zzg();
                                                    } else {
                                                        z8 = z7;
                                                        if (i48 == 0) {
                                                            if (z7) {
                                                                i26 = i18;
                                                                i48 = 0;
                                                            } else {
                                                                i48 = 0;
                                                            }
                                                        }
                                                        i26 = zzahxVar2.zzd;
                                                    }
                                                    if (i20 != 0) {
                                                        i27 = i53;
                                                        zzedVar = zzedVar7;
                                                        i28 = i19;
                                                        i29 = zzedVar7.zzg();
                                                    } else {
                                                        i27 = i53;
                                                        zzedVar = zzedVar7;
                                                        i28 = i19;
                                                        i29 = 0;
                                                    }
                                                    long zzu2 = zzen.zzu((i29 + j14) - j3, 1000000L, j13, RoundingMode.DOWN);
                                                    jArr3[i48] = zzu2;
                                                    if (zzaiqVar5.zzq) {
                                                        j7 = j13;
                                                    } else {
                                                        j7 = j13;
                                                        jArr3[i48] = zzu2 + zzaibVar.zzd.zzh;
                                                    }
                                                    iArr[i48] = i25;
                                                    if (((i26 >> 16) & 1) == 0) {
                                                        if (!z13) {
                                                            z9 = true;
                                                        } else if (i48 == 0) {
                                                            z9 = true;
                                                            i48 = 0;
                                                        }
                                                        zArr[i48] = z9;
                                                        j14 += i23;
                                                        i48++;
                                                        j13 = j7;
                                                        i21 = i22;
                                                        i52 = i24;
                                                        z7 = z8;
                                                        i53 = i27;
                                                        zzedVar7 = zzedVar;
                                                        i19 = i28;
                                                    }
                                                    z9 = false;
                                                    zArr[i48] = z9;
                                                    j14 += i23;
                                                    i48++;
                                                    j13 = j7;
                                                    i21 = i22;
                                                    i52 = i24;
                                                    z7 = z8;
                                                    i53 = i27;
                                                    zzedVar7 = zzedVar;
                                                    i19 = i28;
                                                }
                                                int i56 = i21;
                                                zzaiqVar5.zzp = j14;
                                                i47 = i49;
                                                i48 = i56;
                                            }
                                        } else {
                                            i14 = i46;
                                            i18 = i51;
                                            i19 = i54;
                                            i20 = i55;
                                            z7 = z11;
                                        }
                                        j3 = 0;
                                        int[] iArr2 = zzaiqVar5.zzh;
                                        long[] jArr32 = zzaiqVar5.zzi;
                                        boolean[] zArr2 = zzaiqVar5.zzj;
                                        if (zzaioVar3.zzb == 2) {
                                        }
                                        i21 = zzaiqVar5.zzg[i47] + i48;
                                        long j132 = zzaioVar3.zzc;
                                        boolean z132 = z12;
                                        i15 = i38;
                                        long j142 = zzaiqVar5.zzp;
                                        while (i48 < i21) {
                                        }
                                        int i562 = i21;
                                        zzaiqVar5.zzp = j142;
                                        i47 = i49;
                                        i48 = i562;
                                    } else {
                                        i14 = i46;
                                        i15 = i38;
                                        bArr4 = bArr5;
                                        i16 = i39;
                                        zzeqVar2 = zzeqVar4;
                                        zzeqVar3 = zzeqVar5;
                                        zzaiqVar = zzaiqVar3;
                                        list = list2;
                                        i17 = size4;
                                    }
                                    i46 = i14 + 1;
                                    list2 = list;
                                    size4 = i17;
                                    zzeqVar4 = zzeqVar2;
                                    i39 = i16;
                                    bArr5 = bArr4;
                                    zzeqVar5 = zzeqVar3;
                                    zzaiqVar3 = zzaiqVar;
                                    i38 = i15;
                                    i12 = 1953658222;
                                }
                                i8 = i38;
                                byte[] bArr6 = bArr5;
                                i10 = i39;
                                zzeqVar = zzeqVar4;
                                zzeq zzeqVar6 = zzeqVar5;
                                zzaiq zzaiqVar6 = zzaiqVar3;
                                zzaio zzaioVar4 = zzaibVar.zzd.zza;
                                zzahx zzahxVar3 = zzaiqVar6.zza;
                                zzahxVar3.getClass();
                                zzaip zzb4 = zzaioVar4.zzb(zzahxVar3.zza);
                                zzer zzb5 = zzeqVar6.zzb(1935763834);
                                if (zzb5 != null) {
                                    zzb4.getClass();
                                    int i57 = zzb4.zzd;
                                    zzed zzedVar8 = zzb5.zza;
                                    zzedVar8.zzL(8);
                                    if ((zzedVar8.zzg() & 1) == 1) {
                                        zzedVar8.zzM(8);
                                    }
                                    int zzm = zzedVar8.zzm();
                                    int zzp2 = zzedVar8.zzp();
                                    int i58 = zzaiqVar6.zze;
                                    if (zzp2 > i58) {
                                        throw zzaz.zza("Saiz sample count " + zzp2 + " is greater than fragment sample count" + i58, null);
                                    }
                                    if (zzm == 0) {
                                        boolean[] zArr3 = zzaiqVar6.zzl;
                                        i13 = 0;
                                        for (int i59 = 0; i59 < zzp2; i59++) {
                                            int zzm2 = zzedVar8.zzm();
                                            i13 += zzm2;
                                            zArr3[i59] = zzm2 > i57;
                                        }
                                        z4 = false;
                                    } else {
                                        boolean z14 = zzm > i57;
                                        i13 = zzm * zzp2;
                                        z4 = false;
                                        Arrays.fill(zzaiqVar6.zzl, 0, zzp2, z14);
                                    }
                                    Arrays.fill(zzaiqVar6.zzl, zzp2, zzaiqVar6.zze, z4);
                                    if (i13 > 0) {
                                        zzaiqVar6.zza(i13);
                                    }
                                }
                                zzer zzb6 = zzeqVar6.zzb(1935763823);
                                if (zzb6 != null) {
                                    zzed zzedVar9 = zzb6.zza;
                                    zzedVar9.zzL(8);
                                    int zzg3 = zzedVar9.zzg();
                                    if ((zzg3 & 1) == 1) {
                                        zzedVar9.zzM(8);
                                    }
                                    int zzp3 = zzedVar9.zzp();
                                    if (zzp3 != 1) {
                                        throw zzaz.zza("Unexpected saio entry count: " + zzp3, null);
                                    }
                                    zzaiqVar6.zzc += zzahw.zza(zzg3) == 0 ? zzedVar9.zzu() : zzedVar9.zzw();
                                }
                                zzer zzb7 = zzeqVar6.zzb(1936027235);
                                if (zzb7 != null) {
                                    zzk(zzb7.zza, 0, zzaiqVar6);
                                }
                                String str = zzb4 != null ? zzb4.zzb : null;
                                zzed zzedVar10 = null;
                                zzed zzedVar11 = null;
                                for (int i60 = 0; i60 < zzeqVar6.zzb.size(); i60++) {
                                    zzer zzerVar4 = (zzer) zzeqVar6.zzb.get(i60);
                                    zzed zzedVar12 = zzerVar4.zza;
                                    int i61 = zzerVar4.zzd;
                                    if (i61 == 1935828848) {
                                        zzedVar12.zzL(12);
                                        if (zzedVar12.zzg() == 1936025959) {
                                            zzedVar10 = zzedVar12;
                                        }
                                    } else if (i61 == 1936158820) {
                                        zzedVar12.zzL(12);
                                        if (zzedVar12.zzg() == 1936025959) {
                                            zzedVar11 = zzedVar12;
                                        }
                                    }
                                }
                                if (zzedVar10 != null && zzedVar11 != null) {
                                    zzedVar10.zzL(8);
                                    int zza4 = zzahw.zza(zzedVar10.zzg());
                                    zzedVar10.zzM(4);
                                    if (zza4 == 1) {
                                        zzedVar10.zzM(4);
                                    }
                                    if (zzedVar10.zzg() != 1) {
                                        throw zzaz.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzedVar11.zzL(8);
                                    int zza5 = zzahw.zza(zzedVar11.zzg());
                                    zzedVar11.zzM(4);
                                    if (zza5 == 1) {
                                        if (zzedVar11.zzu() == 0) {
                                            throw zzaz.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zza5 >= 2) {
                                        zzedVar11.zzM(4);
                                    }
                                    if (zzedVar11.zzu() != 1) {
                                        throw zzaz.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzedVar11.zzM(1);
                                    int zzm3 = zzedVar11.zzm();
                                    int i62 = (zzm3 & 240) >> 4;
                                    int i63 = zzm3 & 15;
                                    if (zzedVar11.zzm() == 1) {
                                        int zzm4 = zzedVar11.zzm();
                                        byte[] bArr7 = new byte[16];
                                        zzedVar11.zzH(bArr7, 0, 16);
                                        if (zzm4 == 0) {
                                            int zzm5 = zzedVar11.zzm();
                                            byte[] bArr8 = new byte[zzm5];
                                            zzedVar11.zzH(bArr8, 0, zzm5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzaiqVar6.zzk = true;
                                        zzaiqVar6.zzm = new zzaip(true, str, zzm4, bArr7, i62, i63, bArr3);
                                    }
                                }
                                int size5 = zzeqVar6.zzb.size();
                                int i64 = 0;
                                while (i64 < size5) {
                                    zzer zzerVar5 = (zzer) zzeqVar6.zzb.get(i64);
                                    if (zzerVar5.zzd == 1970628964) {
                                        zzed zzedVar13 = zzerVar5.zza;
                                        zzedVar13.zzL(8);
                                        bArr2 = bArr6;
                                        zzedVar13.zzH(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzk(zzedVar13, 16, zzaiqVar6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i64++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i11 = 8;
                                i39 = i10 + 1;
                                i31 = i11;
                                bArr5 = bArr;
                                size3 = i9;
                                sparseArray3 = sparseArray;
                                zzeqVar4 = zzeqVar;
                                i38 = i8;
                            }
                        }
                        sparseArray = sparseArray3;
                        i8 = i38;
                        bArr = bArr5;
                        i9 = size3;
                        i10 = i39;
                        zzeqVar = zzeqVar4;
                        i11 = i31;
                        i39 = i10 + 1;
                        i31 = i11;
                        bArr5 = bArr;
                        size3 = i9;
                        sparseArray3 = sparseArray;
                        zzeqVar4 = zzeqVar;
                        i38 = i8;
                    }
                    i7 = i31;
                    zzs zzh2 = zzh(zzeqVar4.zzb);
                    zzaicVar = this;
                    if (zzh2 != null) {
                        int size6 = zzaicVar.zzf.size();
                        for (int i65 = 0; i65 < size6; i65++) {
                            ((zzaib) zzaicVar.zzf.valueAt(i65)).zzj(zzh2);
                        }
                    }
                    if (zzaicVar.zzy != -9223372036854775807L) {
                        int size7 = zzaicVar.zzf.size();
                        for (int i66 = 0; i66 < size7; i66++) {
                            zzaib zzaibVar2 = (zzaib) zzaicVar.zzf.valueAt(i66);
                            long j15 = zzaicVar.zzy;
                            int i67 = zzaibVar2.zzf;
                            while (true) {
                                zzaiq zzaiqVar7 = zzaibVar2.zzb;
                                if (i67 < zzaiqVar7.zze && zzaiqVar7.zzi[i67] <= j15) {
                                    if (zzaiqVar7.zzj[i67]) {
                                        zzaibVar2.zzi = i67;
                                    }
                                    i67++;
                                }
                            }
                        }
                        zzaicVar.zzy = -9223372036854775807L;
                    }
                } else {
                    zzaicVar = zzaicVar2;
                    i7 = i31;
                    if (!zzaicVar.zzn.isEmpty()) {
                        ((zzeq) zzaicVar.zzn.peek()).zzc(zzeqVar4);
                    }
                }
                zzaicVar2 = zzaicVar;
                i31 = i7;
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

    /* JADX WARN: Code restructure failed: missing block: B:309:0x0095, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x009c, code lost:
    
        if (r36.zzr != 3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x009e, code lost:
    
        r36.zzC = r2.zzb();
        r4 = r2.zzd.zza.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00b0, code lost:
    
        if (java.util.Objects.equals(r4.zzo, "video/avc") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00b2, code lost:
    
        java.util.Objects.equals(r4.zzo, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00b7, code lost:
    
        r36.zzF = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00bd, code lost:
    
        if (r2.zzf >= r2.zzi) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00bf, code lost:
    
        r37.zzk(r36.zzC);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00c8, code lost:
    
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00cb, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00d1, code lost:
    
        if (r1 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00d3, code lost:
    
        r3.zzM(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00de, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00e0, code lost:
    
        r3.zzM(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00ec, code lost:
    
        if (r2.zzl() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00ee, code lost:
    
        r36.zzB = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00f0, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0321, code lost:
    
        r36.zzr = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0324, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00f9, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x00fb, code lost:
    
        r36.zzC -= 8;
        r37.zzk(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0112, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0114, code lost:
    
        r36.zzD = r2.zzc(r36.zzC, 7);
        com.google.android.gms.internal.ads.zzaby.zzc(r36.zzC, r36.zzk);
        r2.zza.zzr(r36.zzk, 7);
        r4 = r36.zzD + 7;
        r36.zzD = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0139, code lost:
    
        r36.zzC += r4;
        r36.zzr = 4;
        r36.zzE = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0131, code lost:
    
        r4 = r2.zzc(r36.zzC, 0);
        r36.zzD = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0143, code lost:
    
        r4 = r2.zzd.zza;
        r8 = r2.zza;
        r11 = r2.zze();
        r14 = r4.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x014f, code lost:
    
        if (r14 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0151, code lost:
    
        r3 = r36.zzD;
        r4 = r36.zzC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0155, code lost:
    
        if (r3 >= r4) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0157, code lost:
    
        r36.zzD += r8.zzf(r37, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x02b6, code lost:
    
        r1 = r2.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x02bc, code lost:
    
        if (r36.zzF != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x02be, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x02c1, code lost:
    
        r22 = r1;
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x02c7, code lost:
    
        if (r1 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x02c9, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x02d0, code lost:
    
        r8.zzt(r11, r22, r36.zzC, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x02e3, code lost:
    
        if (r36.zzo.isEmpty() != false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x02e5, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaia) r36.zzo.removeFirst();
        r36.zzx -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x02f8, code lost:
    
        if (r1.zzb == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x02fa, code lost:
    
        r3 = r3 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x02fb, code lost:
    
        r5 = r36.zzI;
        r6 = r5.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x02ff, code lost:
    
        if (r7 >= r6) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0301, code lost:
    
        r5[r7].zzt(r3, 1, r1.zzc, r36.zzx, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x031b, code lost:
    
        if (r2.zzl() != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x031d, code lost:
    
        r36.zzB = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0320, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x02ce, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0162, code lost:
    
        r15 = r36.zzh.zzN();
        r15[0] = 0;
        r15[1] = 0;
        r15[2] = 0;
        r14 = 4 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0178, code lost:
    
        if (r36.zzD >= r36.zzC) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x017a, code lost:
    
        r9 = r36.zzE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x017c, code lost:
    
        if (r9 != 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0181, code lost:
    
        if (r36.zzJ.length > 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0185, code lost:
    
        if (r36.zzF != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0188, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x019b, code lost:
    
        r37.zzi(r15, r14, r4.zzk + r9);
        r36.zzh.zzL(r10);
        r3 = r36.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01ac, code lost:
    
        if (r3 < 0) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01ae, code lost:
    
        r36.zzE = r3 - r9;
        r36.zzg.zzL(r10);
        r8.zzr(r36.zzg, 4);
        r36.zzD += 4;
        r36.zzC += r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x01c9, code lost:
    
        if (r36.zzJ.length <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x01cb, code lost:
    
        if (r9 <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x01cd, code lost:
    
        r3 = r4.zzg;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x01d7, code lost:
    
        if (java.util.Objects.equals(r3.zzo, "video/avc") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x01df, code lost:
    
        if (com.google.android.gms.internal.ads.zzay.zzg(r3.zzk, "video/avc") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01e2, code lost:
    
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x01ef, code lost:
    
        if (java.util.Objects.equals(r3.zzo, "video/hevc") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x01f7, code lost:
    
        if (com.google.android.gms.internal.ads.zzay.zzg(r3.zzk, "video/hevc") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01fa, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0208, code lost:
    
        r36.zzG = r3;
        r8.zzr(r36.zzh, r9);
        r36.zzD += r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0214, code lost:
    
        if (r9 <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0218, code lost:
    
        if (r36.zzF != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0221, code lost:
    
        if (com.google.android.gms.internal.ads.zzfj.zzj(r15, 4, r9, r4.zzg) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0223, code lost:
    
        r36.zzF = true;
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0227, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x022b, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0202, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0204, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01e4, code lost:
    
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01e7, code lost:
    
        if ((r13 & 31) == 6) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0206, code lost:
    
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0235, code lost:
    
        throw com.google.android.gms.internal.ads.zzaz.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x018a, code lost:
    
        r9 = r4.zzg;
        r13 = r4.zzk;
        r9 = com.google.android.gms.internal.ads.zzfj.zzb(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0198, code lost:
    
        if ((r13 + r9) <= (r36.zzC - r36.zzD)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0236, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0239, code lost:
    
        if (r36.zzG == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x023b, code lost:
    
        r36.zzi.zzI(r9);
        r37.zzi(r36.zzi.zzN(), 0, r36.zzE);
        r8.zzr(r36.zzi, r36.zzE);
        r3 = r36.zzE;
        r5 = r36.zzi;
        r5 = com.google.android.gms.internal.ads.zzfj.zzc(r5.zzN(), r5.zze());
        r36.zzi.zzL(0);
        r36.zzi.zzK(r5);
        r5 = r4.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0272, code lost:
    
        if (r5 != (-1)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x027a, code lost:
    
        if (r36.zzp.zza() == 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x027c, code lost:
    
        r36.zzp.zze(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x028f, code lost:
    
        r36.zzp.zzb(r11, r36.zzi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x029c, code lost:
    
        if ((r2.zza() & 4) == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x029e, code lost:
    
        r36.zzp.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x02aa, code lost:
    
        r36.zzD += r3;
        r36.zzE -= r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0288, code lost:
    
        if (r36.zzp.zza() == r5) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x028a, code lost:
    
        r36.zzp.zze(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x02a4, code lost:
    
        r3 = r8.zzf(r37, r9, false);
     */
    @Override // com.google.android.gms.internal.ads.zzacv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        boolean z4;
        boolean z7;
        long zzu;
        long zzu2;
        String str;
        String str2;
        long zzu3;
        long j;
        long zzw;
        long zzw2;
        while (true) {
            int i7 = this.zzr;
            int i8 = 0;
            if (i7 == 0) {
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
                long j3 = this.zzt;
                if (j3 == 1) {
                    zzacwVar.zzi(this.zzm.zzN(), 8, 8);
                    this.zzu += 8;
                    this.zzt = this.zzm.zzw();
                } else if (j3 == 0) {
                    long zzd = zzacwVar.zzd();
                    if (zzd == -1) {
                        zzd = !this.zzn.isEmpty() ? ((zzeq) this.zzn.peek()).zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzt = (zzd - zzacwVar.zzf()) + this.zzu;
                    }
                }
                long j7 = this.zzt;
                long j8 = this.zzu;
                if (j7 < j8) {
                    throw zzaz.zzc("Atom size less than header length (unsupported).");
                }
                long zzf = zzacwVar.zzf() - j8;
                int i9 = this.zzs;
                if ((i9 == 1836019558 || i9 == 1835295092) && !this.zzK) {
                    this.zzH.zzP(new zzadt(this.zzz, zzf));
                    this.zzK = true;
                }
                if (this.zzs == 1836019558) {
                    int size = this.zzf.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        zzaiq zzaiqVar = ((zzaib) this.zzf.valueAt(i10)).zzb;
                        zzaiqVar.zzc = zzf;
                        zzaiqVar.zzb = zzf;
                    }
                }
                int i11 = this.zzs;
                if (i11 == 1835295092) {
                    this.zzB = null;
                    this.zzw = zzf + this.zzt;
                    this.zzr = 2;
                } else if (i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1836019558 || i11 == 1953653094 || i11 == 1836475768 || i11 == 1701082227) {
                    long zzf2 = (zzacwVar.zzf() + this.zzt) - 8;
                    this.zzn.push(new zzeq(i11, zzf2));
                    if (this.zzt == this.zzu) {
                        zzl(zzf2);
                    } else {
                        zzj();
                    }
                } else if (i11 == 1751411826 || i11 == 1835296868 || i11 == 1836476516 || i11 == 1936286840 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1668576371 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1937011571 || i11 == 1952867444 || i11 == 1952868452 || i11 == 1953196132 || i11 == 1953654136 || i11 == 1953658222 || i11 == 1886614376 || i11 == 1935763834 || i11 == 1935763823 || i11 == 1936027235 || i11 == 1970628964 || i11 == 1935828848 || i11 == 1936158820 || i11 == 1701606260 || i11 == 1835362404 || i11 == 1701671783) {
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
            } else if (i7 != 1) {
                long j9 = Long.MAX_VALUE;
                if (i7 != 2) {
                    zzaib zzaibVar = this.zzB;
                    if (zzaibVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zzf;
                    int size2 = sparseArray.size();
                    long j10 = Long.MAX_VALUE;
                    zzaib zzaibVar2 = null;
                    for (int i12 = 0; i12 < size2; i12++) {
                        zzaib zzaibVar3 = (zzaib) sparseArray.valueAt(i12);
                        z4 = zzaibVar3.zzm;
                        if (z4 || zzaibVar3.zzf != zzaibVar3.zzd.zzb) {
                            z7 = zzaibVar3.zzm;
                            if (!z7 || zzaibVar3.zzh != zzaibVar3.zzb.zzd) {
                                long zzd2 = zzaibVar3.zzd();
                                if (zzd2 < j10) {
                                    zzaibVar2 = zzaibVar3;
                                    j10 = zzd2;
                                }
                            }
                        }
                    }
                    if (zzaibVar2 == null) {
                        int zzf3 = (int) (this.zzw - zzacwVar.zzf());
                        if (zzf3 < 0) {
                            throw zzaz.zza("Offset to end of mdat was negative.", null);
                        }
                        zzacwVar.zzk(zzf3);
                        zzj();
                    } else {
                        int zzd3 = (int) (zzaibVar2.zzd() - zzacwVar.zzf());
                        if (zzd3 < 0) {
                            zzdq.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zzd3 = 0;
                        }
                        zzacwVar.zzk(zzd3);
                        this.zzB = zzaibVar2;
                        zzaibVar = zzaibVar2;
                    }
                } else {
                    int size3 = this.zzf.size();
                    zzaib zzaibVar4 = null;
                    for (int i13 = 0; i13 < size3; i13++) {
                        zzaiq zzaiqVar2 = ((zzaib) this.zzf.valueAt(i13)).zzb;
                        if (zzaiqVar2.zzo) {
                            long j11 = zzaiqVar2.zzc;
                            if (j11 < j9) {
                                zzaibVar4 = (zzaib) this.zzf.valueAt(i13);
                                j9 = j11;
                            }
                        }
                    }
                    if (zzaibVar4 == null) {
                        this.zzr = 3;
                    } else {
                        int zzf4 = (int) (j9 - zzacwVar.zzf());
                        if (zzf4 < 0) {
                            throw zzaz.zza("Offset to encryption data was negative.", null);
                        }
                        zzacwVar.zzk(zzf4);
                        zzaiq zzaiqVar3 = zzaibVar4.zzb;
                        zzed zzedVar2 = zzaiqVar3.zzn;
                        zzacwVar.zzi(zzedVar2.zzN(), 0, zzedVar2.zze());
                        zzaiqVar3.zzn.zzL(0);
                        zzaiqVar3.zzo = false;
                    }
                }
            } else {
                long j12 = this.zzt - this.zzu;
                zzed zzedVar3 = this.zzv;
                int i14 = (int) j12;
                if (zzedVar3 != null) {
                    zzacwVar.zzi(zzedVar3.zzN(), 8, i14);
                    zzer zzerVar = new zzer(this.zzs, zzedVar3);
                    long zzf5 = zzacwVar.zzf();
                    if (this.zzn.isEmpty()) {
                        int i15 = zzerVar.zzd;
                        if (i15 == 1936286840) {
                            zzed zzedVar4 = zzerVar.zza;
                            zzedVar4.zzL(8);
                            int zza2 = zzahw.zza(zzedVar4.zzg());
                            zzedVar4.zzM(4);
                            long zzu4 = zzedVar4.zzu();
                            if (zza2 == 0) {
                                zzw = zzedVar4.zzu();
                                zzw2 = zzedVar4.zzu();
                            } else {
                                zzw = zzedVar4.zzw();
                                zzw2 = zzedVar4.zzw();
                            }
                            long j13 = zzw2 + zzf5;
                            long zzu5 = zzen.zzu(zzw, 1000000L, zzu4, RoundingMode.DOWN);
                            zzedVar4.zzM(2);
                            int zzq = zzedVar4.zzq();
                            int[] iArr = new int[zzq];
                            long[] jArr = new long[zzq];
                            long[] jArr2 = new long[zzq];
                            long[] jArr3 = new long[zzq];
                            long j14 = zzu5;
                            int i16 = 0;
                            while (i16 < zzq) {
                                int zzg = zzedVar4.zzg();
                                if ((zzg & Integer.MIN_VALUE) != 0) {
                                    throw zzaz.zza("Unhandled indirect reference", null);
                                }
                                long zzu6 = zzedVar4.zzu();
                                iArr[i16] = zzg & f.API_PRIORITY_OTHER;
                                jArr[i16] = j13;
                                jArr3[i16] = j14;
                                long j15 = zzw + zzu6;
                                int i17 = i16;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                long zzu7 = zzen.zzu(j15, 1000000L, zzu4, RoundingMode.DOWN);
                                jArr4[i17] = zzu7 - jArr5[i17];
                                zzedVar4.zzM(4);
                                j13 += r28[i17];
                                jArr2 = jArr4;
                                zzq = zzq;
                                jArr = jArr;
                                j14 = zzu7;
                                i16 = i17 + 1;
                                iArr = iArr;
                                jArr3 = jArr5;
                                zzw = j15;
                            }
                            Pair create = Pair.create(Long.valueOf(zzu5), new zzaci(iArr, jArr, jArr2, jArr3));
                            this.zzA = ((Long) create.first).longValue();
                            this.zzH.zzP((zzadu) create.second);
                            this.zzK = true;
                        } else if (i15 == 1701671783) {
                            zzed zzedVar5 = zzerVar.zza;
                            if (this.zzI.length != 0) {
                                zzedVar5.zzL(8);
                                int zza3 = zzahw.zza(zzedVar5.zzg());
                                if (zza3 == 0) {
                                    String zzy = zzedVar5.zzy((char) 0);
                                    zzy.getClass();
                                    String zzy2 = zzedVar5.zzy((char) 0);
                                    zzy2.getClass();
                                    long zzu8 = zzedVar5.zzu();
                                    long zzu9 = zzedVar5.zzu();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    zzu = zzen.zzu(zzu9, 1000000L, zzu8, roundingMode);
                                    long j16 = this.zzA;
                                    long j17 = j16 != -9223372036854775807L ? j16 + zzu : -9223372036854775807L;
                                    zzu2 = zzen.zzu(zzedVar5.zzu(), 1000L, zzu8, roundingMode);
                                    str = zzy;
                                    str2 = zzy2;
                                    zzu3 = zzedVar5.zzu();
                                    j = j17;
                                } else if (zza3 != 1) {
                                    AbstractC0486a1.k(zza3, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                                } else {
                                    long zzu10 = zzedVar5.zzu();
                                    long zzw3 = zzedVar5.zzw();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    long zzu11 = zzen.zzu(zzw3, 1000000L, zzu10, roundingMode2);
                                    long zzu12 = zzen.zzu(zzedVar5.zzu(), 1000L, zzu10, roundingMode2);
                                    long zzu13 = zzedVar5.zzu();
                                    String zzy3 = zzedVar5.zzy((char) 0);
                                    zzy3.getClass();
                                    String zzy4 = zzedVar5.zzy((char) 0);
                                    zzy4.getClass();
                                    zzu2 = zzu12;
                                    zzu3 = zzu13;
                                    str = zzy3;
                                    str2 = zzy4;
                                    j = zzu11;
                                    zzu = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzedVar5.zzb()];
                                zzedVar5.zzH(bArr, 0, zzedVar5.zzb());
                                zzed zzedVar6 = new zzed(this.zzl.zza(new zzafr(str, str2, zzu2, zzu3, bArr)));
                                int zzb2 = zzedVar6.zzb();
                                for (zzaeb zzaebVar : this.zzI) {
                                    zzedVar6.zzL(0);
                                    zzaebVar.zzr(zzedVar6, zzb2);
                                }
                                if (j == -9223372036854775807L) {
                                    this.zzo.addLast(new zzaia(zzu, true, zzb2));
                                    this.zzx += zzb2;
                                } else if (this.zzo.isEmpty()) {
                                    for (zzaeb zzaebVar2 : this.zzI) {
                                        zzaebVar2.zzt(j, 1, zzb2, 0, null);
                                    }
                                } else {
                                    this.zzo.addLast(new zzaia(j, false, zzb2));
                                    this.zzx += zzb2;
                                }
                            }
                        }
                    } else {
                        ((zzeq) this.zzn.peek()).zzd(zzerVar);
                    }
                } else {
                    zzacwVar.zzk(i14);
                }
                zzl(zzacwVar.zzf());
            }
        }
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
            zzaeb zzw = this.zzH.zzw(i8, 3);
            zzw.zzm((zzz) this.zze.get(i9));
            this.zzJ[i9] = zzw;
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
        zzady zza2 = zzain.zza(zzacwVar);
        this.zzq = zza2 != null ? zzfwh.zzo(zza2) : zzfwh.zzn();
        return zza2 == null;
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
                zzach.zza(j, zzedVar, zzaic.this.zzJ);
            }
        });
    }
}
