package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.chicken.jump.road.pump.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p.AbstractC1154d;
import p.C1155e;
import p.C1162l;
import t.AbstractC1206a;
import x.AbstractC1247a;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: g, reason: collision with root package name */
    public static P f9738g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f9740a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f9741b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f9742c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9743d;

    /* renamed from: e, reason: collision with root package name */
    public A0.h f9744e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final O f9739h = new O(6);

    public static synchronized P b() {
        P p3;
        synchronized (P.class) {
            try {
                if (f9738g == null) {
                    f9738g = new P();
                }
                p3 = f9738g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p3;
    }

    public static synchronized PorterDuffColorFilter e(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (P.class) {
            O o3 = f9739h;
            o3.getClass();
            int i4 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) o3.a(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i3) {
        Drawable drawable;
        Object obj;
        if (this.f9742c == null) {
            this.f9742c = new TypedValue();
        }
        TypedValue typedValue = this.f9742c;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C1155e c1155e = (C1155e) this.f9741b.get(context);
            drawable = null;
            if (c1155e != null) {
                int b3 = AbstractC1154d.b(c1155e.f10199b, c1155e.f10201d, j3);
                if (b3 < 0 || (obj = c1155e.f10200c[b3]) == C1155e.f10197e) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b4 = AbstractC1154d.b(c1155e.f10199b, c1155e.f10201d, j3);
                        if (b4 >= 0) {
                            Object[] objArr = c1155e.f10200c;
                            Object obj2 = objArr[b4];
                            Object obj3 = C1155e.f10197e;
                            if (obj2 != obj3) {
                                objArr[b4] = obj3;
                                c1155e.f10198a = true;
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
        if (this.f9744e != null && i3 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    C1155e c1155e2 = (C1155e) this.f9741b.get(context);
                    if (c1155e2 == null) {
                        c1155e2 = new C1155e();
                        this.f9741b.put(context, c1155e2);
                    }
                    c1155e2.b(j3, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i3) {
        return d(context, i3);
    }

    public final synchronized Drawable d(Context context, int i3) {
        Drawable a3;
        try {
            if (!this.f9743d) {
                this.f9743d = true;
                Drawable c3 = c(context, R.drawable.abc_vector_test);
                if (c3 == null || (!(c3 instanceof Y.a) && !"android.graphics.drawable.VectorDrawable".equals(c3.getClass().getName()))) {
                    this.f9743d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a3 = a(context, i3);
            if (a3 == null) {
                a3 = AbstractC1206a.b(context, i3);
            }
            if (a3 != null) {
                a3 = g(context, i3, a3);
            }
            if (a3 != null) {
                Rect rect = AbstractC1105y.f9913a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a3;
    }

    public final synchronized ColorStateList f(Context context, int i3) {
        ColorStateList colorStateList;
        int i4;
        C1162l c1162l;
        Object obj;
        WeakHashMap weakHashMap = this.f9740a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (c1162l = (C1162l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a3 = AbstractC1154d.a(c1162l.f10228c, i3, c1162l.f10226a);
            if (a3 < 0 || (obj = c1162l.f10227b[a3]) == C1162l.f10225d) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            A0.h hVar = this.f9744e;
            if (hVar != null) {
                colorStateList2 = hVar.f(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.f9740a == null) {
                    this.f9740a = new WeakHashMap();
                }
                C1162l c1162l2 = (C1162l) this.f9740a.get(context);
                if (c1162l2 == null) {
                    c1162l2 = new C1162l();
                    int i5 = 4;
                    while (true) {
                        i4 = 40;
                        if (i5 >= 32) {
                            break;
                        }
                        int i6 = (1 << i5) - 12;
                        if (40 <= i6) {
                            i4 = i6;
                            break;
                        }
                        i5++;
                    }
                    int i7 = i4 / 4;
                    c1162l2.f10226a = new int[i7];
                    c1162l2.f10227b = new Object[i7];
                    this.f9740a.put(context, c1162l2);
                }
                c1162l2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i3, Drawable drawable) {
        int i4;
        int round;
        int i5;
        PorterDuffColorFilter e3;
        ColorStateList f3 = f(context, i3);
        if (f3 != null) {
            if (AbstractC1105y.a(drawable)) {
                drawable = drawable.mutate();
            }
            AbstractC1247a.h(drawable, f3);
            PorterDuff.Mode mode = null;
            if (this.f9744e != null && i3 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC1247a.i(drawable, mode);
            }
            return drawable;
        }
        if (this.f9744e != null) {
            if (i3 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int b3 = h0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1096o.f9842b;
                A0.h.k(findDrawableByLayerId, b3, mode2);
                A0.h.k(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlNormal), mode2);
                A0.h.k(layerDrawable.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int a3 = h0.a(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1096o.f9842b;
                A0.h.k(findDrawableByLayerId2, a3, mode3);
                A0.h.k(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlActivated), mode3);
                A0.h.k(layerDrawable2.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        A0.h hVar = this.f9744e;
        boolean z3 = false;
        if (hVar != null) {
            PorterDuff.Mode mode4 = C1096o.f9842b;
            if (A0.h.b((int[]) hVar.f54b, i3)) {
                i5 = R.attr.colorControlNormal;
            } else if (A0.h.b((int[]) hVar.f56d, i3)) {
                i5 = R.attr.colorControlActivated;
            } else {
                boolean b4 = A0.h.b((int[]) hVar.f57e, i3);
                i4 = android.R.attr.colorBackground;
                if (b4) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i3 == 2131165227) {
                    round = Math.round(40.8f);
                    i4 = 16842800;
                    z3 = true;
                    if (z3) {
                        Drawable mutate = AbstractC1105y.a(drawable) ? drawable.mutate() : drawable;
                        int b5 = h0.b(context, i4);
                        synchronized (C1096o.class) {
                            e3 = e(b5, mode4);
                        }
                        mutate.setColorFilter(e3);
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                    }
                } else if (i3 != R.drawable.abc_dialog_material_background) {
                    i4 = 0;
                    round = -1;
                    if (z3) {
                    }
                }
                z3 = true;
                round = -1;
                if (z3) {
                }
            }
            i4 = i5;
            z3 = true;
            round = -1;
            if (z3) {
            }
        }
        return drawable;
    }
}
