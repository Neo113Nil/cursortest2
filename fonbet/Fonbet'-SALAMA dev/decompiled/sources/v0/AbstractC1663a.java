package v0;

import R5.C0405a;
import a.AbstractC0603a;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import f6.C1112e;
import f6.C1113f;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import m3.b;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1663a {
    public static final boolean a(int i7) {
        return !N3.a.f4779b.get();
    }

    public static final boolean b(int i7) {
        Boolean bool;
        if (N3.a.f4779b.get()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                N3.a.f4778a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int c(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return -1;
        }
        throw null;
    }

    public static int d(int i7, int i8, String str) {
        return (str.hashCode() + i7) * i8;
    }

    public static C1112e e(String str, String str2, String str3) {
        return AbstractC0603a.h(new C0405a(str, str2, str3));
    }

    public static String f(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder g(String str, int i7, String str2, int i8, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        sb.append(i8);
        sb.append(str3);
        return sb;
    }

    public static InterfaceC1506a h(Parcel parcel) {
        InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
        parcel.recycle();
        return Z6;
    }

    public static /* synthetic */ void i(int i7, String str) {
        if (i7 == 0) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void j(int i7, String str, String str2) {
        Log.w(str2, str + i7);
    }

    public static void k(int i7, HashMap hashMap, String str, int i8, String str2) {
        hashMap.put(str, Integer.valueOf(i7));
        hashMap.put(str2, Integer.valueOf(i8));
    }

    public static void l(C1112e c1112e, Function1 function1) {
        function1.invoke(new C1113f(c1112e));
    }

    public static void m(String str, String str2, String str3) {
        AbstractC0603a.h(new C0405a(str, str2, str3));
    }

    public static void n(b bVar, Bundle bundle, String str) {
        bVar.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static String o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }
}
