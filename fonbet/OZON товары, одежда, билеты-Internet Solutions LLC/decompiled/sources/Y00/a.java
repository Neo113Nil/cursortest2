package Y00;

import L00.h;
import L00.l;
import M00.c;
import M00.d;
import We.C;
import We.E;
import We.G;
import We.J;
import We.K;
import We.L;
import We.M;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.InterfaceC9683i;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final E f34525a;

    /* renamed from: Y00.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0630a implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f34526a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f34527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L f34528c;

        public C0630a(L l11, L l12, L l13) {
            this.f34526a = l11;
            this.f34527b = l12;
            this.f34528c = l13;
        }

        @Override // L00.l
        public final String get(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f34526a.r().c(name);
        }

        @Override // L00.l
        public final List<String> headers(String str) {
            Intrinsics.checkNotNullParameter("server-timing", AppMeasurementSdk.ConditionalUserProperty.NAME);
            return this.f34527b.r().l("server-timing");
        }

        @Override // L00.l
        public final Map<String, List<String>> toMultimap() {
            return this.f34528c.r().i();
        }

        public final String toString() {
            return "Headers";
        }
    }

    public a(@NotNull E configuredClient) {
        Intrinsics.checkNotNullParameter(configuredClient, "configuredClient");
        this.f34525a = configuredClient;
    }

    @NotNull
    public final <I> d<I> a(@NotNull M00.a request, @NotNull Function1<? super InterfaceC9683i, O00.a<I>> parser) {
        byte[] b11;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(parser, "parser");
        h e11 = request.e();
        G.a aVar = new G.a();
        aVar.k(request.g().d());
        String d11 = request.d();
        J j11 = null;
        C c11 = null;
        j11 = null;
        if (e11 != null && (b11 = e11.b()) != null) {
            K.Companion companion = K.INSTANCE;
            String c12 = e11.c();
            if (c12 != null) {
                C.f33536g.getClass();
                c11 = C.a.b(c12);
            }
            int a11 = e11.a();
            companion.getClass();
            j11 = K.Companion.c(b11, c11, 0, a11);
        }
        aVar.f(j11, d11);
        for (Map.Entry<String, String> entry : request.c().entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Class<?>, Object> entry2 : request.f().entrySet()) {
            Class<?> key = entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.g(key, "null cannot be cast to non-null type java.lang.Class<in kotlin.Any>");
            aVar.i(key, value);
        }
        L execute = this.f34525a.a(aVar.b()).execute();
        try {
            M c13 = execute.c();
            Intrinsics.f(c13);
            if (!execute.v()) {
                throw new c(execute.w(), execute.m());
            }
            d.a aVar2 = new d.a();
            aVar2.d(new C0630a(execute, execute, execute));
            aVar2.c(parser.invoke(c13.source()));
            aVar2.b(execute.m());
            aVar2.e(execute.w());
            aVar2.f(request);
            d<I> a12 = aVar2.a();
            execute.close();
            return a12;
        } finally {
        }
    }
}
