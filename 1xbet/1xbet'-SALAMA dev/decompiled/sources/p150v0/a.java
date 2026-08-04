package p150v0;

import R5.C0405a;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import p044f6.e;
import p044f6.f;
import p105o3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
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

    public static e e(String str, String str2, String str3) {
        return p003a.a.h(new C0405a(str, str2, str3));
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

    public static p105o3.a h(Parcel parcel) {
        p105o3.a aVarZ = b.Z(parcel.readStrongBinder());
        parcel.recycle();
        return aVarZ;
    }

    public static /* synthetic */ void i(int i7, String str) {
        if (i7 == 0) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void j(int i7, String str, String str2) {
        Log.w(str2, str + i7);
    }

    public static void k(int i7, HashMap map, String str, int i8, String str2) {
        map.put(str, Integer.valueOf(i7));
        map.put(str2, Integer.valueOf(i8));
    }

    public static void l(e eVar, Function1 function1) {
        function1.invoke(new f(eVar));
    }

    public static void m(String str, String str2, String str3) {
        p003a.a.h(new C0405a(str, str2, str3));
    }

    public static void n(p090m3.b bVar, Bundle bundle, String str) {
        bVar.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static String o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }
}
