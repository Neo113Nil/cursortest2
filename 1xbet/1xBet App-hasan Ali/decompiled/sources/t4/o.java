package t4;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class o extends CancellationException {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f19625k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i) {
        super(str);
        this.f19625k = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f19625k) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }
}
