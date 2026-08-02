package A0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class P0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f373a;

    public /* synthetic */ P0(Object obj) {
        this.f373a = obj;
    }

    public void a() {
        i4.e eVar = (i4.e) this.f373a;
        synchronized (Z.l.f6208c) {
            try {
                List list = (List) Z.l.f6212h;
                kotlin.jvm.internal.l.f("<this>", list);
                ArrayList arrayList = new ArrayList(X3.o.S(list, 10));
                boolean z3 = false;
                for (Object obj : list) {
                    boolean z5 = true;
                    if (!z3 && kotlin.jvm.internal.l.a(obj, eVar)) {
                        z3 = true;
                        z5 = false;
                    }
                    if (z5) {
                        arrayList.add(obj);
                    }
                }
                Z.l.f6212h = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
