package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0621ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f8154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f8155b;

    public RunnableC0621ei(C0802li c0802li, List list) {
        this.f8155b = c0802li;
        this.f8154a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f8155b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportAnr(CollectionUtils.getMapFromList(this.f8154a));
    }
}
