package Kc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.InstantLoginRepository", f = "InstantLoginRepository.kt", l = {52, 54}, m = "auth")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    p f15823d;

    /* renamed from: e, reason: collision with root package name */
    String f15824e;

    /* renamed from: f, reason: collision with root package name */
    String f15825f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f15826g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ p f15827h;

    /* renamed from: i, reason: collision with root package name */
    int f15828i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15827h = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15826g = obj;
        this.f15828i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f15827h.a(null, this);
    }
}
