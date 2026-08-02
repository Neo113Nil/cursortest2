package kotlinx.coroutines.channels;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements Function2<Long, l<Object>, l<Object>> {
    public static final e a = new e(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final l<Object> invoke(Long l, l<Object> lVar) {
        long longValue = l.longValue();
        l<Object> lVar2 = lVar;
        l<Object> lVar3 = f.a;
        b<Object> bVar = lVar2.e;
        Intrinsics.checkNotNull(bVar);
        return new l<>(longValue, lVar2, bVar, 0);
    }
}
