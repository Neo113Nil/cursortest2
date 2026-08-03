package androidx.media3.extractor.text;

/* loaded from: classes2.dex */
public final class DefaultSubtitleParserFactory implements androidx.media3.extractor.text.SubtitleParser.Factory {
    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public boolean supportsFormat(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        return java.util.Objects.equals(str, "text/x-ssa") || java.util.Objects.equals(str, "text/vtt") || java.util.Objects.equals(str, "application/x-mp4-vtt") || java.util.Objects.equals(str, "application/x-subrip") || java.util.Objects.equals(str, "application/x-quicktime-tx3g") || java.util.Objects.equals(str, "application/pgs") || java.util.Objects.equals(str, "application/dvbsubs") || java.util.Objects.equals(str, "application/ttml+xml");
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public int getCueReplacementBehavior(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public androidx.media3.extractor.text.SubtitleParser create(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "application/dvbsubs":
                    return new androidx.media3.extractor.text.dvb.DvbParser(format.initializationData);
                case "application/pgs":
                    return new androidx.media3.extractor.text.pgs.PgsParser();
                case "application/x-mp4-vtt":
                    return new androidx.media3.extractor.text.webvtt.Mp4WebvttParser();
                case "text/vtt":
                    return new androidx.media3.extractor.text.webvtt.WebvttParser();
                case "application/x-quicktime-tx3g":
                    return new androidx.media3.extractor.text.tx3g.Tx3gParser(format.initializationData);
                case "text/x-ssa":
                    return new androidx.media3.extractor.text.ssa.SsaParser(format.initializationData);
                case "application/x-subrip":
                    return new androidx.media3.extractor.text.subrip.SubripParser();
                case "application/ttml+xml":
                    return new androidx.media3.extractor.text.ttml.TtmlParser();
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
