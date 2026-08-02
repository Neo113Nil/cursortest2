package I3;

import j3.C7253I;
import j3.C7272n;
import java.util.List;

/* loaded from: classes.dex */
public interface y extends C {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C7253I f11970a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f11971b;

        public a(C7253I c7253i, int[] iArr) {
            if (iArr.length == 0) {
                m3.s.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f11970a = c7253i;
            this.f11971b = iArr;
        }
    }

    public interface b {
        y[] a(a[] aVarArr, J3.d dVar);
    }

    void a();

    boolean b(int i11, long j11);

    boolean d(int i11, long j11);

    void disable();

    default void e() {
    }

    int getSelectedIndex();

    int h(long j11, List<? extends G3.d> list);

    int i();

    C7272n j();

    default void k() {
    }

    default boolean l(long j11, G3.b bVar, List<? extends G3.d> list) {
        return false;
    }

    void n(long j11, long j12, long j13, List<? extends G3.d> list, G3.e[] eVarArr);

    void o(float f7);

    Object p();

    default void q(boolean z11) {
    }

    int r();
}
