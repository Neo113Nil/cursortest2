package Q;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public boolean f396a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f397b;

    public E(String str, boolean z2) {
        this.f397b = str;
        this.f396a = z2;
    }

    public void a(boolean z2) {
        if (this.f396a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f396a = true;
        P.i iVar = (P.i) this.f397b;
        int i2 = iVar.f319d - 1;
        iVar.f319d = i2;
        boolean z3 = z2 | iVar.f318c;
        iVar.f318c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        ((C0.b) iVar.f317b).l((KeyEvent) iVar.f320e);
    }

    public E(P.i iVar) {
        this.f397b = iVar;
        this.f396a = false;
    }
}
