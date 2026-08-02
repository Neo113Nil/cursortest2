package Hg0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {
    private static String a(String str) {
        Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.String");
        return (String) invoke;
    }

    public static Boolean b(@NotNull String propName) {
        Intrinsics.checkNotNullParameter(propName, "propName");
        if (propName.length() >= 31) {
            throw new IllegalArgumentException("Property name length must be less 31 symbols");
        }
        try {
            String a11 = a(propName);
            if (h.K(a11)) {
                return null;
            }
            return Boolean.valueOf(a11.equals("1"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(@NotNull String propName, String str) {
        Intrinsics.checkNotNullParameter(propName, "propName");
        if (propName.length() >= 31) {
            throw new IllegalArgumentException("Property name length must be less 31 symbols");
        }
        try {
            return a(propName);
        } catch (Exception unused) {
            return str;
        }
    }
}
