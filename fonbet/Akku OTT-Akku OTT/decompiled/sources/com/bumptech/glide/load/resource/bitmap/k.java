package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes3.dex */
public abstract class k {
    public static final e a;
    public static final d b;
    public static final f c;
    public static final d d;
    public static final com.bumptech.glide.load.h<k> e;
    public static final boolean f;

    public static class a extends k {
        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final g a(int i, int i2, int i3, int i4) {
            return g.b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final float b(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    public static class b extends k {
        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final g a(int i, int i2, int i3, int i4) {
            return g.a;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final float b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    public static class c extends k {
        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final g a(int i, int i2, int i3, int i4) {
            return b(i, i2, i3, i4) == 1.0f ? g.b : k.a.a(i, i2, i3, i4);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, k.a.b(i, i2, i3, i4));
        }
    }

    public static class d extends k {
        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final g a(int i, int i2, int i3, int i4) {
            return g.b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    public static class e extends k {
        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final g a(int i, int i2, int i3, int i4) {
            return k.f ? g.b : g.a;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final float b(int i, int i2, int i3, int i4) {
            if (k.f) {
                return Math.min(i3 / i, i4 / i2);
            }
            if (Math.max(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    public static class f extends k {
        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final g a(int i, int i2, int i3, int i4) {
            return g.b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k
        public final float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class g {
        public static final g a;
        public static final g b;
        public static final /* synthetic */ g[] c;

        static {
            g gVar = new g("MEMORY", 0);
            a = gVar;
            g gVar2 = new g("QUALITY", 1);
            b = gVar2;
            c = new g[]{gVar, gVar2};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) c.clone();
        }
    }

    static {
        new a();
        new b();
        a = new e();
        new c();
        d dVar = new d();
        b = dVar;
        c = new f();
        d = dVar;
        e = com.bumptech.glide.load.h.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f = true;
    }

    public abstract g a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
