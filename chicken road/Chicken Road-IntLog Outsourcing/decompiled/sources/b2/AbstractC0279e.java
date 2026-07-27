package b2;

import O.j;
import com.google.android.gms.internal.play_billing.C1;
import com.google.android.gms.internal.play_billing.InterfaceC0346k1;
import com.google.android.gms.internal.play_billing.Z0;
import com.onesignal.common.services.ServiceBuilder;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.impl.C0793l9;
import kotlin.jvm.internal.i;

/* renamed from: b2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0279e {
    public static int[] _values() {
        return j.c(33);
    }

    public static final boolean a(int i2) {
        return i2 == 3 || i2 == 4 || i2 == 6;
    }

    public static /* synthetic */ int b(int i2) {
        switch (i2) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return Base64Utils.IO_BUFFER_SIZE;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case C0793l9.f8681C /* 19 */:
                return 262144;
            case C0793l9.f8682D /* 20 */:
                return 524288;
            case C0793l9.f8683E /* 21 */:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case C0793l9.f8684F /* 25 */:
                return 16777216;
            case 26:
                return 33554432;
            case C0793l9.f8686H /* 27 */:
                return 67108864;
            case 28:
                return 134217728;
            case C0793l9.f8687I /* 29 */:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            case 32:
                return Integer.MIN_VALUE;
            default:
                throw null;
        }
    }

    public static int c(int i2, int i3, int i6) {
        return Z0.n0(i2) + i3 + i6;
    }

    public static String d(int i2, String str) {
        return str + i2;
    }

    public static String e(String str, String str2) {
        return str + str2;
    }

    public static String f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String g(StringBuilder sb, long j2, char c2) {
        sb.append(j2);
        sb.append(c2);
        return sb.toString();
    }

    public static String h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder i(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k(int i2, String str) {
        if (i2 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = i.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            i.j(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static /* synthetic */ void l(InterfaceC0346k1 interfaceC0346k1) {
        if (interfaceC0346k1 != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void m(C1 c12) {
        if (c12 != null) {
            throw new ClassCastException();
        }
    }

    public static void n(ServiceBuilder serviceBuilder, Class cls, Class cls2, Class cls3, Class cls4) {
        serviceBuilder.register(cls).provides(cls2);
        serviceBuilder.register(cls3).provides(cls4);
    }

    public static /* synthetic */ void o(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ String q(int i2) {
        switch (i2) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String r(int i2) {
        switch (i2) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
