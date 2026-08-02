package Je0;

import Qj0.C3902w;
import ie0.C7064a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

/* loaded from: classes7.dex */
final class g extends AbstractC7737t implements Function1<C3902w, C3902w> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GeoProviderConfig f14669b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f14670c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f14671d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f14672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(GeoProviderConfig geoProviderConfig, f fVar, String str, String str2) {
        super(1);
        this.f14669b = geoProviderConfig;
        this.f14670c = fVar;
        this.f14671d = str;
        this.f14672e = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3902w invoke(C3902w c3902w) {
        String suggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease;
        String geocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease;
        String revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease;
        Integer num;
        String revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease2;
        C3902w it = c3902w;
        Intrinsics.checkNotNullParameter(it, "it");
        GeoProviderConfig geoProviderConfig = this.f14669b;
        if (geoProviderConfig == null || (suggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease = geoProviderConfig.getSuggestProvider()) == null) {
            C7064a.f66281a.getClass();
            GeoProviderConfig g10 = C7064a.g();
            suggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease = g10 != null ? g10.getSuggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease() : null;
        }
        if (geoProviderConfig == null || (geocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease = geoProviderConfig.getGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease()) == null) {
            C7064a.f66281a.getClass();
            GeoProviderConfig g11 = C7064a.g();
            geocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease = g11 != null ? g11.getGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease() : null;
        }
        if (geoProviderConfig == null || (revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease2 = geoProviderConfig.getRevGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease()) == null) {
            C7064a.f66281a.getClass();
            GeoProviderConfig g12 = C7064a.g();
            revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease = g12 != null ? g12.getRevGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease() : null;
        } else {
            revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease = revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease2;
        }
        num = o.f14685a;
        return f.b(this.f14670c, it, this.f14671d, suggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease, geocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease, revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease, this.f14672e, null, null, null, null, num, null, null, 507407);
    }
}
