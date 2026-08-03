package com.google.android.exoplayer2.extractor;

/* loaded from: classes3.dex */
public interface ExtractorsFactory {
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory EMPTY = new com.google.android.exoplayer2.extractor.ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.ExtractorsFactory$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final com.google.android.exoplayer2.extractor.Extractor[] createExtractors() {
            return com.google.android.exoplayer2.extractor.ExtractorsFactory.CC.lambda$static$0();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map map) {
            com.google.android.exoplayer2.extractor.Extractor[] createExtractors;
            createExtractors = createExtractors();
            return createExtractors;
        }
    };

    com.google.android.exoplayer2.extractor.Extractor[] createExtractors();

    com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);

    /* renamed from: com.google.android.exoplayer2.extractor.ExtractorsFactory$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory = com.google.android.exoplayer2.extractor.ExtractorsFactory.EMPTY;
        }

        public static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
            return new com.google.android.exoplayer2.extractor.Extractor[0];
        }
    }
}
