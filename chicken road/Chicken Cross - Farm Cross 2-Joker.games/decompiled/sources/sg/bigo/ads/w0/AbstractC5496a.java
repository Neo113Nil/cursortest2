package sg.bigo.ads.w0;

import android.util.Log;
import com.ironsource.U3;
import sg.bigo.ads.K0.Q;

/* renamed from: sg.bigo.ads.w0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5496a {
    public static void a(String str, String str2) {
        a(0, 6, str, str2);
    }

    public static void b(String str, String str2) {
        a(0, 5, str, str2);
    }

    public static void a(int i, int i2, String str, String str2) {
        if (Q.f12348a) {
            if (i != 2 && i != 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        if (i == 0) {
            str2 = U3.j.d + str + "] " + str2;
        }
        Log.println(i2, "BigoAds", str2);
    }
}
