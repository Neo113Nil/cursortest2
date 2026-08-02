package j1;

import G4.l;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import p4.C2268h;

/* loaded from: classes.dex */
public final class b extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: k, reason: collision with root package name */
    public final C2268h f17484k;

    public b(C2268h c2268h) {
        super(false);
        this.f17484k = c2268h;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f17484k.resumeWith(l.p(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f17484k.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
