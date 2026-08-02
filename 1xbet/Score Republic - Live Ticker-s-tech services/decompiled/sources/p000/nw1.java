package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 extends km1 {

    /* JADX INFO: renamed from: g */
    public final IBinder f5559g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC0575pb f5560h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(AbstractC0575pb abstractC0575pb, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC0575pb, i, bundle);
        this.f5560h = abstractC0575pb;
        this.f5559g = iBinder;
    }

    @Override // p000.km1
    /* JADX INFO: renamed from: a */
    public final boolean mo3055a() {
        IBinder iBinder = this.f5559g;
        try {
            p80.m3863h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0575pb abstractC0575pb = this.f5560h;
            if (!abstractC0575pb.mo720m().equals(interfaceDescriptor)) {
                String strMo720m = abstractC0575pb.mo720m();
                StringBuilder sb = new StringBuilder(strMo720m.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strMo720m);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceMo717b = abstractC0575pb.mo717b(iBinder);
            if (iInterfaceMo717b == null || !(abstractC0575pb.m3894s(2, 4, iInterfaceMo717b) || abstractC0575pb.m3894s(3, 4, iInterfaceMo717b))) {
                return false;
            }
            abstractC0575pb.f6066u = null;
            InterfaceC0464mb interfaceC0464mb = abstractC0575pb.f6060o;
            if (interfaceC0464mb == null) {
                return true;
            }
            interfaceC0464mb.mo308d();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // p000.km1
    /* JADX INFO: renamed from: b */
    public final void mo3056b(C0253gl c0253gl) {
        InterfaceC0501nb interfaceC0501nb = this.f5560h.f6061p;
        if (interfaceC0501nb != null) {
            interfaceC0501nb.mo2852c(c0253gl);
        }
        System.currentTimeMillis();
    }
}
