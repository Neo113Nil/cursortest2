package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.AbstractBinderC0498c;
import b.C0497b;
import b.InterfaceC0499d;

/* renamed from: q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC2295j implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public Context f18853a;

    public abstract void a(C2294i c2294i);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0499d interfaceC0499d;
        if (this.f18853a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = AbstractBinderC0498c.f7132k;
        if (iBinder == null) {
            interfaceC0499d = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0499d.f7133c);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0499d)) {
                C0497b c0497b = new C0497b();
                c0497b.f7131k = iBinder;
                interfaceC0499d = c0497b;
            } else {
                interfaceC0499d = (InterfaceC0499d) queryLocalInterface;
            }
        }
        a(new C2294i(interfaceC0499d, componentName));
    }
}
