package com.google.android.exoplayer2.text.subrip;

/* loaded from: classes3.dex */
public final class SubripDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final java.lang.String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final java.lang.String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final java.lang.String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final java.lang.String ALIGN_MID_LEFT = "{\\an4}";
    private static final java.lang.String ALIGN_MID_MID = "{\\an5}";
    private static final java.lang.String ALIGN_MID_RIGHT = "{\\an6}";
    private static final java.lang.String ALIGN_TOP_LEFT = "{\\an7}";
    private static final java.lang.String ALIGN_TOP_MID = "{\\an8}";
    private static final java.lang.String ALIGN_TOP_RIGHT = "{\\an9}";
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final java.lang.String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final java.lang.String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final java.lang.String TAG = "SubripDecoder";
    private final java.util.ArrayList<java.lang.String> tags;
    private final java.lang.StringBuilder textBuilder;
    private static final java.util.regex.Pattern SUBRIP_TIMING_LINE = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final java.util.regex.Pattern SUBRIP_TAG_PATTERN = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");

    public SubripDecoder() {
        super(TAG);
        this.textBuilder = new java.lang.StringBuilder();
        this.tags = new java.util.ArrayList<>();
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected com.google.android.exoplayer2.text.Subtitle decode(byte[] bArr, int i, boolean z) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.exoplayer2.util.LongArray longArray = new com.google.android.exoplayer2.util.LongArray();
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(bArr, i);
        while (true) {
            java.lang.String readLine = parsableByteArray.readLine();
            int i2 = 0;
            if (readLine == null) {
                break;
            }
            if (readLine.length() != 0) {
                try {
                    java.lang.Integer.parseInt(readLine);
                    java.lang.String readLine2 = parsableByteArray.readLine();
                    if (readLine2 == null) {
                        com.google.android.exoplayer2.util.Log.w(TAG, "Unexpected end");
                        break;
                    }
                    java.util.regex.Matcher matcher = SUBRIP_TIMING_LINE.matcher(readLine2);
                    if (!matcher.matches()) {
                        com.google.android.exoplayer2.util.Log.w(TAG, "Skipping invalid timing: " + readLine2);
                    } else {
                        longArray.add(parseTimecode(matcher, 1));
                        longArray.add(parseTimecode(matcher, 6));
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        for (java.lang.String readLine3 = parsableByteArray.readLine(); !android.text.TextUtils.isEmpty(readLine3); readLine3 = parsableByteArray.readLine()) {
                            if (this.textBuilder.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(readLine3, this.tags));
                        }
                        android.text.Spanned fromHtml = android.text.Html.fromHtml(this.textBuilder.toString());
                        while (true) {
                            if (i2 >= this.tags.size()) {
                                str = null;
                                break;
                            }
                            str = this.tags.get(i2);
                            if (str.matches(SUBRIP_ALIGNMENT_TAG)) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(buildCue(fromHtml, str));
                        arrayList.add(com.google.android.exoplayer2.text.Cue.EMPTY);
                    }
                } catch (java.lang.NumberFormatException unused) {
                    com.google.android.exoplayer2.util.Log.w(TAG, "Skipping invalid index: " + readLine);
                }
            }
        }
        return new com.google.android.exoplayer2.text.subrip.SubripSubtitle((com.google.android.exoplayer2.text.Cue[]) arrayList.toArray(new com.google.android.exoplayer2.text.Cue[0]), longArray.toArray());
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
    private com.google.android.exoplayer2.text.Cue buildCue(android.text.Spanned spanned, java.lang.String str) {
        char c;
        char c2;
        com.google.android.exoplayer2.text.Cue.Builder text = new com.google.android.exoplayer2.text.Cue.Builder().setText(spanned);
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
        long parseLong = (group != null ? java.lang.Long.parseLong(group) * 3600000 : 0L) + (java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(i + 2))) * 60000) + (java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(i + 3))) * 1000);
        java.lang.String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += java.lang.Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    static float getFractionalPositionForAnchorType(int i) {
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
