package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import okhttp3.internal.http.HttpStatusCodesKt;

/* loaded from: classes4.dex */
public abstract class p extends zbb implements q {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
                zbc.zbd(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbd(parcel);
                v(status);
                break;
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbd(parcel);
                x(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
