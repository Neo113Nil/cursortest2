package com.google.android.exoplayer2.extractor;

/* loaded from: classes3.dex */
public final class ExtractorUtil {
    @org.checkerframework.dataflow.qual.Pure
    public static void checkContainerInput(boolean z, java.lang.String str) throws com.google.android.exoplayer2.ParserException {
        if (!z) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer(str, null);
        }
    }

    public static int peekToLength(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        while (i3 < i2) {
            int peek = extractorInput.peek(bArr, i + i3, i2 - i3);
            if (peek == -1) {
                break;
            }
            i3 += peek;
        }
        return i3;
    }

    public static boolean readFullyQuietly(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            extractorInput.readFully(bArr, i, i2);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, int i) throws java.io.IOException {
        try {
            extractorInput.skipFully(i);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean peekFullyQuietly(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        try {
            return extractorInput.peekFully(bArr, i, i2, z);
        } catch (java.io.EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    private ExtractorUtil() {
    }
}
