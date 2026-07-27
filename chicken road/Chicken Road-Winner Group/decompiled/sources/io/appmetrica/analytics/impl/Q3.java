package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;

/* loaded from: classes.dex */
public final class Q3 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(Context context) {
        C0377b0 b3 = C0587j4.l().b();
        b3.f7020c.a().executeDelayed(new C0351a0(b3, context), b3.f7021d);
    }
}
