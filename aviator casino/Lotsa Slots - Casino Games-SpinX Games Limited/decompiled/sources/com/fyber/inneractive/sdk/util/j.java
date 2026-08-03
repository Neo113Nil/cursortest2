package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f4295a = new java.util.concurrent.ConcurrentLinkedQueue();
    public final com.fyber.inneractive.sdk.util.i b;

    public j(int i, com.fyber.inneractive.sdk.util.i iVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f4295a.offer(iVar.a());
        }
        this.b = iVar;
    }
}
