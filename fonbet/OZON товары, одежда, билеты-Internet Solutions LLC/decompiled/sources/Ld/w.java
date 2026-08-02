package Ld;

import fe.InterfaceC6516A;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface w extends InterfaceC6516A {

    public static abstract class a {

        /* renamed from: Ld.w$a$a, reason: collision with other inner class name */
        public static final class C0321a extends a {
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final yd.f f16826a;

            public b(yd.f kotlinJvmBinaryClass) {
                Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f16826a = kotlinJvmBinaryClass;
            }

            @NotNull
            public final y a() {
                return this.f16826a;
            }
        }
    }

    a.b a(@NotNull Sd.b bVar, @NotNull Rd.e eVar);
}
