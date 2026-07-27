package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class Aj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f5706a;

    public Aj(UserProfile userProfile) {
        this.f5706a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportUserProfile(this.f5706a);
    }
}
