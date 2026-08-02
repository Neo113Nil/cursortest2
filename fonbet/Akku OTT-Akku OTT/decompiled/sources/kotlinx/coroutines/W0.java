package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmField;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes5.dex */
public final class W0<U, T extends U> extends kotlinx.coroutines.internal.t<T> implements Runnable {

    @JvmField
    public final long e;

    public W0(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.get$context());
        this.e = j;
    }

    @Override // kotlinx.coroutines.C0
    public final String O() {
        return super.O() + "(timeMillis=" + this.e + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        U c = W.c(this.c);
        X x = c instanceof X ? (X) c : null;
        long j = this.e;
        if (x != null) {
            Duration.Companion companion = Duration.INSTANCE;
            DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
            str = x.l();
        }
        str = "Timed out waiting for " + j + " ms";
        o(new V0(str, this));
    }
}
