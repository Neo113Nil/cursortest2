package M00;

import L00.l;
import Y00.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d<I> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final O00.a<I> f17226a;

    public static final class a<I> {

        /* renamed from: a, reason: collision with root package name */
        private O00.a<I> f17227a;

        /* renamed from: b, reason: collision with root package name */
        private M00.a f17228b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private l f17229c = l.a.a();

        /* renamed from: d, reason: collision with root package name */
        private Integer f17230d;

        @NotNull
        public final d<I> a() {
            O00.a<I> aVar = this.f17227a;
            if (aVar == null) {
                throw new IllegalStateException("data == null");
            }
            M00.a aVar2 = this.f17228b;
            if (aVar2 == null) {
                throw new IllegalStateException("request == null");
            }
            l lVar = this.f17229c;
            if (this.f17230d != null) {
                return new d<>(aVar, aVar2, lVar);
            }
            throw new IllegalStateException("code == null");
        }

        @NotNull
        public final void b(int i11) {
            this.f17230d = Integer.valueOf(i11);
        }

        @NotNull
        public final void c(@NotNull O00.a data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f17227a = data;
        }

        @NotNull
        public final void d(@NotNull a.C0630a headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f17229c = headers;
        }

        @NotNull
        public final void e(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
        }

        @NotNull
        public final void f(@NotNull M00.a request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f17228b = request;
        }
    }

    public d(@NotNull O00.a data, @NotNull M00.a request, @NotNull l headers) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f17226a = data;
    }

    @NotNull
    public final O00.a<I> a() {
        return this.f17226a;
    }
}
