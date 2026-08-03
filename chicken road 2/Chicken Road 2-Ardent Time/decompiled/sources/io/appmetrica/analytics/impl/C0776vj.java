package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776vj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.profile.UserProfile f6981a;

    public C0776vj(io.appmetrica.analytics.profile.UserProfile userProfile) {
        this.f6981a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportUserProfile(this.f6981a);
    }
}
