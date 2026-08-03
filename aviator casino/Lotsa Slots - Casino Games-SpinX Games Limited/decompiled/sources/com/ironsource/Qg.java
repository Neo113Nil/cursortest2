package com.ironsource;

/* loaded from: classes5.dex */
public final class Qg<Smash extends com.ironsource.AbstractC3107j3<?>> {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.W f5943a;

    public static final class a<T> implements java.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.ironsource.AbstractC3107j3) t).i().l()), java.lang.Integer.valueOf(((com.ironsource.AbstractC3107j3) t2).i().l()));
        }
    }

    public Qg(com.ironsource.W managerData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managerData, "managerData");
        this.f5943a = managerData;
    }

    public final boolean a(com.ironsource.AbstractC3107j3<?> smash, java.util.List<? extends Smash> waterfall) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        java.util.Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((com.ironsource.AbstractC3107j3) obj).x()) {
                break;
            }
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, smash);
    }

    public final java.util.List<Smash> b(java.util.List<? extends Smash> waterfall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        return kotlin.collections.CollectionsKt.sortedWith(waterfall, new com.ironsource.Qg.a());
    }

    public final Smash c(java.util.List<? extends Smash> waterfall) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        java.util.Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.ironsource.AbstractC3107j3) obj).B()) {
                break;
            }
        }
        return (Smash) obj;
    }

    public final com.ironsource.Rg<Smash> d(java.util.List<? extends Smash> waterfall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(this.f5943a.b().name() + " waterfall size: " + waterfall.size());
        com.ironsource.Wg a2 = com.ironsource.Wg.g.a(this.f5943a.c() ? com.ironsource.Ng.BIDDER_SENSITIVE : com.ironsource.Ng.DEFAULT, this.f5943a.i(), this.f5943a.m(), waterfall);
        java.util.Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            a2.d(it.next());
            if (a2.e()) {
                return new com.ironsource.Rg<>(a2);
            }
        }
        return new com.ironsource.Rg<>(a2);
    }

    public final boolean a(java.util.List<? extends Smash> waterfall) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof java.util.Collection) && waterfall.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<T> it = waterfall.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((com.ironsource.AbstractC3107j3) it.next()).y() && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.f5943a.i();
    }
}
