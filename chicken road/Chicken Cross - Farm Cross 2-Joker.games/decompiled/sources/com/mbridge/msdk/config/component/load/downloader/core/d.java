package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: DownloadRequest.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private long f8990a;
    private com.mbridge.msdk.config.component.load.downloader.b b;
    private int c;
    private long d;
    private Map<String, String> e;
    private Future f;
    private HashMap<String, List<String>> g;
    private volatile com.mbridge.msdk.config.component.load.downloader.f h;
    private long i;
    private int j;
    private int l;
    private int m;
    private long n;
    private String p;
    private String q;
    private long r;
    private volatile int k = 0;
    private long o = 0;

    /* compiled from: DownloadRequest.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f8991a;

        a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f8991a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.h != null) {
                    d.this.h.a(this.f8991a);
                }
                d.this.a();
            } catch (Exception e) {
                q0.b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* compiled from: DownloadRequest.java */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f8992a;
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.a b;

        b(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            this.f8992a = bVar;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.k >= d.this.j) {
                    d.this.b(4);
                    if (d.this.h != null) {
                        d.this.h.a(this.f8992a, this.b);
                    }
                    d.this.a();
                    return;
                }
                d.this.b(7);
                d.this.k++;
                com.mbridge.msdk.config.component.load.downloader.core.f.a().b(d.this);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().a(d.this);
            } catch (Exception e) {
                q0.b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* compiled from: DownloadRequest.java */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f8993a;
        final /* synthetic */ DownloadProgress b;

        c(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
            this.f8993a = bVar;
            this.b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.h != null) {
                    d.this.h.a(this.f8993a, this.b);
                }
            } catch (Exception e) {
                q0.b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* compiled from: DownloadRequest.java */
    /* renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d, reason: collision with other inner class name */
    class RunnableC1358d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f8994a;

        RunnableC1358d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f8994a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.h != null) {
                    d.this.h.c(this.f8994a);
                }
            } catch (Exception e) {
                q0.b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* compiled from: DownloadRequest.java */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f8995a;

        e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f8995a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.h != null) {
                    d.this.h.b(this.f8995a);
                }
            } catch (Exception e) {
                q0.b("DownloadRequest", e.getMessage());
            }
        }
    }

    /* compiled from: DownloadRequest.java */
    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f8996a;

        f(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f8996a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.e != null && !d.this.e.isEmpty()) {
                    String str = (String) d.this.e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f8996a.a("responseHeaders", str);
                    }
                }
                if (d.this.h != null) {
                    d.this.h.d(this.f8996a);
                }
                d.this.a();
            } catch (Exception e) {
                q0.b("DownloadRequest", e.getMessage());
            }
        }
    }

    d(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        this.g = eVar.f;
        this.c = eVar.c;
        this.i = eVar.g;
        this.f8990a = eVar.f8997a;
        this.p = eVar.j;
        this.b = eVar.b;
        this.r = eVar.k;
        this.h = eVar.d;
        this.j = eVar.h;
        this.n = eVar.i;
        this.e = eVar.e;
    }

    public long f() {
        return this.d;
    }

    public long g() {
        return this.i;
    }

    public int h() {
        return this.l;
    }

    public int i() {
        return this.m;
    }

    public long j() {
        return this.n;
    }

    public long k() {
        return this.o;
    }

    public long l() {
        return this.r;
    }

    public void m() {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(this);
    }

    public long b() {
        return this.f8990a;
    }

    public com.mbridge.msdk.config.component.load.downloader.b c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public String e() {
        com.mbridge.msdk.config.component.load.downloader.b bVar = this.b;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public static d a(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        return new d(eVar);
    }

    public void b(int i) {
        this.m = i;
    }

    public void c(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.m != 5) {
            i.b().a().getDownloadResultTasks().execute(new e(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), System.currentTimeMillis(), 0L, System.currentTimeMillis(), k(), f(), 0, this.q, 0, "", bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.m != 5) {
            i.b().a().getDownloadResultTasks().execute(new RunnableC1358d(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), System.currentTimeMillis(), 0L, System.currentTimeMillis(), k(), f(), 0, this.q, 2, "", bVar.b(), bVar.a()));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        this.m = 5;
        Future future = this.f;
        if (future != null) {
            future.cancel(false);
        }
    }

    public void b(long j) {
        this.o = j;
    }

    public void e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.m != 5) {
            b(1);
            i.b().a().getDownloadResultTasks().execute(new f(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), bVar.g(), bVar.i(), System.currentTimeMillis(), k(), f(), bVar.d(), this.q, 1, bVar.j(), bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void b(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        i.b().a().getDownloadResultTasks().execute(new a(bVar));
    }

    public void a(long j) {
        this.d = j;
    }

    public void a(int i) {
        this.l = i;
    }

    public void a(String str) {
        this.q = str;
    }

    public void a(Future future) {
        this.f = future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.h = null;
        com.mbridge.msdk.config.component.load.downloader.core.f.a().b(this);
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
        if (this.m != 5) {
            b(4);
            i.b().a().getDownloadResultTasks().execute(new b(bVar, aVar));
            q0.b("DownloadRequest", aVar.a().getMessage());
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), bVar.g(), 0L, 0L, k(), f(), bVar.d(), this.q, 4, "", bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
        if (this.m != 5) {
            i.b().a().getDownloadResultTasks().execute(new c(bVar, downloadProgress));
        }
    }
}
