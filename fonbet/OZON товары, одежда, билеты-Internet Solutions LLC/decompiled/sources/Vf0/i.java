package Vf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersRepositoryImpl", f = "ExtraHeadersRepositoryImpl.kt", l = {88, 89}, m = "deleteExtraHeader")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    h f32719d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f32720e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f32721f;

    /* renamed from: g, reason: collision with root package name */
    int f32722g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32721f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f32720e = obj;
        this.f32722g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32721f.d(null, this);
    }
}
