package Fb0;

import Kb0.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt", f = "OzonIdInitializer.kt", l = {147}, m = "setRequiredCookies")
/* loaded from: classes7.dex */
final class q extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    K f9309d;

    /* renamed from: e, reason: collision with root package name */
    e f9310e;

    /* renamed from: f, reason: collision with root package name */
    Tc.j f9311f;

    /* renamed from: g, reason: collision with root package name */
    long f9312g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f9313h;

    /* renamed from: i, reason: collision with root package name */
    int f9314i;

    q() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f9313h = obj;
        this.f9314i |= LinearLayoutManager.INVALID_OFFSET;
        return o.f(null, this);
    }
}
