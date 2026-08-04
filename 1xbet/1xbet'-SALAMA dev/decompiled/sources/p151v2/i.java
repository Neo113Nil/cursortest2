package p151v2;

import B1.l;
import Y4.D;
import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f17115a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f17116b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrM = t.M(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrM) {
            if (str2.equals(c(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int b(String str, String str2) {
        l lVarE;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (lVarE = e(str2)) == null) {
                    return 0;
                }
                return lVarE.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        l lVarE;
        String strD = null;
        if (str == null) {
            return null;
        }
        String strA0 = D.a0(str.trim());
        if (strA0.startsWith("avc1") || strA0.startsWith("avc3")) {
            return "video/avc";
        }
        if (strA0.startsWith("hev1") || strA0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strA0.startsWith("dvav") || strA0.startsWith("dva1") || strA0.startsWith("dvhe") || strA0.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strA0.startsWith("av01")) {
            return "video/av01";
        }
        if (strA0.startsWith("vp9") || strA0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strA0.startsWith("vp8") || strA0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strA0.startsWith("mp4a")) {
            if (strA0.startsWith("mp4a.") && (lVarE = e(strA0)) != null) {
                strD = d(lVarE.f1011b);
            }
            return strD == null ? "audio/mp4a-latm" : strD;
        }
        if (strA0.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strA0.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strA0.startsWith("ac-3") || strA0.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strA0.startsWith("ec-3") || strA0.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strA0.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strA0.startsWith("ac-4") || strA0.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strA0.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strA0.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strA0.startsWith("dtsh") || strA0.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strA0.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strA0.startsWith("opus")) {
            return "audio/opus";
        }
        if (strA0.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strA0.startsWith("flac")) {
            return "audio/flac";
        }
        if (strA0.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strA0.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strA0.contains("cea708")) {
            return "application/cea-708";
        }
        if (strA0.contains("eia608") || strA0.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f17115a;
        if (arrayList.size() <= 0) {
            return null;
        }
        throw k.c(arrayList, 0);
    }

    public static String d(int i7) {
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

    public static l e(String str) {
        Matcher matcher = f17116b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new l(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 3);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if ("image".equals(f(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f17115a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        throw k.c(arrayList, 0);
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        return "text".equals(f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean j(String str) {
        return RRWebVideoEvent.EVENT_TAG.equals(f(str));
    }
}
