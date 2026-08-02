package C;

import android.content.res.Resources;
import java.util.ServiceLoader;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import tf0.InterfaceC9871a;

/* loaded from: classes8.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private static D f4092a;

    public static final InterfaceC9871a a() {
        ServiceLoader load = ServiceLoader.load(InterfaceC9871a.class);
        Intrinsics.checkNotNullExpressionValue(load, "load(...)");
        return (InterfaceC9871a) C7714v.L(load);
    }

    public static void b() {
        if (f4092a == null) {
            f4092a = new D();
        }
    }

    public static final int c(float f7) {
        return (int) (f7 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int d(int i11) {
        return (int) (i11 * Resources.getSystem().getDisplayMetrics().density);
    }
}
