package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class ExecutorSelector {
    private final com.google.firebase.inject.Provider zza;

    public java.util.concurrent.Executor getExecutorToUse(java.util.concurrent.Executor executor) {
        return executor != null ? executor : (java.util.concurrent.Executor) this.zza.get();
    }

    public ExecutorSelector(com.google.firebase.inject.Provider provider) {
        this.zza = provider;
    }
}
