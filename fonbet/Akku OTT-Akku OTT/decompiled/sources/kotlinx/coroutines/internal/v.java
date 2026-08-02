package kotlinx.coroutines.internal;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.u;

@JvmInline
/* loaded from: classes5.dex */
public final class v<S extends u<S>> {
    public static final S a(Object obj) {
        if (obj == C1084a.a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    public static final boolean b(Object obj) {
        return obj == C1084a.a;
    }
}
