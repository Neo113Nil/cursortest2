package D7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
final class s extends o {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f6121b;

    s(x xVar) {
        this.f6121b = xVar;
    }

    @Override // D7.o
    public final void a() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        n nVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        n nVar2;
        obj = this.f6121b.f6132f;
        synchronized (obj) {
            try {
                atomicInteger = this.f6121b.f6137k;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.f6121b.f6137k;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        nVar2 = this.f6121b.f6128b;
                        nVar2.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                x xVar = this.f6121b;
                iInterface = xVar.f6139m;
                if (iInterface != null) {
                    nVar = xVar.f6128b;
                    nVar.d("Unbind from service.", new Object[0]);
                    x xVar2 = this.f6121b;
                    context = xVar2.f6127a;
                    serviceConnection = xVar2.f6138l;
                    context.unbindService(serviceConnection);
                    this.f6121b.f6133g = false;
                    this.f6121b.f6139m = null;
                    this.f6121b.f6138l = null;
                }
                this.f6121b.v();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
