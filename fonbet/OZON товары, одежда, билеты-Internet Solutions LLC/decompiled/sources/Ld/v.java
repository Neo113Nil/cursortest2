package Ld;

import Ld.u;
import ae.EnumC5003e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v f16824a = new v();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16825a;

        static {
            int[] iArr = new int[qd.p.values().length];
            try {
                iArr[qd.p.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qd.p.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qd.p.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qd.p.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qd.p.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qd.p.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[qd.p.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[qd.p.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f16825a = iArr;
        }
    }

    @NotNull
    public static u a(@NotNull String representation) {
        EnumC5003e enumC5003e;
        Intrinsics.checkNotNullParameter(representation, "representation");
        representation.getClass();
        char charAt = representation.charAt(0);
        EnumC5003e[] values = EnumC5003e.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                enumC5003e = null;
                break;
            }
            enumC5003e = values[i11];
            if (enumC5003e.e().charAt(0) == charAt) {
                break;
            }
            i11++;
        }
        if (enumC5003e != null) {
            return new u.c(enumC5003e);
        }
        if (charAt == 'V') {
            return new u.c(null);
        }
        if (charAt == '[') {
            String substring = representation.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return new u.a(a(substring));
        }
        if (charAt == 'L') {
            kotlin.text.h.C(representation, ';');
        }
        String substring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return new u.b(substring2);
    }

    @NotNull
    public static String c(@NotNull u type) {
        String e11;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof u.a) {
            return "[" + c(((u.a) type).i());
        }
        if (type instanceof u.c) {
            EnumC5003e i11 = ((u.c) type).i();
            return (i11 == null || (e11 = i11.e()) == null) ? "V" : e11;
        }
        if (!(type instanceof u.b)) {
            throw new Sc.o();
        }
        return "L" + ((u.b) type).i() + ';';
    }

    public final u.b b(String internalName) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        return new u.b(internalName);
    }
}
