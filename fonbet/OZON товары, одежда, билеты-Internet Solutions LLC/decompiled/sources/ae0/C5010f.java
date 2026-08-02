package ae0;

import Sc.r;
import Sc.s;
import android.content.Context;
import ie0.C7064a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import te0.C9867b;
import ue0.C10044a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.MapInitializer$initGeoProviderOrFallbackToDefaultLibre$2", f = "MapInitializer.kt", l = {161}, m = "invokeSuspend")
/* renamed from: ae0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5010f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f36637d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC5006b f36638e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ GeoProviderConfig f36639f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f36640g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5010f(AbstractC5006b abstractC5006b, Context context, kotlin.coroutines.d dVar, GeoProviderConfig geoProviderConfig) {
        super(2, dVar);
        this.f36638e = abstractC5006b;
        this.f36639f = geoProviderConfig;
        this.f36640g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        GeoProviderConfig geoProviderConfig = this.f36639f;
        return new C5010f(this.f36638e, this.f36640g, dVar, geoProviderConfig);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Object> dVar) {
        return ((C5010f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[ORIG_RETURN, RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        String locale;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36637d;
        AbstractC5006b abstractC5006b = this.f36638e;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            if (!abstractC5006b.f()) {
                Context context = this.f36640g;
                r.Companion companion2 = r.INSTANCE;
                i iVar = i.f36650a;
                this.f36637d = 1;
                if (iVar.e(context, this) == aVar) {
                    return aVar;
                }
            }
            locale = this.f36639f.getLocale();
            if (locale != null) {
                return null;
            }
            abstractC5006b.i(locale);
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a11 = Unit.f71690a;
        r.Companion companion3 = r.INSTANCE;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            C9867b.f99466a.a("MapInitializer", Nk.a.b("error set api keys form backend for ", abstractC5006b.d().name()), new C10044a(b11));
        }
        if ((a11 instanceof r.b) || !abstractC5006b.f()) {
            C7064a c7064a = C7064a.f66281a;
            Je0.n nVar = Je0.n.FALLBACK;
            c7064a.getClass();
            C7064a.m(nVar);
            return GeoProviderConfig.INSTANCE.getDefaultLibre();
        }
        locale = this.f36639f.getLocale();
        if (locale != null) {
        }
    }
}
