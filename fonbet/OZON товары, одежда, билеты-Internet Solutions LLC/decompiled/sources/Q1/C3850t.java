package Q1;

import Sc.InterfaceC3999a;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* renamed from: Q1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3850t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f22916a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f22917b = Sc.k.a(Sc.n.NONE, new C3849s(this));

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.core.view.I f22918c;

    public C3850t(@NotNull AndroidComposeView androidComposeView) {
        this.f22916a = androidComposeView;
        this.f22918c = new androidx.core.view.I(androidComposeView);
    }

    public final void b() {
        this.f22918c.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final boolean c() {
        return ((InputMethodManager) this.f22917b.getValue()).isActive(this.f22916a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void d() {
        ((InputMethodManager) this.f22917b.getValue()).restartInput(this.f22916a);
    }

    public final void e() {
        this.f22918c.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void f(@NotNull CursorAnchorInfo cursorAnchorInfo) {
        ((InputMethodManager) this.f22917b.getValue()).updateCursorAnchorInfo(this.f22916a, cursorAnchorInfo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void g(int i11, @NotNull ExtractedText extractedText) {
        ((InputMethodManager) this.f22917b.getValue()).updateExtractedText(this.f22916a, i11, extractedText);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void h(int i11, int i12, int i13, int i14) {
        ((InputMethodManager) this.f22917b.getValue()).updateSelection(this.f22916a, i11, i12, i13, i14);
    }
}
