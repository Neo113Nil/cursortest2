package K7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* loaded from: classes9.dex */
final class m extends i {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f15307b;

    m(r rVar) {
        this.f15307b = rVar;
    }

    @Override // K7.i
    public final void a() {
        IInterface iInterface;
        h hVar;
        Context context;
        ServiceConnection serviceConnection;
        r rVar = this.f15307b;
        iInterface = rVar.f15325m;
        if (iInterface != null) {
            hVar = rVar.f15314b;
            hVar.d("Unbind from service.", new Object[0]);
            context = rVar.f15313a;
            serviceConnection = rVar.f15324l;
            context.unbindService(serviceConnection);
            rVar.f15319g = false;
            rVar.f15325m = null;
            rVar.f15324l = null;
        }
        rVar.s();
    }
}
