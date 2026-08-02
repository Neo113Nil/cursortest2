package P1;

import P1.C3805l;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {398}, m = "runCached")
/* renamed from: P1.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3806m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C3805l f21580d;

    /* renamed from: e, reason: collision with root package name */
    C3805l.b f21581e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f21582f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3805l f21583g;

    /* renamed from: h, reason: collision with root package name */
    int f21584h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3806m(C3805l c3805l, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f21583g = c3805l;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f21582f = obj;
        this.f21584h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f21583g.f(null, null, null, this);
    }
}
