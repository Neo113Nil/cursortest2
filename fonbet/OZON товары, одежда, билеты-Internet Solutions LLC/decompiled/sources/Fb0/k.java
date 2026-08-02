package Fb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt", f = "OzonIdInitializer.kt", l = {159}, m = "clearAllSso2Cookies")
/* loaded from: classes7.dex */
final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    long f9272d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f9273e;

    /* renamed from: f, reason: collision with root package name */
    int f9274f;

    k() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object g10;
        this.f9273e = obj;
        this.f9274f |= LinearLayoutManager.INVALID_OFFSET;
        g10 = o.g(null, this);
        return g10;
    }
}
