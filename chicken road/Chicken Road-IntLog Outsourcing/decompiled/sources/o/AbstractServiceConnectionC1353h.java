package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.AbstractBinderC0258c;
import b.C0257b;
import b.InterfaceC0259d;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC1353h implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC1347b abstractC1347b);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0259d interfaceC0259d;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i2 = AbstractBinderC0258c.f4759a;
        if (iBinder == null) {
            interfaceC0259d = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0259d.f4760c);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0259d)) {
                C0257b c0257b = new C0257b();
                c0257b.f4758a = iBinder;
                interfaceC0259d = c0257b;
            } else {
                interfaceC0259d = (InterfaceC0259d) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new C1352g(interfaceC0259d, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
