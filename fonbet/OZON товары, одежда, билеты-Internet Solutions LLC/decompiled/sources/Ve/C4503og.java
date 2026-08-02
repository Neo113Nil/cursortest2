package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.og, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4503og {

    /* renamed from: a, reason: collision with root package name */
    public final In f31728a;

    public C4503og(In appTokenStoreSP) {
        Intrinsics.checkNotNullParameter(appTokenStoreSP, "appTokenStoreSP");
        this.f31728a = appTokenStoreSP;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlin.coroutines.jvm.internal.c cVar) {
        Qf qf2;
        int i11;
        C4393km c4393km;
        if (cVar instanceof Qf) {
            qf2 = (Qf) cVar;
            int i12 = qf2.f29779f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                qf2.f29779f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = qf2.f29777d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = qf2.f29779f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    qf2.f29779f = 1;
                    obj = ((C4483np) this.f31728a).b();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                c4393km = (C4393km) obj;
                if (c4393km != null) {
                    return null;
                }
                return c4393km;
            }
        }
        qf2 = new Qf(this, cVar);
        Object obj3 = qf2.f29777d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = qf2.f29779f;
        if (i11 != 0) {
        }
        c4393km = (C4393km) obj3;
        if (c4393km != null) {
        }
    }
}
