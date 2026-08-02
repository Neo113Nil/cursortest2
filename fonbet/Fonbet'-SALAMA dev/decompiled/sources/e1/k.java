package e1;

import android.graphics.Color;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.ILogger;
import io.sentry.ObjectWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ String a(int i7) {
        if (i7 == 1) {
            return "NotificationReceived";
        }
        if (i7 == 2) {
            return "NotificationClicked";
        }
        if (i7 == 3) {
            return "NotificationCancelled";
        }
        if (i7 == 4) {
            return "TokenRefresh";
        }
        throw null;
    }

    public static /* synthetic */ int b(int i7) {
        switch (i7) {
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
                return 4096;
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
            case 19:
                return 262144;
            case 20:
                return 524288;
            case zzbbd.zzt.zzm /* 21 */:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            default:
                throw null;
        }
    }

    public static ClassCastException c(ArrayList arrayList, int i7) {
        arrayList.get(i7).getClass();
        return new ClassCastException();
    }

    public static String d(int i7, String str) {
        return str + i7;
    }

    public static String e(String str, String str2) {
        return str + str2;
    }

    public static String f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String g(StringBuilder sb, int i7, String str) {
        sb.append(i7);
        sb.append(str);
        return sb.toString();
    }

    public static String h(StringBuilder sb, Class cls) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String i(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder j(String str, String str2, long j) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder k(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static HashMap m(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static void n(int i7, int i8, int i9, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i7, i8, i9)));
    }

    public static /* synthetic */ void o(int i7, String str) {
        if (i7 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = t6.h.class.getName();
            int i8 = 0;
            while (!stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            while (stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            StackTraceElement stackTraceElement = stackTrace[i8];
            StringBuilder l7 = l("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            l7.append(str);
            NullPointerException nullPointerException = new NullPointerException(l7.toString());
            t6.h.g(nullPointerException, t6.h.class.getName());
            throw nullPointerException;
        }
    }

    public static void p(Map map, String str, ObjectWriter objectWriter, String str2, ILogger iLogger) {
        Object obj = map.get(str);
        objectWriter.name(str2);
        objectWriter.value(iLogger, obj);
    }

    public static /* synthetic */ String q(int i7) {
        switch (i7) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String r(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "VALUE" : "CHILD_CHANGED" : "CHILD_MOVED" : "CHILD_ADDED" : "CHILD_REMOVED";
    }

    public static /* synthetic */ String s(int i7) {
        return i7 != 1 ? i7 != 2 ? "null" : "V2" : "V1";
    }
}
