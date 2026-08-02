package p000;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: xq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0886xq implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9026j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f9027k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f9028l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f9029m;

    public /* synthetic */ RunnableC0886xq(C0035ar c0035ar, C0648ra c0648ra, dd0 dd0Var, C0869x9 c0869x9) {
        this.f9026j = 0;
        this.f9027k = c0035ar;
        this.f9028l = c0648ra;
        this.f9029m = c0869x9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9026j) {
            case 0:
                C0035ar c0035ar = (C0035ar) this.f9027k;
                C0648ra c0648ra = (C0648ra) this.f9028l;
                String str = c0648ra.f6760a;
                C0869x9 c0869x9 = (C0869x9) this.f9029m;
                c0035ar.getClass();
                Logger logger = C0035ar.f607f;
                try {
                    me1 me1VarM3727a = c0035ar.f610c.m3727a(str);
                    if (me1VarM3727a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        c0035ar.f612e.m1984m(new C0923yq(c0035ar, c0648ra, ((C0542of) me1VarM3727a).m3686a(c0869x9), 0));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f9027k;
                View view = (View) this.f9028l;
                C0184er c0184er = (C0184er) this.f9029m;
                viewGroup.getClass();
                viewGroup.endViewTransition(view);
                ((i91) c0184er.f2168c.f7192j).m2578c(c0184er);
                return;
            case 2:
                C0181eo c0181eo = (C0181eo) this.f9027k;
                d71 d71Var = (d71) this.f9028l;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f9029m;
                try {
                    h40 h40VarM3866k = p80.m3866k(c0181eo.f2151k);
                    if (h40VarM3866k == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    g40 g40Var = (g40) h40VarM3866k.f3043a;
                    synchronized (g40Var.f2604m) {
                        g40Var.f2606o = threadPoolExecutor;
                        break;
                    }
                    h40VarM3866k.f3043a.mo1479d(new C0632qv(d71Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    d71Var.mo1121j(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f9027k;
                Intent intent = (Intent) this.f9028l;
                qc1 qc1Var = (qc1) this.f9029m;
                try {
                    firebaseMessagingService.m1016b(intent);
                    return;
                } finally {
                    qc1Var.m4061b(null);
                }
        }
    }

    public /* synthetic */ RunnableC0886xq(Object obj, Object obj2, Object obj3, int i) {
        this.f9026j = i;
        this.f9027k = obj;
        this.f9028l = obj2;
        this.f9029m = obj3;
    }
}
