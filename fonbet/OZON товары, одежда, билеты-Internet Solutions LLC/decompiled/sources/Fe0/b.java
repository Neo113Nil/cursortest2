package Fe0;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ce0.a f9438a;

    public b(@NotNull Ce0.a dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.f9438a = dao;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        De0.a aVar2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f9437f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f9437f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f9435d;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f9437f;
                if (i11 != 0) {
                    s.b(obj);
                    aVar.f9437f = 1;
                    obj = this.f9438a.b(aVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                aVar2 = (De0.a) obj;
                if (aVar2 == null) {
                    return new GeoProviderConfig(aVar2.h(), aVar2.i(), aVar2.j(), aVar2.k(), aVar2.m(), aVar2.s(), aVar2.t(), aVar2.f(), aVar2.l(), aVar2.q(), aVar2.d(), aVar2.n(), aVar2.a(), aVar2.b(), aVar2.c(), aVar2.p(), aVar2.r(), aVar2.g(), GeoProviderConfig.SdkType.INSTANCE.fromName(aVar2.o()));
                }
                return null;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f9435d;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f9437f;
        if (i11 != 0) {
        }
        aVar2 = (De0.a) obj2;
        if (aVar2 == null) {
        }
    }

    public final Object b(@NotNull GeoProviderConfig geoProviderConfig, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        De0.a aVar = geoProviderConfig != null ? new De0.a(1, geoProviderConfig.getName(), geoProviderConfig.getLogo(), geoProviderConfig.getLogoMobile(), geoProviderConfig.getMaxZoom(), geoProviderConfig.getMinZoom(), geoProviderConfig.getTileSize(), geoProviderConfig.getTileUrl(), geoProviderConfig.getKey(), geoProviderConfig.getMode(), geoProviderConfig.getSuggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease(), geoProviderConfig.getGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease(), geoProviderConfig.getRevGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease(), geoProviderConfig.getAllowedLocations$mapsdk_fullFirebaseOpenglRelease(), geoProviderConfig.getCopyrights$mapsdk_fullFirebaseOpenglRelease(), geoProviderConfig.getFeatures(), geoProviderConfig.getSuggest(), geoProviderConfig.getSuggestProvider(), geoProviderConfig.getLocale(), geoProviderConfig.getSdkType().getName$mapsdk_fullFirebaseOpenglRelease()) : null;
        if (aVar == null) {
            return null;
        }
        Object a11 = this.f9438a.a(aVar, cVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
