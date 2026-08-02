package a5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import b5.C5541b;
import java.lang.reflect.InvocationTargetException;

/* renamed from: a5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4946d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f36265a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static PackageInfo a(@NonNull Context context) {
        PackageInfo a11 = C5541b.a();
        if (a11 != null) {
            return a11;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str != null) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }
}
