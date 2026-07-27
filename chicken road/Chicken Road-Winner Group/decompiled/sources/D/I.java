package D;

import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class I {
    public static /* bridge */ /* synthetic */ boolean A(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoTdscdma;
    }

    public static /* bridge */ /* synthetic */ CellIdentityNr g(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr i(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma j(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    public static /* synthetic */ WindowInsets.Builder m() {
        return new WindowInsets.Builder();
    }

    public static /* bridge */ /* synthetic */ boolean u(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }
}
