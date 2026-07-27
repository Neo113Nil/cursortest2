package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0601ji implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f7631b;

    public RunnableC0601ji(C0653li c0653li, String str) {
        this.f7631b = c0653li;
        this.f7630a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7631b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportEvent(this.f7630a);
    }
}
