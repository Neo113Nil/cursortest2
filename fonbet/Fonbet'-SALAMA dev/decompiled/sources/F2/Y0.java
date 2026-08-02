package F2;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class Y0 extends o3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2648a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y0(String str, int i7) {
        super(str);
        this.f2648a = i7;
    }

    @Override // o3.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        switch (this.f2648a) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return queryLocalInterface instanceof C0240l0 ? (C0240l0) queryLocalInterface : new C0240l0(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return queryLocalInterface2 instanceof J ? (J) queryLocalInterface2 : new J(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return queryLocalInterface3 instanceof W ? (W) queryLocalInterface3 : new W(iBinder);
        }
    }
}
