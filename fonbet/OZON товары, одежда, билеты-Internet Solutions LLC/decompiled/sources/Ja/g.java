package Ja;

import Ja.f;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {

    private static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        private final int f14299a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final i f14300b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final f.a f14301c;

        public a(int i11, @NotNull i request, @NotNull f.a env) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(env, "env");
            this.f14299a = i11;
            this.f14300b = request;
            this.f14301c = env;
        }

        @Override // Ja.f
        @NotNull
        public final f.a a() {
            return this.f14301c;
        }

        @Override // Ja.f
        @NotNull
        public final j b(@NotNull i request) {
            Intrinsics.checkNotNullParameter(request, "request");
            int i11 = this.f14299a + 1;
            f.a aVar = this.f14301c;
            c cVar = (c) C7714v.Q(i11, aVar.b());
            if (cVar != null) {
                return cVar.a(new a(i11, request, aVar));
            }
            throw new IllegalStateException("Seem's like there's no interceptor, which really executes the request, so chain cannot be completed. Interceptors: " + aVar.b());
        }

        @Override // Ja.f
        @NotNull
        public final i getRequest() {
            return this.f14300b;
        }
    }

    @NotNull
    public static f a(@NotNull f.b helpers, @NotNull Oa.c engine, @NotNull i request, @NotNull ArrayList interceptors) {
        Intrinsics.checkNotNullParameter(helpers, "helpers");
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        return new a(-1, request, new f.a(helpers, new b(), engine, request, interceptors));
    }
}
