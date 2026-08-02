package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: p.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC1527n implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC1520g abstractC1520g);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c.d dVar;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i7 = c.c.f10158a;
        if (iBinder == null) {
            dVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(c.d.f10159m);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof c.d)) {
                c.b bVar = new c.b();
                bVar.f10157a = iBinder;
                dVar = bVar;
            } else {
                dVar = (c.d) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new C1526m(dVar, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
