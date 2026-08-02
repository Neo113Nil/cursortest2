package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: rg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0654rg {

    /* JADX INFO: renamed from: a */
    public final int f6837a;

    /* JADX INFO: renamed from: b */
    public final Method f6838b;

    public C0654rg(int i, Method method) {
        this.f6837a = i;
        this.f6838b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0654rg)) {
            return false;
        }
        C0654rg c0654rg = (C0654rg) obj;
        return this.f6837a == c0654rg.f6837a && this.f6838b.getName().equals(c0654rg.f6838b.getName());
    }

    public final int hashCode() {
        return this.f6838b.getName().hashCode() + (this.f6837a * 31);
    }
}
