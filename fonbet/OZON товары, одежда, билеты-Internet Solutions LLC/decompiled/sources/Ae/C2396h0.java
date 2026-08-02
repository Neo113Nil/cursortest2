package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
/* renamed from: Ae.h0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2396h0<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.M f995d;

    /* renamed from: e, reason: collision with root package name */
    C2392f0 f996e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f997f;

    /* renamed from: g, reason: collision with root package name */
    int f998g;

    C2396h0(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f997f = obj;
        this.f998g |= LinearLayoutManager.INVALID_OFFSET;
        return C2399j.x(null, null, this);
    }
}
