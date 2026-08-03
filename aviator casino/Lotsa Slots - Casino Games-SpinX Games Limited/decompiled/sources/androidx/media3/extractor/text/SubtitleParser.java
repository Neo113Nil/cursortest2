package androidx.media3.extractor.text;

/* loaded from: classes2.dex */
public interface SubtitleParser {

    public interface Factory {
        public static final androidx.media3.extractor.text.SubtitleParser.Factory UNSUPPORTED = new androidx.media3.extractor.text.SubtitleParser.Factory() { // from class: androidx.media3.extractor.text.SubtitleParser.Factory.1
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public int getCueReplacementBehavior(androidx.media3.common.Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public boolean supportsFormat(androidx.media3.common.Format format) {
                return false;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public androidx.media3.extractor.text.SubtitleParser create(androidx.media3.common.Format format) {
                throw new java.lang.IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        };

        androidx.media3.extractor.text.SubtitleParser create(androidx.media3.common.Format format);

        int getCueReplacementBehavior(androidx.media3.common.Format format);

        boolean supportsFormat(androidx.media3.common.Format format);
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer);

    void parse(byte[] bArr, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer);

    androidx.media3.extractor.text.Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2);

    void reset();

    public static class OutputOptions {
        private static final androidx.media3.extractor.text.SubtitleParser.OutputOptions ALL = new androidx.media3.extractor.text.SubtitleParser.OutputOptions(-9223372036854775807L, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        private OutputOptions(long j, boolean z) {
            this.startTimeUs = j;
            this.outputAllCues = z;
        }

        public static androidx.media3.extractor.text.SubtitleParser.OutputOptions allCues() {
            return ALL;
        }

        public static androidx.media3.extractor.text.SubtitleParser.OutputOptions onlyCuesAfter(long j) {
            return new androidx.media3.extractor.text.SubtitleParser.OutputOptions(j, false);
        }

        public static androidx.media3.extractor.text.SubtitleParser.OutputOptions cuesAfterThenRemainingCuesBefore(long j) {
            return new androidx.media3.extractor.text.SubtitleParser.OutputOptions(j, true);
        }
    }

    /* renamed from: androidx.media3.extractor.text.SubtitleParser$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$reset(androidx.media3.extractor.text.SubtitleParser _this) {
        }

        public static androidx.media3.extractor.text.Subtitle $default$parseToLegacySubtitle(androidx.media3.extractor.text.SubtitleParser _this, byte[] bArr, int i, int i2) {
            final com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions = androidx.media3.extractor.text.SubtitleParser.OutputOptions.ALL;
            java.util.Objects.requireNonNull(builder);
            _this.parse(bArr, i, i2, outputOptions, new androidx.media3.common.util.Consumer() { // from class: androidx.media3.extractor.text.SubtitleParser$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    com.google.common.collect.ImmutableList.Builder.this.add((com.google.common.collect.ImmutableList.Builder) obj);
                }
            });
            return new androidx.media3.extractor.text.CuesWithTimingSubtitle(builder.build());
        }
    }
}
