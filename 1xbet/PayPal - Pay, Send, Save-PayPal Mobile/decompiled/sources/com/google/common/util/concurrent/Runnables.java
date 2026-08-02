package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public final class Runnables {
    private static final java.lang.Runnable EMPTY_RUNNABLE = new java.lang.Runnable() { // from class: com.google.common.util.concurrent.Runnables$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            com.google.common.util.concurrent.Runnables.lambda$static$0();
        }
    };

    static /* synthetic */ void lambda$static$0() {
    }

    public static java.lang.Runnable doNothing() {
        return EMPTY_RUNNABLE;
    }

    private Runnables() {
    }
}
