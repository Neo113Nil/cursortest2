package I6;

import i6.InterfaceC1292i;

/* loaded from: classes2.dex */
public final class g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC1292i f3728a;

    public g(InterfaceC1292i interfaceC1292i) {
        this.f3728a = interfaceC1292i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3728a.toString();
    }
}
