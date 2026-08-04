package p033e3;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;

/* JADX INFO: loaded from: classes.dex */
public final class e extends zbb implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f12669b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i7) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f12668a = i7;
        this.f12669b = fVar;
    }

    @Override // p033e3.i
    public void J(Status status) {
        switch (this.f12668a) {
            case 1:
                this.f12669b.setResult(status);
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

    @Override // p033e3.i
    public void zbc(Status status) {
        switch (this.f12668a) {
            case 0:
                this.f12669b.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
