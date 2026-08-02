package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: c */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0080c extends CancellationException {

    /* JADX INFO: renamed from: j */
    public final transient Object f1054j;

    public C0080c(u10 u10Var) {
        super("Flow was aborted, no more elements needed");
        this.f1054j = u10Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
