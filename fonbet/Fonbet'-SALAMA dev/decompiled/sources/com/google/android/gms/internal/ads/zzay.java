package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzay {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(String str, String str2) {
        char c3;
        zzax zzc2;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c3 = '\n';
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
                return 9;
            case 1:
                if (str2 == null || (zzc2 = zzc(str2)) == null) {
                    return 0;
                }
                return zzc2.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            default:
                return 0;
        }
    }

    public static int zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzh(str)) {
            return 1;
        }
        if (zzj(str)) {
            return 2;
        }
        if ("text".equals(zzk(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (zzi(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = zzb.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str2 = ((zzaw) zzb.get(i7)).zza;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static zzax zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new zzax(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String zzd(int i7) {
        if (i7 == 32) {
            return "video/mp4v-es";
        }
        if (i7 == 33) {
            return "video/avc";
        }
        if (i7 == 35) {
            return "video/hevc";
        }
        if (i7 == 64) {
            return "audio/mp4a-latm";
        }
        if (i7 == 163) {
            return "video/wvc1";
        }
        if (i7 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i7 == 221) {
            return "audio/vorbis";
        }
        if (i7 == 165) {
            return "audio/ac3";
        }
        if (i7 == 166) {
            return "audio/eac3";
        }
        switch (i7) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i7) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zze(String str) {
        char c3;
        if (str == null) {
            return null;
        }
        String zza2 = zzfsn.zza(str);
        switch (zza2.hashCode()) {
            case -1833600100:
                if (zza2.equals("video/x-mvhevc")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1007807498:
                if (zza2.equals("audio/x-flac")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -979095690:
                if (zza2.equals("application/x-mpegurl")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -586683234:
                if (zza2.equals("audio/x-wav")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -432836268:
                if (zza2.equals("audio/mpeg-l1")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -432836267:
                if (zza2.equals("audio/mpeg-l2")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 187090231:
                if (zza2.equals("audio/mp3")) {
                    c3 = 2;
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
                return "video/mv-hevc";
            case 1:
                return "audio/flac";
            case 2:
                return "audio/mpeg";
            case 3:
                return "audio/wav";
            case 4:
                return "application/x-mpegURL";
            case 5:
                return "audio/mpeg-L1";
            case 6:
                return "audio/mpeg-L2";
            default:
                return zza2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzf(String str, String str2) {
        char c3;
        zzax zzc2;
        int zza2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case '\n':
                if (str2 != null && (zzc2 = zzc(str2)) != null && (zza2 = zzc2.zza()) != 0 && zza2 != 16) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0202 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzg(String str, String str2) {
        String str3;
        zzax zzc2;
        String str4 = null;
        if (str != null) {
            int i7 = zzen.zza;
            String[] split = TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            StringBuilder sb = new StringBuilder();
            for (String str5 : split) {
                if (str5 != null) {
                    String zza2 = zzfsn.zza(str5.trim());
                    if (zza2.startsWith("avc1") || zza2.startsWith("avc3")) {
                        str3 = "video/avc";
                    } else if (zza2.startsWith("hev1") || zza2.startsWith("hvc1")) {
                        str3 = "video/hevc";
                    } else if (zza2.startsWith("dvav") || zza2.startsWith("dva1") || zza2.startsWith("dvhe") || zza2.startsWith("dvh1")) {
                        str3 = "video/dolby-vision";
                    } else if (zza2.startsWith("av01")) {
                        str3 = "video/av01";
                    } else if (zza2.startsWith("vp9") || zza2.startsWith("vp09")) {
                        str3 = "video/x-vnd.on2.vp9";
                    } else if (zza2.startsWith("vp8") || zza2.startsWith("vp08")) {
                        str3 = "video/x-vnd.on2.vp8";
                    } else if (zza2.startsWith("mp4a")) {
                        str3 = (!zza2.startsWith("mp4a.") || (zzc2 = zzc(zza2)) == null) ? null : zzd(zzc2.zza);
                        if (str3 == null) {
                            str3 = "audio/mp4a-latm";
                        }
                    } else if (zza2.startsWith("mha1")) {
                        str3 = "audio/mha1";
                    } else if (zza2.startsWith("mhm1")) {
                        str3 = "audio/mhm1";
                    } else if (zza2.startsWith("ac-3") || zza2.startsWith("dac3")) {
                        str3 = "audio/ac3";
                    } else if (zza2.startsWith("ec-3") || zza2.startsWith("dec3")) {
                        str3 = "audio/eac3";
                    } else if (zza2.startsWith("ec+3")) {
                        str3 = "audio/eac3-joc";
                    } else if (zza2.startsWith("ac-4") || zza2.startsWith("dac4")) {
                        str3 = "audio/ac4";
                    } else if (zza2.startsWith("dtsc")) {
                        str3 = "audio/vnd.dts";
                    } else if (zza2.startsWith("dtse")) {
                        str3 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (zza2.startsWith("dtsh") || zza2.startsWith("dtsl")) {
                        str3 = "audio/vnd.dts.hd";
                    } else if (zza2.startsWith("dtsx")) {
                        str3 = "audio/vnd.dts.uhd;profile=p2";
                    } else if (zza2.startsWith("opus")) {
                        str3 = "audio/opus";
                    } else if (zza2.startsWith("vorbis")) {
                        str3 = "audio/vorbis";
                    } else if (zza2.startsWith("flac")) {
                        str3 = "audio/flac";
                    } else if (zza2.startsWith("stpp")) {
                        str3 = "application/ttml+xml";
                    } else if (zza2.startsWith("wvtt")) {
                        str3 = "text/vtt";
                    } else if (zza2.contains("cea708")) {
                        str3 = "application/cea-708";
                    } else if (zza2.contains("eia608") || zza2.contains("cea608")) {
                        str3 = "application/cea-608";
                    } else {
                        int size = zzb.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            String str6 = ((zzaw) zzb.get(i8)).zzb;
                            if (zza2.startsWith(null)) {
                                break;
                            }
                        }
                    }
                    if (str2.equals(str3)) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(str5);
                    }
                }
                str3 = null;
                if (str2.equals(str3)) {
                }
            }
            if (sb.length() > 0) {
                str4 = sb.toString();
            }
        }
        return str4 != null;
    }

    public static boolean zzh(String str) {
        return "audio".equals(zzk(str));
    }

    public static boolean zzi(String str) {
        return "image".equals(zzk(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean zzj(String str) {
        return RRWebVideoEvent.EVENT_TAG.equals(zzk(str));
    }

    private static String zzk(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
