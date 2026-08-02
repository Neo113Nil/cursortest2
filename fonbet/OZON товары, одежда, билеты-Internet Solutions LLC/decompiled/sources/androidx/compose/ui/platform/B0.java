package androidx.compose.ui.platform;

import androidx.compose.ui.platform.E0;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {239}, m = "startInputMethod")
/* loaded from: classes8.dex */
final class B0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f40607d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E0.a f40608e;

    /* renamed from: f, reason: collision with root package name */
    int f40609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B0(E0.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f40608e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40607d = obj;
        this.f40609f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f40608e.a(null, this);
    }
}
