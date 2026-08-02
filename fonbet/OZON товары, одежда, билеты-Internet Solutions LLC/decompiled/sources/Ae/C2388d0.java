package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
/* renamed from: Ae.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2388d0<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Function2 f967d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.M f968e;

    /* renamed from: f, reason: collision with root package name */
    C2384b0 f969f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f970g;

    /* renamed from: h, reason: collision with root package name */
    int f971h;

    C2388d0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f970g = obj;
        this.f971h |= LinearLayoutManager.INVALID_OFFSET;
        return C2399j.v(null, null, this);
    }
}
