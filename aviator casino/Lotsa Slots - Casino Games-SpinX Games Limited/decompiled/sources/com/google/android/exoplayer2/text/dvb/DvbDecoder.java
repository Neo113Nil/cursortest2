package com.google.android.exoplayer2.text.dvb;

/* loaded from: classes3.dex */
public final class DvbDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private final com.google.android.exoplayer2.text.dvb.DvbParser parser;

    public DvbDecoder(java.util.List<byte[]> list) {
        super("DvbDecoder");
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(list.get(0));
        this.parser = new com.google.android.exoplayer2.text.dvb.DvbParser(parsableByteArray.readUnsignedShort(), parsableByteArray.readUnsignedShort());
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected com.google.android.exoplayer2.text.Subtitle decode(byte[] bArr, int i, boolean z) {
        if (z) {
            this.parser.reset();
        }
        return new com.google.android.exoplayer2.text.dvb.DvbSubtitle(this.parser.decode(bArr, i));
    }
}
