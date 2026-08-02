package Rf0;

import Lf0.a;
import Lf0.d;
import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;

/* loaded from: classes3.dex */
public final class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25062a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f25063b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f25064c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f25065d;

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
            f25062a = iArr;
            int[] iArr2 = new int[qf0.b.values().length];
            try {
                iArr2[qf0.b.WiFi.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[qf0.b.Cellular.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[qf0.b.Any.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f25063b = iArr2;
            int[] iArr3 = new int[d.values().length];
            try {
                iArr3[d.Tcp.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[d.Http.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[d.Https.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f25064c = iArr3;
            int[] iArr4 = new int[a.EnumC0331a.values().length];
            try {
                iArr4[a.EnumC0331a.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[a.EnumC0331a.System.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[a.EnumC0331a.Default.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f25065d = iArr4;
        }
    }

    @NotNull
    public static final String a(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i11 = a.f25064c[dVar.ordinal()];
        if (i11 == 1) {
            return "tcp";
        }
        if (i11 == 2) {
            return "http";
        }
        if (i11 == 3) {
            return "https";
        }
        throw new o();
    }

    @NotNull
    public static final String b(@NotNull EnumC9053a enumC9053a) {
        Intrinsics.checkNotNullParameter(enumC9053a, "<this>");
        int i11 = a.f25062a[enumC9053a.ordinal()];
        if (i11 == 1) {
            return "Available";
        }
        if (i11 == 2) {
            return "Not available";
        }
        if (i11 == 3) {
            return "Unknown";
        }
        throw new o();
    }

    @NotNull
    public static final String c(@NotNull qf0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i11 = a.f25063b[bVar.ordinal()];
        if (i11 == 1) {
            return "wi-fi";
        }
        if (i11 == 2) {
            return "cellular";
        }
        if (i11 == 3) {
            return "any";
        }
        throw new o();
    }
}
