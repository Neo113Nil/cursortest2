package E0;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C2947t implements InterfaceC2945s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f7304a;

    /* renamed from: b, reason: collision with root package name */
    private InputMethodManager f7305b;

    public C2947t(@NotNull View view) {
        this.f7304a = view;
        new androidx.core.view.I(view);
    }

    @Override // E0.InterfaceC2945s
    public final void a(int i11, int i12, int i13, int i14) {
        f().updateSelection(this.f7304a, i11, i12, i13, i14);
    }

    @Override // E0.InterfaceC2945s
    public final void b() {
        f().restartInput(this.f7304a);
    }

    @Override // E0.InterfaceC2945s
    public void c() {
    }

    @Override // E0.InterfaceC2945s
    public final void d(@NotNull CursorAnchorInfo cursorAnchorInfo) {
        f().updateCursorAnchorInfo(this.f7304a, cursorAnchorInfo);
    }

    @NotNull
    protected final View e() {
        return this.f7304a;
    }

    @NotNull
    protected final InputMethodManager f() {
        InputMethodManager inputMethodManager = this.f7305b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = this.f7304a.getContext().getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.f7305b = inputMethodManager2;
        return inputMethodManager2;
    }

    @Override // E0.InterfaceC2945s
    public final void sendKeyEvent(@NotNull KeyEvent keyEvent) {
        f().dispatchKeyEventFromInputMethod(e(), keyEvent);
    }
}
