package p000;

import android.p001os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ym */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0919ym extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: j */
    public final C0136df f9389j;

    public C0919ym(C0136df c0136df) {
        super(false);
        this.f9389j = c0136df;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f9389j.mo476f(wo1.m5380e(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f9389j.mo476f(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
