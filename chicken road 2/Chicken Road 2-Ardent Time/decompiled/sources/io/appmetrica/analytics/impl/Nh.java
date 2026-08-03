package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Nh implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.profile.UserProfile f4735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0387gi f4736b;

    public Nh(io.appmetrica.analytics.impl.C0387gi c0387gi, io.appmetrica.analytics.profile.UserProfile userProfile) {
        this.f4736b = c0387gi;
        this.f4735a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0387gi c0387gi = this.f4736b;
        io.appmetrica.analytics.impl.C0387gi.a(c0387gi.f5991a, c0387gi.f5994d, c0387gi.f5995e).reportUserProfile(this.f4735a);
    }
}
