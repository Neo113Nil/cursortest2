package p103o1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i7) {
        super(str);
        this.f15553a = i7;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i7 = this.f15553a;
        synchronized (this) {
            switch (i7) {
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
