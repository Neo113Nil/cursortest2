package M7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* loaded from: classes9.dex */
final class r extends n {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f17523b;

    r(w wVar) {
        this.f17523b = wVar;
    }

    @Override // M7.n
    public final void b() {
        IInterface iInterface;
        m mVar;
        Context context;
        ServiceConnection serviceConnection;
        w wVar = this.f17523b;
        iInterface = wVar.f17541m;
        if (iInterface != null) {
            mVar = wVar.f17530b;
            mVar.d("Unbind from service.", new Object[0]);
            context = wVar.f17529a;
            serviceConnection = wVar.f17540l;
            context.unbindService(serviceConnection);
            wVar.f17535g = false;
            wVar.f17541m = null;
            wVar.f17540l = null;
        }
        wVar.s();
    }
}
