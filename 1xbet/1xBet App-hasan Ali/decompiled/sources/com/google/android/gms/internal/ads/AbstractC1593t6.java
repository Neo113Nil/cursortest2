package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.t6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1593t6 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f15632a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f15633b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str, String str2) {
        char c5;
        f2.m c6;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c5 = 11;
                    break;
                }
                c5 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (c6 = c(str2)) == null) {
                    return 0;
                }
                return c6.i();
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

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(h(str))) {
            return 1;
        }
        if (g(str)) {
            return 2;
        }
        if ("text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(h(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f15632a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static f2.m c(String str) {
        Matcher matcher = f15633b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            Integer.parseInt(group, 16);
            return new f2.m(group2 != null ? Integer.parseInt(group2) : 0, 1);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
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
                switch (i) {
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
    public static String e(String str) {
        char c5;
        if (str == null) {
            return null;
        }
        String n5 = AbstractC0952et.n(str);
        switch (n5.hashCode()) {
            case -1007807498:
                if (n5.equals("audio/x-flac")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -979095690:
                if (n5.equals("application/x-mpegurl")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -586683234:
                if (n5.equals("audio/x-wav")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -432836268:
                if (n5.equals("audio/mpeg-l1")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -432836267:
                if (n5.equals("audio/mpeg-l2")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 187090231:
                if (n5.equals("audio/mp3")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        return c5 != 0 ? c5 != 1 ? c5 != 2 ? c5 != 3 ? c5 != 4 ? c5 != 5 ? n5 : "audio/mpeg-L2" : "audio/mpeg-L1" : "application/x-mpegURL" : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean f(String str, String str2) {
        char c5;
        f2.m c6;
        int i;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case '\n':
                if (str2 != null && (c6 = c(str2)) != null && (i = c6.i()) != 0 && i != 16) {
                }
                break;
        }
        return false;
    }

    public static boolean g(String str) {
        return "video".equals(h(str));
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
