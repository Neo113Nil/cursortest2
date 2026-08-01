package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC3617c6 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3786i6 f7041a;

    public CallableC3617c6(C3786i6 c3786i6) {
        this.f7041a = c3786i6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f7041a) {
            C3786i6 c3786i6 = this.f7041a;
            if (c3786i6.l == null) {
                return null;
            }
            while (c3786i6.k > c3786i6.j) {
                c3786i6.d((String) ((Map.Entry) c3786i6.i.entrySet().iterator().next()).getKey());
            }
            C3786i6 c3786i62 = this.f7041a;
            int i = c3786i62.m;
            if (i >= 2000 && i >= c3786i62.i.size()) {
                this.f7041a.c();
                this.f7041a.m = 0;
            }
            return null;
        }
    }
}
