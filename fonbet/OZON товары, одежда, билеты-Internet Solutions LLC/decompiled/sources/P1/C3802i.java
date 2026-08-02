package P1;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {304}, m = "loadWithTimeoutOrNull$ui_text_release")
/* renamed from: P1.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3802i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3808o f21560d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f21561e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3804k f21562f;

    /* renamed from: g, reason: collision with root package name */
    int f21563g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3802i(C3804k c3804k, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f21562f = c3804k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f21561e = obj;
        this.f21563g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f21562f.o(null, this);
    }
}
