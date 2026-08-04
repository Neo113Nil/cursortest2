package F;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: F.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0210f extends G.h {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, String[] strArr, int i7) {
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (TextUtils.isEmpty(strArr[i8])) {
                throw new IllegalArgumentException(p031e1.k.i(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i8));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        if (activity instanceof InterfaceC0209e) {
            ((InterfaceC0209e) activity).validateRequestPermissionsRequestCode(i7);
        }
        AbstractC0206b.b(activity, strArr, i7);
    }

    public static boolean b(p121q5.c cVar, String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i7 >= 32) {
            return AbstractC0208d.a(cVar, str);
        }
        return i7 == 31 ? AbstractC0207c.b(cVar, str) : AbstractC0206b.c(cVar, str);
    }
}
