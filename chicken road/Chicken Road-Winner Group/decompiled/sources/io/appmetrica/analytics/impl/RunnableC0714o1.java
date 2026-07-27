package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0714o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f7974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7975c;

    public RunnableC0714o1(C0817s1 c0817s1, String str, List list) {
        this.f7975c = c0817s1;
        this.f7973a = str;
        this.f7974b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f7975c).reportEvent(this.f7973a, CollectionUtils.getMapFromList(this.f7974b));
    }
}
