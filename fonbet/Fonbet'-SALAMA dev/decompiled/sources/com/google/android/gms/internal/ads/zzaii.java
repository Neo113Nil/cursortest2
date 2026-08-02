package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaii implements zzacv, zzadu {
    private long zzA;
    private int zzB;
    private zzagm zzC;
    private final zzajq zza;
    private final int zzb;
    private final zzed zzc;
    private final zzed zzd;
    private final zzed zze;
    private final zzed zzf;
    private final ArrayDeque zzg;
    private final zzaim zzh;
    private final List zzi;
    private zzfwh zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzed zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private long zzv;
    private zzacy zzw;
    private zzaih[] zzx;
    private long[][] zzy;
    private int zzz;

    @Deprecated
    public zzaii() {
        this(zzajq.zza, 16);
    }

    private static int zzj(int i7) {
        if (i7 != 1751476579) {
            return i7 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzair zzairVar, long j) {
        int zza = zzairVar.zza(j);
        return zza == -1 ? zzairVar.zzb(j) : zza;
    }

    private static long zzl(zzair zzairVar, long j, long j3) {
        int zzk = zzk(zzairVar, j);
        return zzk == -1 ? j3 : Math.min(zzairVar.zzc[zzk], j3);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzn(long j) {
        int i7;
        int i8;
        zzaii zzaiiVar;
        zzav zzavVar;
        long j3;
        int i9;
        List list;
        zzav zzavVar2;
        zzav zzavVar3;
        zzav zzavVar4;
        ArrayList arrayList;
        int i10;
        int i11;
        zzav zzc;
        int i12;
        zzaii zzaiiVar2 = this;
        int i13 = 0;
        int i14 = 1;
        while (!zzaiiVar2.zzg.isEmpty() && ((zzeq) zzaiiVar2.zzg.peek()).zza == j) {
            zzeq zzeqVar = (zzeq) zzaiiVar2.zzg.pop();
            if (zzeqVar.zzd == 1836019574) {
                zzeq zza = zzeqVar.zza(1835365473);
                new ArrayList();
                zzav zzb = zza != null ? zzahw.zzb(zza) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = zzaiiVar2.zzB == i14 ? i14 : i13;
                zzadj zzadjVar = new zzadj();
                zzer zzb2 = zzeqVar.zzb(1969517665);
                if (zzb2 != null) {
                    zzav zzc2 = zzahw.zzc(zzb2);
                    zzadjVar.zzb(zzc2);
                    zzavVar = zzc2;
                } else {
                    zzavVar = null;
                }
                zzer zzb3 = zzeqVar.zzb(1836476516);
                zzb3.getClass();
                zzau[] zzauVarArr = new zzau[i14];
                zzauVarArr[i13] = zzahw.zzd(zzb3.zza);
                zzav zzavVar5 = new zzav(-9223372036854775807L, zzauVarArr);
                int i15 = i14 != (zzaiiVar2.zzb & i14) ? i13 : i14;
                ArrayList arrayList3 = arrayList2;
                zzav zzavVar6 = zzavVar5;
                zzav zzavVar7 = zzavVar;
                List zzf = zzahw.zzf(zzeqVar, zzadjVar, -9223372036854775807L, null, i15, z4, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzaig
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        return (zzaio) obj;
                    }
                });
                String zza2 = zzaif.zza(zzf);
                long j7 = -9223372036854775807L;
                int i16 = 0;
                int i17 = 0;
                int i18 = -1;
                while (true) {
                    j3 = 0;
                    if (i16 >= zzf.size()) {
                        break;
                    }
                    zzair zzairVar = (zzair) zzf.get(i16);
                    if (zzairVar.zzb == 0) {
                        i10 = i14;
                        list = zzf;
                        i9 = i16;
                        zzavVar3 = zzavVar7;
                        zzavVar4 = zzavVar6;
                        arrayList = arrayList3;
                    } else {
                        zzaio zzaioVar = zzairVar.zza;
                        int i19 = i17 + 1;
                        zzaih zzaihVar = new zzaih(zzaioVar, zzairVar, zzaiiVar2.zzw.zzw(i17, zzaioVar.zzb));
                        i9 = i16;
                        long j8 = zzaioVar.zze;
                        if (j8 == -9223372036854775807L) {
                            j8 = zzairVar.zzh;
                        }
                        zzaihVar.zzc.zzl(j8);
                        long max = Math.max(j7, j8);
                        list = zzf;
                        int i20 = "audio/true-hd".equals(zzaioVar.zzg.zzo) ? zzairVar.zze * 16 : zzairVar.zze + 30;
                        zzx zzb4 = zzaioVar.zzg.zzb();
                        zzb4.zzT(i20);
                        if (zzaioVar.zzb == 2) {
                            zzz zzzVar = zzaioVar.zzg;
                            int i21 = zzaiiVar2.zzb;
                            int i22 = zzzVar.zzf;
                            if ((i21 & 8) != 0) {
                                i22 |= i18 == -1 ? 1 : 2;
                            }
                            if (zzzVar.zzx == -1.0f && j8 > 0 && (i12 = zzairVar.zzb) > 0) {
                                zzb4.zzK(i12 / (j8 / 1000000.0f));
                            }
                            zzb4.zzab(i22);
                        }
                        if (zzaioVar.zzb == 1 && zzadjVar.zza()) {
                            zzb4.zzI(zzadjVar.zza);
                            zzb4.zzJ(zzadjVar.zzb);
                        }
                        int i23 = zzaioVar.zzb;
                        if (zzaiiVar2.zzi.isEmpty()) {
                            zzavVar3 = zzavVar7;
                            zzavVar2 = null;
                        } else {
                            zzavVar2 = new zzav(zzaiiVar2.zzi);
                            zzavVar3 = zzavVar7;
                        }
                        zzav[] zzavVarArr = {zzavVar2, zzavVar3, zzavVar6};
                        zzavVar4 = zzavVar6;
                        zzav zzavVar8 = new zzav(-9223372036854775807L, new zzau[0]);
                        if (zzb != null) {
                            int i24 = 0;
                            while (i24 < zzb.zza()) {
                                zzau zzb5 = zzb.zzb(i24);
                                if (zzb5 instanceof zzep) {
                                    zzep zzepVar = (zzep) zzb5;
                                    if (!zzepVar.zza.equals("com.android.capture.fps")) {
                                        i11 = 1;
                                        zzc = zzavVar8.zzc(zzepVar);
                                    } else if (i23 == 2) {
                                        i11 = 1;
                                        zzc = zzavVar8.zzc(zzepVar);
                                    } else {
                                        i11 = 1;
                                    }
                                    zzavVar8 = zzc;
                                } else {
                                    i11 = 1;
                                }
                                i24 += i11;
                            }
                        }
                        for (int i25 = 0; i25 < 3; i25++) {
                            zzavVar8 = zzavVar8.zzd(zzavVarArr[i25]);
                        }
                        if (zzavVar8.zza() > 0) {
                            zzb4.zzW(zzavVar8);
                        }
                        zzb4.zzE(zza2);
                        zzaihVar.zzc.zzm(zzb4.zzaj());
                        if (zzaioVar.zzb == 2 && i18 == -1) {
                            i18 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzaihVar);
                        i17 = i19;
                        j7 = max;
                        i10 = 1;
                    }
                    i16 = i9 + 1;
                    zzaiiVar2 = this;
                    arrayList3 = arrayList;
                    i14 = i10;
                    zzavVar6 = zzavVar4;
                    zzf = list;
                    zzavVar7 = zzavVar3;
                }
                zzaiiVar = zzaiiVar2;
                zzaiiVar.zzz = i18;
                zzaiiVar.zzA = j7;
                zzaih[] zzaihVarArr = (zzaih[]) arrayList3.toArray(new zzaih[0]);
                zzaiiVar.zzx = zzaihVarArr;
                int length = zzaihVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i26 = 0; i26 < zzaihVarArr.length; i26++) {
                    jArr[i26] = new long[zzaihVarArr[i26].zzb.zzb];
                    jArr2[i26] = zzaihVarArr[i26].zzb.zzf[0];
                }
                i7 = 0;
                int i27 = 0;
                while (i27 < zzaihVarArr.length) {
                    long j9 = Long.MAX_VALUE;
                    int i28 = -1;
                    for (int i29 = 0; i29 < zzaihVarArr.length; i29++) {
                        if (!zArr[i29]) {
                            long j10 = jArr2[i29];
                            if (j10 <= j9) {
                                i28 = i29;
                                j9 = j10;
                            }
                        }
                    }
                    int i30 = iArr[i28];
                    long[] jArr3 = jArr[i28];
                    jArr3[i30] = j3;
                    zzair zzairVar2 = zzaihVarArr[i28].zzb;
                    j3 += zzairVar2.zzd[i30];
                    int i31 = i30 + 1;
                    iArr[i28] = i31;
                    if (i31 < jArr3.length) {
                        jArr2[i28] = zzairVar2.zzf[i31];
                    } else {
                        zArr[i28] = true;
                        i27++;
                    }
                }
                i8 = 1;
                zzaiiVar.zzy = jArr;
                zzaiiVar.zzw.zzG();
                zzaiiVar.zzw.zzP(zzaiiVar);
                zzaiiVar.zzg.clear();
                zzaiiVar.zzk = 2;
            } else {
                i7 = i13;
                i8 = i14;
                zzaiiVar = zzaiiVar2;
                if (!zzaiiVar.zzg.isEmpty()) {
                    ((zzeq) zzaiiVar.zzg.peek()).zzc(zzeqVar);
                }
            }
            zzaiiVar2 = zzaiiVar;
            i13 = i7;
            i14 = i8;
        }
        if (zzaiiVar2.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0017, code lost:
    
        if (r6 == r5) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x024b, code lost:
    
        r5 = r33.zzm - r33.zzn;
        r8 = r34.zzf() + r5;
        r3 = r33.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0259, code lost:
    
        if (r3 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025b, code lost:
    
        r34.zzi(r3.zzN(), r33.zzn, (int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0267, code lost:
    
        if (r33.zzl != 1718909296) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0269, code lost:
    
        r33.zzu = true;
        r3.zzL(8);
        r5 = zzj(r3.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0277, code lost:
    
        if (r5 == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x027a, code lost:
    
        r3.zzM(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0282, code lost:
    
        if (r3.zzb() <= 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0284, code lost:
    
        r5 = zzj(r3.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028c, code lost:
    
        if (r5 == 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028f, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0290, code lost:
    
        r33.zzB = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0292, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ce, code lost:
    
        zzn(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d1, code lost:
    
        if (r3 == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02d6, code lost:
    
        if (r33.zzk == 2) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d8, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x029a, code lost:
    
        if (r33.zzg.isEmpty() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029c, code lost:
    
        ((com.google.android.gms.internal.ads.zzeq) r33.zzg.peek()).zzd(new com.google.android.gms.internal.ads.zzer(r33.zzl, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02b1, code lost:
    
        if (r33.zzu != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b8, code lost:
    
        if (r33.zzl != 1835295092) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ba, code lost:
    
        r33.zzB = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02bf, code lost:
    
        if (r5 >= 262144) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c1, code lost:
    
        r34.zzk((int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c6, code lost:
    
        r35.zza = r34.zzf() + r5;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0019, code lost:
    
        if (r6 == 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x001b, code lost:
    
        r33.zzh.zza(r34, r35, r33.zzi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0026, code lost:
    
        if (r35.zza != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0028, code lost:
    
        zzm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x002b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x002c, code lost:
    
        r6 = r34.zzf();
        r14 = r33.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0032, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0034, code lost:
    
        r21 = r5;
        r28 = r21;
        r26 = -1;
        r27 = -1;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0048, code lost:
    
        r3 = r33.zzx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x004b, code lost:
    
        if (r14 >= r3.length) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x004d, code lost:
    
        r3 = r3[r14];
        r8 = r3.zze;
        r3 = r3.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0055, code lost:
    
        if (r8 != r3.zzb) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0058, code lost:
    
        r29 = r3.zzc[r8];
        r3 = r33.zzy;
        r12 = com.google.android.gms.internal.ads.zzen.zza;
        r31 = r3[r14][r8];
        r29 = r29 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0068, code lost:
    
        if (r29 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x006c, code lost:
    
        if (r29 < 262144) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0070, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0071, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0073, code lost:
    
        if (r28 != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0075, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0079, code lost:
    
        if (r3 != r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x007d, code lost:
    
        if (r29 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0088, code lost:
    
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x008c, code lost:
    
        if (r31 >= r19) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x008e, code lost:
    
        r21 = r3;
        r26 = r14;
        r19 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0094, code lost:
    
        r14 = r14 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x007f, code lost:
    
        r28 = r3;
        r27 = r14;
        r24 = r29;
        r22 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0077, code lost:
    
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x006e, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0098, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x009a, code lost:
    
        if (r21 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00a3, code lost:
    
        if (r22 < (r19 + io.sentry.SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00a5, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00aa, code lost:
    
        r33.zzp = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00ac, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00a8, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00b1, code lost:
    
        r3 = r33.zzx[r14];
        r8 = r3.zzc;
        r12 = r3.zze;
        r14 = r3.zzb;
        r4 = r14.zzc[r12] + r33.zzv;
        r14 = r14.zzd[r12];
        r13 = r3.zzd;
        r6 = (r4 - r6) + r33.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00d3, code lost:
    
        if (r6 < 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00d7, code lost:
    
        if (r6 < 262144) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00e2, code lost:
    
        if (r3.zza.zzh != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00e4, code lost:
    
        r6 = r6 + 8;
        r14 = r14 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00e9, code lost:
    
        r34.zzk((int) r6);
        r4 = r3.zza.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00f9, code lost:
    
        if (java.util.Objects.equals(r4.zzo, "video/avc") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00fb, code lost:
    
        java.util.Objects.equals(r4.zzo, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0102, code lost:
    
        r33.zzt = true;
        r4 = r3.zza;
        r5 = r4.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0109, code lost:
    
        if (r5 == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x010b, code lost:
    
        r4 = r33.zzd.zzN();
        r4[0] = 0;
        r4[1] = 0;
        r4[2] = 0;
        r5 = 4 - r5;
        r14 = r14 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x011f, code lost:
    
        if (r33.zzr >= r14) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0121, code lost:
    
        r2 = r33.zzs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0123, code lost:
    
        if (r2 != 0) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0199, code lost:
    
        r2 = r8.zzf(r34, r2, false);
        r33.zzq += r2;
        r33.zzr += r2;
        r33.zzs -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0125, code lost:
    
        r2 = r3.zza;
        r6 = r2.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x012b, code lost:
    
        if (r33.zzt != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x013d, code lost:
    
        if ((com.google.android.gms.internal.ads.zzfj.zzb(r2.zzg) + r6) > (r3.zzb.zzd[r12] - r33.zzq)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x013f, code lost:
    
        r2 = com.google.android.gms.internal.ads.zzfj.zzb(r3.zza.zzg);
        r6 = r3.zza.zzk + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x014e, code lost:
    
        r34.zzi(r4, r5, r6);
        r33.zzq += r6;
        r33.zzd.zzL(0);
        r6 = r33.zzd.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0162, code lost:
    
        if (r6 < 0) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0164, code lost:
    
        r33.zzs = r6 - r2;
        r33.zzc.zzL(0);
        r8.zzr(r33.zzc, 4);
        r33.zzr += 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0177, code lost:
    
        if (r2 <= 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0179, code lost:
    
        r8.zzr(r33.zzd, r2);
        r33.zzr += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x018b, code lost:
    
        if (com.google.android.gms.internal.ads.zzfj.zzj(r4, 4, r2, r3.zza.zzg) == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x018d, code lost:
    
        r33.zzt = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0198, code lost:
    
        throw com.google.android.gms.internal.ads.zzaz.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x014d, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01f3, code lost:
    
        r1 = r3.zzb;
        r4 = r1.zzf[r12];
        r1 = r1.zzg[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01ff, code lost:
    
        if (r33.zzt != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0201, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0204, code lost:
    
        if (r13 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0206, code lost:
    
        r13.zzc(r8, r4, r1, r14, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x021d, code lost:
    
        if ((r12 + 1) != r3.zzb.zzb) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x021f, code lost:
    
        r13.zza(r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0233, code lost:
    
        r3.zze++;
        r33.zzp = -1;
        r33.zzq = 0;
        r33.zzr = 0;
        r33.zzs = 0;
        r33.zzt = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0224, code lost:
    
        r8.zzt(r4, r1, r14, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x01b9, code lost:
    
        if ("audio/ac4".equals(r4.zzg.zzo) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x01bd, code lost:
    
        if (r33.zzr != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x01bf, code lost:
    
        com.google.android.gms.internal.ads.zzaby.zzc(r14, r33.zze);
        r4 = 7;
        r8.zzr(r33.zze, 7);
        r33.zzr += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x01d1, code lost:
    
        r14 = r14 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x01d8, code lost:
    
        r2 = r33.zzr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x01da, code lost:
    
        if (r2 >= r14) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x01dc, code lost:
    
        r2 = r8.zzf(r34, r14 - r2, false);
        r33.zzq += r2;
        r33.zzr += r2;
        r33.zzs -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01d0, code lost:
    
        r4 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01d3, code lost:
    
        if (r13 == null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01d5, code lost:
    
        r13.zzd(r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0247, code lost:
    
        r35.zza = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x024a, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v40 */
    @Override // com.google.android.gms.internal.ads.zzacv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        boolean z4;
        while (true) {
            ?? r52 = 1;
            while (true) {
                int i7 = this.zzk;
                if (i7 != 0) {
                    break;
                }
                boolean z7 = r52;
                if (this.zzn == 0) {
                    if (!zzacwVar.zzn(this.zzf.zzN(), 0, 8, z7)) {
                        if (this.zzB != 2 || (this.zzb & 2) == 0) {
                            return -1;
                        }
                        zzaeb zzw = this.zzw.zzw(0, 4);
                        zzagm zzagmVar = this.zzC;
                        zzav zzavVar = zzagmVar == null ? null : new zzav(-9223372036854775807L, zzagmVar);
                        zzx zzxVar = new zzx();
                        zzxVar.zzW(zzavVar);
                        zzw.zzm(zzxVar.zzaj());
                        this.zzw.zzG();
                        this.zzw.zzP(new zzadt(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzn = 8;
                    this.zzf.zzL(0);
                    this.zzm = this.zzf.zzu();
                    this.zzl = this.zzf.zzg();
                }
                long j = this.zzm;
                if (j == 1) {
                    zzacwVar.zzi(this.zzf.zzN(), 8, 8);
                    this.zzn += 8;
                    this.zzm = this.zzf.zzw();
                } else if (j == 0) {
                    long zzd = zzacwVar.zzd();
                    if (zzd == -1) {
                        zzeq zzeqVar = (zzeq) this.zzg.peek();
                        zzd = zzeqVar != null ? zzeqVar.zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzm = (zzd - zzacwVar.zzf()) + this.zzn;
                    }
                }
                long j3 = this.zzm;
                int i8 = this.zzn;
                if (j3 < i8) {
                    throw zzaz.zzc("Atom size less than header length (unsupported).");
                }
                int i9 = this.zzl;
                if (i9 == 1836019574 || i9 == 1953653099 || i9 == 1835297121 || i9 == 1835626086 || i9 == 1937007212 || i9 == 1701082227 || i9 == 1835365473 || i9 == 1635284069) {
                    z4 = true;
                    long zzf = zzacwVar.zzf();
                    long j7 = this.zzm;
                    long j8 = zzf + j7;
                    long j9 = this.zzn;
                    if (j7 != j9 && this.zzl == 1835365473) {
                        this.zze.zzI(8);
                        zzacwVar.zzh(this.zze.zzN(), 0, 8);
                        zzahw.zzg(this.zze);
                        zzacwVar.zzk(this.zze.zzd());
                        zzacwVar.zzj();
                    }
                    long j10 = j8 - j9;
                    this.zzg.push(new zzeq(this.zzl, j10));
                    if (this.zzm == this.zzn) {
                        zzn(j10);
                    } else {
                        zzm();
                    }
                } else if (i9 == 1835296868 || i9 == 1836476516 || i9 == 1751411826 || i9 == 1937011556 || i9 == 1937011827 || i9 == 1937011571 || i9 == 1668576371 || i9 == 1701606260 || i9 == 1937011555 || i9 == 1937011578 || i9 == 1937013298 || i9 == 1937007471 || i9 == 1668232756 || i9 == 1953196132 || i9 == 1718909296 || i9 == 1969517665 || i9 == 1801812339 || i9 == 1768715124) {
                    zzcv.zzf(i8 == 8);
                    zzcv.zzf(this.zzm <= 2147483647L);
                    zzed zzedVar = new zzed((int) this.zzm);
                    System.arraycopy(this.zzf.zzN(), 0, zzedVar.zzN(), 0, 8);
                    this.zzo = zzedVar;
                    z4 = true;
                    this.zzk = 1;
                } else {
                    long zzf2 = zzacwVar.zzf();
                    long j11 = this.zzn;
                    long j12 = zzf2 - j11;
                    if (this.zzl == 1836086884) {
                        this.zzC = new zzagm(0L, j12, -9223372036854775807L, j12 + j11, this.zzm - j11);
                    }
                    this.zzo = null;
                    z4 = true;
                    this.zzk = 1;
                }
                r52 = z4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        if ((this.zzb & 16) == 0) {
            zzacyVar = new zzajt(zzacyVar, this.zza);
        }
        this.zzw = zzacyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = false;
        if (j == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (zzaih zzaihVar : this.zzx) {
            zzair zzairVar = zzaihVar.zzb;
            int zza = zzairVar.zza(j3);
            if (zza == -1) {
                zza = zzairVar.zzb(j3);
            }
            zzaihVar.zze = zza;
            zzaec zzaecVar = zzaihVar.zzd;
            if (zzaecVar != null) {
                zzaecVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        long j3;
        long j7;
        int zzb;
        zzaih[] zzaihVarArr = this.zzx;
        if (zzaihVarArr.length == 0) {
            zzadv zzadvVar = zzadv.zza;
            return new zzads(zzadvVar, zzadvVar);
        }
        int i7 = this.zzz;
        long j8 = -1;
        if (i7 != -1) {
            zzair zzairVar = zzaihVarArr[i7].zzb;
            int zzk = zzk(zzairVar, j);
            if (zzk == -1) {
                zzadv zzadvVar2 = zzadv.zza;
                return new zzads(zzadvVar2, zzadvVar2);
            }
            long j9 = zzairVar.zzf[zzk];
            j3 = zzairVar.zzc[zzk];
            if (j9 >= j || zzk >= zzairVar.zzb - 1 || (zzb = zzairVar.zzb(j)) == -1 || zzb == zzk) {
                j7 = -9223372036854775807L;
            } else {
                j7 = zzairVar.zzf[zzb];
                j8 = zzairVar.zzc[zzb];
            }
            j = j9;
        } else {
            j3 = Long.MAX_VALUE;
            j7 = -9223372036854775807L;
        }
        int i8 = 0;
        while (true) {
            zzaih[] zzaihVarArr2 = this.zzx;
            if (i8 >= zzaihVarArr2.length) {
                break;
            }
            if (i8 != this.zzz) {
                zzair zzairVar2 = zzaihVarArr2[i8].zzb;
                long zzl = zzl(zzairVar2, j, j3);
                if (j7 != -9223372036854775807L) {
                    j8 = zzl(zzairVar2, j7, j8);
                }
                j3 = zzl;
            }
            i8++;
        }
        zzadv zzadvVar3 = new zzadv(j, j3);
        return j7 == -9223372036854775807L ? new zzads(zzadvVar3, zzadvVar3) : new zzads(zzadvVar3, new zzadv(j7, j8));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        zzady zzb = zzain.zzb(zzacwVar, (this.zzb & 2) != 0);
        this.zzj = zzb != null ? zzfwh.zzo(zzb) : zzfwh.zzn();
        return zzb == null;
    }

    public zzaii(zzajq zzajqVar, int i7) {
        this.zza = zzajqVar;
        this.zzb = i7;
        this.zzj = zzfwh.zzn();
        this.zzk = (i7 & 4) != 0 ? 3 : 0;
        this.zzh = new zzaim();
        this.zzi = new ArrayList();
        this.zzf = new zzed(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzed(zzfj.zza);
        this.zzd = new zzed(6);
        this.zze = new zzed();
        this.zzp = -1;
        this.zzw = zzacy.zza;
        this.zzx = new zzaih[0];
    }
}
