package a40;

import Le.InterfaceC3583a;
import Me.f;
import Oe.N;
import Oe.Z;
import Oe.r;
import Pe.m;
import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4942a {

    @NotNull
    public static final b Companion = new b(0);

    @InterfaceC3999a
    /* renamed from: a40.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0689a implements r<C4942a> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0689a f36263a;

        @NotNull
        private static final f descriptor;

        static {
            C0689a c0689a = new C0689a();
            f36263a = c0689a;
            N n11 = new N("DirRoubleResult", c0689a, 3);
            n11.j("type", false);
            n11.j("callbackId", false);
            n11.j("result", false);
            descriptor = n11;
        }

        @Override // Oe.r
        @NotNull
        public final InterfaceC3583a<?>[] a() {
            Z z11 = Z.f20279a;
            return new InterfaceC3583a[]{z11, z11, m.f22295a};
        }

        @Override // Le.f
        @NotNull
        public final f b() {
            return descriptor;
        }

        @Override // Le.f
        public final void c(Ne.a encoder, Object obj) {
            C4942a value = (C4942a) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            f fVar = descriptor;
            Ne.b e11 = encoder.e(fVar);
            b bVar = C4942a.Companion;
            value.getClass();
            e11.k(fVar, 0, null);
            e11.k(fVar, 1, null);
            e11.u(fVar, 2, m.f22295a, null);
            e11.B(fVar);
        }
    }

    /* renamed from: a40.a$b */
    public static final class b {
        private b() {
        }

        @NotNull
        public final InterfaceC3583a<C4942a> serializer() {
            return C0689a.f36263a;
        }

        public /* synthetic */ b(int i11) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4942a)) {
            return false;
        }
        ((C4942a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    @NotNull
    public final String toString() {
        return "DigRoubleResult(type=null, callbackId=null, result=null)";
    }
}
