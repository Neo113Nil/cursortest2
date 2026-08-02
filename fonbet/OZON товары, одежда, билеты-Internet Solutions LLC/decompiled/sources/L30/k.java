package L30;

import C.D;
import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    private static int f16509b;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f16511d = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final int f16508a = D.c(150.0f);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f16510c = new LinkedHashSet();

    public interface a {
        void a();

        void b();
    }

    public static void a(@NotNull a observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        f16510c.add(observer);
    }

    public static boolean b() {
        return f16509b > f16508a;
    }

    public static void c(@NotNull WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Rect rect = new Rect();
        rect.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        int i11 = rect.bottom;
        if (i11 == f16509b) {
            return;
        }
        f16509b = i11;
        LinkedHashSet linkedHashSet = f16510c;
        if (i11 > f16508a) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        } else {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).b();
            }
        }
    }

    public static void d(@NotNull a observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        f16510c.remove(observer);
    }
}
