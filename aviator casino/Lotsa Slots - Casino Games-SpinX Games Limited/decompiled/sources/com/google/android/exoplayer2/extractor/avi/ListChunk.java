package com.google.android.exoplayer2.extractor.avi;

/* loaded from: classes3.dex */
final class ListChunk implements com.google.android.exoplayer2.extractor.avi.AviChunk {
    public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.extractor.avi.AviChunk> children;
    private final int type;

    public static com.google.android.exoplayer2.extractor.avi.ListChunk parseFrom(int i, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        com.google.android.exoplayer2.extractor.avi.AviChunk createBox;
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        int limit = parsableByteArray.limit();
        int i2 = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            if (readLittleEndianInt == 1414744396) {
                createBox = parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray);
            } else {
                createBox = createBox(readLittleEndianInt, i2, parsableByteArray);
            }
            if (createBox != null) {
                if (createBox.getType() == 1752331379) {
                    i2 = ((com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk) createBox).getTrackType();
                }
                builder.add((com.google.common.collect.ImmutableList.Builder) createBox);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(limit);
        }
        return new com.google.android.exoplayer2.extractor.avi.ListChunk(i, builder.build());
    }

    private ListChunk(int i, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.extractor.avi.AviChunk> immutableList) {
        this.type = i;
        this.children = immutableList;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }

    public <T extends com.google.android.exoplayer2.extractor.avi.AviChunk> T getChild(java.lang.Class<T> cls) {
        com.google.common.collect.UnmodifiableIterator<com.google.android.exoplayer2.extractor.avi.AviChunk> it = this.children.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    private static com.google.android.exoplayer2.extractor.avi.AviChunk createBox(int i, int i2, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        switch (i) {
            case 1718776947:
                return com.google.android.exoplayer2.extractor.avi.StreamFormatChunk.parseFrom(i2, parsableByteArray);
            case 1751742049:
                return com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk.parseFrom(parsableByteArray);
            case 1752331379:
                return com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case 1852994675:
                return com.google.android.exoplayer2.extractor.avi.StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }
}
