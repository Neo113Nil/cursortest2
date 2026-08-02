package L3;

import android.view.Surface;
import j3.C7272n;
import j3.Q;
import java.util.List;
import java.util.concurrent.Executor;
import m3.C8052E;

/* loaded from: classes8.dex */
public interface L {

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16273a = new C0311a();

        /* renamed from: L3.L$a$a, reason: collision with other inner class name */
        final class C0311a implements a {
        }

        default void a() {
        }

        default void d() {
        }

        default void e() {
        }

        default void onVideoSizeChanged(Q q11) {
        }
    }

    public interface b {
        void a();

        void b(long j11);
    }

    /* loaded from: classes.dex */
    public static final class c extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final C7272n f16274a;

        public c(Exception exc, C7272n c7272n) {
            super(exc);
            this.f16274a = c7272n;
        }
    }

    boolean a();

    Surface b();

    void c(long j11, long j12) throws c;

    void f();

    boolean g(long j11, b bVar);

    void h(u uVar);

    void i(a aVar, Executor executor);

    boolean isInitialized();

    void j();

    void k();

    void l();

    void m(Surface surface, C8052E c8052e);

    void n(int i11);

    boolean o(C7272n c7272n) throws c;

    void p(long j11);

    void q(List<Object> list);

    boolean r(boolean z11);

    void redraw();

    void release();

    void s(C7272n c7272n, long j11, int i11, List list);

    void t(float f7);

    void u();

    void v(boolean z11);

    void w(boolean z11);
}
