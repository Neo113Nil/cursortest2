package b1;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501b extends Throwable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7186k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0501b(String str, int i) {
        super(str);
        this.f7186k = i;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    private final synchronized Throwable d() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f7186k) {
            case 0:
                a();
                break;
            case 1:
                b();
                break;
            case 2:
                c();
                break;
            default:
                d();
                break;
        }
        return this;
    }
}
