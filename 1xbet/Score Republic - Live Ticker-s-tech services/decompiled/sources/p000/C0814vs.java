package p000;

/* JADX INFO: renamed from: vs */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0814vs extends RuntimeException {

    /* JADX INFO: renamed from: j */
    public final transient InterfaceC0180en f8257j;

    public C0814vs(InterfaceC0180en interfaceC0180en) {
        this.f8257j = interfaceC0180en;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f8257j.toString();
    }
}
