package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.xb;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class yb {

    /* renamed from: a, reason: collision with root package name */
    public static final yb f5089a = new yb();
    public static final Set b = SetsKt.setOf((Object[]) new String[]{"application/javascript", "application/x-javascript"});
    public static final Map c;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues((Double) ((Pair) obj2).getSecond(), (Double) ((Pair) obj).getSecond());
        }
    }

    static {
        Pair pair = TuplesKt.to("video/mp4", Double.valueOf(1.5d));
        Pair pair2 = TuplesKt.to("video/3gpp2", Double.valueOf(1.25d));
        Double valueOf = Double.valueOf(1.0d);
        c = MapsKt.mapOf(pair, pair2, TuplesKt.to("video/3gpp", valueOf), TuplesKt.to("video/webm", valueOf), TuplesKt.to("video/x-matroska", valueOf), TuplesKt.to("video/x-m4v", valueOf), TuplesKt.to("video/quicktime", Double.valueOf(0.75d)));
    }

    public final double a(double d, double d2, double d3, double d4) {
        return d * (1.0d / ((d2 + 1.0d) + d3)) * d4;
    }

    public final xb a(List mediaFiles, wf renderingContainer) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(renderingContainer, "renderingContainer");
        if (mediaFiles.isEmpty()) {
            return xb.a.c.f5078a;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        Iterator it = mediaFiles.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            ub ubVar = (ub) it.next();
            if (b.contains(ubVar.c())) {
                z2 = true;
            } else {
                yb ybVar = f5089a;
                double a2 = ybVar.a(ubVar.c());
                if (a2 <= 0.0d) {
                    z = true;
                } else {
                    createListBuilder.add(TuplesKt.to(ubVar, Double.valueOf(ybVar.a(a2, ybVar.a(renderingContainer, ubVar), ybVar.a(ubVar.a()), ybVar.a(ubVar.e())))));
                }
            }
        }
        List build = CollectionsKt.build(createListBuilder);
        if (build.isEmpty()) {
            if (z) {
                return xb.a.C0224a.f5076a;
            }
            if (z2) {
                return xb.a.b.f5077a;
            }
            throw new IllegalStateException("MediaFileSelector: classification flags out of sync");
        }
        List sortedWith = CollectionsKt.sortedWith(build, new a());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        Iterator it2 = sortedWith.iterator();
        while (it2.hasNext()) {
            arrayList.add((ub) ((Pair) it2.next()).getFirst());
        }
        return new xb.b(arrayList);
    }

    public final double a(String str) {
        return ((Number) c.getOrDefault(str, Double.valueOf(0.0d))).doubleValue();
    }

    public final double a(wf wfVar, ub ubVar) {
        double d = wfVar.d();
        double b2 = wfVar.b();
        Integer f = ubVar.f();
        if (f != null) {
            double intValue = f.intValue();
            Integer b3 = ubVar.b();
            if (b3 != null) {
                double intValue2 = b3.intValue();
                float a2 = wfVar.a();
                if (d > 0.0d && b2 > 0.0d && intValue > 0.0d && intValue2 > 0.0d) {
                    double d2 = a2 * d;
                    return Math.abs((d / b2) - (intValue / intValue2)) + (d2 != 0.0d ? Math.abs(d2 - intValue) / d2 : Double.MAX_VALUE);
                }
            }
        }
        return Double.MAX_VALUE;
    }

    public final double a(Integer num) {
        if (num == null) {
            return 0.5d;
        }
        if (num.intValue() < 0) {
            num = null;
        }
        if (num == null) {
            return 0.5d;
        }
        int intValue = num.intValue();
        if (700 > intValue || intValue >= 1501) {
            return Math.min(Math.abs(700 - intValue) / 700, Math.abs(1500 - intValue) / 1500);
        }
        return 0.0d;
    }

    public final double a(Double d) {
        if (d == null) {
            return 1.0d;
        }
        double doubleValue = d.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue) || d.doubleValue() <= 0.0d) {
            return 1.0d;
        }
        return RangesKt.coerceAtMost(d.doubleValue(), 100.0d);
    }
}
