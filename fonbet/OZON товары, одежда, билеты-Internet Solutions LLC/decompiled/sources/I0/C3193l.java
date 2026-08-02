package I0;

import androidx.compose.ui.platform.c2;
import org.jetbrains.annotations.NotNull;
import x1.C10638m;

/* renamed from: I0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3193l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c2 f11555a;

    /* renamed from: b, reason: collision with root package name */
    private int f11556b;

    /* renamed from: c, reason: collision with root package name */
    private x1.x f11557c;

    public C3193l(@NotNull c2 c2Var) {
        this.f11555a = c2Var;
    }

    public final int a() {
        return this.f11556b;
    }

    public final void b(@NotNull C10638m c10638m) {
        boolean h11;
        x1.x xVar = this.f11557c;
        x1.x xVar2 = c10638m.b().get(0);
        if (xVar != null) {
            long m11 = xVar2.m() - xVar.m();
            c2 c2Var = this.f11555a;
            if (m11 < c2Var.d()) {
                h11 = C3176c0.h(c2Var, xVar, xVar2);
                if (h11) {
                    this.f11556b++;
                    this.f11557c = xVar2;
                }
            }
        }
        this.f11556b = 1;
        this.f11557c = xVar2;
    }
}
