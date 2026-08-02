package Je0;

import B0.C2454a;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import ei0.InterfaceC6369b;
import ie0.C7064a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import te0.C9867b;
import ue0.InterfaceC10046c;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f14652a;

    public a(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.f14652a = ozonTracker;
    }

    public final void a(GeoProviderConfig geoProviderConfig, @NotNull e eventName, String str, Long l11, String str2, s sVar) {
        String suggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease;
        String geocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease;
        String revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease;
        String str3;
        ApiHost host;
        String url;
        Uri parse;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Pair pair = new Pair(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "metric");
        Pair pair2 = new Pair("devtools", C2454a.b("toolName", "map_mobile_sdk"));
        Pair pair3 = new Pair("object", U.j(new Pair("id", eventName.a()), new Pair("type", "map")));
        ie0.g.f66321a.getClass();
        GeoProxyConfig c11 = ie0.g.c();
        Pair pair4 = new Pair("om_app_name", c11 != null ? c11.getAppName() : null);
        Pair pair5 = new Pair("om_version", "14.8.1");
        GeoProxyConfig c12 = ie0.g.c();
        List b02 = C7714v.b0(pair4, pair5, new Pair(ImagesContract.URL, (c12 == null || (host = c12.getHost()) == null || (url = host.getUrl()) == null || (parse = Uri.parse(url)) == null) ? null : parse.getHost()));
        if (geoProviderConfig == null || (suggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease = geoProviderConfig.getSuggestProvider()) == null) {
            C7064a.f66281a.getClass();
            GeoProviderConfig g10 = C7064a.g();
            suggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease = g10 != null ? g10.getSuggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease() : null;
        }
        Pair pair6 = new Pair("om_suggestion_provider", suggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease);
        if (geoProviderConfig == null || (geocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease = geoProviderConfig.getGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease()) == null) {
            C7064a.f66281a.getClass();
            GeoProviderConfig g11 = C7064a.g();
            geocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease = g11 != null ? g11.getGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease() : null;
        }
        Pair pair7 = new Pair("om_geocode_provider", geocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease);
        if (geoProviderConfig == null || (revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease = geoProviderConfig.getRevGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease()) == null) {
            C7064a.f66281a.getClass();
            GeoProviderConfig g12 = C7064a.g();
            revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease = g12 != null ? g12.getRevGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease() : null;
        }
        List b03 = C7714v.b0(pair6, pair7, new Pair("om_revgeocode_provider", revGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease));
        if (geoProviderConfig != null) {
            C7064a.f66281a.getClass();
            str3 = b.a(geoProviderConfig, C7064a.f());
        } else {
            str3 = null;
        }
        List[] listArr = {b02, b03, C7714v.b0(new Pair("om_provider", str3), new Pair("om_location_uid", str), new Pair("number", l11), new Pair("language", str2 == null ? "DEFAULT" : str2))};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 = 0; i11 < 3; i11++) {
            for (Pair pair8 : listArr[i11]) {
                if (pair8.f() != null) {
                    Object e11 = pair8.e();
                    Object f7 = pair8.f();
                    Intrinsics.f(f7);
                    linkedHashMap.put(e11, f7);
                }
            }
        }
        LinkedHashMap l12 = U.l(pair, pair2, pair3, new Pair("properties", linkedHashMap));
        if (sVar != null) {
            l12.put("event_error", U.j(new Pair("code", sVar.a()), new Pair(SelectionItemFormDTO.TITLE_FIELD_NAME, sVar.b())));
        }
        this.f14652a.sendCustomEvent(null, l12);
        C9867b c9867b = C9867b.f99466a;
        C9867b.g("Try track: " + l12, InterfaceC10046c.a.INFO, 4);
    }
}
