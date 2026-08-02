package Le0;

import Je0.d;
import Le0.o;
import ei0.InterfaceC6369b;
import org.maplibre.android.maps.MapView;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import te0.C9867b;
import ue0.InterfaceC10046c;

/* loaded from: classes3.dex */
public final class u implements MapView.OnDidFinishRenderingMapListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f17038a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f17039b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ GeoProviderConfig f17040c;

    u(long j11, o oVar, GeoProviderConfig geoProviderConfig) {
        this.f17038a = j11;
        this.f17039b = oVar;
        this.f17040c = geoProviderConfig;
    }

    @Override // org.maplibre.android.maps.MapView.OnDidFinishRenderingMapListener
    public final void h(boolean z11) {
        o.a aVar;
        Je0.c cVar;
        InterfaceC6369b ozonTracker;
        o.a aVar2;
        Je0.c cVar2;
        InterfaceC6369b ozonTracker2;
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f17038a;
            Je0.c cVar3 = null;
            o oVar = this.f17039b;
            if (z11) {
                aVar2 = oVar.f16980i;
                Je0.e eVar = aVar2 == o.a.VECTOR ? Je0.e.VECTOR_MAP_RENDERED : Je0.e.RASTER_MAP_RENDERED;
                oVar.B().removeOnDidFinishRenderingMapListener(this);
                ie0.g.f66321a.getClass();
                if (ie0.g.c() == null) {
                    Je0.c.f14654d = null;
                } else {
                    cVar2 = Je0.c.f14654d;
                    if (cVar2 != null) {
                        cVar3 = Je0.c.f14654d;
                    } else {
                        GeoProxyConfig c11 = ie0.g.c();
                        if (c11 != null && (ozonTracker2 = c11.getOzonTracker()) != null) {
                            Je0.c.f14654d = new Je0.c(ozonTracker2);
                            cVar3 = Je0.c.f14654d;
                        }
                        d.a.a();
                    }
                }
                Je0.c cVar4 = cVar3;
                if (cVar4 != null) {
                    Je0.c.d(cVar4, this.f17040c, eVar, null, Long.valueOf(currentTimeMillis), null, null, 116);
                    return;
                }
                return;
            }
            aVar = oVar.f16980i;
            Je0.e eVar2 = aVar == o.a.VECTOR ? Je0.e.FIRST_VECTOR_RENDERED : Je0.e.FIRST_RASTER_RENDERED;
            oVar.B().removeOnDidFinishRenderingMapListener(this);
            ie0.g.f66321a.getClass();
            if (ie0.g.c() == null) {
                Je0.c.f14654d = null;
            } else {
                cVar = Je0.c.f14654d;
                if (cVar != null) {
                    cVar3 = Je0.c.f14654d;
                } else {
                    GeoProxyConfig c12 = ie0.g.c();
                    if (c12 != null && (ozonTracker = c12.getOzonTracker()) != null) {
                        Je0.c.f14654d = new Je0.c(ozonTracker);
                        cVar3 = Je0.c.f14654d;
                    }
                    d.a.a();
                }
            }
            Je0.c cVar5 = cVar3;
            if (cVar5 != null) {
                Je0.c.d(cVar5, this.f17040c, eVar2, null, Long.valueOf(currentTimeMillis), null, null, 116);
            }
        } catch (Exception e11) {
            C9867b c9867b = C9867b.f99466a;
            C9867b.f("Error while try send render analytic", e11, InterfaceC10046c.a.ERROR);
        }
    }
}
