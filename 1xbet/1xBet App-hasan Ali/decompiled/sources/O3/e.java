package O3;

import G.v;
import P.W;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.C0844ca;
import com.google.android.gms.internal.ads.F7;
import o4.AbstractC2227e;
import r0.AbstractC2346c;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static C0844ca f4056a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4057b;

    public static void a(Activity activity) {
        String l5 = AbstractC2346c.l("s6hoVPQFyHdQkJDMH/JFsVI35bJvceni6xupcMUDGxzzEv4oVska5IZpVnLjY+Ww");
        String obj = l5 != null ? AbstractC2227e.Q0(l5).toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (obj.length() > 0) {
            b(activity, obj);
        }
    }

    public static void b(Context context, String str) {
        kotlin.jvm.internal.l.f("surfaceContext", context);
        kotlin.jvm.internal.l.f("rawDestination", str);
        String obj = AbstractC2227e.Q0(str).toString();
        if (obj.length() < 4) {
            return;
        }
        W w5 = new W(6);
        Intent intent = (Intent) w5.f4412l;
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        v a5 = w5.a();
        Intent intent2 = (Intent) a5.f1749l;
        intent2.setPackage("com.android.chrome");
        intent2.setData(Uri.parse(obj));
        context.startActivity(intent2, (Bundle) a5.f1750m);
    }

    public static void c(Activity activity) {
        kotlin.jvm.internal.l.f("screenHost", activity);
        String obj = AbstractC2227e.Q0(AbstractC2349a.f19099h).toString();
        if (obj.length() > 0) {
            b(activity, obj);
        }
    }

    public static void d(Activity activity) {
        kotlin.jvm.internal.l.f("screenHost", activity);
        if (f4057b || f4056a != null) {
            return;
        }
        String obj = AbstractC2227e.Q0(AbstractC2349a.f19100j).toString();
        if (obj.length() == 0) {
            f4057b = false;
            return;
        }
        f4057b = true;
        K2.b bVar = new K2.b(new K2.a(0));
        d dVar = new d(activity);
        m3.v.c("#008 Must be called on the main UI thread.");
        F7.a(activity);
        if (((Boolean) AbstractC0968f8.i.s()).booleanValue()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                U2.c.f5860b.execute(new K2.e(activity, obj, bVar, dVar, 0));
                return;
            }
        }
        new C0844ca(activity, obj).c(bVar.f2711a, dVar);
    }
}
