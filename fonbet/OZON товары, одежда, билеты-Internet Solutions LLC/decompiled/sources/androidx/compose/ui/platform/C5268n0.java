package androidx.compose.ui.platform;

import android.view.ActionMode;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5268n0 implements S1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40944a;

    /* renamed from: b, reason: collision with root package name */
    private ActionMode f40945b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final F1.c f40946c = new F1.c(new C5265m0(this));

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private U1 f40947d = U1.Hidden;

    public C5268n0(@NotNull AndroidComposeView androidComposeView) {
        this.f40944a = androidComposeView;
    }

    @Override // androidx.compose.ui.platform.S1
    public final void a(@NotNull C7460f c7460f, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        F1.c cVar = this.f40946c;
        cVar.l(c7460f);
        cVar.h(function0);
        cVar.i(function03);
        cVar.j(function02);
        cVar.k(function04);
        ActionMode actionMode = this.f40945b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.f40947d = U1.Shown;
        this.f40945b = T1.f40739a.b(this.f40944a, new F1.a(cVar), 1);
    }

    @Override // androidx.compose.ui.platform.S1
    @NotNull
    public final U1 getStatus() {
        return this.f40947d;
    }

    @Override // androidx.compose.ui.platform.S1
    public final void hide() {
        this.f40947d = U1.Hidden;
        ActionMode actionMode = this.f40945b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f40945b = null;
    }
}
