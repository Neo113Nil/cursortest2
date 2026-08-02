package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Provider {
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ScheduledExecutorService lambda$static$1;
        lambda$static$1 = ExecutorsRegistrar.lambda$static$1();
        return lambda$static$1;
    }
}
