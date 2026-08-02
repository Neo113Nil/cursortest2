package D7;

import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
final class u extends o {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f6122b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f6123c;

    u(w wVar, IBinder iBinder) {
        this.f6123c = wVar;
        this.f6122b = iBinder;
    }

    @Override // D7.o
    public final void a() {
        h fVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        w wVar = this.f6123c;
        int i11 = g.f6105e;
        IBinder iBinder = this.f6122b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new f(iBinder);
        }
        x xVar = wVar.f6125a;
        xVar.f6139m = fVar;
        x.q(xVar);
        xVar.f6133g = false;
        arrayList = xVar.f6130d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList2 = xVar.f6130d;
        arrayList2.clear();
    }
}
