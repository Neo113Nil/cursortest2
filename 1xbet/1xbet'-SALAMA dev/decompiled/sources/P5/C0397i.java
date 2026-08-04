package P5;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: P5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0397i extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397i(List list, p065i6.d dVar) {
        super(2, dVar);
        this.f5655b = list;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        C0397i c0397i = new C0397i(this.f5655b, dVar);
        c0397i.f5654a = obj;
        return c0397i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C0397i c0397i = (C0397i) create((p030e0.b) obj, (p065i6.d) obj2);
        p044f6.i iVar = p044f6.i.f13014a;
        c0397i.invokeSuspend(iVar);
        return iVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        p003a.a.p0(obj);
        p030e0.b bVar = (p030e0.b) this.f5654a;
        List<String> list = this.f5655b;
        if (list != null) {
            for (String str : list) {
                t6.h.e(str, "name");
                p030e0.e eVar = new p030e0.e(str);
                bVar.b();
                bVar.f12502a.remove(eVar);
            }
        } else {
            bVar.b();
            bVar.f12502a.clear();
        }
        return p044f6.i.f13014a;
    }
}
