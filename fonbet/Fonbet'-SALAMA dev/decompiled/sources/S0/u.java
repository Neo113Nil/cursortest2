package S0;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u extends AbstractC0432c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f6265d;

    public u() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f6265d = Pattern.compile("\\A\\d+");
    }

    @Override // S0.AbstractC0432c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // S0.AbstractC0432c
    public final boolean b() {
        int i7;
        PackageInfo packageInfo;
        boolean b7 = super.b();
        if (!b7 || (i7 = Build.VERSION.SDK_INT) >= 29) {
            return b7;
        }
        Uri uri = R0.w.f5874a;
        if (i7 >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = R0.w.e();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            return false;
        }
        Matcher matcher = this.f6265d.matcher(packageInfo.versionName);
        return matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
