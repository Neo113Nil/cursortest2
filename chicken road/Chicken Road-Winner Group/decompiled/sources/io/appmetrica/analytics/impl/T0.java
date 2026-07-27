package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f6633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6634b;

    public T0(C0817s1 c0817s1, UserProfile userProfile) {
        this.f6634b = c0817s1;
        this.f6633a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1.a(this.f6634b).reportUserProfile(this.f6633a);
    }
}
