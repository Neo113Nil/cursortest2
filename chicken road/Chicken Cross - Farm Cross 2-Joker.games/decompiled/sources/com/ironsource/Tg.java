package com.ironsource;

import com.ironsource.AbstractC4419g3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Tg<Smash extends AbstractC4419g3<?>> {

    /* renamed from: a, reason: collision with root package name */
    private final W f7918a;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((AbstractC4419g3) t).i().l()), Integer.valueOf(((AbstractC4419g3) t2).i().l()));
        }
    }

    public Tg(W managerData) {
        Intrinsics.checkNotNullParameter(managerData, "managerData");
        this.f7918a = managerData;
    }

    public final boolean a(AbstractC4419g3<?> smash, List<? extends Smash> waterfall) {
        Object obj;
        Intrinsics.checkNotNullParameter(smash, "smash");
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((AbstractC4419g3) obj).x()) {
                break;
            }
        }
        return Intrinsics.areEqual(obj, smash);
    }

    public final List<Smash> b(List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        return CollectionsKt.sortedWith(waterfall, new a());
    }

    public final Smash c(List<? extends Smash> waterfall) {
        Object obj;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC4419g3) obj).B()) {
                break;
            }
        }
        return (Smash) obj;
    }

    public final Ug<Smash> d(List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.f7918a.b().name() + " waterfall size: " + waterfall.size());
        Zg a2 = Zg.g.a(this.f7918a.c() ? Qg.BIDDER_SENSITIVE : Qg.DEFAULT, this.f7918a.i(), this.f7918a.m(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            a2.d(it.next());
            if (a2.e()) {
                return new Ug<>(a2);
            }
        }
        return new Ug<>(a2);
    }

    public final boolean a(List<? extends Smash> waterfall) {
        int i;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AbstractC4419g3) it.next()).y() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.f7918a.i();
    }
}
