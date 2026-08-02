package androidx.media3.exoplayer;

import F3.InterfaceC3018x;
import androidx.media3.exoplayer.h0;
import j3.AbstractC7252H;
import j3.C7272n;
import java.io.IOException;
import m3.C8053F;
import t3.C9734F;
import t3.InterfaceC9731C;

/* loaded from: classes.dex */
public interface j0 extends h0.b {

    public interface a {
        void a();

        void b();
    }

    default void A(float f7, float f11) throws C5449k {
    }

    boolean a();

    void c(long j11, long j12) throws C5449k;

    void disable();

    boolean f();

    String getName();

    int getState();

    void h(C7272n[] c7272nArr, F3.U u11, long j11, long j12, InterfaceC3018x.b bVar) throws C5449k;

    boolean isReady();

    boolean k();

    void l(C9734F c9734f, C7272n[] c7272nArr, F3.U u11, boolean z11, boolean z12, long j11, long j12, InterfaceC3018x.b bVar) throws C5449k;

    void m(AbstractC7252H abstractC7252H);

    F3.U n();

    long o();

    void p(long j11) throws C5449k;

    InterfaceC9731C q();

    default void release() {
    }

    void reset();

    default void s() {
    }

    void start() throws C5449k;

    void stop();

    void t();

    void u() throws IOException;

    int v();

    default long w(long j11, long j12) {
        if (getState() == 1) {
            return (isReady() || a()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    void x(int i11, u3.P p11, C8053F c8053f);

    AbstractC5444f y();
}
