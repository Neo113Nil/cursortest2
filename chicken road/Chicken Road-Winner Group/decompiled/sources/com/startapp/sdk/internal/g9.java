package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    public final double f3755a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3756b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3757c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3758d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3759e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3760g;

    public g9(f9 f9Var) {
        this.f3755a = f9Var.f3680a;
        this.f3756b = f9Var.f3681b;
        this.f3757c = f9Var.f3682c;
        this.f3758d = f9Var.f3683d;
        this.f3759e = Math.max(60000L, si.f(f9Var.f3684e));
        this.f = Math.max(0L, si.f(f9Var.f));
        ArrayList arrayList = f9Var.f3685g;
        this.f3760g = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public g9(g9 g9Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        long max;
        long max2;
        Double valueOf = Double.valueOf(g9Var.f3755a);
        Double a3 = analyticsCategoryConfig.a();
        this.f3755a = (a3 != null ? a3 : valueOf).doubleValue();
        Integer valueOf2 = Integer.valueOf(g9Var.f3756b);
        Integer d3 = analyticsCategoryConfig.d();
        this.f3756b = (d3 != null ? d3 : valueOf2).intValue();
        Integer valueOf3 = Integer.valueOf(g9Var.f3757c);
        Integer e3 = analyticsCategoryConfig.e();
        this.f3757c = (e3 != null ? e3 : valueOf3).intValue();
        Boolean valueOf4 = Boolean.valueOf(g9Var.f3758d);
        Boolean f = analyticsCategoryConfig.f();
        this.f3758d = (f != null ? f : valueOf4).booleanValue();
        if (analyticsCategoryConfig.g() == null) {
            max = g9Var.f3759e;
        } else {
            max = Math.max(60000L, si.f(analyticsCategoryConfig.g()));
        }
        this.f3759e = max;
        if (analyticsCategoryConfig.c() == null) {
            max2 = g9Var.f;
        } else {
            max2 = Math.max(0L, si.f(analyticsCategoryConfig.c()));
        }
        this.f = max2;
        List list = g9Var.f3760g;
        List<AnalyticsCategoryFilterConfig> b3 = analyticsCategoryConfig.b();
        List list2 = null;
        if (b3 != null) {
            for (AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig : b3) {
                if (analyticsCategoryFilterConfig != null) {
                    list2 = list2 == null ? new ArrayList(b3.size()) : list2;
                    list2.add(new j9(analyticsCategoryFilterConfig));
                }
            }
            if (list2 != null) {
                WeakHashMap weakHashMap = si.f4343a;
                list2 = Collections.unmodifiableList(list2);
            }
        }
        this.f3760g = list2 != null ? list2 : list;
    }
}
