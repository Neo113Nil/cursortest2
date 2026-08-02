package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public interface fi1 {
    /* JADX INFO: renamed from: f */
    default di1 mo1870f(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* JADX INFO: renamed from: p */
    default di1 mo1871p(Class cls, yq0 yq0Var) {
        return mo1870f(cls);
    }
}
