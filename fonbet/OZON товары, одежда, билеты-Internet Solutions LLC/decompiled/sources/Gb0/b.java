package Gb0;

import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9900a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9901b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f9902c;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.FORCE_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9900a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d.FORCE_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d.INSTANT_LOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d.CROSS_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f9901b = iArr2;
            int[] iArr3 = new int[Gb0.a.values().length];
            try {
                iArr3[Gb0.a.RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            f9902c = iArr3;
        }
    }

    @NotNull
    public static final String a(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i11 = a.f9900a[cVar.ordinal()];
        if (i11 == 1) {
            return "logout";
        }
        if (i11 == 2) {
            return "forceLogout";
        }
        throw new o();
    }

    @NotNull
    public static final String b(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i11 = a.f9901b[dVar.ordinal()];
        if (i11 == 1) {
            return "login";
        }
        if (i11 == 2) {
            return "forceLogin";
        }
        if (i11 == 3) {
            return "instantLogin";
        }
        if (i11 == 4) {
            return "crossApp";
        }
        throw new o();
    }

    @NotNull
    public static final void c(@NotNull Gb0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (a.f9902c[aVar.ordinal()] != 1) {
            throw new o();
        }
    }
}
