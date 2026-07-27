package a5;

import b2.AbstractC0279e;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class A extends j5.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B f3889n;

    public A(B b6) {
        this.f3889n = b6;
    }

    @Override // j5.d
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // j5.d
    public final void k() {
        this.f3889n.e(EnumC0200b.f3922h);
        t tVar = this.f3889n.f3891b;
        synchronized (tVar) {
            long j2 = tVar.f4002o;
            long j6 = tVar.f4001n;
            if (j2 < j6) {
                return;
            }
            tVar.f4001n = j6 + 1;
            tVar.f4003p = System.nanoTime() + 1000000000;
            W4.c.c(tVar.f3995h, AbstractC0279e.h(new StringBuilder(), tVar.f3990c, " ping"), new T4.m(2, tVar));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
