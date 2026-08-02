package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.j3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4345j3 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31339d = 0;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31340e;

    public /* synthetic */ C4345j3(int i11, kotlin.coroutines.d dVar) {
        super(i11, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31339d) {
            case 0:
                C4345j3 c4345j3 = new C4345j3(2, dVar);
                c4345j3.f31340e = obj;
                return c4345j3;
            default:
                return new C4345j3((Yc) this.f31340e, dVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31339d) {
            case 0:
                C4345j3 c4345j3 = new C4345j3(2, (kotlin.coroutines.d) obj2);
                c4345j3.f31340e = (Fh) obj;
                return c4345j3.invokeSuspend(Unit.f71690a);
            default:
                return new C4345j3((Yc) this.f31340e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11 = true;
        switch (this.f31339d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                AbstractC4245fi abstractC4245fi = ((Fh) this.f31340e).f29004a;
                if ((abstractC4245fi instanceof N8) || ((abstractC4245fi instanceof Bq) && (((Bq) abstractC4245fi).f28729a instanceof C4351j9))) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                ((Yc) this.f31340e).a(true);
                return Unit.f71690a;
        }
    }

    public C4345j3() {
        super(2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4345j3(Yc yc2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31340e = yc2;
    }
}
