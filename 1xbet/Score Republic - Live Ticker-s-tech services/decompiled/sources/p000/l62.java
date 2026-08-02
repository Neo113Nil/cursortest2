package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l62 implements InterfaceC0387k8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4696b;

    public /* synthetic */ l62(int i, Object obj) {
        this.f4695a = i;
        this.f4696b = obj;
    }

    @Override // p000.InterfaceC0387k8
    public final ListenableFuture apply(Object obj) throws IOException {
        int i = this.f4695a;
        Object obj2 = this.f4696b;
        switch (i) {
            case 0:
                y62 y62Var = (y62) obj2;
                int i2 = ((y32) obj).f9143j;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) && !y62Var.f9198h.m3747t()) {
                    y62Var.m5743b();
                }
                return jc0.f3900k;
            case 1:
                oq0 oq0Var = (oq0) obj2;
                oq0Var.getClass();
                h02 h02Var = new h02(oq0Var, (v72) obj);
                mq0 mq0VarM5498a = ((x22) oq0Var.f5841l).m5498a();
                ve1 ve1Var = new ve1(h02Var);
                mq0VarM5498a.execute(ve1Var);
                return ve1Var;
            case 2:
                return k70.m2994e((ListenableFuture) ((b82) obj2).f772e.get());
            case 3:
                return k70.m2993d(((q62) obj2).apply(obj));
            case 4:
                return ((a92) obj2).f100e.m5736s();
            default:
                IOException iOException = (IOException) obj2;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
