package L;

import D6.C0130m;
import android.os.OutcomeReceiver;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0130m f4181a;

    public e(C0130m c0130m) {
        super(false);
        this.f4181a = c0130m;
    }

    public final void onError(Throwable th) throws IllegalAccessException, InvocationTargetException {
        if (compareAndSet(false, true)) {
            this.f4181a.resumeWith(p003a.a.h(th));
        }
    }

    public final void onResult(Object obj) throws IllegalAccessException, InvocationTargetException {
        if (compareAndSet(false, true)) {
            this.f4181a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
