package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class H {
    public static final G a = new G(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference<G>[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference<G>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    @JvmStatic
    public static final void a(G segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f != null || segment.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.d) {
            return;
        }
        AtomicReference<G> atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        G g = a;
        G andSet = atomicReference.getAndSet(g);
        if (andSet == g) {
            return;
        }
        int i = andSet != null ? andSet.c : 0;
        if (i >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        segment.f = andSet;
        segment.b = 0;
        segment.c = i + 8192;
        atomicReference.set(segment);
    }

    @JvmStatic
    public static final G b() {
        AtomicReference<G> atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        G g = a;
        G andSet = atomicReference.getAndSet(g);
        if (andSet == g) {
            return new G();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new G();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
