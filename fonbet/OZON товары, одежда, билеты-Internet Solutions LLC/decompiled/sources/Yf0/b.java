package Yf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.mockServer.MockServerDataSource", f = "MockServerDataSource.kt", l = {34}, m = "getMockPathsList")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f34995d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f34996e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f34997f;

    /* renamed from: g, reason: collision with root package name */
    int f34998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f34997f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34996e = obj;
        this.f34998g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f34997f.b(this);
    }
}
