package S0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f6250d = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f6251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6253c;

    public n(int i7, String str, String str2) {
        this.f6253c = i7;
        this.f6251a = str;
        this.f6252b = str2;
        f6250d.add(this);
    }

    public final boolean a(Context context) {
        PackageManager.ComponentInfoFlags of;
        ServiceInfo serviceInfo;
        if (!b()) {
            PackageInfo d7 = R0.w.d(context);
            Bundle bundle = null;
            if (d7 != null) {
                ComponentName componentName = new ComponentName(d7.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
                try {
                    if (Build.VERSION.SDK_INT >= 33) {
                        of = PackageManager.ComponentInfoFlags.of(640L);
                        serviceInfo = context.getPackageManager().getServiceInfo(componentName, of);
                        bundle = serviceInfo.metaData;
                    } else {
                        bundle = context.getPackageManager().getServiceInfo(componentName, 640).metaData;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (!(bundle == null ? false : bundle.containsKey(this.f6252b))) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        switch (this.f6253c) {
            case 0:
                break;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                }
                break;
        }
        return false;
    }
}
