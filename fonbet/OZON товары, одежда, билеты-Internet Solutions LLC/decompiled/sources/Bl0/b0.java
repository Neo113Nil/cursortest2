package Bl0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3963c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static b0 f3964d;

    /* renamed from: a, reason: collision with root package name */
    public final V f3965a;

    /* renamed from: b, reason: collision with root package name */
    public final Al0.a f3966b;

    public static final class a {
        public final b0 a(Context context) {
            b0 b0Var;
            Intrinsics.checkNotNullParameter(context, "context");
            synchronized (this) {
                b0Var = b0.f3964d;
                if (b0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    b0Var = new b0(applicationContext);
                    b0.f3964d = b0Var;
                }
            }
            return b0Var;
        }
    }

    public static final class b {
    }

    public b0(Context context) {
        h0 h0Var = new h0();
        b bVar = new b();
        d0 d0Var = new d0(context);
        j0 timeProvider = new j0();
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        k0 migrationDtoVer2Mapper = new k0();
        c0 migrationDtoVer1Factory = new c0();
        e0 migrationDtoVer1Serializer = new e0();
        C2640a migrationDtoVer2Serializer = new C2640a();
        Intrinsics.checkNotNullParameter(migrationDtoVer1Factory, "migrationDtoVer1Factory");
        Intrinsics.checkNotNullParameter(migrationDtoVer1Serializer, "migrationDtoVer1Serializer");
        Intrinsics.checkNotNullParameter(migrationDtoVer2Mapper, "migrationDtoVer2Mapper");
        Intrinsics.checkNotNullParameter(migrationDtoVer2Serializer, "migrationDtoVer2Serializer");
        C2662x c2662x = new C2662x(new K(context, new C2644e()), bVar);
        W metricsEventSerializer = new W();
        C2645f uuidFactory = new C2645f();
        Intrinsics.checkNotNullParameter(metricsEventSerializer, "metricsEventSerializer");
        Intrinsics.checkNotNullParameter(uuidFactory, "uuidFactory");
        B b11 = new B();
        W metricsEventSerializer2 = new W();
        Intrinsics.checkNotNullParameter(metricsEventSerializer2, "metricsEventSerializer");
        H h11 = new H(c2662x, b11, new D(), bVar);
        V v11 = new V(h11, new T(h11, new P(new C2641b(d0Var, new C2645f()), new C2647h(context), new J(new U(new C2646g(), new N(), bVar)), new C2651l(context))));
        this.f3965a = v11;
        C2654o jobRepeatIntervalDataSource = new C2654o();
        Intrinsics.checkNotNullParameter(jobRepeatIntervalDataSource, "jobRepeatIntervalDataSource");
        C2656q jobRepeatIntervalRepository = new C2656q();
        Intrinsics.checkNotNullParameter(jobRepeatIntervalRepository, "jobRepeatIntervalRepository");
        this.f3966b = new Al0.a(new I(v11, new C2649j(h11), new X(context, new C2652m()), h0Var, bVar));
    }
}
