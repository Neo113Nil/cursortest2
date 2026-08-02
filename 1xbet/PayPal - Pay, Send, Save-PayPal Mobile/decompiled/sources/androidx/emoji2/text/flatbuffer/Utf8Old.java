package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public class Utf8Old extends androidx.emoji2.text.flatbuffer.Utf8 {
    private static final java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.Utf8Old.Cache> getHighSpeedVideoFpsRanges = java.lang.ThreadLocal.withInitial(new java.util.function.Supplier() { // from class: androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticLambda0
        @Override // java.util.function.Supplier
        public final java.lang.Object get() {
            return androidx.emoji2.text.flatbuffer.Utf8Old.getHighSpeedVideoFpsRangesFor();
        }
    });

    static class Cache {
        java.lang.CharSequence getHighSpeedVideoFpsRanges = null;
        java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor = null;
        final java.nio.charset.CharsetEncoder Camera2StreamConfigurationMap = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
        final java.nio.charset.CharsetDecoder getHighSpeedVideoSizes = java.nio.charset.StandardCharsets.UTF_8.newDecoder();

        Cache() {
        }
    }

    static /* synthetic */ androidx.emoji2.text.flatbuffer.Utf8Old.Cache getHighSpeedVideoFpsRangesFor() {
        return new androidx.emoji2.text.flatbuffer.Utf8Old.Cache();
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(java.lang.CharSequence charSequence) {
        androidx.emoji2.text.flatbuffer.Utf8Old.Cache cache = getHighSpeedVideoFpsRanges.get();
        int length = (int) (charSequence.length() * cache.Camera2StreamConfigurationMap.maxBytesPerChar());
        if (cache.getHighSpeedVideoFpsRangesFor == null || cache.getHighSpeedVideoFpsRangesFor.capacity() < length) {
            cache.getHighSpeedVideoFpsRangesFor = java.nio.ByteBuffer.allocate(java.lang.Math.max(128, length));
        }
        cache.getHighSpeedVideoFpsRangesFor.clear();
        cache.getHighSpeedVideoFpsRanges = charSequence;
        java.nio.charset.CoderResult encode = cache.Camera2StreamConfigurationMap.encode(charSequence instanceof java.nio.CharBuffer ? (java.nio.CharBuffer) charSequence : java.nio.CharBuffer.wrap(charSequence), cache.getHighSpeedVideoFpsRangesFor, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (java.nio.charset.CharacterCodingException e) {
                throw new java.lang.IllegalArgumentException("bad character encoding", e);
            }
        }
        cache.getHighSpeedVideoFpsRangesFor.flip();
        return cache.getHighSpeedVideoFpsRangesFor.remaining();
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        androidx.emoji2.text.flatbuffer.Utf8Old.Cache cache = getHighSpeedVideoFpsRanges.get();
        if (cache.getHighSpeedVideoFpsRanges != charSequence) {
            encodedLength(charSequence);
        }
        byteBuffer.put(cache.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public java.lang.String decodeUtf8(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        java.nio.charset.CharsetDecoder charsetDecoder = getHighSpeedVideoFpsRanges.get().getHighSpeedVideoSizes;
        charsetDecoder.reset();
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (java.nio.charset.CharacterCodingException e) {
            throw new java.lang.IllegalArgumentException("Bad encoding", e);
        }
    }
}
