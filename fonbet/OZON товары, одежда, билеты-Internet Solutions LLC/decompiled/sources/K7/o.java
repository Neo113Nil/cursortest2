package K7;

import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
final class o extends i {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f15308b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f15309c;

    o(q qVar, IBinder iBinder) {
        this.f15309c = qVar;
        this.f15308b = iBinder;
    }

    @Override // K7.i
    public final void a() {
        e cVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        q qVar = this.f15309c;
        int i11 = d.f15299e;
        IBinder iBinder = this.f15308b;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            cVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new c(iBinder);
        }
        r rVar = qVar.f15311a;
        rVar.f15325m = cVar;
        r.n(rVar);
        rVar.f15319g = false;
        arrayList = rVar.f15316d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList2 = rVar.f15316d;
        arrayList2.clear();
    }
}
