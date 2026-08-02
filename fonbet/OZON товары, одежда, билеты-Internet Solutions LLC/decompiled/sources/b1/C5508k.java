package b1;

import C.C2702w;
import S0.M;
import S0.N;
import b1.C5506i;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: b1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5508k extends AbstractC7737t implements Function1<N, M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5506i f55451b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f55452c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5506i.c f55453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5508k(C5506i.c cVar, C5506i c5506i, Object obj) {
        super(1);
        this.f55451b = c5506i;
        this.f55452c = obj;
        this.f55453d = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N n11) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        C5506i c5506i = this.f55451b;
        linkedHashMap = c5506i.f55440b;
        Object obj = this.f55452c;
        if (linkedHashMap.containsKey(obj)) {
            throw new IllegalArgumentException(C2702w.c(obj, "Key ", " was used multiple times ").toString());
        }
        c5506i.f55439a.remove(obj);
        linkedHashMap2 = c5506i.f55440b;
        C5506i.c cVar = this.f55453d;
        linkedHashMap2.put(obj, cVar);
        return new C5507j(cVar, c5506i, obj);
    }
}
