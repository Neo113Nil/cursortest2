package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes7.dex */
public final class b2 extends t1 {
    public final /* synthetic */ ServiceLocator b;

    public b2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.t1
    public final Object a() {
        Object a2;
        ServiceLocator serviceLocator = this.b;
        Context context = serviceLocator.f11884a;
        a2 = serviceLocator.a(PathProvider.class);
        return new com.vungle.ads.internal.task.o(context, (PathProvider) a2);
    }
}
