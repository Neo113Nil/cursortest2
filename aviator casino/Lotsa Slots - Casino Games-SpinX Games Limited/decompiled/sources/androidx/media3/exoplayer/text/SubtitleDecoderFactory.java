package androidx.media3.exoplayer.text;

/* loaded from: classes2.dex */
public interface SubtitleDecoderFactory {
    public static final androidx.media3.exoplayer.text.SubtitleDecoderFactory DEFAULT = new androidx.media3.exoplayer.text.SubtitleDecoderFactory() { // from class: androidx.media3.exoplayer.text.SubtitleDecoderFactory.1
        private final androidx.media3.extractor.text.DefaultSubtitleParserFactory delegate = new androidx.media3.extractor.text.DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public boolean supportsFormat(androidx.media3.common.Format format) {
            java.lang.String str = format.sampleMimeType;
            return this.delegate.supportsFormat(format) || java.util.Objects.equals(str, "application/cea-608") || java.util.Objects.equals(str, "application/x-mp4-cea-608") || java.util.Objects.equals(str, "application/cea-708");
        }

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public androidx.media3.extractor.text.SubtitleDecoder createDecoder(androidx.media3.common.Format format) {
            java.lang.String str = format.sampleMimeType;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new androidx.media3.extractor.text.cea.Cea608Decoder(str, format.accessibilityChannel, 16000L);
                    case "application/cea-708":
                        return new androidx.media3.extractor.text.cea.Cea708Decoder(format.accessibilityChannel, format.initializationData);
                }
            }
            if (this.delegate.supportsFormat(format)) {
                androidx.media3.extractor.text.SubtitleParser create = this.delegate.create(format);
                return new androidx.media3.exoplayer.text.DelegatingSubtitleDecoder(create.getClass().getSimpleName() + "Decoder", create);
            }
            throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    androidx.media3.extractor.text.SubtitleDecoder createDecoder(androidx.media3.common.Format format);

    boolean supportsFormat(androidx.media3.common.Format format);
}
