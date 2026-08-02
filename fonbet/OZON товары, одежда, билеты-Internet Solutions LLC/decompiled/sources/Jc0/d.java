package Jc0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.InstantLoginImpl", f = "InstantLoginImpl.kt", l = {86}, m = "disable-gIAlu-s")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    c f14589d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f14590e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f14591f;

    /* renamed from: g, reason: collision with root package name */
    int f14592g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f14591f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f14590e = obj;
        this.f14592g |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = this.f14591f.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
    }
}
