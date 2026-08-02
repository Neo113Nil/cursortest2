package L;

import D6.C0130m;
import a.AbstractC0603a;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C0130m f4181a;

    public e(C0130m c0130m) {
        super(false);
        this.f4181a = c0130m;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f4181a.resumeWith(AbstractC0603a.h(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f4181a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
