package ae0;

import Sc.r;
import Sc.s;
import android.content.Context;
import ie0.C7064a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import te0.C9867b;
import ue0.C10044a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.MapInitializer$initGeoProviderOrFallbackToDefaultLibre$3", f = "MapInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super GeoProviderConfig>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ GeoProviderConfig f36641d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC5006b f36642e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f36643f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(AbstractC5006b abstractC5006b, Context context, kotlin.coroutines.d dVar, GeoProviderConfig geoProviderConfig) {
        super(2, dVar);
        this.f36641d = geoProviderConfig;
        this.f36642e = abstractC5006b;
        this.f36643f = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f36642e, this.f36643f, dVar, this.f36641d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super GeoProviderConfig> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        AbstractC5006b abstractC5006b = this.f36642e;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Context context = this.f36643f;
        try {
            r.Companion companion = r.INSTANCE;
            abstractC5006b.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (!abstractC5006b.f()) {
            EnumC5007c geoProviderType = abstractC5006b.d();
            Intrinsics.checkNotNullParameter(geoProviderType, "geoProviderType");
            throw new C5005a("Api key for " + geoProviderType + " service is not provided");
        }
        if (!abstractC5006b.b()) {
            String a12 = abstractC5006b.a();
            Intrinsics.f(a12);
            abstractC5006b.e(context, a12);
            abstractC5006b.h();
        }
        a11 = Unit.f71690a;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            C9867b.f99466a.a("MapInitializer", Nk.a.b("error initializing for ", abstractC5006b.d().name()), new C10044a(b11));
        }
        if (!(a11 instanceof r.b)) {
            return this.f36641d;
        }
        C7064a c7064a = C7064a.f66281a;
        Je0.n nVar = Je0.n.FALLBACK;
        c7064a.getClass();
        C7064a.m(nVar);
        return GeoProviderConfig.INSTANCE.getDefaultLibre();
    }
}
