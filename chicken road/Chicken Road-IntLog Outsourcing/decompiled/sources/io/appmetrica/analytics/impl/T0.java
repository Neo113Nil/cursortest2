package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f7504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7505b;

    public T0(C0966s1 c0966s1, UserProfile userProfile) {
        this.f7505b = c0966s1;
        this.f7504a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f7505b).reportUserProfile(this.f7504a);
    }
}
