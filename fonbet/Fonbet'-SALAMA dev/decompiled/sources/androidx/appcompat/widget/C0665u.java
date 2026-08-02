package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f8746b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0665u f8747c;

    /* renamed from: a, reason: collision with root package name */
    public C0 f8748a;

    public static synchronized C0665u a() {
        C0665u c0665u;
        synchronized (C0665u.class) {
            try {
                if (f8747c == null) {
                    c();
                }
                c0665u = f8747c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0665u;
    }

    public static synchronized void c() {
        synchronized (C0665u.class) {
            if (f8747c == null) {
                C0665u c0665u = new C0665u();
                f8747c = c0665u;
                c0665u.f8748a = C0.b();
                C0 c0 = f8747c.f8748a;
                Q3.o oVar = new Q3.o();
                synchronized (c0) {
                    c0.f8326e = oVar;
                }
            }
        }
    }

    public static void d(Drawable drawable, G4.A a2, int[] iArr) {
        PorterDuff.Mode mode = C0.f8319f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC0637f0.f8620a;
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
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z4 ? (ColorStateList) a2.f2873c : null;
        PorterDuff.Mode mode2 = a2.f2871a ? (PorterDuff.Mode) a2.f2874d : C0.f8319f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = C0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i7) {
        return this.f8748a.c(context, i7);
    }
}
