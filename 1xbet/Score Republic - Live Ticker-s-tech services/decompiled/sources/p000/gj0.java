package p000;

import androidx.lifecycle.C0031b;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gj0 {

    /* JADX INFO: renamed from: j */
    public final b90 f2763j;

    /* JADX INFO: renamed from: k */
    public boolean f2764k;

    /* JADX INFO: renamed from: l */
    public int f2765l = -1;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0031b f2766m;

    public gj0(C0031b c0031b, b90 b90Var) {
        this.f2766m = c0031b;
        this.f2763j = b90Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m2100b(boolean z) {
        if (z == this.f2764k) {
            return;
        }
        this.f2764k = z;
        int i = z ? 1 : -1;
        C0031b c0031b = this.f2766m;
        int i2 = c0031b.f560c;
        c0031b.f560c = i + i2;
        if (!c0031b.f561d) {
            c0031b.f561d = true;
            while (true) {
                try {
                    int i3 = c0031b.f560c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    c0031b.f561d = false;
                    throw th;
                }
            }
            c0031b.f561d = false;
        }
        if (this.f2764k) {
            c0031b.m446c(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo436f();

    /* JADX INFO: renamed from: e */
    public void mo435e() {
    }
}
