package com.inmobi.media;

/* loaded from: classes5.dex */
public final class F5 implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.L5 f4697a;

    public F5(com.inmobi.media.L5 l5) {
        this.f4697a = l5;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        synchronized (this.f4697a) {
            com.inmobi.media.L5 l5 = this.f4697a;
            if (l5.l == null) {
                return null;
            }
            while (l5.k > l5.j) {
                l5.d((java.lang.String) ((java.util.Map.Entry) l5.i.entrySet().iterator().next()).getKey());
            }
            com.inmobi.media.L5 l52 = this.f4697a;
            int i = l52.m;
            if (i >= 2000 && i >= l52.i.size()) {
                this.f4697a.c();
                this.f4697a.m = 0;
            }
            return null;
        }
    }
}
