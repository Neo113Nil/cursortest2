package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.chickyneer.roadway.R;
import g0.AbstractC0445a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import r.AbstractC1394d;
import r.C1395e;
import r.C1402l;
import v.AbstractC1485a;
import y.AbstractC1550a;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: g, reason: collision with root package name */
    public static M f10798g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f10800a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f10801b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f10802c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10803d;

    /* renamed from: e, reason: collision with root package name */
    public M0.e f10804e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f10797f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final L f10799h = new L(6);

    public static synchronized M b() {
        M m6;
        synchronized (M.class) {
            try {
                if (f10798g == null) {
                    f10798g = new M();
                }
                m6 = f10798g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m6;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (M.class) {
            L l2 = f10799h;
            l2.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) l2.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i2) {
        Drawable drawable;
        Object obj;
        if (this.f10802c == null) {
            this.f10802c = new TypedValue();
        }
        TypedValue typedValue = this.f10802c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C1395e c1395e = (C1395e) this.f10801b.get(context);
            drawable = null;
            if (c1395e != null) {
                int b6 = AbstractC1394d.b(c1395e.f11687b, c1395e.f11689d, j2);
                if (b6 < 0 || (obj = c1395e.f11688c[b6]) == C1395e.f11685e) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b7 = AbstractC1394d.b(c1395e.f11687b, c1395e.f11689d, j2);
                        if (b7 >= 0) {
                            Object[] objArr = c1395e.f11688c;
                            Object obj2 = objArr[b7];
                            Object obj3 = C1395e.f11685e;
                            if (obj2 != obj3) {
                                objArr[b7] = obj3;
                                c1395e.f11686a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f10804e != null && i2 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        C1395e c1395e2 = (C1395e) this.f10801b.get(context);
                        if (c1395e2 == null) {
                            c1395e2 = new C1395e();
                            this.f10801b.put(context, c1395e2);
                        }
                        c1395e2.b(j2, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2);
    }

    public final synchronized Drawable d(Context context, int i2) {
        Drawable a6;
        try {
            if (!this.f10803d) {
                this.f10803d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof AbstractC0445a) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.f10803d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a6 = a(context, i2);
            if (a6 == null) {
                a6 = AbstractC1485a.b(context, i2);
            }
            if (a6 != null) {
                a6 = g(context, i2, a6);
            }
            if (a6 != null) {
                Rect rect = AbstractC1250w.f10979a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a6;
    }

    public final synchronized ColorStateList f(Context context, int i2) {
        ColorStateList colorStateList;
        int i3;
        C1402l c1402l;
        Object obj;
        WeakHashMap weakHashMap = this.f10800a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (c1402l = (C1402l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a6 = AbstractC1394d.a(c1402l.f11717c, i2, c1402l.f11715a);
            if (a6 < 0 || (obj = c1402l.f11716b[a6]) == C1402l.f11714d) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            M0.e eVar = this.f10804e;
            if (eVar != null) {
                colorStateList2 = eVar.g(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f10800a == null) {
                    this.f10800a = new WeakHashMap();
                }
                C1402l c1402l2 = (C1402l) this.f10800a.get(context);
                if (c1402l2 == null) {
                    c1402l2 = new C1402l();
                    int i6 = 4;
                    while (true) {
                        i3 = 40;
                        if (i6 >= 32) {
                            break;
                        }
                        int i7 = (1 << i6) - 12;
                        if (40 <= i7) {
                            i3 = i7;
                            break;
                        }
                        i6++;
                    }
                    int i8 = i3 / 4;
                    c1402l2.f11715a = new int[i8];
                    c1402l2.f11716b = new Object[i8];
                    this.f10800a.put(context, c1402l2);
                }
                c1402l2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i2, Drawable drawable) {
        int round;
        PorterDuffColorFilter e3;
        int i3 = R.attr.colorControlNormal;
        int i6 = R.attr.colorControlActivated;
        ColorStateList f3 = f(context, i2);
        if (f3 != null) {
            if (AbstractC1250w.a(drawable)) {
                drawable = drawable.mutate();
            }
            AbstractC1550a.h(drawable, f3);
            PorterDuff.Mode mode = null;
            if (this.f10804e != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC1550a.i(drawable, mode);
            }
        } else {
            if (this.f10804e != null) {
                if (i2 == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                    int b6 = f0.b(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode2 = C1242n.f10908b;
                    M0.e.p(findDrawableByLayerId, b6);
                    M0.e.p(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), f0.b(context, R.attr.colorControlNormal));
                    M0.e.p(layerDrawable.findDrawableByLayerId(android.R.id.progress), f0.b(context, R.attr.colorControlActivated));
                } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                    int a6 = f0.a(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode3 = C1242n.f10908b;
                    M0.e.p(findDrawableByLayerId2, a6);
                    M0.e.p(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), f0.b(context, R.attr.colorControlActivated));
                    M0.e.p(layerDrawable2.findDrawableByLayerId(android.R.id.progress), f0.b(context, R.attr.colorControlActivated));
                }
            }
            M0.e eVar = this.f10804e;
            boolean z = false;
            if (eVar != null) {
                PorterDuff.Mode mode4 = C1242n.f10908b;
                if (!M0.e.b((int[]) eVar.f1783c, i2)) {
                    if (!M0.e.b((int[]) eVar.f1785e, i2)) {
                        boolean b7 = M0.e.b((int[]) eVar.f1786f, i2);
                        i6 = android.R.attr.colorBackground;
                        if (b7) {
                            mode4 = PorterDuff.Mode.MULTIPLY;
                        } else if (i2 == 2131165227) {
                            round = Math.round(40.8f);
                            i3 = android.R.attr.colorForeground;
                            z = true;
                            if (z) {
                                Drawable mutate = AbstractC1250w.a(drawable) ? drawable.mutate() : drawable;
                                int b8 = f0.b(context, i3);
                                synchronized (C1242n.class) {
                                    e3 = e(b8, mode4);
                                }
                                mutate.setColorFilter(e3);
                                if (round != -1) {
                                    mutate.setAlpha(round);
                                }
                            }
                        } else if (i2 != R.drawable.abc_dialog_material_background) {
                            i3 = 0;
                            round = -1;
                            if (z) {
                            }
                        }
                    }
                    i3 = i6;
                }
                z = true;
                round = -1;
                if (z) {
                }
            }
        }
        return drawable;
    }
}
