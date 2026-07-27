package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class Sh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f6602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653li f6603b;

    public Sh(C0653li c0653li, UserProfile userProfile) {
        this.f6603b = c0653li;
        this.f6602a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0653li c0653li = this.f6603b;
        C0653li.a(c0653li.f7815a, c0653li.f7818d, c0653li.f7819e).reportUserProfile(this.f6602a);
    }
}
