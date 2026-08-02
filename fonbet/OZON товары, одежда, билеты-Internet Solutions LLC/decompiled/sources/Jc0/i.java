package Jc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.InstantLoginUseCase", f = "InstantLoginUseCase.kt", l = {19, 20, 21, 22, 23, 24}, m = "tryAuth")
/* loaded from: classes7.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    j f14608d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f14609e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j f14610f;

    /* renamed from: g, reason: collision with root package name */
    int f14611g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f14610f = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f14609e = obj;
        this.f14611g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f14610f.a(this);
    }
}
