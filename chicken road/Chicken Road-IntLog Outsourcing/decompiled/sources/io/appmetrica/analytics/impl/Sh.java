package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class Sh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f7471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7472b;

    public Sh(C0802li c0802li, UserProfile userProfile) {
        this.f7472b = c0802li;
        this.f7471a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7472b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportUserProfile(this.f7471a);
    }
}
