package w1;

import K4.C0318e;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class Y extends G2 {

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f17598O = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f17599A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17600B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17601C;

    /* renamed from: D, reason: collision with root package name */
    public int f17602D;

    /* renamed from: E, reason: collision with root package name */
    public String f17603E;

    /* renamed from: F, reason: collision with root package name */
    public String f17604F;

    /* renamed from: G, reason: collision with root package name */
    public String f17605G;

    /* renamed from: H, reason: collision with root package name */
    public String f17606H;

    /* renamed from: I, reason: collision with root package name */
    public String f17607I;

    /* renamed from: J, reason: collision with root package name */
    public String f17608J;

    /* renamed from: K, reason: collision with root package name */
    public int f17609K;

    /* renamed from: L, reason: collision with root package name */
    public A1.L0 f17610L;

    /* renamed from: M, reason: collision with root package name */
    public C0318e f17611M;

    /* renamed from: N, reason: collision with root package name */
    public V f17612N;

    public static int j(SignalStrength signalStrength, String str, String str2, int i7) {
        int i8;
        String signalStrength2;
        int indexOf;
        int i9 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        try {
            i8 = ((Integer) signalStrength.getClass().getMethod(str, null).invoke(signalStrength, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            i8 = Integer.MAX_VALUE;
        }
        if (i8 == Integer.MAX_VALUE && (indexOf = (signalStrength2 = signalStrength.toString()).indexOf(str2.concat("="))) != -1) {
            Scanner scanner = new Scanner(signalStrength2.substring(str2.length() + indexOf + 1));
            if (scanner.hasNextInt() && (i8 = scanner.nextInt()) == 99) {
                i8 = Integer.MAX_VALUE;
            }
        }
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        String[] split = signalStrength.toString().split(" ");
        if (split.length <= i7) {
            return i8;
        }
        try {
            int parseInt = Integer.parseInt(split[i7]);
            if (parseInt != 99) {
                i9 = parseInt;
            }
            return i9;
        } catch (NumberFormatException unused2) {
            return i8;
        }
    }

    public static boolean l() {
        if (!AbstractC1706i0.l("android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC1707i1.f17743c.getSystemService("connectivity");
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
        if (!AbstractC1706i0.l("android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) AbstractC1707i1.f17743c.getSystemService("connectivity")) == null) {
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

    @Override // w1.G2
    public final void i(I2 i22) {
        super.i(i22);
        d(new W(this, 2));
    }

    public final synchronized void m() {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    ((TelephonyManager) AbstractC1707i1.f17743c.getSystemService("phone")).registerTelephonyCallback(Executors.newSingleThreadExecutor(), X.a(this));
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
