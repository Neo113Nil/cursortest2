package OZ;

import EZ.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f20161a;

    /* renamed from: b, reason: collision with root package name */
    private final pZ.f f20162b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f20163c;

    public interface a {

        /* renamed from: OZ.c$a$a, reason: collision with other inner class name */
        public static final class C0403a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0403a f20164a = new C0403a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0403a);
            }

            public final int hashCode() {
                return -422002463;
            }

            @NotNull
            public final String toString() {
                return "All";
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f20165a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -762485575;
            }

            @NotNull
            public final String toString() {
                return "Current";
            }
        }
    }

    public static final class b extends i<c> {
        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<c> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            navigateForResult(navigator, response, 0);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<c> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            if (navigator instanceof NZ.a) {
                ((NZ.a) navigator).navigate(response, i11);
            } else {
                next(navigator, response, i11);
            }
        }
    }

    public c() {
        this(0);
    }

    @NotNull
    public final a a() {
        return this.f20161a;
    }

    public final pZ.f b() {
        return this.f20162b;
    }

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f20163c;
    }

    @NotNull
    public final String toString() {
        return "CloseTabDestination(mode=" + this.f20161a + ", redirect=" + this.f20162b + ")";
    }

    public /* synthetic */ c(int i11) {
        this(a.b.f20165a, null);
    }

    public c(@NotNull a mode, pZ.f fVar) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f20161a = mode;
        this.f20162b = fVar;
        this.f20163c = N.b(b.class);
    }
}
