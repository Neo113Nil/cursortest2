package P1;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
/* renamed from: P1.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3800g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C3804k f21549d;

    /* renamed from: e, reason: collision with root package name */
    List f21550e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC3808o f21551f;

    /* renamed from: g, reason: collision with root package name */
    int f21552g;

    /* renamed from: h, reason: collision with root package name */
    int f21553h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f21554i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C3804k f21555j;

    /* renamed from: k, reason: collision with root package name */
    int f21556k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3800g(C3804k c3804k, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f21555j = c3804k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f21554i = obj;
        this.f21556k |= LinearLayoutManager.INVALID_OFFSET;
        return this.f21555j.m(this);
    }
}
