package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final /* synthetic */ class zzavy implements zzaws {
    public static final /* synthetic */ zzavy zza;
    public static final /* synthetic */ zzavy zzb;
    public static final /* synthetic */ zzavy zzc;
    public static final /* synthetic */ zzavy zzd;
    public static final /* synthetic */ zzavy zze;
    public static final /* synthetic */ zzavy zzf;
    public static final /* synthetic */ zzavy zzg;
    public static final /* synthetic */ zzavy zzh;
    public static final /* synthetic */ zzavy zzi;
    public static final /* synthetic */ zzavy zzj;
    public static final /* synthetic */ zzavy zzk;
    public static final /* synthetic */ zzavy zzl;
    public static final /* synthetic */ zzavy zzm;
    public static final /* synthetic */ zzavy zzn;
    public static final /* synthetic */ zzavy zzo;
    public static final /* synthetic */ zzavy zzp;
    public static final /* synthetic */ zzavy zzq;
    public static final /* synthetic */ zzavy zzr;
    public static final /* synthetic */ zzavy zzs;
    public static final /* synthetic */ zzavy zzt;
    public static final /* synthetic */ zzavy zzu;
    private final /* synthetic */ int zzv;

    static {
        int i = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i2 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i3 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i4 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i5 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i6 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i7 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        zzu = new zzavy((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        zzt = new zzavy((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        zzs = new zzavy((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        zzr = new zzavy(i7);
        zzq = new zzavy(i4);
        zzp = new zzavy(i5);
        zzavy zzavyVar = new zzavy(i6);
        int i8 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i9 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i10 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i11 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i12 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i13 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i14 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i15 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i16 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        zzo = zzavyVar;
        zzn = new zzavy(i3);
        zzm = new zzavy(i8);
        zzl = new zzavy(i9);
        zzk = new zzavy(i10);
        zzj = new zzavy(i2);
        zzi = new zzavy(i11);
        zzh = new zzavy(i12);
        zzg = new zzavy(i13);
        zzf = new zzavy(i);
        zze = new zzavy(i14);
        zzd = new zzavy(i15);
        zzc = new zzavy(i16);
        zzb = new zzavy(1);
        zza = new zzavy(0);
    }

    private /* synthetic */ zzavy(int i) {
        this.zzv = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzavk zzavkVar;
        String str;
        long zzm2;
        zzawj zzawjVar;
        zzavk zzavkVar2;
        long j = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.zzv) {
                                            case 0:
                                                zzawv zzawvVar = (zzawv) obj;
                                                zzawr zzawrVar = zzawvVar.zzb;
                                                zzm2 = zzawrVar.zzc().zzm();
                                                if (zzawrVar.zzc().zzm() != 0) {
                                                    zzawjVar = zzawvVar.zzd;
                                                    zzawjVar.zza(zzm2);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    zzawr zzawrVar2 = ((zzawv) obj).zzb;
                                                    long zzm3 = zzawrVar2.zzc().zzm();
                                                    zzaxa zzc2 = zzawrVar2.zzc();
                                                    zzaxa zzc3 = zzawrVar2.zzc();
                                                    List zzo2 = zzc3.zzo();
                                                    if (zzm3 < 0) {
                                                        zzm3 += zzo2.size() + 1;
                                                    }
                                                    if (zzm3 < 0 || zzm3 >= zzo2.size() + 1) {
                                                        throw new zzawy();
                                                    }
                                                    zzo2.add((int) zzm3, zzc2);
                                                    zzawrVar2.zzb(zzc3);
                                                    return Optional.empty();
                                                } catch (zzawy unused) {
                                                    zzavkVar = zzavk.zzI;
                                                    return Optional.of(zzavkVar);
                                                }
                                            case 2:
                                                zzawv zzawvVar2 = (zzawv) obj;
                                                zzawr zzawrVar3 = zzawvVar2.zzb;
                                                zzm2 = zzawrVar3.zzc().zzm();
                                                if (zzawrVar3.zzc().zzm() == 0) {
                                                    zzawjVar = zzawvVar2.zzd;
                                                    zzawjVar.zza(zzm2);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((zzawv) obj).zzb.zzb(zzaxa.zzb(r0.zzc().zzo().size()));
                                                return Optional.empty();
                                            case 4:
                                                ((zzawv) obj).zzb.zzb(zzaxa.zzb(r0.zzc().zzn().zza.length));
                                                return Optional.empty();
                                            case 5:
                                                zzawr zzawrVar4 = ((zzawv) obj).zzb;
                                                zzawrVar4.zzb(zzaxa.zzc(Math.log(zzawrVar4.zzc().zzq())));
                                                return Optional.empty();
                                            case 6:
                                                zzawr zzawrVar5 = ((zzawv) obj).zzb;
                                                long zzm4 = zzawrVar5.zzc().zzm();
                                                long zzm5 = zzawrVar5.zzc().zzm();
                                                if (zzm4 == 0 || zzm5 == 0) {
                                                    j = 0;
                                                }
                                                zzawrVar5.zzb(zzaxa.zzb(j));
                                                return Optional.empty();
                                            case 7:
                                                zzawr zzawrVar6 = ((zzawv) obj).zzb;
                                                if (zzawrVar6.zzc().zzm() != 0) {
                                                    j = 0;
                                                }
                                                zzawrVar6.zzb(zzaxa.zzb(j));
                                                return Optional.empty();
                                            case 8:
                                                zzawr zzawrVar7 = ((zzawv) obj).zzb;
                                                long zzm6 = zzawrVar7.zzc().zzm();
                                                long zzm7 = zzawrVar7.zzc().zzm();
                                                if (zzm6 == 0 && zzm7 == 0) {
                                                    j = 0;
                                                }
                                                zzawrVar7.zzb(zzaxa.zzb(j));
                                                return Optional.empty();
                                            case 9:
                                                zzawv zzawvVar3 = (zzawv) obj;
                                                zzawr zzawrVar8 = zzawvVar3.zzb;
                                                try {
                                                    int compare = new zzaww(false).compare(zzawrVar8.zzc(), zzawrVar8.zzc());
                                                    zzawr zzawrVar9 = zzawvVar3.zzb;
                                                    if (compare >= 0) {
                                                        j = 0;
                                                    }
                                                    zzawrVar9.zzb(zzaxa.zzb(j));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(zzavk.zzd);
                                                }
                                            case 10:
                                                int[] iArr = {1944216249, 348137722, 926438168, 13122018, 1882968836, -1273372307, 246144337, 1723705710, 1677157265};
                                                int i = iArr[0];
                                                int i2 = iArr[1];
                                                int i3 = iArr[2];
                                                int i4 = iArr[3];
                                                int i5 = iArr[4];
                                                int i6 = iArr[5];
                                                int i7 = iArr[6];
                                                int i8 = iArr[7];
                                                int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
                                                int i10 = i8 % 1677157265;
                                                zzawv zzawvVar4 = (zzawv) obj;
                                                try {
                                                    zzawr zzawrVar10 = zzawvVar4.zzb;
                                                    long zzm8 = zzawrVar10.zzc().zzm();
                                                    zzavq zzavqVar = zzawvVar4.zza;
                                                    zzawr zzawrVar11 = new zzawr(i10 ^ i9);
                                                    for (int i11 = 0; i11 < zzawrVar10.zzb; i11++) {
                                                        try {
                                                            zzawrVar11.zzb(zzaxa.zzj((zzaxa) zzawrVar10.zza.get(i11)));
                                                        } catch (zzawq e) {
                                                            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
                                                        }
                                                    }
                                                    zzawj zzawjVar2 = zzawvVar4.zzd;
                                                    new zzawv(zzavqVar, zzawrVar11, new zzawj(zzawjVar2.zzb, zzawjVar2.zza, zzawjVar2.zzc.zzc(), zzawjVar2.zzd)).zzd.zza(zzm8);
                                                    zzawrVar10.zzb(zzaxa.zza(new zzawa()));
                                                    return Optional.empty();
                                                } catch (zzawh | zzawi unused3) {
                                                    zzavkVar = zzavk.zzt;
                                                    return Optional.of(zzavkVar);
                                                }
                                            case 11:
                                                try {
                                                    zzawr zzawrVar12 = ((zzawv) obj).zzb;
                                                    zzawrVar12.zzb(zzaxa.zza(zzawrVar12.zzc().zzi((Class) zzawrVar12.zzc().zzl())));
                                                    return Optional.empty();
                                                } catch (zzawx unused4) {
                                                    zzavkVar = zzavk.zzp;
                                                    return Optional.of(zzavkVar);
                                                }
                                            case 12:
                                                zzawr zzawrVar13 = ((zzawv) obj).zzb;
                                                long zzm9 = zzawrVar13.zzc().zzm();
                                                long zzm10 = zzawrVar13.zzc().zzm();
                                                if (zzm9 == 0) {
                                                    return Optional.of(zzavk.zzF);
                                                }
                                                zzawrVar13.zzb(zzaxa.zzb(zzm10 % zzm9));
                                                return Optional.empty();
                                            case 13:
                                                zzawr zzawrVar14 = ((zzawv) obj).zzb;
                                                zzawrVar14.zzb(zzaxa.zzc(zzawrVar14.zzc().zzq() * zzawrVar14.zzc().zzq()));
                                                return Optional.empty();
                                            case 14:
                                                zzawr zzawrVar15 = ((zzawv) obj).zzb;
                                                zzawrVar15.zzb(zzaxa.zzb(zzawrVar15.zzc().zzm() * zzawrVar15.zzc().zzm()));
                                                return Optional.empty();
                                            case 15:
                                                zzawr zzawrVar16 = ((zzawv) obj).zzb;
                                                long zzm11 = zzawrVar16.zzc().zzm();
                                                ArrayList arrayList = new ArrayList();
                                                for (long j2 = 0; j2 < zzm11; j2++) {
                                                    arrayList.add(zzawrVar16.zzc());
                                                }
                                                Collections.reverse(arrayList);
                                                zzawrVar16.zzb(zzaxa.zze(arrayList));
                                                return Optional.empty();
                                            case 16:
                                                zzawr zzawrVar17 = ((zzawv) obj).zzb;
                                                zzawrVar17.zzb(zzaxa.zzc(Math.pow(zzawrVar17.zzc().zzq(), zzawrVar17.zzc().zzq())));
                                                return Optional.empty();
                                            case 17:
                                                ((zzawv) obj).zzb.zzb(zzaxa.zza(null));
                                                return Optional.empty();
                                            case 18:
                                                zzawv zzawvVar5 = (zzawv) obj;
                                                ByteBuffer wrap = ByteBuffer.wrap(zzawvVar5.zzd.zzf((((((~1201162069L) & 403189074) | 1043752718) + ((1201162069 & 95979632) | 900760100)) - 1766798336) ^ (507611410 % 329370448)).zza());
                                                wrap.order(ByteOrder.LITTLE_ENDIAN);
                                                zzawvVar5.zzb.zzb(zzaxa.zzc(Double.longBitsToDouble(wrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                zzawv zzawvVar6 = (zzawv) obj;
                                                zzawvVar6.zzb.zzb(zzaxa.zzb(zzawvVar6.zzd.zze()));
                                                return Optional.empty();
                                            default:
                                                long j3 = ((((~346030096L) & 203234088) | 575197286) + ((346030096 & 2352425736L) | 2745332883L)) - 1505840317;
                                                long j4 = 1246101662 % 372004513;
                                                long j5 = ((((~1810821955L) & 1747262537) | 563863662) + ((1810821955 & 1295301633) | 94020008)) - 1690999106;
                                                long j6 = 1675644664 % 749217043;
                                                zzawv zzawvVar7 = (zzawv) obj;
                                                zzawj zzawjVar3 = zzawvVar7.zzd;
                                                str = "CEiv6BFfPnitUE+D";
                                                try {
                                                    long zze2 = zzawjVar3.zze();
                                                    if (zze2 >= 0 && zze2 <= (j3 ^ j4)) {
                                                        if (((j5 ^ j6) & zze2) != 0) {
                                                            zzavkVar2 = zzavk.zze;
                                                            return Optional.of(zzavkVar2);
                                                        }
                                                        zzawvVar7.zzb.zzb(zzaxa.zzd(zzawjVar3.zzf(zze2)));
                                                        return Optional.empty();
                                                    }
                                                    zzavkVar2 = zzavk.zzz;
                                                    return Optional.of(zzavkVar2);
                                                } catch (zzawh e2) {
                                                    e = e2;
                                                    throw new AssertionError(zzawc.zza(str), e);
                                                }
                                        }
                                    } catch (zzawp unused5) {
                                        zzavkVar = zzavk.zzx;
                                    }
                                } catch (zzawh | zzawi unused6) {
                                    zzavkVar = zzavk.zzi;
                                }
                            } catch (zzawi unused7) {
                                zzavkVar = zzavk.zzz;
                            }
                        } catch (zzawh e3) {
                            e = e3;
                            str = "CEiv6BFfPnitUE+D";
                            throw new AssertionError(zzawc.zza(str), e);
                        }
                    } catch (zzawq unused8) {
                        zzavkVar = zzavk.zza;
                    }
                } catch (zzawg unused9) {
                    zzavkVar = zzavk.zzD;
                }
            } catch (zzawx unused10) {
                zzavkVar = zzavk.zzy;
            }
        } catch (zzawq e4) {
            e = e4;
            str = "CEiv6BFfPnitUE+D";
            throw new AssertionError(zzawc.zza(str), e);
        }
    }
}
