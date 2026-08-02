package androidx.media3.exoplayer;

import F3.InterfaceC3018x;
import j3.AbstractC7252H;

/* loaded from: classes.dex */
public interface L {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final u3.P f43652a;

        /* renamed from: b, reason: collision with root package name */
        public final long f43653b;

        /* renamed from: c, reason: collision with root package name */
        public final float f43654c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f43655d;

        /* renamed from: e, reason: collision with root package name */
        public final long f43656e;

        public a(u3.P p11, AbstractC7252H abstractC7252H, InterfaceC3018x.b bVar, long j11, long j12, float f7, boolean z11, long j13) {
            this.f43652a = p11;
            this.f43653b = j12;
            this.f43654c = f7;
            this.f43655d = z11;
            this.f43656e = j13;
        }
    }

    default boolean a() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default void b(u3.P p11) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default boolean c(a aVar) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean d() {
        m3.s.f("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void e(u3.P p11) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void f(u3.P p11) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default boolean g(a aVar) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default void h(a aVar, I3.y[] yVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default long i() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    J3.e j();
}
