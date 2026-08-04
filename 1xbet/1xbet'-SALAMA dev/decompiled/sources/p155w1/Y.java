package p155w1;

import A1.L0;
import K4.C0318e;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.api.f;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends G2 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f17604O = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f17605A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f17606B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f17607C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f17608D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f17609E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f17610F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f17611G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f17612H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f17613I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f17614J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f17615K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public L0 f17616L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0318e f17617M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public V f17618N;

    public static int j(SignalStrength signalStrength, String str, String str2, int i7) {
        int iNextInt;
        String string;
        int iIndexOf;
        int i8 = f.API_PRIORITY_OTHER;
        try {
            iNextInt = ((Integer) signalStrength.getClass().getMethod(str, null).invoke(signalStrength, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            iNextInt = Integer.MAX_VALUE;
        }
        if (iNextInt == Integer.MAX_VALUE && (iIndexOf = (string = signalStrength.toString()).indexOf(str2.concat("="))) != -1) {
            Scanner scanner = new Scanner(string.substring(str2.length() + iIndexOf + 1));
            if (scanner.hasNextInt() && (iNextInt = scanner.nextInt()) == 99) {
                iNextInt = Integer.MAX_VALUE;
            }
        }
        if (iNextInt != Integer.MAX_VALUE) {
            return iNextInt;
        }
        String[] strArrSplit = signalStrength.toString().split(" ");
        if (strArrSplit.length <= i7) {
            return iNextInt;
        }
        try {
            int i9 = Integer.parseInt(strArrSplit[i7]);
            if (i9 != 99) {
                i8 = i9;
            }
            return i8;
        } catch (NumberFormatException unused2) {
            return iNextInt;
        }
    }

    public static boolean l() {
        if (!AbstractC0997i0.l("android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC0998i1.f17749c.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            return o(connectivityManager) != 1;
        } catch (Throwable th) {
            th.toString();
            return false;
        }
    }

    public static int n() {
        ConnectivityManager connectivityManager;
        if (!AbstractC0997i0.l("android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) AbstractC0998i1.f17749c.getSystemService("connectivity")) == null) {
            return 1;
        }
        try {
            return o(connectivityManager);
        } catch (Throwable th) {
            th.toString();
            return 1;
        }
    }

    public static int o(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return 1;
        }
        if (networkCapabilities.hasTransport(1)) {
            return 3;
        }
        return networkCapabilities.hasTransport(0) ? 4 : 2;
    }

    @Override // p155w1.G2
    public final void i(I2 i7) {
        super.i(i7);
        d(new W(this, 2));
    }

    public final synchronized void m() {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    ((TelephonyManager) AbstractC0998i1.f17749c.getSystemService("phone")).registerTelephonyCallback(Executors.newSingleThreadExecutor(), X.a(this));
                    return;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            Executors.newSingleThreadExecutor().execute(new W(this, 1));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
