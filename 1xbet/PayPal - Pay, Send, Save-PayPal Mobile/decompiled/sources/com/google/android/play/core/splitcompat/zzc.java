package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
final class zzc implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "SplitCompatBackgroundThread");
    }

    zzc() {
    }
}
