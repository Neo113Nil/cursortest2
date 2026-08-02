package Fb0;

import Kb0.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt", f = "OzonIdInitializer.kt", l = {126}, m = "initCookies")
/* loaded from: classes7.dex */
final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    K f9278d;

    /* renamed from: e, reason: collision with root package name */
    long f9279e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f9280f;

    /* renamed from: g, reason: collision with root package name */
    int f9281g;

    m() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object k11;
        this.f9280f = obj;
        this.f9281g |= LinearLayoutManager.INVALID_OFFSET;
        k11 = o.k(null, this);
        return k11;
    }
}
