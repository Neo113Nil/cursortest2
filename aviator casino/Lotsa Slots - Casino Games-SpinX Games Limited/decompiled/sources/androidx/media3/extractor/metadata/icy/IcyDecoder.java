package androidx.media3.extractor.metadata.icy;

/* loaded from: classes2.dex */
public final class IcyDecoder extends androidx.media3.extractor.metadata.SimpleMetadataDecoder {
    private static final java.util.regex.Pattern METADATA_ELEMENT = java.util.regex.Pattern.compile("(.+?)='(.*?)';", 32);
    private static final java.lang.String STREAM_KEY_NAME = "streamtitle";
    private static final java.lang.String STREAM_KEY_URL = "streamurl";
    private final java.nio.charset.CharsetDecoder utf8Decoder = com.google.common.base.Charsets.UTF_8.newDecoder();
    private final java.nio.charset.CharsetDecoder iso88591Decoder = com.google.common.base.Charsets.ISO_8859_1.newDecoder();

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer) {
        java.lang.String decodeToString = decodeToString(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        java.lang.String str = null;
        if (decodeToString == null) {
            return new androidx.media3.common.Metadata(new androidx.media3.extractor.metadata.icy.IcyInfo(bArr, null, null));
        }
        java.util.regex.Matcher matcher = METADATA_ELEMENT.matcher(decodeToString);
        java.lang.String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            java.lang.String group = matcher.group(1);
            java.lang.String group2 = matcher.group(2);
            if (group != null) {
                java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(group);
                lowerCase.hashCode();
                if (lowerCase.equals(STREAM_KEY_URL)) {
                    str2 = group2;
                } else if (lowerCase.equals(STREAM_KEY_NAME)) {
                    str = group2;
                }
            }
        }
        return new androidx.media3.common.Metadata(new androidx.media3.extractor.metadata.icy.IcyInfo(bArr, str, str2));
    }

    private java.lang.String decodeToString(java.nio.ByteBuffer byteBuffer) {
        try {
            return this.utf8Decoder.decode(byteBuffer).toString();
        } catch (java.nio.charset.CharacterCodingException unused) {
            try {
                java.lang.String charBuffer = this.iso88591Decoder.decode(byteBuffer).toString();
                this.iso88591Decoder.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (java.nio.charset.CharacterCodingException unused2) {
                this.iso88591Decoder.reset();
                byteBuffer.rewind();
                return null;
            } catch (java.lang.Throwable th) {
                this.iso88591Decoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.utf8Decoder.reset();
            byteBuffer.rewind();
        }
    }
}
