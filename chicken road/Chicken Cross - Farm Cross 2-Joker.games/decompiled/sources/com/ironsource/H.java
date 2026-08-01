package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class H {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4720x0 f7647a;
    private final Mg b;

    public static final class a {

        /* renamed from: com.ironsource.H$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0307a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7648a;

            static {
                int[] iArr = new int[Qg.values().length];
                try {
                    iArr[Qg.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Qg.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f7648a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final H a(AbstractC4720x0 adUnitData, Mg waterfallInstances) {
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            int i = C0307a.f7648a[(adUnitData.d() ? Qg.BIDDER_SENSITIVE : Qg.DEFAULT).ordinal()];
            if (i == 1) {
                return new C4508l3(adUnitData, waterfallInstances);
            }
            if (i == 2) {
                return adUnitData.q() ? new C4699vf(adUnitData, waterfallInstances) : new D4(adUnitData, waterfallInstances);
            }
            throw new NoWhenBranchMatchedException();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<B> f7649a = new ArrayList();
        private final List<B> b = new ArrayList();
        private final List<B> c = new ArrayList();
        private boolean d;

        public final List<B> a() {
            return this.f7649a;
        }

        public final List<B> b() {
            return this.b;
        }

        public final List<B> c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.f7649a.isEmpty() && this.c.isEmpty();
        }

        public final int g() {
            return this.f7649a.size() + this.b.size() + this.c.size();
        }

        public final void a(boolean z) {
            this.d = z;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final B f7650a;
        private final List<B> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(B b, List<? extends B> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            this.f7650a = b;
            this.b = orderedInstances;
        }

        public final B a() {
            return this.f7650a;
        }

        public final List<B> b() {
            return this.b;
        }

        public final B c() {
            return this.f7650a;
        }

        public final List<B> d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f7650a, cVar.f7650a) && Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            B b = this.f7650a;
            return ((b == null ? 0 : b.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "ShowSelection(instanceToShow=" + this.f7650a + ", orderedInstances=" + this.b + ")";
        }

        public final c a(B b, List<? extends B> orderedInstances) {
            Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
            return new c(b, orderedInstances);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, B b, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                b = cVar.f7650a;
            }
            if ((i & 2) != 0) {
                list = cVar.b;
            }
            return cVar.a(b, list);
        }
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((B) t).h().l()), Integer.valueOf(((B) t2).h().l()));
        }
    }

    public H(AbstractC4720x0 adUnitData, Mg waterfallInstances) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f7647a = adUnitData;
        this.b = waterfallInstances;
    }

    private final List<B> b() {
        return CollectionsKt.sortedWith(this.b.b(), new d());
    }

    public abstract void a(B b2, b bVar);

    protected boolean a(B instance, Mg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return false;
    }

    public final c c() {
        Object obj;
        List<B> b2 = b();
        Iterator<T> it = b2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((B) obj).x()) {
                break;
            }
        }
        return new c((B) obj, b2);
    }

    public final b d() {
        IronLog.INTERNAL.verbose(this.f7647a.b().a().name() + " waterfall size: " + this.b.b().size());
        b bVar = new b();
        boolean m = Ib.v.d().h().m();
        Iterator<B> it = this.b.b().iterator();
        while (it.hasNext() && !a(it.next(), bVar, m)) {
        }
        return bVar;
    }

    public final boolean a(B instance) {
        Object obj;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Iterator<T> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((B) obj).w()) {
                break;
            }
        }
        return Intrinsics.areEqual(obj, instance);
    }

    public final boolean a() {
        int i;
        List<B> b2 = this.b.b();
        if ((b2 instanceof Collection) && b2.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = b2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((B) it.next()).x() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.f7647a.k();
    }

    public boolean a(b loadSelection) {
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return loadSelection.g() >= this.f7647a.k();
    }

    private final boolean a(B b2, b bVar, boolean z) {
        if (b2.w()) {
            IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is failed to load");
        } else if (b2.x() && !b2.A()) {
            IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is already loaded");
            bVar.b().add(b2);
        } else if (b2.y()) {
            IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " still loading");
            bVar.c().add(b2);
        } else if (a(b2, this.b) && !z) {
            IronLog.INTERNAL.verbose(b2.d().name() + " - Instance " + b2.q() + " is not better than already loaded instances");
        } else {
            a(b2, bVar);
        }
        return a(bVar);
    }
}
