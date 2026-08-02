package R2;

import Sc.C4001c;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: R2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3916j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, T t2, kotlin.coroutines.jvm.internal.c cVar) {
        C3914h c3914h;
        int i11;
        List list2;
        kotlin.jvm.internal.M m11;
        Iterator it;
        Throwable th2;
        if (cVar instanceof C3914h) {
            c3914h = (C3914h) cVar;
            int i12 = c3914h.f24369g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c3914h.f24369g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c3914h.f24368f;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c3914h.f24369g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ArrayList arrayList = new ArrayList();
                    Function2 c3915i = new C3915i(list, arrayList, null);
                    c3914h.f24366d = arrayList;
                    c3914h.f24369g = 1;
                    if (t2.a(c3915i, c3914h) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c3914h.f24367e;
                        m11 = (kotlin.jvm.internal.M) c3914h.f24366d;
                        try {
                            Sc.s.b(obj);
                        } catch (Throwable th3) {
                            T t11 = m11.f71787a;
                            if (t11 == 0) {
                                m11.f71787a = th3;
                            } else {
                                C4001c.a((Throwable) t11, th3);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            c3914h.f24366d = m11;
                            c3914h.f24367e = it;
                            c3914h.f24369g = 2;
                            if (function1.invoke(c3914h) == obj2) {
                                return obj2;
                            }
                        }
                        th2 = (Throwable) m11.f71787a;
                        if (th2 == null) {
                            return Unit.f71690a;
                        }
                        throw th2;
                    }
                    list2 = (List) c3914h.f24366d;
                    Sc.s.b(obj);
                }
                m11 = new kotlin.jvm.internal.M();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th2 = (Throwable) m11.f71787a;
                if (th2 == null) {
                }
            }
        }
        c3914h = new C3914h(cVar);
        Object obj3 = c3914h.f24368f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3914h.f24369g;
        if (i11 != 0) {
        }
        m11 = new kotlin.jvm.internal.M();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th2 = (Throwable) m11.f71787a;
        if (th2 == null) {
        }
    }
}
