package Qh0;

import gh0.InterfaceC6738d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class l extends AbstractC7737t implements Function1<Void, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f23469b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<i, Unit> f23470c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ jh0.c f23471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(ArrayList arrayList, Function1 function1, jh0.c cVar) {
        super(1);
        this.f23469b = arrayList;
        this.f23470c = function1;
        this.f23471d = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Void r32) {
        ArrayList arrayList = this.f23469b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC6738d.a aVar = (InterfaceC6738d.a) ((CompletableFuture) it.next()).get();
            if (aVar != null) {
                arrayList2.add(aVar);
            }
        }
        this.f23470c.invoke(new i(arrayList2, this.f23471d));
        return Unit.f71690a;
    }
}
