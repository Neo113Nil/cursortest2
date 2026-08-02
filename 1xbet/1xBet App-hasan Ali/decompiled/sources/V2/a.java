package V2;

import J2.h;
import K2.e;
import Q2.r;
import U2.c;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.C0844ca;
import com.google.android.gms.internal.ads.F7;
import m3.v;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(Context context, String str, h hVar, L2.a aVar) {
        v.f("Context cannot be null.", context);
        v.f("AdUnitId cannot be null.", str);
        v.f("AdRequest cannot be null.", hVar);
        v.c("#008 Must be called on the main UI thread.");
        F7.a(context);
        if (((Boolean) AbstractC0968f8.i.s()).booleanValue()) {
            if (((Boolean) r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                c.f5860b.execute(new e(context, str, hVar, aVar, 3));
                return;
            }
        }
        new C0844ca(context, str).c(hVar.f2711a, aVar);
    }

    public abstract void b(Activity activity);
}
