package Fb0;

import Kb0.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt", f = "OzonIdInitializer.kt", l = {59, 60}, m = "onInit")
/* loaded from: classes7.dex */
final class p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    K f9303d;

    /* renamed from: e, reason: collision with root package name */
    K f9304e;

    /* renamed from: f, reason: collision with root package name */
    long f9305f;

    /* renamed from: g, reason: collision with root package name */
    long f9306g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f9307h;

    /* renamed from: i, reason: collision with root package name */
    int f9308i;

    p() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f9307h = obj;
        this.f9308i |= LinearLayoutManager.INVALID_OFFSET;
        return o.m(null, 0L, this);
    }
}
