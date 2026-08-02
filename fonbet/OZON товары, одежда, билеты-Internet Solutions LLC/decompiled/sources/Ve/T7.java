package Ve;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class T7 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30026d;

    public T7() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        T7 t72 = new T7(2, dVar);
        t72.f30026d = obj;
        return t72;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        T7 t72 = new T7(2, (kotlin.coroutines.d) obj2);
        t72.f30026d = (List) obj;
        return t72.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        List list = (List) this.f30026d;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += ((C4287h2) it.next()).f31135b;
        }
        return new Long(j11);
    }
}
