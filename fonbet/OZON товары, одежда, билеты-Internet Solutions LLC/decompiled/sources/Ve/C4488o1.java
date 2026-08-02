package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;
import spay.sdk.view.BnplButtonCompositeView;
import spay.sdk.view.SpayBnplGraphCompositeView;

/* renamed from: Ve.o1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4488o1 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31696b;

    public /* synthetic */ C4488o1(Object obj, int i11) {
        this.f31695a = i11;
        this.f31696b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        J0 j02;
        int i11;
        Dh dh2;
        int i12;
        switch (this.f31695a) {
            case 0:
                if (dVar instanceof J0) {
                    j02 = (J0) dVar;
                    int i13 = j02.f29255e;
                    if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        j02.f29255e = i13 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = j02.f29254d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = j02.f29255e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            AbstractC4245fi abstractC4245fi = ((Fh) obj).f29004a;
                            j02.f29255e = 1;
                            if (((InterfaceC2397i) this.f31696b).emit(abstractC4245fi, j02) == aVar) {
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
                j02 = new J0(this, dVar);
                Object obj22 = j02.f29254d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = j02.f29255e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            case 1:
                if (dVar instanceof Dh) {
                    dh2 = (Dh) dVar;
                    int i14 = dh2.f28866e;
                    if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        dh2.f28866e = i14 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj3 = dh2.f28865d;
                        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                        i12 = dh2.f28866e;
                        if (i12 != 0) {
                            Sc.s.b(obj3);
                            if (!((List) obj).isEmpty()) {
                                dh2.f28866e = 1;
                                if (((InterfaceC2397i) this.f31696b).emit(obj, dh2) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj3);
                        }
                        return Unit.f71690a;
                    }
                }
                dh2 = new Dh(this, dVar);
                Object obj32 = dh2.f28865d;
                Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
                i12 = dh2.f28866e;
                if (i12 != 0) {
                }
                return Unit.f71690a;
            default:
                Yg yg2 = (Yg) obj;
                ButtonBnpl buttonBnpl = yg2.f30465e;
                S0 s02 = (S0) this.f31696b;
                if (buttonBnpl != null) {
                    s02.f29927c.b(buttonBnpl);
                }
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = yg2.f30463c;
                boolean d11 = Intrinsics.d(bool2, bool);
                ButtonBnpl buttonBnpl2 = yg2.f30465e;
                if (d11) {
                    if (buttonBnpl2 != null) {
                        BnplButtonCompositeView bnplButtonCompositeView = s02.f29927c;
                        String str = yg2.f30461a;
                        if (str == null) {
                            str = "";
                        }
                        bnplButtonCompositeView.a(str, buttonBnpl2);
                    }
                } else if (Intrinsics.d(bool2, Boolean.FALSE)) {
                    if (buttonBnpl2 != null) {
                        s02.f29927c.a(buttonBnpl2);
                    }
                } else if (!yg2.f30464d) {
                    s02.f29927c.a();
                    SpayBnplGraphCompositeView spaySloSbgcvGraph = s02.f29934j;
                    Intrinsics.checkNotNullExpressionValue(spaySloSbgcvGraph, "spaySloSbgcvGraph");
                    spaySloSbgcvGraph.setVisibility(8);
                }
                return Unit.f71690a;
        }
    }
}
