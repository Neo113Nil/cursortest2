package Le0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.RasterLayer;
import org.maplibre.android.style.sources.RasterSource;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreMapController$generateStyle$2", f = "LibreMapController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Style.Builder>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o f17033d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Style.Builder f17034e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(o oVar, Style.Builder builder, kotlin.coroutines.d<? super s> dVar) {
        super(2, dVar);
        this.f17033d = oVar;
        this.f17034e = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new s(this.f17033d, this.f17034e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Style.Builder> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        o oVar = this.f17033d;
        String name = oVar.f16974c.getName();
        if (name == null) {
            name = oVar.f16974c.getSdkType().getName$mapsdk_fullFirebaseOpenglRelease();
        }
        String tileUrl = oVar.f16974c.getTileUrl();
        if (tileUrl == null) {
            tileUrl = "";
        }
        org.maplibre.android.style.sources.b bVar = new org.maplibre.android.style.sources.b(tileUrl);
        Double maxZoom = oVar.f16974c.getMaxZoom();
        bVar.f79994d = maxZoom != null ? new Float((float) maxZoom.doubleValue()) : new Float(18.0f);
        Double minZoom = oVar.f16974c.getMinZoom();
        bVar.f79993c = minZoom != null ? new Float((float) minZoom.doubleValue()) : new Float(1.0f);
        bVar.b();
        bVar.a(new Float[]{new Float(-180.0f), new Float(-90.0f), new Float(180.0f), new Float(90.0f)});
        Integer tileSize = oVar.f16974c.getTileSize();
        RasterSource rasterSource = new RasterSource(name, bVar, tileSize != null ? tileSize.intValue() : 125);
        RasterLayer rasterLayer = new RasterLayer(rasterSource.getId());
        Style.Builder builder = this.f17034e;
        builder.h(rasterSource);
        builder.g(rasterLayer);
        return builder;
    }
}
