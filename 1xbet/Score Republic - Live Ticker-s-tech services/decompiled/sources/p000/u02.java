package p000;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u02 implements Callable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7639j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ z72 f7640k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Bundle f7641l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ b12 f7642m;

    public /* synthetic */ u02(b12 b12Var, z72 z72Var, Bundle bundle, int i) {
        this.f7639j = i;
        this.f7640k = z72Var;
        this.f7641l = bundle;
        this.f7642m = b12Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.f7639j;
        Bundle bundle = this.f7641l;
        z72 z72Var = this.f7640k;
        b12 b12Var = this.f7642m;
        switch (i) {
            case 0:
                b12Var.f681b.m5550W();
                break;
            default:
                b12Var.f681b.m5550W();
                break;
        }
        return b12Var.f681b.m5559e0(bundle, z72Var);
    }
}
