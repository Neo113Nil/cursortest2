package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0550hi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0653li f7423c;

    public RunnableC0550hi(C0653li c0653li, String str, String str2) {
        this.f7423c = c0653li;
        this.f7421a = str;
        this.f7422b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f7423c;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).putAppEnvironmentValue(this.f7421a, this.f7422b);
    }
}
