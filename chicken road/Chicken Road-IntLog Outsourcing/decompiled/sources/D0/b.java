package D0;

/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f407a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i2) {
        super(str);
        this.f407a = i2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f407a) {
            case 0:
                synchronized (this) {
                    break;
                }
            case 1:
                synchronized (this) {
                    break;
                }
            case 2:
                synchronized (this) {
                    break;
                }
            case 3:
                synchronized (this) {
                    break;
                }
            default:
                synchronized (this) {
                    break;
                }
        }
        return this;
    }
}
