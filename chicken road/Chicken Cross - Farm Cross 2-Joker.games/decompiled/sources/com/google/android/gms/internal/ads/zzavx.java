package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final /* synthetic */ class zzavx implements zzaws {
    public static final /* synthetic */ zzavx zza;
    public static final /* synthetic */ zzavx zzb;
    public static final /* synthetic */ zzavx zzc;
    public static final /* synthetic */ zzavx zzd;
    public static final /* synthetic */ zzavx zze;
    public static final /* synthetic */ zzavx zzf;
    public static final /* synthetic */ zzavx zzg;
    public static final /* synthetic */ zzavx zzh;
    public static final /* synthetic */ zzavx zzi;
    public static final /* synthetic */ zzavx zzj;
    public static final /* synthetic */ zzavx zzk;
    public static final /* synthetic */ zzavx zzl;
    public static final /* synthetic */ zzavx zzm;
    public static final /* synthetic */ zzavx zzn;
    public static final /* synthetic */ zzavx zzo;
    public static final /* synthetic */ zzavx zzp;
    public static final /* synthetic */ zzavx zzq;
    public static final /* synthetic */ zzavx zzr;
    public static final /* synthetic */ zzavx zzs;
    public static final /* synthetic */ zzavx zzt;
    public static final /* synthetic */ zzavx zzu;
    private final /* synthetic */ int zzv;

    static {
        int i = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i2 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i3 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i4 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i5 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i6 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i7 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        zzu = new zzavx((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        zzt = new zzavx((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        zzs = new zzavx((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        zzr = new zzavx(i7);
        zzq = new zzavx(i4);
        zzp = new zzavx(i5);
        zzavx zzavxVar = new zzavx(i6);
        int i8 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i9 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i10 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i11 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i12 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i13 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i14 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i15 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i16 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        zzo = zzavxVar;
        zzn = new zzavx(i3);
        zzm = new zzavx(i8);
        zzl = new zzavx(i9);
        zzk = new zzavx(i10);
        zzj = new zzavx(i2);
        zzi = new zzavx(i11);
        zzh = new zzavx(i12);
        zzg = new zzavx(i13);
        zzf = new zzavx(i);
        zze = new zzavx(i14);
        zzd = new zzavx(i15);
        zzc = new zzavx(i16);
        zzb = new zzavx(1);
        zza = new zzavx(0);
    }

    private /* synthetic */ zzavx(int i) {
        this.zzv = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzavk zzavkVar;
        zzawr zzawrVar;
        zzaxa zzb2;
        zzawr zzawrVar2;
        zzaxa zzb3;
        zzawr zzawrVar3;
        zzaxa zzb4;
        zzawr zzawrVar4;
        zzaxa zza2;
        zzavk zzavkVar2;
        zzawr zzawrVar5;
        zzaxa zzj2;
        Class<?> cls;
        zzavk zzavkVar3;
        long j = 1;
        int i = 0;
        try {
            try {
                try {
                    try {
                        switch (this.zzv) {
                            case 0:
                                zzawrVar = ((zzawv) obj).zzb;
                                zzb2 = zzaxa.zzb(zzawrVar.zzc().zzm() + zzawrVar.zzc().zzm());
                                zzawrVar.zzb(zzb2);
                                return Optional.empty();
                            case 1:
                                zzawrVar = ((zzawv) obj).zzb;
                                zzb2 = zzaxa.zzc(zzawrVar.zzc().zzq() + zzawrVar.zzc().zzq());
                                zzawrVar.zzb(zzb2);
                                return Optional.empty();
                            case 2:
                                zzawrVar = ((zzawv) obj).zzb;
                                zzb2 = zzaxa.zzd(zzawrVar.zzc().zzn().zzd(zzawrVar.zzc().zzn()));
                                zzawrVar.zzb(zzb2);
                                return Optional.empty();
                            case 3:
                                zzawv zzawvVar = (zzawv) obj;
                                try {
                                    long zze2 = zzawvVar.zzd.zze();
                                    for (long j2 = 0; j2 < zze2; j2++) {
                                        zzawvVar.zzb.zzb(zzaxa.zza(null));
                                    }
                                    return Optional.empty();
                                } catch (zzawq unused) {
                                    zzavkVar = zzavk.zza;
                                    return Optional.of(zzavkVar);
                                }
                            case 4:
                                zzawrVar2 = ((zzawv) obj).zzb;
                                zzb3 = zzaxa.zzb(zzawrVar2.zzc().zzm() & zzawrVar2.zzc().zzm());
                                zzawrVar2.zzb(zzb3);
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j3 = jArr[0];
                                long j4 = jArr[1];
                                long j5 = jArr[2];
                                long j6 = jArr[3];
                                long j7 = jArr[4];
                                long j8 = jArr[5];
                                long j9 = jArr[6];
                                long j10 = jArr[7];
                                long j11 = j9 + (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8);
                                long j12 = j10 % 102194872;
                                zzawrVar2 = ((zzawv) obj).zzb;
                                zzb3 = zzaxa.zzb(zzawrVar2.zzc().zzm() ^ (j11 ^ j12));
                                zzawrVar2.zzb(zzb3);
                                return Optional.empty();
                            case 6:
                                zzawrVar3 = ((zzawv) obj).zzb;
                                zzb4 = zzaxa.zzb(zzawrVar3.zzc().zzm() | zzawrVar3.zzc().zzm());
                                zzawrVar3.zzb(zzb4);
                                return Optional.empty();
                            case 7:
                                zzawrVar3 = ((zzawv) obj).zzb;
                                zzb4 = zzaxa.zzb(zzawrVar3.zzc().zzm() ^ zzawrVar3.zzc().zzm());
                                zzawrVar3.zzb(zzb4);
                                return Optional.empty();
                            case 8:
                                zzawv zzawvVar2 = (zzawv) obj;
                                try {
                                    long zzm2 = zzawvVar2.zzb.zzc().zzm();
                                    zzawo zzawoVar = zzawvVar2.zzc;
                                    zzawj zzawjVar = zzawvVar2.zzd;
                                    zzawoVar.zza(zzawjVar.zzb(), 0L, r2.zzb);
                                    zzawjVar.zza(zzm2);
                                    return Optional.empty();
                                } catch (zzawh | zzawi unused2) {
                                    zzavkVar = zzavk.zzr;
                                    return Optional.of(zzavkVar);
                                } catch (zzawm unused3) {
                                    zzavkVar = zzavk.zzB;
                                    return Optional.of(zzavkVar);
                                }
                            case 9:
                                zzawv zzawvVar3 = (zzawv) obj;
                                try {
                                    zzawr zzawrVar6 = zzawvVar3.zzb;
                                    long zzm3 = zzawrVar6.zzc().zzm();
                                    List zzo2 = zzawrVar6.zzc().zzo();
                                    int size = zzo2.size();
                                    Object zzh2 = zzawrVar6.zzc().zzh();
                                    Object zzl2 = zzawrVar6.zzc().zzl();
                                    if (zzl2 instanceof Method) {
                                        Method method = (Method) zzl2;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (zzh2 instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) zzh2).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                List zzo3 = ((zzaxa) zzo2.get(0)).zzo();
                                                if (zzo3.size() == length) {
                                                    for (int i2 = 0; i2 < zzo3.size(); i2++) {
                                                        objArr2[i2] = ((zzaxa) zzo3.get(i2)).zzi(parameterTypes2[i2]);
                                                    }
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                while (i < size) {
                                                    objArr[i] = ((zzaxa) zzo2.get(i)).zzi(parameterTypes[i]);
                                                    i++;
                                                }
                                            }
                                            try {
                                                Object invoke = method.invoke(zzh2, objArr);
                                                if (method.getReturnType() == Void.class || method.getReturnType() == Void.TYPE) {
                                                    zzawrVar4 = zzawvVar3.zzb;
                                                    zza2 = zzaxa.zza(null);
                                                } else if (zzm3 != 0) {
                                                    zzawrVar4 = zzawvVar3.zzb;
                                                    zza2 = zzaxa.zzg(invoke);
                                                } else {
                                                    zzawrVar4 = zzawvVar3.zzb;
                                                    zza2 = zzaxa.zza(invoke);
                                                }
                                                zzawrVar4.zzb(zza2);
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzavkVar = zzavk.zzq;
                                                return Optional.of(zzavkVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzavk.zzp);
                                } catch (zzawx unused5) {
                                    zzavkVar = zzavk.zzp;
                                }
                                break;
                            case 10:
                                int i3 = ((((~2084546560) & 73475461) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1830321789);
                                int i4 = 1073781763 % 1003463633;
                                int i5 = ((((~461273879) & 107429921) | 378966045) + ((461273879 & 283197472) | 1937909388)) - 2133058944;
                                int i6 = 1917305981 % 575705360;
                                zzawv zzawvVar4 = (zzawv) obj;
                                zzawr zzawrVar7 = zzawvVar4.zzb;
                                int intExact = Math.toIntExact(zzawrVar7.zzc().zzm());
                                zzawe zzn2 = zzawrVar7.zzc().zzn();
                                zzawe zzn3 = zzawrVar7.zzc().zzn();
                                if (zzn2.zza.length != (i3 ^ i4)) {
                                    return Optional.of(zzavk.zzH);
                                }
                                int[] iArr = new int[i5 ^ i6];
                                ByteBuffer.wrap(zzn2.zza()).asIntBuffer().get(iArr);
                                zzavw zzavwVar = new zzavw(intExact, iArr);
                                int i7 = ((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1949988574);
                                int i8 = 1527793660 % 245277883;
                                int i9 = ((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 874379764;
                                int i10 = 2026478004 % 1659239833;
                                byte[] zza3 = zzn3.zza();
                                int i11 = (((((~1787189168) & 1360184381) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1771476931) ^ (1821115873 % 1010014811);
                                byte[] bArr = new byte[i11];
                                int i12 = 0;
                                while (i12 < zza3.length) {
                                    if (i12 % i11 != 0) {
                                        if (i12 == 0) {
                                            i12 = 0;
                                        } else {
                                            int i13 = i9 ^ i10;
                                            zza3[i12] = (byte) (((zza3[i12] ^ bArr[i12 % i11]) << i13) >> i13);
                                            i12++;
                                        }
                                    }
                                    zzavwVar.zza(i12 >>> (i7 ^ i8), bArr);
                                    int i132 = i9 ^ i10;
                                    zza3[i12] = (byte) (((zza3[i12] ^ bArr[i12 % i11]) << i132) >> i132);
                                    i12++;
                                }
                                zzawe zze3 = zzawe.zze(zza3);
                                zzawrVar4 = zzawvVar4.zzb;
                                zza2 = zzaxa.zzd(zze3);
                                zzawrVar4.zzb(zza2);
                                return Optional.empty();
                            case 11:
                                zzawrVar3 = ((zzawv) obj).zzb;
                                double zzq2 = zzawrVar3.zzc().zzq();
                                double zzq3 = zzawrVar3.zzc().zzq();
                                if (zzq2 == 0.0d) {
                                    zzavkVar2 = zzavk.zzF;
                                    return Optional.of(zzavkVar2);
                                }
                                zzb4 = zzaxa.zzc(zzq3 / zzq2);
                                zzawrVar3.zzb(zzb4);
                                return Optional.empty();
                            case 12:
                                zzawrVar3 = ((zzawv) obj).zzb;
                                long zzm4 = zzawrVar3.zzc().zzm();
                                long zzm5 = zzawrVar3.zzc().zzm();
                                if (zzm4 == 0) {
                                    zzavkVar2 = zzavk.zzF;
                                    return Optional.of(zzavkVar2);
                                }
                                zzb4 = zzaxa.zzb(zzm5 / zzm4);
                                zzawrVar3.zzb(zzb4);
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzawv) obj).zzb.zzc();
                                    return Optional.empty();
                                } catch (zzawp unused6) {
                                    zzavkVar = zzavk.zzA;
                                    return Optional.of(zzavkVar);
                                }
                            case 14:
                                zzawv zzawvVar5 = (zzawv) obj;
                                long zzm6 = zzawvVar5.zzb.zzc().zzm();
                                zzawr zzawrVar8 = zzawvVar5.zzb;
                                zzawrVar8.zzb(zzaxa.zzj(zzawrVar8.zzd(zzm6)));
                                return Optional.empty();
                            case 15:
                                zzawv zzawvVar6 = (zzawv) obj;
                                long zzm7 = zzawvVar6.zzc.zzb().zzb + zzawvVar6.zzb.zzc().zzm();
                                zzawrVar5 = zzawvVar6.zzb;
                                zzj2 = zzaxa.zzj(zzawrVar5.zzd(-zzm7));
                                zzawrVar5.zzb(zzj2);
                                return Optional.empty();
                            case 16:
                                zzawv zzawvVar7 = (zzawv) obj;
                                long zze4 = zzawvVar7.zzc.zzb().zzb + zzawvVar7.zzd.zze();
                                zzawrVar5 = zzawvVar7.zzb;
                                zzj2 = zzaxa.zzj(zzawrVar5.zzd(-zze4));
                                zzawrVar5.zzb(zzj2);
                                return Optional.empty();
                            case 17:
                                try {
                                    zzawr zzawrVar9 = ((zzawv) obj).zzb;
                                    if (new zzaww(true).compare(zzawrVar9.zzc(), zzawrVar9.zzc()) != 0) {
                                        j = 0;
                                    }
                                    zzawrVar9.zzb(zzaxa.zzb(j));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzavkVar = zzavk.zzd;
                                    return Optional.of(zzavkVar);
                                }
                            case 18:
                                try {
                                    zzawr zzawrVar10 = ((zzawv) obj).zzb;
                                    String zzc2 = zzawrVar10.zzc().zzn().zzc();
                                    switch (zzc2.hashCode()) {
                                        case -1325958191:
                                            if (zzc2.equals("double")) {
                                                cls = Double.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 104431:
                                            if (zzc2.equals("int")) {
                                                cls = Integer.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3039496:
                                            if (zzc2.equals("byte")) {
                                                cls = Byte.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3052374:
                                            if (zzc2.equals("char")) {
                                                cls = Character.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3327612:
                                            if (zzc2.equals(Constants.LONG)) {
                                                cls = Long.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3625364:
                                            if (zzc2.equals("void")) {
                                                cls = Void.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 64711720:
                                            if (zzc2.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 97526364:
                                            if (zzc2.equals("float")) {
                                                cls = Float.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 109413500:
                                            if (zzc2.equals("short")) {
                                                cls = Short.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        default:
                                            cls = Class.forName(zzc2);
                                            break;
                                    }
                                    zzawrVar10.zzb(zzaxa.zza(cls));
                                    return Optional.empty();
                                } catch (zzawx unused8) {
                                    zzavkVar = zzavk.zzl;
                                    return Optional.of(zzavkVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzavkVar = zzavk.zzm;
                                    return Optional.of(zzavkVar);
                                }
                            case 19:
                                try {
                                    zzawr zzawrVar11 = ((zzawv) obj).zzb;
                                    List zzo4 = zzawrVar11.zzc().zzo();
                                    Class<?>[] clsArr = new Class[zzo4.size()];
                                    while (true) {
                                        if (i >= zzo4.size()) {
                                            String zzc3 = zzawrVar11.zzc().zzn().zzc();
                                            Object zzl3 = zzawrVar11.zzc().zzl();
                                            if (zzl3 instanceof Class) {
                                                zzawrVar11.zzb(zzaxa.zza(((Class) zzl3).getMethod(zzc3, clsArr)));
                                                break;
                                            } else {
                                                zzavkVar3 = zzavk.zzn;
                                            }
                                        } else {
                                            Object zzl4 = ((zzaxa) zzo4.get(i)).zzl();
                                            if (zzl4 instanceof Class) {
                                                clsArr[i] = (Class) zzl4;
                                                i++;
                                            } else {
                                                zzavkVar3 = zzavk.zzn;
                                            }
                                        }
                                    }
                                    return Optional.of(zzavkVar3);
                                } catch (zzawx unused10) {
                                    zzavkVar = zzavk.zzn;
                                    return Optional.of(zzavkVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzavkVar = zzavk.zzo;
                                    return Optional.of(zzavkVar);
                                } catch (SecurityException unused12) {
                                    zzavkVar = zzavk.zzC;
                                    return Optional.of(zzavkVar);
                                }
                            default:
                                int i14 = ((((~306851320) & 2040670728) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 244167092;
                                int i15 = 1764892438 % 764851988;
                                zzawr zzawrVar12 = ((zzawv) obj).zzb;
                                long zzm8 = zzawrVar12.zzc().zzm();
                                zzaxa zzc4 = zzawrVar12.zzc();
                                zzaxa zzc5 = zzawrVar12.zzc();
                                int i16 = zzc5.zza;
                                int i17 = (i14 ^ i15) + i16;
                                if (i16 == 0) {
                                    throw null;
                                }
                                if (i17 == 3) {
                                    zzawe zzn4 = zzc5.zzn();
                                    int i18 = ((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-1088446899);
                                    int i19 = 2085308422 % 531900034;
                                    if (zzm8 < 0) {
                                        zzm8 += zzn4.zza.length;
                                    }
                                    if (zzc4.zza != (i18 ^ i19)) {
                                        throw new zzawx();
                                    }
                                    if (zzm8 >= 0 && zzm8 < zzn4.zza.length) {
                                        char charAt = zzn4.zzc().charAt((int) zzm8);
                                        StringBuilder sb = new StringBuilder(String.valueOf(charAt).length());
                                        sb.append(charAt);
                                        zzc4 = zzaxa.zzd(zzawe.zzf(sb.toString()));
                                    }
                                } else {
                                    if (i17 != 4) {
                                        throw new zzawx();
                                    }
                                    List zzo5 = zzc5.zzo();
                                    if (zzm8 < 0) {
                                        zzm8 += zzo5.size();
                                    }
                                    if (zzm8 >= 0 && zzm8 < zzo5.size()) {
                                        zzc4 = (zzaxa) zzo5.get((int) zzm8);
                                    }
                                }
                                zzawrVar12.zzb(zzc4);
                                return Optional.empty();
                        }
                    } catch (zzawp unused13) {
                        zzavkVar = zzavk.zzf;
                    }
                } catch (zzawg | zzawi | zzawx unused14) {
                    zzavkVar = zzavk.zzy;
                }
            } catch (zzawq e) {
                throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzawn | zzawp unused15) {
            zzavkVar = zzavk.zzx;
        }
    }
}
