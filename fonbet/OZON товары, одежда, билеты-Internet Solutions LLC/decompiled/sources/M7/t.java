package M7;

import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
final class t extends n {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f17524b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f17525c;

    t(v vVar, IBinder iBinder) {
        this.f17525c = vVar;
        this.f17524b = iBinder;
    }

    @Override // M7.n
    public final void b() {
        j hVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        v vVar = this.f17525c;
        int i11 = i.f17515e;
        IBinder iBinder = this.f17524b;
        if (iBinder == null) {
            hVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            hVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new h(iBinder);
        }
        w wVar = vVar.f17527a;
        wVar.f17541m = hVar;
        w.n(wVar);
        wVar.f17535g = false;
        arrayList = wVar.f17532d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList2 = wVar.f17532d;
        arrayList2.clear();
    }
}
