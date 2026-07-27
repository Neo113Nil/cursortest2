package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5728a;
    public y b;
    public IOException c;

    public b0(String str) {
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f5774a;
        this.f5728a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.player.exoplayer2.util.y(str));
    }

    public final boolean a() {
        return this.b != null;
    }

    public final void b() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        y yVar = this.b;
        if (yVar != null) {
            int i = yVar.c;
            IOException iOException2 = yVar.e;
            if (iOException2 != null && yVar.f > i) {
                throw iOException2;
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.k kVar) {
        y yVar = this.b;
        if (yVar != null) {
            yVar.a(true);
        }
        if (kVar != null) {
            this.f5728a.execute(kVar);
        }
        this.f5728a.shutdown();
    }
}
