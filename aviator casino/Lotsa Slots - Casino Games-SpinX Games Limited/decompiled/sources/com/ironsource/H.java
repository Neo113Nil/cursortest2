package com.ironsource;

/* loaded from: classes5.dex */
public abstract class H {
    public static final com.ironsource.H.a c = new com.ironsource.H.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.AbstractC3355x0 f5732a;
    private final com.ironsource.Jg b;

    public static final class a {

        /* renamed from: com.ironsource.H$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0119a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5733a;

            static {
                int[] iArr = new int[com.ironsource.Ng.values().length];
                try {
                    iArr[com.ironsource.Ng.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.ironsource.Ng.DEFAULT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f5733a = iArr;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.H a(com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.Jg waterfallInstances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            int i = com.ironsource.H.a.C0119a.f5733a[(adUnitData.d() ? com.ironsource.Ng.BIDDER_SENSITIVE : com.ironsource.Ng.DEFAULT).ordinal()];
            if (i == 1) {
                return new com.ironsource.C3197o3(adUnitData, waterfallInstances);
            }
            if (i == 2) {
                return adUnitData.q() ? new com.ironsource.C3370xf(adUnitData, waterfallInstances) : new com.ironsource.G4(adUnitData, waterfallInstances);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final java.util.List<com.ironsource.B> f5734a = new java.util.ArrayList();
        private final java.util.List<com.ironsource.B> b = new java.util.ArrayList();
        private final java.util.List<com.ironsource.B> c = new java.util.ArrayList();
        private boolean d;

        public final java.util.List<com.ironsource.B> a() {
            return this.f5734a;
        }

        public final java.util.List<com.ironsource.B> b() {
            return this.b;
        }

        public final java.util.List<com.ironsource.B> c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.f5734a.isEmpty() && this.c.isEmpty();
        }

        public final int g() {
            return this.f5734a.size() + this.b.size() + this.c.size();
        }

        public final void a(boolean z) {
            this.d = z;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.B f5735a;
        private final java.util.List<com.ironsource.B> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(com.ironsource.B b, java.util.List<? extends com.ironsource.B> orderedInstances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            this.f5735a = b;
            this.b = orderedInstances;
        }

        public final com.ironsource.B a() {
            return this.f5735a;
        }

        public final java.util.List<com.ironsource.B> b() {
            return this.b;
        }

        public final com.ironsource.B c() {
            return this.f5735a;
        }

        public final java.util.List<com.ironsource.B> d() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.H.c)) {
                return false;
            }
            com.ironsource.H.c cVar = (com.ironsource.H.c) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f5735a, cVar.f5735a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            com.ironsource.B b = this.f5735a;
            return ((b == null ? 0 : b.hashCode()) * 31) + this.b.hashCode();
        }

        public java.lang.String toString() {
            return "ShowSelection(instanceToShow=" + this.f5735a + ", orderedInstances=" + this.b + ")";
        }

        public final com.ironsource.H.c a(com.ironsource.B b, java.util.List<? extends com.ironsource.B> orderedInstances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            return new com.ironsource.H.c(b, orderedInstances);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.ironsource.H.c a(com.ironsource.H.c cVar, com.ironsource.B b, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                b = cVar.f5735a;
            }
            if ((i & 2) != 0) {
                list = cVar.b;
            }
            return cVar.a(b, list);
        }
    }

    public static final class d<T> implements java.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.ironsource.B) t).h().l()), java.lang.Integer.valueOf(((com.ironsource.B) t2).h().l()));
        }
    }

    public H(com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.Jg waterfallInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f5732a = adUnitData;
        this.b = waterfallInstances;
    }

    private final java.util.List<com.ironsource.B> b() {
        return kotlin.collections.CollectionsKt.sortedWith(this.b.b(), new com.ironsource.H.d());
    }

    public abstract void a(com.ironsource.B b2, com.ironsource.H.b bVar);

    protected boolean a(com.ironsource.B instance, com.ironsource.Jg waterfallInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return false;
    }

    public final com.ironsource.H.c c() {
        java.lang.Object obj;
        java.util.List<com.ironsource.B> b2 = b();
        java.util.Iterator<T> it = b2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.ironsource.B) obj).x()) {
                break;
            }
        }
        return new com.ironsource.H.c((com.ironsource.B) obj, b2);
    }

    public final com.ironsource.H.b d() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(this.f5732a.b().a().name() + " waterfall size: " + this.b.b().size());
        com.ironsource.H.b bVar = new com.ironsource.H.b();
        boolean l = com.ironsource.Jb.u.d().h().l();
        java.util.Iterator<com.ironsource.B> it = this.b.b().iterator();
        while (it.hasNext() && !a(it.next(), bVar, l)) {
        }
        return bVar;
    }

    public final boolean a(com.ironsource.B instance) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        java.util.Iterator<T> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((com.ironsource.B) obj).w()) {
                break;
            }
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, instance);
    }

    public final boolean a() {
        int i;
        java.util.List<com.ironsource.B> b2 = this.b.b();
        if ((b2 instanceof java.util.Collection) && b2.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<T> it = b2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((com.ironsource.B) it.next()).x() && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.f5732a.k();
    }

    public boolean a(com.ironsource.H.b loadSelection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return loadSelection.g() >= this.f5732a.k();
    }

    private final boolean a(com.ironsource.B b2, com.ironsource.H.b bVar, boolean z) {
        if (b2.w()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is failed to load");
        } else if (b2.x() && !b2.A()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is already loaded");
            bVar.b().add(b2);
        } else if (b2.y()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " still loading");
            bVar.c().add(b2);
        } else if (a(b2, this.b) && !z) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is not better than already loaded instances");
        } else {
            a(b2, bVar);
        }
        return a(bVar);
    }
}
