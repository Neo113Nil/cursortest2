package Gd;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Gd.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC3073c {

    /* renamed from: Gd.c$a */
    public static final class a implements InterfaceC3073c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f10012a = new a();

        @Override // Gd.InterfaceC3073c
        @NotNull
        public final Set<Sd.f> a() {
            return kotlin.collections.M.f71699a;
        }

        @Override // Gd.InterfaceC3073c
        @NotNull
        public final Set<Sd.f> b() {
            return kotlin.collections.M.f71699a;
        }

        @Override // Gd.InterfaceC3073c
        public final Jd.n c(@NotNull Sd.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // Gd.InterfaceC3073c
        public final Jd.v d(@NotNull Sd.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // Gd.InterfaceC3073c
        @NotNull
        public final Set<Sd.f> e() {
            return kotlin.collections.M.f71699a;
        }

        @Override // Gd.InterfaceC3073c
        public final Collection f(Sd.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return kotlin.collections.K.f71697a;
        }
    }

    @NotNull
    Set<Sd.f> a();

    @NotNull
    Set<Sd.f> b();

    Jd.n c(@NotNull Sd.f fVar);

    Jd.v d(@NotNull Sd.f fVar);

    @NotNull
    Set<Sd.f> e();

    @NotNull
    Collection<Jd.q> f(@NotNull Sd.f fVar);
}
