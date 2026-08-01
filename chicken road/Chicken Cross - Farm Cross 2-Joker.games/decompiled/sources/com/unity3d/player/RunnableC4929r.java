package com.unity3d.player;

/* renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4929r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f11805a;
    public final long b;

    public RunnableC4929r(long j, long j2) {
        this.f11805a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (ReflectionHelper.beginProxyCall(this.f11805a)) {
            try {
                ReflectionHelper.nativeProxyFinalize(this.b);
            } finally {
                ReflectionHelper.endProxyCall();
            }
        }
    }
}
