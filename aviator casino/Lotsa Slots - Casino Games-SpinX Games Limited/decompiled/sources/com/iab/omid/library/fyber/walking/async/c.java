package com.iab.omid.library.fyber.walking.async;

/* loaded from: classes5.dex */
public class c implements com.iab.omid.library.fyber.walking.async.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> f4414a;
    private final java.util.concurrent.ThreadPoolExecutor b;
    private final java.util.ArrayDeque<com.iab.omid.library.fyber.walking.async.b> c = new java.util.ArrayDeque<>();
    private com.iab.omid.library.fyber.walking.async.b d = null;

    public c() {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        this.f4414a = linkedBlockingQueue;
        this.b = new java.util.concurrent.ThreadPoolExecutor(1, 1, 1L, java.util.concurrent.TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        com.iab.omid.library.fyber.walking.async.b poll = this.c.poll();
        this.d = poll;
        if (poll != null) {
            poll.a(this.b);
        }
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.a
    public void a(com.iab.omid.library.fyber.walking.async.b bVar) {
        this.d = null;
        a();
    }

    public void b(com.iab.omid.library.fyber.walking.async.b bVar) {
        bVar.a(this);
        this.c.add(bVar);
        if (this.d == null) {
            a();
        }
    }
}
