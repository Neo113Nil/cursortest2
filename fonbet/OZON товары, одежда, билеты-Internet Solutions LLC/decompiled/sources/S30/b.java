package S30;

import Je.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.fintech.di.fintech.device.ApplicationInfoDataSourceImpl", f = "ApplicationInfoDataSourceImpl.kt", l = {93}, m = "getAdvertisingId")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f25757d;

    /* renamed from: e, reason: collision with root package name */
    d f25758e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f25759f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f25760g;

    /* renamed from: h, reason: collision with root package name */
    int f25761h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f25760g = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f25759f = obj;
        this.f25761h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f25760g.b(this);
    }
}
