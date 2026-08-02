package com.google.android.gms.common.api.internal;

/* loaded from: classes4.dex */
public final class H implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ K b;

    public H(K k, int i) {
        this.b = k;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f(this.a);
    }
}
