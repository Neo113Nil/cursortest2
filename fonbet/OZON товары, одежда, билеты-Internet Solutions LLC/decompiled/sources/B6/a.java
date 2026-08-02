package B6;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.fragment.app.r;
import com.esiasdk.android.EsiaAuthActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z6.C10992a;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes8.dex */
public final class a {
    @SuppressLint({"WrongConstant"})
    private static void a(Activity activity) {
        PackageManager packageManager = activity.getApplicationContext().getPackageManager();
        if (packageManager == null) {
            throw new IllegalStateException("EsiaAuthActivity not found in AndroidManifest.xml");
        }
        try {
            packageManager.getActivityInfo(new ComponentName(activity, (Class<?>) EsiaAuthActivity.class), 1);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalStateException("EsiaAuthActivity not found in AndroidManifest.xml");
        }
    }

    private static Intent b(r rVar, C10992a c10992a, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(rVar, EsiaAuthActivity.class.getName()));
        intent.putExtra("EXTRA_ESIA_API_URL", "https://esia.gosuslugi.ru/");
        intent.putExtra("EXTRA_CLIENT_SESSION", c10992a);
        if (str == null) {
            return intent;
        }
        intent.putExtra("EXTRA_PERMISSIONS", str);
        return intent;
    }

    public static void c(@NotNull r activity, @NotNull C10992a clientSessionInfo) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSessionInfo, "clientSessionInfo");
        Intrinsics.checkNotNullParameter("https://esia.gosuslugi.ru/", "apiUrl");
        a(activity);
        activity.startActivityForResult(b(activity, clientSessionInfo, null), 1);
    }

    public static void d(@NotNull r activity, @NotNull C10992a clientSessionInfo, @NotNull String permissions) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSessionInfo, "clientSessionInfo");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter("https://esia.gosuslugi.ru/", "apiUrl");
        a(activity);
        activity.startActivityForResult(b(activity, clientSessionInfo, permissions), 1);
    }
}
