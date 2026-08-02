package Le0;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.Style;
import ru.ozon.mapsdk.common.geoproxy.data.model.VectorData;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreMapController", f = "LibreMapController.kt", l = {368, 376, 392}, m = "generateStyle")
/* loaded from: classes3.dex */
final class r extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f17026d;

    /* renamed from: e, reason: collision with root package name */
    Context f17027e;

    /* renamed from: f, reason: collision with root package name */
    VectorData f17028f;

    /* renamed from: g, reason: collision with root package name */
    Style.Builder f17029g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f17030h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ o f17031i;

    /* renamed from: j, reason: collision with root package name */
    int f17032j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f17031i = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f17030h = obj;
        this.f17032j |= LinearLayoutManager.INVALID_OFFSET;
        return o.k(this.f17031i, null, null, this);
    }
}
