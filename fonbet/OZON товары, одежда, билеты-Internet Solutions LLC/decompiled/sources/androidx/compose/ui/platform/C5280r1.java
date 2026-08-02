package androidx.compose.ui.platform;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {143}, m = "establishTextInputSession")
/* renamed from: androidx.compose.ui.platform.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5280r1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f41007d;

    /* renamed from: e, reason: collision with root package name */
    int f41008e;

    C5280r1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41007d = obj;
        this.f41008e |= LinearLayoutManager.INVALID_OFFSET;
        return C5278q1.b(null, null, this);
    }
}
