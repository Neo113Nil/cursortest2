package I1;

import android.view.KeyEvent;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.i2;
import x0.C1248a;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f682a;

    /* renamed from: b, reason: collision with root package name */
    public Object f683b;

    public x(boolean z3, Float f) {
        this.f682a = z3;
        this.f683b = f;
    }

    public void a(boolean z3) {
        if (this.f682a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f682a = true;
        y yVar = (y) this.f683b;
        int i3 = yVar.f685b - 1;
        yVar.f685b = i3;
        boolean z4 = z3 | yVar.f684a;
        yVar.f684a = z4;
        if (i3 != 0 || z4) {
            return;
        }
        ((A0.j) yVar.f687d).J((KeyEvent) yVar.f686c);
    }

    public void b(i2 i2Var) {
        if (this.f682a) {
            AbstractC0213o0.g("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((A0.j) this.f683b).N(new C1248a(i2Var));
        } catch (Throwable unused) {
            AbstractC0213o0.g("BillingLogger", "logging failed.");
        }
    }
}
