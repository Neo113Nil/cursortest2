package sg.bigo.ads.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.json.JSONObject;
import sg.bigo.ads.a.AbstractC5015a;

/* loaded from: classes3.dex */
public final class h implements g {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // sg.bigo.ads.b.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        String str;
        FileInputStream fileInputStream;
        String canonicalPath;
        String canonicalPath2;
        Pair pair;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        JSONObject jSONObject = new JSONObject();
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
        }
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            str = applicationInfo.publicSourceDir;
            File file = new File(str);
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        FileDescriptor fd = fileInputStream.getFD();
                        Field declaredField = fd.getClass().getDeclaredField(AbstractC5015a.l0);
                        declaredField.setAccessible(true);
                        Path readSymbolicLink = Files.readSymbolicLink(Paths.get(new File(AbstractC5015a.b0, Integer.toString(declaredField.getInt(fd))).getAbsolutePath(), new String[0]));
                        canonicalPath = file.getCanonicalPath();
                        canonicalPath2 = readSymbolicLink.toFile().getCanonicalPath();
                    } finally {
                    }
                } catch (Exception unused2) {
                }
                if (!TextUtils.equals(canonicalPath, canonicalPath2)) {
                    pair = new Pair(canonicalPath, canonicalPath2);
                    fileInputStream.close();
                    if (pair != null) {
                        jSONObject.put((String) pair.first, pair.second);
                    }
                    if (jSONObject.length() == 0) {
                        return null;
                    }
                    return jSONObject;
                }
                fileInputStream.close();
            }
            pair = null;
            if (pair != null) {
            }
            if (jSONObject.length() == 0) {
            }
        }
        str = "";
        File file2 = new File(str);
        if (Build.VERSION.SDK_INT >= 26) {
        }
        pair = null;
        if (pair != null) {
        }
        if (jSONObject.length() == 0) {
        }
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return AbstractC5015a.A;
    }
}
