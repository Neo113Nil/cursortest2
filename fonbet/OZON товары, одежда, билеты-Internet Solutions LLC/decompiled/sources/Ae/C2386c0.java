package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
/* renamed from: Ae.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2386c0<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.M f960d;

    /* renamed from: e, reason: collision with root package name */
    C2382a0 f961e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f962f;

    /* renamed from: g, reason: collision with root package name */
    int f963g;

    C2386c0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f962f = obj;
        this.f963g |= LinearLayoutManager.INVALID_OFFSET;
        return C2399j.u(null, this);
    }
}
