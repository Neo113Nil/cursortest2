package e3;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;

/* renamed from: e3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1020e extends zbb implements InterfaceC1024i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1021f f12663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1020e(C1021f c1021f, int i7) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f12662a = i7;
        this.f12663b = c1021f;
    }

    @Override // e3.InterfaceC1024i
    public void J(Status status) {
        switch (this.f12662a) {
            case 1:
                this.f12663b.setResult((C1021f) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
                zbc.zbb(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                zbc(status);
                break;
            case 103:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                J(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // e3.InterfaceC1024i
    public void zbc(Status status) {
        switch (this.f12662a) {
            case 0:
                this.f12663b.setResult((C1021f) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
