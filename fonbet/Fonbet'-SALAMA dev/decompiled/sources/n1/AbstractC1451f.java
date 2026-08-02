package n1;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: n1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1451f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15309a = d1.n.g("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z4) {
        String str = f15309a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z4 ? 1 : 2, 1);
            d1.n.d().b(str, cls.getName() + " " + (z4 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e7) {
            d1.n.d().b(str, e1.k.f(cls.getName(), " could not be ", z4 ? "enabled" : "disabled"), e7);
        }
    }
}
