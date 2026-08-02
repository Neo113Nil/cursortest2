package aj;

import Si.InterfaceC4010a;
import bj.C5677e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: aj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC5028a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0709a f36806a = C0709a.f36807a;

    /* renamed from: aj.a$a, reason: collision with other inner class name */
    public static final class C0709a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0709a f36807a = new C0709a();

        /* renamed from: b, reason: collision with root package name */
        private static final long f36808b = InterfaceC4010a.C0522a.class.getName().hashCode();

        /* renamed from: c, reason: collision with root package name */
        private static final long f36809c = InterfaceC4010a.f.class.getName().hashCode();

        /* renamed from: d, reason: collision with root package name */
        private static final long f36810d = InterfaceC4010a.d.class.getName().hashCode();

        public static long a() {
            return f36808b;
        }

        public static long b() {
            return f36810d;
        }

        public static long c() {
            return f36809c;
        }
    }

    /* renamed from: aj.a$b */
    public static final class b {
        @NotNull
        public static InterfaceC4010a.C0522a a(@NotNull C5677e c5677e, int i11, boolean z11) {
            InterfaceC5028a.f36806a.getClass();
            return new InterfaceC4010a.C0522a(i11, c5677e.p(), C0709a.a(), z11);
        }

        @NotNull
        public static InterfaceC4010a.d b(int i11) {
            InterfaceC5028a.f36806a.getClass();
            return new InterfaceC4010a.d(C0709a.b(), i11);
        }

        @NotNull
        public static InterfaceC4010a.f c(@NotNull C5677e c5677e, int i11) {
            int i12 = (c5677e.o() && c5677e.q()) ? R.string.gallery_permissions_warning_camera : c5677e.p() ? R.string.gallery_permissions_warning_gallery : R.string.gallery_permissions_warning_gallery_and_camera_nobreak;
            InterfaceC5028a.f36806a.getClass();
            return new InterfaceC4010a.f(C0709a.c(), i11, i12);
        }
    }
}
