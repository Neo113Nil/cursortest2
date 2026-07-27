package b0;

import a0.AbstractC0088b;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k extends AbstractC0157c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f2463d;

    public k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f2463d = Pattern.compile("\\A\\d+");
    }

    @Override // b0.AbstractC0157c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // b0.AbstractC0157c
    public final boolean b() {
        int i3;
        PackageInfo packageInfo;
        boolean b3 = super.b();
        if (!b3 || (i3 = Build.VERSION.SDK_INT) >= 29) {
            return b3;
        }
        WeakHashMap weakHashMap = AbstractC0088b.f1782a;
        if (i3 >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = AbstractC0088b.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            Matcher matcher = this.f2463d.matcher(packageInfo.versionName);
            if (matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
