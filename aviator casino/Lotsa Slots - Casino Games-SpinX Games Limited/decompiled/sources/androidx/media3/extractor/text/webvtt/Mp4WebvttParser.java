package androidx.media3.extractor.text.webvtt;

/* loaded from: classes2.dex */
public final class Mp4WebvttParser implements androidx.media3.extractor.text.SubtitleParser {
    private static final int BOX_HEADER_SIZE = 8;
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int TYPE_payl = 1885436268;
    private static final int TYPE_sttg = 1937011815;
    private static final int TYPE_vttc = 1987343459;
    private final androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
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
        this.parsableByteArray.reset(bArr, i2 + i);
        this.parsableByteArray.setPosition(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.parsableByteArray.bytesLeft() > 0) {
            androidx.media3.common.util.Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int readInt = this.parsableByteArray.readInt();
            if (this.parsableByteArray.readInt() == TYPE_vttc) {
                arrayList.add(parseVttCueBox(this.parsableByteArray, readInt - 8));
            } else {
                this.parsableByteArray.skipBytes(readInt - 8);
            }
        }
        consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    private static androidx.media3.common.text.Cue parseVttCueBox(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        java.lang.CharSequence charSequence = null;
        androidx.media3.common.text.Cue.Builder builder = null;
        while (i > 0) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 8, "Incomplete vtt cue box header found.");
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            int i2 = readInt - 8;
            java.lang.String fromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(parsableByteArray.getData(), parsableByteArray.getPosition(), i2);
            parsableByteArray.skipBytes(i2);
            i = (i - 8) - i2;
            if (readInt2 == TYPE_sttg) {
                builder = androidx.media3.extractor.text.webvtt.WebvttCueParser.parseCueSettingsList(fromUtf8Bytes);
            } else if (readInt2 == TYPE_payl) {
                charSequence = androidx.media3.extractor.text.webvtt.WebvttCueParser.parseCueText(null, fromUtf8Bytes.trim(), java.util.Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (builder != null) {
            return builder.setText(charSequence).build();
        }
        return androidx.media3.extractor.text.webvtt.WebvttCueParser.newCueForText(charSequence);
    }
}
