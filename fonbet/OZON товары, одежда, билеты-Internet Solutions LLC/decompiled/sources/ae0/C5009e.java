package ae0;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.MapInitializer", f = "MapInitializer.kt", l = {159, 177}, m = "initGeoProviderOrFallbackToDefaultLibre$mapsdk_fullFirebaseOpenglRelease")
/* renamed from: ae0.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C5009e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    GeoProviderConfig f36631d;

    /* renamed from: e, reason: collision with root package name */
    Context f36632e;

    /* renamed from: f, reason: collision with root package name */
    AbstractC5006b f36633f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f36634g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ i f36635h;

    /* renamed from: i, reason: collision with root package name */
    int f36636i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5009e(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36635h = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36634g = obj;
        this.f36636i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36635h.d(null, this, null);
    }
}
