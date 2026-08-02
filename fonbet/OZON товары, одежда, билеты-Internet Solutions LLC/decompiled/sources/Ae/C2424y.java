package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
/* renamed from: Ae.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2424y<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Throwable f1165d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f1166e;

    /* renamed from: f, reason: collision with root package name */
    int f1167f;

    C2424y() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f1166e = obj;
        this.f1167f |= LinearLayoutManager.INVALID_OFFSET;
        return B.a(null, null, null, this);
    }
}
