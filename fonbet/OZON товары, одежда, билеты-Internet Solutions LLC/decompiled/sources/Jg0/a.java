package Jg0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Charset f14748a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String[] f14749b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String[] f14750c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Runtime f14751d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f14752e = 0;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        f14748a = forName;
        f14749b = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        f14750c = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        Runtime runtime = Runtime.getRuntime();
        Intrinsics.checkNotNullExpressionValue(runtime, "getRuntime(...)");
        f14751d = runtime;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(@NotNull Context context) {
        boolean z11;
        boolean z12;
        PackageManager.PackageInfoFlags of2;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = Build.TAGS;
        if (str == null || !h.t(str, "test-keys", false)) {
            String[] strArr = f14749b;
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Process process = null;
                    try {
                        process = f14751d.exec(new String[]{"/system/xbin/which", "su"});
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), f14748a));
                        try {
                            z11 = bufferedReader.readLine() != null;
                            bufferedReader.close();
                            process.destroy();
                        } finally {
                        }
                    } catch (Throwable unused) {
                        if (process != null) {
                            process.destroy();
                        }
                        z11 = false;
                    }
                    if (!z11) {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null) {
                            for (String str2 : f14750c) {
                                try {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        of2 = PackageManager.PackageInfoFlags.of(0L);
                                        packageManager.getPackageInfo(str2, of2);
                                    } else {
                                        packageManager.getPackageInfo(str2, 0);
                                    }
                                    z12 = true;
                                    if (!z12) {
                                        return false;
                                    }
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                            }
                        }
                        z12 = false;
                        if (!z12) {
                        }
                    }
                } else {
                    if (new File(strArr[i11]).exists()) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return true;
    }
}
