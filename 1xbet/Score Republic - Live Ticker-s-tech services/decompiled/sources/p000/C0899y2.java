package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: y2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0899y2 extends WeakReference {

    /* JADX INFO: renamed from: a */
    public final xg0 f9132a;

    /* JADX INFO: renamed from: b */
    public final boolean f9133b;

    /* JADX INFO: renamed from: c */
    public v11 f9134c;

    public C0899y2(xg0 xg0Var, C0153dx c0153dx, ReferenceQueue referenceQueue) {
        super(c0153dx, referenceQueue);
        o80.m3647h(xg0Var, "Argument must not be null");
        this.f9132a = xg0Var;
        boolean z = c0153dx.f1861j;
        this.f9134c = null;
        this.f9133b = z;
    }
}
