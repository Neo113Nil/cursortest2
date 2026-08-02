package a3;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import com.google.android.gms.internal.ads.C1639u7;
import com.google.android.gms.internal.ads.EB;
import com.google.android.gms.internal.ads.JB;
import h0.C1990d;
import i0.C2001f;
import i0.C2003h;
import i0.C2006k;
import java.util.HashMap;
import k0.AbstractC2024d;
import k0.C2027g;
import k0.C2028h;
import k0.InterfaceC2025e;
import k4.AbstractC2036a;
import m4.InterfaceC2100c;
import q3.C2308a;
import w0.AbstractC2540a;
import z0.C2733I;

/* renamed from: a3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0467k {
    public static /* synthetic */ void A(String str, int i) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.l.class.getName();
            int i5 = 0;
            while (!stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            while (stackTrace[i5].getClassName().equals(name)) {
                i5++;
            }
            StackTraceElement stackTraceElement = stackTrace[i5];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            kotlin.jvm.internal.l.j(nullPointerException, kotlin.jvm.internal.l.class.getName());
            throw nullPointerException;
        }
    }

    public static void B(String str, String str2, String str3) {
        JB.l(str3, str2.concat(String.valueOf(str)));
    }

    public static void C(C2308a c2308a, Bundle bundle, String str) {
        c2308a.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static /* synthetic */ String D(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }

    public static /* synthetic */ String E(int i) {
        switch (i) {
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

    public static /* synthetic */ String F(int i) {
        switch (i) {
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

    public static S a(U u5, Class cls, D1.b bVar) {
        kotlin.jvm.internal.l.f("modelClass", cls);
        kotlin.jvm.internal.l.f("extras", bVar);
        return u5.create(cls);
    }

    public static S b(U u5, InterfaceC2100c interfaceC2100c, D1.b bVar) {
        kotlin.jvm.internal.l.f("modelClass", interfaceC2100c);
        kotlin.jvm.internal.l.f("extras", bVar);
        return u5.create(AbstractC2036a.z(interfaceC2100c), bVar);
    }

    public static void c(InterfaceC0491u interfaceC0491u) {
        kotlin.jvm.internal.l.f("owner", interfaceC0491u);
    }

    public static b0.p d(b0.p pVar, b0.p pVar2) {
        return pVar2 == b0.m.f7161k ? pVar : new b0.j(pVar, pVar2);
    }

    public static long e(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final boolean f(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static void g(C2003h c2003h, C1990d c1990d) {
        if (c2003h.f17280b == null) {
            c2003h.f17280b = new RectF();
        }
        RectF rectF = c2003h.f17280b;
        kotlin.jvm.internal.l.c(rectF);
        float f = c1990d.f17200d;
        rectF.set(c1990d.f17197a, c1990d.f17198b, c1990d.f17199c, f);
        if (c2003h.f17281c == null) {
            c2003h.f17281c = new float[8];
        }
        float[] fArr = c2003h.f17281c;
        kotlin.jvm.internal.l.c(fArr);
        long j5 = c1990d.f17201e;
        fArr[0] = Float.intBitsToFloat((int) (j5 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j5 & 4294967295L));
        long j6 = c1990d.f;
        fArr[2] = Float.intBitsToFloat((int) (j6 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j6 & 4294967295L));
        long j7 = c1990d.f17202g;
        fArr[4] = Float.intBitsToFloat((int) (j7 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j7 & 4294967295L));
        long j8 = c1990d.f17203h;
        fArr[6] = Float.intBitsToFloat((int) (j8 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j8 & 4294967295L));
        RectF rectF2 = c2003h.f17280b;
        kotlin.jvm.internal.l.c(rectF2);
        float[] fArr2 = c2003h.f17281c;
        kotlin.jvm.internal.l.c(fArr2);
        c2003h.f17279a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static /* synthetic */ void h(InterfaceC2025e interfaceC2025e, long j5, float f, long j6, int i) {
        if ((i & 4) != 0) {
            j6 = interfaceC2025e.Q();
        }
        interfaceC2025e.q(f, j5, j6);
    }

    public static void i(InterfaceC2025e interfaceC2025e, C2001f c2001f, long j5, long j6, float f, C2006k c2006k, int i, int i5) {
        interfaceC2025e.a0(c2001f, 0L, j5, (i5 & 16) != 0 ? j5 : j6, (i5 & 32) != 0 ? 1.0f : f, c2006k, (i5 & 512) != 0 ? 1 : i);
    }

    public static /* synthetic */ void k(InterfaceC2025e interfaceC2025e, C2003h c2003h, i0.F f, float f5, C2028h c2028h, int i) {
        if ((i & 4) != 0) {
            f5 = 1.0f;
        }
        float f6 = f5;
        AbstractC2024d abstractC2024d = c2028h;
        if ((i & 8) != 0) {
            abstractC2024d = C2027g.f17547b;
        }
        interfaceC2025e.M(c2003h, f, f6, abstractC2024d, (i & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void l(C2733I c2733i, i0.F f, long j5, long j6, float f5, AbstractC2024d abstractC2024d, int i) {
        if ((i & 2) != 0) {
            j5 = 0;
        }
        long j7 = j5;
        if ((i & 4) != 0) {
            j6 = e(c2733i.d(), j7);
        }
        c2733i.e(f, j7, j6, (i & 8) != 0 ? 1.0f : f5, (i & 16) != 0 ? C2027g.f17547b : abstractC2024d);
    }

    public static /* synthetic */ void m(InterfaceC2025e interfaceC2025e, long j5, long j6, int i) {
        if ((i & 4) != 0) {
            j6 = e(interfaceC2025e.d(), 0L);
        }
        interfaceC2025e.H(j5, 0L, j6, (i & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void n(C2733I c2733i, i0.M m5, long j5, long j6, long j7, AbstractC2024d abstractC2024d, int i) {
        if ((i & 2) != 0) {
            j5 = 0;
        }
        long j8 = j5;
        c2733i.f(m5, j8, (i & 4) != 0 ? e(c2733i.d(), j8) : j6, j7, 1.0f, (i & 32) != 0 ? C2027g.f17547b : abstractC2024d);
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "api-call";
            case 2:
                return "dynamite-enter";
            case 3:
                return "read-from-disk-start";
            case 4:
                return "read-from-disk-end";
            case 5:
                return "client-signals-start";
            case 6:
                return "client-signals-end";
            case 7:
                return "service-connected";
            case 8:
                return "gms-signals-start";
            case 9:
                return "gms-signals-end";
            case 10:
                return "get-signals-sdkcore-start";
            case 11:
                return "get-signals-sdkcore-end";
            case 12:
                return "get-ad-dictionary-sdkcore-start";
            case 13:
                return "get-ad-dictionary-sdkcore-end";
            case 14:
                return "http-response-ready";
            case 15:
                return "normalize-ad-response-start";
            case 16:
                return "normalize-ad-response-end";
            case 17:
                return "binder-call-start";
            case 18:
                return "server-response-parse-start";
            case 19:
                return "rendering-start";
            case 20:
                return "public-api-callback";
            case C1639u7.zzm /* 21 */:
                return "rendering-webview-creation-start";
            case 22:
                return "rendering-webview-creation-end";
            case 23:
                return "rendering-ad-component-creation-end";
            case 24:
                return "rendering-configure-webview-start";
            case 25:
                return "rendering-configure-webview-end";
            case 26:
                return "rendering-webview-load-html-start";
            case 27:
                return "rendering-webview-load-html-end";
            case 28:
                return "type2-fetch-start";
            case 29:
                return "type2-fetch-end";
            case 30:
                return "sod-validation-start";
            case 31:
                return "sod-validation-end";
            case 32:
                return "sod-cache-key-start";
            case 33:
                return "sod-cache-key-end";
            case 34:
                return "sod-read-and-remove-start";
            case 35:
                return "sod-read-and-remove-end";
            case 36:
                return "sod-decode-start";
            case 37:
                return "sod-decode-end";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "htmlDisplay";
        }
        if (i == 2) {
            return "nativeDisplay";
        }
        if (i == 3) {
            return "video";
        }
        throw null;
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "beginToRender";
        }
        if (i == 2) {
            return "definedByJavascript";
        }
        if (i == 3) {
            return "onePixel";
        }
        if (i == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static /* synthetic */ int r(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 1000;
        }
        throw null;
    }

    public static int s(int i, int i5, int i6) {
        return EB.p0(i) + i5 + i6;
    }

    public static int t(int i, int i5, int i6, int i7) {
        return EB.p0(i) + i5 + i6 + i7;
    }

    public static D2.e u(String str) {
        AbstractC2540a.c(str);
        return new D2.e();
    }

    public static String v(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder w(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void x(int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        kotlin.jvm.internal.l.j(nullPointerException, kotlin.jvm.internal.l.class.getName());
        throw nullPointerException;
    }

    public static void y(int i, String str, String str2) {
        JB.l(str2, str + i);
    }

    public static void z(int i, HashMap hashMap, String str, int i5, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i5));
    }
}
