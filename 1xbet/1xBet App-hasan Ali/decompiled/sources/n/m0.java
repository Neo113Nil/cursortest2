package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import game.betting133.sports1xbet.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import r.AbstractC2339q;
import r.C2338p;
import s.AbstractC2351a;

/* loaded from: classes.dex */
public final class m0 {
    public static m0 i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f18284a;

    /* renamed from: b, reason: collision with root package name */
    public r.Q f18285b;

    /* renamed from: c, reason: collision with root package name */
    public r.S f18286c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f18287d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f18288e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public C0.c f18289g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f18282h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f18283j = new k0(6);

    public static synchronized m0 d() {
        m0 m0Var;
        synchronized (m0.class) {
            try {
                if (i == null) {
                    m0 m0Var2 = new m0();
                    i = m0Var2;
                    j(m0Var2);
                }
                m0Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (m0.class) {
            k0 k0Var = f18283j;
            k0Var.getClass();
            int i6 = (31 + i5) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) k0Var.b(Integer.valueOf(mode.hashCode() + i6));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i5, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new l0(3));
            m0Var.a("animated-vector", new l0(2));
            m0Var.a("animated-selector", new l0(1));
            m0Var.a("drawable", new l0(0));
        }
    }

    public final void a(String str, l0 l0Var) {
        if (this.f18285b == null) {
            this.f18285b = new r.Q(0);
        }
        this.f18285b.put(str, l0Var);
    }

