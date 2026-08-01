package sg.bigo.ads.c;

import android.system.Os;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.File;

/* renamed from: sg.bigo.ads.c.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5046l {
    public static boolean a(int i) {
        try {
            return Os.stat("/").st_uid == i;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        for (String str3 : str2.split(File.pathSeparator)) {
            String trim = str3.trim();
            if (!trim.isEmpty()) {
                File file = new File(trim, str);
                if (file.exists() && file.canExecute()) {
                    return file.getPath();
                }
            }
        }
        return "";
    }

    public static boolean a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return new File(str).exists();
    }
}
