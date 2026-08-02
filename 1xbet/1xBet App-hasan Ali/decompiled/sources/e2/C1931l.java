package e2;

import android.content.pm.PackageInfo;
import android.os.Build;
import d2.AbstractC1914b;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: e2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1931l extends AbstractC1922c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f16911d;

    public C1931l() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f16911d = Pattern.compile("\\A\\d+");
    }

    @Override // e2.AbstractC1922c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // e2.AbstractC1922c
    public final boolean b() {
        int i;
        PackageInfo packageInfo;
        boolean b3 = super.b();
        if (!b3 || (i = Build.VERSION.SDK_INT) >= 29) {
            return b3;
        }
        int i5 = AbstractC1914b.f16884a;
        if (i >= 26) {
            packageInfo = AbstractC1924e.a();
        } else {
            try {
                packageInfo = AbstractC1914b.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            return false;
        }
        Matcher matcher = this.f16911d.matcher(packageInfo.versionName);
        return matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
