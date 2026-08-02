package Pe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {198, 209, 214}, m = "removePlacemarksInternalById")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f22385d;

    /* renamed from: e, reason: collision with root package name */
    HashMap f22386e;

    /* renamed from: f, reason: collision with root package name */
    Iterator f22387f;

    /* renamed from: g, reason: collision with root package name */
    Object f22388g;

    /* renamed from: h, reason: collision with root package name */
    long f22389h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f22390i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ d f22391j;

    /* renamed from: k, reason: collision with root package name */
    int f22392k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f22391j = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f22390i = obj;
        this.f22392k |= LinearLayoutManager.INVALID_OFFSET;
        return d.P(this.f22391j, null, 0L, this);
    }
}
