package androidx.compose.foundation;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {119}, m = "emitExit")
/* loaded from: classes8.dex */
final class r extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f39729d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f39730e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ s f39731f;

    /* renamed from: g, reason: collision with root package name */
    int f39732g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f39731f = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39730e = obj;
        this.f39732g |= LinearLayoutManager.INVALID_OFFSET;
        return s.J1(this.f39731f, this);
    }
}
