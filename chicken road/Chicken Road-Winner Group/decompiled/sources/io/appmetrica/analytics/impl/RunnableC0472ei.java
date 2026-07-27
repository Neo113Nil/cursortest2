package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0472ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f7259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f7260b;

    public RunnableC0472ei(C0653li c0653li, List list) {
        this.f7260b = c0653li;
        this.f7259a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7260b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportAnr(CollectionUtils.getMapFromList(this.f7259a));
    }
}
