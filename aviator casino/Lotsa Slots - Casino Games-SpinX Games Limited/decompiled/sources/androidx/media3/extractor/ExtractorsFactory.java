package androidx.media3.extractor;

/* loaded from: classes2.dex */
public interface ExtractorsFactory {
    public static final androidx.media3.extractor.ExtractorsFactory EMPTY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.ExtractorsFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.ExtractorsFactory.CC.lambda$static$0();
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ androidx.media3.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map map) {
            androidx.media3.extractor.Extractor[] createExtractors;
            createExtractors = createExtractors();
            return createExtractors;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ androidx.media3.extractor.ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
            return androidx.media3.extractor.ExtractorsFactory.CC.$default$experimentalSetTextTrackTranscodingEnabled(this, z);
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ androidx.media3.extractor.ExtractorsFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            return androidx.media3.extractor.ExtractorsFactory.CC.$default$setSubtitleParserFactory(this, factory);
        }
    };

    androidx.media3.extractor.Extractor[] createExtractors();

    androidx.media3.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);

    @java.lang.Deprecated
    androidx.media3.extractor.ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z);

    androidx.media3.extractor.ExtractorsFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory);

    /* renamed from: androidx.media3.extractor.ExtractorsFactory$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @java.lang.Deprecated
        public static androidx.media3.extractor.ExtractorsFactory $default$experimentalSetTextTrackTranscodingEnabled(androidx.media3.extractor.ExtractorsFactory _this, boolean z) {
            return _this;
        }

        public static androidx.media3.extractor.ExtractorsFactory $default$setSubtitleParserFactory(androidx.media3.extractor.ExtractorsFactory _this, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            return _this;
        }

        static {
            androidx.media3.extractor.ExtractorsFactory extractorsFactory = androidx.media3.extractor.ExtractorsFactory.EMPTY;
        }

        public static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
            return new androidx.media3.extractor.Extractor[0];
        }
    }
}
