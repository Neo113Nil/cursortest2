package Kc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.FirstLaunchRepository", f = "FirstLaunchRepository.kt", l = {51, 53}, m = "initCurrentStateIfNeed")
/* loaded from: classes7.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    l f15800d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f15801e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l f15802f;

    /* renamed from: g, reason: collision with root package name */
    int f15803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15802f = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f7;
        this.f15801e = obj;
        this.f15803g |= LinearLayoutManager.INVALID_OFFSET;
        f7 = this.f15802f.f(this);
        return f7;
    }
}
