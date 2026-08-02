package Rf0;

import G.g;
import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: Rf0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0501a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25061a;

        static {
            int[] iArr = new int[EnumC9053a.values().length];
            try {
                iArr[EnumC9053a.Available.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9053a.NotAvailable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9053a.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25061a = iArr;
        }
    }

    @NotNull
    public static final String a(@NotNull String domain, @NotNull EnumC9053a status) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(status, "status");
        return g.c(domain, " = ", b(status));
    }

    @NotNull
    public static final String b(@NotNull EnumC9053a enumC9053a) {
        Intrinsics.checkNotNullParameter(enumC9053a, "<this>");
        int i11 = C0501a.f25061a[enumC9053a.ordinal()];
        if (i11 == 1) {
            return "Available";
        }
        if (i11 == 2) {
            return "NotAvailable";
        }
        if (i11 == 3) {
            return "Unknown";
        }
        throw new o();
    }
}
