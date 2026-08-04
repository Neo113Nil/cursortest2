package p096n1;

import android.content.ComponentName;
import android.content.Context;
import p023d1.n;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15315a = n.g("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z4) {
        String str = f15315a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z4 ? 1 : 2, 1);
            n.d().b(str, cls.getName() + " " + (z4 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e7) {
            n.d().b(str, k.f(cls.getName(), " could not be ", z4 ? "enabled" : "disabled"), e7);
        }
    }
}
