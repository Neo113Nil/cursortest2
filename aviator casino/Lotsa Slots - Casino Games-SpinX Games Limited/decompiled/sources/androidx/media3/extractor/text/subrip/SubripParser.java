package androidx.media3.extractor.text.subrip;

/* loaded from: classes2.dex */
public final class SubripParser implements androidx.media3.extractor.text.SubtitleParser {
    private static final java.lang.String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final java.lang.String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final java.lang.String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final java.lang.String ALIGN_MID_LEFT = "{\\an4}";
    private static final java.lang.String ALIGN_MID_MID = "{\\an5}";
    private static final java.lang.String ALIGN_MID_RIGHT = "{\\an6}";
    private static final java.lang.String ALIGN_TOP_LEFT = "{\\an7}";
    private static final java.lang.String ALIGN_TOP_MID = "{\\an8}";
    private static final java.lang.String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final java.lang.String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final java.lang.String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final java.lang.String TAG = "SubripParser";
    private static final java.util.regex.Pattern SUBRIP_TIMING_LINE = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final java.util.regex.Pattern SUBRIP_TAG_PATTERN = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");
    private final java.lang.StringBuilder textBuilder = new java.lang.StringBuilder();
    private final java.util.ArrayList<java.lang.String> tags = new java.util.ArrayList<>();
    private final androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void parse(byte[] bArr, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ androidx.media3.extractor.text.Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        return androidx.media3.extractor.text.SubtitleParser.CC.$default$parseToLegacySubtitle(this, bArr, i, i2);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void reset() {
        androidx.media3.extractor.text.SubtitleParser.CC.$default$reset(this);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        java.lang.String str;
        androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer2;
        java.lang.String readLine;
        java.lang.String str2;
        java.lang.String str3;
        androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer3;
        androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer4 = consumer;
        java.lang.String str4 = TAG;
        this.parsableByteArray.reset(bArr, i + i2);
        this.parsableByteArray.setPosition(i);
        java.nio.charset.Charset detectUtfCharset = detectUtfCharset(this.parsableByteArray);
        java.util.ArrayList arrayList = (outputOptions.startTimeUs == -9223372036854775807L || !outputOptions.outputAllCues) ? null : new java.util.ArrayList();
        while (true) {
            java.lang.String readLine2 = this.parsableByteArray.readLine(detectUtfCharset);
            if (readLine2 == null) {
                break;
            }
            if (readLine2.length() != 0) {
                try {
                    java.lang.Integer.parseInt(readLine2);
                    readLine = this.parsableByteArray.readLine(detectUtfCharset);
                } catch (java.lang.NumberFormatException unused) {
                    str = str4;
                    consumer2 = consumer4;
                    androidx.media3.common.util.Log.w(str, "Skipping invalid index: " + readLine2);
                }
                if (readLine == null) {
                    androidx.media3.common.util.Log.w(str4, "Unexpected end");
                    break;
                }
                java.util.regex.Matcher matcher = SUBRIP_TIMING_LINE.matcher(readLine);
                if (matcher.matches()) {
                    long parseTimecode = parseTimecode(matcher, 1);
                    long parseTimecode2 = parseTimecode(matcher, 6);
                    int i3 = 0;
                    this.textBuilder.setLength(0);
                    this.tags.clear();
                    java.lang.String readLine3 = this.parsableByteArray.readLine(detectUtfCharset);
                    while (!android.text.TextUtils.isEmpty(readLine3)) {
                        if (this.textBuilder.length() > 0) {
                            this.textBuilder.append("<br>");
                        }
                        this.textBuilder.append(processLine(readLine3, this.tags));
                        readLine3 = this.parsableByteArray.readLine(detectUtfCharset);
                    }
                    android.text.Spanned fromHtml = android.text.Html.fromHtml(this.textBuilder.toString());
                    while (true) {
                        if (i3 >= this.tags.size()) {
                            str2 = str4;
                            str3 = null;
                            break;
                        } else {
                            str3 = this.tags.get(i3);
                            if (str3.matches(SUBRIP_ALIGNMENT_TAG)) {
                                str2 = str4;
                                break;
                            }
                            i3++;
                        }
                    }
                    if (outputOptions.startTimeUs == -9223372036854775807L || parseTimecode >= outputOptions.startTimeUs) {
                        consumer3 = consumer;
                        consumer3.accept(new androidx.media3.extractor.text.CuesWithTiming(com.google.common.collect.ImmutableList.of(buildCue(fromHtml, str3)), parseTimecode, parseTimecode2 - parseTimecode));
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new androidx.media3.extractor.text.CuesWithTiming(com.google.common.collect.ImmutableList.of(buildCue(fromHtml, str3)), parseTimecode, parseTimecode2 - parseTimecode));
                        }
                        consumer3 = consumer;
                    }
                    consumer4 = consumer3;
                    str4 = str2;
                } else {
                    java.lang.String str5 = str4;
                    consumer2 = consumer4;
                    str = str5;
                    androidx.media3.common.util.Log.w(str, "Skipping invalid timing: " + readLine);
                    consumer4 = consumer2;
                    str4 = str;
                }
            }
        }
        androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer5 = consumer4;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer5.accept((androidx.media3.extractor.text.CuesWithTiming) it.next());
            }
        }
    }

    private java.nio.charset.Charset detectUtfCharset(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.nio.charset.Charset readUtfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return readUtfCharsetFromBom != null ? readUtfCharsetFromBom : com.google.common.base.Charsets.UTF_8;
    }

    private java.lang.String processLine(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        java.lang.String trim = str.trim();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(trim);
        java.util.regex.Matcher matcher = SUBRIP_TAG_PATTERN.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            java.lang.String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private androidx.media3.common.text.Cue buildCue(android.text.Spanned spanned, java.lang.String str) {
        char c;
        char c2;
        androidx.media3.common.text.Cue.Builder text = new androidx.media3.common.text.Cue.Builder().setText(spanned);
        if (str == null) {
            return text.build();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals(ALIGN_BOTTOM_LEFT)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals(ALIGN_BOTTOM_MID)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals(ALIGN_BOTTOM_RIGHT)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals(ALIGN_MID_LEFT)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals(ALIGN_MID_MID)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals(ALIGN_MID_RIGHT)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals(ALIGN_TOP_LEFT)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals(ALIGN_TOP_MID)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals(ALIGN_TOP_RIGHT)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            text.setPositionAnchor(0);
        } else if (c == 3 || c == 4 || c == 5) {
            text.setPositionAnchor(2);
        } else {
            text.setPositionAnchor(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals(ALIGN_BOTTOM_LEFT)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals(ALIGN_BOTTOM_MID)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals(ALIGN_BOTTOM_RIGHT)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals(ALIGN_MID_LEFT)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals(ALIGN_MID_MID)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals(ALIGN_MID_RIGHT)) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals(ALIGN_TOP_LEFT)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals(ALIGN_TOP_MID)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals(ALIGN_TOP_RIGHT)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            text.setLineAnchor(2);
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            text.setLineAnchor(0);
        } else {
            text.setLineAnchor(1);
        }
        return text.setPosition(getFractionalPositionForAnchorType(text.getPositionAnchor())).setLine(getFractionalPositionForAnchorType(text.getLineAnchor()), 0).build();
    }

    private static long parseTimecode(java.util.regex.Matcher matcher, int i) {
        java.lang.String group = matcher.group(i + 1);
        long parseLong = (group != null ? java.lang.Long.parseLong(group) * 3600000 : 0L) + (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(i + 2))) * 60000) + (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(i + 3))) * 1000);
        java.lang.String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += java.lang.Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    public static float getFractionalPositionForAnchorType(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return END_FRACTION;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
