package Ae;

import Be.C2629a;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
final /* synthetic */ class T {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a a(InterfaceC2397i interfaceC2397i, Object obj, Object obj2, kotlin.coroutines.jvm.internal.c cVar) {
        M m11;
        int i11;
        if (cVar instanceof M) {
            m11 = (M) cVar;
            int i12 = m11.f853f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                m11.f853f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj3 = m11.f852e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = m11.f853f;
                if (i11 != 0) {
                    Sc.s.b(obj3);
                    m11.f851d = obj2;
                    m11.f853f = 1;
                    if (interfaceC2397i.emit(obj, m11) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = m11.f851d;
                    Sc.s.b(obj3);
                }
                throw new C2629a(obj2);
            }
        }
        m11 = new M(cVar);
        Object obj32 = m11.f852e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = m11.f853f;
        if (i11 != 0) {
        }
        throw new C2629a(obj2);
    }
}
