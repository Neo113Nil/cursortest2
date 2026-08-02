package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.platform.P1 f1415a;

    /* renamed from: b, reason: collision with root package name */
    public M0 f1416b;

    /* renamed from: c, reason: collision with root package name */
    public j1.i f1417c;

    public K0(androidx.compose.ui.platform.P1 p12) {
        this.f1415a = p12;
    }

    @NotNull
    public final M0 a() {
        M0 m02 = this.f1416b;
        if (m02 != null) {
            return m02;
        }
        Intrinsics.n("keyboardActions");
        throw null;
    }

    public final void b(int i11) {
        Function1<L0, Unit> function1;
        Unit unit;
        androidx.compose.ui.platform.P1 p12;
        if (i11 == 7) {
            function1 = a().b();
        } else {
            if (i11 == 2) {
                a();
            } else if (i11 == 6) {
                a();
            } else if (i11 == 5) {
                a();
            } else if (i11 == 3) {
                a();
            } else if (i11 == 4) {
                a();
            } else if (i11 != 1 && i11 != 0) {
                throw new IllegalStateException("invalid ImeAction");
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            if (i11 == 6) {
                j1.i iVar = this.f1417c;
                if (iVar != null) {
                    iVar.d(1);
                    return;
                } else {
                    Intrinsics.n("focusManager");
                    throw null;
                }
            }
            if (i11 != 5) {
                if (i11 != 7 || (p12 = this.f1415a) == null) {
                    return;
                }
                p12.hide();
                return;
            }
            j1.i iVar2 = this.f1417c;
            if (iVar2 != null) {
                iVar2.d(2);
            } else {
                Intrinsics.n("focusManager");
                throw null;
            }
        }
    }
}
