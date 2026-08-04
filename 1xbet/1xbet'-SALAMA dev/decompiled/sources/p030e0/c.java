package p030e0;

import j6.a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f12506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, d dVar) {
        super(2, dVar);
        this.f12506c = (i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        c cVar = new c(this.f12506c, dVar);
        cVar.f12505b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.f12504a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            b bVar = (b) this.f12505b;
            this.f12504a = 1;
            obj = this.f12506c.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        b bVar2 = (b) obj;
        h.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f12503b.f17777a).set(true);
        return bVar2;
    }
}
