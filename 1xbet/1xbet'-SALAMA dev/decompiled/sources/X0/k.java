package X0;

import F6.p;
import android.app.Activity;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f7453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f7454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, Activity activity, p065i6.d dVar) {
        super(2, dVar);
        this.f7453c = bVar;
        this.f7454d = activity;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        k kVar = new k(this.f7453c, this.f7454d, dVar);
        kVar.f7452b = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((p) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f7451a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            p pVar = (p) this.f7452b;
            i iVar = new i(pVar, 0);
            b bVar = this.f7453c;
            ((Y0.a) bVar.f7432b).a(this.f7454d, new p094n.a(1), iVar);
            j jVar = new j(0, bVar, iVar);
            this.f7451a = 1;
            if (F6.i.b(pVar, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return p044f6.i.f13014a;
    }
}
