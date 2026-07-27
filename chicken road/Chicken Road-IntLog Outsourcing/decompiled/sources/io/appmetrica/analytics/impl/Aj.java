package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class Aj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f6537a;

    public Aj(UserProfile userProfile) {
        this.f6537a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportUserProfile(this.f6537a);
    }
}
