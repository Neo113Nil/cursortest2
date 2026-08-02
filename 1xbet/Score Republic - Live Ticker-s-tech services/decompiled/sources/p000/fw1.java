package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fw1 implements ServiceConnection {

    /* JADX INFO: renamed from: j */
    public final int f2512j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC0575pb f2513k;

    public fw1(AbstractC0575pb abstractC0575pb, int i) {
        this.f2513k = abstractC0575pb;
        this.f2512j = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        AbstractC0575pb abstractC0575pb = this.f2513k;
        if (iBinder == null) {
            synchronized (abstractC0575pb.f6052g) {
                i = abstractC0575pb.f6059n;
            }
            if (i == 3) {
                abstractC0575pb.f6067v = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            tt1 tt1Var = abstractC0575pb.f6051f;
            tt1Var.sendMessage(tt1Var.obtainMessage(i2, abstractC0575pb.f6069x.get(), 16));
            return;
        }
        synchronized (abstractC0575pb.f6053h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0575pb.f6054i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof om1)) ? new om1(iBinder) : (om1) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0575pb abstractC0575pb2 = this.f2513k;
        int i3 = this.f2512j;
        abstractC0575pb2.getClass();
        lx1 lx1Var = new lx1(abstractC0575pb2, 0, null);
        tt1 tt1Var2 = abstractC0575pb2.f6051f;
        tt1Var2.sendMessage(tt1Var2.obtainMessage(7, i3, -1, lx1Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0575pb abstractC0575pb = this.f2513k;
        synchronized (abstractC0575pb.f6053h) {
            abstractC0575pb.f6054i = null;
        }
        AbstractC0575pb abstractC0575pb2 = this.f2513k;
        int i = this.f2512j;
        tt1 tt1Var = abstractC0575pb2.f6051f;
        tt1Var.sendMessage(tt1Var.obtainMessage(6, i, 1));
    }
}
