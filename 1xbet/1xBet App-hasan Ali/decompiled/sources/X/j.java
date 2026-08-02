package X;

import java.util.concurrent.CancellationException;
import w0.AbstractC2541b;

/* loaded from: classes.dex */
public abstract class j extends CancellationException {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6060k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, int i) {
        super(str);
        this.f6060k = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f6060k) {
            case 0:
                setStackTrace(e.f6055b);
                break;
            default:
                setStackTrace(AbstractC2541b.f20489a);
                break;
        }
        return this;
    }
}
