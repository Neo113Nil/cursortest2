package p030e0;

import j6.a;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import p065i6.d;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p077k6.i f12513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Function2 function2, d dVar) {
        super(2, dVar);
        this.f12513c = (p077k6.i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        i iVar = new i(this.f12513c, dVar);
        iVar.f12512b = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14648a;
        int i7 = this.f12511a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f12512b;
            p003a.a.p0(obj);
            return bVar;
        }
        p003a.a.p0(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f12512b).a()), false);
        this.f12512b = bVar2;
        this.f12511a = 1;
        return this.f12513c.invoke(bVar2, this) == aVar ? aVar : bVar2;
    }
}
