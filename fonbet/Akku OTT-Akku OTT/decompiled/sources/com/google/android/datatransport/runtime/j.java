package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class j implements com.google.android.datatransport.runtime.dagger.internal.b<Executor> {

    public static final class a {
        public static final j a = new j();
    }

    @Override // javax.inject.a
    public final Object get() {
        return new l(Executors.newSingleThreadExecutor());
    }
}
