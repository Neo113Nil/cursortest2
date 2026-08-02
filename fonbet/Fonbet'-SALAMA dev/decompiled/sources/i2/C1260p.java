package i2;

import A1.AbstractC0029l;
import A1.C0045t0;
import A1.X;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u2.C1638o;
import u2.M;
import v2.AbstractC1664a;
import v2.t;
import w1.C1759x1;

/* renamed from: i2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1260p implements M {

    /* renamed from: a, reason: collision with root package name */
    public final C1257m f13978a;

    /* renamed from: b, reason: collision with root package name */
    public final C1254j f13979b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f13955c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f13956d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f13958e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f13960f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f13975x = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f13976y = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f13977z = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f13927A = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f13928B = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f13929C = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f13930D = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f13931E = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f13932F = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f13933G = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f13934H = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f13935I = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f13936J = a("CAN-SKIP-DATERANGES");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f13937K = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: L, reason: collision with root package name */
    public static final Pattern f13938L = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f13939M = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f13940N = a("CAN-BLOCK-RELOAD");

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f13941O = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f13942P = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: Q, reason: collision with root package name */
    public static final Pattern f13943Q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f13944R = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f13945S = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f13946T = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f13947U = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: V, reason: collision with root package name */
    public static final Pattern f13948V = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: W, reason: collision with root package name */
    public static final Pattern f13949W = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f13950X = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f13951Y = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f13952Z = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f13953a0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f13954b0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern c0 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f13957d0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f13959e0 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f13961f0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f13962g0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f13963h0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f13964i0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f13965j0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f13966k0 = a("AUTOSELECT");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f13967l0 = a("DEFAULT");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f13968m0 = a("FORCED");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f13969n0 = a("INDEPENDENT");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f13970o0 = a("GAP");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f13971p0 = a("PRECISE");

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f13972q0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f13973r0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f13974s0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public C1260p(C1257m c1257m, C1254j c1254j) {
        this.f13978a = c1257m;
        this.f13979b = c1254j;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData b(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i7 = 0; i7 < schemeDataArr.length; i7++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i7];
            schemeDataArr2[i7] = new DrmInitData.SchemeData(schemeData.f10558b, schemeData.f10559c, schemeData.f10560d, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    public static DrmInitData.SchemeData d(String str, String str2, HashMap hashMap) {
        String j = j(str, f13953a0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f13954b0;
        if (equals) {
            String k7 = k(str, pattern, hashMap);
            return new DrmInitData.SchemeData(AbstractC0029l.f465d, null, "video/mp4", Base64.decode(k7.substring(k7.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0029l.f465d;
            int i7 = t.f17153a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(D3.f.f1719c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(j)) {
            return null;
        }
        String k8 = k(str, pattern, hashMap);
        byte[] decode = Base64.decode(k8.substring(k8.indexOf(44)), 0);
        UUID uuid2 = AbstractC0029l.f466e;
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", N1.p.a(uuid2, null, decode));
    }

    public static C1254j e(C1257m c1257m, C1254j c1254j, C1759x1 c1759x1, String str) {
        int i7;
        String str2;
        HashMap hashMap;
        HashMap hashMap2;
        C1249e c1249e;
        ArrayList arrayList;
        String str3;
        C1249e c1249e2;
        int i8;
        String str4;
        HashMap hashMap3;
        int i9;
        long j;
        long j3;
        HashMap hashMap4;
        C1251g c1251g;
        DrmInitData drmInitData;
        C1257m c1257m2 = c1257m;
        C1254j c1254j2 = c1254j;
        boolean z4 = c1257m2.f13926c;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C1253i c1253i = new C1253i(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z7 = z4;
        C1253i c1253i2 = c1253i;
        String str6 = "";
        long j7 = -1;
        int i10 = 0;
        boolean z8 = false;
        long j8 = -9223372036854775807L;
        long j9 = 0;
        boolean z9 = false;
        int i11 = 0;
        long j10 = 0;
        int i12 = 1;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        boolean z10 = false;
        DrmInitData drmInitData2 = null;
        long j13 = 0;
        DrmInitData drmInitData3 = null;
        long j14 = 0;
        long j15 = 0;
        boolean z11 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i13 = 0;
        long j16 = 0;
        boolean z12 = false;
        C1251g c1251g2 = null;
        long j17 = 0;
        long j18 = 0;
        ArrayList arrayList6 = arrayList3;
        C1249e c1249e3 = null;
        while (c1759x1.P()) {
            String S6 = c1759x1.S();
            if (S6.startsWith("#EXT")) {
                arrayList5.add(S6);
            }
            if (S6.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k7 = k(S6, f13934H, hashMap5);
                if ("VOD".equals(k7)) {
                    i10 = 1;
                } else if ("EVENT".equals(k7)) {
                    i10 = 2;
                }
            } else if (S6.equals("#EXT-X-I-FRAMES-ONLY")) {
                z12 = true;
            } else {
                if (S6.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long parseDouble = (long) (Double.parseDouble(k(S6, f13946T, Collections.emptyMap())) * 1000000.0d);
                    z8 = g(S6, f13971p0);
                    j8 = parseDouble;
                } else {
                    str2 = str5;
                    if (S6.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double h6 = h(S6, f13935I);
                        long j19 = h6 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h6 * 1000000.0d);
                        boolean g3 = g(S6, f13936J);
                        double h7 = h(S6, f13938L);
                        long j20 = h7 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h7 * 1000000.0d);
                        double h8 = h(S6, f13939M);
                        c1253i2 = new C1253i(j19, j20, h8 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h8 * 1000000.0d), g3, g(S6, f13940N));
                    } else if (S6.startsWith("#EXT-X-PART-INF")) {
                        j12 = (long) (Double.parseDouble(k(S6, f13932F, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = S6.startsWith("#EXT-X-MAP");
                        Pattern pattern = f13948V;
                        boolean z13 = z8;
                        Pattern pattern2 = f13954b0;
                        if (startsWith) {
                            String k8 = k(S6, pattern2, hashMap5);
                            String j21 = j(S6, pattern, null, hashMap5);
                            if (j21 != null) {
                                int i14 = t.f17153a;
                                String[] split = j21.split("@", -1);
                                j7 = Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j13 = Long.parseLong(split[1]);
                                }
                            }
                            if (j7 == -1) {
                                j13 = 0;
                            }
                            if (str7 != null && str8 == null) {
                                throw C0045t0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            c1251g2 = new C1251g(k8, j13, j7, str7, str8);
                            if (j7 != -1) {
                                j13 += j7;
                            }
                            j7 = -1;
                            str5 = str2;
                            z8 = z13;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (S6.startsWith("#EXT-X-TARGETDURATION")) {
                                j11 = Integer.parseInt(k(S6, f13930D, Collections.emptyMap())) * 1000000;
                            } else if (S6.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j14 = Long.parseLong(k(S6, f13941O, Collections.emptyMap()));
                                j10 = j14;
                            } else if (S6.startsWith("#EXT-X-VERSION")) {
                                i12 = Integer.parseInt(k(S6, f13933G, Collections.emptyMap()));
                            } else {
                                if (S6.startsWith("#EXT-X-DEFINE")) {
                                    String j22 = j(S6, f13973r0, null, hashMap5);
                                    if (j22 != null) {
                                        String str10 = (String) c1257m2.f13922l.get(j22);
                                        if (str10 != null) {
                                            hashMap5.put(j22, str10);
                                        }
                                    } else {
                                        hashMap5.put(k(S6, f13962g0, hashMap5), k(S6, f13972q0, hashMap5));
                                    }
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    c1249e = c1249e3;
                                    arrayList = arrayList7;
                                    str3 = str9;
                                } else if (S6.startsWith("#EXTINF")) {
                                    j17 = new BigDecimal(k(S6, f13942P, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    str6 = j(S6, f13943Q, str2, hashMap5);
                                    str5 = str2;
                                    arrayList6 = arrayList7;
                                    z8 = z13;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str11 = str2;
                                    if (S6.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(k(S6, f13937K, Collections.emptyMap()));
                                        AbstractC1664a.h(c1254j2 != null && arrayList2.isEmpty());
                                        int i15 = t.f17153a;
                                        int i16 = (int) (j10 - c1254j2.f13893k);
                                        int i17 = parseInt + i16;
                                        if (i16 >= 0) {
                                            AbstractC0167z abstractC0167z = c1254j2.f13900r;
                                            if (i17 <= abstractC0167z.size()) {
                                                while (i16 < i17) {
                                                    C1251g c1251g3 = (C1251g) abstractC0167z.get(i16);
                                                    if (j10 != c1254j2.f13893k) {
                                                        int i18 = (c1254j2.j - i11) + c1251g3.f13876d;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j23 = j16;
                                                        int i19 = 0;
                                                        while (true) {
                                                            AbstractC0167z abstractC0167z2 = c1251g3.f13870D;
                                                            i8 = i17;
                                                            if (i19 >= abstractC0167z2.size()) {
                                                                break;
                                                            }
                                                            C1249e c1249e4 = (C1249e) abstractC0167z2.get(i19);
                                                            arrayList9.add(new C1249e(c1249e4.f13873a, c1249e4.f13874b, c1249e4.f13875c, i18, j23, c1249e4.f13878f, c1249e4.f13879x, c1249e4.f13880y, c1249e4.f13881z, c1249e4.f13871A, c1249e4.f13872B, c1249e4.f13864C, c1249e4.f13865D));
                                                            j23 += c1249e4.f13875c;
                                                            i19++;
                                                            hashMap6 = hashMap6;
                                                            i17 = i8;
                                                            str11 = str11;
                                                            c1249e3 = c1249e3;
                                                        }
                                                        c1249e2 = c1249e3;
                                                        str4 = str11;
                                                        hashMap3 = hashMap6;
                                                        c1251g3 = new C1251g(c1251g3.f13873a, c1251g3.f13874b, c1251g3.f13869C, c1251g3.f13875c, i18, j16, c1251g3.f13878f, c1251g3.f13879x, c1251g3.f13880y, c1251g3.f13881z, c1251g3.f13871A, c1251g3.f13872B, arrayList9);
                                                    } else {
                                                        c1249e2 = c1249e3;
                                                        i8 = i17;
                                                        str4 = str11;
                                                        hashMap3 = hashMap6;
                                                    }
                                                    arrayList2.add(c1251g3);
                                                    j16 += c1251g3.f13875c;
                                                    long j24 = c1251g3.f13871A;
                                                    if (j24 != -1) {
                                                        j13 = c1251g3.f13881z + j24;
                                                    }
                                                    String str12 = c1251g3.f13880y;
                                                    if (str12 == null || !str12.equals(Long.toHexString(j14))) {
                                                        str8 = str12;
                                                    }
                                                    j14++;
                                                    i16++;
                                                    i13 = c1251g3.f13876d;
                                                    c1251g2 = c1251g3.f13874b;
                                                    drmInitData3 = c1251g3.f13878f;
                                                    str7 = c1251g3.f13879x;
                                                    hashMap6 = hashMap3;
                                                    i17 = i8;
                                                    j15 = j16;
                                                    str11 = str4;
                                                    c1249e3 = c1249e2;
                                                    c1254j2 = c1254j;
                                                }
                                                str2 = str11;
                                                c1257m2 = c1257m;
                                                c1254j2 = c1254j;
                                            }
                                        }
                                        throw new C1259o();
                                    }
                                    c1249e = c1249e3;
                                    str2 = str11;
                                    HashMap hashMap7 = hashMap6;
                                    if (S6.startsWith("#EXT-X-KEY")) {
                                        String k9 = k(S6, f13951Y, hashMap5);
                                        String j25 = j(S6, f13952Z, "identity", hashMap5);
                                        if ("NONE".equals(k9)) {
                                            treeMap.clear();
                                            drmInitData3 = null;
                                            str7 = null;
                                            str8 = null;
                                        } else {
                                            String j26 = j(S6, c0, null, hashMap5);
                                            if (!"identity".equals(j25)) {
                                                String str13 = str9;
                                                if (str13 == null) {
                                                    str9 = ("SAMPLE-AES-CENC".equals(k9) || "SAMPLE-AES-CTR".equals(k9)) ? "cenc" : "cbcs";
                                                } else {
                                                    str9 = str13;
                                                }
                                                DrmInitData.SchemeData d7 = d(S6, j25, hashMap5);
                                                if (d7 != null) {
                                                    treeMap.put(j25, d7);
                                                    str8 = j26;
                                                    drmInitData3 = null;
                                                    str7 = null;
                                                }
                                            } else if ("AES-128".equals(k9)) {
                                                str7 = k(S6, pattern2, hashMap5);
                                                str8 = j26;
                                            }
                                            str8 = j26;
                                            str7 = null;
                                        }
                                        c1257m2 = c1257m;
                                        c1254j2 = c1254j;
                                        hashMap6 = hashMap7;
                                    } else {
                                        str3 = str9;
                                        if (S6.startsWith("#EXT-X-BYTERANGE")) {
                                            String k10 = k(S6, f13947U, hashMap5);
                                            int i20 = t.f17153a;
                                            String[] split2 = k10.split("@", -1);
                                            j7 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j13 = Long.parseLong(split2[1]);
                                            }
                                        } else if (S6.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i11 = Integer.parseInt(S6.substring(S6.indexOf(58) + 1));
                                            c1257m2 = c1257m;
                                            c1254j2 = c1254j;
                                            z9 = true;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                        } else if (S6.equals("#EXT-X-DISCONTINUITY")) {
                                            i13++;
                                        } else if (S6.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j9 == 0) {
                                                j9 = t.E(t.H(S6.substring(S6.indexOf(58) + 1))) - j16;
                                            } else {
                                                hashMap = hashMap5;
                                                arrayList = arrayList7;
                                                hashMap2 = hashMap7;
                                            }
                                        } else if (S6.equals("#EXT-X-GAP")) {
                                            c1257m2 = c1257m;
                                            c1254j2 = c1254j;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z8 = z13;
                                            arrayList5 = arrayList8;
                                            c1249e3 = c1249e;
                                            z11 = true;
                                        } else if (S6.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            c1257m2 = c1257m;
                                            c1254j2 = c1254j;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z8 = z13;
                                            arrayList5 = arrayList8;
                                            c1249e3 = c1249e;
                                            z7 = true;
                                        } else if (S6.equals("#EXT-X-ENDLIST")) {
                                            c1257m2 = c1257m;
                                            c1254j2 = c1254j;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z8 = z13;
                                            arrayList5 = arrayList8;
                                            c1249e3 = c1249e;
                                            z10 = true;
                                        } else {
                                            if (S6.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long i21 = i(S6, f13944R);
                                                Matcher matcher = f13945S.matcher(S6);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i9 = Integer.parseInt(group);
                                                } else {
                                                    i9 = -1;
                                                }
                                                arrayList4.add(new C1250f(Uri.parse(AbstractC1664a.C(str, k(S6, pattern2, hashMap5))), i21, i9));
                                            } else if (S6.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (c1249e == null && "PART".equals(k(S6, f13959e0, hashMap5))) {
                                                    String k11 = k(S6, pattern2, hashMap5);
                                                    long i22 = i(S6, f13949W);
                                                    long i23 = i(S6, f13950X);
                                                    String hexString = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j14);
                                                    if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData4 = new DrmInitData(str3, true, schemeDataArr);
                                                        if (drmInitData2 == null) {
                                                            drmInitData2 = b(str3, schemeDataArr);
                                                        }
                                                        drmInitData3 = drmInitData4;
                                                    }
                                                    if (i22 == -1 || i23 != -1) {
                                                        c1249e = new C1249e(k11, c1251g2, 0L, i13, j15, drmInitData3, str7, hexString, i22 != -1 ? i22 : 0L, i23, false, false, true);
                                                    }
                                                }
                                            } else if (S6.startsWith("#EXT-X-PART")) {
                                                String hexString2 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j14);
                                                String k12 = k(S6, pattern2, hashMap5);
                                                long parseDouble2 = (long) (Double.parseDouble(k(S6, f13931E, Collections.emptyMap())) * 1000000.0d);
                                                boolean g7 = g(S6, f13969n0) | (z7 && arrayList7.isEmpty());
                                                boolean g8 = g(S6, f13970o0);
                                                String j27 = j(S6, pattern, null, hashMap5);
                                                if (j27 != null) {
                                                    int i24 = t.f17153a;
                                                    String[] split3 = j27.split("@", -1);
                                                    j = Long.parseLong(split3[0]);
                                                    if (split3.length > 1) {
                                                        j18 = Long.parseLong(split3[1]);
                                                    }
                                                } else {
                                                    j = -1;
                                                }
                                                if (j == -1) {
                                                    j18 = 0;
                                                }
                                                if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData5 = new DrmInitData(str3, true, schemeDataArr2);
                                                    if (drmInitData2 == null) {
                                                        drmInitData2 = b(str3, schemeDataArr2);
                                                    }
                                                    drmInitData3 = drmInitData5;
                                                }
                                                arrayList7.add(new C1249e(k12, c1251g2, parseDouble2, i13, j15, drmInitData3, str7, hexString2, j18, j, g8, g7, false));
                                                j15 += parseDouble2;
                                                if (j != -1) {
                                                    j18 += j;
                                                }
                                                c1257m2 = c1257m;
                                                c1254j2 = c1254j;
                                                hashMap6 = hashMap7;
                                                str9 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                z8 = z13;
                                                arrayList5 = arrayList8;
                                                c1249e3 = c1249e;
                                            } else {
                                                arrayList = arrayList7;
                                                if (S6.startsWith("#")) {
                                                    hashMap = hashMap5;
                                                    hashMap2 = hashMap7;
                                                } else {
                                                    String hexString3 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j14);
                                                    long j28 = j14 + 1;
                                                    String l7 = l(S6, hashMap5);
                                                    C1251g c1251g4 = (C1251g) hashMap7.get(l7);
                                                    if (j7 == -1) {
                                                        j3 = 0;
                                                    } else {
                                                        if (z12 && c1251g2 == null && c1251g4 == null) {
                                                            c1251g4 = new C1251g(l7, 0L, j13, null, null);
                                                            hashMap7.put(l7, c1251g4);
                                                        }
                                                        j3 = j13;
                                                    }
                                                    if (drmInitData3 != null || treeMap.isEmpty()) {
                                                        hashMap4 = hashMap5;
                                                        c1251g = c1251g4;
                                                        drmInitData = drmInitData3;
                                                    } else {
                                                        hashMap4 = hashMap5;
                                                        c1251g = c1251g4;
                                                        DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        drmInitData = new DrmInitData(str3, true, schemeDataArr3);
                                                        if (drmInitData2 == null) {
                                                            drmInitData2 = b(str3, schemeDataArr3);
                                                        }
                                                    }
                                                    arrayList2.add(new C1251g(l7, c1251g2 != null ? c1251g2 : c1251g, str6, j17, i13, j16, drmInitData, str7, hexString3, j3, j7, z11, arrayList));
                                                    j15 = j16 + j17;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    if (j7 != -1) {
                                                        j3 += j7;
                                                    }
                                                    j13 = j3;
                                                    c1254j2 = c1254j;
                                                    arrayList6 = arrayList10;
                                                    hashMap6 = hashMap7;
                                                    str9 = str3;
                                                    drmInitData3 = drmInitData;
                                                    j7 = -1;
                                                    j16 = j15;
                                                    j14 = j28;
                                                    hashMap5 = hashMap4;
                                                    str5 = str2;
                                                    str6 = str5;
                                                    z8 = z13;
                                                    arrayList5 = arrayList8;
                                                    c1249e3 = c1249e;
                                                    z11 = false;
                                                    j17 = 0;
                                                    c1257m2 = c1257m;
                                                }
                                            }
                                            hashMap = hashMap5;
                                            arrayList = arrayList7;
                                            hashMap2 = hashMap7;
                                        }
                                        c1257m2 = c1257m;
                                        c1254j2 = c1254j;
                                        hashMap6 = hashMap7;
                                        str9 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str5 = str2;
                                    z8 = z13;
                                    arrayList5 = arrayList8;
                                    c1249e3 = c1249e;
                                }
                                c1257m2 = c1257m;
                                c1254j2 = c1254j;
                                hashMap6 = hashMap2;
                                str9 = str3;
                                arrayList6 = arrayList;
                                hashMap5 = hashMap;
                                str5 = str2;
                                z8 = z13;
                                arrayList5 = arrayList8;
                                c1249e3 = c1249e;
                            }
                            arrayList6 = arrayList7;
                            str5 = str2;
                            z8 = z13;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str5 = str2;
            }
        }
        C1249e c1249e5 = c1249e3;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z14 = z8;
        HashMap hashMap8 = new HashMap();
        int i25 = 0;
        while (i25 < arrayList4.size()) {
            C1250f c1250f = (C1250f) arrayList4.get(i25);
            long j29 = c1250f.f13867b;
            if (j29 == -1) {
                j29 = (j10 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int i26 = c1250f.f13868c;
            if (i26 != -1 || j12 == -9223372036854775807L) {
                i7 = 1;
            } else {
                i7 = 1;
                i26 = (arrayList11.isEmpty() ? ((C1251g) AbstractC0158p.f(arrayList2)).f13870D : arrayList11).size() - 1;
            }
            Uri uri = c1250f.f13866a;
            hashMap8.put(uri, new C1250f(uri, j29, i26));
            i25 += i7;
        }
        if (c1249e5 != null) {
            arrayList11.add(c1249e5);
        }
        return new C1254j(i10, str, arrayList12, j8, z14, j9, z9, i11, j10, i12, j11, j12, z7, z10, j9 != 0, drmInitData2, arrayList2, arrayList11, c1253i2, hashMap8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015b, code lost:
    
        if (r8 > 0) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x03b1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1257m f(C1759x1 c1759x1, String str) {
        int i7;
        char c3;
        Pattern pattern;
        ArrayList arrayList;
        ArrayList arrayList2;
        C1256l c1256l;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        int i8;
        int i9;
        C1256l c1256l2;
        String str4;
        C1256l c1256l3;
        HashSet hashSet;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i10;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i11;
        int i12;
        ArrayList arrayList9;
        Uri D7;
        HashMap hashMap;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        boolean z4 = false;
        boolean z7 = false;
        while (true) {
            boolean P7 = c1759x1.P();
            String str6 = "application/x-mpegURL";
            Pattern pattern2 = f13954b0;
            Pattern pattern3 = f13962g0;
            if (!P7) {
                HashMap hashMap4 = hashMap2;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = arrayList12;
                ArrayList arrayList20 = arrayList13;
                ArrayList arrayList21 = arrayList14;
                ArrayList arrayList22 = arrayList15;
                ArrayList arrayList23 = arrayList16;
                ArrayList arrayList24 = arrayList17;
                ArrayList arrayList25 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i13 = 0;
                while (i13 < arrayList10.size()) {
                    C1256l c1256l4 = (C1256l) arrayList10.get(i13);
                    if (hashSet2.add(c1256l4.f13908a)) {
                        X x4 = c1256l4.f13909b;
                        AbstractC1664a.h(x4.f281A == null);
                        ArrayList arrayList26 = (ArrayList) hashMap4.get(c1256l4.f13908a);
                        arrayList26.getClass();
                        Metadata metadata = new Metadata(new HlsTrackMetadataEntry(null, null, arrayList26));
                        Format$Builder a2 = x4.a();
                        a2.f10536i = metadata;
                        hashSet = hashSet2;
                        arrayList25.add(new C1256l(c1256l4.f13908a, new X(a2), c1256l4.f13910c, c1256l4.f13911d, c1256l4.f13912e, c1256l4.f13913f));
                    } else {
                        hashSet = hashSet2;
                    }
                    i13++;
                    hashSet2 = hashSet;
                }
                int i14 = 0;
                X x7 = null;
                ArrayList arrayList27 = null;
                while (i14 < arrayList22.size()) {
                    ArrayList arrayList28 = arrayList22;
                    String str7 = (String) arrayList28.get(i14);
                    String k7 = k(str7, f13963h0, hashMap3);
                    String k8 = k(str7, pattern3, hashMap3);
                    Format$Builder format$Builder = new Format$Builder();
                    format$Builder.f10528a = e1.k.f(k7, ":", k8);
                    format$Builder.f10529b = k8;
                    format$Builder.j = str6;
                    boolean g3 = g(str7, f13967l0);
                    String str8 = str6;
                    boolean z8 = g3;
                    if (g(str7, f13968m0)) {
                        z8 = (g3 ? 1 : 0) | 2;
                    }
                    ?? r14 = z8;
                    if (g(str7, f13966k0)) {
                        r14 = (z8 ? 1 : 0) | 4;
                    }
                    format$Builder.f10531d = r14;
                    String j = j(str7, f13964i0, null, hashMap3);
                    if (TextUtils.isEmpty(j)) {
                        arrayList22 = arrayList28;
                        i7 = 0;
                    } else {
                        int i15 = t.f17153a;
                        arrayList22 = arrayList28;
                        String[] split = j.split(",", -1);
                        i7 = t.l(split, "public.accessibility.describes-video") ? 512 : 0;
                        if (t.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i7 |= 4096;
                        }
                        if (t.l(split, "public.accessibility.describes-music-and-sound")) {
                            i7 |= 1024;
                        }
                        if (t.l(split, "public.easy-to-read")) {
                            i7 |= 8192;
                        }
                    }
                    format$Builder.f10532e = i7;
                    format$Builder.f10530c = j(str7, f13961f0, null, hashMap3);
                    String j3 = j(str7, pattern2, null, hashMap3);
                    Uri D8 = j3 == null ? null : AbstractC1664a.D(str5, j3);
                    Pattern pattern4 = pattern2;
                    Metadata metadata2 = new Metadata(new HlsTrackMetadataEntry(k7, k8, Collections.emptyList()));
                    String k9 = k(str7, f13957d0, hashMap3);
                    switch (k9.hashCode()) {
                        case -959297733:
                            if (k9.equals("SUBTITLES")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -333210994:
                            if (k9.equals("CLOSED-CAPTIONS")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 62628790:
                            if (k9.equals("AUDIO")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 81665115:
                            if (k9.equals("VIDEO")) {
                                c3 = 3;
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
                            pattern = pattern3;
                            arrayList = arrayList19;
                            arrayList2 = arrayList18;
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList10.size()) {
                                    c1256l = (C1256l) arrayList10.get(i16);
                                    if (!k7.equals(c1256l.f13912e)) {
                                        i16++;
                                    }
                                } else {
                                    c1256l = null;
                                }
                            }
                            if (c1256l != null) {
                                String q7 = t.q(3, c1256l.f13909b.f312z);
                                format$Builder.f10535h = q7;
                                str2 = v2.i.c(q7);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            format$Builder.f10537k = str2;
                            format$Builder.f10536i = metadata2;
                            if (D8 != null) {
                                arrayList3 = arrayList20;
                                arrayList3.add(new C1255k(D8, new X(format$Builder), k8));
                            } else {
                                arrayList3 = arrayList20;
                                Log.w("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            i8 = 1;
                            break;
                        case 1:
                            pattern = pattern3;
                            arrayList = arrayList19;
                            arrayList2 = arrayList18;
                            String k10 = k(str7, f13965j0, hashMap3);
                            if (k10.startsWith("CC")) {
                                parseInt = Integer.parseInt(k10.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(k10.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList27 == null) {
                                arrayList27 = new ArrayList();
                            }
                            format$Builder.f10537k = str3;
                            format$Builder.f10526C = parseInt;
                            arrayList27.add(new X(format$Builder));
                            arrayList3 = arrayList20;
                            i8 = 1;
                            break;
                        case 2:
                            arrayList2 = arrayList18;
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList10.size()) {
                                    C1256l c1256l5 = (C1256l) arrayList10.get(i17);
                                    pattern = pattern3;
                                    if (k7.equals(c1256l5.f13911d)) {
                                        c1256l2 = c1256l5;
                                        i9 = 1;
                                    } else {
                                        i17++;
                                        pattern3 = pattern;
                                    }
                                } else {
                                    pattern = pattern3;
                                    i9 = 1;
                                    c1256l2 = null;
                                }
                            }
                            if (c1256l2 != null) {
                                String q8 = t.q(i9, c1256l2.f13909b.f312z);
                                format$Builder.f10535h = q8;
                                str4 = v2.i.c(q8);
                            } else {
                                str4 = null;
                            }
                            String j7 = j(str7, f13977z, null, hashMap3);
                            if (j7 != null) {
                                int i18 = t.f17153a;
                                format$Builder.f10550x = Integer.parseInt(j7.split("/", 2)[0]);
                                if ("audio/eac3".equals(str4) && j7.endsWith("/JOC")) {
                                    format$Builder.f10535h = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            format$Builder.f10537k = str4;
                            if (D8 == null) {
                                arrayList = arrayList19;
                                if (c1256l2 != null) {
                                    x7 = new X(format$Builder);
                                    arrayList3 = arrayList20;
                                    i8 = 1;
                                    break;
                                }
                            } else {
                                format$Builder.f10536i = metadata2;
                                arrayList = arrayList19;
                                arrayList.add(new C1255k(D8, new X(format$Builder), k8));
                            }
                            arrayList3 = arrayList20;
                            i8 = 1;
                            break;
                        case 3:
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList10.size()) {
                                    c1256l3 = (C1256l) arrayList10.get(i19);
                                    if (!k7.equals(c1256l3.f13910c)) {
                                        i19++;
                                    }
                                } else {
                                    c1256l3 = null;
                                }
                            }
                            if (c1256l3 != null) {
                                X x8 = c1256l3.f13909b;
                                String q9 = t.q(2, x8.f312z);
                                format$Builder.f10535h = q9;
                                format$Builder.f10537k = v2.i.c(q9);
                                format$Builder.f10542p = x8.f288H;
                                format$Builder.f10543q = x8.f289I;
                                format$Builder.f10544r = x8.f290J;
                            }
                            if (D8 != null) {
                                format$Builder.f10536i = metadata2;
                                arrayList2 = arrayList18;
                                arrayList2.add(new C1255k(D8, new X(format$Builder), k8));
                                pattern = pattern3;
                                arrayList3 = arrayList20;
                                arrayList = arrayList19;
                                i8 = 1;
                                break;
                            }
                        default:
                            pattern = pattern3;
                            arrayList3 = arrayList20;
                            arrayList = arrayList19;
                            arrayList2 = arrayList18;
                            i8 = 1;
                            break;
                    }
                    i14 += i8;
                    str5 = str;
                    arrayList19 = arrayList;
                    arrayList20 = arrayList3;
                    arrayList18 = arrayList2;
                    str6 = str8;
                    pattern2 = pattern4;
                    pattern3 = pattern;
                }
                ArrayList arrayList29 = arrayList20;
                ArrayList arrayList30 = arrayList19;
                ArrayList arrayList31 = arrayList18;
                if (z7) {
                    arrayList27 = Collections.emptyList();
                }
                return new C1257m(str, arrayList24, arrayList25, arrayList31, arrayList30, arrayList29, arrayList21, x7, arrayList27, z4, hashMap3, arrayList23);
            }
            String S6 = c1759x1.S();
            if (S6.startsWith("#EXT")) {
                arrayList17.add(S6);
            }
            boolean startsWith = S6.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList32 = arrayList14;
            if (S6.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(k(S6, pattern3, hashMap3), k(S6, f13972q0, hashMap3));
            } else {
                if (S6.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    hashMap = hashMap2;
                    arrayList8 = arrayList11;
                    arrayList7 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList9 = arrayList15;
                    arrayList4 = arrayList16;
                    arrayList5 = arrayList17;
                    z4 = true;
                } else if (S6.startsWith("#EXT-X-MEDIA")) {
                    arrayList15.add(S6);
                } else if (S6.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData d7 = d(S6, j(S6, f13952Z, "identity", hashMap3), hashMap3);
                    if (d7 != null) {
                        String k11 = k(S6, f13951Y, hashMap3);
                        arrayList16.add(new DrmInitData(("SAMPLE-AES-CENC".equals(k11) || "SAMPLE-AES-CTR".equals(k11)) ? "cenc" : "cbcs", true, d7));
                    }
                } else if (S6.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    z7 |= S6.contains("CLOSED-CAPTIONS=NONE");
                    int i20 = startsWith ? 16384 : 0;
                    arrayList4 = arrayList16;
                    int parseInt2 = Integer.parseInt(k(S6, f13976y, Collections.emptyMap()));
                    Matcher matcher = f13955c.matcher(S6);
                    if (matcher.find()) {
                        arrayList5 = arrayList17;
                        String group = matcher.group(1);
                        group.getClass();
                        i10 = Integer.parseInt(group);
                    } else {
                        arrayList5 = arrayList17;
                        i10 = -1;
                    }
                    arrayList6 = arrayList13;
                    String j8 = j(S6, f13927A, null, hashMap3);
                    arrayList7 = arrayList12;
                    String j9 = j(S6, f13928B, null, hashMap3);
                    if (j9 != null) {
                        int i21 = t.f17153a;
                        arrayList8 = arrayList11;
                        String[] split2 = j9.split("x", -1);
                        i11 = Integer.parseInt(split2[0]);
                        i12 = Integer.parseInt(split2[1]);
                        if (i11 > 0) {
                        }
                    } else {
                        arrayList8 = arrayList11;
                    }
                    i11 = -1;
                    i12 = -1;
                    arrayList9 = arrayList15;
                    String j10 = j(S6, f13929C, null, hashMap3);
                    float parseFloat = j10 != null ? Float.parseFloat(j10) : -1.0f;
                    HashMap hashMap5 = hashMap2;
                    String j11 = j(S6, f13956d, null, hashMap3);
                    String j12 = j(S6, f13958e, null, hashMap3);
                    String j13 = j(S6, f13960f, null, hashMap3);
                    String j14 = j(S6, f13975x, null, hashMap3);
                    if (startsWith) {
                        D7 = AbstractC1664a.D(str5, k(S6, pattern2, hashMap3));
                    } else {
                        if (!c1759x1.P()) {
                            throw C0045t0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        D7 = AbstractC1664a.D(str5, l(c1759x1.S(), hashMap3));
                    }
                    Format$Builder format$Builder2 = new Format$Builder();
                    format$Builder2.f10528a = Integer.toString(arrayList10.size());
                    format$Builder2.j = "application/x-mpegURL";
                    format$Builder2.f10535h = j8;
                    format$Builder2.f10533f = i10;
                    format$Builder2.f10534g = parseInt2;
                    format$Builder2.f10542p = i11;
                    format$Builder2.f10543q = i12;
                    format$Builder2.f10544r = parseFloat;
                    format$Builder2.f10532e = i20;
                    arrayList10.add(new C1256l(D7, new X(format$Builder2), j11, j12, j13, j14));
                    hashMap = hashMap5;
                    ArrayList arrayList33 = (ArrayList) hashMap.get(D7);
                    if (arrayList33 == null) {
                        arrayList33 = new ArrayList();
                        hashMap.put(D7, arrayList33);
                    }
                    arrayList33.add(new HlsTrackMetadataEntry.VariantInfo(i10, parseInt2, j11, j12, j13, j14));
                }
                hashMap2 = hashMap;
                arrayList14 = arrayList32;
                arrayList16 = arrayList4;
                arrayList17 = arrayList5;
                arrayList13 = arrayList6;
                arrayList12 = arrayList7;
                arrayList11 = arrayList8;
                arrayList15 = arrayList9;
            }
            hashMap = hashMap2;
            arrayList8 = arrayList11;
            arrayList7 = arrayList12;
            arrayList6 = arrayList13;
            arrayList9 = arrayList15;
            arrayList4 = arrayList16;
            arrayList5 = arrayList17;
            hashMap2 = hashMap;
            arrayList14 = arrayList32;
            arrayList16 = arrayList4;
            arrayList17 = arrayList5;
            arrayList13 = arrayList6;
            arrayList12 = arrayList7;
            arrayList11 = arrayList8;
            arrayList15 = arrayList9;
        }
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) {
        String j = j(str, pattern, null, map);
        if (j != null) {
            return j;
        }
        throw C0045t0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f13974s0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[Catch: all -> 0x00a0, LOOP:0: B:13:0x0073->B:38:0x0073, LOOP_START, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0010, B:5:0x0019, B:7:0x0021, B:10:0x002a, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:53:0x008c, B:20:0x00a2, B:22:0x00aa, B:24:0x00b2, B:26:0x00ba, B:28:0x00c2, B:30:0x00ca, B:32:0x00d2, B:34:0x00da, B:36:0x00e3, B:41:0x00e7, B:60:0x0107, B:61:0x010d, B:65:0x0031, B:67:0x0037, B:72:0x0040, B:74:0x0049, B:80:0x0055, B:82:0x005b, B:85:0x0062, B:88:0x0067), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107 A[Catch: all -> 0x00a0, TRY_ENTER, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0010, B:5:0x0019, B:7:0x0021, B:10:0x002a, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:53:0x008c, B:20:0x00a2, B:22:0x00aa, B:24:0x00b2, B:26:0x00ba, B:28:0x00c2, B:30:0x00ca, B:32:0x00d2, B:34:0x00da, B:36:0x00e3, B:41:0x00e7, B:60:0x0107, B:61:0x010d, B:65:0x0031, B:67:0x0037, B:72:0x0040, B:74:0x0049, B:80:0x0055, B:82:0x005b, B:85:0x0062, B:88:0x0067), top: B:2:0x0010 }] */
    @Override // u2.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Uri uri, C1638o c1638o) {
        String trim;
        Object f7;
        boolean z4 = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c1638o));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z7 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z7) {
                    throw C0045t0.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        t.h(bufferedReader);
                        throw C0045t0.b("Failed to parse the playlist, could not identify any tags.", null);
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                            if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            }
                            arrayDeque.add(trim);
                        } else {
                            arrayDeque.add(trim);
                            f7 = f(new C1759x1(arrayDeque, bufferedReader), uri.toString());
                            break;
                        }
                    }
                }
                arrayDeque.add(trim);
                f7 = e(this.f13978a, this.f13979b, new C1759x1(arrayDeque, bufferedReader), uri.toString());
                return f7;
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i7 = 0;
            while (true) {
                if (i7 >= 7) {
                    while (read != -1 && Character.isWhitespace(read)) {
                        int i8 = t.f17153a;
                        if (read == 10 || read == 13) {
                            break;
                        }
                        read = bufferedReader.read();
                    }
                    int i9 = t.f17153a;
                    if (read != 10 && read != 13) {
                        z4 = false;
                    }
                    z7 = z4;
                } else {
                    if (read != "#EXTM3U".charAt(i7)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i7++;
                }
            }
            if (z7) {
            }
        } finally {
            t.h(bufferedReader);
        }
    }
}
