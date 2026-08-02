package F6;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final /* synthetic */ class c extends t6.g implements Function2 {

    /* renamed from: z, reason: collision with root package name */
    public static final c f2799z = new c(2, d.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        j jVar = (j) obj2;
        j jVar2 = d.f2800a;
        b bVar = jVar.f2823e;
        t6.h.b(bVar);
        return new j(longValue, jVar, bVar, 0);
    }
}
