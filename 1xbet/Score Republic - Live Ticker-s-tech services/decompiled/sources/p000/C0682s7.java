package p000;

import android.app.Application;
import com.bumptech.glide.ComponentCallbacks2C0106a;

/* JADX INFO: renamed from: s7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0682s7 implements ly0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7045a;

    /* JADX INFO: renamed from: b */
    public final Object f7046b;

    public C0682s7(x80 x80Var, C0105co c0105co) {
        this.f7045a = 1;
        this.f7046b = c0105co;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f7045a;
        Object obj = this.f7046b;
        switch (i) {
            case 0:
                Application application = (Application) ((nu1) obj).f5551k;
                af0.m188b(application);
                return application;
            case 1:
                Application application2 = (Application) ((C0105co) obj).get();
                n11 n11VarM989b = ComponentCallbacks2C0106a.m983a(application2).f1311n.m989b(application2);
                af0.m188b(n11VarM989b);
                return n11VarM989b;
            default:
                x00 x00Var = (x00) ((b90) obj).f793k;
                af0.m188b(x00Var);
                return x00Var;
        }
    }

    public /* synthetic */ C0682s7(int i, Object obj) {
        this.f7045a = i;
        this.f7046b = obj;
    }
}
