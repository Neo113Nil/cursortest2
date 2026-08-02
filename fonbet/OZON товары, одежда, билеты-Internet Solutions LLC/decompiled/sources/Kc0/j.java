package Kc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.FirstLaunchRepository", f = "FirstLaunchRepository.kt", l = {57, 58}, m = "setFirstLaunchPassed")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    l f15812d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f15813e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l f15814f;

    /* renamed from: g, reason: collision with root package name */
    int f15815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15814f = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15813e = obj;
        this.f15815g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f15814f.i(this);
    }
}
