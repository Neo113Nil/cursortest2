package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.f3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4230f3 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30999b;

    public /* synthetic */ C4230f3(Object obj, int i11) {
        this.f30998a = i11;
        this.f30999b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4824zn c4824zn;
        int i11;
        switch (this.f30998a) {
            case 0:
                ((L5) obj).a(new B2((RedirectActivity) this.f30999b));
                return Unit.f71690a;
            default:
                if (dVar instanceof C4824zn) {
                    c4824zn = (C4824zn) dVar;
                    int i12 = c4824zn.f32676e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c4824zn.f32676e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c4824zn.f32675d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c4824zn.f32676e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            String str = ((Ij) obj).f29239a;
                            c4824zn.f32676e = 1;
                            if (((InterfaceC2397i) this.f30999b).emit(str, c4824zn) == aVar) {
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
                c4824zn = new C4824zn(this, dVar);
                Object obj22 = c4824zn.f32675d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4824zn.f32676e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
        }
    }
}
