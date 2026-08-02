package Vf0;

import Sc.s;
import W2.f;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersDataSource$writeExtraHeaders$2", f = "ExtraHeadersDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f32701d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f32702e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f32703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Map<String, String> map, e eVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f32702e = map;
        this.f32703f = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        d dVar2 = new d(this.f32702e, this.f32703f, dVar);
        dVar2.f32701d = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        f.a aVar;
        f.a aVar2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        W2.b bVar = (W2.b) this.f32701d;
        ?? r02 = this.f32702e;
        boolean isEmpty = r02.isEmpty();
        e eVar = this.f32703f;
        if (isEmpty) {
            aVar2 = eVar.f32704a;
            bVar.h(aVar2);
        } else {
            ArrayList arrayList = new ArrayList(r02.size());
            for (Map.Entry entry : r02.entrySet()) {
                eVar.getClass();
                arrayList.add(entry.getKey() + "=" + entry.getValue());
            }
            Set Y02 = C7714v.Y0(arrayList);
            aVar = eVar.f32704a;
            bVar.i(aVar, Y02);
        }
        return Unit.f71690a;
    }
}
