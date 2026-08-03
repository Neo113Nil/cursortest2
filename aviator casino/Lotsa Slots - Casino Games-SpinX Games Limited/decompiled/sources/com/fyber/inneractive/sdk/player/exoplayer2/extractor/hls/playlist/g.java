package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* loaded from: classes3.dex */
public final class g implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f3948a = java.util.regex.Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("CODECS=\"(.+?)\"");
    public static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final java.util.regex.Pattern h = java.util.regex.Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final java.util.regex.Pattern i = java.util.regex.Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final java.util.regex.Pattern j = java.util.regex.Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final java.util.regex.Pattern k = java.util.regex.Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final java.util.regex.Pattern l = java.util.regex.Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final java.util.regex.Pattern m = java.util.regex.Pattern.compile("METHOD=(NONE|AES-128)");
    public static final java.util.regex.Pattern n = java.util.regex.Pattern.compile("URI=\"(.+?)\"");
    public static final java.util.regex.Pattern o = java.util.regex.Pattern.compile("IV=([^,.*]+)");
    public static final java.util.regex.Pattern p = java.util.regex.Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final java.util.regex.Pattern q = java.util.regex.Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final java.util.regex.Pattern r = java.util.regex.Pattern.compile("NAME=\"(.+?)\"");
    public static final java.util.regex.Pattern s = java.util.regex.Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final java.util.regex.Pattern t = java.util.regex.Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));
    public static final java.util.regex.Pattern u = java.util.regex.Pattern.compile("DEFAULT".concat("=(NO|YES)"));
    public static final java.util.regex.Pattern v = java.util.regex.Pattern.compile("FORCED".concat("=(NO|YES)"));

    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f fVar, java.lang.String str) {
        java.lang.String str2;
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        char c2 = 0;
        int i3 = 1;
        java.lang.String str3 = null;
        long j2 = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = null;
        java.lang.String str4 = null;
        java.lang.String str5 = null;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        int i4 = 0;
        long j7 = -9223372036854775807L;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        long j8 = -9223372036854775807L;
        boolean z2 = false;
        int i8 = 0;
        long j9 = -1;
        int i9 = 0;
        boolean z3 = false;
        while (fVar.a()) {
            if (fVar.a()) {
                str2 = fVar.c;
                fVar.c = str3;
            } else {
                str2 = str3;
            }
            if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                java.lang.String b2 = b(str2, g);
                if ("VOD".equals(b2)) {
                    str3 = null;
                    i4 = 1;
                } else if ("EVENT".equals(b2)) {
                    str3 = null;
                    i4 = 2;
                }
            } else {
                if (str2.startsWith("#EXT-X-START")) {
                    j7 = (long) (java.lang.Double.parseDouble(b(str2, j)) * 1000000.0d);
                } else if (str2.startsWith("#EXT-X-MAP")) {
                    java.lang.String b3 = b(str2, n);
                    java.lang.String a2 = a(str2, l);
                    if (a2 != null) {
                        java.lang.String[] split = a2.split("@");
                        j9 = java.lang.Long.parseLong(split[c2]);
                        if (split.length > i3) {
                            j4 = java.lang.Long.parseLong(split[i3]);
                        }
                    }
                    cVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c(b3, 0L, -1, -9223372036854775807L, false, null, null, j4, j9);
                    j4 = j2;
                    str3 = null;
                    j9 = -1;
                } else if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                    j8 = java.lang.Integer.parseInt(b(str2, e)) * 1000000;
                } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    i8 = java.lang.Integer.parseInt(b(str2, h));
                    i6 = i8;
                } else if (str2.startsWith("#EXT-X-VERSION")) {
                    i7 = java.lang.Integer.parseInt(b(str2, f));
                } else if (str2.startsWith("#EXTINF")) {
                    j6 = (long) (java.lang.Double.parseDouble(b(str2, i)) * 1000000.0d);
                } else if (str2.startsWith("#EXT-X-KEY")) {
                    z3 = "AES-128".equals(b(str2, m));
                    if (z3) {
                        str5 = b(str2, n);
                        str4 = a(str2, o);
                    } else {
                        str3 = null;
                        str4 = null;
                        str5 = null;
                    }
                } else if (str2.startsWith("#EXT-X-BYTERANGE")) {
                    java.lang.String[] split2 = b(str2, k).split("@");
                    j9 = java.lang.Long.parseLong(split2[c2]);
                    if (split2.length > i3) {
                        j4 = java.lang.Long.parseLong(split2[i3]);
                    }
                } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                    i5 = java.lang.Integer.parseInt(str2.substring(str2.indexOf(58) + i3));
                    str3 = null;
                    z = true;
                } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                    i9++;
                } else {
                    if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                        if (j3 == j2) {
                            java.lang.String substring = str2.substring(str2.indexOf(58) + i3);
                            java.util.regex.Matcher matcher = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f.matcher(substring);
                            if (!matcher.matches()) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Invalid date/time format: " + substring);
                            }
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i2 = 0;
                            } else {
                                i2 = java.lang.Integer.parseInt(matcher.group(13)) + (java.lang.Integer.parseInt(matcher.group(12)) * 60);
                                if (matcher.group(11).equals("-")) {
                                    i2 *= -1;
                                }
                            }
                            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(java.lang.Integer.parseInt(matcher.group(i3)), java.lang.Integer.parseInt(matcher.group(2)) - 1, java.lang.Integer.parseInt(matcher.group(3)), java.lang.Integer.parseInt(matcher.group(4)), java.lang.Integer.parseInt(matcher.group(5)), java.lang.Integer.parseInt(matcher.group(6)));
                            if (!android.text.TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new java.math.BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i2 != 0) {
                                timeInMillis -= i2 * 60000;
                            }
                            int i10 = com.fyber.inneractive.sdk.player.exoplayer2.b.f3917a;
                            j3 = (timeInMillis == -9223372036854775807L ? -9223372036854775807L : timeInMillis * 1000) - j5;
                        }
                    } else if (str2.startsWith("#EXT-X-DATERANGE")) {
                        arrayList2.add(str2);
                    } else if (!str2.startsWith("#")) {
                        java.lang.String hexString = !z3 ? null : str4 != null ? str4 : java.lang.Integer.toHexString(i8);
                        int i11 = i8 + 1;
                        if (j9 == -1) {
                            j4 = 0;
                        }
                        arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c(str2, j6, i9, j5, z3, str5, hexString, j4, j9));
                        j5 += j6;
                        if (j9 != -1) {
                            j4 += j9;
                        }
                        i8 = i11;
                        j9 = -1;
                        c2 = 0;
                        i3 = 1;
                        str3 = null;
                        j2 = 0;
                        j6 = 0;
                    } else if (str2.equals("#EXT-X-ENDLIST")) {
                        c2 = 0;
                        i3 = 1;
                        str3 = null;
                        j2 = 0;
                        z2 = true;
                    }
                    c2 = 0;
                    i3 = 1;
                    str3 = null;
                    j2 = 0;
                }
                str3 = null;
            }
            c2 = 0;
            i3 = 1;
            str3 = null;
            j2 = 0;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d(i4, str, j7, j3, z, i5, i6, i7, j8, z2, j3 != 0, cVar, arrayList, arrayList2);
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e a(android.net.Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) {
        java.lang.String trim;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e a2;
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(jVar));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            int read = bufferedReader.read();
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                throw new com.fyber.inneractive.sdk.player.exoplayer2.source.a0("Input does not start with the #EXTM3U header.");
            }
            while (read != -1 && java.lang.Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 7) {
                    while (read != -1 && java.lang.Character.isWhitespace(read)) {
                        int i3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
                        if (read == 10 || read == 13) {
                            break;
                        }
                        read = bufferedReader.read();
                    }
                    int i4 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
                    if (read != 10) {
                        if (read == 13) {
                        }
                    }
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(bufferedReader);
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Failed to parse the playlist, could not identify any tags.");
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
                                a2 = a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f(linkedList, bufferedReader), uri.toString());
                                break;
                            }
                        }
                    }
                    linkedList.add(trim);
                    a2 = b(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f(linkedList, bufferedReader), uri.toString());
                    return a2;
                }
                if (read != "#EXTM3U".charAt(i2)) {
                    break;
                }
                read = bufferedReader.read();
                i2++;
            }
        } finally {
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(bufferedReader);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f fVar, java.lang.String str) {
        java.lang.String str2;
        char c2;
        int parseInt;
        java.lang.String str3;
        int i2;
        int i3;
        java.lang.String str4;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = null;
        java.util.ArrayList arrayList4 = null;
        boolean z = false;
        while (fVar.a()) {
            if (fVar.a()) {
                str2 = fVar.c;
                fVar.c = null;
            } else {
                str2 = null;
            }
            if (str2.startsWith("#EXT-X-MEDIA")) {
                java.util.regex.Matcher matcher = u.matcher(str2);
                ?? equals = matcher.find() ? matcher.group(1).equals("YES") : 0;
                java.util.regex.Matcher matcher2 = v.matcher(str2);
                int i4 = equals | ((matcher2.find() && matcher2.group(1).equals("YES")) ? 2 : 0);
                java.util.regex.Matcher matcher3 = t.matcher(str2);
                int i5 = i4 | ((matcher3.find() && matcher3.group(1).equals("YES")) ? 4 : 0);
                java.lang.String a2 = a(str2, n);
                java.lang.String b2 = b(str2, r);
                java.lang.String a3 = a(str2, q);
                java.lang.String b3 = b(str2, p);
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
                        arrayList3.add(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a(a2, new com.fyber.inneractive.sdk.player.exoplayer2.o(b2, "application/x-mpegURL", "text/vtt", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, a3, -1, Long.MAX_VALUE, null, null, null)));
                        break;
                    case 1:
                        java.lang.String b4 = b(str2, s);
                        if (b4.startsWith("CC")) {
                            parseInt = java.lang.Integer.parseInt(b4.substring(2));
                            str3 = "application/cea-608";
                        } else {
                            parseInt = java.lang.Integer.parseInt(b4.substring(7));
                            str3 = "application/cea-708";
                        }
                        int i6 = parseInt;
                        java.lang.String str5 = str3;
                        if (arrayList4 == null) {
                            arrayList4 = new java.util.ArrayList();
                        }
                        arrayList4.add(new com.fyber.inneractive.sdk.player.exoplayer2.o(b2, null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, a3, i6, Long.MAX_VALUE, null, null, null));
                        break;
                    case 2:
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.o(b2, "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, a3, -1, Long.MAX_VALUE, null, null, null);
                        if (a2 != null) {
                            arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a(a2, oVar2));
                            break;
                        } else {
                            oVar = oVar2;
                            break;
                        }
                }
            } else if (str2.startsWith("#EXT-X-STREAM-INF")) {
                int parseInt2 = java.lang.Integer.parseInt(b(str2, b));
                java.lang.String a4 = a(str2, f3948a);
                if (a4 != null) {
                    parseInt2 = java.lang.Integer.parseInt(a4);
                }
                int i7 = parseInt2;
                java.lang.String a5 = a(str2, c);
                java.lang.String a6 = a(str2, d);
                z |= str2.contains("CLOSED-CAPTIONS=NONE");
                if (a6 != null) {
                    java.lang.String[] split = a6.split("x");
                    int parseInt3 = java.lang.Integer.parseInt(split[0]);
                    int parseInt4 = java.lang.Integer.parseInt(split[1]);
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
                            arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a(str4, new com.fyber.inneractive.sdk.player.exoplayer2.o(java.lang.Integer.toString(arrayList.size()), "application/x-mpegURL", null, a5, i7, -1, i2, i3, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
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
        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b(str, arrayList, arrayList2, arrayList3, oVar, z ? java.util.Collections.emptyList() : arrayList4);
    }

    public static java.lang.String b(java.lang.String str, java.util.regex.Pattern pattern) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static java.lang.String a(java.lang.String str, java.util.regex.Pattern pattern) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
