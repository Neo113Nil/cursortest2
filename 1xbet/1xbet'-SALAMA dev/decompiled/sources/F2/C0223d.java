package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbtl;

/* JADX INFO: renamed from: F2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0223d extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f2658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbok f2659c;

    public C0223d(OutOfContextTestingActivity outOfContextTestingActivity, zzbok zzbokVar) {
        this.f2658b = outOfContextTestingActivity;
        this.f2659c = zzbokVar;
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object a() {
        C0247p.b(this.f2658b, "out_of_context_tester");
        return null;
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f2658b;
        p105o3.b bVar = new p105o3.b(outOfContextTestingActivity);
        zzbby.zza(outOfContextTestingActivity);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjt)).booleanValue()) {
            return interfaceC0220b0.V(bVar, this.f2659c, 250930000);
        }
        return null;
    }

    @Override // F2.r
    public final Object c() {
        C0 c0;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f2658b;
        p105o3.b bVar = new p105o3.b(outOfContextTestingActivity);
        zzbby.zza(outOfContextTestingActivity);
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjt)).booleanValue()) {
            return null;
        }
        try {
            try {
                IBinder iBinderB = Q0.a.l0(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                if (iBinderB == null) {
                    c0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    c0 = iInterfaceQueryLocalInterface instanceof C0 ? (C0) iInterfaceQueryLocalInterface : new C0(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                }
                return c0.Z(bVar, this.f2659c);
            } catch (Exception e7) {
                throw new J2.l(e7);
            }
        } catch (J2.l e8) {
            e = e8;
            zzbtl.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        } catch (RemoteException e9) {
            e = e9;
            zzbtl.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            zzbtl.zza(outOfContextTestingActivity).zzh(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
