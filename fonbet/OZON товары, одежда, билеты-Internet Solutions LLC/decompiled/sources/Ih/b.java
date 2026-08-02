package Ih;

import Fr.f;
import Fr.g;
import Qj0.U;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface b extends A00.b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC0251b<Boolean> f12499a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12500b = 999;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC0251b<Boolean> f12501c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private String f12502d;

        /* renamed from: Ih.b$a$a, reason: collision with other inner class name */
        public static final class C0250a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private InterfaceC0251b<Boolean> f12503a = new Ih.a();

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private c f12504b = c.f12507a;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private InterfaceC0251b<Boolean> f12505c = new Ih.a();

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private String f12506d = "ComposerPerf";

            @NotNull
            public final InterfaceC0251b<Boolean> a() {
                return this.f12503a;
            }

            @NotNull
            public final String b() {
                return this.f12506d;
            }

            @NotNull
            public final c c() {
                return this.f12504b;
            }

            @NotNull
            public final InterfaceC0251b<Boolean> d() {
                return this.f12505c;
            }

            @NotNull
            public final void e(@NotNull g includeComposerCreationTimeInTotalTimeProvider) {
                Intrinsics.checkNotNullParameter(includeComposerCreationTimeInTotalTimeProvider, "includeComposerCreationTimeInTotalTimeProvider");
                this.f12503a = includeComposerCreationTimeInTotalTimeProvider;
            }

            @NotNull
            public final void f(@NotNull f newMetricsEnabled) {
                Intrinsics.checkNotNullParameter(newMetricsEnabled, "newMetricsEnabled");
                this.f12505c = newMetricsEnabled;
            }
        }

        /* renamed from: Ih.b$a$b, reason: collision with other inner class name */
        public interface InterfaceC0251b<T> {
            Boolean getValue();
        }

        public a(C0250a c0250a) {
            this.f12499a = c0250a.a();
            c0250a.getClass();
            this.f12501c = c0250a.d();
            this.f12502d = c0250a.b();
        }

        public final int a() {
            return this.f12500b;
        }

        @NotNull
        public final InterfaceC0251b<Boolean> b() {
            return this.f12499a;
        }

        @NotNull
        public final String c() {
            return this.f12502d;
        }

        @NotNull
        public final InterfaceC0251b<Boolean> d() {
            return this.f12501c;
        }
    }

    void a(long j11);

    void b(long j11);

    void c(String str);

    void d(long j11);

    void e(@NotNull String str);

    void f(@NotNull String str);

    void g(@NotNull String str, Function1<? super U, Unit> function1);

    void h();

    void i(long j11);

    void j(long j11);
}
