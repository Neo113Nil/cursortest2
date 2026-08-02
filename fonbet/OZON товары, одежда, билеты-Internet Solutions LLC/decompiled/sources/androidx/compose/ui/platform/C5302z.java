package androidx.compose.ui.platform;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2247, 2280}, m = "boundsUpdatesEventLoop$ui_release")
/* renamed from: androidx.compose.ui.platform.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5302z extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C5299y f41106d;

    /* renamed from: e, reason: collision with root package name */
    androidx.collection.D f41107e;

    /* renamed from: f, reason: collision with root package name */
    ze.j f41108f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f41109g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C5299y f41110h;

    /* renamed from: i, reason: collision with root package name */
    int f41111i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5302z(C5299y c5299y, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f41110h = c5299y;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41109g = obj;
        this.f41111i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f41110h.y(this);
    }
}
