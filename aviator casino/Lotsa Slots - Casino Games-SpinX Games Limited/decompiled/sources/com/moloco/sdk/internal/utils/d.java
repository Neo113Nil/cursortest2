package com.moloco.sdk.internal.utils;

/* loaded from: classes5.dex */
public final class d implements kotlin.coroutines.CoroutineContext.Key<com.moloco.sdk.internal.utils.c> {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.sync.Mutex f7335a;

    public d(kotlinx.coroutines.sync.Mutex mutex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.f7335a = mutex;
    }

    public final kotlinx.coroutines.sync.Mutex a() {
        return this.f7335a;
    }

    public final kotlinx.coroutines.sync.Mutex b() {
        return this.f7335a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.moloco.sdk.internal.utils.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.f7335a, ((com.moloco.sdk.internal.utils.d) obj).f7335a);
    }

    public int hashCode() {
        return this.f7335a.hashCode();
    }

    public java.lang.String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.f7335a + ')';
    }

    public final com.moloco.sdk.internal.utils.d a(kotlinx.coroutines.sync.Mutex mutex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "mutex");
        return new com.moloco.sdk.internal.utils.d(mutex);
    }

    public static /* synthetic */ com.moloco.sdk.internal.utils.d a(com.moloco.sdk.internal.utils.d dVar, kotlinx.coroutines.sync.Mutex mutex, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutex = dVar.f7335a;
        }
        return dVar.a(mutex);
    }
}
