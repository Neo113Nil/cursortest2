package p000;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nk1 extends Binder {

    /* JADX INFO: renamed from: b */
    public final nu1 f5452b;

    public nk1(nu1 nu1Var) {
        this.f5452b = nu1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3548a(ok1 ok1Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = ok1Var.f5779a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f5452b.f5551k;
        qc1 qc1Var = new qc1();
        firebaseMessagingService.f1396j.execute(new RunnableC0886xq(firebaseMessagingService, intent, qc1Var, 3));
        qc1Var.f6465a.m5125a(new fn0(), new C0468mf(13, ok1Var));
    }
}
