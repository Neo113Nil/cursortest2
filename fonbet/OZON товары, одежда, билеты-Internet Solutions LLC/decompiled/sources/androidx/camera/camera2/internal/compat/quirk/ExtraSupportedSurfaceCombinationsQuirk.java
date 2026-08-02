package androidx.camera.camera2.internal.compat.quirk;

import Kk.c;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.V0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private static final U0 f38036a;

    /* renamed from: b, reason: collision with root package name */
    private static final U0 f38037b;

    /* renamed from: c, reason: collision with root package name */
    private static final HashSet f38038c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashSet f38039d;

    static {
        U0 u02 = new U0();
        V0.b bVar = V0.b.YUV;
        V0.a aVar = V0.a.VGA;
        u02.a(V0.a(bVar, aVar));
        V0.b bVar2 = V0.b.PRIV;
        V0.a aVar2 = V0.a.PREVIEW;
        u02.a(V0.a(bVar2, aVar2));
        V0.a aVar3 = V0.a.MAXIMUM;
        u02.a(V0.a(bVar, aVar3));
        f38036a = u02;
        U0 u03 = new U0();
        c.h(bVar2, aVar2, u03, bVar2, aVar);
        u03.a(V0.a(bVar, aVar3));
        f38037b = u03;
        f38038c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        f38039d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    @NonNull
    public static List e(@NonNull String str) {
        String str2 = Build.DEVICE;
        if (!"heroqltevzw".equalsIgnoreCase(str2) && !"heroqltetmo".equalsIgnoreCase(str2)) {
            return ((!"google".equalsIgnoreCase(Build.BRAND) ? false : f38038c.contains(Build.MODEL.toUpperCase(Locale.US))) || g()) ? Collections.singletonList(f38037b) : Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f38036a);
        }
        return arrayList;
    }

    static boolean f() {
        String str = Build.DEVICE;
        if ("heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str)) {
            return true;
        }
        return (!"google".equalsIgnoreCase(Build.BRAND) ? false : f38038c.contains(Build.MODEL.toUpperCase(Locale.US))) || g();
    }

    private static boolean g() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f38039d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
