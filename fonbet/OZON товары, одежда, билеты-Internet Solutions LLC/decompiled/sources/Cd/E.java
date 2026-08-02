package Cd;

import Sd.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import re.C9257a;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Sd.c f4688a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Sd.b f4689b;

    static {
        Sd.c cVar = new Sd.c("kotlin.jvm.JvmField");
        f4688a = cVar;
        b.a.b(cVar);
        b.a.b(new Sd.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f4689b = b.a.a("kotlin/jvm/internal/RepeatableContainer", false);
    }

    @NotNull
    public static Sd.b a() {
        return f4689b;
    }

    @NotNull
    public static final String b(@NotNull String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (d(propertyName)) {
            return propertyName;
        }
        return "get" + C9257a.a(propertyName);
    }

    @NotNull
    public static final String c(@NotNull String propertyName) {
        String a11;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder("set");
        if (d(propertyName)) {
            a11 = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(a11, "substring(...)");
        } else {
            a11 = C9257a.a(propertyName);
        }
        sb2.append(a11);
        return sb2.toString();
    }

    public static final boolean d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (kotlin.text.h.e0(name, "is", false) && name.length() != 2) {
            char charAt = name.charAt(2);
            if (Intrinsics.i(97, charAt) > 0 || Intrinsics.i(charAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
