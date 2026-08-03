package com.google.android.exoplayer2.metadata;

/* loaded from: classes3.dex */
public interface MetadataDecoderFactory {
    public static final com.google.android.exoplayer2.metadata.MetadataDecoderFactory DEFAULT = new com.google.android.exoplayer2.metadata.MetadataDecoderFactory() { // from class: com.google.android.exoplayer2.metadata.MetadataDecoderFactory.1
        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        public boolean supportsFormat(com.google.android.exoplayer2.Format format) {
            java.lang.String str = format.sampleMimeType;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        public com.google.android.exoplayer2.metadata.MetadataDecoder createDecoder(com.google.android.exoplayer2.Format format) {
            java.lang.String str = format.sampleMimeType;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder();
                    case "application/x-icy":
                        return new com.google.android.exoplayer2.metadata.icy.IcyDecoder();
                    case "application/id3":
                        return new com.google.android.exoplayer2.metadata.id3.Id3Decoder();
                    case "application/x-emsg":
                        return new com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder();
                    case "application/x-scte35":
                        return new com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder();
                }
            }
            throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    com.google.android.exoplayer2.metadata.MetadataDecoder createDecoder(com.google.android.exoplayer2.Format format);

    boolean supportsFormat(com.google.android.exoplayer2.Format format);
}
