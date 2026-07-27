package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Rh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6515b;

    public Rh(C0653li c0653li, String str) {
        this.f6515b = c0653li;
        this.f6514a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6515b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).setUserProfileID(this.f6514a);
    }
}
