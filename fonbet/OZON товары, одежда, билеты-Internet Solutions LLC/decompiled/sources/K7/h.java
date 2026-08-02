package K7;

import T7.Z;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f15300a;

    public h(String str) {
        this.f15300a = Cm.e.c("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat(str);
    }

    private static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e11) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e11);
                str2 = Z.a(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return G.g.c(str, " : ", str2);
    }

    public final void a(Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", f(this.f15300a, "Already connected to the service.", objArr));
        }
    }

    public final void b(Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f15300a, "Play Store app is either not installed or not the official version", objArr));
        }
    }

    public final void c(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f15300a, str, objArr), remoteException);
        }
    }

    public final void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.f15300a, str, objArr));
        }
    }

    public final void e(Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", f(this.f15300a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
    }
}
