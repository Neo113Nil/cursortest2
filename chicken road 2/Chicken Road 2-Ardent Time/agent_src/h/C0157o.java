package h;

/* renamed from: h.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157o {

    /* renamed from: b, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f3219b = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static h.C0157o f3220c;

    /* renamed from: a, reason: collision with root package name */
    public h.N f3221a;

    public static synchronized void b() {
        synchronized (h.C0157o.class) {
            if (f3220c == null) {
                h.C0157o c0157o = new h.C0157o();
                f3220c = c0157o;
                c0157o.f3221a = h.N.b();
                h.N n2 = f3220c.f3221a;
                P1.h hVar = new P1.h();
                synchronized (n2) {
                    n2.f3101e = hVar;
                }
            }
        }
    }

    public static void c(android.graphics.drawable.Drawable drawable, I1.h hVar, int[] iArr) {
        android.graphics.PorterDuff.Mode mode = h.N.f3094f;
        if (h.AbstractC0165x.a(drawable) && drawable.mutate() != drawable) {
            android.util.Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = hVar.f724b;
        if (!z2 && !hVar.f723a) {
            drawable.clearColorFilter();
            return;
        }
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = null;
        android.content.res.ColorStateList colorStateList = z2 ? (android.content.res.ColorStateList) hVar.f725c : null;
        android.graphics.PorterDuff.Mode mode2 = hVar.f723a ? (android.graphics.PorterDuff.Mode) hVar.f726d : h.N.f3094f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = h.N.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized android.graphics.drawable.Drawable a(android.content.Context context, int i2) {
        return this.f3221a.c(context, i2);
    }
}
