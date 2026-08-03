package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* loaded from: classes3.dex */
public final class k implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.x {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b f3950a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f i;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b j;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a k;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d l;
    public boolean m;
    public final int c = 3;
    public final java.util.ArrayList g = new java.util.ArrayList();
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 h = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0("HlsPlaylistTracker:MasterPlaylist");
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g();
    public final java.util.IdentityHashMap d = new java.util.IdentityHashMap();
    public final android.os.Handler e = new android.os.Handler();

    public k(android.net.Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j jVar) {
        this.f3950a = bVar;
        this.i = fVar;
        this.f = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 d0Var = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f4086a;
        long j3 = d0Var.f;
        if (fVar.b != null) {
            fVar.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 d0Var = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar = d0Var.d;
        boolean z = eVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d;
        if (z) {
            java.util.List singletonList = java.util.Collections.singletonList(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a(eVar.f3946a, new com.fyber.inneractive.sdk.player.exoplayer2.o("0", "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
            java.util.List emptyList = java.util.Collections.emptyList();
            bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b(null, singletonList, emptyList, emptyList, null, null);
        } else {
            bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b) eVar;
        }
        this.j = bVar;
        this.k = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) bVar.b.get(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(bVar.b);
        arrayList.addAll(bVar.c);
        arrayList.addAll(bVar.d);
        int size = arrayList.size();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) arrayList.get(i);
            this.d.put(aVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h(this, aVar, elapsedRealtime));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) this.d.get(this.k);
        if (z) {
            hVar.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d) eVar);
        } else {
            hVar.b();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f4086a;
        long j3 = d0Var.f;
        if (fVar.b != null) {
            fVar.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, java.io.IOException iOException) {
        boolean z;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 d0Var = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0) zVar;
        boolean z2 = iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f4086a;
        long j3 = d0Var.f;
        if (fVar.b != null) {
            z = z2;
            fVar.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z));
        } else {
            z = z2;
        }
        return z ? 3 : 0;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) this.d.get(aVar);
        hVar.getClass();
        hVar.g = android.os.SystemClock.elapsedRealtime();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar2 = hVar.d;
        if (dVar2 != null && this.j.b.contains(aVar) && (((dVar = this.l) == null || !dVar.j) && ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) this.d.get(this.k)).g - android.os.SystemClock.elapsedRealtime() > 15000)) {
            this.k = aVar;
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) this.d.get(aVar)).b();
        }
        return dVar2;
    }
}
