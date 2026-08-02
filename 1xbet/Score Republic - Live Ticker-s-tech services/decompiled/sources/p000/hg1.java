package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hg1 extends UnsupportedOperationException {

    /* JADX INFO: renamed from: j */
    public final C0451lz f3207j;

    public hg1(C0451lz c0451lz) {
        this.f3207j = c0451lz;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f3207j));
    }
}
