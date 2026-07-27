package m0;

import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.P1;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.U1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public abstract /* synthetic */ class M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9961a = 0;

    static {
        int i3 = N.f9962w0;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + StringUtils.PROCESS_POSTFIX_DELIMITER + message;
            int i3 = AbstractC0213o0.f2786a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static Q1 b(int i3, int i4, C1120h c1120h) {
        try {
            P1 r3 = Q1.r();
            T1 r4 = U1.r();
            r4.e(c1120h.f10046a);
            String str = c1120h.f10047b;
            r4.d();
            U1.o((U1) r4.f2752b, str);
            r4.f(i3);
            r3.e(r4);
            r3.f(i4);
            return (Q1) r3.b();
        } catch (Exception e3) {
            AbstractC0213o0.h("BillingLogger", "Unable to create logging payload", e3);
            return null;
        }
    }

    public static Q1 c(int i3, int i4, C1120h c1120h, String str) {
        try {
            T1 r3 = U1.r();
            r3.e(c1120h.f10046a);
            String str2 = c1120h.f10047b;
            r3.d();
            U1.o((U1) r3.f2752b, str2);
            r3.f(i3);
            if (str != null) {
                r3.d();
                U1.n((U1) r3.f2752b, str);
            }
            P1 r4 = Q1.r();
            r4.e(r3);
            r4.f(i4);
            return (Q1) r4.b();
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static S1 d(int i3) {
        try {
            R1 q3 = S1.q();
            q3.d();
            S1.p((S1) q3.f2752b, i3);
            return (S1) q3.b();
        } catch (Exception e3) {
            AbstractC0213o0.h("BillingLogger", "Unable to create logging payload", e3);
            return null;
        }
    }
}
