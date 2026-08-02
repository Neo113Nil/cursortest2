package p000;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: mq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0479mq implements InterfaceC0436lk {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5127j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ cz0 f5128k;

    public /* synthetic */ C0479mq(cz0 cz0Var, int i) {
        this.f5127j = i;
        this.f5128k = cz0Var;
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public final Object mo532x(C0902y5 c0902y5) {
        int i = this.f5127j;
        cz0 cz0Var = this.f5128k;
        switch (i) {
            case 0:
                return new C0553oq((Context) c0902y5.mo2281a(Context.class), ((w00) c0902y5.mo2281a(w00.class)).m5225c(), c0902y5.mo2284d(cz0.m1050a(wa0.class)), c0902y5.mo2285e(C0517nr.class), (Executor) c0902y5.mo2288h(cz0Var));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(cz0Var, c0902y5);
        }
    }
}
