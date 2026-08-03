package com.google.android.exoplayer2.offline;

/* loaded from: classes3.dex */
public final class FilteringManifestParser<T extends com.google.android.exoplayer2.offline.FilterableManifest<T>> implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<T> {
    private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends T> parser;
    private final java.util.List<com.google.android.exoplayer2.offline.StreamKey> streamKeys;

    public FilteringManifestParser(com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<? extends T> parser, java.util.List<com.google.android.exoplayer2.offline.StreamKey> list) {
        this.parser = parser;
        this.streamKeys = list;
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public T parse(android.net.Uri uri, java.io.InputStream inputStream) throws java.io.IOException {
        T parse = this.parser.parse(uri, inputStream);
        java.util.List<com.google.android.exoplayer2.offline.StreamKey> list = this.streamKeys;
        return (list == null || list.isEmpty()) ? parse : (T) parse.copy(this.streamKeys);
    }
}
