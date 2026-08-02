package X0;

import F6.p;
import a.AbstractC0603a;
import android.app.Activity;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import n.ExecutorC1441a;

/* loaded from: classes.dex */
public final class k extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7451a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f7453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f7454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, Activity activity, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f7453c = bVar;
        this.f7454d = activity;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        k kVar = new k(this.f7453c, this.f7454d, interfaceC1287d);
        kVar.f7452b = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((p) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f7451a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            p pVar = (p) this.f7452b;
            i iVar = new i(pVar, 0);
            b bVar = this.f7453c;
            ((Y0.a) bVar.f7432b).a(this.f7454d, new ExecutorC1441a(1), iVar);
            j jVar = new j(0, bVar, iVar);
            this.f7451a = 1;
            if (F6.i.b(pVar, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return C1116i.f13008a;
    }
}
