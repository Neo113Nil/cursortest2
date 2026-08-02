package androidx.compose.ui.platform;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {194, 196}, m = "interceptedTextInputSession")
/* renamed from: androidx.compose.ui.platform.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5283s1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f41015d;

    /* renamed from: e, reason: collision with root package name */
    int f41016e;

    C5283s1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object c11;
        this.f41015d = obj;
        this.f41016e |= LinearLayoutManager.INVALID_OFFSET;
        c11 = C5278q1.c(null, null, null, this);
        return c11;
    }
}