    public final synchronized void b(Context context, long j5, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C2338p c2338p = (C2338p) this.f18287d.get(context);
                if (c2338p == null) {
                    c2338p = new C2338p((Object) null);
                    this.f18287d.put(context, c2338p);
                }
                c2338p.g(j5, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i5) {
        if (this.f18288e == null) {
            this.f18288e = new TypedValue();
        }
        TypedValue typedValue = this.f18288e;
        context.getResources().getValue(i5, typedValue, true);
        long j5 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e3 = e(context, j5);
        if (e3 != null) {
            return e3;
        }
        LayerDrawable layerDrawable = null;
        if (this.f18289g != null) {
            if (i5 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131165202)});
            } else if (i5 == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0.c.f(this, context, R.dimen.abc_star_big);
            } else if (i5 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0.c.f(this, context, R.dimen.abc_star_medium);
            } else if (i5 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0.c.f(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j5, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j5) {
        Object obj;
        C2338p c2338p = (C2338p) this.f18287d.get(context);
        if (c2338p == null) {
            return null;
        }
        int b3 = AbstractC2351a.b(c2338p.f19030l, c2338p.f19032n, j5);
        if (b3 < 0 || (obj = c2338p.f19031m[b3]) == AbstractC2339q.f19033a) {
            obj = null;
        }
        WeakReference weakReference = (WeakReference) obj;
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c2338p.i(j5);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i5) {
        return g(context, i5);
    }

    public final synchronized Drawable g(Context context, int i5) {
        Drawable k5;
        try {
            if (!this.f) {
                this.f = true;
                Drawable f = f(context, R.drawable.abc_vector_test);
                if (f == null || (!(f instanceof b2.p) && !"android.graphics.drawable.VectorDrawable".equals(f.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k5 = k(context, i5);
            if (k5 == null) {
                k5 = c(context, i5);
            }
            if (k5 == null) {
                k5 = context.getDrawable(i5);
            }
            if (k5 != null) {
                k5 = m(context, i5, k5);
            }
            if (k5 != null) {
                AbstractC2119M.a(k5);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k5;
    }

    public final synchronized ColorStateList i(Context context, int i5) {
        ColorStateList colorStateList;
        r.S s2;
        WeakHashMap weakHashMap = this.f18284a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (s2 = (r.S) weakHashMap.get(context)) == null) ? null : (ColorStateList) s2.e(i5);
        if (colorStateList == null) {
            C0.c cVar = this.f18289g;
            if (cVar != null) {
                colorStateList2 = cVar.g(context, i5);
            }
            if (colorStateList2 != null) {
                if (this.f18284a == null) {
                    this.f18284a = new WeakHashMap();
                }
                r.S s5 = (r.S) this.f18284a.get(context);
                if (s5 == null) {
                    s5 = new r.S(0);
                    this.f18284a.put(context, s5);
                }
                s5.a(i5, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i5) {
        int next;
        r.Q q5 = this.f18285b;
        if (q5 == null || q5.isEmpty()) {
            return null;
        }
        r.S s2 = this.f18286c;
        if (s2 != null) {
            String str = (String) s2.e(i5);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f18285b.get(str) == null) {
                return null;
            }
        } else {
            this.f18286c = new r.S(0);
        }
        if (this.f18288e == null) {
            this.f18288e = new TypedValue();
        }
        TypedValue typedValue = this.f18288e;
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        long j5 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e3 = e(context, j5);
        if (e3 != null) {
            return e3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i5);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f18286c.a(i5, name);
                l0 l0Var = (l0) this.f18285b.get(name);
                if (l0Var != null) {
                    e3 = l0Var.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e3 != null) {
                    e3.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j5, e3);
                }
            } catch (Exception e5) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e5);
            }
        }
        if (e3 == null) {
            this.f18286c.a(i5, "appcompat_skip_skip");
        }
        return e3;
    }

    public final synchronized void l(C0.c cVar) {
        this.f18289g = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m(Context context, int i5, Drawable drawable) {
        int i6;
        int round;
        int i7;
        PorterDuffColorFilter h3;
        ColorStateList i8 = i(context, i5);
        if (i8 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(i8);
            PorterDuff.Mode mode = null;
            if (this.f18289g != null && i5 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.f18289g != null) {
            if (i5 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c5 = r0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C2146p.f18306b;
                C0.c.i(findDrawableByLayerId, c5, mode2);
                C0.c.i(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), r0.c(context, R.attr.colorControlNormal), mode2);
                C0.c.i(layerDrawable.findDrawableByLayerId(android.R.id.progress), r0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i5 == R.drawable.abc_ratingbar_material || i5 == R.drawable.abc_ratingbar_indicator_material || i5 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b3 = r0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C2146p.f18306b;
                C0.c.i(findDrawableByLayerId2, b3, mode3);
                C0.c.i(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), r0.c(context, R.attr.colorControlActivated), mode3);
                C0.c.i(layerDrawable2.findDrawableByLayerId(android.R.id.progress), r0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0.c cVar = this.f18289g;
        boolean z3 = false;
        if (cVar != null) {
            PorterDuff.Mode mode4 = C2146p.f18306b;
            if (C0.c.c((int[]) cVar.f811b, i5)) {
                i7 = R.attr.colorControlNormal;
            } else if (C0.c.c((int[]) cVar.f813d, i5)) {
                i7 = R.attr.colorControlActivated;
            } else {
                boolean c6 = C0.c.c((int[]) cVar.f814e, i5);
                i6 = android.R.attr.colorBackground;
                if (c6) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i5 == 2131165222) {
                    round = Math.round(40.8f);
                    i6 = 16842800;
                    z3 = true;
                    if (z3) {
                        Drawable mutate2 = drawable.mutate();
                        int c7 = r0.c(context, i6);
                        synchronized (C2146p.class) {
                            h3 = h(c7, mode4);
                        }
                        mutate2.setColorFilter(h3);
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                    }
                } else if (i5 != R.drawable.abc_dialog_material_background) {
                    i6 = 0;
                    round = -1;
                    if (z3) {
                    }
                }
                z3 = true;
                round = -1;
                if (z3) {
                }
            }
            i6 = i7;
            z3 = true;
            round = -1;
            if (z3) {
            }
        }
        return drawable;
    }
}
