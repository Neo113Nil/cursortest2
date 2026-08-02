package kotlinx.coroutines.sync;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class g extends FunctionReferenceImpl implements Function2<Long, j, j> {
    public static final g a = new g(2, i.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final j invoke(Long l, j jVar) {
        int i = i.a;
        return new j(l.longValue(), jVar, 0);
    }
}
