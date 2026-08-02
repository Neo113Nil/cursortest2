package kotlinx.coroutines.sync;

import com.bumptech.glide.load.engine.q;
import kotlinx.coroutines.internal.x;

/* loaded from: classes5.dex */
public final class i {
    public static final int a = q.c(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final x b = new x("PERMIT");
    public static final x c = new x("TAKEN");
    public static final x d = new x("BROKEN");
    public static final x e = new x("CANCELLED");
    public static final int f = q.c(16, 12, "kotlinx.coroutines.semaphore.segmentSize");
}
