package P;

import android.view.KeyEvent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316a;

    /* renamed from: b, reason: collision with root package name */
    public Object f317b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f318c;

    /* renamed from: d, reason: collision with root package name */
    public int f319d;

    /* renamed from: e, reason: collision with root package name */
    public Object f320e;

    public /* synthetic */ i() {
        this.f316a = 0;
    }

    public i a() {
        if (((h) this.f320e) != null) {
            return new i(this, (N.d[]) this.f317b, this.f318c, this.f319d);
        }
        throw new IllegalArgumentException("execute parameter required");
    }

    public String toString() {
        switch (this.f316a) {
            case 2:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f319d >= 0) {
                    sb.append(" #");
                    sb.append(this.f319d);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public i(i iVar, N.d[] dVarArr, boolean z2, int i2) {
        this.f316a = 1;
        this.f320e = iVar;
        this.f317b = dVarArr;
        boolean z3 = false;
        if (dVarArr != null && z2) {
            z3 = true;
        }
        this.f318c = z3;
        this.f319d = i2;
    }

    public i(C0.b bVar) {
        this.f316a = 2;
        bVar.getClass();
        this.f320e = new ArrayList();
        this.f319d = -1;
        this.f317b = bVar;
    }

    public i(C0.b bVar, KeyEvent keyEvent) {
        this.f316a = 3;
        this.f317b = bVar;
        this.f319d = ((s0.u[]) bVar.f54b).length;
        this.f318c = false;
        this.f320e = keyEvent;
    }
}
