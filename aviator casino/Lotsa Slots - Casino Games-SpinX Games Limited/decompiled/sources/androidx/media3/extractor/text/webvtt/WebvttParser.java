package androidx.media3.extractor.text.webvtt;

/* loaded from: classes2.dex */
public final class WebvttParser implements androidx.media3.extractor.text.SubtitleParser {
    private static final java.lang.String COMMENT_START = "NOTE";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int EVENT_COMMENT = 1;
    private static final int EVENT_CUE = 3;
    private static final int EVENT_END_OF_FILE = 0;
    private static final int EVENT_NONE = -1;
    private static final int EVENT_STYLE_BLOCK = 2;
    private static final java.lang.String STYLE_START = "STYLE";
    private final androidx.media3.common.util.ParsableByteArray parsableWebvttData = new androidx.media3.common.util.ParsableByteArray();
    private final androidx.media3.extractor.text.webvtt.WebvttCssParser cssParser = new androidx.media3.extractor.text.webvtt.WebvttCssParser();

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
        androidx.media3.extractor.text.webvtt.WebvttCueInfo parseCue;
        this.parsableWebvttData.reset(bArr, i2 + i);
        this.parsableWebvttData.setPosition(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            androidx.media3.extractor.text.webvtt.WebvttParserUtil.validateWebvttHeaderLine(this.parsableWebvttData);
            while (!android.text.TextUtils.isEmpty(this.parsableWebvttData.readLine())) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (true) {
                int nextEvent = getNextEvent(this.parsableWebvttData);
                if (nextEvent == 0) {
                    androidx.media3.extractor.text.LegacySubtitleUtil.toCuesWithTiming(new androidx.media3.extractor.text.webvtt.WebvttSubtitle(arrayList2), outputOptions, consumer);
                    return;
                }
                if (nextEvent == 1) {
                    skipComment(this.parsableWebvttData);
                } else if (nextEvent == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new java.lang.IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.parsableWebvttData.readLine();
                    arrayList.addAll(this.cssParser.parseBlock(this.parsableWebvttData));
                } else if (nextEvent == 3 && (parseCue = androidx.media3.extractor.text.webvtt.WebvttCueParser.parseCue(this.parsableWebvttData, arrayList)) != null) {
                    arrayList2.add(parseCue);
                }
            }
        } catch (androidx.media3.common.ParserException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    private static int getNextEvent(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = parsableByteArray.getPosition();
            java.lang.String readLine = parsableByteArray.readLine();
            if (readLine == null) {
                i = 0;
            } else if (STYLE_START.equals(readLine)) {
                i = 2;
            } else {
                i = readLine.startsWith(COMMENT_START) ? 1 : 3;
            }
        }
        parsableByteArray.setPosition(i2);
        return i;
    }

    private static void skipComment(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        while (!android.text.TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }
}
