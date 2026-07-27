package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b6 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f3490a;

    public b6(Map factories) {
        kotlin.jvm.internal.j.e(factories, "factories");
        this.f3490a = factories;
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a() {
        Iterator it = this.f3490a.values().iterator();
        while (it.hasNext()) {
            ((j0) it.next()).a();
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void b(AdUnitConfig config, o2.l listener) {
        kotlin.jvm.internal.j.e(config, "config");
        kotlin.jvm.internal.j.e(listener, "listener");
        j0 j0Var = (j0) this.f3490a.get(config.getNetwork());
        if (j0Var != null) {
            j0Var.b(config, listener);
        } else {
            listener.invoke(null);
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a(AdUnitConfig config, o2.l listener) {
        kotlin.jvm.internal.j.e(config, "config");
        kotlin.jvm.internal.j.e(listener, "listener");
        j0 j0Var = (j0) this.f3490a.get(config.getNetwork());
        if (j0Var != null) {
            j0Var.a(config, listener);
        } else {
            listener.invoke(null);
        }
    }
}
