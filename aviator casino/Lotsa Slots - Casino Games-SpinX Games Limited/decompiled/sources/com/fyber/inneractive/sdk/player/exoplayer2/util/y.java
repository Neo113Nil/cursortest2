package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes3.dex */
public final class y implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4119a;

    public y(java.lang.String str) {
        this.f4119a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, this.f4119a);
    }
}
