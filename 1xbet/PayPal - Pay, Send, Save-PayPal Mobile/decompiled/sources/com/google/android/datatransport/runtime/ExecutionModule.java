package com.google.android.datatransport.runtime;

@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: classes3.dex */
abstract class ExecutionModule {
    ExecutionModule() {
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @javax.inject.Singleton
    static java.util.concurrent.Executor executor() {
        return new com.google.android.datatransport.runtime.SafeLoggingExecutor(java.util.concurrent.Executors.newSingleThreadExecutor());
    }
}
