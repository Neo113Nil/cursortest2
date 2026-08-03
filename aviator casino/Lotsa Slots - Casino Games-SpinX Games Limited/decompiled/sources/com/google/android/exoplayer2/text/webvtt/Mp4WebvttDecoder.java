package com.google.android.exoplayer2.text.webvtt;

/* loaded from: classes3.dex */
public final class Mp4WebvttDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final int BOX_HEADER_SIZE = 8;
    private static final int TYPE_payl = 1885436268;
    private static final int TYPE_sttg = 1937011815;
    private static final int TYPE_vttc = 1987343459;
    private final com.google.android.exoplayer2.util.ParsableByteArray sampleData;

    public Mp4WebvttDecoder() {
        super("Mp4WebvttDecoder");
        this.sampleData = new com.google.android.exoplayer2.util.ParsableByteArray();
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected com.google.android.exoplayer2.text.Subtitle decode(byte[] bArr, int i, boolean z) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        this.sampleData.reset(bArr, i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.sampleData.bytesLeft() > 0) {
            if (this.sampleData.bytesLeft() < 8) {
                throw new com.google.android.exoplayer2.text.SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int readInt = this.sampleData.readInt();
            if (this.sampleData.readInt() == TYPE_vttc) {
                arrayList.add(parseVttCueBox(this.sampleData, readInt - 8));
            } else {
                this.sampleData.skipBytes(readInt - 8);
            }
        }
        return new com.google.android.exoplayer2.text.webvtt.Mp4WebvttSubtitle(arrayList);
    }

    private static com.google.android.exoplayer2.text.Cue parseVttCueBox(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        java.lang.CharSequence charSequence = null;
        com.google.android.exoplayer2.text.Cue.Builder builder = null;
        while (i > 0) {
            if (i < 8) {
                throw new com.google.android.exoplayer2.text.SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            int i2 = readInt - 8;
            java.lang.String fromUtf8Bytes = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(parsableByteArray.getData(), parsableByteArray.getPosition(), i2);
            parsableByteArray.skipBytes(i2);
            i = (i - 8) - i2;
            if (readInt2 == TYPE_sttg) {
                builder = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.parseCueSettingsList(fromUtf8Bytes);
            } else if (readInt2 == TYPE_payl) {
                charSequence = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.parseCueText(null, fromUtf8Bytes.trim(), java.util.Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (builder != null) {
            return builder.setText(charSequence).build();
        }
        return com.google.android.exoplayer2.text.webvtt.WebvttCueParser.newCueForText(charSequence);
    }
}
