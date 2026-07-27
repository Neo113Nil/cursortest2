package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0610k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f7679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7680b;

    public RunnableC0610k1(C0817s1 c0817s1, List list) {
        this.f7680b = c0817s1;
        this.f7679a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f7680b).reportAnr(CollectionUtils.getMapFromList(this.f7679a));
    }
}
