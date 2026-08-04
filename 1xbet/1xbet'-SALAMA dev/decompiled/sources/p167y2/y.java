package p167y2;

import F2.I0;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18195a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I0 f18196b;

    public final void a(I0 i7) {
        synchronized (this.f18195a) {
            this.f18196b = i7;
        }
    }
}
