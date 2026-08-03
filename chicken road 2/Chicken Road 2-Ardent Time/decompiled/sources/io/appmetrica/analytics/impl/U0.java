package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.profile.UserProfile f5053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f5054b;

    public U0(io.appmetrica.analytics.impl.C0706t1 c0706t1, io.appmetrica.analytics.profile.UserProfile userProfile) {
        this.f5054b = c0706t1;
        this.f5053a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0706t1.a(this.f5054b).reportUserProfile(this.f5053a);
    }
}
