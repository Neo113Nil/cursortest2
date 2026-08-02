package androidx.compose.ui.platform;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {229}, m = "textInputSession")
/* loaded from: classes8.dex */
final class A0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f40491d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ F0 f40492e;

    /* renamed from: f, reason: collision with root package name */
    int f40493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A0(F0 f02, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f40492e = f02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40491d = obj;
        this.f40493f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f40492e.a(null, null, this);
    }
}
