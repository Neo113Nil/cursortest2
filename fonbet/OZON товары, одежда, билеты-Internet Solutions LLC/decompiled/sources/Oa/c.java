package Oa;

import Ja.f;
import Ja.g;
import Ja.i;
import Ja.j;
import Ra.b;
import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements Ga.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ra.b f20173a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f20174b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private b.a f20175a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f20176b;

        public a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f20175a = new b.a(context);
            this.f20176b = new ArrayList();
        }

        @NotNull
        public final c a() {
            final Ra.b d11 = this.f20175a.d();
            Ja.c interceptor = new Ja.c() { // from class: Oa.b
                @Override // Ja.c
                public final j a(f pipeline) {
                    Ra.b httpClient = Ra.b.this;
                    Intrinsics.checkNotNullParameter(httpClient, "$httpClient");
                    Intrinsics.checkNotNullParameter(pipeline, "pipeline");
                    return httpClient.f(pipeline.getRequest());
                }
            };
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            ArrayList arrayList = this.f20176b;
            arrayList.add(interceptor);
            return new c(d11, arrayList);
        }

        public final void b(@NotNull Function1<? super b.a, b.a> apply) {
            Intrinsics.checkNotNullParameter(apply, "apply");
            apply.invoke(this.f20175a);
        }
    }

    public c(Ra.b bVar, ArrayList arrayList) {
        this.f20173a = bVar;
        this.f20174b = arrayList;
    }

    public final void a(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f20173a.d(request);
    }

    @NotNull
    public final j b(@NotNull i request, @NotNull f.a global) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(global, "global");
        return g.a(global.a(), this, request, this.f20174b).b(request);
    }
}
