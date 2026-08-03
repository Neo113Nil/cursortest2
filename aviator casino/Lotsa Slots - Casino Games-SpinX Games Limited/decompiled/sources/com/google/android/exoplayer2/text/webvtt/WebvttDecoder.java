package com.google.android.exoplayer2.text.webvtt;

/* loaded from: classes3.dex */
public final class WebvttDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final java.lang.String COMMENT_START = "NOTE";
    private static final int EVENT_COMMENT = 1;
    private static final int EVENT_CUE = 3;
    private static final int EVENT_END_OF_FILE = 0;
    private static final int EVENT_NONE = -1;
    private static final int EVENT_STYLE_BLOCK = 2;
    private static final java.lang.String STYLE_START = "STYLE";
    private final com.google.android.exoplayer2.text.webvtt.WebvttCssParser cssParser;
    private final com.google.android.exoplayer2.util.ParsableByteArray parsableWebvttData;

    public WebvttDecoder() {
        super("WebvttDecoder");
        this.parsableWebvttData = new com.google.android.exoplayer2.util.ParsableByteArray();
        this.cssParser = new com.google.android.exoplayer2.text.webvtt.WebvttCssParser();
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected com.google.android.exoplayer2.text.Subtitle decode(byte[] bArr, int i, boolean z) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        com.google.android.exoplayer2.text.webvtt.WebvttCueInfo parseCue;
        this.parsableWebvttData.reset(bArr, i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.google.android.exoplayer2.text.webvtt.WebvttParserUtil.validateWebvttHeaderLine(this.parsableWebvttData);
            while (!android.text.TextUtils.isEmpty(this.parsableWebvttData.readLine())) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (true) {
                int nextEvent = getNextEvent(this.parsableWebvttData);
                if (nextEvent == 0) {
                    return new com.google.android.exoplayer2.text.webvtt.WebvttSubtitle(arrayList2);
                }
                if (nextEvent == 1) {
                    skipComment(this.parsableWebvttData);
                } else if (nextEvent == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new com.google.android.exoplayer2.text.SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.parsableWebvttData.readLine();
                    arrayList.addAll(this.cssParser.parseBlock(this.parsableWebvttData));
                } else if (nextEvent == 3 && (parseCue = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.parseCue(this.parsableWebvttData, arrayList)) != null) {
                    arrayList2.add(parseCue);
                }
            }
        } catch (com.google.android.exoplayer2.ParserException e) {
            throw new com.google.android.exoplayer2.text.SubtitleDecoderException(e);
        }
    }

    private static int getNextEvent(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
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

    private static void skipComment(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        while (!android.text.TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }
}
