package Be0;

import Fe0.e;
import J4.r;
import J4.s;
import Sc.k;
import Sc.n;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.storage.cache.CacheDatabase;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private CacheDatabase f3699a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f3700b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f3701c;

    /* renamed from: Be0.a$a, reason: collision with other inner class name */
    static final class C0097a extends AbstractC7737t implements Function0<Fe0.b> {
        C0097a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fe0.b invoke() {
            CacheDatabase cacheDatabase = a.this.f3699a;
            Intrinsics.f(cacheDatabase);
            return new Fe0.b(cacheDatabase.a());
        }
    }

    static final class b extends AbstractC7737t implements Function0<e> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            CacheDatabase cacheDatabase = a.this.f3699a;
            Intrinsics.f(cacheDatabase);
            return new e(cacheDatabase.b());
        }
    }

    public a() {
        n nVar = n.NONE;
        this.f3700b = k.a(nVar, new b());
        this.f3701c = k.a(nVar, new C0097a());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final Fe0.b b() {
        if (this.f3699a != null) {
            return (Fe0.b) this.f3701c.getValue();
        }
        throw new Exception("DB is not inited, cannot use cache");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final e c() {
        if (this.f3699a != null) {
            return (e) this.f3700b.getValue();
        }
        throw new Exception("DB is not inited, cannot use cache");
    }

    public final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f3699a != null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        s.a a11 = r.a(CacheDatabase.class, "MAPS_CACHE_DB", applicationContext);
        a11.b(Ee0.a.a());
        this.f3699a = (CacheDatabase) a11.d();
    }
}
