package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
/* loaded from: classes.dex */
final class D<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.M f781d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f782e;

    /* renamed from: f, reason: collision with root package name */
    int f783f;

    D() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f782e = obj;
        this.f783f |= LinearLayoutManager.INVALID_OFFSET;
        return H.a(null, null, this);
    }
}
