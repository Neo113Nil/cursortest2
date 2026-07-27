package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Lh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0653li f6239c;

    public Lh(C0653li c0653li, String str, List list) {
        this.f6239c = c0653li;
        this.f6237a = str;
        this.f6238b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6239c;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportEvent(this.f6237a, CollectionUtils.getMapFromList(this.f6238b));
    }
}
