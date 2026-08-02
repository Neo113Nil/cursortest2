package A5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import j.C7232a;
import org.jetbrains.annotations.NotNull;
import v5.C10229c;
import v5.C10234h;
import w5.C10430b;
import w5.EnumC10431c;
import w5.InterfaceC10439k;
import x5.InterfaceC10659c;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C10229c f424a = new C10229c(0);

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f425a;

        static {
            int[] iArr = new int[EnumC10431c.values().length];
            try {
                iArr[EnumC10431c.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10431c.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10431c.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f425a = iArr;
        }
    }

    public static final boolean a(@NotNull C10234h c10234h) {
        int i11 = a.f425a[c10234h.H().ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new Sc.o();
            }
            if ((c10234h.q().m() != null || !(c10234h.K() instanceof C10430b)) && (!(c10234h.M() instanceof InterfaceC10659c) || !(c10234h.K() instanceof InterfaceC10439k) || ((InterfaceC10659c) c10234h.M()).getView() == null || ((InterfaceC10659c) c10234h.M()).getView() != ((InterfaceC10439k) c10234h.K()).getView())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final C10229c b() {
        return f424a;
    }

    public static final Drawable c(@NotNull C10234h c10234h, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        Context l11 = c10234h.l();
        int intValue = num.intValue();
        Drawable a11 = C7232a.a(l11, intValue);
        if (a11 != null) {
            return a11;
        }
        throw new IllegalStateException(Ej.b.a(intValue, "Invalid resource ID: ").toString());
    }
}
