package Pe0;

import Oe0.d;
import Pe0.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.m;
import org.jetbrains.annotations.NotNull;
import we0.u;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {m.e.DEFAULT_SWIPE_ANIMATION_DURATION, 262, 277, 281}, m = "insertPlacemarksInternalWithRes")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f22360d;

    /* renamed from: e, reason: collision with root package name */
    Object f22361e;

    /* renamed from: f, reason: collision with root package name */
    Object f22362f;

    /* renamed from: g, reason: collision with root package name */
    Object f22363g;

    /* renamed from: h, reason: collision with root package name */
    u f22364h;

    /* renamed from: i, reason: collision with root package name */
    d.C0411d f22365i;

    /* renamed from: j, reason: collision with root package name */
    b.c f22366j;

    /* renamed from: k, reason: collision with root package name */
    long f22367k;

    /* renamed from: l, reason: collision with root package name */
    long f22368l;

    /* renamed from: m, reason: collision with root package name */
    long f22369m;

    /* renamed from: n, reason: collision with root package name */
    boolean f22370n;

    /* renamed from: o, reason: collision with root package name */
    /* synthetic */ Object f22371o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ d f22372p;

    /* renamed from: q, reason: collision with root package name */
    int f22373q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f22372p = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object U10;
        this.f22371o = obj;
        this.f22373q |= LinearLayoutManager.INVALID_OFFSET;
        U10 = this.f22372p.U(null, 0L, 0L, false, this);
        return U10;
    }
}
