package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes.dex */
public final class Rl implements H6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f6532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sl f6533b;

    public Rl(Sl sl, StartupParamsCallback startupParamsCallback) {
        this.f6533b = sl;
        this.f6532a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.H6
    public final void a(int i3, Bundle bundle) {
        this.f6533b.b(bundle, this.f6532a);
    }
}
