package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Provider {
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ScheduledExecutorService lambda$static$0;
        lambda$static$0 = ExecutorsRegistrar.lambda$static$0();
        return lambda$static$0;
    }
}
