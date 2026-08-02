package Qj0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl", f = "TraceController.kt", l = {466}, m = "clearObsoleteEvents")
/* renamed from: Qj0.a0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3881a0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f23606d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y f23607e;

    /* renamed from: f, reason: collision with root package name */
    int f23608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3881a0(Y y11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f23607e = y11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f23606d = obj;
        this.f23608f |= LinearLayoutManager.INVALID_OFFSET;
        return Y.g(this.f23607e, this);
    }
}
