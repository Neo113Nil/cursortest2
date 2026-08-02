package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.V0;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes8.dex */
public class ExtraCroppingQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f38034a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38035a;

        static {
            int[] iArr = new int[V0.b.values().length];
            f38035a = iArr;
            try {
                iArr[V0.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38035a[V0.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38035a[V0.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f38034a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size e(@NonNull V0.b bVar) {
        if (!f()) {
            return null;
        }
        int i11 = a.f38035a[bVar.ordinal()];
        if (i11 == 1) {
            return new Size(1920, 1080);
        }
        if (i11 == 2) {
            return new Size(1280, 720);
        }
        if (i11 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }

    private static boolean f() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        HashMap hashMap = f38034a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!hashMap.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) hashMap.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }

    static boolean g() {
        return f();
    }
}
