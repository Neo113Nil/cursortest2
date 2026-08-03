package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class k extends java.lang.Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.ConditionVariable f4083a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l lVar, android.os.ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.b = lVar;
        this.f4083a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.f4083a.open();
            try {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l.a(this.b);
            } catch (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a e) {
                this.b.f = e;
            }
            this.b.b.getClass();
        }
    }
}
