package b0;

import a.AbstractC0086a;
import a0.AbstractC0088b;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import u.AbstractC1209a;

/* loaded from: classes.dex */
public final class l extends C0156b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, String str2, int i3) {
        super(str, str2, 2);
        this.f2464e = i3;
    }

    @Override // b0.AbstractC0157c
    public final boolean b() {
        PackageInfo packageInfo;
        switch (this.f2464e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                WeakHashMap weakHashMap = AbstractC0088b.f1782a;
                if (Build.VERSION.SDK_INT >= 26) {
                    packageInfo = WebView.getCurrentWebViewPackage();
                } else {
                    try {
                        packageInfo = AbstractC0088b.a();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        packageInfo = null;
                    }
                }
                if (packageInfo == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? AbstractC1209a.b(packageInfo) : (long) packageInfo.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !AbstractC0086a.E("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = AbstractC0088b.f1782a;
                if (m.f2466b.b()) {
                    return n.f2469a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (AbstractC0086a.E("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
