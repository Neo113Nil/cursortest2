package androidx.camera.camera2.internal.compat.quirk;

import C.S;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class ExcludedSupportedSizesQuirk implements E0 {
    @NonNull
    public static List e(int i11, @NonNull String str) {
        String str2 = Build.BRAND;
        boolean z11 = false;
        if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
            ArrayList arrayList = new ArrayList();
            if (str.equals("0") && i11 == 256) {
                arrayList.add(new Size(4160, 3120));
                arrayList.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
            }
            return arrayList;
        }
        if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
            ArrayList arrayList2 = new ArrayList();
            if (str.equals("0") && i11 == 256) {
                arrayList2.add(new Size(4160, 3120));
                arrayList2.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
            }
            return arrayList2;
        }
        if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
            z11 = true;
        }
        if (z11) {
            ArrayList arrayList3 = new ArrayList();
            if (str.equals("0") && (i11 == 34 || i11 == 35)) {
                arrayList3.add(new Size(720, 720));
                arrayList3.add(new Size(400, 400));
            }
            return arrayList3;
        }
        if (g()) {
            ArrayList arrayList4 = new ArrayList();
            if (str.equals("0")) {
                if (i11 == 34) {
                    arrayList4.add(new Size(4128, 3096));
                    arrayList4.add(new Size(4128, 2322));
                    arrayList4.add(new Size(3088, 3088));
                    arrayList4.add(new Size(3264, 2448));
                    arrayList4.add(new Size(3264, 1836));
                    arrayList4.add(new Size(2048, 1536));
                    arrayList4.add(new Size(2048, 1152));
                    arrayList4.add(new Size(1920, 1080));
                    return arrayList4;
                }
                if (i11 == 35) {
                    arrayList4.add(new Size(4128, 2322));
                    arrayList4.add(new Size(3088, 3088));
                    arrayList4.add(new Size(3264, 2448));
                    arrayList4.add(new Size(3264, 1836));
                    arrayList4.add(new Size(2048, 1536));
                    arrayList4.add(new Size(2048, 1152));
                    arrayList4.add(new Size(1920, 1080));
                    return arrayList4;
                }
            } else if (str.equals("1") && (i11 == 34 || i11 == 35)) {
                arrayList4.add(new Size(3264, 2448));
                arrayList4.add(new Size(3264, 1836));
                arrayList4.add(new Size(2448, 2448));
                arrayList4.add(new Size(1920, 1920));
                arrayList4.add(new Size(2048, 1536));
                arrayList4.add(new Size(2048, 1152));
                arrayList4.add(new Size(1920, 1080));
            }
            return arrayList4;
        }
        if (!f()) {
            if (!"REDMI".equalsIgnoreCase(str2) || !"joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                S.k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList5 = new ArrayList();
            if (str.equals("0") && i11 == 256) {
                arrayList5.add(new Size(9280, 6944));
            }
            return arrayList5;
        }
        ArrayList arrayList6 = new ArrayList();
        if (str.equals("0")) {
            if (i11 == 34) {
                arrayList6.add(new Size(4128, 3096));
                arrayList6.add(new Size(4128, 2322));
                arrayList6.add(new Size(3088, 3088));
                arrayList6.add(new Size(3264, 2448));
                arrayList6.add(new Size(3264, 1836));
                arrayList6.add(new Size(2048, 1536));
                arrayList6.add(new Size(2048, 1152));
                arrayList6.add(new Size(1920, 1080));
                return arrayList6;
            }
            if (i11 == 35) {
                arrayList6.add(new Size(2048, 1536));
                arrayList6.add(new Size(2048, 1152));
                arrayList6.add(new Size(1920, 1080));
                return arrayList6;
            }
        } else if (str.equals("1") && (i11 == 34 || i11 == 35)) {
            arrayList6.add(new Size(2576, 1932));
            arrayList6.add(new Size(2560, 1440));
            arrayList6.add(new Size(1920, 1920));
            arrayList6.add(new Size(2048, 1536));
            arrayList6.add(new Size(2048, 1152));
            arrayList6.add(new Size(1920, 1080));
        }
        return arrayList6;
    }

    private static boolean f() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean g() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    static boolean h() {
        String str = Build.BRAND;
        if ("OnePlus".equalsIgnoreCase(str) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        if ("OnePlus".equalsIgnoreCase(str) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        if (("HUAWEI".equalsIgnoreCase(str) && "HWANE".equalsIgnoreCase(Build.DEVICE)) || g() || f()) {
            return true;
        }
        return "REDMI".equalsIgnoreCase(str) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }
}
