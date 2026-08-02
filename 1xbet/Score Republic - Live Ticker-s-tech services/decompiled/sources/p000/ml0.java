package p000;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ml0 extends vk0 {

    /* JADX INFO: renamed from: b */
    public static final ReferenceQueue f5077b = new ReferenceQueue();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f5078c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final Logger f5079d = Logger.getLogger(ml0.class.getName());

    /* JADX INFO: renamed from: a */
    public final jl0 f5080a;

    public ml0(jl0 jl0Var) {
        this.f5080a = jl0Var;
        new ll0(this, jl0Var, f5077b, f5078c);
    }

    @Override // p000.AbstractC0727tf
    /* JADX INFO: renamed from: e */
    public final String mo1438e() {
        return this.f5080a.f4019t.mo1438e();
    }

    @Override // p000.AbstractC0727tf
    /* JADX INFO: renamed from: f */
    public final xe1 mo1439f(wp0 wp0Var, C0095ce c0095ce) {
        return this.f5080a.f4019t.mo1439f(wp0Var, c0095ce);
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f5080a, "delegate");
        return c0809vnM5362k.toString();
    }
}
