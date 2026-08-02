package E0;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2913b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f7164a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f7165b = Sc.k.a(Sc.n.NONE, new a());

    /* renamed from: E0.b0$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function0<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InputMethodManager invoke() {
            Object systemService = C2913b0.this.f7164a.getContext().getSystemService("input_method");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public C2913b0(@NotNull View view) {
        this.f7164a = view;
        new androidx.core.view.I(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    private final InputMethodManager b() {
        return (InputMethodManager) this.f7165b.getValue();
    }

    public final boolean c() {
        return b().isActive(this.f7164a);
    }

    public final void d() {
        b().restartInput(this.f7164a);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 34) {
            C2940p.f7279a.a(b(), this.f7164a);
        }
    }

    public final void f(@NotNull CursorAnchorInfo cursorAnchorInfo) {
        b().updateCursorAnchorInfo(this.f7164a, cursorAnchorInfo);
    }

    public final void g(int i11, @NotNull ExtractedText extractedText) {
        b().updateExtractedText(this.f7164a, i11, extractedText);
    }

    public final void h(int i11, int i12, int i13, int i14) {
        b().updateSelection(this.f7164a, i11, i12, i13, i14);
    }
}
