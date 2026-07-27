package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: DownloadTask.java */
/* loaded from: classes6.dex */
public class g implements m {
    private com.mbridge.msdk.config.component.load.downloader.database.c b;
    private volatile com.mbridge.msdk.config.component.load.downloader.b c;
    private volatile d f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f9000a = new Object();
    private volatile com.mbridge.msdk.config.component.load.downloader.database.b d = null;
    private volatile boolean e = true;

    private g(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        this.f = dVar;
        this.c = bVar;
        this.b = cVar;
    }

    static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        return new g(dVar, bVar, cVar);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        String e = this.f.e();
        if (this.f.i() == 5) {
            com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
            cVar.a(true);
            return cVar;
        }
        if (this.c.e() == 0) {
            this.c.b(100);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.a(e, this.c.b(), new c.a() { // from class: com.mbridge.msdk.config.component.load.downloader.core.g$$ExternalSyntheticLambda0
            @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
            public final void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
                g.this.a(countDownLatch, bVar);
            }
        });
        try {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                synchronized (this.f9000a) {
                    this.e = false;
                }
            } catch (InterruptedException e2) {
                q0.a(IDownloadTask.TAG, e2.getMessage(), e2);
                countDownLatch.countDown();
                synchronized (this.f9000a) {
                    this.e = false;
                }
            }
            com.mbridge.msdk.config.component.load.downloader.c run = k.a(this.f, this.d, this.b, e, this.c).run();
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.a(run) || !run.c()) {
                if (this.c != null) {
                    this.c.a(false);
                }
                return n.a(this.f, this.d, this.b, this.c).run();
            }
            if (this.c != null) {
                this.c.a(true);
                this.c.a(this.f.k());
                this.c.b(this.d.h());
                this.c.b(this.d.d());
                this.c.c(this.d.n());
                this.c.a(com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f.k(), this.f.f()));
            }
            a(this.f, this.c);
            return run;
        } catch (Throwable th) {
            synchronized (this.f9000a) {
                this.e = false;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CountDownLatch countDownLatch, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        synchronized (this.f9000a) {
            if (this.e) {
                this.d = bVar;
            }
        }
        countDownLatch.countDown();
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (dVar.i() != 5) {
            long f = this.f.f();
            long k = this.f.k();
            dVar.a(bVar, new DownloadProgress(f, k, com.mbridge.msdk.config.component.load.downloader.utils.b.a(k, f)));
        }
    }
}
