package com.bykv.vk.openvk.preload.geckox.a.a;

/* compiled from: CacheConfig.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f4626a;
    final c b;
    private final b c;

    /* synthetic */ a(C0098a c0098a, byte b) {
        this(c0098a);
    }

    private a(C0098a c0098a) {
        this.f4626a = c0098a.f4627a;
        this.c = c0098a.b;
        this.b = c0098a.c;
    }

    public final b a() {
        return this.c;
    }

    /* compiled from: CacheConfig.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0098a {

        /* renamed from: a, reason: collision with root package name */
        private int f4627a;
        private b b = b.f4628a;
        private c c;

        public final C0098a a() {
            this.f4627a = 20;
            return this;
        }

        public final C0098a a(b bVar) {
            if (bVar == null) {
                bVar = b.f4628a;
            }
            this.b = bVar;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }
    }
}
