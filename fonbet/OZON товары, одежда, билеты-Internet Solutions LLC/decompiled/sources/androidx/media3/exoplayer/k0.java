package androidx.media3.exoplayer;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;

/* loaded from: classes.dex */
public interface k0 {

    public interface a {
    }

    static int g(int i11, int i12, int i13, int i14) {
        return i11 | i12 | i13 | UserVerificationMethods.USER_VERIFY_PATTERN | i14;
    }

    static boolean r(int i11, boolean z11) {
        int i12 = i11 & 7;
        if (i12 != 4) {
            return z11 && i12 == 3;
        }
        return true;
    }

    int B() throws C5449k;

    int e(C7272n c7272n) throws C5449k;

    String getName();
}
