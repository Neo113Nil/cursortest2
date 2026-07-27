package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f9842b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1096o f9843c;

    /* renamed from: a, reason: collision with root package name */
    public P f9844a;

    public static synchronized void b() {
        synchronized (C1096o.class) {
            if (f9843c == null) {
                C1096o c1096o = new C1096o();
                f9843c = c1096o;
                c1096o.f9844a = P.b();
                P p3 = f9843c.f9844a;
                A0.h hVar = new A0.h(3);
                synchronized (p3) {
                    p3.f9744e = hVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, V.e eVar, int[] iArr) {
        PorterDuff.Mode mode = P.f;
        if (AbstractC1105y.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z3 = eVar.f1603b;
        if (!z3 && !eVar.f1602a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z3 ? (ColorStateList) eVar.f1604c : null;
        PorterDuff.Mode mode2 = eVar.f1602a ? (PorterDuff.Mode) eVar.f1605d : P.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = P.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i3) {
        return this.f9844a.c(context, i3);
    }
}
