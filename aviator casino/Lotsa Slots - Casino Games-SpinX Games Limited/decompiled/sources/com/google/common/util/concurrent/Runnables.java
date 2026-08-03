package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Runnables {
    private static final java.lang.Runnable EMPTY_RUNNABLE = new java.lang.Runnable() { // from class: com.google.common.util.concurrent.Runnables.1
        @Override // java.lang.Runnable
        public void run() {
        }
    };

    public static java.lang.Runnable doNothing() {
        return EMPTY_RUNNABLE;
    }

    private Runnables() {
    }
}
