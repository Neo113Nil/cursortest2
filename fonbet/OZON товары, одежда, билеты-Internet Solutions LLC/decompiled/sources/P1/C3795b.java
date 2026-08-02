package P1;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {57, 58}, m = "awaitLoad")
/* renamed from: P1.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3795b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C3796c f21540d;

    /* renamed from: e, reason: collision with root package name */
    Q f21541e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f21542f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3796c f21543g;

    /* renamed from: h, reason: collision with root package name */
    int f21544h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3795b(C3796c c3796c, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f21543g = c3796c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f21542f = obj;
        this.f21544h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f21543g.a(null, this);
    }
}
