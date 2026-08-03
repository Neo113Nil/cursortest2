package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* loaded from: classes3.dex */
public final class b extends com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e {
    public final java.util.List b;
    public final java.util.List c;
    public final java.util.List d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.o e;
    public final java.util.List f;

    public b(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, java.util.List list4) {
        super(str);
        this.b = java.util.Collections.unmodifiableList(list);
        this.c = java.util.Collections.unmodifiableList(list2);
        this.d = java.util.Collections.unmodifiableList(list3);
        this.e = oVar;
        this.f = list4 != null ? java.util.Collections.unmodifiableList(list4) : null;
    }
}
