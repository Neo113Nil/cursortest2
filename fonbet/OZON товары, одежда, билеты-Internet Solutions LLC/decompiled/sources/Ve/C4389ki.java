package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* renamed from: Ve.ki, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4389ki implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31446b;

    public /* synthetic */ C4389ki(Object obj, int i11) {
        this.f31445a = i11;
        this.f31446b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Zl zl2;
        int i11;
        switch (this.f31445a) {
            case 0:
                ((Mq) this.f31446b).setCancelable(((Boolean) obj).booleanValue());
                return Unit.f71690a;
            default:
                if (dVar instanceof Zl) {
                    zl2 = (Zl) dVar;
                    int i12 = zl2.f30610e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        zl2.f30610e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = zl2.f30609d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = zl2.f30610e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            AbstractC4245fi abstractC4245fi = ((Fh) obj).f29004a;
                            zl2.f30610e = 1;
                            if (((InterfaceC2397i) this.f31446b).emit(abstractC4245fi, zl2) == aVar) {
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
                zl2 = new Zl(this, dVar);
                Object obj22 = zl2.f30609d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = zl2.f30610e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
        }
    }
}
