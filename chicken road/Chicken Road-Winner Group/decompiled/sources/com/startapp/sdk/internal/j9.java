package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f3909a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3910b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3911c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3912d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3913e;
    public final long f;

    public j9(i9 i9Var) {
        ArrayList arrayList = i9Var.f3860a;
        WeakHashMap weakHashMap = si.f4343a;
        this.f3909a = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        ArrayList arrayList2 = i9Var.f3861b;
        this.f3910b = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.EMPTY_LIST;
        List list = Collections.EMPTY_LIST;
        this.f3911c = list;
        this.f3912d = list;
        ArrayList arrayList3 = i9Var.f3862c;
        this.f3913e = arrayList3 != null ? Collections.unmodifiableList(arrayList3) : list;
        this.f = Math.max(0L, si.f(i9Var.f3863d));
    }

    public j9(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        List e3 = analyticsCategoryFilterConfig.e();
        WeakHashMap weakHashMap = si.f4343a;
        this.f3909a = e3 != null ? Collections.unmodifiableList(e3) : Collections.EMPTY_LIST;
        List b3 = analyticsCategoryFilterConfig.b();
        this.f3910b = b3 != null ? Collections.unmodifiableList(b3) : Collections.EMPTY_LIST;
        List d3 = analyticsCategoryFilterConfig.d();
        this.f3911c = d3 != null ? Collections.unmodifiableList(d3) : Collections.EMPTY_LIST;
        List a3 = analyticsCategoryFilterConfig.a();
        this.f3912d = a3 != null ? Collections.unmodifiableList(a3) : Collections.EMPTY_LIST;
        List c3 = analyticsCategoryFilterConfig.c();
        this.f3913e = c3 != null ? Collections.unmodifiableList(c3) : Collections.EMPTY_LIST;
        this.f = Math.max(0L, si.f(analyticsCategoryFilterConfig.f()));
    }
}
