package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.compose.material.MenuKt;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.nearby.uwb.RangingPosition;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzalv {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfm.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (r25 == 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0d7b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0daf  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b47  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0ce7  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzb(zzfz zzfzVar, zzaha zzahaVar, long j, zzq zzqVar, boolean z, boolean z2, zzgub zzgubVar, boolean z3) throws zzat {
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        long j3;
        boolean z6;
        long j4;
        long zzw;
        int i9;
        zzga zzc;
        zzfz zzfzVar2;
        int i10;
        zzhbh zzhbhVar;
        zzhbh zzhbhVar2;
        zzv zzvVar;
        boolean z7;
        zzamw zzo;
        zzgub zzgubVar2;
        zzap zzapVar;
        zzfz zzd;
        Pair zzq;
        zzga zzc2;
        short s;
        short s2;
        int i11;
        int i12;
        long j5;
        zzeu zzeuVar;
        zzq zzqVar2;
        String str;
        int i13;
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        boolean z8;
        String str3;
        zzalr zzalrVar;
        int i18;
        int i19;
        int i20;
        boolean z9;
        boolean z10;
        int i21;
        int i22;
        String str4;
        zzalr zzalrVar2;
        int i23;
        List list;
        int i24;
        int i25;
        zzgo zzgoVar;
        boolean z11;
        boolean z12;
        zzalr zzalrVar3;
        boolean z13;
        int i26;
        String str5;
        boolean z14;
        boolean z15;
        boolean z16;
        String str6;
        zzgxm zzgxmVar;
        long j6;
        boolean z17;
        zzamw zzamwVar;
        ArrayList arrayList2;
        zzfz zzfzVar3 = zzfzVar;
        ArrayList arrayList3 = new ArrayList();
        int i27 = 0;
        while (true) {
            List list2 = zzfzVar3.zzc;
            if (i27 >= list2.size()) {
                return arrayList3;
            }
            zzfz zzfzVar4 = (zzfz) list2.get(i27);
            if (zzfzVar4.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i = i27;
            } else {
                zzga zzc3 = zzfzVar3.zzc(1836476516);
                zzc3.getClass();
                zzfz zzd2 = zzfzVar4.zzd(1835297121);
                zzd2.getClass();
                zzga zzc4 = zzd2.zzc(1751411826);
                zzc4.getClass();
                int zzk = zzk(zzj(zzc4.zza));
                if (zzk == -1) {
                    zzgubVar2 = zzgubVar;
                    arrayList = arrayList3;
                    i = i27;
                } else {
                    zzga zzc5 = zzfzVar4.zzc(1953196132);
                    zzc5.getClass();
                    zzeu zzeuVar2 = zzc5.zza;
                    zzeuVar2.zzh(8);
                    int zza2 = zza(zzeuVar2.zzB());
                    zzeuVar2.zzk(zza2 != 0 ? 16 : 8);
                    int zzB = zzeuVar2.zzB();
                    zzeuVar2.zzk(4);
                    int zzg = zzeuVar2.zzg();
                    int i28 = 0;
                    while (true) {
                        int i29 = zza2 == 0 ? 4 : 8;
                        i = i27;
                        if (i28 >= i29) {
                            zzeuVar2.zzk(i29);
                            break;
                        }
                        if (zzeuVar2.zzi()[zzg + i28] != -1) {
                            j2 = zza2 == 0 ? zzeuVar2.zzz() : zzeuVar2.zzJ();
                        } else {
                            i28++;
                            i27 = i;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzeuVar2.zzk(10);
                    int zzt = zzeuVar2.zzt();
                    zzeuVar2.zzk(4);
                    int zzB2 = zzeuVar2.zzB();
                    int zzB3 = zzeuVar2.zzB();
                    zzeuVar2.zzk(4);
                    int zzB4 = zzeuVar2.zzB();
                    int zzB5 = zzeuVar2.zzB();
                    if (zzB2 == 0) {
                        if (zzB3 == 65536) {
                            if (zzB4 != -65536) {
                                if (zzB4 == 65536) {
                                    z17 = zzB5 != 0;
                                    zzB4 = 65536;
                                }
                                zzB3 = 65536;
                            } else {
                                z17 = zzB5 != 0;
                            }
                            if (true != z17) {
                                i7 = 90;
                                zzB3 = 65536;
                                i8 = 16;
                                i6 = 0;
                                zzeuVar2.zzk(i8);
                                short zzv = zzeuVar2.zzv();
                                zzeuVar2.zzk(2);
                                short zzv2 = zzeuVar2.zzv();
                                int i30 = zzk;
                                arrayList = arrayList3;
                                int i31 = zzt;
                                if ((i6 * zzB5) - (zzB3 * zzB4) < 0) {
                                    j3 = -9223372036854775807L;
                                    z6 = true;
                                } else {
                                    j3 = -9223372036854775807L;
                                    z6 = false;
                                }
                                j4 = j == j3 ? j2 : j;
                                long j7 = zzd(zzc3.zza).zzc;
                                if (j4 == j3) {
                                    i9 = 1835626086;
                                    zzw = -9223372036854775807L;
                                } else {
                                    zzw = zzfm.zzw(j4, 1000000L, j7, RoundingMode.DOWN);
                                    i9 = 1835626086;
                                }
                                zzfz zzd3 = zzd2.zzd(i9);
                                zzd3.getClass();
                                zzfz zzd4 = zzd3.zzd(1937007212);
                                zzd4.getClass();
                                zzga zzc6 = zzd2.zzc(1835296868);
                                zzc6.getClass();
                                zzalo zzl = zzl(zzc6.zza);
                                zzc = zzd4.zzc(1937011556);
                                if (zzc == null) {
                                    zzeh.zzc("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                    zzgubVar2 = zzgubVar;
                                } else {
                                    String zzc7 = zzl.zzc();
                                    zzeu zzeuVar3 = zzc.zza;
                                    zzeuVar3.zzh(12);
                                    int zzB6 = zzeuVar3.zzB();
                                    zzalr zzalrVar4 = new zzalr(zzB6);
                                    int i32 = 0;
                                    while (i32 < zzB6) {
                                        int zzg2 = zzeuVar3.zzg();
                                        zzfz zzfzVar5 = zzfzVar4;
                                        int zzB7 = zzeuVar3.zzB();
                                        String str7 = "childAtomSize must be positive";
                                        zzagl.zza(zzB7 > 0, "childAtomSize must be positive");
                                        int zzB8 = zzeuVar3.zzB();
                                        int i33 = zzB6;
                                        long j8 = zzw;
                                        int i34 = 1211250227;
                                        int i35 = 1701733238;
                                        if (zzB8 == 1635148593 || zzB8 == 1635148595 || zzB8 == 1701733238 || zzB8 == 1831958048 || zzB8 == 1836070006 || zzB8 == 1752589105 || zzB8 == 1751479857 || zzB8 == 1987470129 || zzB8 == 1987471665 || zzB8 == 1932670515 || zzB8 == 1211250227 || zzB8 == 1748121139 || zzB8 == 1987063864 || zzB8 == 1987063865 || zzB8 == 1635135537 || zzB8 == 1685479798 || zzB8 == 1685479729 || zzB8 == 1685481573 || zzB8 == 1685481521 || zzB8 == 1634760241 || zzB8 == 1684108849) {
                                            s = zzv2;
                                            int i36 = zzB;
                                            String str8 = zzc7;
                                            boolean z18 = z6;
                                            s2 = zzv;
                                            i11 = i30;
                                            i12 = i31;
                                            j5 = j8;
                                            zzalr zzalrVar5 = zzalrVar4;
                                            zzeuVar = zzeuVar3;
                                            zzeuVar.zzh(zzg2 + 16);
                                            zzeuVar.zzk(16);
                                            int zzt2 = zzeuVar.zzt();
                                            int zzt3 = zzeuVar.zzt();
                                            zzeuVar.zzk(50);
                                            int zzg3 = zzeuVar.zzg();
                                            if (zzB8 == 1701733238) {
                                                Pair zzu = zzu(zzeuVar, zzg2, zzB7);
                                                if (zzu != null) {
                                                    int intValue = ((Integer) zzu.first).intValue();
                                                    zzq zzb2 = zzqVar == null ? null : zzqVar.zzb(((zzamx) zzu.second).zzb);
                                                    zzalrVar5.zza[i32] = (zzamx) zzu.second;
                                                    zzqVar2 = zzb2;
                                                    i35 = intValue;
                                                } else {
                                                    zzqVar2 = zzqVar;
                                                }
                                                zzeuVar.zzh(zzg3);
                                                zzB8 = i35;
                                            } else {
                                                zzqVar2 = zzqVar;
                                            }
                                            if (zzB8 == 1831958048) {
                                                str = "video/mpeg";
                                                i34 = zzB8;
                                            } else if (zzB8 == 1211250227) {
                                                str = "video/3gpp";
                                            } else {
                                                i34 = zzB8;
                                                str = null;
                                            }
                                            int i37 = i7;
                                            zzq zzqVar3 = zzqVar2;
                                            String str9 = str;
                                            float f = 1.0f;
                                            int i38 = i34;
                                            i13 = i32;
                                            List list3 = null;
                                            int i39 = -1;
                                            zzgo zzgoVar2 = null;
                                            int i40 = 8;
                                            int i41 = 8;
                                            int i42 = -1;
                                            int i43 = -1;
                                            String str10 = null;
                                            zzalk zzalkVar = null;
                                            zzalm zzalmVar = null;
                                            byte[] bArr = null;
                                            int i44 = -1;
                                            int i45 = -1;
                                            int i46 = -1;
                                            int i47 = -1;
                                            zzfw zzfwVar = null;
                                            ByteBuffer byteBuffer = null;
                                            int i48 = -1;
                                            int i49 = zzg3;
                                            boolean z19 = false;
                                            while (i49 - zzg2 < zzB7) {
                                                zzeuVar.zzh(i49);
                                                int zzg4 = zzeuVar.zzg();
                                                int zzB9 = zzeuVar.zzB();
                                                if (zzB9 == 0) {
                                                    i18 = i49;
                                                    if (zzeuVar.zzg() - zzg2 == zzB7) {
                                                        break;
                                                    }
                                                    i19 = 0;
                                                } else {
                                                    i18 = i49;
                                                    i19 = zzB9;
                                                }
                                                if (i19 > 0) {
                                                    i20 = zzg2;
                                                    z9 = true;
                                                } else {
                                                    i20 = zzg2;
                                                    z9 = false;
                                                }
                                                zzagl.zza(z9, str7);
                                                int zzB10 = zzeuVar.zzB();
                                                int i50 = zzB7;
                                                if (zzB10 == 1635148611) {
                                                    int i51 = zzg4 + 8;
                                                    zzagl.zza(str9 == null, null);
                                                    zzeuVar.zzh(i51);
                                                    zzafm zza3 = zzafm.zza(zzeuVar);
                                                    List list4 = zza3.zza;
                                                    zzalrVar5.zzc = zza3.zzb;
                                                    if (z19) {
                                                        z16 = true;
                                                    } else {
                                                        f = zza3.zzk;
                                                        z16 = false;
                                                    }
                                                    String str11 = zza3.zzl;
                                                    int i52 = zza3.zzj;
                                                    int i53 = zza3.zzg;
                                                    int i54 = zza3.zzh;
                                                    i42 = zza3.zzi;
                                                    list = list4;
                                                    str10 = str11;
                                                    i44 = i52;
                                                    str4 = str7;
                                                    zzalrVar2 = zzalrVar5;
                                                    i21 = zza3.zze;
                                                    str9 = "video/avc";
                                                    i23 = i48;
                                                    z19 = z16;
                                                    i39 = i53;
                                                    i43 = i54;
                                                    i25 = i38;
                                                    i41 = zza3.zzf;
                                                    zzgoVar = zzgoVar2;
                                                } else {
                                                    if (zzB10 == 1752589123) {
                                                        int i55 = zzg4 + 8;
                                                        zzagl.zza(str9 == null, null);
                                                        zzeuVar.zzh(i55);
                                                        zzahb zza4 = zzahb.zza(zzeuVar);
                                                        List list5 = zza4.zza;
                                                        zzalrVar5.zzc = zza4.zzb;
                                                        if (z19) {
                                                            z15 = true;
                                                        } else {
                                                            f = zza4.zzl;
                                                            z15 = false;
                                                        }
                                                        int i56 = zza4.zzm;
                                                        int i57 = zza4.zzc;
                                                        String str12 = zza4.zzn;
                                                        int i58 = zza4.zzk;
                                                        int i59 = i58 != -1 ? i58 : i48;
                                                        int i60 = zza4.zzd;
                                                        int i61 = zza4.zze;
                                                        int i62 = zza4.zzh;
                                                        int i63 = zza4.zzi;
                                                        int i64 = zza4.zzj;
                                                        int i65 = zza4.zzf;
                                                        int i66 = zza4.zzg;
                                                        i46 = i60;
                                                        str4 = str7;
                                                        i23 = i59;
                                                        i47 = i61;
                                                        zzalrVar2 = zzalrVar5;
                                                        i42 = i64;
                                                        list = list5;
                                                        i21 = i65;
                                                        i25 = i38;
                                                        zzgoVar = zza4.zzo;
                                                        i41 = i66;
                                                        i44 = i56;
                                                        str10 = str12;
                                                        str9 = "video/hevc";
                                                        i45 = i57;
                                                        z19 = z15;
                                                        i39 = i62;
                                                        i43 = i63;
                                                    } else {
                                                        if (zzB10 == 1818785347) {
                                                            int i67 = zzg4 + 8;
                                                            zzagl.zza("video/hevc".equals(str9), "lhvC must follow hvcC atom");
                                                            if (zzgoVar2 != null) {
                                                                z14 = zzgoVar2.zza.size() >= 2;
                                                            } else {
                                                                z14 = false;
                                                                zzgoVar2 = null;
                                                            }
                                                            zzagl.zza(z14, "must have at least two layers");
                                                            zzeuVar.zzh(i67);
                                                            zzgoVar2.getClass();
                                                            zzahb zzb3 = zzahb.zzb(zzeuVar, zzgoVar2);
                                                            zzagl.zza(zzalrVar5.zzc == zzb3.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                            int i68 = zzb3.zzh;
                                                            if (i68 != -1) {
                                                                zzagl.zza(i39 == i68, "colorSpace must be the same for both views");
                                                            }
                                                            int i69 = zzb3.zzi;
                                                            if (i69 != -1) {
                                                                zzagl.zza(i43 == i69, "colorRange must be the same for both views");
                                                            }
                                                            int i70 = zzb3.zzj;
                                                            if (i70 != -1) {
                                                                zzagl.zza(i42 == i70, "colorTransfer must be the same for both views");
                                                            }
                                                            zzagl.zza(i40 == zzb3.zzf, "bitdepthLuma must be the same for both views");
                                                            zzagl.zza(i41 == zzb3.zzg, "bitdepthChroma must be the same for both views");
                                                            if (list3 != null) {
                                                                int i71 = zzgxm.zzd;
                                                                zzgxj zzgxjVar = new zzgxj();
                                                                zzgxjVar.zzh(list3);
                                                                zzgxjVar.zzh(zzb3.zza);
                                                                list3 = zzgxjVar.zzi();
                                                            } else {
                                                                zzagl.zza(false, "initializationData must be already set from hvcC atom");
                                                            }
                                                            list = list3;
                                                            str10 = zzb3.zzn;
                                                            i21 = i40;
                                                            str4 = str7;
                                                            str9 = "video/mv-hevc";
                                                            zzalrVar2 = zzalrVar5;
                                                            i23 = i48;
                                                            i25 = i38;
                                                        } else if (zzB10 == 1987470147) {
                                                            int i72 = zzg4 + 8;
                                                            zzagl.zza(str9 == null, null);
                                                            zzeuVar.zzh(i72);
                                                            zzahw zza5 = zzahw.zza(zzeuVar);
                                                            List list6 = zza5.zza;
                                                            zzalrVar5.zzc = zza5.zzb;
                                                            String str13 = zza5.zzc;
                                                            i21 = zza5.zzd;
                                                            list = list6;
                                                            str10 = str13;
                                                            str9 = "video/vvc";
                                                            str4 = str7;
                                                            zzalrVar2 = zzalrVar5;
                                                            i23 = i48;
                                                            i44 = 16;
                                                            i41 = i21;
                                                            i25 = i38;
                                                        } else {
                                                            if (zzB10 == 1986361461) {
                                                                zzeuVar.zzh(zzg4 + 8);
                                                                z10 = z19;
                                                                int zzg5 = zzeuVar.zzg();
                                                                zzaln zzalnVar = null;
                                                                while (zzg5 - zzg4 < i19) {
                                                                    zzeuVar.zzh(zzg5);
                                                                    int zzB11 = zzeuVar.zzB();
                                                                    if (zzB11 > 0) {
                                                                        zzalrVar3 = zzalrVar5;
                                                                        z13 = true;
                                                                    } else {
                                                                        zzalrVar3 = zzalrVar5;
                                                                        z13 = false;
                                                                    }
                                                                    zzagl.zza(z13, str7);
                                                                    int i73 = i41;
                                                                    if (zzeuVar.zzB() == 1702454643) {
                                                                        zzeuVar.zzh(zzg5 + 8);
                                                                        int zzg6 = zzeuVar.zzg();
                                                                        while (zzg6 - zzg5 < zzB11) {
                                                                            zzeuVar.zzh(zzg6);
                                                                            int zzB12 = zzeuVar.zzB();
                                                                            zzagl.zza(zzB12 > 0, str7);
                                                                            str5 = str7;
                                                                            if (zzeuVar.zzB() == 1937011305) {
                                                                                zzeuVar.zzk(4);
                                                                                int zzs = zzeuVar.zzs();
                                                                                i26 = i40;
                                                                                zzalnVar = new zzaln(new zzalq(1 == (zzs & 1), (zzs & 2) == 2, (zzs & 8) == 8));
                                                                            } else {
                                                                                zzg6 += zzB12;
                                                                                str7 = str5;
                                                                            }
                                                                        }
                                                                        i26 = i40;
                                                                        str5 = str7;
                                                                        zzalnVar = null;
                                                                        zzg5 += zzB11;
                                                                        zzalrVar5 = zzalrVar3;
                                                                        i41 = i73;
                                                                        str7 = str5;
                                                                        i40 = i26;
                                                                    } else {
                                                                        i26 = i40;
                                                                        str5 = str7;
                                                                    }
                                                                    zzg5 += zzB11;
                                                                    zzalrVar5 = zzalrVar3;
                                                                    i41 = i73;
                                                                    str7 = str5;
                                                                    i40 = i26;
                                                                }
                                                                i21 = i40;
                                                                i22 = i41;
                                                                str4 = str7;
                                                                zzalrVar2 = zzalrVar5;
                                                                zzalu zzaluVar = zzalnVar == null ? null : new zzalu(zzalnVar);
                                                                if (zzaluVar != null) {
                                                                    if (zzgoVar2 == null) {
                                                                        z12 = true;
                                                                        i23 = i48;
                                                                        zzgoVar2 = null;
                                                                    } else if (zzgoVar2.zza.size() >= 2) {
                                                                        zzagl.zza(zzaluVar.zza(), "both eye views must be marked as available");
                                                                        zzagl.zza(!zzaluVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                                                        list = list3;
                                                                        i24 = i43;
                                                                        i23 = i48;
                                                                        i25 = i38;
                                                                    } else {
                                                                        z12 = true;
                                                                        i23 = i48;
                                                                    }
                                                                    if (i23 != -1) {
                                                                        list = list3;
                                                                        i25 = i38;
                                                                        z19 = z10;
                                                                        i41 = i22;
                                                                    } else if (z12 != zzaluVar.zzb().zza().zzc()) {
                                                                        list = list3;
                                                                        i25 = i38;
                                                                        z19 = z10;
                                                                        i41 = i22;
                                                                        i23 = 4;
                                                                    } else {
                                                                        list = list3;
                                                                        i23 = 5;
                                                                        i25 = i38;
                                                                        z19 = z10;
                                                                        i41 = i22;
                                                                    }
                                                                } else {
                                                                    i23 = i48;
                                                                    list = list3;
                                                                    i24 = i43;
                                                                    i25 = i38;
                                                                }
                                                                zzgoVar = zzgoVar2;
                                                            } else {
                                                                z10 = z19;
                                                                i21 = i40;
                                                                i22 = i41;
                                                                str4 = str7;
                                                                zzalrVar2 = zzalrVar5;
                                                                i23 = i48;
                                                                if (zzB10 == 1685480259 || zzB10 == 1685485123 || zzB10 == 1685485379) {
                                                                    list = list3;
                                                                    i24 = i43;
                                                                    i25 = i38;
                                                                    zzgoVar = zzgoVar2;
                                                                    zzfwVar = zzfw.zza(zzeuVar);
                                                                } else if (zzB10 == 1987076931) {
                                                                    int i74 = zzg4 + 12;
                                                                    zzagl.zza(str9 == null, null);
                                                                    zzeuVar.zzh(i74);
                                                                    byte zzs2 = (byte) zzeuVar.zzs();
                                                                    byte zzs3 = (byte) zzeuVar.zzs();
                                                                    int zzs4 = zzeuVar.zzs();
                                                                    i41 = zzs4 >> 4;
                                                                    int i75 = zzs4 >> 1;
                                                                    int i76 = i38;
                                                                    String str14 = i76 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                                    if (str14.equals("video/x-vnd.on2.vp9")) {
                                                                        list3 = zzdr.zza(zzs2, zzs3, (byte) i41, (byte) (i75 & 7));
                                                                    }
                                                                    int i77 = zzs4 & 1;
                                                                    int zzs5 = zzeuVar.zzs();
                                                                    int zzs6 = zzeuVar.zzs();
                                                                    i39 = zzi.zzb(zzs5);
                                                                    list = list3;
                                                                    i43 = 1 != i77 ? 2 : 1;
                                                                    zzgoVar = zzgoVar2;
                                                                    i21 = i41;
                                                                    str9 = str14;
                                                                    i25 = i76;
                                                                    i42 = zzi.zzc(zzs6);
                                                                    z19 = z10;
                                                                } else {
                                                                    int i78 = i38;
                                                                    if (zzB10 == 1635135811) {
                                                                        int i79 = i19 - 8;
                                                                        byte[] bArr2 = new byte[i79];
                                                                        zzeuVar.zzm(bArr2, 0, i79);
                                                                        zzgxm zzj = zzgxm.zzj(bArr2);
                                                                        zzafl zza6 = zzafl.zza(bArr2);
                                                                        if (zza6 != null) {
                                                                            String str15 = zza6.zze;
                                                                            i42 = zza6.zzd;
                                                                            i43 = zza6.zzc;
                                                                            int i80 = zza6.zzb;
                                                                            i41 = zza6.zza;
                                                                            i21 = i41;
                                                                            str10 = str15;
                                                                            i39 = i80;
                                                                        } else {
                                                                            i41 = i22;
                                                                        }
                                                                        str9 = "video/av01";
                                                                        list = zzj;
                                                                        zzgoVar = zzgoVar2;
                                                                        i25 = i78;
                                                                        z19 = z10;
                                                                    } else if (zzB10 == 1668050025) {
                                                                        ByteBuffer zzo2 = byteBuffer == null ? zzo() : byteBuffer;
                                                                        zzo2.position(21);
                                                                        zzo2.putShort(zzeuVar.zzv());
                                                                        zzo2.putShort(zzeuVar.zzv());
                                                                        list = list3;
                                                                        zzgoVar = zzgoVar2;
                                                                        byteBuffer = zzo2;
                                                                        i25 = i78;
                                                                        z19 = z10;
                                                                        i41 = i22;
                                                                    } else if (zzB10 == 1835295606) {
                                                                        ByteBuffer zzo3 = byteBuffer == null ? zzo() : byteBuffer;
                                                                        short zzv3 = zzeuVar.zzv();
                                                                        short zzv4 = zzeuVar.zzv();
                                                                        short zzv5 = zzeuVar.zzv();
                                                                        short zzv6 = zzeuVar.zzv();
                                                                        short zzv7 = zzeuVar.zzv();
                                                                        zzgoVar = zzgoVar2;
                                                                        short zzv8 = zzeuVar.zzv();
                                                                        i25 = i78;
                                                                        short zzv9 = zzeuVar.zzv();
                                                                        int i81 = i43;
                                                                        short zzv10 = zzeuVar.zzv();
                                                                        long zzz = zzeuVar.zzz();
                                                                        long zzz2 = zzeuVar.zzz();
                                                                        list = list3;
                                                                        zzo3.position(1);
                                                                        zzo3.putShort(zzv7);
                                                                        zzo3.putShort(zzv8);
                                                                        zzo3.putShort(zzv3);
                                                                        zzo3.putShort(zzv4);
                                                                        zzo3.putShort(zzv5);
                                                                        zzo3.putShort(zzv6);
                                                                        zzo3.putShort(zzv9);
                                                                        zzo3.putShort(zzv10);
                                                                        zzo3.putShort((short) (zzz / 10000));
                                                                        zzo3.putShort((short) (zzz2 / 10000));
                                                                        byteBuffer = zzo3;
                                                                        z19 = z10;
                                                                        i41 = i22;
                                                                        i43 = i81;
                                                                    } else {
                                                                        list = list3;
                                                                        zzgoVar = zzgoVar2;
                                                                        i25 = i78;
                                                                        i24 = i43;
                                                                        if (zzB10 == 1681012275) {
                                                                            zzagl.zza(str9 == null, null);
                                                                            str9 = "video/3gpp";
                                                                        } else if (zzB10 == 1702061171) {
                                                                            zzagl.zza(str9 == null, null);
                                                                            zzalm zzs7 = zzs(zzeuVar, zzg4);
                                                                            str9 = zzs7.zza();
                                                                            byte[] zzb4 = zzs7.zzb();
                                                                            if (zzb4 != null) {
                                                                                zzalmVar = zzs7;
                                                                                list = zzgxm.zzj(zzb4);
                                                                            } else {
                                                                                zzalmVar = zzs7;
                                                                            }
                                                                        } else if (zzB10 == 1651798644) {
                                                                            zzalkVar = zzt(zzeuVar, zzg4);
                                                                        } else if (zzB10 == 1885434736) {
                                                                            zzeuVar.zzh(zzg4 + 8);
                                                                            f = zzeuVar.zzH() / zzeuVar.zzH();
                                                                            i41 = i22;
                                                                            i43 = i24;
                                                                            z19 = true;
                                                                        } else if (zzB10 == 1937126244) {
                                                                            int i82 = zzg4 + 8;
                                                                            while (true) {
                                                                                if (i82 - zzg4 >= i19) {
                                                                                    bArr = null;
                                                                                    break;
                                                                                }
                                                                                zzeuVar.zzh(i82);
                                                                                int zzB13 = zzeuVar.zzB() + i82;
                                                                                if (zzeuVar.zzB() == 1886547818) {
                                                                                    bArr = Arrays.copyOfRange(zzeuVar.zzi(), i82, zzB13);
                                                                                    break;
                                                                                }
                                                                                i82 = zzB13;
                                                                            }
                                                                        } else if (zzB10 == 1936995172) {
                                                                            int zzs8 = zzeuVar.zzs();
                                                                            zzeuVar.zzk(3);
                                                                            if (zzs8 == 0) {
                                                                                int zzs9 = zzeuVar.zzs();
                                                                                if (zzs9 == 0) {
                                                                                    z19 = z10;
                                                                                    i41 = i22;
                                                                                    i43 = i24;
                                                                                    i23 = 0;
                                                                                } else if (zzs9 == 1) {
                                                                                    z19 = z10;
                                                                                    i41 = i22;
                                                                                    i43 = i24;
                                                                                    i23 = 1;
                                                                                } else if (zzs9 == 2) {
                                                                                    z19 = z10;
                                                                                    i41 = i22;
                                                                                    i43 = i24;
                                                                                    i23 = 2;
                                                                                } else if (zzs9 == 3) {
                                                                                    i23 = 3;
                                                                                }
                                                                            }
                                                                        } else if (zzB10 == 1634760259) {
                                                                            int i83 = i19 - 12;
                                                                            byte[] bArr3 = new byte[i83];
                                                                            zzeuVar.zzh(zzg4 + 12);
                                                                            zzeuVar.zzm(bArr3, 0, i83);
                                                                            String zzd5 = zzdr.zzd(bArr3);
                                                                            zzgxm zzj2 = zzgxm.zzj(bArr3);
                                                                            zzi zzn = zzn(new zzeu(bArr3));
                                                                            int i84 = zzn.zzf;
                                                                            int i85 = zzn.zzg;
                                                                            str10 = zzd5;
                                                                            list = zzj2;
                                                                            i21 = i84;
                                                                            i39 = zzn.zzb;
                                                                            i43 = zzn.zzc;
                                                                            z19 = z10;
                                                                            i41 = i85;
                                                                            i42 = zzn.zzd;
                                                                            str9 = "video/apv";
                                                                        } else if (zzB10 == 1668246642) {
                                                                            if (i39 == -1) {
                                                                                if (i42 == -1) {
                                                                                    int zzB14 = zzeuVar.zzB();
                                                                                    if (zzB14 == 1852009592 || zzB14 == 1852009571) {
                                                                                        int zzt4 = zzeuVar.zzt();
                                                                                        int zzt5 = zzeuVar.zzt();
                                                                                        zzeuVar.zzk(2);
                                                                                        int i86 = 19;
                                                                                        if (i19 != 19) {
                                                                                            i86 = i19;
                                                                                        } else if ((zzeuVar.zzs() & 128) != 0) {
                                                                                            z11 = true;
                                                                                            i39 = zzi.zzb(zzt4);
                                                                                            int i87 = true == z11 ? 2 : 1;
                                                                                            i42 = zzi.zzc(zzt5);
                                                                                            i43 = i87;
                                                                                            i19 = i86;
                                                                                            z19 = z10;
                                                                                            i41 = i22;
                                                                                        }
                                                                                        z11 = false;
                                                                                        i39 = zzi.zzb(zzt4);
                                                                                        if (true == z11) {
                                                                                        }
                                                                                        i42 = zzi.zzc(zzt5);
                                                                                        i43 = i87;
                                                                                        i19 = i86;
                                                                                        z19 = z10;
                                                                                        i41 = i22;
                                                                                    } else {
                                                                                        zzeh.zzc("BoxParsers", "Unsupported color type: ".concat(zzgb.zze(zzB14)));
                                                                                        i39 = -1;
                                                                                        i42 = -1;
                                                                                        z19 = z10;
                                                                                        i41 = i22;
                                                                                        i43 = i24;
                                                                                    }
                                                                                } else {
                                                                                    i39 = -1;
                                                                                }
                                                                            }
                                                                        }
                                                                        z19 = z10;
                                                                        i41 = i22;
                                                                        i43 = i24;
                                                                    }
                                                                }
                                                            }
                                                            z19 = z10;
                                                            i41 = i22;
                                                            i43 = i24;
                                                        }
                                                        zzgoVar = zzgoVar2;
                                                    }
                                                    i49 = i18 + i19;
                                                    zzgoVar2 = zzgoVar;
                                                    i38 = i25;
                                                    zzg2 = i20;
                                                    zzB7 = i50;
                                                    zzalrVar5 = zzalrVar2;
                                                    i40 = i21;
                                                    list3 = list;
                                                    i48 = i23;
                                                    str7 = str4;
                                                }
                                                i49 = i18 + i19;
                                                zzgoVar2 = zzgoVar;
                                                i38 = i25;
                                                zzg2 = i20;
                                                zzB7 = i50;
                                                zzalrVar5 = zzalrVar2;
                                                i40 = i21;
                                                list3 = list;
                                                i48 = i23;
                                                str7 = str4;
                                            }
                                            List list7 = list3;
                                            int i88 = i40;
                                            int i89 = i41;
                                            zzalr zzalrVar6 = zzalrVar5;
                                            int i90 = i43;
                                            i14 = zzg2;
                                            i15 = zzB7;
                                            int i91 = i48;
                                            if (zzfwVar != null) {
                                                str2 = zzfwVar.zza;
                                                str9 = "video/dolby-vision";
                                            } else {
                                                str2 = str10;
                                            }
                                            if (str9 == null) {
                                                str3 = str8;
                                                z8 = z18;
                                                i17 = i37;
                                                i16 = i36;
                                                zzalrVar = zzalrVar6;
                                            } else {
                                                zzt zztVar = new zzt();
                                                i16 = i36;
                                                zztVar.zzb(i16);
                                                zztVar.zzo(str9);
                                                zztVar.zzk(str2);
                                                zztVar.zzv(zzt2);
                                                zztVar.zzw(zzt3);
                                                zztVar.zzx(i46);
                                                zztVar.zzy(i47);
                                                zztVar.zzC(f);
                                                i17 = i37;
                                                zztVar.zzA(i17);
                                                z8 = z18;
                                                zztVar.zzB(z8);
                                                zztVar.zzD(bArr);
                                                zztVar.zzE(i91);
                                                zztVar.zzr(list7);
                                                zztVar.zzq(i44);
                                                zztVar.zzG(i45);
                                                zztVar.zzs(zzqVar3);
                                                str3 = str8;
                                                zztVar.zze(str3);
                                                zzh zzhVar = new zzh();
                                                zzhVar.zza(i39);
                                                zzhVar.zzb(i90);
                                                zzhVar.zzc(i42);
                                                zzhVar.zzd(byteBuffer != null ? byteBuffer.array() : null);
                                                zzhVar.zze(i88);
                                                zzhVar.zzf(i89);
                                                zztVar.zzF(zzhVar.zzg());
                                                if (zzalkVar != null) {
                                                    zztVar.zzi(zzhbj.zzb(zzalkVar.zza()));
                                                    zztVar.zzj(zzhbj.zzb(zzalkVar.zzb()));
                                                } else if (zzalmVar != null) {
                                                    zztVar.zzi(zzhbj.zzb(zzalmVar.zzc()));
                                                    zztVar.zzj(zzhbj.zzb(zzalmVar.zzd()));
                                                }
                                                zzv zzQ = zztVar.zzQ();
                                                zzalrVar = zzalrVar6;
                                                zzalrVar.zzb = zzQ;
                                            }
                                        } else if (zzB8 == 1836069985 || zzB8 == 1701733217 || zzB8 == 1633889587 || zzB8 == 1700998451 || zzB8 == 1633889588 || zzB8 == 1835823201 || zzB8 == 1685353315 || zzB8 == 1685353317 || zzB8 == 1685353320 || zzB8 == 1685353324 || zzB8 == 1685353336 || zzB8 == 1935764850 || zzB8 == 1935767394 || zzB8 == 1819304813 || zzB8 == 1936684916 || zzB8 == 1953984371 || zzB8 == 778924082 || zzB8 == 778924083 || zzB8 == 1835557169 || zzB8 == 1835560241 || zzB8 == 1634492771 || zzB8 == 1634492791 || zzB8 == 1970037111 || zzB8 == 1332770163 || zzB8 == 1716281667 || zzB8 == 1767992678 || zzB8 == 1768973165 || zzB8 == 1718641517) {
                                            zzalr zzalrVar7 = zzalrVar4;
                                            s = zzv2;
                                            int i92 = zzB;
                                            s2 = zzv;
                                            zzeuVar = zzeuVar3;
                                            i11 = i30;
                                            j5 = j8;
                                            i12 = i31;
                                            zzr(zzeuVar3, zzB8, zzg2, zzB7, i92, zzc7, z2, zzqVar, zzalrVar7, i32);
                                            i17 = i7;
                                            zzalrVar = zzalrVar7;
                                            i13 = i32;
                                            i14 = zzg2;
                                            i15 = zzB7;
                                            str3 = zzc7;
                                            z8 = z6;
                                            i16 = i92;
                                        } else {
                                            if (zzB8 == 1414810956 || zzB8 == 1954034535 || zzB8 == 2004251764 || zzB8 == 1937010800 || zzB8 == 1664495672 || zzB8 == 1836070003 || zzB8 == 1952807028) {
                                                zzeuVar3.zzh(zzg2 + 16);
                                                if (zzB8 == 1414810956) {
                                                    str6 = "application/ttml+xml";
                                                } else {
                                                    if (zzB8 == 1954034535) {
                                                        int i93 = zzB7 - 16;
                                                        byte[] bArr4 = new byte[i93];
                                                        zzeuVar3.zzm(bArr4, 0, i93);
                                                        j6 = Long.MAX_VALUE;
                                                        zzgxmVar = zzgxm.zzj(bArr4);
                                                        str6 = "application/x-quicktime-tx3g";
                                                    } else if (zzB8 == 2004251764) {
                                                        str6 = "application/x-mp4-vtt";
                                                    } else if (zzB8 == 1937010800) {
                                                        str6 = "application/ttml+xml";
                                                        j6 = 0;
                                                        zzgxmVar = null;
                                                    } else if (zzB8 == 1664495672) {
                                                        zzalrVar4.zzd = 1;
                                                        str6 = "application/x-mp4-cea-608";
                                                    } else {
                                                        if (zzB8 == 1836070003) {
                                                            int zzg7 = zzeuVar3.zzg();
                                                            zzeuVar3.zzk(4);
                                                            if (zzeuVar3.zzB() == 1702061171) {
                                                                zzalm zzs10 = zzs(zzeuVar3, zzg7);
                                                                if (zzs10.zzb() != null && zzs10.zzb().length == 64) {
                                                                    String zzm = zzm(zzs10.zzb(), zzv, zzv2);
                                                                    String str16 = zzfm.zza;
                                                                    zzgxmVar = zzgxm.zzj(zzm.getBytes(StandardCharsets.UTF_8));
                                                                    str6 = "application/vobsub";
                                                                    j6 = Long.MAX_VALUE;
                                                                }
                                                            } else {
                                                                str6 = null;
                                                            }
                                                        } else {
                                                            str6 = "text/x-unknown";
                                                        }
                                                        zzgxmVar = null;
                                                        j6 = Long.MAX_VALUE;
                                                    }
                                                    if (str6 != null) {
                                                        zzt zztVar2 = new zzt();
                                                        zztVar2.zzb(zzB);
                                                        zztVar2.zzo(str6);
                                                        zztVar2.zze(zzc7);
                                                        zztVar2.zzt(j6);
                                                        zztVar2.zzr(zzgxmVar);
                                                        zzalrVar4.zzb = zztVar2.zzQ();
                                                    }
                                                }
                                                zzgxmVar = null;
                                                j6 = Long.MAX_VALUE;
                                                if (str6 != null) {
                                                }
                                            } else if (zzB8 == 1835365492 || zzB8 == 1769222965) {
                                                zzp(zzeuVar3, zzB8, zzg2, zzB, zzalrVar4);
                                            } else if (zzB8 == 1667329389) {
                                                zzt zztVar3 = new zzt();
                                                zztVar3.zzb(zzB);
                                                zztVar3.zzo("application/x-camera-motion");
                                                zzalrVar4.zzb = zztVar3.zzQ();
                                            }
                                            s = zzv2;
                                            i16 = zzB;
                                            str3 = zzc7;
                                            z8 = z6;
                                            i13 = i32;
                                            i14 = zzg2;
                                            s2 = zzv;
                                            i15 = zzB7;
                                            i11 = i30;
                                            i12 = i31;
                                            j5 = j8;
                                            zzeuVar = zzeuVar3;
                                            zzalrVar = zzalrVar4;
                                            i17 = i7;
                                        }
                                        zzeuVar.zzh(i14 + i15);
                                        i32 = i13 + 1;
                                        i7 = i17;
                                        z6 = z8;
                                        zzalrVar4 = zzalrVar;
                                        zzB = i16;
                                        zzc7 = str3;
                                        zzeuVar3 = zzeuVar;
                                        zzv = s2;
                                        zzfzVar4 = zzfzVar5;
                                        zzB6 = i33;
                                        zzv2 = s;
                                        i30 = i11;
                                        zzw = j5;
                                        i31 = i12;
                                    }
                                    zzalr zzalrVar8 = zzalrVar4;
                                    int i94 = zzB;
                                    long j9 = zzw;
                                    int i95 = i30;
                                    int i96 = i31;
                                    zzfzVar2 = zzfzVar4;
                                    zzfz zzd6 = zzfzVar2.zzd(1953654118);
                                    if (zzd6 != null && (zzc2 = zzd6.zzc(1667785072)) != null) {
                                        zzeu zzeuVar4 = zzc2.zza;
                                        zzeuVar4.zzh(8);
                                        if (zzeuVar4.zzd() >= 4) {
                                            i10 = zzeuVar4.zzB();
                                            if (!z || (zzd = zzfzVar2.zzd(1701082227)) == null || (zzq = zzq(zzd)) == null) {
                                                zzhbhVar = null;
                                                zzhbhVar2 = null;
                                            } else {
                                                zzhbhVar2 = (zzhbh) zzq.first;
                                                zzhbhVar = (zzhbh) zzq.second;
                                            }
                                            zzvVar = zzalrVar8.zzb;
                                            if (zzvVar != null) {
                                                zzgubVar2 = zzgubVar;
                                                zzo = null;
                                            } else {
                                                if (i96 != 0) {
                                                    zzfy zzfyVar = new zzfy(i96);
                                                    zzt zza7 = zzvVar.zza();
                                                    zzap zzapVar2 = zzvVar.zzl;
                                                    if (zzapVar2 != null) {
                                                        z7 = true;
                                                        zzapVar = zzapVar2.zzg(zzfyVar);
                                                    } else {
                                                        z7 = true;
                                                        zzapVar = new zzap(-9223372036854775807L, zzfyVar);
                                                    }
                                                    zza7.zzl(zzapVar);
                                                    zzvVar = zza7.zzQ();
                                                } else {
                                                    z7 = true;
                                                }
                                                boolean equals = Objects.equals(zzvVar.zzp, "text/x-unknown") ^ z7;
                                                zzamv zzamvVar = new zzamv();
                                                zzamvVar.zza(i94);
                                                zzamvVar.zzb(i95);
                                                zzamvVar.zzc(zzl.zza());
                                                zzamvVar.zzd(j7);
                                                zzamvVar.zze(j9);
                                                zzamvVar.zzf(zzl.zzb());
                                                zzamvVar.zzg(zzvVar);
                                                zzamvVar.zzh(zzalrVar8.zzd);
                                                zzamvVar.zzi(zzalrVar8.zza);
                                                zzamvVar.zzj(zzalrVar8.zzc);
                                                zzamvVar.zzk(zzhbhVar2);
                                                zzamvVar.zzl(zzhbhVar);
                                                zzamvVar.zzm(equals);
                                                zzamvVar.zzn(i10);
                                                zzo = zzamvVar.zzo();
                                                zzgubVar2 = zzgubVar;
                                            }
                                            zzamwVar = (zzamw) zzgubVar2.apply(zzo);
                                            if (zzamwVar != null) {
                                                zzfz zzd7 = zzfzVar2.zzd(1835297121);
                                                zzd7.getClass();
                                                zzfz zzd8 = zzd7.zzd(1835626086);
                                                zzd8.getClass();
                                                zzfz zzd9 = zzd8.zzd(1937007212);
                                                zzd9.getClass();
                                                zzamz zzg8 = zzg(zzamwVar, zzd9, zzahaVar, false);
                                                arrayList2 = arrayList;
                                                arrayList2.add(zzg8);
                                                i27 = i + 1;
                                                zzfzVar3 = zzfzVar;
                                                arrayList3 = arrayList2;
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                        }
                                    }
                                    i10 = -1;
                                    if (z) {
                                    }
                                    zzhbhVar = null;
                                    zzhbhVar2 = null;
                                    zzvVar = zzalrVar8.zzb;
                                    if (zzvVar != null) {
                                    }
                                    zzamwVar = (zzamw) zzgubVar2.apply(zzo);
                                    if (zzamwVar != null) {
                                    }
                                }
                            }
                            zzB3 = 65536;
                        }
                        zzB2 = 0;
                    }
                    if (zzB2 != 0) {
                        i2 = zzB2;
                        i3 = zzB3;
                        i4 = zzB4;
                        i5 = SupportMenu.CATEGORY_MASK;
                    } else if (zzB3 == -65536) {
                        if (zzB4 == 65536) {
                            z4 = zzB5 != 0;
                            z5 = true;
                            i4 = zzB4;
                        } else if (zzB4 == -65536) {
                            z4 = zzB5 != 0;
                            z5 = true;
                            zzB4 = SupportMenu.CATEGORY_MASK;
                            i4 = SupportMenu.CATEGORY_MASK;
                        } else {
                            i4 = zzB4;
                            i2 = 0;
                            zzB2 = 0;
                            zzB3 = SupportMenu.CATEGORY_MASK;
                            i5 = SupportMenu.CATEGORY_MASK;
                            i3 = SupportMenu.CATEGORY_MASK;
                        }
                        if (z5 != z4) {
                            i7 = 270;
                            i6 = zzB2;
                            i8 = 16;
                            zzeuVar2.zzk(i8);
                            short zzv11 = zzeuVar2.zzv();
                            zzeuVar2.zzk(2);
                            short zzv22 = zzeuVar2.zzv();
                            int i302 = zzk;
                            arrayList = arrayList3;
                            int i312 = zzt;
                            if ((i6 * zzB5) - (zzB3 * zzB4) < 0) {
                            }
                            if (j == j3) {
                            }
                            long j72 = zzd(zzc3.zza).zzc;
                            if (j4 == j3) {
                            }
                            zzfz zzd32 = zzd2.zzd(i9);
                            zzd32.getClass();
                            zzfz zzd42 = zzd32.zzd(1937007212);
                            zzd42.getClass();
                            zzga zzc62 = zzd2.zzc(1835296868);
                            zzc62.getClass();
                            zzalo zzl2 = zzl(zzc62.zza);
                            zzc = zzd42.zzc(1937011556);
                            if (zzc == null) {
                            }
                        }
                        i2 = 0;
                        zzB2 = 0;
                        zzB3 = SupportMenu.CATEGORY_MASK;
                        i5 = SupportMenu.CATEGORY_MASK;
                        i3 = SupportMenu.CATEGORY_MASK;
                    } else {
                        i3 = zzB3;
                        i5 = -65536;
                        i2 = 0;
                        zzB2 = 0;
                        i4 = zzB4;
                    }
                    if (zzB2 != i5) {
                        i6 = 65536;
                        if (zzB2 != 65536) {
                            i6 = i2;
                            zzB3 = i3;
                            i7 = 0;
                            i8 = 16;
                            zzeuVar2.zzk(i8);
                            short zzv112 = zzeuVar2.zzv();
                            zzeuVar2.zzk(2);
                            short zzv222 = zzeuVar2.zzv();
                            int i3022 = zzk;
                            arrayList = arrayList3;
                            int i3122 = zzt;
                            if ((i6 * zzB5) - (zzB3 * zzB4) < 0) {
                            }
                            if (j == j3) {
                            }
                            long j722 = zzd(zzc3.zza).zzc;
                            if (j4 == j3) {
                            }
                            zzfz zzd322 = zzd2.zzd(i9);
                            zzd322.getClass();
                            zzfz zzd422 = zzd322.zzd(1937007212);
                            zzd422.getClass();
                            zzga zzc622 = zzd2.zzc(1835296868);
                            zzc622.getClass();
                            zzalo zzl22 = zzl(zzc622.zza);
                            zzc = zzd422.zzc(1937011556);
                            if (zzc == null) {
                            }
                        }
                    } else {
                        i6 = zzB2;
                    }
                    if (zzB3 == 0 && i4 == 0 && zzB5 == -65536) {
                        zzB5 = -65536;
                        i7 = 180;
                        zzB3 = i3;
                        i8 = 16;
                        zzeuVar2.zzk(i8);
                        short zzv1122 = zzeuVar2.zzv();
                        zzeuVar2.zzk(2);
                        short zzv2222 = zzeuVar2.zzv();
                        int i30222 = zzk;
                        arrayList = arrayList3;
                        int i31222 = zzt;
                        if ((i6 * zzB5) - (zzB3 * zzB4) < 0) {
                        }
                        if (j == j3) {
                        }
                        long j7222 = zzd(zzc3.zza).zzc;
                        if (j4 == j3) {
                        }
                        zzfz zzd3222 = zzd2.zzd(i9);
                        zzd3222.getClass();
                        zzfz zzd4222 = zzd3222.zzd(1937007212);
                        zzd4222.getClass();
                        zzga zzc6222 = zzd2.zzc(1835296868);
                        zzc6222.getClass();
                        zzalo zzl222 = zzl(zzc6222.zza);
                        zzc = zzd4222.zzc(1937011556);
                        if (zzc == null) {
                        }
                    }
                    zzB3 = i3;
                    i7 = 0;
                    i8 = 16;
                    zzeuVar2.zzk(i8);
                    short zzv11222 = zzeuVar2.zzv();
                    zzeuVar2.zzk(2);
                    short zzv22222 = zzeuVar2.zzv();
                    int i302222 = zzk;
                    arrayList = arrayList3;
                    int i312222 = zzt;
                    if ((i6 * zzB5) - (zzB3 * zzB4) < 0) {
                    }
                    if (j == j3) {
                    }
                    long j72222 = zzd(zzc3.zza).zzc;
                    if (j4 == j3) {
                    }
                    zzfz zzd32222 = zzd2.zzd(i9);
                    zzd32222.getClass();
                    zzfz zzd42222 = zzd32222.zzd(1937007212);
                    zzd42222.getClass();
                    zzga zzc62222 = zzd2.zzc(1835296868);
                    zzc62222.getClass();
                    zzalo zzl2222 = zzl(zzc62222.zza);
                    zzc = zzd42222.zzc(1937011556);
                    if (zzc == null) {
                    }
                }
                zzfzVar2 = zzfzVar4;
                zzo = null;
                zzamwVar = (zzamw) zzgubVar2.apply(zzo);
                if (zzamwVar != null) {
                }
            }
            i27 = i + 1;
            zzfzVar3 = zzfzVar;
            arrayList3 = arrayList2;
        }
    }

    public static zzap zzc(zzga zzgaVar) {
        int zzF;
        zzeu zzeuVar = zzgaVar.zza;
        zzeuVar.zzh(8);
        zzap zzapVar = new zzap(-9223372036854775807L, new zzao[0]);
        while (zzeuVar.zzd() >= 8) {
            int zzg = zzeuVar.zzg();
            int zzB = zzeuVar.zzB() + zzg;
            int zzB2 = zzeuVar.zzB();
            zzap zzapVar2 = null;
            if (zzB2 == 1835365473) {
                zzeuVar.zzh(zzg);
                zzeuVar.zzk(8);
                zzf(zzeuVar);
                while (true) {
                    if (zzeuVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg2 = zzeuVar.zzg();
                    int zzB3 = zzeuVar.zzB() + zzg2;
                    if (zzeuVar.zzB() == 1768715124) {
                        zzeuVar.zzh(zzg2);
                        zzeuVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzeuVar.zzg() < zzB3) {
                            zzao zzc = zzamf.zzc(zzeuVar);
                            if (zzc != null) {
                                arrayList.add(zzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                        }
                    } else {
                        zzeuVar.zzh(zzB3);
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == 1936553057) {
                zzeuVar.zzh(zzg);
                zzeuVar.zzk(12);
                while (true) {
                    if (zzeuVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg3 = zzeuVar.zzg();
                    int zzB4 = zzeuVar.zzB();
                    if (zzeuVar.zzB() != 1935766900) {
                        zzeuVar.zzh(zzg3 + zzB4);
                    } else if (zzB4 >= 16) {
                        zzeuVar.zzk(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzs = zzeuVar.zzs();
                            int zzs2 = zzeuVar.zzs();
                            if (zzs == 0) {
                                i = zzs2;
                            } else if (zzs == 1) {
                                i2 = zzs2;
                            }
                        }
                        if (i == 12) {
                            zzF = 240;
                        } else if (i == 13) {
                            zzF = MenuKt.InTransitionDuration;
                        } else {
                            if (i == 21 && zzeuVar.zzd() >= 8 && zzeuVar.zzg() + 8 <= zzB) {
                                int zzB5 = zzeuVar.zzB();
                                int zzB6 = zzeuVar.zzB();
                                if (zzB5 >= 12 && zzB6 == 1936877170) {
                                    zzF = zzeuVar.zzF();
                                }
                            }
                            zzF = -2147483647;
                        }
                        if (zzF != -2147483647) {
                            zzapVar2 = new zzap(-9223372036854775807L, new zzaki(zzF, i2));
                        }
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzi(zzeuVar));
            } else if (zzB2 == 1667788908) {
                zzapVar = zzapVar.zzf(zzh(zzeuVar));
            }
            zzeuVar.zzh(zzB);
        }
        return zzapVar;
    }

    public static zzgd zzd(zzeu zzeuVar) {
        long zzD;
        long zzD2;
        zzeuVar.zzh(8);
        if (zza(zzeuVar.zzB()) == 0) {
            zzD = zzeuVar.zzz();
            zzD2 = zzeuVar.zzz();
        } else {
            zzD = zzeuVar.zzD();
            zzD2 = zzeuVar.zzD();
        }
        return new zzgd(zzD, zzD2, zzeuVar.zzz());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r8 = r12.zzB();
        r10 = r12.zzB();
        r9 = r9 - 16;
        r11 = new byte[r9];
        r12.zzm(r11, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        r9 = new com.google.android.gms.internal.ads.zzfx(r7, r11, r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        java.lang.String.valueOf(r7);
        com.google.android.gms.internal.ads.zzeh.zzc("MetadataUtil", "Failed to parse metadata entry with key: ".concat(java.lang.String.valueOf(r7)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzap zze(zzfz zzfzVar) {
        zzga zzc = zzfzVar.zzc(1751411826);
        zzga zzc2 = zzfzVar.zzc(1801812339);
        zzga zzc3 = zzfzVar.zzc(1768715124);
        if (zzc != null && zzc2 != null && zzc3 != null && zzj(zzc.zza) == 1835299937) {
            zzeu zzeuVar = zzc2.zza;
            zzeuVar.zzh(12);
            int zzB = zzeuVar.zzB();
            String[] strArr = new String[zzB];
            for (int i = 0; i < zzB; i++) {
                int zzB2 = zzeuVar.zzB();
                zzeuVar.zzk(4);
                strArr[i] = zzeuVar.zzK(zzB2 - 8, StandardCharsets.UTF_8);
            }
            zzeu zzeuVar2 = zzc3.zza;
            zzeuVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzeuVar2.zzd() > 8) {
                int zzg = zzeuVar2.zzg() + zzeuVar2.zzB();
                int zzB3 = zzeuVar2.zzB() - 1;
                if (zzB3 < 0 || zzB3 >= zzB) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(zzB3);
                    zzeh.zzc("BoxParsers", sb.toString());
                } else {
                    String str = strArr[zzB3];
                    while (true) {
                        int zzg2 = zzeuVar2.zzg();
                        if (zzg2 >= zzg) {
                            break;
                        }
                        int zzB4 = zzeuVar2.zzB();
                        if (zzeuVar2.zzB() == 1684108385) {
                            break;
                        }
                        zzeuVar2.zzh(zzg2 + zzB4);
                    }
                    zzfx zzfxVar = null;
                    if (zzfxVar != null) {
                        arrayList.add(zzfxVar);
                    }
                }
                zzeuVar2.zzh(zzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzeu zzeuVar) {
        int zzg = zzeuVar.zzg();
        zzeuVar.zzk(4);
        if (zzeuVar.zzB() != 1751411826) {
            zzg += 4;
        }
        zzeuVar.zzh(zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0462  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamz zzg(zzamw zzamwVar, zzfz zzfzVar, zzaha zzahaVar, boolean z) throws zzat {
        zzalp zzaltVar;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        zzv zzvVar;
        int[] iArr;
        boolean z4;
        long[] jArr;
        int i4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        long j;
        int[] iArr2;
        long[] jArr2;
        long[] jArr3;
        int i9;
        int i10;
        int[] iArr3;
        long j2;
        int[] iArr4;
        int i11;
        zzeu zzeuVar;
        zzeu zzeuVar2;
        int i12;
        long j3;
        zzhbh zzhbhVar;
        long j4;
        ArrayList arrayList;
        int i13;
        zzamw zzamwVar2;
        boolean z6;
        int[] iArr5;
        long[] jArr4;
        int i14;
        zzhbh zzhbhVar2;
        zzhbh zzhbhVar3;
        int[] iArr6;
        int[] iArr7;
        int i15;
        int i16;
        boolean z7;
        int length;
        long j5;
        zzamw zzamwVar3 = zzamwVar;
        zzga zzc = zzfzVar.zzc(1937011578);
        if (zzc != null) {
            zzaltVar = new zzals(zzc, zzamwVar3.zzg);
        } else {
            zzga zzc2 = zzfzVar.zzc(1937013298);
            if (zzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzaltVar = new zzalt(zzc2);
        }
        int zza2 = zzaltVar.zza();
        if (zza2 == 0) {
            return new zzamz(zzamwVar, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzamwVar3.zzb == 2) {
            long j6 = zzamwVar3.zzf;
            if (j6 > 0) {
                zzt zza3 = zzamwVar3.zzg.zza();
                zza3.zzz(zza2 / (j6 / 1000000.0f));
                zzv zzQ = zza3.zzQ();
                zzamv zzamvVar = new zzamv(zzamwVar3, null);
                zzamvVar.zzg(zzQ);
                zzamwVar3 = zzamvVar.zzo();
            }
        }
        zzga zzc3 = zzfzVar.zzc(1937007471);
        if (zzc3 == null) {
            zzc3 = zzfzVar.zzc(1668232756);
            zzc3.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        zzga zzc4 = zzfzVar.zzc(1937011555);
        zzc4.getClass();
        zzeu zzeuVar3 = zzc4.zza;
        zzga zzc5 = zzfzVar.zzc(1937011827);
        zzc5.getClass();
        zzeu zzeuVar4 = zzc5.zza;
        zzga zzc6 = zzfzVar.zzc(1937011571);
        zzeu zzeuVar5 = zzc6 != null ? zzc6.zza : null;
        zzga zzc7 = zzfzVar.zzc(1668576371);
        zzeu zzeuVar6 = zzc7 != null ? zzc7.zza : null;
        zzall zzallVar = new zzall(zzeuVar3, zzc3.zza, z2);
        zzeuVar4.zzh(12);
        int zzH = zzeuVar4.zzH() - 1;
        int zzH2 = zzeuVar4.zzH();
        int zzH3 = zzeuVar4.zzH();
        if (zzeuVar6 != null) {
            zzeuVar6.zzh(12);
            i = zzeuVar6.zzH();
        } else {
            i = 0;
        }
        if (zzeuVar5 != null) {
            zzeuVar5.zzh(12);
            i3 = zzeuVar5.zzH();
            if (i3 > 0) {
                i2 = zzeuVar5.zzH() - 1;
            } else {
                zzeuVar5 = null;
                i2 = -1;
            }
        } else {
            i2 = -1;
            i3 = 0;
        }
        int zzb2 = zzaltVar.zzb();
        zzv zzvVar2 = zzamwVar3.zzg;
        if (zzb2 != -1) {
            String str = zzvVar2.zzp;
            if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && zzH == 0) {
                z3 = i == 0 && i3 == 0;
                zzH = 0;
                ArrayList arrayList2 = new ArrayList();
                ?? r28 = zzeuVar5 != null ? 1 : 0;
                if (z3) {
                    zzvVar = zzvVar2;
                    long[] jArr5 = new long[zza2];
                    int[] iArr8 = new int[zza2];
                    long[] jArr6 = new long[zza2];
                    int[] iArr9 = new int[zza2];
                    int i17 = zzH3;
                    int i18 = i;
                    int i19 = i2;
                    int i20 = 0;
                    int i21 = 0;
                    long j7 = 0;
                    long j8 = 0;
                    long j9 = 0;
                    int i22 = 0;
                    int i23 = i3;
                    int i24 = zzH;
                    int i25 = 0;
                    int i26 = 0;
                    while (true) {
                        if (i25 >= zza2) {
                            iArr = iArr9;
                            break;
                        }
                        long j10 = j7;
                        int i27 = i20;
                        boolean z8 = true;
                        while (true) {
                            if (i27 != 0) {
                                i11 = zza2;
                                zzeuVar = zzeuVar4;
                                zzeuVar2 = zzeuVar5;
                                i12 = i27;
                                break;
                            }
                            z8 = zzallVar.zza();
                            if (!z8) {
                                i11 = zza2;
                                zzeuVar = zzeuVar4;
                                zzeuVar2 = zzeuVar5;
                                i12 = 0;
                                break;
                            }
                            zzeu zzeuVar7 = zzeuVar4;
                            long j11 = zzallVar.zzd;
                            i27 = zzallVar.zzc;
                            j10 = j11;
                            zzeuVar4 = zzeuVar7;
                            zzeuVar5 = zzeuVar5;
                            zza2 = zza2;
                        }
                        if (!z8) {
                            zzeh.zzc("BoxParsers", "Unexpected end of chunk data");
                            jArr5 = Arrays.copyOf(jArr5, i25);
                            iArr8 = Arrays.copyOf(iArr8, i25);
                            jArr6 = Arrays.copyOf(jArr6, i25);
                            zza2 = i25;
                            i20 = i27;
                            iArr = Arrays.copyOf(iArr9, i25);
                            break;
                        }
                        if (zzeuVar6 != null) {
                            while (true) {
                                if (i21 != 0) {
                                    break;
                                }
                                if (i18 <= 0) {
                                    i21 = 0;
                                    break;
                                }
                                i18--;
                                i21 = zzeuVar6.zzH();
                                i26 = zzeuVar6.zzB();
                            }
                            i21--;
                        }
                        int zzc8 = zzaltVar.zzc();
                        long j12 = zzc8;
                        j9 += j12;
                        int i28 = i22;
                        i22 = zzc8 > i28 ? zzc8 : i28;
                        jArr5[i25] = j10;
                        iArr8[i25] = zzc8;
                        zzalp zzalpVar = zzaltVar;
                        zzall zzallVar2 = zzallVar;
                        jArr6[i25] = j8 + i26;
                        iArr9[i25] = r28;
                        int i29 = i19;
                        if (i25 == i29) {
                            iArr9[i25] = 1;
                            arrayList2.add(Integer.valueOf(i25));
                        }
                        if (zzeuVar2 != null && i25 == i29 && i23 - 1 > 0) {
                            i29 = zzeuVar2.zzH() - 1;
                        }
                        i19 = i29;
                        int i30 = i17;
                        j8 += i30;
                        int i31 = zzH2 - 1;
                        if (i31 != 0) {
                            zzH2 = i31;
                            i17 = i30;
                        } else if (i24 > 0) {
                            i24--;
                            zzH2 = zzeuVar.zzH();
                            i17 = zzeuVar.zzB();
                        } else {
                            i17 = i30;
                            zzH2 = 0;
                        }
                        i20 = i12 - 1;
                        i25++;
                        zzeuVar4 = zzeuVar;
                        zzeuVar5 = zzeuVar2;
                        zza2 = i11;
                        zzaltVar = zzalpVar;
                        j7 = j10 + j12;
                        zzallVar = zzallVar2;
                    }
                    int i32 = i22;
                    long j13 = j8 + i26;
                    if (zzeuVar6 != null) {
                        while (i18 > 0) {
                            if (zzeuVar6.zzH() != 0) {
                                z4 = false;
                                break;
                            }
                            zzeuVar6.zzB();
                            i18--;
                        }
                    }
                    z4 = true;
                    if (i23 == 0) {
                        if (zzH2 == 0) {
                            if (i20 != 0) {
                                jArr = jArr5;
                                i7 = zza2;
                                i5 = i24;
                                i6 = i21;
                                i4 = 0;
                            } else if (i24 != 0) {
                                jArr = jArr5;
                                i7 = zza2;
                                i5 = i24;
                                i6 = i21;
                                i4 = 0;
                                i20 = 0;
                            } else if (i21 != 0) {
                                jArr = jArr5;
                                i7 = zza2;
                                i6 = i21;
                                i4 = 0;
                                i20 = 0;
                                i5 = 0;
                            } else if (z4) {
                                jArr = jArr5;
                                i7 = zza2;
                                iArr2 = iArr8;
                                j = j13;
                                jArr2 = jArr;
                                jArr3 = jArr6;
                                i9 = i32;
                                i10 = i7;
                                iArr3 = iArr2;
                                j2 = j9;
                                iArr4 = iArr;
                            } else {
                                jArr = jArr5;
                                i7 = zza2;
                                i8 = 0;
                                z5 = false;
                                i4 = 0;
                                i20 = 0;
                                i5 = 0;
                                i6 = 0;
                            }
                            z5 = z4;
                        } else {
                            jArr = jArr5;
                            i4 = zzH2;
                            i5 = i24;
                            i6 = i21;
                            z5 = z4;
                            i7 = zza2;
                        }
                        i8 = 0;
                    } else {
                        jArr = jArr5;
                        i4 = zzH2;
                        i5 = i24;
                        i6 = i21;
                        z5 = z4;
                        i7 = zza2;
                        i8 = i23;
                    }
                    int i33 = zzamwVar3.zza;
                    int length2 = String.valueOf(i33).length() + 66 + String.valueOf(i8).length() + 35 + String.valueOf(i4).length() + 26 + String.valueOf(i20).length() + 33 + String.valueOf(i5).length() + 36;
                    int length3 = String.valueOf(i6).length();
                    iArr2 = iArr8;
                    String str2 = true != z5 ? ", ctts invalid" : "";
                    j = j13;
                    StringBuilder sb = new StringBuilder(length2 + length3 + str2.length());
                    sb.append("Inconsistent stbl box for track ");
                    sb.append(i33);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(i8);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i4);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i20);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i5);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i6);
                    sb.append(str2);
                    zzeh.zzc("BoxParsers", sb.toString());
                    jArr2 = jArr;
                    jArr3 = jArr6;
                    i9 = i32;
                    i10 = i7;
                    iArr3 = iArr2;
                    j2 = j9;
                    iArr4 = iArr;
                } else {
                    int i34 = zzallVar.zza;
                    long[] jArr7 = new long[i34];
                    int[] iArr10 = new int[i34];
                    while (zzallVar.zza()) {
                        int i35 = zzallVar.zzb;
                        jArr7[i35] = zzallVar.zzd;
                        iArr10[i35] = zzallVar.zzc;
                    }
                    long j14 = zzH3;
                    int i36 = 8192 / zzb2;
                    int i37 = 0;
                    for (int i38 = 0; i38 < i34; i38++) {
                        int i39 = iArr10[i38];
                        String str3 = zzfm.zza;
                        i37 += ((i39 + i36) - 1) / i36;
                    }
                    long[] jArr8 = new long[i37];
                    iArr3 = new int[i37];
                    jArr3 = new long[i37];
                    iArr4 = new int[i37];
                    zzvVar = zzvVar2;
                    int i40 = i37;
                    int i41 = 0;
                    int i42 = 0;
                    int i43 = 0;
                    int i44 = 0;
                    int i45 = 0;
                    while (i43 < i34) {
                        int i46 = iArr10[i43];
                        long j15 = jArr7[i43];
                        int i47 = i45;
                        int i48 = i34;
                        int i49 = i44;
                        int i50 = i47;
                        long[] jArr9 = jArr7;
                        int i51 = i46;
                        while (i51 > 0) {
                            int min = Math.min(i36, i51);
                            jArr8[i50] = j15;
                            int[] iArr11 = iArr10;
                            int i52 = zzb2 * min;
                            iArr3[i50] = i52;
                            i42 += i52;
                            i49 = Math.max(i49, i52);
                            jArr3[i50] = i41 * j14;
                            iArr4[i50] = 1;
                            j15 += iArr3[i50];
                            i41 += min;
                            i51 -= min;
                            i50++;
                            iArr10 = iArr11;
                            zzb2 = zzb2;
                        }
                        i43++;
                        jArr7 = jArr9;
                        int i53 = i50;
                        i44 = i49;
                        i34 = i48;
                        i45 = i53;
                    }
                    long j16 = j14 * i41;
                    j2 = i42;
                    i10 = i40;
                    j = j16;
                    jArr2 = jArr8;
                    i9 = i44;
                }
                j3 = zzamwVar3.zzf;
                if (j3 > 0) {
                    long zzw = zzfm.zzw(8 * j2, 1000000L, j3, RoundingMode.HALF_DOWN);
                    if (zzw > 0 && zzw < 2147483647L) {
                        zzt zza4 = zzvVar.zza();
                        zza4.zzi((int) zzw);
                        zzv zzQ2 = zza4.zzQ();
                        zzamv zzamvVar2 = new zzamv(zzamwVar3, null);
                        zzamvVar2.zzg(zzQ2);
                        zzamwVar3 = zzamvVar2.zzo();
                    }
                }
                long j17 = zzamwVar3.zzc;
                long zzw2 = zzfm.zzw(j, 1000000L, j17, RoundingMode.DOWN);
                int[] zzf = zzhbj.zzf(arrayList2);
                zzhbhVar = zzamwVar3.zzi;
                if (zzhbhVar != null) {
                    zzfm.zzx(jArr3, 1000000L, j17);
                    return new zzamz(zzamwVar3, jArr2, iArr3, i9, jArr3, iArr4, zzf, r28, zzw2, i10);
                }
                if (zzhbhVar.zzb() == 1 && zzamwVar3.zzb == 1 && (length = jArr3.length) >= 2) {
                    zzhbh zzhbhVar4 = zzamwVar3.zzj;
                    zzhbhVar4.getClass();
                    long zzc9 = zzhbhVar4.zzc(0);
                    long zzc10 = zzhbhVar.zzc(0);
                    long j18 = zzamwVar3.zzd;
                    arrayList = arrayList2;
                    i13 = i10;
                    long zzw3 = zzc9 + zzfm.zzw(zzc10, j17, j18, RoundingMode.DOWN);
                    int i54 = length - 1;
                    int max = Math.max(0, Math.min(4, i54));
                    int max2 = Math.max(0, Math.min(length - 4, i54));
                    if (jArr3[0] <= zzc9 && zzc9 < jArr3[max] && jArr3[max2] < zzw3 && zzw3 <= j + 2) {
                        long max3 = Math.max(0L, j - zzw3);
                        long j19 = zzc9 - jArr3[0];
                        long j20 = zzamwVar3.zzg.zzK;
                        long zzw4 = zzfm.zzw(j19, j20, j17, RoundingMode.DOWN);
                        long zzw5 = zzfm.zzw(max3, j20, j17, RoundingMode.DOWN);
                        if (zzw4 != 0) {
                            j5 = zzw4;
                        } else if (zzw5 != 0) {
                            j5 = 0;
                        }
                        if (j5 <= 2147483647L && zzw5 <= 2147483647L) {
                            zzahaVar.zza = (int) j5;
                            zzahaVar.zzb = (int) zzw5;
                            zzfm.zzx(jArr3, 1000000L, j17);
                            return new zzamz(zzamwVar3, jArr2, iArr3, i9, jArr3, iArr4, zzf, r28, zzfm.zzw(zzhbhVar.zzc(0), 1000000L, j18, RoundingMode.DOWN), i13);
                        }
                    }
                    j4 = j17;
                } else {
                    j4 = j17;
                    arrayList = arrayList2;
                    i13 = i10;
                }
                if (zzhbhVar.zzb() == 1 && zzhbhVar.zzc(0) == 0) {
                    zzhbh zzhbhVar5 = zzamwVar3.zzj;
                    zzhbhVar5.getClass();
                    long zzc11 = zzhbhVar5.zzc(0);
                    for (int i55 = 0; i55 < jArr3.length; i55++) {
                        jArr3[i55] = zzfm.zzw(jArr3[i55] - zzc11, 1000000L, j4, RoundingMode.DOWN);
                    }
                    return new zzamz(zzamwVar3, jArr2, iArr3, i9, jArr3, iArr4, zzf, r28, zzfm.zzw(j - zzc11, 1000000L, j4, RoundingMode.DOWN), i13);
                }
                long j21 = j4;
                boolean z9 = zzamwVar3.zzb == 1;
                int[] iArr12 = new int[zzhbhVar.zzb()];
                int[] iArr13 = new int[zzhbhVar.zzb()];
                zzhbh zzhbhVar6 = zzamwVar3.zzj;
                zzhbhVar6.getClass();
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                boolean z10 = false;
                while (i57 < zzhbhVar.zzb()) {
                    long zzc12 = zzhbhVar6.zzc(i57);
                    if (zzc12 != -1) {
                        i14 = i57;
                        int i59 = i58;
                        iArr6 = iArr13;
                        iArr7 = iArr3;
                        jArr4 = jArr2;
                        int i60 = i56;
                        zzhbhVar3 = zzhbhVar;
                        zzhbhVar2 = zzhbhVar6;
                        long zzw6 = zzfm.zzw(zzhbhVar.zzc(i57), j21, zzamwVar3.zzd, RoundingMode.DOWN) + zzc12;
                        iArr12[i14] = zzfm.zzo(jArr3, zzc12, true, true);
                        int zzq = zzfm.zzq(jArr3, zzw6, z9, false);
                        int i61 = zzq - 1;
                        int i62 = 0;
                        while (zzq < jArr3.length) {
                            if (jArr3[zzq] >= zzw6) {
                                i62++;
                                if (i62 > zzamwVar3.zzg.zzr) {
                                    break;
                                }
                            } else {
                                i61 = zzq;
                            }
                            zzq++;
                        }
                        iArr6[i14] = i61 + 1;
                        int i63 = iArr12[i14];
                        while (true) {
                            i15 = iArr12[i14];
                            if (i15 <= 0) {
                                i16 = 1;
                                break;
                            }
                            i16 = 1;
                            if ((iArr4[i15] & 1) != 0) {
                                break;
                            }
                            iArr12[i14] = i15 - 1;
                        }
                        if (i15 == 0) {
                            z7 = false;
                            if ((iArr4[0] & i16) == 0) {
                                iArr12[i14] = i63;
                                while (true) {
                                    i15 = iArr12[i14];
                                    if (i15 >= iArr6[i14] || (iArr4[i15] & i16) != 0) {
                                        break;
                                    }
                                    iArr12[i14] = i15 + 1;
                                    i16 = 1;
                                }
                            }
                        } else {
                            z7 = false;
                        }
                        int i64 = iArr6[i14];
                        i58 = i59 + (i64 - i15);
                        z10 |= i60 != i15 ? true : z7;
                        i56 = i64;
                    } else {
                        jArr4 = jArr2;
                        i14 = i57;
                        zzhbhVar2 = zzhbhVar6;
                        zzhbhVar3 = zzhbhVar;
                        iArr6 = iArr13;
                        iArr7 = iArr3;
                    }
                    i57 = i14 + 1;
                    jArr2 = jArr4;
                    zzhbhVar = zzhbhVar3;
                    iArr3 = iArr7;
                    iArr13 = iArr6;
                    zzhbhVar6 = zzhbhVar2;
                }
                long[] jArr10 = jArr2;
                zzhbh zzhbhVar7 = zzhbhVar6;
                zzhbh zzhbhVar8 = zzhbhVar;
                int[] iArr14 = iArr13;
                int[] iArr15 = iArr3;
                int i65 = i58;
                boolean z11 = z10 | (i65 != i13);
                long[] jArr11 = z11 ? new long[i65] : jArr10;
                int[] iArr16 = z11 ? new int[i65] : iArr15;
                if (true == z11) {
                    i9 = 0;
                }
                int[] iArr17 = z11 ? new int[i65] : iArr4;
                ArrayList arrayList3 = z11 ? new ArrayList() : arrayList;
                long[] jArr12 = new long[i65];
                int i66 = 0;
                boolean z12 = false;
                int i67 = 0;
                long j22 = 0;
                while (i67 < zzhbhVar8.zzb()) {
                    long zzc13 = zzhbhVar7.zzc(i67);
                    int i68 = iArr12[i67];
                    int i69 = iArr14[i67];
                    if (z11) {
                        int i70 = i69 - i68;
                        z6 = z12;
                        System.arraycopy(jArr10, i68, jArr11, i66, i70);
                        iArr5 = iArr15;
                        System.arraycopy(iArr5, i68, iArr16, i66, i70);
                        System.arraycopy(iArr4, i68, iArr17, i66, i70);
                    } else {
                        z6 = z12;
                        iArr5 = iArr15;
                    }
                    boolean z13 = z6;
                    int i71 = i66;
                    int i72 = i68;
                    int i73 = i9;
                    while (i72 < i69) {
                        int i74 = i73;
                        long zzw7 = zzfm.zzw(j22, 1000000L, zzamwVar3.zzd, RoundingMode.DOWN);
                        int[] iArr18 = iArr12;
                        int i75 = i72;
                        int[] iArr19 = iArr5;
                        zzhbh zzhbhVar9 = zzhbhVar7;
                        ArrayList arrayList4 = arrayList3;
                        int i76 = i67;
                        int[] iArr20 = iArr17;
                        long zzw8 = zzfm.zzw(jArr3[i72] - zzc13, 1000000L, j21, RoundingMode.DOWN);
                        z13 = (!(zzw8 >= 0)) | z13;
                        jArr12[i71] = zzw7 + zzw8;
                        i73 = (!z11 || iArr16[i71] <= i74) ? i74 : iArr19[i75];
                        if (z11 && r28 == 0 && (iArr20[i71] & 1) != 0) {
                            arrayList3 = arrayList4;
                            arrayList3.add(Integer.valueOf(i71));
                        } else {
                            arrayList3 = arrayList4;
                        }
                        i71++;
                        i72 = i75 + 1;
                        iArr12 = iArr18;
                        iArr5 = iArr19;
                        zzhbhVar7 = zzhbhVar9;
                        iArr17 = iArr20;
                        i67 = i76;
                    }
                    int[] iArr21 = iArr5;
                    int i77 = i67;
                    j22 += zzhbhVar8.zzc(i77);
                    i67 = i77 + 1;
                    i9 = i73;
                    i66 = i71;
                    z12 = z13;
                    iArr12 = iArr12;
                    iArr15 = iArr21;
                    iArr17 = iArr17;
                }
                boolean z14 = z12;
                int[] iArr22 = iArr17;
                long zzw9 = zzfm.zzw(j22, 1000000L, zzamwVar3.zzd, RoundingMode.DOWN);
                if (z14) {
                    zzt zza5 = zzamwVar3.zzg.zza();
                    zza5.zzu(true);
                    zzv zzQ3 = zza5.zzQ();
                    zzamv zzamvVar3 = new zzamv(zzamwVar3, null);
                    zzamvVar3.zzg(zzQ3);
                    zzamwVar2 = zzamvVar3.zzo();
                } else {
                    zzamwVar2 = zzamwVar3;
                }
                return new zzamz(zzamwVar2, jArr11, iArr16, i9, jArr12, iArr22, zzhbj.zzf(arrayList3), r28, zzw9, jArr11.length);
            }
        }
        z3 = false;
        ArrayList arrayList22 = new ArrayList();
        if (zzeuVar5 != null) {
        }
        if (z3) {
        }
        j3 = zzamwVar3.zzf;
        if (j3 > 0) {
        }
        long j172 = zzamwVar3.zzc;
        long zzw22 = zzfm.zzw(j, 1000000L, j172, RoundingMode.DOWN);
        int[] zzf2 = zzhbj.zzf(arrayList22);
        zzhbhVar = zzamwVar3.zzi;
        if (zzhbhVar != null) {
        }
    }

    static zzap zzh(zzeu zzeuVar) {
        try {
            zzeuVar.zzk(5);
            int zzB = zzeuVar.zzB();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < zzB; i++) {
                long zzD = zzeuVar.zzD() / 10000;
                if (zzD < 0) {
                    zzD = -9223372036854775807L;
                }
                String zzK = zzeuVar.zzK(zzeuVar.zzs(), StandardCharsets.UTF_8);
                zzajf zzajfVar = new zzajf();
                zzajfVar.zza(zzD);
                zzajfVar.zzd(new zzx(null, zzK));
                arrayList.add(zzajfVar.zze());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new zzap(arrayList);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static zzap zzi(zzeu zzeuVar) {
        short zzv = zzeuVar.zzv();
        zzeuVar.zzk(2);
        String zzK = zzeuVar.zzK(zzv, StandardCharsets.UTF_8);
        int max = Math.max(zzK.lastIndexOf(43), zzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzgc(Float.parseFloat(zzK.substring(0, max)), Float.parseFloat(zzK.substring(max, zzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzj(zzeu zzeuVar) {
        zzeuVar.zzh(16);
        return zzeuVar.zzB();
    }

    private static int zzk(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728 || i == 1937072752) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static zzalo zzl(zzeu zzeuVar) {
        long j;
        String str;
        zzeuVar.zzh(8);
        int zza2 = zza(zzeuVar.zzB());
        zzeuVar.zzk(zza2 == 0 ? 8 : 16);
        long zzz = zzeuVar.zzz();
        int zzg = zzeuVar.zzg();
        int i = 0;
        while (true) {
            int i2 = zza2 == 0 ? 4 : 8;
            if (i >= i2) {
                zzeuVar.zzk(i2);
                break;
            }
            if (zzeuVar.zzi()[zzg + i] != -1) {
                long zzz2 = zza2 == 0 ? zzeuVar.zzz() : zzeuVar.zzJ();
                if (zzz2 != 0) {
                    j = zzfm.zzw(zzz2, 1000000L, zzz, RoundingMode.DOWN);
                }
            } else {
                i++;
            }
        }
        j = -9223372036854775807L;
        int zzt = zzeuVar.zzt();
        char[] cArr = {(char) (((zzt >> 10) & 31) + 96), (char) (((zzt >> 5) & 31) + 96), (char) ((zzt & 31) + 96)};
        for (int i3 = 0; i3 < 3; i3++) {
            char c = cArr[i3];
            if (c < 'a' || c > 'z') {
                str = null;
                break;
            }
        }
        str = new String(cArr);
        return new zzalo(zzz, j, str);
    }

    private static String zzm(byte[] bArr, int i, int i2) {
        zzguk.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int zze = zzhbj.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            String str = zzfm.zza;
            int i4 = ((zze >> 8) & 255) + RangingPosition.RSSI_UNKNOWN;
            int i5 = (zze >> 16) & 255;
            int max = Math.max(0, Math.min(((i4 * 14075) / 10000) + i5, 255)) << 16;
            int i6 = (zze & 255) + RangingPosition.RSSI_UNKNOWN;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i5 + ((i6 * 17790) / 10000), 255)) | max | (Math.max(0, Math.min((i5 - ((i6 * 3455) / 10000)) - ((i4 * 7169) / 10000), 255)) << 8))));
        }
        String zzd = zzgue.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 7 + String.valueOf(i2).length() + 10 + zzd.length() + 1);
        sb.append("size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("\npalette: ");
        sb.append(zzd);
        sb.append("\n");
        return sb.toString();
    }

    private static zzi zzn(zzeu zzeuVar) {
        zzh zzhVar = new zzh();
        byte[] zzi = zzeuVar.zzi();
        zzet zzetVar = new zzet(zzi, zzi.length);
        zzetVar.zzf(zzeuVar.zzg() * 8);
        zzetVar.zzo(1);
        int zzj = zzetVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzetVar.zzo(1);
            int zzj2 = zzetVar.zzj(8);
            for (int i2 = 0; i2 < zzj2; i2++) {
                zzetVar.zzh(6);
                boolean zzi2 = zzetVar.zzi();
                zzetVar.zzg();
                zzetVar.zzo(11);
                zzetVar.zzh(4);
                int zzj3 = zzetVar.zzj(4) + 8;
                zzhVar.zze(zzj3);
                zzhVar.zzf(zzj3);
                zzetVar.zzo(1);
                if (zzi2) {
                    int zzj4 = zzetVar.zzj(8);
                    int zzj5 = zzetVar.zzj(8);
                    zzetVar.zzo(1);
                    boolean zzi3 = zzetVar.zzi();
                    zzhVar.zza(zzi.zzb(zzj4));
                    zzhVar.zzb(true != zzi3 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(zzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void zzp(zzeu zzeuVar, int i, int i2, int i3, zzalr zzalrVar) {
        zzeuVar.zzh(i2 + 16);
        if (i == 1835365492) {
            zzeuVar.zzM((char) 0);
            String zzM = zzeuVar.zzM((char) 0);
            if (zzM != null) {
                zzt zztVar = new zzt();
                zztVar.zzb(i3);
                zztVar.zzo(zzM);
                zzalrVar.zzb = zztVar.zzQ();
                return;
            }
            return;
        }
        if (i == 1769222965) {
            int zzs = zzeuVar.zzs();
            byte[] bArr = new byte[zzs];
            zzeuVar.zzm(bArr, 0, zzs);
            zzt zztVar2 = new zzt();
            zztVar2.zzb(i3);
            zztVar2.zzo("application/x-itut-t35");
            zztVar2.zzr(zzgxm.zzj(bArr));
            zzalrVar.zzb = zztVar2.zzQ();
        }
    }

    private static Pair zzq(zzfz zzfzVar) {
        zzga zzc = zzfzVar.zzc(1701606260);
        if (zzc == null) {
            return null;
        }
        zzeu zzeuVar = zzc.zza;
        zzeuVar.zzh(8);
        int zza2 = zza(zzeuVar.zzB());
        int zzH = zzeuVar.zzH();
        zzhbg zza3 = zzhbh.zza(zzH);
        zzhbg zza4 = zzhbh.zza(zzH);
        for (int i = 0; i < zzH; i++) {
            zza3.zza(zza2 == 1 ? zzeuVar.zzJ() : zzeuVar.zzz());
            zza4.zza(zza2 == 1 ? zzeuVar.zzD() : zzeuVar.zzB());
            if (zzeuVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzeuVar.zzk(2);
        }
        return Pair.create(zza3.zzb(), zza4.zzb());
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x0154, code lost:
    
        if (r12 == (-1)) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzr(zzeu zzeuVar, int i, int i2, int i3, int i4, String str, boolean z, zzq zzqVar, zzalr zzalrVar, int i5) throws zzat {
        int i6;
        int zzB;
        int i7;
        int i8;
        int i9;
        String str2;
        zzalr zzalrVar2;
        int i10;
        int i11;
        String str3;
        int i12;
        int i13;
        String str4;
        int i14;
        String str5;
        boolean z2;
        boolean z3;
        int i15 = i;
        int i16 = i2;
        int i17 = i3;
        zzq zzqVar2 = zzqVar;
        zzalr zzalrVar3 = zzalrVar;
        zzeuVar.zzh(i16 + 16);
        if (z) {
            i6 = zzeuVar.zzt();
            zzeuVar.zzk(6);
        } else {
            zzeuVar.zzk(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int zzt = zzeuVar.zzt();
            zzeuVar.zzk(6);
            int zzF = zzeuVar.zzF();
            zzeuVar.zzh(zzeuVar.zzg() - 4);
            zzB = zzeuVar.zzB();
            if (i6 == 1) {
                zzeuVar.zzk(16);
            }
            i7 = zzt;
            i8 = zzF;
            i9 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzeuVar.zzk(16);
            i8 = (int) Math.round(Double.longBitsToDouble(zzeuVar.zzD()));
            i7 = zzeuVar.zzH();
            zzeuVar.zzk(4);
            int zzH = zzeuVar.zzH();
            int zzH2 = zzeuVar.zzH();
            int i18 = zzH2 & 1;
            int i19 = zzH2 & 2;
            if (i18 != 0) {
                i9 = zzfm.zzD(zzH, i19 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            } else {
                i9 = zzfm.zzC(zzH, i19 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            }
            if (i9 == 0) {
                i9 = -1;
            }
            zzeuVar.zzk(8);
            zzB = 0;
        }
        if (i15 == 1767992678) {
            i8 = -1;
            i7 = -1;
        } else {
            if (i15 == 1935764850) {
                i8 = 8000;
            } else if (i15 == 1935767394) {
                i8 = 16000;
                i15 = 1935767394;
            }
            i7 = 1;
        }
        int zzg = zzeuVar.zzg();
        int i20 = 1701733217;
        if (i15 == 1701733217) {
            Pair zzu = zzu(zzeuVar, i16, i17);
            if (zzu != null) {
                i20 = ((Integer) zzu.first).intValue();
                zzqVar2 = zzqVar2 == null ? null : zzqVar2.zzb(((zzamx) zzu.second).zzb);
                zzalrVar3.zza[i5] = (zzamx) zzu.second;
            }
            i15 = i20;
            zzeuVar.zzh(zzg);
        }
        String str6 = "audio/mhm1";
        if (i15 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i15 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i15 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i15 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i15 == 1685353320 || i15 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i15 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i15 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i15 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i15 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i15 != 1936684916) {
                if (i15 == 1953984371) {
                    i9 = 268435456;
                } else if (i15 != 1819304813) {
                    if (i15 == 778924082 || i15 == 778924083) {
                        str2 = "audio/mpeg";
                    } else if (i15 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i15 == 1835560241) {
                        str2 = "audio/mhm1";
                    } else if (i15 == 1634492771) {
                        str2 = "audio/alac";
                    } else if (i15 == 1634492791) {
                        str2 = "audio/g711-alaw";
                    } else if (i15 == 1970037111) {
                        str2 = "audio/g711-mlaw";
                    } else if (i15 == 1332770163) {
                        str2 = "audio/opus";
                    } else if (i15 == 1716281667) {
                        str2 = "audio/flac";
                    } else if (i15 == 1835823201) {
                        str2 = "audio/true-hd";
                    } else if (i15 == 1767992678) {
                        str2 = "audio/iamf";
                        i15 = 1767992678;
                    } else {
                        str2 = null;
                    }
                }
                str2 = "audio/raw";
            }
            str2 = "audio/raw";
            i9 = 2;
        }
        int i21 = i9;
        String str7 = null;
        List list = null;
        zzalm zzalmVar = null;
        zzalk zzalkVar = null;
        while (zzg - i16 < i17) {
            zzeuVar.zzh(zzg);
            int zzB2 = zzeuVar.zzB();
            String str8 = "childAtomSize must be positive";
            zzagl.zza(zzB2 > 0, "childAtomSize must be positive");
            int zzB3 = zzeuVar.zzB();
            int i22 = i8;
            if (zzB3 == 1835557187) {
                zzeuVar.zzh(zzg + 8);
                zzeuVar.zzk(1);
                int zzs = zzeuVar.zzs();
                zzeuVar.zzk(1);
                String format = Objects.equals(str2, str6) ? String.format("mhm1.%02X", Integer.valueOf(zzs)) : String.format("mha1.%02X", Integer.valueOf(zzs));
                int zzt2 = zzeuVar.zzt();
                byte[] bArr = new byte[zzt2];
                str7 = format;
                zzeuVar.zzm(bArr, 0, zzt2);
                if (list == null) {
                    list = zzgxm.zzj(bArr);
                    zzalrVar2 = zzalrVar3;
                    i10 = zzB2;
                    i11 = zzB;
                    str3 = str6;
                    i8 = i22;
                    str4 = str7;
                    zzg += i10;
                    i16 = i2;
                    zzalrVar3 = zzalrVar2;
                    str7 = str4;
                    str6 = str3;
                    zzB = i11;
                    i17 = i3;
                } else {
                    list = zzgxm.zzk(bArr, (byte[]) list.get(0));
                    zzalrVar2 = zzalrVar3;
                    i10 = zzB2;
                    i11 = zzB;
                    str3 = str6;
                }
            } else {
                if (zzB3 == 1835557200) {
                    zzeuVar.zzh(zzg + 8);
                    int zzs2 = zzeuVar.zzs();
                    if (zzs2 > 0) {
                        byte[] bArr2 = new byte[zzs2];
                        zzeuVar.zzm(bArr2, 0, zzs2);
                        if (list == null) {
                            list = zzgxm.zzj(bArr2);
                            zzalrVar2 = zzalrVar3;
                            i10 = zzB2;
                            i11 = zzB;
                            str3 = str6;
                            str4 = str7;
                            i8 = i22;
                            zzg += i10;
                            i16 = i2;
                            zzalrVar3 = zzalrVar2;
                            str7 = str4;
                            str6 = str3;
                            zzB = i11;
                            i17 = i3;
                        } else {
                            list = zzgxm.zzk((byte[]) list.get(0), bArr2);
                            zzalrVar2 = zzalrVar3;
                            i10 = zzB2;
                            i11 = zzB;
                            str3 = str6;
                        }
                    } else {
                        zzalrVar2 = zzalrVar3;
                        i10 = zzB2;
                        i11 = zzB;
                        str3 = str6;
                        i8 = i22;
                    }
                } else {
                    if (zzB3 == 1702061171) {
                        zzalrVar2 = zzalrVar3;
                        i10 = zzB2;
                        i11 = zzB;
                        str3 = str6;
                        i8 = i22;
                        i12 = zzg;
                        i13 = -1;
                    } else if (z && zzB3 == 2002876005) {
                        int zzg2 = zzeuVar.zzg();
                        if (zzg2 >= zzg) {
                            i14 = zzg2;
                            str5 = null;
                            z2 = true;
                        } else {
                            i14 = zzg2;
                            str5 = null;
                            z2 = false;
                        }
                        zzagl.zza(z2, str5);
                        i12 = i14;
                        while (true) {
                            if (i12 - zzg >= zzB2) {
                                str3 = str6;
                                zzalrVar2 = zzalrVar3;
                                i10 = zzB2;
                                i11 = zzB;
                                i8 = i22;
                                i12 = -1;
                                break;
                            }
                            zzeuVar.zzh(i12);
                            int zzB4 = zzeuVar.zzB();
                            if (zzB4 > 0) {
                                str3 = str6;
                                z3 = true;
                            } else {
                                str3 = str6;
                                z3 = false;
                            }
                            zzagl.zza(z3, str8);
                            String str9 = str8;
                            if (zzeuVar.zzB() == 1702061171) {
                                zzalrVar2 = zzalrVar3;
                                i10 = zzB2;
                                i11 = zzB;
                                i8 = i22;
                                break;
                            }
                            i12 += zzB4;
                            str6 = str3;
                            str8 = str9;
                        }
                        i13 = -1;
                    } else {
                        str3 = str6;
                        if (zzB3 == 1651798644) {
                            zzalkVar = zzt(zzeuVar, zzg);
                        } else {
                            if (zzB3 == 1684103987) {
                                zzeuVar.zzh(zzg + 8);
                                zzalrVar3.zzb = zzafh.zza(zzeuVar, Integer.toString(i4), str, zzqVar2);
                            } else if (zzB3 == 1684366131) {
                                zzeuVar.zzh(zzg + 8);
                                zzalrVar3.zzb = zzafh.zzb(zzeuVar, Integer.toString(i4), str, zzqVar2);
                            } else if (zzB3 == 1684103988) {
                                zzeuVar.zzh(zzg + 8);
                                zzalrVar3.zzb = zzafk.zza(zzeuVar, Integer.toString(i4), str, zzqVar2);
                            } else if (zzB3 != 1684892784) {
                                if (zzB3 == 1684305011 || zzB3 == 1969517683) {
                                    i10 = zzB2;
                                    i11 = zzB;
                                    zzt zztVar = new zzt();
                                    zztVar.zzb(i4);
                                    zztVar.zzo(str2);
                                    zztVar.zzH(i7);
                                    i8 = i22;
                                    zztVar.zzJ(i8);
                                    zztVar.zzs(zzqVar2);
                                    zztVar.zze(str);
                                    zzalrVar2 = zzalrVar;
                                    zzalrVar2.zzb = zztVar.zzQ();
                                } else if (zzB3 == 1682927731) {
                                    int i23 = zzB2 - 8;
                                    byte[] bArr3 = zzb;
                                    int length = bArr3.length;
                                    byte[] copyOf = Arrays.copyOf(bArr3, length + i23);
                                    zzeuVar.zzh(zzg + 8);
                                    zzeuVar.zzm(copyOf, length, i23);
                                    list = zzgy.zza(copyOf);
                                } else if (zzB3 == 1684425825) {
                                    byte[] bArr4 = new byte[zzB2 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    zzeuVar.zzh(zzg + 12);
                                    zzeuVar.zzm(bArr4, 4, zzB2 - 12);
                                    list = zzgxm.zzj(bArr4);
                                } else if (zzB3 == 1634492771) {
                                    int i24 = zzB2 - 12;
                                    byte[] bArr5 = new byte[i24];
                                    zzeuVar.zzh(zzg + 12);
                                    zzeuVar.zzm(bArr5, 0, i24);
                                    int i25 = zzdr.zza;
                                    zzeu zzeuVar2 = new zzeu(bArr5);
                                    zzeuVar2.zzh(5);
                                    int zzs3 = zzeuVar2.zzs();
                                    zzeuVar2.zzh(9);
                                    int zzs4 = zzeuVar2.zzs();
                                    zzeuVar2.zzh(20);
                                    int[] iArr = {zzeuVar2.zzH(), zzs4, zzs3};
                                    int i26 = iArr[0];
                                    int i27 = iArr[1];
                                    int zzC = zzfm.zzC(zzs3, ByteOrder.LITTLE_ENDIAN);
                                    if (zzC == 0) {
                                        zzC = -1;
                                    }
                                    list = zzgxm.zzj(bArr5);
                                    i7 = i27;
                                    zzalrVar2 = zzalrVar3;
                                    i10 = zzB2;
                                    i21 = zzC;
                                    i11 = zzB;
                                    i8 = i26;
                                } else {
                                    if (zzB3 == 1767990114) {
                                        zzeuVar.zzh(zzg + 9);
                                        int zza2 = zzhbj.zza(zzeuVar.zzP());
                                        byte[] bArr6 = new byte[zza2];
                                        zzeuVar.zzm(bArr6, 0, zza2);
                                        int i28 = zzdr.zza;
                                        zzeu zzeuVar3 = new zzeu(bArr6);
                                        String str10 = null;
                                        String str11 = null;
                                        while (zzeuVar3.zzd() > 0 && (str10 == null || str11 == null)) {
                                            int zzs5 = zzeuVar3.zzs();
                                            int i29 = zzs5 >> 3;
                                            int i30 = zzs5 & 2;
                                            int i31 = zzs5 & 1;
                                            int zza3 = zzhbj.zza(zzeuVar3.zzP());
                                            int i32 = zzB;
                                            if (i29 > 4 && i29 < 24 && i30 != 0) {
                                                zzeuVar3.zzQ();
                                                zzeuVar3.zzQ();
                                            }
                                            if (i31 != 0) {
                                                zzeuVar3.zzk(zzhbj.zza(zzeuVar3.zzP()));
                                            }
                                            int zzg3 = zzeuVar3.zzg() + zza3;
                                            int i33 = zzB2;
                                            if (i29 == 31) {
                                                zzeuVar3.zzk(4);
                                                Object[] objArr = {Integer.valueOf(zzeuVar3.zzs()), Integer.valueOf(zzeuVar3.zzs())};
                                                String str12 = zzfm.zza;
                                                str10 = String.format(Locale.US, "iamf.%03X.%03X", objArr);
                                            } else if (i29 == 0) {
                                                zzeuVar3.zzQ();
                                                String zzK = zzeuVar3.zzK(4, StandardCharsets.UTF_8);
                                                if (zzK.equals("mp4a")) {
                                                    zzeuVar3.zzQ();
                                                    zzeuVar3.zzk(2);
                                                    zzet zzetVar = new zzet();
                                                    zzetVar.zza(zzeuVar3);
                                                    int zzj = zzetVar.zzj(5);
                                                    if (zzj == 31) {
                                                        zzj = zzetVar.zzj(6) + 32;
                                                    }
                                                    StringBuilder sb = new StringBuilder(zzK.length() + 4 + String.valueOf(zzj).length());
                                                    sb.append(zzK);
                                                    sb.append(".40.");
                                                    sb.append(zzj);
                                                    zzK = sb.toString();
                                                }
                                                str11 = zzK;
                                                zzeuVar3.zzh(zzg3);
                                                zzB2 = i33;
                                                zzB = i32;
                                            }
                                            zzeuVar3.zzh(zzg3);
                                            zzB2 = i33;
                                            zzB = i32;
                                        }
                                        i10 = zzB2;
                                        i11 = zzB;
                                        if (str10 == null || str11 == null) {
                                            str4 = null;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder(str10.length() + 1 + str11.length());
                                            sb2.append(str10);
                                            sb2.append(".");
                                            sb2.append(str11);
                                            str4 = sb2.toString();
                                        }
                                        list = zzgxm.zzj(bArr6);
                                        zzalrVar2 = zzalrVar;
                                    } else {
                                        i10 = zzB2;
                                        i11 = zzB;
                                        if (zzB3 == 1885564227) {
                                            zzeuVar.zzh(zzg + 12);
                                            ByteOrder byteOrder = (zzeuVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int zzs6 = zzeuVar.zzs();
                                            int zzC2 = i15 == 1768973165 ? zzfm.zzC(zzs6, byteOrder) : i15 == 1718641517 ? zzfm.zzD(zzs6, byteOrder) : i21;
                                            if (zzC2 == 0) {
                                                zzC2 = -1;
                                            }
                                            if (zzC2 != -1) {
                                                zzalrVar2 = zzalrVar;
                                                str4 = str7;
                                                i21 = zzC2;
                                                str2 = "audio/raw";
                                            } else {
                                                zzalrVar2 = zzalrVar;
                                                str4 = str7;
                                                i21 = zzC2;
                                            }
                                        } else {
                                            zzalrVar2 = zzalrVar;
                                            i8 = i22;
                                        }
                                    }
                                    i8 = i22;
                                    zzg += i10;
                                    i16 = i2;
                                    zzalrVar3 = zzalrVar2;
                                    str7 = str4;
                                    str6 = str3;
                                    zzB = i11;
                                    i17 = i3;
                                }
                                str4 = str7;
                                zzg += i10;
                                i16 = i2;
                                zzalrVar3 = zzalrVar2;
                                str7 = str4;
                                str6 = str3;
                                zzB = i11;
                                i17 = i3;
                            } else {
                                if (zzB <= 0) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(zzB).length() + 49);
                                    sb3.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb3.append(zzB);
                                    throw zzat.zzb(sb3.toString(), null);
                                }
                                zzalrVar2 = zzalrVar3;
                                i10 = zzB2;
                                i8 = zzB;
                                i11 = i8;
                                i7 = 2;
                            }
                            zzalrVar2 = zzalrVar3;
                            i10 = zzB2;
                            i11 = zzB;
                            i8 = i22;
                        }
                        zzalrVar2 = zzalrVar3;
                        i10 = zzB2;
                        i11 = zzB;
                    }
                    if (i12 != i13) {
                        zzalmVar = zzs(zzeuVar, i12);
                        String zza4 = zzalmVar.zza();
                        byte[] zzb2 = zzalmVar.zzb();
                        if (zzb2 != null) {
                            if ("audio/vorbis".equals(zza4)) {
                                int i34 = zzahv.zza;
                                zzeu zzeuVar4 = new zzeu(zzb2);
                                int i35 = 1;
                                zzeuVar4.zzk(1);
                                int i36 = 0;
                                while (zzeuVar4.zzd() > 0 && zzeuVar4.zzn() == 255) {
                                    zzeuVar4.zzk(i35);
                                    i36 += 255;
                                    i35 = 1;
                                }
                                int zzs7 = i36 + zzeuVar4.zzs();
                                int i37 = 0;
                                while (zzeuVar4.zzd() > 0 && zzeuVar4.zzn() == 255) {
                                    zzeuVar4.zzk(1);
                                    i37 += 255;
                                }
                                int zzs8 = i37 + zzeuVar4.zzs();
                                byte[] bArr7 = new byte[zzs7];
                                int zzg4 = zzeuVar4.zzg();
                                System.arraycopy(zzb2, zzg4, bArr7, 0, zzs7);
                                int i38 = zzg4 + zzs7 + zzs8;
                                int length2 = zzb2.length - i38;
                                byte[] bArr8 = new byte[length2];
                                System.arraycopy(zzb2, i38, bArr8, 0, length2);
                                list = zzgxm.zzk(bArr7, bArr8);
                            } else {
                                if ("audio/mp4a-latm".equals(zza4)) {
                                    zzafe zza5 = zzaff.zza(zzb2);
                                    i8 = zza5.zza;
                                    i7 = zza5.zzb;
                                    str4 = zza5.zzc;
                                } else {
                                    str4 = str7;
                                }
                                list = zzgxm.zzj(zzb2);
                                str2 = zza4;
                                zzg += i10;
                                i16 = i2;
                                zzalrVar3 = zzalrVar2;
                                str7 = str4;
                                str6 = str3;
                                zzB = i11;
                                i17 = i3;
                            }
                        }
                        str4 = str7;
                        str2 = zza4;
                        zzg += i10;
                        i16 = i2;
                        zzalrVar3 = zzalrVar2;
                        str7 = str4;
                        str6 = str3;
                        zzB = i11;
                        i17 = i3;
                    }
                    str4 = str7;
                    zzg += i10;
                    i16 = i2;
                    zzalrVar3 = zzalrVar2;
                    str7 = str4;
                    str6 = str3;
                    zzB = i11;
                    i17 = i3;
                }
                str4 = str7;
                zzg += i10;
                i16 = i2;
                zzalrVar3 = zzalrVar2;
                str7 = str4;
                str6 = str3;
                zzB = i11;
                i17 = i3;
            }
            i8 = i22;
            str4 = str7;
            zzg += i10;
            i16 = i2;
            zzalrVar3 = zzalrVar2;
            str7 = str4;
            str6 = str3;
            zzB = i11;
            i17 = i3;
        }
        zzalr zzalrVar4 = zzalrVar3;
        if (zzalrVar4.zzb != null || str2 == null) {
            return;
        }
        zzt zztVar2 = new zzt();
        zztVar2.zzb(i4);
        zztVar2.zzo(str2);
        zztVar2.zzk(str7);
        zztVar2.zzH(i7);
        zztVar2.zzJ(i8);
        zztVar2.zzK(i21);
        zztVar2.zzr(list);
        zztVar2.zzs(zzqVar2);
        zztVar2.zze(str);
        if (zzalmVar != null) {
            zztVar2.zzi(zzhbj.zzb(zzalmVar.zzc()));
            zztVar2.zzj(zzhbj.zzb(zzalmVar.zzd()));
        } else if (zzalkVar != null) {
            zztVar2.zzi(zzhbj.zzb(zzalkVar.zza()));
            zztVar2.zzj(zzhbj.zzb(zzalkVar.zzb()));
        }
        zzalrVar4.zzb = zztVar2.zzQ();
    }

    private static zzalm zzs(zzeu zzeuVar, int i) {
        zzeuVar.zzh(i + 12);
        zzeuVar.zzk(1);
        zzv(zzeuVar);
        zzeuVar.zzk(2);
        int zzs = zzeuVar.zzs();
        if ((zzs & 128) != 0) {
            zzeuVar.zzk(2);
        }
        if ((zzs & 64) != 0) {
            zzeuVar.zzk(zzeuVar.zzs());
        }
        if ((zzs & 32) != 0) {
            zzeuVar.zzk(2);
        }
        zzeuVar.zzk(1);
        zzv(zzeuVar);
        String zze = zzas.zze(zzeuVar.zzs());
        if ("audio/mpeg".equals(zze) || "audio/vnd.dts".equals(zze) || "audio/vnd.dts.hd".equals(zze)) {
            return new zzalm(zze, null, -1L, -1L);
        }
        zzeuVar.zzk(4);
        long zzz = zzeuVar.zzz();
        long zzz2 = zzeuVar.zzz();
        zzeuVar.zzk(1);
        int zzv = zzv(zzeuVar);
        byte[] bArr = new byte[zzv];
        zzeuVar.zzm(bArr, 0, zzv);
        return new zzalm(zze, bArr, zzz2 <= 0 ? -1L : zzz2, zzz > 0 ? zzz : -1L);
    }

    private static zzalk zzt(zzeu zzeuVar, int i) {
        zzeuVar.zzh(i + 8);
        zzeuVar.zzk(4);
        return new zzalk(zzeuVar.zzz(), zzeuVar.zzz());
    }

    private static Pair zzu(zzeu zzeuVar, int i, int i2) throws zzat {
        Integer num;
        zzamx zzamxVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzg = zzeuVar.zzg();
        while (zzg - i < i2) {
            zzeuVar.zzh(zzg);
            int zzB = zzeuVar.zzB();
            zzagl.zza(zzB > 0, "childAtomSize must be positive");
            if (zzeuVar.zzB() == 1936289382) {
                int i5 = zzg + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - zzg < zzB) {
                    zzeuVar.zzh(i5);
                    int zzB2 = zzeuVar.zzB();
                    int zzB3 = zzeuVar.zzB();
                    if (zzB3 == 1718775137) {
                        num2 = Integer.valueOf(zzeuVar.zzB());
                    } else if (zzB3 == 1935894637) {
                        zzeuVar.zzk(4);
                        str = zzeuVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (zzB3 == 1935894633) {
                        i7 = i5;
                        i6 = zzB2;
                    }
                    i5 += zzB2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzagl.zza(num2 != null, "frma atom is mandatory");
                    zzagl.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            zzamxVar = null;
                            break;
                        }
                        zzeuVar.zzh(i8);
                        int zzB4 = zzeuVar.zzB();
                        if (zzeuVar.zzB() == 1952804451) {
                            int zza2 = zza(zzeuVar.zzB());
                            zzeuVar.zzk(1);
                            if (zza2 == 0) {
                                zzeuVar.zzk(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzs = zzeuVar.zzs();
                                int i9 = (zzs & 240) >> 4;
                                i3 = zzs & 15;
                                i4 = i9;
                            }
                            boolean z = zzeuVar.zzs() == 1;
                            int zzs2 = zzeuVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzeuVar.zzm(bArr2, 0, 16);
                            if (z && zzs2 == 0) {
                                int zzs3 = zzeuVar.zzs();
                                byte[] bArr3 = new byte[zzs3];
                                zzeuVar.zzm(bArr3, 0, zzs3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzamxVar = new zzamx(z, str, zzs2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzB4;
                        }
                    }
                    zzagl.zza(zzamxVar != null, "tenc atom is mandatory");
                    String str2 = zzfm.zza;
                    create = Pair.create(num, zzamxVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzg += zzB;
        }
        return null;
    }

    private static int zzv(zzeu zzeuVar) {
        int zzs = zzeuVar.zzs();
        int i = zzs & 127;
        while ((zzs & 128) == 128) {
            zzs = zzeuVar.zzs();
            i = (i << 7) | (zzs & 127);
        }
        return i;
    }
}
