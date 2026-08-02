package Ve;

import Ae.C2406m0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class I3 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29208d;

    /* renamed from: e, reason: collision with root package name */
    public int f29209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29211g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I3(C2406m0 c2406m0, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f29208d = i11;
        this.f29210f = c2406m0;
        this.f29211g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29208d) {
            case 0:
                return new I3((C2406m0) this.f29210f, dVar, (RedirectActivity) this.f29211g, 0);
            case 1:
                return new I3((C2406m0) this.f29210f, dVar, (C4192dm) this.f29211g, 1);
            default:
                return new I3((Mq) this.f29210f, (ArrayList) this.f29211g, dVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f29208d) {
            case 0:
                return new I3((C2406m0) this.f29210f, dVar, (RedirectActivity) this.f29211g, 0).invokeSuspend(Unit.f71690a);
            case 1:
                return new I3((C2406m0) this.f29210f, dVar, (C4192dm) this.f29211g, 1).invokeSuspend(Unit.f71690a);
            default:
                return new I3((Mq) this.f29210f, (ArrayList) this.f29211g, dVar).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29208d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f29209e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C4230f3 c4230f3 = new C4230f3((RedirectActivity) this.f29211g, 0);
                    this.f29209e = 1;
                    if (((C2406m0) this.f29210f).collect(c4230f3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            case 1:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f29209e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    F5 f52 = new F5((C4192dm) this.f29211g, 2);
                    this.f29209e = 1;
                    if (((C2406m0) this.f29210f).collect(f52, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                int i13 = this.f29209e;
                Mq mq = (Mq) this.f29210f;
                try {
                    if (i13 == 0) {
                        Sc.s.b(obj);
                        Ql0.i iVar = mq.f29497f;
                        if (iVar == null) {
                            Intrinsics.n("emissionsAuth");
                            throw null;
                        }
                        ArrayList arrayList = (ArrayList) this.f29211g;
                        androidx.fragment.app.r requireActivity = mq.requireActivity();
                        Intrinsics.g(requireActivity, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
                        this.f29209e = 1;
                        obj = iVar.a(arrayList, (RedirectActivity) requireActivity, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    ((C4577r4) mq.u()).h0((InterfaceC4370k) obj);
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    String errorMessage = "showFullEmissionAuth catch error: " + th2;
                    C4577r4 c4577r4 = (C4577r4) mq.u();
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    c4577r4.h0(new Fm());
                }
                return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(Mq mq, ArrayList arrayList, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29208d = 2;
        this.f29210f = mq;
        this.f29211g = arrayList;
    }
}
