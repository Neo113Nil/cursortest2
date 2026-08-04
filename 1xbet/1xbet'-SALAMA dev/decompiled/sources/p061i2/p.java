package p061i2;

import A1.AbstractC0029l;
import A1.C0045t0;
import A1.X;
import D3.f;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p031e1.k;
import p146u2.M;
import p151v2.a;
import p151v2.i;
import p151v2.t;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public final class p implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f13984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f13985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13961c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f13962d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f13964e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f13966f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f13981x = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f13982y = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f13983z = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Pattern f13933A = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Pattern f13934B = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Pattern f13935C = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Pattern f13936D = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Pattern f13937E = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Pattern f13938F = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Pattern f13939G = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Pattern f13940H = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Pattern f13941I = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final Pattern f13942J = a("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Pattern f13943K = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Pattern f13944L = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Pattern f13945M = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Pattern f13946N = a("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Pattern f13947O = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Pattern f13948P = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Pattern f13949Q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Pattern f13950R = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Pattern f13951S = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Pattern f13952T = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final Pattern f13953U = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final Pattern f13954V = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final Pattern f13955W = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final Pattern f13956X = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Pattern f13957Y = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Pattern f13958Z = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Pattern f13959a0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Pattern f13960b0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern c0 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Pattern f13963d0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Pattern f13965e0 = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Pattern f13967f0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f13968g0 = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Pattern f13969h0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Pattern f13970i0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Pattern f13971j0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Pattern f13972k0 = a("AUTOSELECT");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Pattern f13973l0 = a("DEFAULT");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Pattern f13974m0 = a("FORCED");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Pattern f13975n0 = a("INDEPENDENT");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Pattern f13976o0 = a("GAP");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Pattern f13977p0 = a("PRECISE");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Pattern f13978q0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Pattern f13979r0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Pattern f13980s0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public p(m mVar, j jVar) {
        this.f13984a = mVar;
        this.f13985b = jVar;
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

    public static DrmInitData.SchemeData d(String str, String str2, HashMap map) throws C0045t0 {
        String strJ = j(str, f13959a0, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f13960b0;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new DrmInitData.SchemeData(AbstractC0029l.f465d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0029l.f465d;
            int i7 = t.f17159a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(f.f1719c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = AbstractC0029l.f466e;
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", N1.p.a(uuid2, null, bArrDecode));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21361. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static p061i2.j e(p061i2.m r94, p061i2.j r95, p155w1.C1050x1 r96, java.lang.String r97) {
        /*
            Method dump skipped, instruction units count: 2136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p061i2.p.e(i2.m, i2.j, w1.x1, java.lang.String):i2.j");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x0384  */
    /* JADX WARN: Code duplicated, block: B:204:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x016d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0174  */
    /* JADX WARN: Code duplicated, block: B:57:0x0197  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x03b1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static m f(C1050x1 c1050x1, String str) throws IOException {
        ?? r14;
        int i7;
        Pattern pattern;
        ArrayList arrayList;
        ArrayList arrayList2;
        l lVar;
        String strC;
        int i8;
        String str2;
        int i9;
        int i10;
        l lVar2;
        String strC2;
        l lVar3;
        int i11;
        ArrayList arrayList3;
        int i12;
        int i13;
        String strJ;
        float f7;
        Uri uriD;
        HashMap map;
        ArrayList arrayList4;
        String str3 = str;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        boolean z4 = false;
        boolean zContains = false;
        while (true) {
            boolean zP = c1050x1.P();
            String str4 = "application/x-mpegURL";
            Pattern pattern2 = f13960b0;
            Pattern pattern3 = f13968g0;
            if (!zP) {
                HashMap map4 = map2;
                ArrayList arrayList13 = arrayList6;
                ArrayList arrayList14 = arrayList7;
                ArrayList arrayList15 = arrayList8;
                ArrayList arrayList16 = arrayList9;
                ArrayList arrayList17 = arrayList10;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = arrayList12;
                ArrayList arrayList20 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i14 = 0;
                while (i14 < arrayList5.size()) {
                    l lVar4 = (l) arrayList5.get(i14);
                    if (hashSet.add(lVar4.f13914a)) {
                        X x4 = lVar4.f13915b;
                        a.h(x4.f281A == null);
                        ArrayList arrayList21 = (ArrayList) map4.get(lVar4.f13914a);
                        arrayList21.getClass();
                        Metadata metadata = new Metadata(new HlsTrackMetadataEntry(null, null, arrayList21));
                        Format$Builder format$BuilderA = x4.a();
                        format$BuilderA.f10536i = metadata;
                        arrayList20.add(new l(lVar4.f13914a, new X(format$BuilderA), lVar4.f13916c, lVar4.f13917d, lVar4.f13918e, lVar4.f13919f));
                    }
                    i14++;
                    hashSet = hashSet;
                }
                int i15 = 0;
                X x7 = null;
                List listEmptyList = null;
                while (i15 < arrayList17.size()) {
                    ArrayList arrayList22 = arrayList17;
                    String str5 = (String) arrayList22.get(i15);
                    String strK = k(str5, f13969h0, map3);
                    String strK2 = k(str5, pattern3, map3);
                    Format$Builder format$Builder = new Format$Builder();
                    format$Builder.f10528a = k.f(strK, ":", strK2);
                    format$Builder.f10529b = strK2;
                    format$Builder.j = str4;
                    boolean zG = g(str5, f13973l0);
                    String str6 = str4;
                    if (g(str5, f13974m0)) {
                        r14 = zG;
                        r14 = (zG ? 1 : 0) | 2;
                    }
                    r14 = zG;
                    int i16 = r14;
                    if (g(str5, f13972k0)) {
                        i16 = (r14 == true ? 1 : 0) | 4;
                    }
                    format$Builder.f10531d = i16;
                    String strJ2 = j(str5, f13970i0, null, map3);
                    if (TextUtils.isEmpty(strJ2)) {
                        arrayList17 = arrayList22;
                        i7 = 0;
                    } else {
                        int i17 = t.f17159a;
                        arrayList17 = arrayList22;
                        String[] strArrSplit = strJ2.split(",", -1);
                        i7 = t.l(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        if (t.l(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i7 |= 4096;
                        }
                        if (t.l(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i7 |= 1024;
                        }
                        if (t.l(strArrSplit, "public.easy-to-read")) {
                            i7 |= 8192;
                        }
                    }
                    format$Builder.f10532e = i7;
                    format$Builder.f10530c = j(str5, f13967f0, null, map3);
                    String strJ3 = j(str5, pattern2, null, map3);
                    Uri uriD2 = strJ3 == null ? null : a.D(str3, strJ3);
                    Pattern pattern4 = pattern2;
                    Metadata metadata2 = new Metadata(new HlsTrackMetadataEntry(strK, strK2, Collections.emptyList()));
                    switch (k(str5, f13963d0, map3)) {
                        case "SUBTITLES":
                            pattern = pattern3;
                            arrayList = arrayList14;
                            arrayList2 = arrayList13;
                            int i18 = 0;
                            while (true) {
                                if (i18 < arrayList5.size()) {
                                    lVar = (l) arrayList5.get(i18);
                                    if (!strK.equals(lVar.f13918e)) {
                                        i18++;
                                    }
                                } else {
                                    lVar = null;
                                }
                            }
                            if (lVar != null) {
                                String strQ = t.q(3, lVar.f13915b.f312z);
                                format$Builder.f10535h = strQ;
                                strC = i.c(strQ);
                            } else {
                                strC = null;
                            }
                            if (strC == null) {
                                strC = "text/vtt";
                            }
                            format$Builder.f10537k = strC;
                            format$Builder.f10536i = metadata2;
                            if (uriD2 != null) {
                                arrayList15 = arrayList15;
                                arrayList15.add(new k(uriD2, new X(format$Builder), strK2));
                            } else {
                                arrayList15 = arrayList15;
                                Log.w("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            i9 = 1;
                            break;
                        case "CLOSED-CAPTIONS":
                            pattern = pattern3;
                            arrayList = arrayList14;
                            arrayList2 = arrayList13;
                            String strK3 = k(str5, f13971j0, map3);
                            if (strK3.startsWith("CC")) {
                                i8 = Integer.parseInt(strK3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i8 = Integer.parseInt(strK3.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (listEmptyList == null) {
                                listEmptyList = new ArrayList();
                            }
                            format$Builder.f10537k = str2;
                            format$Builder.f10526C = i8;
                            listEmptyList.add(new X(format$Builder));
                            arrayList15 = arrayList15;
                            i9 = 1;
                            break;
                        case "AUDIO":
                            arrayList2 = arrayList13;
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList5.size()) {
                                    l lVar5 = (l) arrayList5.get(i19);
                                    pattern = pattern3;
                                    if (strK.equals(lVar5.f13917d)) {
                                        lVar2 = lVar5;
                                        i10 = 1;
                                    } else {
                                        i19++;
                                        pattern3 = pattern;
                                    }
                                } else {
                                    pattern = pattern3;
                                    i10 = 1;
                                    lVar2 = null;
                                }
                            }
                            if (lVar2 != null) {
                                String strQ2 = t.q(i10, lVar2.f13915b.f312z);
                                format$Builder.f10535h = strQ2;
                                strC2 = i.c(strQ2);
                            } else {
                                strC2 = null;
                            }
                            String strJ4 = j(str5, f13983z, null, map3);
                            if (strJ4 != null) {
                                int i20 = t.f17159a;
                                format$Builder.f10550x = Integer.parseInt(strJ4.split("/", 2)[0]);
                                if ("audio/eac3".equals(strC2) && strJ4.endsWith("/JOC")) {
                                    format$Builder.f10535h = "ec+3";
                                    strC2 = "audio/eac3-joc";
                                }
                            }
                            format$Builder.f10537k = strC2;
                            if (uriD2 == null) {
                                arrayList = arrayList14;
                                if (lVar2 != null) {
                                    x7 = new X(format$Builder);
                                    arrayList15 = arrayList15;
                                    i9 = 1;
                                }
                                break;
                            } else {
                                format$Builder.f10536i = metadata2;
                                arrayList = arrayList14;
                                arrayList.add(new k(uriD2, new X(format$Builder), strK2));
                            }
                            i9 = 1;
                            break;
                        case "VIDEO":
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList5.size()) {
                                    lVar3 = (l) arrayList5.get(i21);
                                    if (!strK.equals(lVar3.f13916c)) {
                                        i21++;
                                    }
                                } else {
                                    lVar3 = null;
                                }
                            }
                            if (lVar3 != null) {
                                X x8 = lVar3.f13915b;
                                String strQ3 = t.q(2, x8.f312z);
                                format$Builder.f10535h = strQ3;
                                format$Builder.f10537k = i.c(strQ3);
                                format$Builder.f10542p = x8.f288H;
                                format$Builder.f10543q = x8.f289I;
                                format$Builder.f10544r = x8.f290J;
                            }
                            if (uriD2 != null) {
                                format$Builder.f10536i = metadata2;
                                arrayList2 = arrayList13;
                                arrayList2.add(new k(uriD2, new X(format$Builder), strK2));
                                pattern = pattern3;
                                arrayList = arrayList14;
                            }
                            i9 = 1;
                        default:
                            pattern = pattern3;
                            arrayList = arrayList14;
                            arrayList2 = arrayList13;
                            i9 = 1;
                            break;
                    }
                    i15 += i9;
                    str3 = str;
                    arrayList14 = arrayList;
                    arrayList15 = arrayList15;
                    arrayList13 = arrayList2;
                    str4 = str6;
                    pattern2 = pattern4;
                    pattern3 = pattern;
                }
                ArrayList arrayList23 = arrayList15;
                ArrayList arrayList24 = arrayList14;
                ArrayList arrayList25 = arrayList13;
                if (zContains) {
                    listEmptyList = Collections.emptyList();
                }
                return new m(str, arrayList19, arrayList20, arrayList25, arrayList24, arrayList23, arrayList16, x7, listEmptyList, z4, map3, arrayList18);
            }
            String strS = c1050x1.S();
            if (strS.startsWith("#EXT")) {
                arrayList12.add(strS);
            }
            boolean zStartsWith = strS.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList26 = arrayList9;
            if (strS.startsWith("#EXT-X-DEFINE")) {
                map3.put(k(strS, pattern3, map3), k(strS, f13978q0, map3));
            } else {
                if (strS.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    map = map2;
                    arrayList3 = arrayList6;
                    arrayList12 = arrayList12;
                    z4 = true;
                } else if (strS.startsWith("#EXT-X-MEDIA")) {
                    arrayList10.add(strS);
                } else if (strS.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData schemeDataD = d(strS, j(strS, f13958Z, "identity", map3), map3);
                    if (schemeDataD != null) {
                        String strK4 = k(strS, f13957Y, map3);
                        arrayList11.add(new DrmInitData(("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs", true, schemeDataD));
                    }
                } else if (strS.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    zContains |= strS.contains("CLOSED-CAPTIONS=NONE");
                    int i22 = zStartsWith ? 16384 : 0;
                    int i23 = Integer.parseInt(k(strS, f13982y, Collections.emptyMap()));
                    Matcher matcher = f13961c.matcher(strS);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        i11 = Integer.parseInt(strGroup);
                    } else {
                        i11 = -1;
                    }
                    String strJ5 = j(strS, f13933A, null, map3);
                    String strJ6 = j(strS, f13934B, null, map3);
                    if (strJ6 != null) {
                        int i24 = t.f17159a;
                        arrayList3 = arrayList6;
                        String[] strArrSplit2 = strJ6.split("x", -1);
                        i12 = Integer.parseInt(strArrSplit2[0]);
                        i13 = Integer.parseInt(strArrSplit2[1]);
                        if (i12 <= 0 || i13 <= 0) {
                        }
                        strJ = j(strS, f13935C, null, map3);
                        if (strJ != null) {
                            f7 = Float.parseFloat(strJ);
                        } else {
                            f7 = -1.0f;
                        }
                        HashMap map5 = map2;
                        String strJ7 = j(strS, f13962d, null, map3);
                        String strJ8 = j(strS, f13964e, null, map3);
                        String strJ9 = j(strS, f13966f, null, map3);
                        String strJ10 = j(strS, f13981x, null, map3);
                        if (zStartsWith) {
                            uriD = a.D(str3, k(strS, pattern2, map3));
                        } else {
                            if (c1050x1.P()) {
                                throw C0045t0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriD = a.D(str3, l(c1050x1.S(), map3));
                        }
                        Format$Builder format$Builder2 = new Format$Builder();
                        format$Builder2.f10528a = Integer.toString(arrayList5.size());
                        format$Builder2.j = "application/x-mpegURL";
                        format$Builder2.f10535h = strJ5;
                        format$Builder2.f10533f = i11;
                        format$Builder2.f10534g = i23;
                        format$Builder2.f10542p = i12;
                        format$Builder2.f10543q = i13;
                        format$Builder2.f10544r = f7;
                        format$Builder2.f10532e = i22;
                        arrayList5.add(new l(uriD, new X(format$Builder2), strJ7, strJ8, strJ9, strJ10));
                        map = map5;
                        arrayList4 = (ArrayList) map.get(uriD);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map.put(uriD, arrayList4);
                        }
                        arrayList4.add(new HlsTrackMetadataEntry.VariantInfo(i11, i23, strJ7, strJ8, strJ9, strJ10));
                    } else {
                        arrayList3 = arrayList6;
                    }
                    i12 = -1;
                    i13 = -1;
                    strJ = j(strS, f13935C, null, map3);
                    if (strJ != null) {
                        f7 = Float.parseFloat(strJ);
                    } else {
                        f7 = -1.0f;
                    }
                    HashMap map6 = map2;
                    String strJ11 = j(strS, f13962d, null, map3);
                    String strJ12 = j(strS, f13964e, null, map3);
                    String strJ13 = j(strS, f13966f, null, map3);
                    String strJ14 = j(strS, f13981x, null, map3);
                    if (zStartsWith) {
                        uriD = a.D(str3, k(strS, pattern2, map3));
                    } else {
                        if (c1050x1.P()) {
                            throw C0045t0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriD = a.D(str3, l(c1050x1.S(), map3));
                    }
                    Format$Builder format$Builder3 = new Format$Builder();
                    format$Builder3.f10528a = Integer.toString(arrayList5.size());
                    format$Builder3.j = "application/x-mpegURL";
                    format$Builder3.f10535h = strJ5;
                    format$Builder3.f10533f = i11;
                    format$Builder3.f10534g = i23;
                    format$Builder3.f10542p = i12;
                    format$Builder3.f10543q = i13;
                    format$Builder3.f10544r = f7;
                    format$Builder3.f10532e = i22;
                    arrayList5.add(new l(uriD, new X(format$Builder3), strJ11, strJ12, strJ13, strJ14));
                    map = map6;
                    arrayList4 = (ArrayList) map.get(uriD);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        map.put(uriD, arrayList4);
                    }
                    arrayList4.add(new HlsTrackMetadataEntry.VariantInfo(i11, i23, strJ11, strJ12, strJ13, strJ14));
                }
                map2 = map;
                arrayList9 = arrayList26;
                arrayList11 = arrayList11;
                arrayList12 = arrayList12;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                arrayList6 = arrayList3;
                arrayList10 = arrayList10;
            }
            map = map2;
            arrayList3 = arrayList6;
            arrayList12 = arrayList12;
            map2 = map;
            arrayList9 = arrayList26;
            arrayList11 = arrayList11;
            arrayList12 = arrayList12;
            arrayList8 = arrayList8;
            arrayList7 = arrayList7;
            arrayList6 = arrayList3;
            arrayList10 = arrayList10;
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
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) throws C0045t0 {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw C0045t0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f13980s0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0010, B:5:0x0019, B:7:0x0021, B:10:0x002a, B:40:0x0073, B:42:0x0079, B:45:0x0084, B:47:0x008c, B:51:0x00a2, B:53:0x00aa, B:55:0x00b2, B:57:0x00ba, B:59:0x00c2, B:61:0x00ca, B:63:0x00d2, B:65:0x00da, B:68:0x00e3, B:69:0x00e7, B:74:0x0107, B:75:0x010d, B:13:0x0031, B:15:0x0037, B:19:0x0040, B:22:0x0049, B:25:0x0055, B:27:0x005b, B:31:0x0062, B:32:0x0067), top: B:78:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x00a0, LOOP:2: B:17:0x003d->B:22:0x0049, LOOP_END, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0010, B:5:0x0019, B:7:0x0021, B:10:0x002a, B:40:0x0073, B:42:0x0079, B:45:0x0084, B:47:0x008c, B:51:0x00a2, B:53:0x00aa, B:55:0x00b2, B:57:0x00ba, B:59:0x00c2, B:61:0x00ca, B:63:0x00d2, B:65:0x00da, B:68:0x00e3, B:69:0x00e7, B:74:0x0107, B:75:0x010d, B:13:0x0031, B:15:0x0037, B:19:0x0040, B:22:0x0049, B:25:0x0055, B:27:0x005b, B:31:0x0062, B:32:0x0067), top: B:78:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0048 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:24:0x0053
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // p146u2.M
    public final java.lang.Object c(android.net.Uri r9, p146u2.C0956o r10) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p061i2.p.c(android.net.Uri, u2.o):java.lang.Object");
    }
}
