package F2;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends p105o3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2648a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y0(String str, int i7) {
        super(str);
        this.f2648a = i7;
    }

    @Override // p105o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        switch (this.f2648a) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface instanceof C0240l0 ? (C0240l0) iInterfaceQueryLocalInterface : new C0240l0(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface2 instanceof J ? (J) iInterfaceQueryLocalInterface2 : new J(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface3 instanceof W ? (W) iInterfaceQueryLocalInterface3 : new W(iBinder);
        }
    }
}
