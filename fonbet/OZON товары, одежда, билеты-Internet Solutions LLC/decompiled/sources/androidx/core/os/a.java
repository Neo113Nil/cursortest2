package androidx.core.os;

import Sc.InterfaceC3999a;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    private static final class C0771a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0771a f42178a = new C0771a();

        public final int a(int i11) {
            return SdkExtensions.getExtensionVersion(i11);
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        C0771a c0771a = C0771a.f42178a;
        if (i11 >= 30) {
            c0771a.a(30);
        }
        if (i11 >= 30) {
            c0771a.a(31);
        }
        if (i11 >= 30) {
            c0771a.a(33);
        }
        if (i11 >= 30) {
            c0771a.a(1000000);
        }
    }

    public static final boolean a(@NotNull String codename) {
        String buildCodename = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if ("REL".equals(buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @InterfaceC3999a
    public static final boolean b() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            return true;
        }
        if (i11 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("UpsideDownCake");
    }

    public static final boolean c() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("VanillaIceCream");
    }
}
