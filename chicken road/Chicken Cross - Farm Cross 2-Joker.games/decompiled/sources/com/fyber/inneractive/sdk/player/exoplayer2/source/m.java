package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes4.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.z {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5713a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h b;
    public final n c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.o e;
    public volatile boolean f;
    public boolean g;
    public long h;
    public long i;
    public final /* synthetic */ p j;

    public m(p pVar, Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar) {
        this.j = pVar;
        uri.getClass();
        this.f5713a = uri;
        hVar.getClass();
        this.b = hVar;
        nVar.getClass();
        this.c = nVar;
        this.d = eVar;
        this.e = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.o();
        this.g = true;
        this.i = -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar;
        int i = 0;
        while (i == 0 && !this.f) {
            try {
                long j = this.e.f5636a;
                long a2 = this.b.a(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(this.f5713a, j, j, -1L, this.j.h, 0));
                this.i = a2;
                if (a2 != -1) {
                    this.i = a2 + j;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.b;
                bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar, j, this.i);
                try {
                    n nVar = this.c;
                    hVar.a();
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a3 = nVar.a(bVar);
                    if (this.g) {
                        a3.a(j, this.h);
                        this.g = false;
                    }
                    long j2 = j;
                    while (i == 0 && !this.f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.d;
                        synchronized (eVar) {
                            while (!eVar.f5759a) {
                                eVar.wait();
                            }
                        }
                        i = a3.a(bVar, this.e);
                        long j3 = bVar.c;
                        if (j3 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j2) {
                            this.d.a();
                            p pVar = this.j;
                            pVar.n.post(pVar.m);
                            j2 = j3;
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.e.f5636a = bVar.c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b);
                } catch (Throwable th) {
                    th = th;
                    if (i != 1 && bVar != null) {
                        this.e.f5636a = bVar.c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = null;
            }
        }
    }
}
