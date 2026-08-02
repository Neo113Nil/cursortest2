package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class I4 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29213b;

    public /* synthetic */ I4(Object obj, int i11) {
        this.f29212a = i11;
        this.f29213b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4174d4 c4174d4;
        int i11;
        switch (this.f29212a) {
            case 0:
                if (dVar instanceof C4174d4) {
                    c4174d4 = (C4174d4) dVar;
                    int i12 = c4174d4.f30849e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c4174d4.f30849e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c4174d4.f30848d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c4174d4.f30849e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            AbstractC4245fi abstractC4245fi = ((Fh) obj).f29004a;
                            Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.Loading");
                            c4174d4.f30849e = 1;
                            if (((InterfaceC2397i) this.f29213b).emit((Bq) abstractC4245fi, c4174d4) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c4174d4 = new C4174d4(this, dVar);
                Object obj22 = c4174d4.f30848d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4174d4.f30849e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            case 1:
                String str = (String) obj;
                X4.a aVar3 = ((C4817zg) this.f29213b).f28693b;
                if (aVar3 == null) {
                    throw M7.f29463a;
                }
                ((Z4) aVar3).f30562c.setText(str);
                return Unit.f71690a;
            default:
                List list = (List) obj;
                Dm dm = ((J4) this.f29213b).f29266e;
                if (dm != null) {
                    dm.f(list);
                    return Unit.f71690a;
                }
                Intrinsics.n("helpersAdapter");
                throw null;
        }
    }
}
