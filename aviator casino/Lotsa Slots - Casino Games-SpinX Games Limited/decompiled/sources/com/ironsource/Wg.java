package com.ironsource;

/* loaded from: classes5.dex */
public abstract class Wg<Smash extends com.ironsource.AbstractC3107j3<?>> {
    public static final com.ironsource.Wg.a g = new com.ironsource.Wg.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f6049a;
    private final boolean b;
    private final java.util.List<Smash> c;
    private final java.util.List<Smash> d;
    private final java.util.List<Smash> e;
    private final java.util.List<Smash> f;

    public static final class a {

        /* renamed from: com.ironsource.Wg$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0130a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6050a;

            static {
                int[] iArr = new int[com.ironsource.Ng.values().length];
                try {
                    iArr[com.ironsource.Ng.DEFAULT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.ironsource.Ng.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f6050a = iArr;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <Smash extends com.ironsource.AbstractC3107j3<?>> com.ironsource.Wg<Smash> a(com.ironsource.Ng loadingStrategy, int i, boolean z, java.util.List<? extends Smash> waterfall) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            int i2 = com.ironsource.Wg.a.C0130a.f6050a[loadingStrategy.ordinal()];
            if (i2 == 1) {
                return new com.ironsource.I4(i, z, waterfall);
            }
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.ironsource.C3215p3(i, z, waterfall, false, 8, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Wg(int i, boolean z, java.util.List<? extends Smash> waterfall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.f6049a = i;
        this.b = z;
        this.c = waterfall;
        this.d = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    public final java.util.List<Smash> a() {
        return this.f;
    }

    public final java.util.List<Smash> c() {
        return this.d;
    }

    public abstract void c(Smash smash);

    public final int d() {
        return this.d.size() + this.e.size() + this.f.size();
    }

    public boolean e() {
        return d() >= this.f6049a;
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    public final void d(Smash smash) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        if (smash.x()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.e.add(smash);
            return;
        }
        if (smash.z()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f.add(smash);
            return;
        }
        if (smash.A().get()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f.add(smash);
            return;
        }
        if (!this.b || !b(smash)) {
            c(smash);
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int b() {
        java.lang.Integer num;
        java.util.List<Smash> list = this.c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.ironsource.AbstractC3107j3) obj).y()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(a((com.ironsource.AbstractC3107j3) it.next()));
            while (it.hasNext()) {
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(a((com.ironsource.AbstractC3107j3) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
