package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0644u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f8746b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0644u f8747c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0 f8748a;

    public static synchronized C0644u a() {
        try {
            if (f8747c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8747c;
    }

    public static synchronized void c() {
        if (f8747c == null) {
            C0644u c0644u = new C0644u();
            f8747c = c0644u;
            c0644u.f8748a = C0.b();
            C0 c0 = f8747c.f8748a;
            Q3.o oVar = new Q3.o();
            synchronized (c0) {
                c0.f8326e = oVar;
            }
        }
    }

    public static void d(Drawable drawable, G4.A a2, int[] iArr) {
        PorterDuff.Mode mode = C0.f8319f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC0616f0.f8620a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = a2.f2872b;
        if (!z4 && !a2.f2871a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z4 ? (ColorStateList) a2.f2873c : null;
        PorterDuff.Mode mode2 = a2.f2871a ? (PorterDuff.Mode) a2.f2874d : C0.f8319f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = C0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i7) {
        return this.f8748a.c(context, i7);
    }
}
