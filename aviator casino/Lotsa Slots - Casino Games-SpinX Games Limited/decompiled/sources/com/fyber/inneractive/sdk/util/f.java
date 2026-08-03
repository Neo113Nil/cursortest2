package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class f {
    public static final com.fyber.inneractive.sdk.util.f b = new com.fyber.inneractive.sdk.util.f();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f4291a = new java.util.concurrent.ConcurrentLinkedQueue();

    public f() {
        for (int i = 0; i < 2; i++) {
            this.f4291a.offer(java.nio.ByteBuffer.allocateDirect(16384));
        }
    }
}
