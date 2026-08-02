package A5;

import org.jetbrains.annotations.NotNull;
import w5.AbstractC10429a;
import w5.EnumC10434f;

/* loaded from: classes8.dex */
public final class j {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f426a;

        static {
            int[] iArr = new int[EnumC10434f.values().length];
            try {
                iArr[EnumC10434f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10434f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f426a = iArr;
        }
    }

    public static final float a(@NotNull AbstractC10429a abstractC10429a, @NotNull EnumC10434f enumC10434f) {
        if (abstractC10429a instanceof AbstractC10429a.C2245a) {
            return ((AbstractC10429a.C2245a) abstractC10429a).f103575a;
        }
        int i11 = a.f426a[enumC10434f.ordinal()];
        if (i11 == 1) {
            return Float.MIN_VALUE;
        }
        if (i11 == 2) {
            return Float.MAX_VALUE;
        }
        throw new Sc.o();
    }
}
