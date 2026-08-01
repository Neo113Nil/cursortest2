package com.google.android.gms.internal.ads;

import android.R;
import android.util.Pair;
import androidx.compose.material.MenuKt;
import androidx.compose.material.TextFieldImplKt;
import androidx.core.view.InputDeviceCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.zxing.pdf417.PDF417Common;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdr {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static zzgxm zza(byte b, byte b2, byte b3, byte b4) {
        return zzgxm.zzj(new byte[]{1, 1, b, 2, 1, b2, 3, 1, b3, 4, 1, b4});
    }

    public static String zzb(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzc(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        int i5;
        Object[] objArr = {zzc[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = zzfm.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzguk.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b = bArr[0];
        zzguk.zzd(b == 1, "Invalid APV CSD version: %s", b);
        Object[] objArr = {Integer.valueOf(zzdr$$ExternalSyntheticBackport0.m(bArr[5])), Integer.valueOf(zzdr$$ExternalSyntheticBackport0.m(bArr[6])), Integer.valueOf(zzdr$$ExternalSyntheticBackport0.m(bArr[7]))};
        String str = zzfm.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    public static Pair zze(zzv zzvVar) {
        zzdq zzf = zzf(zzvVar);
        if (zzf == null || !zzf.zzc()) {
            return null;
        }
        return new Pair(Integer.valueOf(zzf.zza()), Integer.valueOf(zzf.zzb()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x07be, code lost:
    
        if (r2.equals("L48") != false) goto L434;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0464  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzdq zzf(zzv zzvVar) {
        char c;
        int i;
        int i2;
        int parseInt;
        int parseInt2;
        int i3;
        int i4;
        Integer num;
        zzdq zzdqVar;
        int i5;
        int i6;
        int i7;
        int i8;
        char c2;
        int i9;
        int i10;
        Integer num2;
        Integer num3;
        String str = zzvVar.zzk;
        if (str != null) {
            String[] split = str.split("\\.");
            int i11 = 16;
            int i12 = 8;
            int i13 = 3;
            int i14 = 1;
            if (!"video/dolby-vision".equals(zzvVar.zzp)) {
                String str2 = split[0];
                switch (str2.hashCode()) {
                    case 2986313:
                        if (str2.equals("ac-4")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3001066:
                        if (str2.equals("apv1")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3004662:
                        if (str2.equals("av01")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006243:
                        if (str2.equals("avc1")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006244:
                        if (str2.equals("avc2")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3199032:
                        if (str2.equals("hev1")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3214780:
                        if (str2.equals("hvc1")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3224753:
                        if (str2.equals("iamf")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3356560:
                        if (str2.equals("mp4a")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3475740:
                        if (str2.equals("s263")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3624515:
                        if (str2.equals("vp09")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3631854:
                        if (str2.equals("vvc1")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3632040:
                        if (str2.equals("vvi1")) {
                            c = 7;
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
                        String str3 = zzvVar.zzk;
                        if (split.length >= 3) {
                            try {
                                int parseInt3 = Integer.parseInt(split[1]);
                                int parseInt4 = Integer.parseInt(split[2]);
                                switch (parseInt3) {
                                    case 0:
                                        i = 1;
                                        break;
                                    case 1:
                                        i = 2;
                                        break;
                                    case 2:
                                        i = 4;
                                        break;
                                    case 3:
                                        i = 8;
                                        break;
                                    case 4:
                                        i = 16;
                                        break;
                                    case 5:
                                        i = 32;
                                        break;
                                    case 6:
                                        i = 64;
                                        break;
                                    case 7:
                                        i = 128;
                                        break;
                                    case 8:
                                        i = 256;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                if (i == -1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(parseInt3).length() + 22);
                                    sb.append("Unknown H263 profile: ");
                                    sb.append(parseInt3);
                                    zzeh.zzc("CodecSpecificDataUtil", sb.toString());
                                    return zzdq.zza;
                                }
                                if (parseInt4 == 10) {
                                    i12 = 1;
                                } else if (parseInt4 == 20) {
                                    i12 = 2;
                                } else if (parseInt4 == 30) {
                                    i12 = 4;
                                } else if (parseInt4 != 40) {
                                    i12 = parseInt4 != 45 ? parseInt4 != 50 ? parseInt4 != 60 ? parseInt4 != 70 ? -1 : 128 : 64 : 32 : 16;
                                }
                                if (i12 != -1) {
                                    return new zzdq(i, i12);
                                }
                                StringBuilder sb2 = new StringBuilder(String.valueOf(parseInt4).length() + 20);
                                sb2.append("Unknown H263 level: ");
                                sb2.append(parseInt4);
                                zzeh.zzc("CodecSpecificDataUtil", sb2.toString());
                                return zzdq.zza;
                            } catch (NumberFormatException unused) {
                                String.valueOf(str3);
                                zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str3)));
                                break;
                            }
                        } else {
                            String.valueOf(str3);
                            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str3)));
                            break;
                        }
                    case 1:
                    case 2:
                        String str4 = zzvVar.zzk;
                        int length = split.length;
                        if (length >= 2) {
                            try {
                                if (split[1].length() != 6) {
                                    i2 = 4;
                                    if (length < 3) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 37);
                                        sb3.append("Ignoring malformed AVC codec string: ");
                                        sb3.append(str4);
                                        zzeh.zzc("CodecSpecificDataUtil", sb3.toString());
                                        break;
                                    } else {
                                        parseInt = Integer.parseInt(split[1]);
                                        parseInt2 = Integer.parseInt(split[2]);
                                    }
                                } else {
                                    parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                    i2 = 4;
                                    parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                                }
                                int i15 = parseInt != 66 ? parseInt != 77 ? parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : i2 : 2 : 1;
                                if (i15 == -1) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(parseInt).length() + 21);
                                    sb4.append("Unknown AVC profile: ");
                                    sb4.append(parseInt);
                                    zzeh.zzc("CodecSpecificDataUtil", sb4.toString());
                                    return zzdq.zza;
                                }
                                switch (parseInt2) {
                                    case 10:
                                        i3 = 1;
                                        break;
                                    case 11:
                                        i3 = i2;
                                        break;
                                    case 12:
                                        i3 = 8;
                                        break;
                                    case 13:
                                        i3 = 16;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 20:
                                                i3 = 32;
                                                break;
                                            case 21:
                                                i3 = 64;
                                                break;
                                            case 22:
                                                i3 = 128;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 30:
                                                        i3 = 256;
                                                        break;
                                                    case 31:
                                                        i3 = 512;
                                                        break;
                                                    case 32:
                                                        i3 = 1024;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 40:
                                                                i3 = 2048;
                                                                break;
                                                            case 41:
                                                                i3 = 4096;
                                                                break;
                                                            case 42:
                                                                i3 = 8192;
                                                                break;
                                                            default:
                                                                switch (parseInt2) {
                                                                    case 50:
                                                                        i3 = 16384;
                                                                        break;
                                                                    case 51:
                                                                        i3 = 32768;
                                                                        break;
                                                                    case 52:
                                                                        i3 = 65536;
                                                                        break;
                                                                    default:
                                                                        i3 = -1;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                                if (i3 != -1) {
                                    return new zzdq(i15, i3);
                                }
                                StringBuilder sb5 = new StringBuilder(String.valueOf(parseInt2).length() + 19);
                                sb5.append("Unknown AVC level: ");
                                sb5.append(parseInt2);
                                zzeh.zzc("CodecSpecificDataUtil", sb5.toString());
                                return zzdq.zza;
                            } catch (NumberFormatException unused2) {
                                String.valueOf(str4);
                                zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                                break;
                            }
                        } else {
                            String.valueOf(str4);
                            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                            break;
                        }
                    case 3:
                        int i16 = 2048;
                        String str5 = zzvVar.zzk;
                        if (split.length >= 3) {
                            try {
                                int parseInt5 = Integer.parseInt(split[1]);
                                int parseInt6 = Integer.parseInt(split[2]);
                                int i17 = parseInt5 != 0 ? parseInt5 != 1 ? parseInt5 != 2 ? parseInt5 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i17 == -1) {
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(parseInt5).length() + 21);
                                    sb6.append("Unknown VP9 profile: ");
                                    sb6.append(parseInt5);
                                    zzeh.zzc("CodecSpecificDataUtil", sb6.toString());
                                    return zzdq.zza;
                                }
                                if (parseInt6 == 10) {
                                    i16 = 1;
                                } else if (parseInt6 == 11) {
                                    i16 = 2;
                                } else if (parseInt6 == 20) {
                                    i16 = 4;
                                } else if (parseInt6 == 21) {
                                    i16 = 8;
                                } else if (parseInt6 == 30) {
                                    i16 = 16;
                                } else if (parseInt6 == 31) {
                                    i16 = 32;
                                } else if (parseInt6 == 40) {
                                    i16 = 64;
                                } else if (parseInt6 == 41) {
                                    i16 = 128;
                                } else if (parseInt6 == 50) {
                                    i16 = 256;
                                } else if (parseInt6 != 51) {
                                    switch (parseInt6) {
                                        case 60:
                                            break;
                                        case 61:
                                            i16 = 4096;
                                            break;
                                        case 62:
                                            i16 = 8192;
                                            break;
                                        default:
                                            i16 = -1;
                                            break;
                                    }
                                } else {
                                    i16 = 512;
                                }
                                if (i16 != -1) {
                                    return new zzdq(i17, i16);
                                }
                                StringBuilder sb7 = new StringBuilder(String.valueOf(parseInt6).length() + 19);
                                sb7.append("Unknown VP9 level: ");
                                sb7.append(parseInt6);
                                zzeh.zzc("CodecSpecificDataUtil", sb7.toString());
                                return zzdq.zza;
                            } catch (NumberFormatException unused3) {
                                String.valueOf(str5);
                                zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                                break;
                            }
                        } else {
                            String.valueOf(str5);
                            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                            break;
                        }
                    case 4:
                    case 5:
                        return zzg(zzvVar.zzk, split, zzvVar.zzG);
                    case 6:
                    case 7:
                        String str6 = zzvVar.zzk;
                        zzi zziVar = zzvVar.zzG;
                        if (split.length >= 3) {
                            try {
                                int parseInt7 = Integer.parseInt(split[1]);
                                if (parseInt7 == 1) {
                                    i4 = (zziVar == null || zziVar.zzd != 6) ? (zziVar == null || zziVar.zzf != 8) ? 2 : 1 : 4096;
                                } else {
                                    if (parseInt7 != 65) {
                                        String str7 = split[1];
                                        String.valueOf(str7);
                                        zzeh.zzc("CodecSpecificDataUtil", "Unknown VVC profile IDC: ".concat(String.valueOf(str7)));
                                        return zzdq.zza;
                                    }
                                    i4 = 4;
                                }
                                String str8 = split[2];
                                switch (str8.hashCode()) {
                                    case 70918:
                                        if (str8.equals("H64")) {
                                            i13 = 6;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 70921:
                                        if (str8.equals("H67")) {
                                            i13 = 8;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 70976:
                                        if (str8.equals("H80")) {
                                            i13 = 10;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 70979:
                                        if (str8.equals("H83")) {
                                            i13 = 12;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 70982:
                                        if (str8.equals("H86")) {
                                            i13 = 14;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 71013:
                                        if (str8.equals("H96")) {
                                            i13 = 16;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74609:
                                        if (str8.equals("L16")) {
                                            i13 = 0;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74667:
                                        if (str8.equals("L32")) {
                                            i13 = 1;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74670:
                                        if (str8.equals("L35")) {
                                            i13 = 2;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74704:
                                        break;
                                    case 74728:
                                        if (str8.equals("L51")) {
                                            i13 = 4;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74762:
                                        if (str8.equals("L64")) {
                                            i13 = 5;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74765:
                                        if (str8.equals("L67")) {
                                            i13 = 7;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74820:
                                        if (str8.equals("L80")) {
                                            i13 = 9;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74823:
                                        if (str8.equals("L83")) {
                                            i13 = 11;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74826:
                                        if (str8.equals("L86")) {
                                            i13 = 13;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 74857:
                                        if (str8.equals("L96")) {
                                            i13 = 15;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 2193610:
                                        if (str8.equals("H112")) {
                                            i13 = 18;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 2193647:
                                        if (str8.equals("H128")) {
                                            i13 = 20;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 2193705:
                                        if (str8.equals("H144")) {
                                            i13 = 22;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 2312774:
                                        if (str8.equals("L112")) {
                                            i13 = 17;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 2312811:
                                        if (str8.equals("L128")) {
                                            i13 = 19;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    case 2312869:
                                        if (str8.equals("L144")) {
                                            i13 = 21;
                                            break;
                                        }
                                        i13 = -1;
                                        break;
                                    default:
                                        i13 = -1;
                                        break;
                                }
                                switch (i13) {
                                    case 0:
                                        num = 1;
                                        break;
                                    case 1:
                                        num = 2;
                                        break;
                                    case 2:
                                        num = 4;
                                        break;
                                    case 3:
                                        num = 8;
                                        break;
                                    case 4:
                                        num = 16;
                                        break;
                                    case 5:
                                        num = 32;
                                        break;
                                    case 6:
                                        num = 64;
                                        break;
                                    case 7:
                                        num = 128;
                                        break;
                                    case 8:
                                        num = 256;
                                        break;
                                    case 9:
                                        num = 512;
                                        break;
                                    case 10:
                                        num = 1024;
                                        break;
                                    case 11:
                                        num = 2048;
                                        break;
                                    case 12:
                                        num = 4096;
                                        break;
                                    case 13:
                                        num = 8192;
                                        break;
                                    case 14:
                                        num = 16384;
                                        break;
                                    case 15:
                                        num = 32768;
                                        break;
                                    case 16:
                                        num = 65536;
                                        break;
                                    case 17:
                                        num = 131072;
                                        break;
                                    case 18:
                                        num = 262144;
                                        break;
                                    case 19:
                                        num = 524288;
                                        break;
                                    case 20:
                                        num = 1048576;
                                        break;
                                    case 21:
                                        num = 2097152;
                                        break;
                                    case 22:
                                        num = 4194304;
                                        break;
                                    default:
                                        num = null;
                                        break;
                                }
                                if (num != null) {
                                    zzdqVar = new zzdq(i4, num.intValue());
                                    return zzdqVar;
                                }
                                String.valueOf(str8);
                                zzeh.zzc("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(String.valueOf(str8)));
                                return zzdq.zza;
                            } catch (NumberFormatException unused4) {
                                String.valueOf(str6);
                                zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: ".concat(String.valueOf(str6)));
                                break;
                            }
                        } else {
                            String.valueOf(str6);
                            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: ".concat(String.valueOf(str6)));
                            break;
                        }
                        break;
                    case '\b':
                        String str9 = zzvVar.zzk;
                        zzi zziVar2 = zzvVar.zzG;
                        if (split.length >= 4) {
                            try {
                                int parseInt8 = Integer.parseInt(split[1]);
                                int parseInt9 = Integer.parseInt(split[2].substring(0, 2));
                                int parseInt10 = Integer.parseInt(split[3]);
                                if (parseInt8 != 0) {
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(parseInt8).length() + 21);
                                    sb8.append("Unknown AV1 profile: ");
                                    sb8.append(parseInt8);
                                    zzeh.zzc("CodecSpecificDataUtil", sb8.toString());
                                    return zzdq.zza;
                                }
                                if (parseInt10 == 8) {
                                    i5 = 1;
                                } else {
                                    if (parseInt10 != 10) {
                                        StringBuilder sb9 = new StringBuilder(String.valueOf(parseInt10).length() + 23);
                                        sb9.append("Unknown AV1 bit depth: ");
                                        sb9.append(parseInt10);
                                        zzeh.zzc("CodecSpecificDataUtil", sb9.toString());
                                        return zzdq.zza;
                                    }
                                    i5 = (zziVar2 == null || !(zziVar2.zze != null || (i7 = zziVar2.zzd) == 7 || i7 == 6)) ? 2 : 4096;
                                }
                                switch (parseInt9) {
                                    case 0:
                                        i6 = 1;
                                        break;
                                    case 1:
                                        i6 = 2;
                                        break;
                                    case 2:
                                        i6 = 4;
                                        break;
                                    case 3:
                                        i6 = 8;
                                        break;
                                    case 4:
                                        i6 = 16;
                                        break;
                                    case 5:
                                        i6 = 32;
                                        break;
                                    case 6:
                                        i6 = 64;
                                        break;
                                    case 7:
                                        i6 = 128;
                                        break;
                                    case 8:
                                        i6 = 256;
                                        break;
                                    case 9:
                                        i6 = 512;
                                        break;
                                    case 10:
                                        i6 = 1024;
                                        break;
                                    case 11:
                                        i6 = 2048;
                                        break;
                                    case 12:
                                        i6 = 4096;
                                        break;
                                    case 13:
                                        i6 = 8192;
                                        break;
                                    case 14:
                                        i6 = 16384;
                                        break;
                                    case 15:
                                        i6 = 32768;
                                        break;
                                    case 16:
                                        i6 = 65536;
                                        break;
                                    case 17:
                                        i6 = 131072;
                                        break;
                                    case 18:
                                        i6 = 262144;
                                        break;
                                    case 19:
                                        i6 = 524288;
                                        break;
                                    case 20:
                                        i6 = 1048576;
                                        break;
                                    case 21:
                                        i6 = 2097152;
                                        break;
                                    case 22:
                                        i6 = 4194304;
                                        break;
                                    case 23:
                                        i6 = 8388608;
                                        break;
                                    default:
                                        i6 = -1;
                                        break;
                                }
                                if (i6 != -1) {
                                    return new zzdq(i5, i6);
                                }
                                StringBuilder sb10 = new StringBuilder(String.valueOf(parseInt9).length() + 19);
                                sb10.append("Unknown AV1 level: ");
                                sb10.append(parseInt9);
                                zzeh.zzc("CodecSpecificDataUtil", sb10.toString());
                                return zzdq.zza;
                            } catch (NumberFormatException unused5) {
                                String.valueOf(str9);
                                zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9)));
                                break;
                            }
                        } else {
                            String.valueOf(str9);
                            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9)));
                            break;
                        }
                        break;
                    case '\t':
                        String str10 = zzvVar.zzk;
                        if (split.length >= 4) {
                            try {
                                int parseInt11 = Integer.parseInt(split[1].substring(4));
                                int parseInt12 = Integer.parseInt(split[2].substring(4));
                                int parseInt13 = Integer.parseInt(split[3].substring(4));
                                if (parseInt11 != 33) {
                                    if (parseInt11 != 44) {
                                        StringBuilder sb11 = new StringBuilder(String.valueOf(parseInt11).length() + 26);
                                        sb11.append("Unrecognized APV profile: ");
                                        sb11.append(parseInt11);
                                        zzeh.zzc("CodecSpecificDataUtil", sb11.toString());
                                        return zzdq.zza;
                                    }
                                    i14 = 8192;
                                }
                                int zzi = zzi(parseInt12, parseInt13);
                                return zzi == -1 ? zzdq.zza : new zzdq(i14, zzi);
                            } catch (NumberFormatException e) {
                                String.valueOf(str10);
                                zzeh.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str10)), e);
                                break;
                            }
                        } else {
                            String.valueOf(str10);
                            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str10)));
                            break;
                        }
                    case '\n':
                        String str11 = zzvVar.zzk;
                        if (split.length == 3) {
                            try {
                                if ("audio/mp4a-latm".equals(zzas.zze(Integer.parseInt(split[1], 16)))) {
                                    int parseInt14 = Integer.parseInt(split[2]);
                                    if (parseInt14 == 17) {
                                        i13 = 17;
                                    } else if (parseInt14 == 20) {
                                        i13 = 20;
                                    } else if (parseInt14 == 23) {
                                        i13 = 23;
                                    } else if (parseInt14 == 29) {
                                        i13 = 29;
                                    } else if (parseInt14 == 39) {
                                        i13 = 39;
                                    } else if (parseInt14 != 42) {
                                        switch (parseInt14) {
                                            case 1:
                                                i13 = 1;
                                                break;
                                            case 2:
                                                i13 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i13 = 4;
                                                break;
                                            case 5:
                                                i13 = 5;
                                                break;
                                            case 6:
                                                i13 = 6;
                                                break;
                                            default:
                                                i13 = -1;
                                                break;
                                        }
                                    } else {
                                        i13 = 42;
                                    }
                                    if (i13 != -1) {
                                        zzdqVar = new zzdq(i13, 0);
                                        return zzdqVar;
                                    }
                                    StringBuilder sb12 = new StringBuilder(29);
                                    sb12.append("Unrecognized MP4A profile: -1");
                                    zzeh.zzc("CodecSpecificDataUtil", sb12.toString());
                                    return zzdq.zza;
                                }
                            } catch (NumberFormatException unused6) {
                                String.valueOf(str11);
                                zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str11)));
                                break;
                            }
                        } else {
                            String.valueOf(str11);
                            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str11)));
                            break;
                        }
                        break;
                    case 11:
                        String str12 = zzvVar.zzk;
                        if (split.length == 4) {
                            try {
                                int parseInt15 = Integer.parseInt(split[1]);
                                int parseInt16 = Integer.parseInt(split[2]);
                                int parseInt17 = Integer.parseInt(split[3]);
                                if (parseInt15 == 0) {
                                    if (parseInt16 == 0) {
                                        i8 = 257;
                                        if (i8 == -1) {
                                        }
                                    }
                                    i8 = -1;
                                    if (i8 == -1) {
                                    }
                                } else if (parseInt15 != 1) {
                                    if (parseInt15 == 2) {
                                        if (parseInt16 == 1) {
                                            i8 = 1026;
                                        } else if (parseInt16 == 2) {
                                            i8 = 1028;
                                        }
                                        if (i8 == -1) {
                                            StringBuilder sb13 = new StringBuilder(String.valueOf(parseInt15).length() + 23 + String.valueOf(parseInt16).length());
                                            sb13.append("Unknown AC-4 profile: ");
                                            sb13.append(parseInt15);
                                            sb13.append(".");
                                            sb13.append(parseInt16);
                                            zzeh.zzc("CodecSpecificDataUtil", sb13.toString());
                                            return zzdq.zza;
                                        }
                                        if (parseInt17 == 0) {
                                            i11 = 1;
                                        } else if (parseInt17 == 1) {
                                            i11 = 2;
                                        } else if (parseInt17 == 2) {
                                            i11 = 4;
                                        } else if (parseInt17 == 3) {
                                            i11 = 8;
                                        } else if (parseInt17 != 4) {
                                            i11 = -1;
                                        }
                                        if (i11 != -1) {
                                            return new zzdq(i8, i11);
                                        }
                                        StringBuilder sb14 = new StringBuilder(String.valueOf(parseInt17).length() + 20);
                                        sb14.append("Unknown AC-4 level: ");
                                        sb14.append(parseInt17);
                                        zzeh.zzc("CodecSpecificDataUtil", sb14.toString());
                                        return zzdq.zza;
                                    }
                                    i8 = -1;
                                    if (i8 == -1) {
                                    }
                                } else {
                                    if (parseInt16 == 0) {
                                        i8 = InputDeviceCompat.SOURCE_DPAD;
                                    } else {
                                        if (parseInt16 == 1) {
                                            i8 = 514;
                                        }
                                        i8 = -1;
                                    }
                                    if (i8 == -1) {
                                    }
                                }
                            } catch (NumberFormatException unused7) {
                                String.valueOf(str12);
                                zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str12)));
                                break;
                            }
                        } else {
                            String.valueOf(str12);
                            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str12)));
                            break;
                        }
                    case '\f':
                        if (split.length >= 4) {
                            try {
                                int parseInt18 = Integer.parseInt(split[1]);
                                String str13 = split[3];
                                switch (str13.hashCode()) {
                                    case 2464863:
                                        if (str13.equals("Opus")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3114792:
                                        if (str13.equals("fLaC")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3238865:
                                        if (str13.equals("ipcm")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3356560:
                                        if (str13.equals("mp4a")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                if (c2 == 0) {
                                    if (parseInt18 == 0) {
                                        i9 = R.attr.label;
                                    } else if (parseInt18 == 1) {
                                        i9 = R.id.checkbox;
                                    } else if (parseInt18 != 2) {
                                        StringBuilder sb15 = new StringBuilder(String.valueOf(parseInt18).length() + 32);
                                        sb15.append("Unrecognized IAMF Opus profile: ");
                                        sb15.append(parseInt18);
                                        zzeh.zzc("CodecSpecificDataUtil", sb15.toString());
                                        i9 = -1;
                                    } else {
                                        i9 = R.string.copy;
                                    }
                                    if (i9 == -1) {
                                    }
                                } else if (c2 == 1) {
                                    if (parseInt18 == 0) {
                                        i9 = R.attr.icon;
                                    } else if (parseInt18 == 1) {
                                        i9 = R.id.content;
                                    } else if (parseInt18 != 2) {
                                        StringBuilder sb16 = new StringBuilder(String.valueOf(parseInt18).length() + 31);
                                        sb16.append("Unrecognized IAMF AAC profile: ");
                                        sb16.append(parseInt18);
                                        zzeh.zzc("CodecSpecificDataUtil", sb16.toString());
                                        i9 = -1;
                                    } else {
                                        i9 = R.string.copyUrl;
                                    }
                                    if (i9 == -1) {
                                    }
                                } else if (c2 != 2) {
                                    if (c2 == 3) {
                                        if (parseInt18 == 0) {
                                            i9 = R.attr.writePermission;
                                        } else if (parseInt18 == 1) {
                                            i9 = R.id.icon2;
                                        } else if (parseInt18 != 2) {
                                            StringBuilder sb17 = new StringBuilder(String.valueOf(parseInt18).length() + 31);
                                            sb17.append("Unrecognized IAMF PCM profile: ");
                                            sb17.append(parseInt18);
                                            zzeh.zzc("CodecSpecificDataUtil", sb17.toString());
                                        } else {
                                            i9 = R.string.httpErrorUnsupportedScheme;
                                        }
                                        return i9 == -1 ? zzdq.zza : new zzdq(i9, 0);
                                    }
                                    String.valueOf(str13);
                                    zzeh.zzc("CodecSpecificDataUtil", "Unrecognized codec identifier for IAMF auxiliary profile: ".concat(String.valueOf(str13)));
                                    i9 = -1;
                                    if (i9 == -1) {
                                    }
                                } else {
                                    if (parseInt18 == 0) {
                                        i9 = R.attr.manageSpaceActivity;
                                    } else if (parseInt18 == 1) {
                                        i9 = R.id.empty;
                                    } else if (parseInt18 != 2) {
                                        StringBuilder sb18 = new StringBuilder(String.valueOf(parseInt18).length() + 32);
                                        sb18.append("Unrecognized IAMF FLAC profile: ");
                                        sb18.append(parseInt18);
                                        zzeh.zzc("CodecSpecificDataUtil", sb18.toString());
                                        i9 = -1;
                                    } else {
                                        i9 = R.string.defaultVoiceMailAlphaTag;
                                    }
                                    if (i9 == -1) {
                                    }
                                }
                            } catch (NumberFormatException e2) {
                                String str14 = split[1];
                                String.valueOf(str14);
                                zzeh.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(str14)), e2);
                                break;
                            }
                        } else {
                            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                            break;
                        }
                }
            } else if (split.length < 3) {
                zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            } else {
                Matcher matcher = zzd.matcher(split[1]);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    group.getClass();
                    int hashCode = group.hashCode();
                    if (hashCode != 1567) {
                        switch (hashCode) {
                            case 1536:
                                if (group.equals("00")) {
                                    num2 = 1;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1537:
                                if (group.equals("01")) {
                                    i10 = 2;
                                    num2 = i10;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1538:
                                if (group.equals("02")) {
                                    num2 = 4;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1539:
                                if (group.equals("03")) {
                                    num2 = 8;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1540:
                                if (group.equals("04")) {
                                    num2 = 16;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1541:
                                if (group.equals("05")) {
                                    num2 = 32;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1542:
                                if (group.equals("06")) {
                                    num2 = 64;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1543:
                                if (group.equals("07")) {
                                    num2 = 128;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1544:
                                if (group.equals("08")) {
                                    num2 = 256;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1545:
                                if (group.equals("09")) {
                                    num2 = 512;
                                    break;
                                }
                                num2 = null;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                    } else {
                        if (group.equals("10")) {
                            i10 = 1024;
                            num2 = i10;
                        }
                        num2 = null;
                    }
                    if (num2 == null) {
                        zzeh.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(group));
                        return zzdq.zza;
                    }
                    String str15 = split[2];
                    int hashCode2 = str15.hashCode();
                    switch (hashCode2) {
                        case 1537:
                            if (str15.equals("01")) {
                                num3 = 1;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1538:
                            if (str15.equals("02")) {
                                num3 = 2;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1539:
                            if (str15.equals("03")) {
                                num3 = 4;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1540:
                            if (str15.equals("04")) {
                                num3 = 8;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1541:
                            if (str15.equals("05")) {
                                num3 = 16;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1542:
                            if (str15.equals("06")) {
                                num3 = 32;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1543:
                            if (str15.equals("07")) {
                                num3 = 64;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1544:
                            if (str15.equals("08")) {
                                num3 = 128;
                                break;
                            }
                            num3 = null;
                            break;
                        case 1545:
                            if (str15.equals("09")) {
                                num3 = 256;
                                break;
                            }
                            num3 = null;
                            break;
                        default:
                            switch (hashCode2) {
                                case 1567:
                                    if (str15.equals("10")) {
                                        num3 = 512;
                                        break;
                                    }
                                    num3 = null;
                                    break;
                                case 1568:
                                    if (str15.equals("11")) {
                                        num3 = 1024;
                                        break;
                                    }
                                    num3 = null;
                                    break;
                                case 1569:
                                    if (str15.equals("12")) {
                                        num3 = 2048;
                                        break;
                                    }
                                    num3 = null;
                                    break;
                                case 1570:
                                    if (str15.equals("13")) {
                                        num3 = 4096;
                                        break;
                                    }
                                    num3 = null;
                                    break;
                                default:
                                    num3 = null;
                                    break;
                            }
                    }
                    if (num3 != null) {
                        return new zzdq(num2.intValue(), num3.intValue());
                    }
                    String.valueOf(str15);
                    zzeh.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str15)));
                } else {
                    zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b5, code lost:
    
        if (r11.equals("L123") != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzdq zzg(String str, String[] strArr, zzi zziVar) {
        int i;
        Integer num = null;
        if (strArr.length < 4) {
            String.valueOf(str);
            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            String.valueOf(str);
            zzeh.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        char c = 6;
        if ("1".equals(group)) {
            i = 1;
        } else {
            if (!"2".equals(group)) {
                String.valueOf(group);
                zzeh.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return zzdq.zza;
            }
            i = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        switch (str2.hashCode()) {
            case 70821:
                if (str2.equals("H30")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 70914:
                if (str2.equals("H60")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 70917:
                if (str2.equals("H63")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 71007:
                if (str2.equals("H90")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 71010:
                if (str2.equals("H93")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 74665:
                if (str2.equals("L30")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 74758:
                if (str2.equals("L60")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 74761:
                if (str2.equals("L63")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 74851:
                if (str2.equals("L90")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 74854:
                if (str2.equals("L93")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2193639:
                if (str2.equals("H120")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2193642:
                if (str2.equals("H123")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2193732:
                if (str2.equals("H150")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2193735:
                if (str2.equals("H153")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2193738:
                if (str2.equals("H156")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2193825:
                if (str2.equals("H180")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 2193828:
                if (str2.equals("H183")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2193831:
                if (str2.equals("H186")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 2312803:
                if (str2.equals("L120")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2312806:
                break;
            case 2312896:
                if (str2.equals("L150")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2312899:
                if (str2.equals("L153")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2312902:
                if (str2.equals("L156")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2312989:
                if (str2.equals("L180")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2312992:
                if (str2.equals("L183")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2312995:
                if (str2.equals("L186")) {
                    c = '\f';
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
                num = 1;
                break;
            case 1:
                num = 4;
                break;
            case 2:
                num = 16;
                break;
            case 3:
                num = 64;
                break;
            case 4:
                num = 256;
                break;
            case 5:
                num = 1024;
                break;
            case 6:
                num = 4096;
                break;
            case 7:
                num = 16384;
                break;
            case '\b':
                num = 65536;
                break;
            case '\t':
                num = 262144;
                break;
            case '\n':
                num = 1048576;
                break;
            case 11:
                num = 4194304;
                break;
            case '\f':
                num = 16777216;
                break;
            case '\r':
                num = 2;
                break;
            case 14:
                num = 8;
                break;
            case 15:
                num = 32;
                break;
            case 16:
                num = 128;
                break;
            case 17:
                num = 512;
                break;
            case 18:
                num = 2048;
                break;
            case 19:
                num = 8192;
                break;
            case 20:
                num = 32768;
                break;
            case 21:
                num = 131072;
                break;
            case 22:
                num = 524288;
                break;
            case 23:
                num = 2097152;
                break;
            case 24:
                num = 8388608;
                break;
            case 25:
                num = 33554432;
                break;
        }
        if (num != null) {
            return new zzdq(i, num.intValue());
        }
        String.valueOf(str2);
        zzeh.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
        return zzdq.zza;
    }

    public static byte[] zzh(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    private static int zzi(int i, int i2) {
        switch (i) {
            case 30:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb.append("Unrecognized APV band: ");
                                sb.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 33:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb2.append("Unrecognized APV band: ");
                                sb2.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb2.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 60:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb3.append("Unrecognized APV band: ");
                                sb3.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb3.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 63:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb4.append("Unrecognized APV band: ");
                                sb4.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb4.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb5.append("Unrecognized APV band: ");
                                sb5.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb5.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 93:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb6 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb6.append("Unrecognized APV band: ");
                                sb6.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb6.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case MenuKt.InTransitionDuration /* 120 */:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb7 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb7.append("Unrecognized APV band: ");
                                sb7.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb7.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case INVALID_RI_ENDPOINT_VALUE:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb8 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb8.append("Unrecognized APV band: ");
                                sb8.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb8.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case TextFieldImplKt.AnimationDuration /* 150 */:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb9 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb9.append("Unrecognized APV band: ");
                                sb9.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb9.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 153:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb10 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb10.append("Unrecognized APV band: ");
                                sb10.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb10.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 180:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb11 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb11.append("Unrecognized APV band: ");
                                sb11.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb11.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case 183:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb12 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb12.append("Unrecognized APV band: ");
                                sb12.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb12.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case AD_NOT_LOADED_VALUE:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb13 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb13.append("Unrecognized APV band: ");
                                sb13.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb13.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                StringBuilder sb14 = new StringBuilder(String.valueOf(i2).length() + 23);
                                sb14.append("Unrecognized APV band: ");
                                sb14.append(i2);
                                zzeh.zzc("CodecSpecificDataUtil", sb14.toString());
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                StringBuilder sb15 = new StringBuilder(String.valueOf(i).length() + 30);
                sb15.append("Unrecognized APV level index: ");
                sb15.append(i);
                zzeh.zzc("CodecSpecificDataUtil", sb15.toString());
                break;
        }
        return -1;
    }
}
