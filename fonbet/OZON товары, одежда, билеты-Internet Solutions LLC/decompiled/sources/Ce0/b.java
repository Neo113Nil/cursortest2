package Ce0;

import J4.l;
import androidx.annotation.NonNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

/* loaded from: classes7.dex */
final class b extends l<De0.a> {
    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull De0.a aVar) {
        De0.a aVar2 = aVar;
        fVar.m0(1, aVar2.e());
        if (aVar2.m() == null) {
            fVar.C0(2);
        } else {
            fVar.e0(2, aVar2.m());
        }
        if (aVar2.h() == null) {
            fVar.C0(3);
        } else {
            fVar.e0(3, aVar2.h());
        }
        if (aVar2.i() == null) {
            fVar.C0(4);
        } else {
            fVar.e0(4, aVar2.i());
        }
        if (aVar2.j() == null) {
            fVar.C0(5);
        } else {
            fVar.S0(5, aVar2.j().doubleValue());
        }
        if (aVar2.k() == null) {
            fVar.C0(6);
        } else {
            fVar.S0(6, aVar2.k().doubleValue());
        }
        if (aVar2.s() == null) {
            fVar.C0(7);
        } else {
            fVar.m0(7, aVar2.s().intValue());
        }
        if (aVar2.t() == null) {
            fVar.C0(8);
        } else {
            fVar.e0(8, aVar2.t());
        }
        if (aVar2.f() == null) {
            fVar.C0(9);
        } else {
            fVar.e0(9, aVar2.f());
        }
        if (aVar2.l() == null) {
            fVar.C0(10);
        } else {
            fVar.e0(10, aVar2.l());
        }
        if (aVar2.q() == null) {
            fVar.C0(11);
        } else {
            fVar.e0(11, aVar2.q());
        }
        if (aVar2.d() == null) {
            fVar.C0(12);
        } else {
            fVar.e0(12, aVar2.d());
        }
        if (aVar2.n() == null) {
            fVar.C0(13);
        } else {
            fVar.e0(13, aVar2.n());
        }
        if (aVar2.a() == null) {
            fVar.C0(14);
        } else {
            fVar.e0(14, aVar2.a());
        }
        if (aVar2.b() == null) {
            fVar.C0(15);
        } else {
            fVar.e0(15, aVar2.b());
        }
        if (aVar2.c() == null) {
            fVar.C0(16);
        } else {
            fVar.e0(16, aVar2.c());
        }
        GeoProviderConfig.ProviderSuggest p11 = aVar2.p();
        String name = p11 != null ? p11.name() : null;
        if (name == null) {
            fVar.C0(17);
        } else {
            fVar.e0(17, name);
        }
        if (aVar2.r() == null) {
            fVar.C0(18);
        } else {
            fVar.e0(18, aVar2.r());
        }
        if (aVar2.g() == null) {
            fVar.C0(19);
        } else {
            fVar.e0(19, aVar2.g());
        }
        fVar.e0(20, aVar2.o());
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `cached_provider` (`uniq_id`,`name`,`logo`,`logo_mobile`,`max_zoom`,`min_zoom`,`tile_size`,`tile_url`,`key`,`mode`,`suggest_preferred_provider`,`geocode_preferred_provider`,`rev_geocode_preferred_provider`,`allowed_locations`,`copyrights`,`features`,`suggest`,`suggest_provider`,`locale`,`sdkType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
