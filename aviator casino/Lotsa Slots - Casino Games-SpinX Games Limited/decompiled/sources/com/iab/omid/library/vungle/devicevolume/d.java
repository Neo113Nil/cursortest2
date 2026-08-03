package com.iab.omid.library.vungle.devicevolume;

/* loaded from: classes5.dex */
public final class d extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final android.os.Handler f4540a;
    private final android.content.Context b;
    private final android.media.AudioManager c;
    private final com.iab.omid.library.vungle.devicevolume.a d;
    private final com.iab.omid.library.vungle.devicevolume.c e;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Float> f;
    private final java.util.concurrent.atomic.AtomicBoolean g;
    private final java.util.concurrent.ExecutorService h;

    class a implements java.lang.Runnable {

        /* renamed from: com.iab.omid.library.vungle.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC0110a implements java.lang.Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f4542a;

            RunnableC0110a(float f) {
                this.f4542a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.iab.omid.library.vungle.devicevolume.d.this.e.a(this.f4542a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float a2 = com.iab.omid.library.vungle.devicevolume.d.this.a();
            com.iab.omid.library.vungle.devicevolume.d.this.g.set(false);
            if (((java.lang.Float) com.iab.omid.library.vungle.devicevolume.d.this.f.getAndSet(java.lang.Float.valueOf(a2))).floatValue() != a2) {
                com.iab.omid.library.vungle.devicevolume.d.this.f4540a.post(new com.iab.omid.library.vungle.devicevolume.d.a.RunnableC0110a(a2));
            }
        }
    }

    public d(android.os.Handler handler, android.content.Context context, com.iab.omid.library.vungle.devicevolume.a aVar, com.iab.omid.library.vungle.devicevolume.c cVar) {
        super(handler);
        this.f = new java.util.concurrent.atomic.AtomicReference<>(java.lang.Float.valueOf(-1.0f));
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.f4540a = handler;
        this.b = context;
        this.c = (android.media.AudioManager) context.getSystemService("audio");
        this.d = aVar;
        this.e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.d.a(this.c.getStreamVolume(3), this.c.getStreamMaxVolume(3));
    }

    private void d() {
        this.h.submit(new com.iab.omid.library.vungle.devicevolume.d.a());
    }

    public void b() {
        d();
        this.b.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        if (this.g.getAndSet(true)) {
            return;
        }
        d();
    }
}
