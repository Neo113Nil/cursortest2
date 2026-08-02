package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u82 implements f82 {

    /* JADX INFO: renamed from: j */
    public boolean f7706j;

    static {
        new AtomicInteger();
    }

    @Override // p000.f82
    /* JADX INFO: renamed from: c */
    public final Object mo79c(e82 e82Var) throws IOException {
        if (this.f7706j) {
            if (e82Var.f2014b.isEmpty()) {
                return e82Var.f2013a.mo2571g(e82Var.f2016d);
            }
            throw new C0287hi("Short circuit would skip transforms.");
        }
        Closeable closeableM3875t = p80.m3875t(e82Var);
        try {
            if (!(closeableM3875t instanceof n82)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileMo3504a = ((n82) closeableM3875t).mo3504a();
            if (closeableM3875t != null) {
                closeableM3875t.close();
            }
            return fileMo3504a;
        } catch (Throwable th) {
            if (closeableM3875t != null) {
                try {
                    closeableM3875t.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
