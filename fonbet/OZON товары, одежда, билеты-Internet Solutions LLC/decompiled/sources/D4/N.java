package D4;

import B4.C2581j;
import S0.A1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;

@kotlin.coroutines.jvm.internal.e(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class N extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ D0<C2581j> f5833d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map<String, Float> f5834e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ A1<List<C2581j>> f5835f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2830e f5836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    N(D0<C2581j> d02, Map<String, Float> map, A1<? extends List<C2581j>> a12, C2830e c2830e, kotlin.coroutines.d<? super N> dVar) {
        super(2, dVar);
        this.f5833d = d02;
        this.f5834e = map;
        this.f5835f = a12;
        this.f5836g = c2830e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new N(this.f5833d, this.f5834e, this.f5835f, this.f5836g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((N) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        D0<C2581j> d02 = this.f5833d;
        if (Intrinsics.d(d02.h(), d02.n())) {
            Iterator<T> it = this.f5835f.getValue().iterator();
            while (it.hasNext()) {
                this.f5836g.n((C2581j) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Float> map = this.f5834e;
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                if (!Intrinsics.d(entry.getKey(), d02.n().e())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return Unit.f71690a;
    }
}
