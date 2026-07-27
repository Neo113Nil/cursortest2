package io.appmetrica.analytics.appsetid.internal;

import B0.l;
import I1.i;
import I1.o;
import U.e;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import h1.C0478a;
import h1.c;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import java.util.List;
import l1.d;
import n1.C1313Q;
import s0.k;
import x1.f;

/* loaded from: classes.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5944a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f5945b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i2) {
        appSetIdRetriever.getClass();
        return i2 != 1 ? i2 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(Context context, final AppSetIdListener appSetIdListener) {
        o q5;
        l lVar = new l(context);
        f fVar = (f) lVar.f163b;
        if (fVar.f12269j.b(fVar.f12268i, 212800000) == 0) {
            e eVar = new e();
            d[] dVarArr = {c.f5775a};
            eVar.f3053a = new k();
            q5 = fVar.b(0, new C1313Q(eVar, dVarArr, false, 27601));
        } else {
            q5 = B0.f.q(new m1.f(new Status(17, null, null, null)));
        }
        e eVar2 = new e(lVar);
        q5.getClass();
        A.c cVar = i.f1249a;
        o h3 = q5.h(cVar, eVar2);
        I1.c cVar2 = new I1.c() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // I1.c
            public void onComplete(Task task) {
                Object obj;
                List list;
                obj = AppSetIdRetriever.this.f5944a;
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.f5945b;
                    list.remove(this);
                }
                if (task.e()) {
                    appSetIdListener.onAppSetIdRetrieved(((C0478a) task.c()).f5771a, AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, ((C0478a) task.c()).f5772b));
                } else {
                    appSetIdListener.onFailure(task.b());
                }
            }
        };
        synchronized (this.f5944a) {
            this.f5945b.add(cVar2);
        }
        h3.f1264b.b(new I1.l(cVar, cVar2));
        h3.n();
    }
}
