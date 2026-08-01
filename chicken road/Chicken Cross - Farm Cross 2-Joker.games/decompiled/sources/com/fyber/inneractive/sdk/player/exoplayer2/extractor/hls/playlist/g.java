package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.a0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.c0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class g implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f5602a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern c = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern m = Pattern.compile("METHOD=(NONE|AES-128)");
    public static final Pattern n = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern o = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern q = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern r = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern t = Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));
    public static final Pattern u = Pattern.compile("DEFAULT".concat("=(NO|YES)"));
    public static final Pattern v = Pattern.compile("FORCED".concat("=(NO|YES)"));

    /* JADX WARN: Multi-variable type inference failed */
    public static d b(f fVar, String str) {
        String str2;
        int i2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 1;
        String str3 = null;
        long j2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        boolean z2 = false;
        int i11 = 1;
        c cVar = null;
        String str4 = null;
        String str5 = null;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        while (true) {
            long j9 = -1;
            while (fVar.a()) {
                if (fVar.a()) {
                    str2 = fVar.c;
                    fVar.c = str3;
                } else {
                    str2 = str3;
                }
                if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String b2 = b(str2, g);
                    if ("VOD".equals(b2)) {
                        i5 = i4;
                    } else if ("EVENT".equals(b2)) {
                        i5 = 2;
                    }
                    str3 = null;
                } else {
                    if (str2.startsWith("#EXT-X-START")) {
                        j7 = (long) (Double.parseDouble(b(str2, j)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-MAP")) {
                        String b3 = b(str2, n);
                        String a2 = a(str2, l);
                        if (a2 != null) {
                            String[] split = a2.split("@");
                            j9 = Long.parseLong(split[i3]);
                            if (split.length > i4) {
                                j4 = Long.parseLong(split[i4]);
                            }
                        }
                        cVar = new c(b3, 0L, -1, -9223372036854775807L, false, null, null, j4, j9);
                        j4 = j2;
                        str3 = null;
                    } else if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j8 = Integer.parseInt(b(str2, e)) * 1000000;
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i9 = Integer.parseInt(b(str2, h));
                        i8 = i9;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i11 = Integer.parseInt(b(str2, f));
                    } else if (str2.startsWith("#EXTINF")) {
                        j6 = (long) (Double.parseDouble(b(str2, i)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-KEY")) {
                        z2 = "AES-128".equals(b(str2, m));
                        if (z2) {
                            str5 = b(str2, n);
                            str4 = a(str2, o);
                        } else {
                            str3 = null;
                            str4 = null;
                            str5 = null;
                        }
                    } else if (str2.startsWith("#EXT-X-BYTERANGE")) {
                        String[] split2 = b(str2, k).split("@");
                        j9 = Long.parseLong(split2[i3]);
                        if (split2.length > i4) {
                            j4 = Long.parseLong(split2[i4]);
                        }
                    } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                        i7 = Integer.parseInt(str2.substring(str2.indexOf(58) + i4));
                        i6 = i4;
                    } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                        i10++;
                    } else if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                        if (j3 == j2) {
                            String substring = str2.substring(str2.indexOf(58) + i4);
                            Matcher matcher = z.f.matcher(substring);
                            if (!matcher.matches()) {
                                throw new r("Invalid date/time format: " + substring);
                            }
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i2 = i3;
                            } else {
                                i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                                if (matcher.group(11).equals("-")) {
                                    i2 *= -1;
                                }
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(Integer.parseInt(matcher.group(i4)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i2 != 0) {
                                timeInMillis -= i2 * 60000;
                            }
                            int i12 = com.fyber.inneractive.sdk.player.exoplayer2.b.f5571a;
                            j3 = (timeInMillis == -9223372036854775807L ? -9223372036854775807L : timeInMillis * 1000) - j5;
                        }
                    } else if (str2.startsWith("#EXT-X-DATERANGE")) {
                        arrayList2.add(str2);
                    } else if (!str2.startsWith("#")) {
                        String hexString = !z2 ? null : str4 != null ? str4 : Integer.toHexString(i9);
                        int i13 = i9 + 1;
                        if (j9 == -1) {
                            j4 = 0;
                        }
                        arrayList.add(new c(str2, j6, i10, j5, z2, str5, hexString, j4, j9));
                        j5 += j6;
                        if (j9 != -1) {
                            j4 += j9;
                        }
                        i9 = i13;
                        j9 = -1;
                        i3 = 0;
                        i4 = 1;
                        str3 = null;
                        j2 = 0;
                        j6 = 0;
                    } else if (str2.equals("#EXT-X-ENDLIST")) {
                        i3 = 0;
                        i4 = 1;
                        str3 = null;
                        j2 = 0;
                        z = true;
                    }
                    str3 = null;
                }
                i3 = 0;
                i4 = 1;
                str3 = null;
                j2 = 0;
            }
            return new d(i5, str, j7, j3, i6, i7, i8, i11, j8, z, j3 != 0, cVar, arrayList, arrayList2);
        }
    }

    public final e a(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) {
        String trim;
        e a2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jVar));
        LinkedList linkedList = new LinkedList();
        try {
            int read = bufferedReader.read();
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                throw new a0("Input does not start with the #EXTM3U header.");
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 7) {
                    while (read != -1 && Character.isWhitespace(read)) {
                        int i3 = z.f5774a;
                        if (read == 10 || read == 13) {
                            break;
                        }
                        read = bufferedReader.read();
                    }
                    int i4 = z.f5774a;
                    if (read != 10) {
                        if (read == 13) {
                        }
                    }
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            z.a(bufferedReader);
                            throw new r("Failed to parse the playlist, could not identify any tags.");
                        }
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                }
                                linkedList.add(trim);
                            } else {
                                linkedList.add(trim);
                                a2 = a(new f(linkedList, bufferedReader), uri.toString());
                                break;
                            }
                        }
                    }
                    linkedList.add(trim);
                    a2 = b(new f(linkedList, bufferedReader), uri.toString());
                    return a2;
                }
                if (read != "#EXTM3U".charAt(i2)) {
                    break;
                }
                read = bufferedReader.read();
                i2++;
            }
        } finally {
            z.a(bufferedReader);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0229  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(f fVar, String str) {
        String str2;
        char c2;
        int parseInt;
        String str3;
        int i2;
        int i3;
        String str4;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        o oVar = null;
        ArrayList arrayList4 = null;
        boolean z = false;
        while (fVar.a()) {
            if (fVar.a()) {
                str2 = fVar.c;
                fVar.c = null;
            } else {
                str2 = null;
            }
            if (str2.startsWith("#EXT-X-MEDIA")) {
                Matcher matcher = u.matcher(str2);
                ?? equals = matcher.find() ? matcher.group(1).equals("YES") : 0;
                Matcher matcher2 = v.matcher(str2);
                int i4 = equals | (matcher2.find() ? matcher2.group(1).equals("YES") : false ? 2 : 0);
                Matcher matcher3 = t.matcher(str2);
                int i5 = i4 | (matcher3.find() ? matcher3.group(1).equals("YES") : false ? 4 : 0);
                String a2 = a(str2, n);
                String b2 = b(str2, r);
                String a3 = a(str2, q);
                String b3 = b(str2, p);
                b3.getClass();
                b3.hashCode();
                switch (b3.hashCode()) {
                    case -959297733:
                        if (b3.equals("SUBTITLES")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -333210994:
                        if (b3.equals("CLOSED-CAPTIONS")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 62628790:
                        if (b3.equals("AUDIO")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        arrayList3.add(new a(a2, new o(b2, "application/x-mpegURL", "text/vtt", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, a3, -1, Long.MAX_VALUE, null, null, null)));
                        break;
                    case 1:
                        String b4 = b(str2, s);
                        if (b4.startsWith("CC")) {
                            parseInt = Integer.parseInt(b4.substring(2));
                            str3 = "application/cea-608";
                        } else {
                            parseInt = Integer.parseInt(b4.substring(7));
                            str3 = "application/cea-708";
                        }
                        int i6 = parseInt;
                        String str5 = str3;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(new o(b2, null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, a3, i6, Long.MAX_VALUE, null, null, null));
                        break;
                    case 2:
                        o oVar2 = new o(b2, "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, a3, -1, Long.MAX_VALUE, null, null, null);
                        if (a2 != null) {
                            arrayList2.add(new a(a2, oVar2));
                            break;
                        } else {
                            oVar = oVar2;
                            break;
                        }
                }
            } else if (str2.startsWith("#EXT-X-STREAM-INF")) {
                int parseInt2 = Integer.parseInt(b(str2, b));
                String a4 = a(str2, f5602a);
                if (a4 != null) {
                    parseInt2 = Integer.parseInt(a4);
                }
                int i7 = parseInt2;
                String a5 = a(str2, c);
                String a6 = a(str2, d);
                z |= str2.contains("CLOSED-CAPTIONS=NONE");
                if (a6 != null) {
                    String[] split = a6.split("x");
                    int parseInt3 = Integer.parseInt(split[0]);
                    int parseInt4 = Integer.parseInt(split[1]);
                    if (parseInt3 > 0 && parseInt4 > 0) {
                        i3 = parseInt4;
                        i2 = parseInt3;
                        if (fVar.a()) {
                            str4 = null;
                        } else {
                            str4 = fVar.c;
                            fVar.c = null;
                        }
                        if (!hashSet.add(str4)) {
                            arrayList.add(new a(str4, new o(Integer.toString(arrayList.size()), "application/x-mpegURL", null, a5, i7, -1, i2, i3, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
                        }
                    }
                }
                i2 = -1;
                i3 = -1;
                if (fVar.a()) {
                }
                if (!hashSet.add(str4)) {
                }
            }
        }
        return new b(str, arrayList, arrayList2, arrayList3, oVar, z ? Collections.emptyList() : arrayList4);
    }

    public static String b(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
