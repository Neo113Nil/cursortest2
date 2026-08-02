package p000;

/* JADX INFO: renamed from: t */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0711t extends Throwable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7246j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0711t(String str, int i) {
        super(str);
        this.f7246j = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.f7246j;
        synchronized (this) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    break;
                default:
                    break;
            }
            return this;
        }
    }
}
