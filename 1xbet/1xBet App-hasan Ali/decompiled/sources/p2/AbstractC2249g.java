package p2;

import a3.AbstractC0467k;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: p2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2249g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18702a = f2.m.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z3) {
        String str = f18702a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z3 ? 1 : 2, 1);
            f2.m.d().a(str, cls.getName() + " " + (z3 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e3) {
            f2.m.d().a(str, AbstractC0467k.v(cls.getName(), " could not be ", z3 ? "enabled" : "disabled"), e3);
        }
    }
}
