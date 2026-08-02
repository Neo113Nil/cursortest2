package F3;

import android.os.Handler;
import j3.AbstractC7252H;
import j3.C7275q;
import java.io.IOException;

/* renamed from: F3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3018x {

    /* renamed from: F3.x$a */
    public interface a {
        default void a(k4.e eVar) {
        }

        default void b() {
        }

        @Deprecated
        default void c(boolean z11) {
        }

        InterfaceC3018x createMediaSource(C7275q c7275q);

        a setDrmSessionManagerProvider(w3.k kVar);
    }

    /* renamed from: F3.x$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f8751a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8752b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8753c;

        /* renamed from: d, reason: collision with root package name */
        public final long f8754d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8755e;

        public b(Object obj) {
            this(-1L, obj);
        }

        public final b a(Object obj) {
            if (this.f8751a.equals(obj)) {
                return this;
            }
            return new b(obj, this.f8752b, this.f8753c, this.f8754d, this.f8755e);
        }

        public final boolean b() {
            return this.f8752b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8751a.equals(bVar.f8751a) && this.f8752b == bVar.f8752b && this.f8753c == bVar.f8753c && this.f8754d == bVar.f8754d && this.f8755e == bVar.f8755e;
        }

        public final int hashCode() {
            return ((((((H00.a.c(527, 31, this.f8751a) + this.f8752b) * 31) + this.f8753c) * 31) + ((int) this.f8754d)) * 31) + this.f8755e;
        }

        public b(long j11, Object obj) {
            this(obj, -1, -1, j11, -1);
        }

        public b(long j11, Object obj, int i11) {
            this(obj, -1, -1, j11, i11);
        }

        public b(long j11, Object obj, int i11, int i12) {
            this(obj, i11, i12, j11, -1);
        }

        private b(Object obj, int i11, int i12, long j11, int i13) {
            this.f8751a = obj;
            this.f8752b = i11;
            this.f8753c = i12;
            this.f8754d = j11;
            this.f8755e = i13;
        }
    }

    /* renamed from: F3.x$c */
    public interface c {
        void b(AbstractC2996a abstractC2996a, AbstractC7252H abstractC7252H);
    }

    default AbstractC7252H a() {
        return null;
    }

    void addDrmEventListener(Handler handler, w3.i iVar);

    void addEventListener(Handler handler, F f7);

    default boolean b() {
        return true;
    }

    InterfaceC3017w createPeriod(b bVar, J3.b bVar2, long j11);

    void disable(c cVar);

    void enable(c cVar);

    C7275q getMediaItem();

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void prepareSource(c cVar, p3.z zVar, u3.P p11);

    void releasePeriod(InterfaceC3017w interfaceC3017w);

    void releaseSource(c cVar);

    void removeDrmEventListener(w3.i iVar);

    void removeEventListener(F f7);

    default void updateMediaItem(C7275q c7275q) {
    }
}
