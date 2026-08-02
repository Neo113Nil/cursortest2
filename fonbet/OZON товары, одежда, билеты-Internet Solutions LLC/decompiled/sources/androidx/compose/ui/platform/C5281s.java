package androidx.compose.ui.platform;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {592}, m = "textInputSession")
/* renamed from: androidx.compose.ui.platform.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5281s extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f41011d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f41012e;

    /* renamed from: f, reason: collision with root package name */
    int f41013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5281s(AndroidComposeView androidComposeView, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f41012e = androidComposeView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41011d = obj;
        this.f41013f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f41012e.w(null, this);
    }
}
