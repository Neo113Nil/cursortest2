package com.vungle.ads.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class s1 {
    public static ServiceLocator a() {
        ServiceLocator serviceLocator;
        serviceLocator = ServiceLocator.INSTANCE;
        return serviceLocator;
    }

    public final ServiceLocator a(Context context) {
        ServiceLocator serviceLocator;
        Intrinsics.checkNotNullParameter(context, "context");
        serviceLocator = ServiceLocator.INSTANCE;
        if (serviceLocator == null) {
            synchronized (this) {
                serviceLocator = ServiceLocator.INSTANCE;
                if (serviceLocator == null) {
                    serviceLocator = new ServiceLocator(context, 0);
                    ServiceLocator.INSTANCE = serviceLocator;
                }
            }
        }
        return serviceLocator;
    }
}
