package t4;

import java.util.concurrent.CancellationException;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: k, reason: collision with root package name */
    public final transient InterfaceC2369f f19590k;

    public a(InterfaceC2369f interfaceC2369f) {
        super("Flow was aborted, no more elements needed");
        this.f19590k = interfaceC2369f;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
