package Vf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersRepositoryImpl", f = "ExtraHeadersRepositoryImpl.kt", l = {93, 94, 96, 97}, m = "onChangeCookie")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    h f32727d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f32728e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f32729f;

    /* renamed from: g, reason: collision with root package name */
    int f32730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32729f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object j11;
        this.f32728e = obj;
        this.f32730g |= LinearLayoutManager.INVALID_OFFSET;
        j11 = this.f32729f.j(this);
        return j11;
    }
}
