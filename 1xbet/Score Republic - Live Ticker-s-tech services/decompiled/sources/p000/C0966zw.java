package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: zw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0966zw {

    /* JADX INFO: renamed from: a */
    public final h81 f9972a;

    /* JADX INFO: renamed from: b */
    public final Executor f9973b;

    public C0966zw(h81 h81Var, Executor executor) {
        this.f9972a = h81Var;
        this.f9973b = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0966zw) && this.f9972a == ((C0966zw) obj).f9972a;
    }

    public final int hashCode() {
        return this.f9972a.hashCode();
    }
}
