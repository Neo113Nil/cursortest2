package Cd0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.inapp.push.sdk.internal.data.InAppPushRepository", f = "InAppPushRepository.kt", l = {21}, m = "receiveInAppPush-gIAlu-s")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f4800d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f4801e;

    /* renamed from: f, reason: collision with root package name */
    int f4802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f4801e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f4800d = obj;
        this.f4802f |= LinearLayoutManager.INVALID_OFFSET;
        Object d11 = this.f4801e.d(null, this);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : r.a(d11);
    }
}
