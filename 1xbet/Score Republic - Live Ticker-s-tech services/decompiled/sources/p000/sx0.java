package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sx0 extends tx0 implements tg0, v60 {
    @Override // p000.AbstractC0171ee
    /* JADX INFO: renamed from: c */
    public final rg0 mo1404c() {
        l01.f4622a.getClass();
        return this;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        m4599h();
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m4599h() {
        if (this.f7622p) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        rg0 rg0VarM4865f = m4865f();
        if (rg0VarM4865f == this) {
            throw new C0624qn("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((sx0) ((tg0) rg0VarM4865f)).m4599h();
    }
}
